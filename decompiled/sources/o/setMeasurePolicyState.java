package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class setMeasurePolicyState implements findBestHitDistancefn2tFes {
    public static final getE RemoteActionCompatParcelizer = new getE(9);
    public final SecretKeySpec IconCompatParcelizer;

    public setMeasurePolicyState(byte[] bArr) throws InvalidAlgorithmParameterException {
        setLookaheadCoordinatesAccessedDuringPlacement.serializer(bArr.length);
        this.IconCompatParcelizer = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec write(int i, byte[] bArr) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(androidx.compose.ui.graphics.Fields.SpotShadowColor, bArr, 0, i);
        } catch (ClassNotFoundException unused) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                return new IvParameterSpec(bArr, 0, i);
            }
            getAlignmentLinesMap.write("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            return null;
        }
    }

    @Override // o.findBestHitDistancefn2tFes
    public final byte[] IconCompatParcelizer(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            getAlignmentLinesMap.write("plaintext too long");
            return null;
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrIconCompatParcelizer = setLookaheadCoordinatesAccessedDuringModifierPlacement.IconCompatParcelizer(12);
        System.arraycopy(bArrIconCompatParcelizer, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecWrite = write(bArrIconCompatParcelizer.length, bArrIconCompatParcelizer);
        getE gete = RemoteActionCompatParcelizer;
        ((Cipher) gete.get()).init(1, this.IconCompatParcelizer, algorithmParameterSpecWrite);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) gete.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) gete.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(d$$ExternalSyntheticOutline0.m(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    }

    @Override // o.findBestHitDistancefn2tFes
    public final byte[] serializer(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            getAlignmentLinesMap.write("ciphertext too short");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecWrite = write(12, bArr);
        getE gete = RemoteActionCompatParcelizer;
        ((Cipher) gete.get()).init(2, this.IconCompatParcelizer, algorithmParameterSpecWrite);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) gete.get()).updateAAD(bArr2);
        }
        return ((Cipher) gete.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}
