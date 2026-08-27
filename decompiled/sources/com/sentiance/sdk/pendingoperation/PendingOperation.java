package com.sentiance.sdk.pendingoperation;

import android.annotation.SuppressLint;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.sdk.DontObfuscate;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import o.readBoolean;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class PendingOperation<Result, Error> {
    private static final int STATE_FAILURE = 2;
    private static final int STATE_RUNNING = 0;
    private static final int STATE_SUCCESS = 1;
    private Error error;
    private Result result;
    public boolean mInvokeListenersOnlyIfSdkIsInitialized = true;
    private int mState = 0;
    private final List<OnCompleteListener<Result, Error>> mOnCompleteListeners = new ArrayList();
    private final List<OnSuccessListener<Result>> mOnSuccessListeners = new ArrayList();
    private final List<OnFailureListener<Error>> mOnFailureListeners = new ArrayList();
    private final CountDownLatch mOperationCompletionLatch = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callOnCompleteListeners$0(OnCompleteListener onCompleteListener) {
        onCompleteListener.onComplete(this);
    }

    public Result getResultOrNull() {
        return this.result;
    }

    public boolean isComplete() {
        return this.mState != 0;
    }

    public boolean isSuccessful() {
        return this.mState == 1;
    }

    private void callOnCompleteListeners() {
        Iterator<OnCompleteListener<Result, Error>> it = this.mOnCompleteListeners.iterator();
        while (it.hasNext()) {
            execute(new Scopes$$ExternalSyntheticLambda0(this, 14, it.next()));
        }
        this.mOnCompleteListeners.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callOnFailureListeners$2(OnFailureListener onFailureListener) {
        onFailureListener.onFailure(this.error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callOnSuccessListeners$1(OnSuccessListener onSuccessListener) {
        onSuccessListener.onSuccess(this.result);
    }

    public void completeOperationWithError(Error error) {
        synchronized (this) {
            this.mState = 2;
            this.error = error;
            this.mOperationCompletionLatch.countDown();
            callOnCompleteListeners();
            callOnFailureListeners();
        }
    }

    public void completeOperationWithResult(Result result) {
        synchronized (this) {
            this.mState = 1;
            this.result = result;
            this.mOperationCompletionLatch.countDown();
            callOnCompleteListeners();
            callOnSuccessListeners();
        }
    }

    public PendingOperation<Result, Error> waitTillCompletion() throws InterruptedException {
        this.mOperationCompletionLatch.await();
        return this;
    }

    public PendingOperation<Result, Error> addOnCompleteListener(OnCompleteListener<Result, Error> onCompleteListener) {
        synchronized (this) {
            if (onCompleteListener != null) {
                this.mOnCompleteListeners.add(onCompleteListener);
                if (this.mState != 0) {
                    callOnCompleteListeners();
                }
            }
        }
        return this;
    }

    public PendingOperation<Result, Error> addOnFailureListener(OnFailureListener<Error> onFailureListener) {
        synchronized (this) {
            if (onFailureListener != null) {
                if (this.mState != 1) {
                    this.mOnFailureListeners.add(onFailureListener);
                }
                if (this.mState == 2) {
                    callOnFailureListeners();
                }
            }
        }
        return this;
    }

    public PendingOperation<Result, Error> addOnSuccessListener(OnSuccessListener<Result> onSuccessListener) {
        synchronized (this) {
            if (onSuccessListener != null) {
                if (this.mState != 2) {
                    this.mOnSuccessListeners.add(onSuccessListener);
                }
                if (this.mState == 1) {
                    callOnSuccessListeners();
                }
            }
        }
        return this;
    }

    public PendingOperation<Result, Error> waitFor(int i, TimeUnit timeUnit) throws InterruptedException {
        this.mOperationCompletionLatch.await(i, timeUnit);
        return this;
    }

    private void execute(Runnable runnable) {
        if (this.mInvokeListenersOnlyIfSdkIsInitialized) {
            readBoolean.read(runnable);
        } else {
            readBoolean.write(runnable);
        }
    }

    @SuppressLint
    public Error getError() {
        if (this.error == null) {
            if (!isComplete()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("The operation is not complete yet");
                return null;
            }
            if (isSuccessful()) {
                MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Cannot obtain the error from a successful operation");
                return null;
            }
        }
        return this.error;
    }

    @SuppressLint
    public Result getResult() {
        if (this.result == null) {
            if (!isComplete()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("The operation is not complete yet");
                return null;
            }
            if (!isSuccessful()) {
                MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Cannot obtain the result from a failed operation");
                return null;
            }
        }
        return this.result;
    }

    private void callOnFailureListeners() {
        if (this.error == null) {
            return;
        }
        Iterator<OnFailureListener<Error>> it = this.mOnFailureListeners.iterator();
        while (it.hasNext()) {
            execute(new Scopes$$ExternalSyntheticLambda0(this, 13, it.next()));
        }
        this.mOnFailureListeners.clear();
    }

    private void callOnSuccessListeners() {
        if (this.result == null) {
            return;
        }
        Iterator<OnSuccessListener<Result>> it = this.mOnSuccessListeners.iterator();
        while (it.hasNext()) {
            execute(new Scopes$$ExternalSyntheticLambda0(this, 15, it.next()));
        }
        this.mOnSuccessListeners.clear();
    }
}
