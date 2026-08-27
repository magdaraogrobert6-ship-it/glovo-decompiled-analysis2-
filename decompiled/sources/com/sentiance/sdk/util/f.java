package com.sentiance.sdk.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.concurrent.Executor;
import o.PinnableContainer;
import o.migrateSealedSessionsMapToJson;

/* JADX INFO: loaded from: classes4.dex */
public final class f<T> extends Task {
    private final Exception RemoteActionCompatParcelizer;

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(OnSuccessListener<? super T> onSuccessListener) {
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(Executor executor, OnSuccessListener<? super T> onSuccessListener) {
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return false;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        return true;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        return false;
    }

    @Override // com.google.android.gms.tasks.Task
    @SuppressLint
    public final <X extends Throwable> T getResult(Class<X> cls) throws Throwable {
        Exception exc = this.RemoteActionCompatParcelizer;
        if (IOException.class.isInstance(exc)) {
            throw ((Throwable) IOException.class.cast(exc));
        }
        throw new RuntimeExecutionException(exc);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(Executor executor, PinnableContainer pinnableContainer) {
        executor.execute(new migrateSealedSessionsMapToJson(this, pinnableContainer, 0));
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        executor.execute(new migrateSealedSessionsMapToJson(this, onFailureListener, 1));
        return this;
    }

    public f(String str, Exception exc) {
        this.RemoteActionCompatParcelizer = new Exception(str, exc);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(PinnableContainer pinnableContainer) {
        pinnableContainer.onComplete(this);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(OnFailureListener onFailureListener) {
        onFailureListener.onFailure(this.RemoteActionCompatParcelizer);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(Activity activity, PinnableContainer pinnableContainer) {
        pinnableContainer.onComplete(this);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @SuppressLint
    public final T getResult() {
        throw new RuntimeExecutionException(this.RemoteActionCompatParcelizer);
    }
}
