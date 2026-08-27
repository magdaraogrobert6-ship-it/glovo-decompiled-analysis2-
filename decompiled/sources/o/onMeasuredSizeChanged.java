package o;

import com.google.android.gms.stats.zza;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzc;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class onMeasuredSizeChanged implements getApparentToRealOffsetnOccac, OnSuccessListener, OnFailureListener, PinnableContainerPinnedHandle {
    public Object IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public final Executor read;
    public final /* synthetic */ int serializer;

    public onMeasuredSizeChanged(Executor executor, PinnableContainerPinnedHandle pinnableContainerPinnedHandle) {
        this.serializer = 0;
        this.RemoteActionCompatParcelizer = new Object();
        this.read = executor;
        this.IconCompatParcelizer = pinnableContainerPinnedHandle;
    }

    @Override // o.PinnableContainerPinnedHandle
    public void onCanceled() {
        ((zzw) this.IconCompatParcelizer).read();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((zzw) this.IconCompatParcelizer).RemoteActionCompatParcelizer(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((zzw) this.IconCompatParcelizer).read(obj);
    }

    @Override // o.getApparentToRealOffsetnOccac
    public final void read(Task task) {
        int i = this.serializer;
        if (i == 0) {
            if (task.isCanceled()) {
                synchronized (this.RemoteActionCompatParcelizer) {
                    if (((PinnableContainerPinnedHandle) this.IconCompatParcelizer) != null) {
                        this.read.execute(new zza(27, this));
                    }
                }
                return;
            }
            return;
        }
        boolean z = false;
        if (i == 1) {
            synchronized (this.RemoteActionCompatParcelizer) {
                if (((PinnableContainer) this.IconCompatParcelizer) == null) {
                    return;
                }
                this.read.execute(new zzc(this, task, z, 18));
                return;
            }
        }
        if (i == 2) {
            if (task.isSuccessful() || task.isCanceled()) {
                return;
            }
            synchronized (this.RemoteActionCompatParcelizer) {
                if (((OnFailureListener) this.IconCompatParcelizer) != null) {
                    this.read.execute(new zzc(this, task, z, 19));
                }
            }
            return;
        }
        if (i != 3) {
            this.read.execute(new zzc(this, task, z, 21));
        } else if (task.isSuccessful()) {
            synchronized (this.RemoteActionCompatParcelizer) {
                if (((OnSuccessListener) this.IconCompatParcelizer) != null) {
                    this.read.execute(new zzc(this, task, z, 20));
                }
            }
        }
    }

    @Override // o.getApparentToRealOffsetnOccac
    public final void RemoteActionCompatParcelizer() {
        int i = this.serializer;
        if (i == 0) {
            synchronized (this.RemoteActionCompatParcelizer) {
                this.IconCompatParcelizer = null;
            }
            return;
        }
        if (i == 1) {
            synchronized (this.RemoteActionCompatParcelizer) {
                this.IconCompatParcelizer = null;
            }
        } else if (i == 2) {
            synchronized (this.RemoteActionCompatParcelizer) {
                this.IconCompatParcelizer = null;
            }
        } else {
            if (i != 3) {
                throw new UnsupportedOperationException();
            }
            synchronized (this.RemoteActionCompatParcelizer) {
                this.IconCompatParcelizer = null;
            }
        }
    }

    public onMeasuredSizeChanged(Executor executor, PinnableContainer pinnableContainer) {
        this.serializer = 1;
        this.RemoteActionCompatParcelizer = new Object();
        this.read = executor;
        this.IconCompatParcelizer = pinnableContainer;
    }

    public onMeasuredSizeChanged(Executor executor, OnFailureListener onFailureListener) {
        this.serializer = 2;
        this.RemoteActionCompatParcelizer = new Object();
        this.read = executor;
        this.IconCompatParcelizer = onFailureListener;
    }

    public onMeasuredSizeChanged(Executor executor, OnSuccessListener onSuccessListener) {
        this.serializer = 3;
        this.RemoteActionCompatParcelizer = new Object();
        this.read = executor;
        this.IconCompatParcelizer = onSuccessListener;
    }

    public onMeasuredSizeChanged(Executor executor, PausedPrecompositionImpl pausedPrecompositionImpl, zzw zzwVar) {
        this.serializer = 4;
        this.read = executor;
        this.RemoteActionCompatParcelizer = pausedPrecompositionImpl;
        this.IconCompatParcelizer = zzwVar;
    }
}
