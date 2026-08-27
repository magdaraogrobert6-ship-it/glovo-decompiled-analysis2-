package o;

import com.google.android.gms.stats.zza;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewFreezeAfterHighSpeedRecordingQuirk implements Executor {
    public final Executor serializer;
    public final ArrayDeque read = new ArrayDeque();
    public final zza write = new zza(7, this);
    public SignalEosOutputBufferNotComeQuirk RemoteActionCompatParcelizer = SignalEosOutputBufferNotComeQuirk.IDLE;
    public long IconCompatParcelizer = 0;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        SignalEosOutputBufferNotComeQuirk signalEosOutputBufferNotComeQuirk;
        runnable.getClass();
        synchronized (this.read) {
            SignalEosOutputBufferNotComeQuirk signalEosOutputBufferNotComeQuirk2 = this.RemoteActionCompatParcelizer;
            if (signalEosOutputBufferNotComeQuirk2 != SignalEosOutputBufferNotComeQuirk.RUNNING && signalEosOutputBufferNotComeQuirk2 != (signalEosOutputBufferNotComeQuirk = SignalEosOutputBufferNotComeQuirk.QUEUED)) {
                long j = this.IconCompatParcelizer;
                boolean z = true;
                r8lambdaLVtmTRhRGfOb6NQ32qFoCdAjESk r8lambdalvtmtrhrgfob6nq32qfocdajesk = new r8lambdaLVtmTRhRGfOb6NQ32qFoCdAjESk(runnable, 1);
                this.read.add(r8lambdalvtmtrhrgfob6nq32qfocdajesk);
                SignalEosOutputBufferNotComeQuirk signalEosOutputBufferNotComeQuirk3 = SignalEosOutputBufferNotComeQuirk.QUEUING;
                this.RemoteActionCompatParcelizer = signalEosOutputBufferNotComeQuirk3;
                try {
                    this.serializer.execute(this.write);
                    if (this.RemoteActionCompatParcelizer != signalEosOutputBufferNotComeQuirk3) {
                        return;
                    }
                    synchronized (this.read) {
                        if (this.IconCompatParcelizer == j && this.RemoteActionCompatParcelizer == signalEosOutputBufferNotComeQuirk3) {
                            this.RemoteActionCompatParcelizer = signalEosOutputBufferNotComeQuirk;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.read) {
                        SignalEosOutputBufferNotComeQuirk signalEosOutputBufferNotComeQuirk4 = this.RemoteActionCompatParcelizer;
                        if ((signalEosOutputBufferNotComeQuirk4 != SignalEosOutputBufferNotComeQuirk.IDLE && signalEosOutputBufferNotComeQuirk4 != SignalEosOutputBufferNotComeQuirk.QUEUING) || !this.read.removeLastOccurrence(r8lambdalvtmtrhrgfob6nq32qfocdajesk)) {
                            z = false;
                        }
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.read.add(runnable);
        }
    }

    public PreviewFreezeAfterHighSpeedRecordingQuirk(Executor executor) {
        executor.getClass();
        this.serializer = executor;
    }
}
