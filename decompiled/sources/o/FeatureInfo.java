package o;

/* JADX INFO: loaded from: classes4.dex */
public final class FeatureInfo extends FWFRequest {
    public final byte[] IconCompatParcelizer;

    public FeatureInfo(getUserFeatureFlags getuserfeatureflags, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(getuserfeatureflags, true);
        int length = bArr.length;
        int length2 = bArr2.length;
        int length3 = bArr3.length;
        byte[] bArr6 = new byte[length + length2 + length3 + bArr4.length + bArr5.length];
        this.IconCompatParcelizer = bArr6;
        System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
        int length4 = bArr.length;
        System.arraycopy(bArr2, 0, bArr6, length4, bArr2.length);
        int length5 = length4 + bArr2.length;
        System.arraycopy(bArr3, 0, bArr6, length5, bArr3.length);
        int length6 = length5 + bArr3.length;
        System.arraycopy(bArr4, 0, bArr6, length6, bArr4.length);
        System.arraycopy(bArr5, 0, bArr6, length6 + bArr4.length, bArr5.length);
    }
}
