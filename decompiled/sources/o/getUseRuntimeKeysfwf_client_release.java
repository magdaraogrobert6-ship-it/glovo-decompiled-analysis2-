package o;

import org.tukaani.xz.CorruptedInputException;

/* JADX INFO: loaded from: classes4.dex */
public final class getUseRuntimeKeysfwf_client_release extends FwFClientConfigKt {
    public final byte[] IconCompatParcelizer;
    public int read;

    public getUseRuntimeKeysfwf_client_release(getFeaturesExpirationTimefwf_client_release getfeaturesexpirationtimefwf_client_release) {
        byte[] bArrIconCompatParcelizer = getfeaturesexpirationtimefwf_client_release.IconCompatParcelizer(65531);
        this.IconCompatParcelizer = bArrIconCompatParcelizer;
        this.read = bArrIconCompatParcelizer.length;
    }

    @Override // o.FwFClientConfigKt
    public final void serializer() throws CorruptedInputException {
        int i = this.RemoteActionCompatParcelizer;
        if (((-16777216) & i) == 0) {
            try {
                int i2 = this.write;
                byte[] bArr = this.IconCompatParcelizer;
                int i3 = this.read;
                this.read = i3 + 1;
                this.write = (i2 << 8) | (bArr[i3] & 255);
                this.RemoteActionCompatParcelizer = i << 8;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new CorruptedInputException();
            }
        }
    }
}
