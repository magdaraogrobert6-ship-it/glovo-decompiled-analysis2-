package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import kotlin.io.TextStreamsKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes4.dex */
public final class constructObjectQuietlylambda0 extends r8lambdazzuqe02XBR43ox0o_9r6taqg {
    public final r8lambdam0pROBQI4dUHq1bB07KqFqyReTo write;

    @Override // o.r8lambdazzuqe02XBR43ox0o_9r6taqg
    public final byte[] RemoteActionCompatParcelizer(Object obj) {
        byte[] bArrSerializer = this.write.serializer(obj);
        TextStreamsKt.serializer(bArrSerializer, "null marshaller.toAsciiString()");
        return bArrSerializer;
    }

    @Override // o.r8lambdazzuqe02XBR43ox0o_9r6taqg
    public final Object write(byte[] bArr) {
        return this.write.write(bArr);
    }

    public constructObjectQuietlylambda0(String str, boolean z, r8lambdam0pROBQI4dUHq1bB07KqFqyReTo r8lambdam0probqi4duhq1bb07kqfqyreto) {
        super(str, r8lambdam0probqi4duhq1bb07kqfqyreto, z);
        if (!str.endsWith("-bin")) {
            this.write = r8lambdam0probqi4duhq1bb07kqfqyreto;
            return;
        }
        int iWrite = MaybeObserveOn.write();
        int iWrite2 = MaybeObserveOn.write();
        int iWrite3 = MaybeObserveOn.write();
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer((String) ModuleDSLKt.serializer(MaybeObserveOn.write(), 1556036116, iWrite2, -1556036116, iWrite, new Object[]{"ASCII header is named %s.  Only binary headers may end with %s", new Object[]{str, "-bin"}}, iWrite3));
        throw null;
    }
}
