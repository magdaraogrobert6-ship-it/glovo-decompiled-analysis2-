package o;

import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import com.google.android.gms.tasks.zzc;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class getDifferencertfAjoo implements Executor {
    public final ArrayDeque IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public final Executor read;
    public Runnable serializer;
    public final /* synthetic */ int write;

    public getDifferencertfAjoo(Executor executor, int i) {
        this.write = i;
        if (i == 1) {
            this.read = executor;
            this.IconCompatParcelizer = new ArrayDeque();
            this.RemoteActionCompatParcelizer = new Object();
        } else {
            executor.getClass();
            this.read = executor;
            this.IconCompatParcelizer = new ArrayDeque();
            this.RemoteActionCompatParcelizer = new Object();
        }
    }

    public final void RemoteActionCompatParcelizer() {
        int i = this.write;
        if (i == 0) {
            synchronized (this.RemoteActionCompatParcelizer) {
                Object objPoll = this.IconCompatParcelizer.poll();
                Runnable runnable = (Runnable) objPoll;
                this.serializer = runnable;
                if (objPoll != null) {
                    this.read.execute(runnable);
                }
            }
            return;
        }
        if (i == 1) {
            Runnable runnable2 = (Runnable) this.IconCompatParcelizer.poll();
            this.serializer = runnable2;
            if (runnable2 != null) {
                this.read.execute(runnable2);
                return;
            }
            return;
        }
        synchronized (this.RemoteActionCompatParcelizer) {
            Runnable runnable3 = (Runnable) this.IconCompatParcelizer.poll();
            this.serializer = runnable3;
            if (runnable3 != null) {
                ((setMeasurementConstraintsBRTryo0) this.read).execute(runnable3);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.write;
        if (i == 0) {
            runnable.getClass();
            synchronized (this.RemoteActionCompatParcelizer) {
                this.IconCompatParcelizer.offer(new ND$$ExternalSyntheticLambda0(runnable, 4, this));
                if (this.serializer == null) {
                    RemoteActionCompatParcelizer();
                }
            }
            return;
        }
        int i2 = 1;
        if (i != 1) {
            synchronized (this.RemoteActionCompatParcelizer) {
                this.IconCompatParcelizer.add(new CameraX$$ExternalSyntheticLambda2(this, i2, runnable));
                if (this.serializer == null) {
                    RemoteActionCompatParcelizer();
                }
            }
            return;
        }
        synchronized (this.RemoteActionCompatParcelizer) {
            this.IconCompatParcelizer.add(new zzc(this, 3, runnable));
            if (this.serializer == null) {
                RemoteActionCompatParcelizer();
            }
        }
    }

    public getDifferencertfAjoo(setMeasurementConstraintsBRTryo0 setmeasurementconstraintsbrtryo0) {
        this.write = 2;
        this.RemoteActionCompatParcelizer = new Object();
        this.IconCompatParcelizer = new ArrayDeque();
        this.read = setmeasurementconstraintsbrtryo0;
    }
}
