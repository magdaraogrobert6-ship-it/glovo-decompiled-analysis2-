package o;

import io.grpc.internal.SharedResourcePool;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import java.util.concurrent.Executor;
import kotlin.io.TextStreamsKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes4.dex */
public final class shouldSkip implements Executor {
    public final SharedResourcePool IconCompatParcelizer;
    public Executor RemoteActionCompatParcelizer;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Executor executor;
        synchronized (this) {
            if (this.RemoteActionCompatParcelizer == null) {
                Executor executor2 = (Executor) JavascriptInterfaceBase.IconCompatParcelizer((BrazeWebViewClientsetWebViewClientStateListener11) this.IconCompatParcelizer.IconCompatParcelizer);
                Executor executor3 = this.RemoteActionCompatParcelizer;
                if (executor2 == null) {
                    int iWrite = MaybeObserveOn.write();
                    int iWrite2 = MaybeObserveOn.write();
                    int iWrite3 = MaybeObserveOn.write();
                    throw new NullPointerException((String) ModuleDSLKt.serializer(MaybeObserveOn.write(), 1556036116, iWrite2, -1556036116, iWrite, new Object[]{"%s.getObject()", new Object[]{executor3}}, iWrite3));
                }
                this.RemoteActionCompatParcelizer = executor2;
            }
            executor = this.RemoteActionCompatParcelizer;
        }
        executor.execute(runnable);
    }

    public shouldSkip(SharedResourcePool sharedResourcePool) {
        TextStreamsKt.serializer(sharedResourcePool, "executorPool");
        this.IconCompatParcelizer = sharedResourcePool;
    }
}
