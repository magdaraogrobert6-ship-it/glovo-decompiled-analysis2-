package com.mapbox.search.base.task;

import com.incognia.internal.ZM$$ExternalSyntheticLambda0;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import com.mapbox.search.adapter.BaseSearchCallbackAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class AsyncOperationTaskImpl {
    public static final AsyncOperationTaskImpl COMPLETED;
    public boolean callbackActionExecuted;
    public Object callbackDelegate;
    public boolean isCancelled;
    public boolean isDone;
    public final ArrayList cancelableList = new ArrayList();
    public final ArrayList onCancelledCallbacks = new ArrayList();

    public interface OnCancelledCallback {
        void onCancelled();
    }

    public final void addInnerTask(CancelableWrapperImpl cancelableWrapperImpl) {
        boolean z;
        synchronized (this) {
            synchronized (this) {
                z = this.isDone;
            }
        }
        if (z) {
            return;
        }
        synchronized (this) {
            boolean z2 = this.isCancelled;
            if (z2) {
                cancelableWrapperImpl.cancellation.invoke();
            } else {
                this.cancelableList.add(cancelableWrapperImpl);
            }
        }
    }

    public final void addOnCancelledCallback(OnCancelledCallback onCancelledCallback) {
        synchronized (this) {
            if (isCompleted()) {
                return;
            }
            this.onCancelledCallbacks.add(onCancelledCallback);
        }
    }

    public final void cancel() {
        synchronized (this) {
            if (isCompleted()) {
                return;
            }
            Iterator it = this.cancelableList.iterator();
            while (it.hasNext()) {
                ((CancelableWrapperImpl) it.next()).cancellation.invoke();
            }
            this.cancelableList.clear();
            Iterator it2 = this.onCancelledCallbacks.iterator();
            while (it2.hasNext()) {
                ((OnCancelledCallback) it2.next()).onCancelled();
            }
            this.onCancelledCallbacks.clear();
            this.isCancelled = true;
            setCallbackDelegate(null);
        }
    }

    public final boolean isCompleted() {
        boolean z;
        boolean z2;
        synchronized (this) {
            z = this.isCancelled;
        }
        if (z) {
            return true;
        }
        synchronized (this) {
            z2 = this.isDone;
        }
        return z2;
    }

    public final void onComplete() {
        synchronized (this) {
            if (isCompleted()) {
                return;
            }
            this.cancelableList.clear();
            this.isDone = true;
            this.onCancelledCallbacks.clear();
            setCallbackDelegate(null);
        }
    }

    public final void runIfNotCancelled(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        boolean z;
        synchronized (this) {
            z = this.isCancelled;
        }
        if (z) {
            return;
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this);
    }

    public final void setCallbackDelegate(BaseSearchCallbackAdapter baseSearchCallbackAdapter) {
        synchronized (this) {
            if (isCompleted()) {
                baseSearchCallbackAdapter = null;
            }
            this.callbackDelegate = baseSearchCallbackAdapter;
        }
    }

    static {
        AsyncOperationTaskImpl asyncOperationTaskImpl = new AsyncOperationTaskImpl();
        asyncOperationTaskImpl.onComplete();
        COMPLETED = asyncOperationTaskImpl;
    }

    public AsyncOperationTaskImpl() {
        setCallbackDelegate(null);
    }

    public final void markExecutedAndRunOnCallback(Executor executor, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        executor.getClass();
        executor.execute(new ZM$$ExternalSyntheticLambda0(this, 14, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }

    public final void plusAssign(AsyncOperationTaskImpl asyncOperationTaskImpl) {
        asyncOperationTaskImpl.getClass();
        addInnerTask(new CancelableWrapperImpl(new SearchOptionsKt$validateLimit$1(19, asyncOperationTaskImpl)));
    }
}
