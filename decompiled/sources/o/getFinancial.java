package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class getFinancial extends ContactJsonAdapter {
    @Override // o.ContactJsonAdapter, o.CustomerChatModulestartChat2
    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer / 4;
    }

    @Override // o.ContactJsonAdapter
    public final r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k write() {
        return new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(serializer(), 14);
    }

    @Override // o.CustomerChatModulestartChat2
    public final String serializer() {
        return "SHAKE" + this.RemoteActionCompatParcelizer;
    }

    public final void serializer(byte[] bArr, int i, int i2) {
        if (!this.RatingCompat) {
            serializer(15, 4);
        }
        write(i, ((long) i2) * 8, bArr);
        serializer(this.RemoteActionCompatParcelizer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getFinancial(int i) {
        super(i, CustomerChatModulefetchUserFeatures1.ANY);
        if (i != 128 && i != 256) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(i, "'bitStrength' ", " not supported for SHAKE"));
            throw null;
        }
    }

    @Override // o.CustomerChatModulestartChat2
    public final int serializer(int i, byte[] bArr) {
        int i2 = this.RemoteActionCompatParcelizer / 4;
        serializer(bArr, i, i2);
        return i2;
    }
}
