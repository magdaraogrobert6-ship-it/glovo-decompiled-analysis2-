package com.google.android.gms.tasks;

import android.app.Activity;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import o.OuterPlacementScope;
import o.PausedPrecompositionImpl;
import o.PinnableContainer;
import o.PinnableContainerPinnedHandle;
import o.Placeable;
import o.PlaceablePlacementScope;
import o.accessgetApparentToRealOffsetnOccac;
import o.accessgetParentLayoutDirection;
import o.accessgetSystemNavigationDowncp;
import o.accessplaceAtf8xVGno;
import o.onMeasuredSizeChanged;

/* JADX INFO: loaded from: classes2.dex */
public final class zzw extends Task {
    public Exception MediaDescriptionCompat;
    public Object read;
    public boolean serializer;
    public volatile boolean write;
    public final Object IconCompatParcelizer = new Object();
    public final accessgetApparentToRealOffsetnOccac RemoteActionCompatParcelizer = new accessgetApparentToRealOffsetnOccac(0);

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return this.write;
    }

    public final void RemoteActionCompatParcelizer(Exception exc) {
        accessgetSystemNavigationDowncp.serializer(exc, "Exception must not be null");
        synchronized (this.IconCompatParcelizer) {
            if (this.serializer) {
                throw DuplicateTaskCompletionException.serializer(this);
            }
            this.serializer = true;
            this.MediaDescriptionCompat = exc;
        }
        this.RemoteActionCompatParcelizer.write(this);
    }

    public final boolean RemoteActionCompatParcelizer(Object obj) {
        synchronized (this.IconCompatParcelizer) {
            if (this.serializer) {
                return false;
            }
            this.serializer = true;
            this.read = obj;
            this.RemoteActionCompatParcelizer.write(this);
            return true;
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(Activity activity, PinnableContainerPinnedHandle pinnableContainerPinnedHandle) {
        onMeasuredSizeChanged onmeasuredsizechanged = new onMeasuredSizeChanged(Placeable.RemoteActionCompatParcelizer, pinnableContainerPinnedHandle);
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(onmeasuredsizechanged);
        PlaceablePlacementScope.RemoteActionCompatParcelizer(activity).IconCompatParcelizer(onmeasuredsizechanged);
        serializer();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(Activity activity, PinnableContainer pinnableContainer) {
        onMeasuredSizeChanged onmeasuredsizechanged = new onMeasuredSizeChanged(Placeable.RemoteActionCompatParcelizer, pinnableContainer);
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(onmeasuredsizechanged);
        PlaceablePlacementScope.RemoteActionCompatParcelizer(activity).IconCompatParcelizer(onmeasuredsizechanged);
        serializer();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new onMeasuredSizeChanged(executor, onFailureListener));
        serializer();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new onMeasuredSizeChanged(executor, onSuccessListener));
        serializer();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWith(Executor executor, OuterPlacementScope outerPlacementScope) {
        zzw zzwVar = new zzw();
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new accessplaceAtf8xVGno(executor, outerPlacementScope, zzwVar, 0));
        serializer();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWithTask(Executor executor, OuterPlacementScope outerPlacementScope) {
        zzw zzwVar = new zzw();
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new accessplaceAtf8xVGno(executor, outerPlacementScope, zzwVar, 1));
        serializer();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        Exception exc;
        synchronized (this.IconCompatParcelizer) {
            exc = this.MediaDescriptionCompat;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult(Class cls) {
        Object obj;
        synchronized (this.IconCompatParcelizer) {
            accessgetSystemNavigationDowncp.serializer("Task is not yet complete", this.serializer);
            if (this.write) {
                throw new CancellationException("Task is already canceled.");
            }
            boolean zIsInstance = IOException.class.isInstance(this.MediaDescriptionCompat);
            Exception exc = this.MediaDescriptionCompat;
            if (zIsInstance) {
                throw ((Throwable) IOException.class.cast(exc));
            }
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            obj = this.read;
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        boolean z;
        synchronized (this.IconCompatParcelizer) {
            z = this.serializer;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z;
        synchronized (this.IconCompatParcelizer) {
            z = this.serializer && !this.write && this.MediaDescriptionCompat == null;
        }
        return z;
    }

    public final void read() {
        synchronized (this.IconCompatParcelizer) {
            if (this.serializer) {
                return;
            }
            this.serializer = true;
            this.write = true;
            this.RemoteActionCompatParcelizer.write(this);
        }
    }

    public final void read(Object obj) {
        synchronized (this.IconCompatParcelizer) {
            if (this.serializer) {
                throw DuplicateTaskCompletionException.serializer(this);
            }
            this.serializer = true;
            this.read = obj;
        }
        this.RemoteActionCompatParcelizer.write(this);
    }

    public final void serializer() {
        synchronized (this.IconCompatParcelizer) {
            if (this.serializer) {
                this.RemoteActionCompatParcelizer.write(this);
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(PausedPrecompositionImpl pausedPrecompositionImpl) {
        accessgetParentLayoutDirection accessgetparentlayoutdirection = Placeable.RemoteActionCompatParcelizer;
        zzw zzwVar = new zzw();
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new onMeasuredSizeChanged(accessgetparentlayoutdirection, pausedPrecompositionImpl, zzwVar));
        serializer();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(OnFailureListener onFailureListener) {
        addOnFailureListener(Placeable.RemoteActionCompatParcelizer, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(OnSuccessListener onSuccessListener) {
        addOnSuccessListener(Placeable.RemoteActionCompatParcelizer, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWith(OuterPlacementScope outerPlacementScope) {
        return continueWith(Placeable.RemoteActionCompatParcelizer, outerPlacementScope);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWithTask(OuterPlacementScope outerPlacementScope) {
        return continueWithTask(Placeable.RemoteActionCompatParcelizer, outerPlacementScope);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(Executor executor, PausedPrecompositionImpl pausedPrecompositionImpl) {
        zzw zzwVar = new zzw();
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new onMeasuredSizeChanged(executor, pausedPrecompositionImpl, zzwVar));
        serializer();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(PinnableContainerPinnedHandle pinnableContainerPinnedHandle) {
        addOnCanceledListener(Placeable.RemoteActionCompatParcelizer, pinnableContainerPinnedHandle);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(PinnableContainer pinnableContainer) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new onMeasuredSizeChanged(Placeable.RemoteActionCompatParcelizer, pinnableContainer));
        serializer();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(Executor executor, PinnableContainerPinnedHandle pinnableContainerPinnedHandle) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new onMeasuredSizeChanged(executor, pinnableContainerPinnedHandle));
        serializer();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(Executor executor, PinnableContainer pinnableContainer) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new onMeasuredSizeChanged(executor, pinnableContainer));
        serializer();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult() {
        Object obj;
        synchronized (this.IconCompatParcelizer) {
            accessgetSystemNavigationDowncp.serializer("Task is not yet complete", this.serializer);
            if (!this.write) {
                Exception exc = this.MediaDescriptionCompat;
                if (exc == null) {
                    obj = this.read;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return obj;
    }
}
