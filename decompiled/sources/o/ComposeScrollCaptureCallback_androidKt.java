package o;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ComposeScrollCaptureCallback_androidKt {
    public static byte[] read(char[] cArr, byte[] bArr, int i, boolean z) {
        try {
            return (z ? SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256") : SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1")).generateSecret(new PBEKeySpec(cArr, bArr, 10000, i)).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("PBKDF2", "pbkdf exception : " + e.getMessage());
            return new byte[0];
        }
    }
}
