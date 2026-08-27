package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class encode4Dl_Bck implements ComposableSingletonsWrapper_androidKt, dataAvailable {
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    @Override // o.ComposableSingletonsWrapper_androidKt
    public byte[] write(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    public /* synthetic */ encode4Dl_Bck(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.dataAvailable
    public ifDebug IconCompatParcelizer(int i) {
        return this.RemoteActionCompatParcelizer != 0 ? component21.forNumber(i) : encode.forNumber(i);
    }
}
