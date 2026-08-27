package o;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class getWidthui {
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final SecretKeySpec serializer;
    public static final IntrinsicsPolicy write = IntrinsicsPolicy.ALGORITHM_REQUIRES_BORINGCRYPTO;
    public static final getE IconCompatParcelizer = new getE(10);

    public final void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = (Cipher) IconCompatParcelizer.get();
        byte[] bArr4 = new byte[this.RemoteActionCompatParcelizer];
        System.arraycopy(bArr3, 0, bArr4, 0, this.read);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.serializer;
        if (z) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) == i2) {
            return;
        }
        getAlignmentLinesMap.write("stored output's length does not match input's length");
    }

    public getWidthui(byte[] bArr, int i) throws GeneralSecurityException {
        if (!write.isCompatible()) {
            getAlignmentLinesMap.write("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        setLookaheadCoordinatesAccessedDuringPlacement.serializer(bArr.length);
        this.serializer = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) IconCompatParcelizer.get()).getBlockSize();
        this.RemoteActionCompatParcelizer = blockSize;
        if (i < 12 || i > blockSize) {
            getAlignmentLinesMap.write("invalid IV size");
            throw null;
        }
        this.read = i;
    }
}
