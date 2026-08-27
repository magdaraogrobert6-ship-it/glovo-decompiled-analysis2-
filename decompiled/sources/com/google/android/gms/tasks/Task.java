package com.google.android.gms.tasks;

import android.app.Activity;
import java.util.concurrent.Executor;
import o.OuterPlacementScope;
import o.PausedPrecompositionImpl;
import o.PinnableContainer;
import o.PinnableContainerPinnedHandle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Task {
    public abstract Task addOnFailureListener(OnFailureListener onFailureListener);

    public abstract Task addOnFailureListener(Executor executor, OnFailureListener onFailureListener);

    public abstract Task addOnSuccessListener(OnSuccessListener onSuccessListener);

    public abstract Task addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener);

    public abstract Exception getException();

    public abstract Object getResult();

    public abstract Object getResult(Class cls);

    public abstract boolean isCanceled();

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();

    public Task addOnCanceledListener(Activity activity, PinnableContainerPinnedHandle pinnableContainerPinnedHandle) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public Task addOnCompleteListener(Activity activity, PinnableContainer pinnableContainer) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public <TContinuationResult> Task continueWith(OuterPlacementScope outerPlacementScope) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> Task continueWithTask(OuterPlacementScope outerPlacementScope) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> Task onSuccessTask(PausedPrecompositionImpl pausedPrecompositionImpl) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public Task addOnCanceledListener(PinnableContainerPinnedHandle pinnableContainerPinnedHandle) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public Task addOnCompleteListener(PinnableContainer pinnableContainer) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public <TContinuationResult> Task continueWith(Executor executor, OuterPlacementScope outerPlacementScope) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> Task continueWithTask(Executor executor, OuterPlacementScope outerPlacementScope) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> Task onSuccessTask(Executor executor, PausedPrecompositionImpl pausedPrecompositionImpl) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public Task addOnCanceledListener(Executor executor, PinnableContainerPinnedHandle pinnableContainerPinnedHandle) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public Task addOnCompleteListener(Executor executor, PinnableContainer pinnableContainer) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }
}
