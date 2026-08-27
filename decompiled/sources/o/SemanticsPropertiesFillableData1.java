package o;

import android.security.keystore.KeyGenParameterSpec;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.roadrunner.common.data.api.CloudflareErrorClassifier;
import com.roadrunner.common.data.api.ExtractCriticalHttpIssueData;
import com.roadrunner.customerchat.selfservice.data.cache.ChatIdCacheHelper;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.push.DialogMessageRequestProxy;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes3.dex */
public final class SemanticsPropertiesFillableData1 implements getColorIntegerOrNulllambda0 {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ SemanticsPropertiesFillableData1(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public /* synthetic */ SemanticsPropertiesFillableData1(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() throws NoSuchPaddingException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 113;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = 3;
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                return new SemanticsPropertiesIsPopup1((AndroidUiFrameClock) SemanticsPropertiesIsDialog1.serializer.write());
            case 1:
                return new getSTYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED();
            case 2:
                DialogMessageRequestProxy dialogMessageRequestProxy = new DialogMessageRequestProxy();
                int i5 = write + 81;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return dialogMessageRequestProxy;
                }
                obj.hashCode();
                throw null;
            case 3:
                return new getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT();
            case 4:
                accesssetAddChangeCallbackMethodcp accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer = accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer();
                setNativeShader.IconCompatParcelizer(accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer);
                return accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer;
            case 5:
                RemoteConfigManager remoteConfigManager = RemoteConfigManager.getInstance();
                setNativeShader.IconCompatParcelizer(remoteConfigManager);
                return remoteConfigManager;
            case 6:
                SessionManager sessionManager = SessionManager.getInstance();
                setNativeShader.IconCompatParcelizer(sessionManager);
                return sessionManager;
            case 7:
                return new getPositionInWindowF1C5BW0((emitFakeNodes) fakeSemanticsNodeypyhhiA.IconCompatParcelizer.write());
            case 8:
                return new SemanticsNodedefault();
            case 9:
                return new AndroidUiFrameClock();
            case 10:
                return new SemanticsPropertiesTestTag1();
            case 11:
                IsFixableByRetry isFixableByRetry = new IsFixableByRetry(11);
                int i6 = write + 11;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return isFixableByRetry;
                }
                throw null;
            case 12:
                return new com.huawei.wisesecurity.ucs_credential.g0();
            case 13:
                return new com.huawei.wisesecurity.ucs_credential.n0();
            case 14:
                return new com.huawei.wisesecurity.ucs_credential.p0();
            case 15:
                return new AndroidUiDispatcherCompanioncurrentThread1(2);
            case 16:
                return new isMainThread(i, new io.sentry.util.MediaBrowserCompatMediaItem(i4));
            case 17:
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.getClass();
                return cipher;
            case 18:
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                java.security.Key key = keyStore.getKey("ROAD_RUNNER_BIOMETRICS_KEY", null);
                if (key != null) {
                    return (SecretKey) key;
                }
                KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder("ROAD_RUNNER_BIOMETRICS_KEY", 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").setUserAuthenticationRequired(true).setKeySize(androidx.compose.ui.graphics.Fields.RotationX);
                keySize.getClass();
                keySize.setInvalidatedByBiometricEnrollment(true);
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(keySize.build());
                SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
                secretKeyGenerateKey.getClass();
                return secretKeyGenerateKey;
            case 19:
                return new ExtractCriticalHttpIssueData(new CloudflareErrorClassifier());
            case 20:
                return new com.huawei.wisesecurity.ucs_credential.p0();
            case 21:
                return new RectListDebugger_androidKtRectListDebugger1();
            case 22:
                updateHandlersStatusAndSendI updatehandlersstatusandsendi = RectManagerdispatchLambda1.RemoteActionCompatParcelizer;
                setNativeShader.IconCompatParcelizer(updatehandlersstatusandsendi);
                int i7 = read + 19;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return updatehandlersstatusandsendi;
            case 23:
                return new ChatIdCacheHelper();
            case 24:
                return new addBulletr9BaKPg();
            case 25:
                return new addUrlAnnotation();
            case 26:
                return new addStringAnnotation();
            case 27:
                return new accessgetRelativecp();
            case 28:
                zzz zzzVar = new zzz();
                zzzVar.serializer = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").withLocale(java.util.Locale.getDefault()).withZone(ZoneId.of("UTC"));
                return zzzVar;
            default:
                return new accessisMainThread();
        }
    }
}
