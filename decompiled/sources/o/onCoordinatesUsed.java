package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class onCoordinatesUsed implements accessgetValuesp {
    public final setCoordinatesAccessedDuringModifierPlacement RatingCompat;
    public final byte[] serializer;
    public static final IntrinsicsPolicy read = IntrinsicsPolicy.ALGORITHM_NOT_FIPS;
    public static final List IconCompatParcelizer = Arrays.asList(64);
    public static final byte[] RemoteActionCompatParcelizer = new byte[16];
    public static final byte[] write = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    public onCoordinatesUsed(byte[] bArr) throws GeneralSecurityException {
        if (!read.isCompatible()) {
            getAlignmentLinesMap.write("Can not use AES-SIV in FIPS-mode.");
            throw null;
        }
        if (!IconCompatParcelizer.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(af$$ExternalSyntheticOutline0.m(bArr.length, " bytes; key must have 64 bytes", new StringBuilder("invalid key size: ")));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.serializer = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.RatingCompat = new setCoordinatesAccessedDuringModifierPlacement(bArrCopyOfRange);
    }

    public final byte[] RemoteActionCompatParcelizer(byte[]... bArr) {
        byte[] bArrCopyOf;
        int length = bArr.length;
        setCoordinatesAccessedDuringModifierPlacement setcoordinatesaccessedduringmodifierplacement = this.RatingCompat;
        if (length == 0) {
            return setcoordinatesaccessedduringmodifierplacement.IconCompatParcelizer(16, write);
        }
        byte[] bArrIconCompatParcelizer = setcoordinatesaccessedduringmodifierplacement.IconCompatParcelizer(16, RemoteActionCompatParcelizer);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            int i2 = logImpressionlambda2.read();
            Object[] objArr = {(byte[]) coil3.util.ContextsKt.IconCompatParcelizer(-1906265295, logImpressionlambda2.read(), new Object[]{bArrIconCompatParcelizer}, logImpressionlambda2.read(), i2, 1906265295, logImpressionlambda2.read()), setcoordinatesaccessedduringmodifierplacement.IconCompatParcelizer(16, bArr2)};
            bArrIconCompatParcelizer = (byte[]) coil3.ExtrasKt.read(-116495733, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 116495733, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < bArrIconCompatParcelizer.length) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("xorEnd requires a.length >= b.length");
                return null;
            }
            int length2 = bArr3.length;
            int length3 = bArrIconCompatParcelizer.length;
            bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length);
            for (int i3 = 0; i3 < bArrIconCompatParcelizer.length; i3++) {
                int i4 = (length2 - length3) + i3;
                bArrCopyOf[i4] = (byte) (bArrCopyOf[i4] ^ bArrIconCompatParcelizer[i3]);
            }
        } else {
            if (bArr3.length >= 16) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("x must be smaller than a block.");
                return null;
            }
            byte[] bArrCopyOf2 = Arrays.copyOf(bArr3, 16);
            bArrCopyOf2[bArr3.length] = -128;
            int i5 = logImpressionlambda2.read();
            Object[] objArr2 = {bArrCopyOf2, (byte[]) coil3.util.ContextsKt.IconCompatParcelizer(-1906265295, logImpressionlambda2.read(), new Object[]{bArrIconCompatParcelizer}, logImpressionlambda2.read(), i5, 1906265295, logImpressionlambda2.read())};
            bArrCopyOf = (byte[]) coil3.ExtrasKt.read(-116495733, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 116495733, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr2);
        }
        return setcoordinatesaccessedduringmodifierplacement.IconCompatParcelizer(16, bArrCopyOf);
    }

    @Override // o.accessgetValuesp
    public final byte[] serializer(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            getAlignmentLinesMap.write("Ciphertext too short.");
            return null;
        }
        Cipher cipher = (Cipher) setLayoutStateui.IconCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(2, new SecretKeySpec(this.serializer, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            bArrDoFinal = new byte[0];
        }
        if (MessageDigest.isEqual(bArrCopyOfRange, RemoteActionCompatParcelizer(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    @Override // o.accessgetValuesp
    public final byte[] read(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            getAlignmentLinesMap.write("plaintext too long");
            return null;
        }
        Cipher cipher = (Cipher) setLayoutStateui.IconCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer("AES/CTR/NoPadding");
        byte[] bArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrRemoteActionCompatParcelizer.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(1, new SecretKeySpec(this.serializer, "AES"), new IvParameterSpec(bArr3));
        return coil3.ExtrasKt.RemoteActionCompatParcelizer(bArrRemoteActionCompatParcelizer, cipher.doFinal(bArr));
    }
}
