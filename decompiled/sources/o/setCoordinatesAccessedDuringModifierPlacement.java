package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class setCoordinatesAccessedDuringModifierPlacement implements invalidateSubtreedefault {
    public static final IntrinsicsPolicy RemoteActionCompatParcelizer = IntrinsicsPolicy.ALGORITHM_NOT_FIPS;
    public final SecretKeySpec IconCompatParcelizer;
    public final byte[] read;
    public final byte[] write;

    public setCoordinatesAccessedDuringModifierPlacement(byte[] bArr) throws GeneralSecurityException {
        setLookaheadCoordinatesAccessedDuringPlacement.serializer(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.IconCompatParcelizer = secretKeySpec;
        if (!RemoteActionCompatParcelizer.isCompatible()) {
            getAlignmentLinesMap.write("Can not use AES-CMAC in FIPS-mode.");
            throw null;
        }
        Cipher cipher = (Cipher) setLayoutStateui.IconCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        Object[] objArr = {cipher.doFinal(new byte[16])};
        int i = logImpressionlambda2.read();
        byte[] bArr2 = (byte[]) coil3.util.ContextsKt.IconCompatParcelizer(-1906265295, logImpressionlambda2.read(), objArr, logImpressionlambda2.read(), i, 1906265295, logImpressionlambda2.read());
        this.read = bArr2;
        int i2 = logImpressionlambda2.read();
        int i3 = logImpressionlambda2.read();
        int i4 = logImpressionlambda2.read();
        this.write = (byte[]) coil3.util.ContextsKt.IconCompatParcelizer(-1906265295, logImpressionlambda2.read(), new Object[]{bArr2}, i3, i2, 1906265295, i4);
    }

    @Override // o.invalidateSubtreedefault
    public final byte[] IconCompatParcelizer(int i, byte[] bArr) {
        byte[] bArr2;
        if (i <= 16) {
            if (RemoteActionCompatParcelizer.isCompatible()) {
                Cipher cipher = (Cipher) setLayoutStateui.IconCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer("AES/ECB/NoPadding");
                cipher.init(1, this.IconCompatParcelizer);
                int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
                if (iMax * 16 == bArr.length) {
                    Object[] objArr = {bArr, Integer.valueOf((iMax - 1) * 16), this.read, 0, 16};
                    bArr2 = (byte[]) coil3.ExtrasKt.read(-1067551855, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 1067551856, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
                } else {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
                    if (bArrCopyOfRange.length < 16) {
                        byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
                        bArrCopyOf[bArrCopyOfRange.length] = -128;
                        Object[] objArr2 = {bArrCopyOf, this.write};
                        bArr2 = (byte[]) coil3.ExtrasKt.read(-116495733, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 116495733, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr2);
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("x must be smaller than a block.");
                        return null;
                    }
                }
                byte[] bArrDoFinal = new byte[16];
                for (int i2 = 0; i2 < iMax - 1; i2++) {
                    Object[] objArr3 = {bArrDoFinal, 0, bArr, Integer.valueOf(i2 * 16), 16};
                    bArrDoFinal = cipher.doFinal((byte[]) coil3.ExtrasKt.read(-1067551855, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 1067551856, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr3));
                }
                int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
                return Arrays.copyOf(cipher.doFinal((byte[]) coil3.ExtrasKt.read(-116495733, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 116495733, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, new Object[]{bArr2, bArrDoFinal})), i);
            }
            getAlignmentLinesMap.write("Can not use AES-CMAC in FIPS-mode.");
            return null;
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
