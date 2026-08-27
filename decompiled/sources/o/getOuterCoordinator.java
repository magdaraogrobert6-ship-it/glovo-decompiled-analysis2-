package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class getOuterCoordinator implements findBestHitDistancefn2tFes {
    public static final IntrinsicsPolicy IconCompatParcelizer = IntrinsicsPolicy.ALGORITHM_NOT_FIPS;
    public static final getE read = new getE(11);
    public static final getE serializer = new getE(12);
    public final byte[] MediaMetadataCompat;
    public final SecretKeySpec MediaSessionCompatQueueItem;
    public final int RemoteActionCompatParcelizer;
    public final byte[] write;

    public static byte[] read(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // o.findBestHitDistancefn2tFes
    public final byte[] serializer(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.RemoteActionCompatParcelizer;
        int i2 = (length - i) - 16;
        if (i2 < 0) {
            getAlignmentLinesMap.write("ciphertext too short");
            return null;
        }
        Cipher cipher = (Cipher) read.get();
        SecretKeySpec secretKeySpec = this.MediaSessionCompatQueueItem;
        cipher.init(1, secretKeySpec);
        byte[] bArrWrite = write(cipher, 0, bArr, 0, this.RemoteActionCompatParcelizer);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrWrite2 = write(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrWrite3 = write(cipher, 2, bArr, this.RemoteActionCompatParcelizer, i2);
        int length2 = bArr.length;
        byte b = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            b = (byte) (b | (((bArr[(length2 - 16) + i3] ^ bArrWrite2[i3]) ^ bArrWrite[i3]) ^ bArrWrite3[i3]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) serializer.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrWrite));
        return cipher2.doFinal(bArr, i, i2);
    }

    public static byte[] write(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            int i2 = i + 1;
            bArr2[i] = (byte) (((bArr[i] << 1) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    public final byte[] write(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrCopyOf;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        byte[] bArr3 = this.write;
        if (i3 == 0) {
            return cipher.doFinal(read(bArr2, bArr3));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                bArrDoFinal[i5] = (byte) (bArrDoFinal[i5] ^ bArr[(i2 + i4) + i5]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i4 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
        if (bArrCopyOfRange.length == 16) {
            bArrCopyOf = read(bArrCopyOfRange, bArr3);
        } else {
            bArrCopyOf = Arrays.copyOf(this.MediaMetadataCompat, 16);
            for (int i6 = 0; i6 < bArrCopyOfRange.length; i6++) {
                bArrCopyOf[i6] = (byte) (bArrCopyOf[i6] ^ bArrCopyOfRange[i6]);
            }
            bArrCopyOf[bArrCopyOfRange.length] = (byte) (bArrCopyOf[bArrCopyOfRange.length] ^ 128);
        }
        return cipher.doFinal(read(bArrDoFinal, bArrCopyOf));
    }

    public getOuterCoordinator(byte[] bArr, int i) throws GeneralSecurityException {
        if (!IconCompatParcelizer.isCompatible()) {
            getAlignmentLinesMap.write("Can not use AES-EAX in FIPS-mode.");
            throw null;
        }
        if (i != 12 && i != 16) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("IV size should be either 12 or 16 bytes");
            throw null;
        }
        this.RemoteActionCompatParcelizer = i;
        setLookaheadCoordinatesAccessedDuringPlacement.serializer(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.MediaSessionCompatQueueItem = secretKeySpec;
        Cipher cipher = (Cipher) read.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrWrite = write(cipher.doFinal(new byte[16]));
        this.write = bArrWrite;
        this.MediaMetadataCompat = write(bArrWrite);
    }

    @Override // o.findBestHitDistancefn2tFes
    public final byte[] IconCompatParcelizer(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.RemoteActionCompatParcelizer;
        if (length <= 2147483631 - i) {
            byte[] bArr3 = new byte[bArr.length + i + 16];
            byte[] bArrIconCompatParcelizer = setLookaheadCoordinatesAccessedDuringModifierPlacement.IconCompatParcelizer(i);
            System.arraycopy(bArrIconCompatParcelizer, 0, bArr3, 0, i);
            Cipher cipher = (Cipher) read.get();
            SecretKeySpec secretKeySpec = this.MediaSessionCompatQueueItem;
            cipher.init(1, secretKeySpec);
            byte[] bArrWrite = write(cipher, 0, bArrIconCompatParcelizer, 0, bArrIconCompatParcelizer.length);
            byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
            byte[] bArrWrite2 = write(cipher, 1, bArr4, 0, bArr4.length);
            Cipher cipher2 = (Cipher) serializer.get();
            cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrWrite));
            cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.RemoteActionCompatParcelizer);
            byte[] bArrWrite3 = write(cipher, 2, bArr3, this.RemoteActionCompatParcelizer, bArr.length);
            int length2 = bArr.length;
            for (int i2 = 0; i2 < 16; i2++) {
                bArr3[length2 + i + i2] = (byte) ((bArrWrite2[i2] ^ bArrWrite[i2]) ^ bArrWrite3[i2]);
            }
            return bArr3;
        }
        getAlignmentLinesMap.write("plaintext too long");
        return null;
    }
}
