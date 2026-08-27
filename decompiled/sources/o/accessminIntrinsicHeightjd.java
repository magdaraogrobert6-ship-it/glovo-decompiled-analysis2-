package o;

import io.sentry.util.network.NetworkBody;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.engines.AESEngine;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessminIntrinsicHeightjd {
    public static boolean read = true;

    public static SecureRandom RemoteActionCompatParcelizer() {
        SecureRandom secureRandom;
        try {
            secureRandom = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException unused) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("EncryptUtil", "getSecureRandomBytes: NoSuchAlgorithmException");
            secureRandom = null;
        }
        if (secureRandom == null) {
            try {
                secureRandom = SecureRandom.getInstance("SHA1PRNG");
            } catch (NoSuchAlgorithmException unused2) {
                ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("EncryptUtil", "NoSuchAlgorithmException");
                return secureRandom;
            } catch (Throwable th) {
                if (read) {
                    ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("EncryptUtil", "exception : " + th.getMessage() + " , you should implementation bcprov-jdk15on library");
                    read = false;
                }
                return secureRandom;
            }
        }
        AESEngine aESEngine = new AESEngine();
        byte[] bArr = new byte[32];
        secureRandom.nextBytes(bArr);
        return new getGlobalEntityId(secureRandom, new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(24, new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(25, secureRandom)), new NetworkBody(aESEngine, 29, bArr));
    }

    public static String read(int i) {
        return accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(i));
    }

    public static byte[] RemoteActionCompatParcelizer(int i) {
        SecureRandom secureRandomRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (secureRandomRemoteActionCompatParcelizer == null) {
            return new byte[0];
        }
        try {
            byte[] bArr = new byte[i];
            secureRandomRemoteActionCompatParcelizer.nextBytes(bArr);
            return bArr;
        } catch (NullPointerException e) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("EncryptUtil", "secureRandom nextBytes error is : " + e.getMessage());
            return new byte[0];
        }
    }
}
