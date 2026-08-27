package com.mapbox.common.location;

import android.app.Activity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import o.PinnableContainerPinnedHandle;
import o.getCardAtIndex;

/* JADX INFO: loaded from: classes2.dex */
public final class FailedTask<T> extends Task {
    private final Exception exception;

    @Override // com.google.android.gms.tasks.Task
    public Task addOnCanceledListener(PinnableContainerPinnedHandle pinnableContainerPinnedHandle) {
        pinnableContainerPinnedHandle.getClass();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public Exception getException() {
        return this.exception;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isCanceled() {
        return false;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isComplete() {
        return true;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isSuccessful() {
        return false;
    }

    public FailedTask(Exception exc) {
        exc.getClass();
        this.exception = exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        executor.getClass();
        onFailureListener.getClass();
        throw new getCardAtIndex("Please use addOnFailureListener(listener: OnFailureListener)");
    }

    public Task addOnSuccessListener(Activity activity, OnSuccessListener<? super T> onSuccessListener) {
        activity.getClass();
        onSuccessListener.getClass();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public <X extends Throwable> T getResult(Class<X> cls) throws Exception {
        cls.getClass();
        boolean zIsInstance = cls.isInstance(this.exception);
        Exception exc = this.exception;
        if (zIsInstance) {
            throw exc;
        }
        throw new RuntimeExecutionException(exc);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnSuccessListener(OnSuccessListener<? super T> onSuccessListener) {
        onSuccessListener.getClass();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnSuccessListener(Executor executor, OnSuccessListener<? super T> onSuccessListener) {
        executor.getClass();
        onSuccessListener.getClass();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public Task addOnFailureListener(OnFailureListener onFailureListener) {
        onFailureListener.getClass();
        onFailureListener.onFailure(this.exception);
        return this;
    }

    public Task addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        activity.getClass();
        onFailureListener.getClass();
        throw new getCardAtIndex("Please use addOnFailureListener(listener: OnFailureListener)");
    }

    @Override // com.google.android.gms.tasks.Task
    public T getResult() {
        throw new RuntimeExecutionException(this.exception);
    }
}
