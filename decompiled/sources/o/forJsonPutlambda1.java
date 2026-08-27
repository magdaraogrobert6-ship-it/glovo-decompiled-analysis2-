package o;

import android.security.keystore.KeyGenParameterSpec;
import com.sentiance.sdk.InjectUsing;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.Map;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "EncryptionKeyProvider")
public class forJsonPutlambda1 implements removeGeofencesRegisteredWithGeofencingClientlambda2, r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final Object read;
    private final isAdapterPositionOnScreen serializer;

    public static final class serializer {
        public serializer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return instance_delegatelambda0.write;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        synchronized (this.read) {
            try {
                ((KeyStore) this.serializer.MediaSessionCompatResultReceiverWrapper()).deleteEntry("com.sentiance.sdk.encryption.main_key");
            } catch (Exception unused) {
            }
        }
    }

    public final SecretKey read() {
        SecretKey secretKey;
        synchronized (this.read) {
            KeyStore.Entry entry = ((KeyStore) this.serializer.MediaSessionCompatResultReceiverWrapper()).getEntry("com.sentiance.sdk.encryption.main_key", null);
            KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
            secretKey = secretKeyEntry != null ? secretKeyEntry.getSecretKey() : null;
            if (secretKey == null) {
                secretKey = serializer();
            }
        }
        return secretKey;
    }

    static {
        new serializer(null);
    }

    public forJsonPutlambda1(parseLonglambda0 parselonglambda0) {
        parselonglambda0.getClass();
        this.read = new Object();
        this.serializer = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(0) { // from class: com.sentiance.sdk.encryption.EncryptionKeyProvider$keyStore$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                return keyStore;
            }
        });
    }

    private static SecretKey serializer() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("com.sentiance.sdk.encryption.main_key", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(androidx.compose.ui.graphics.Fields.SpotShadowColor).build();
        keyGenParameterSpecBuild.getClass();
        keyGenerator.init(keyGenParameterSpecBuild);
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        secretKeyGenerateKey.getClass();
        return secretKeyGenerateKey;
    }
}
