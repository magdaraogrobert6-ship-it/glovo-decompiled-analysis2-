package o;

import android.text.TextUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetUpdateDisplayListIfDirtyMethodcp {
    public static SecretKeySpec read(accessgetRecreateDisplayListcp accessgetrecreatedisplaylistcp) {
        String str = accessgetrecreatedisplaylistcp.read;
        int i = accessgetrecreatedisplaylistcp.MediaMetadataCompat;
        int i2 = accessgetrecreatedisplaylistcp.MediaSessionCompatQueueItem;
        String str2 = accessgetrecreatedisplaylistcp.RemoteActionCompatParcelizer;
        String str3 = accessgetrecreatedisplaylistcp.serializer;
        String str4 = accessgetrecreatedisplaylistcp.write;
        String str5 = accessgetrecreatedisplaylistcp.IconCompatParcelizer;
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5) || TextUtils.isEmpty(str2) || str3.length() != str4.length() || str4.length() != str5.length() || str5.length() != i2 * 2 || i < 0 || TextUtils.isEmpty(str)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("invalid data for generating the key.");
            return null;
        }
        byte[] bArrIconCompatParcelizer = accessgetMinimumTouchTargetSizeMYxV2XQjd.IconCompatParcelizer(str3);
        byte[] bArrIconCompatParcelizer2 = accessgetMinimumTouchTargetSizeMYxV2XQjd.IconCompatParcelizer(str4);
        byte[] bArrIconCompatParcelizer3 = accessgetMinimumTouchTargetSizeMYxV2XQjd.IconCompatParcelizer(str5);
        write(bArrIconCompatParcelizer, -4);
        byte[] bArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bArrIconCompatParcelizer, bArrIconCompatParcelizer2);
        write(bArrRemoteActionCompatParcelizer, 6);
        return new SecretKeySpec(SecretKeyFactory.getInstance(str).generateSecret(new PBEKeySpec(accessgetMinimumTouchTargetSizeMYxV2XQjd.read(RemoteActionCompatParcelizer(bArrRemoteActionCompatParcelizer, bArrIconCompatParcelizer3)).toCharArray(), accessgetMinimumTouchTargetSizeMYxV2XQjd.IconCompatParcelizer(str2), i, i2 * 8)).getEncoded(), "AES");
    }

    public static void write(byte[] bArr, int i) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (i < 0) {
                bArr[i2] = (byte) (bArr[i2] << (-i));
            } else {
                bArr[i2] = (byte) (bArr[i2] >> i);
            }
        }
    }

    public static byte[] IconCompatParcelizer(SecretKeySpec secretKeySpec, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (secretKeySpec == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("key or cipherText must not be null.");
            return null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 1, 17);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(bArrCopyOfRange));
        return cipher.doFinal(bArr, bArrCopyOfRange.length + 1, (bArr.length - bArrCopyOfRange.length) - 1);
    }

    public static byte[] RemoteActionCompatParcelizer(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("left and right must be the same length.");
            return null;
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }
}
