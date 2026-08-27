package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import kotlin.io.TextStreamsKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ReflectionUtils extends r8lambdazzuqe02XBR43ox0o_9r6taqg {
    public final r8lambda_OcJ7olE86bsKzOqyJLgcCCvo write;

    public ReflectionUtils(String str, r8lambda_OcJ7olE86bsKzOqyJLgcCCvo r8lambda_ocj7ole86bskzoqyjlgcccvo) {
        super(str, r8lambda_ocj7ole86bskzoqyjlgcccvo, false);
        if (!str.endsWith("-bin")) {
            TextStreamsKt.serializer(r8lambda_ocj7ole86bskzoqyjlgcccvo, "marshaller");
            this.write = r8lambda_ocj7ole86bskzoqyjlgcccvo;
            return;
        }
        int iWrite = MaybeObserveOn.write();
        int iWrite2 = MaybeObserveOn.write();
        int iWrite3 = MaybeObserveOn.write();
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer((String) ModuleDSLKt.serializer(MaybeObserveOn.write(), 1556036116, iWrite2, -1556036116, iWrite, new Object[]{"ASCII header is named %s.  Only binary headers may end with %s", new Object[]{str, "-bin"}}, iWrite3));
        throw null;
    }

    @Override // o.r8lambdazzuqe02XBR43ox0o_9r6taqg
    public final byte[] RemoteActionCompatParcelizer(Object obj) {
        String str = this.write.read(obj);
        TextStreamsKt.serializer(str, "null marshaller.toAsciiString()");
        return str.getBytes(visitSelfAndChildrenYYKmhodefault.read);
    }

    @Override // o.r8lambdazzuqe02XBR43ox0o_9r6taqg
    public final Object write(byte[] bArr) {
        return this.write.IconCompatParcelizer(new String(bArr, visitSelfAndChildrenYYKmhodefault.read));
    }
}
