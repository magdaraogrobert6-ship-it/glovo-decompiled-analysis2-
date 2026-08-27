package o;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class EncoderImplMediaCodecCallback implements DrawModifierNodeKt {
    public static final EncoderImplMediaCodecCallback IconCompatParcelizer = new EncoderImplMediaCodecCallback(1, null);
    public final /* synthetic */ int serializer;
    public final Object write;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public /* synthetic */ EncoderImplMediaCodecCallback(int i, Object obj) {
        this.serializer = i;
        this.write = obj;
    }

    @Override // o.DrawModifierNodeKt
    public final void RemoteActionCompatParcelizer(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            setInflatedId.read("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    public final String toString() {
        int i = this.serializer;
        Object obj = this.write;
        if (i != 0) {
            return super.toString() + "[status=SUCCESS, result=[" + obj + "]]";
        }
        return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) obj) + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        if (this.serializer != 0) {
            return this.write;
        }
        throw new ExecutionException((Throwable) this.write);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
