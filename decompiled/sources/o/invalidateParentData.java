package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
public final class invalidateParentData implements findBestHitDistancefn2tFes {
    public static final IntrinsicsPolicy RemoteActionCompatParcelizer = IntrinsicsPolicy.ALGORITHM_REQUIRES_BORINGCRYPTO;
    public final pushDiagonal write;

    @Override // o.findBestHitDistancefn2tFes
    public final byte[] IconCompatParcelizer(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrIconCompatParcelizer = setLookaheadCoordinatesAccessedDuringModifierPlacement.IconCompatParcelizer(12);
        pushDiagonal pushdiagonal = this.write;
        boolean z = pushdiagonal.RemoteActionCompatParcelizer;
        if (bArrIconCompatParcelizer.length != 12) {
            getAlignmentLinesMap.write("iv is wrong size");
            return null;
        }
        if (bArr.length > 2147483619) {
            getAlignmentLinesMap.write("plaintext too long");
            return null;
        }
        byte[] bArr3 = new byte[z ? bArr.length + 28 : bArr.length + 16];
        if (z) {
            System.arraycopy(bArrIconCompatParcelizer, 0, bArr3, 0, 12);
        }
        AlgorithmParameterSpec algorithmParameterSpec = pushDiagonal.read(bArrIconCompatParcelizer);
        accessgetVoiceAssistcp accessgetvoiceassistcp = pushDiagonal.read;
        ((Cipher) accessgetvoiceassistcp.get()).init(1, pushdiagonal.serializer, algorithmParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) accessgetvoiceassistcp.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) accessgetvoiceassistcp.get()).doFinal(bArr, 0, bArr.length, bArr3, z ? 12 : 0);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(d$$ExternalSyntheticOutline0.m(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    }

    @Override // o.findBestHitDistancefn2tFes
    public final byte[] serializer(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        pushDiagonal pushdiagonal = this.write;
        boolean z = pushdiagonal.RemoteActionCompatParcelizer;
        if (bArrCopyOf.length != 12) {
            getAlignmentLinesMap.write("iv is wrong size");
            return null;
        }
        if (bArr.length < (z ? 28 : 16)) {
            getAlignmentLinesMap.write("ciphertext too short");
            return null;
        }
        if (z && !ByteBuffer.wrap(bArrCopyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
            getAlignmentLinesMap.write("iv does not match prepended iv");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpec = pushDiagonal.read(bArrCopyOf);
        accessgetVoiceAssistcp accessgetvoiceassistcp = pushDiagonal.read;
        ((Cipher) accessgetvoiceassistcp.get()).init(2, pushdiagonal.serializer, algorithmParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) accessgetvoiceassistcp.get()).updateAAD(bArr2);
        }
        int i = z ? 12 : 0;
        int length = bArr.length;
        if (z) {
            length -= 12;
        }
        return ((Cipher) accessgetvoiceassistcp.get()).doFinal(bArr, i, length);
    }

    public invalidateParentData(byte[] bArr) throws GeneralSecurityException {
        if (RemoteActionCompatParcelizer.isCompatible()) {
            this.write = new pushDiagonal(bArr);
        } else {
            getAlignmentLinesMap.write("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
    }
}
