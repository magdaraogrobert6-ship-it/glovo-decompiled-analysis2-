package o;

import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.messaging.FirebaseMessaging;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.sentiance.core.model.events.H$b;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdazvX83UIDsL68vmN7rPQXcY0mE implements getColorIntegerOrNulllambda0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ r8lambdazvX83UIDsL68vmN7rPQXcY0mE(int i) {
        this.serializer = i;
    }

    public /* synthetic */ r8lambdazvX83UIDsL68vmN7rPQXcY0mE(int i, Object obj) {
        this.serializer = i;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() throws Throwable {
        int i = 2 % 2;
        int i2 = this.serializer;
        onSdkVersionRead onsdkversionread = onSdkVersionRead.IconCompatParcelizer;
        int i3 = 22;
        int i4 = 0;
        switch (i2) {
            case 0:
                return new getSdkEnablementProviderandroid_sdk_base_release(9);
            case 1:
                return new SubcomposeAsyncImageContent();
            case 2:
                return new SubcomposeAsyncImagegl8XCv8();
            case 3:
                return new getActionViewIntentlambda0();
            case 4:
                return new r8lambda8ONSZngU81o_LRT9BkSkXpME2w(new getTransactionExecutor(), new internalInitInvalidationTracker(0), new internalInitInvalidationTracker(3), new internalInitInvalidationTracker(1), new internalInitInvalidationTracker(2));
            case 5:
                return new r8lambdadiHCtAejt895m8HzbAibmUGZMKo();
            case 6:
                FirebaseMessaging firebaseMessaging = FirebaseMessaging.getInstance();
                firebaseMessaging.getClass();
                return firebaseMessaging;
            case 7:
                GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
                googleApiAvailabilityLight.getClass();
                return googleApiAvailabilityLight;
            case 8:
                HuaweiApiAvailability huaweiApiAvailability = HuaweiApiAvailability.getInstance();
                huaweiApiAvailability.getClass();
                return huaweiApiAvailability;
            case 9:
                return runAttachLifecycle.write();
            case 10:
                accessregisterComponentCallback accessregistercomponentcallbackRemoteActionCompatParcelizer = SeekableTransitionState.RemoteActionCompatParcelizer();
                setNativeShader.RemoteActionCompatParcelizer(accessregistercomponentcallbackRemoteActionCompatParcelizer, "Cannot return null from a non-@Nullable @Provides method");
                return new GetAppStateImpl(i4, accessregistercomponentcallbackRemoteActionCompatParcelizer);
            case 11:
                return new isMainThread(21);
            case 12:
                return new getAdjustConfig();
            case 13:
                markCardAsVisuallyRead markcardasvisuallyread = new markCardAsVisuallyRead(new com.huawei.agconnect.config.impl.m(28), 1);
                int i5 = RemoteActionCompatParcelizer + 83;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return markcardasvisuallyread;
            case 14:
                return new trackPlayStoreSubscription();
            case 15:
                return new H$b(new BrazeExternalSyntheticLambda5(6));
            case 16:
                return new AdjustLinkResolutionAdjustLinkResolutionCallback((transformAndWrite) writeDatadatastore_core.write.write());
            case 17:
                return new BackoffStrategy((AttributionHandler2) resumeSending.write.write());
            case 18:
                new isMainThread(i3);
                return new getFireTrackingEnabled();
            case 19:
                return new io.sentry.util.MediaBrowserCompatMediaItem(new AndroidUiFrameClock());
            case 20:
                onsdkversionread.write();
                return new accessisMainThread();
            case 21:
                onsdkversionread.write();
                return new OnThirdPartySharingSettingsReadListener();
            case 22:
                try {
                    Object[] objArr = {new canReadAppSetId()};
                    Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1422467522);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (Process.myPid() >> 22), 4869 - TextUtils.getCapsMode("", 0, 0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 15, 2078736351, false, null, new Class[]{canReadAppSetId.class});
                    }
                    Object objNewInstance = ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr);
                    int i7 = read + 35;
                    RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        return objNewInstance;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            case 23:
                return new r8lambdaJ_QfP3gOiW8g_GLIRW39GJgv5OI();
            case 24:
                return new r8lambdaeEn0GUG5cGviZ6WG1OS4uJPKt0();
            case 25:
                return new accessisMainThread();
            case 26:
                return new r8lambdaokZBgNnbR8K2i443J9b9JUwVwk();
            case 27:
                r8lambdax3lltCpD3rATxa4vQpnFaaGbzP4 r8lambdax3lltcpd3ratxa4vqpnfaagbzp4 = new r8lambdax3lltCpD3rATxa4vQpnFaaGbzP4();
                int i8 = RemoteActionCompatParcelizer + 77;
                read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return r8lambdax3lltcpd3ratxa4vqpnfaagbzp4;
            case 28:
                return new r8lambdazJ_is40ErW_0zWXIHU0U2X8pyMM();
            default:
                return new accessgetCustomBrazeNotificationFactorycp();
        }
    }
}
