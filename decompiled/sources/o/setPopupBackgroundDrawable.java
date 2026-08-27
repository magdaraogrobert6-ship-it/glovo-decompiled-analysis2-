package o;

import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public abstract class setPopupBackgroundDrawable {
    public static KeyGenParameterSpec read(KeyGenParameterSpec.Builder builder) {
        return builder.build();
    }

    public static void write(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) throws InvalidAlgorithmParameterException {
        keyGenerator.init(keyGenParameterSpec);
    }

    public static void RemoteActionCompatParcelizer(KeyGenParameterSpec.Builder builder) {
        builder.setEncryptionPaddings("PKCS7Padding");
    }

    public static KeyGenParameterSpec.Builder read(String str, int i) {
        return new KeyGenParameterSpec.Builder(str, i);
    }

    public static void write(KeyGenParameterSpec.Builder builder) {
        builder.setBlockModes("CBC");
    }
}
