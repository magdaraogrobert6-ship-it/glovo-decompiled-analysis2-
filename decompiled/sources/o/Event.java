package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class Event extends ContactJsonAdapter {
    @Override // o.CustomerChatModulestartChat2
    public final int serializer(int i, byte[] bArr) {
        serializer(2, 2);
        write(i, this.RemoteActionCompatParcelizer, bArr);
        serializer(this.RemoteActionCompatParcelizer);
        return RemoteActionCompatParcelizer();
    }

    @Override // o.CustomerChatModulestartChat2
    public final String serializer() {
        return "SHA3-" + this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Event(int i) {
        super(i, CustomerChatModulefetchUserFeatures1.ANY);
        if (i != 224 && i != 256 && i != 384 && i != 512) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(i, "'bitLength' ", " not supported for SHA-3"));
            throw null;
        }
    }
}
