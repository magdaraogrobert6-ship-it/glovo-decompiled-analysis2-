package o;

import android.annotation.SuppressLint;
import android.app.ApplicationExitInfo;
import android.location.Location;
import android.os.Debug;
import android.util.Log;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.H$b;
import com.sentiance.core.model.events.I$b;
import com.sentiance.core.model.events.N$b;
import com.sentiance.core.model.events.R0$b;
import com.sentiance.core.model.events.ThriftBool;
import com.sentiance.core.model.events.i$c;
import com.sentiance.sdk.DetectionStatus;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.SdkStatus;
import com.sentiance.sdk.trip.TransportMode;
import com.sentiance.sdk.util.Optional;
import io.sentry.util.network.NetworkBody;
import io.socket.parser.IOParser$Decoder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "ThriftUtil")
public class getVerticalAccuracy {
    private final parseLonglambda0 IconCompatParcelizer;
    private final configureFromServerConfiglambda1 RemoteActionCompatParcelizer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI read;
    private final r8lambdaw447glWJfoun4bg91upXnaDQEZs serializer;

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface serializer {
    }

    public static Optional IconCompatParcelizer(Class cls) {
        if (cls == r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class) {
            return Optional.RemoteActionCompatParcelizer(1);
        }
        if (cls == r8lambda6XVpQwK1zU6mm_JruI3tIJroJFc.class) {
            return Optional.RemoteActionCompatParcelizer(2);
        }
        if (cls == r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4.class) {
            return Optional.RemoteActionCompatParcelizer(3);
        }
        if (cls == BrazeBootReceiver.class) {
            return Optional.RemoteActionCompatParcelizer(4);
        }
        if (cls == r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class) {
            return Optional.RemoteActionCompatParcelizer(5);
        }
        if (cls == r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class) {
            return Optional.RemoteActionCompatParcelizer(6);
        }
        if (cls == setShouldPersistWebView.class) {
            return Optional.RemoteActionCompatParcelizer(7);
        }
        if (cls == r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class) {
            return Optional.RemoteActionCompatParcelizer(8);
        }
        if (cls == r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class) {
            return Optional.RemoteActionCompatParcelizer(9);
        }
        if (cls == r8lambdaVny7Iop5thIfAArp93JFD1zIPGQ.class) {
            return Optional.RemoteActionCompatParcelizer(10);
        }
        if (cls == subscribeToBannersDismissedEvent.class) {
            return Optional.RemoteActionCompatParcelizer(11);
        }
        if (cls == handleIncomingIntentlambda0.class) {
            return Optional.RemoteActionCompatParcelizer(12);
        }
        if (cls == r8lambdaStxQZ_kvz8RG4Vu3Rz4SVrEa8Y.class) {
            return Optional.RemoteActionCompatParcelizer(13);
        }
        if (cls == r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI.class) {
            return Optional.RemoteActionCompatParcelizer(14);
        }
        if (cls == BrazeUser.class) {
            return Optional.RemoteActionCompatParcelizer(15);
        }
        if (cls == r8lambdaX8O0CQVGYSvyuZ1ZQ9WvuF9jtM.class) {
            return Optional.RemoteActionCompatParcelizer(16);
        }
        if (cls == r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A.class) {
            return Optional.RemoteActionCompatParcelizer(17);
        }
        if (cls == retryInAppMessage.class) {
            return Optional.RemoteActionCompatParcelizer(18);
        }
        if (cls == requestGeofenceRefresh.class) {
            return Optional.RemoteActionCompatParcelizer(19);
        }
        if (cls == unsubscribeFromBannersDismissedEvent.class) {
            return Optional.RemoteActionCompatParcelizer(20);
        }
        if (cls == onActivityPausedlambda1.class) {
            return Optional.RemoteActionCompatParcelizer(21);
        }
        if (cls == setSessionHandlingBlocklist.class) {
            return Optional.RemoteActionCompatParcelizer(22);
        }
        if (cls == r8lambda7hSNgpBpNnHwzu2sYrBtefYqHlQ.class) {
            return Optional.RemoteActionCompatParcelizer(23);
        }
        if (cls == r8lambdaE7oIx09KQauliA8paOfGanE2_e8.class) {
            return Optional.RemoteActionCompatParcelizer(24);
        }
        if (cls == invokeSuspendlambda0.class) {
            return Optional.RemoteActionCompatParcelizer(25);
        }
        if (cls == addBannerViewMonitor.class) {
            return Optional.RemoteActionCompatParcelizer(26);
        }
        if (cls == refreshBanners.class) {
            return Optional.RemoteActionCompatParcelizer(27);
        }
        if (cls == r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug.class) {
            return Optional.RemoteActionCompatParcelizer(28);
        }
        if (cls == shouldHandleLifecycleMethodsInActivitylambda0.class) {
            return Optional.RemoteActionCompatParcelizer(29);
        }
        if (cls == BrazeActivityLifecycleCallbackListeneronActivityCreated2.class) {
            return Optional.RemoteActionCompatParcelizer(30);
        }
        if (cls == wipeDatalambda0.class) {
            return Optional.RemoteActionCompatParcelizer(31);
        }
        if (cls == handleInAppMessageTestPush.class) {
            return Optional.RemoteActionCompatParcelizer(32);
        }
        if (cls == BrazeInternal.class) {
            return Optional.RemoteActionCompatParcelizer(33);
        }
        if (cls == r8lambdalEIfbdvOx5AiS6eOxkCHNl8OjhA.class) {
            return Optional.RemoteActionCompatParcelizer(34);
        }
        if (cls == setSdkEnablementProviderandroid_sdk_base_release.class) {
            return Optional.RemoteActionCompatParcelizer(35);
        }
        if (cls == getShouldPersistWebView.class) {
            return Optional.RemoteActionCompatParcelizer(36);
        }
        if (cls == addSerializedContentCardToStorage.class) {
            return Optional.RemoteActionCompatParcelizer(37);
        }
        if (cls == deleteRegisteredGeofenceCache.class) {
            return Optional.RemoteActionCompatParcelizer(38);
        }
        if (cls == getDelayedInitializationProviderandroid_sdk_base_release.class) {
            return Optional.RemoteActionCompatParcelizer(39);
        }
        if (cls == shouldHandleLifecycleMethodsInActivity.class) {
            return Optional.RemoteActionCompatParcelizer(40);
        }
        if (cls == registerOnApplication.class) {
            return Optional.RemoteActionCompatParcelizer(41);
        }
        if (cls == setDelayedInitializationProviderandroid_sdk_base_release.class) {
            return Optional.RemoteActionCompatParcelizer(42);
        }
        if (cls == r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs.class) {
            return Optional.RemoteActionCompatParcelizer(43);
        }
        if (cls == onActivityCreatedlambda0.class) {
            return Optional.RemoteActionCompatParcelizer(44);
        }
        if (cls == r8lambdaSfjrR_HlZhgR9qJKoiGmntl4F8o.class) {
            return Optional.RemoteActionCompatParcelizer(45);
        }
        if (cls == r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog.class) {
            return Optional.RemoteActionCompatParcelizer(46);
        }
        if (cls == r8lambdaCZkUcdbCfyQviN9woG5_oLGdyQ.class) {
            return Optional.RemoteActionCompatParcelizer(47);
        }
        if (cls == r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80.class) {
            return Optional.RemoteActionCompatParcelizer(48);
        }
        if (cls == r8lambdaKCKMpEZa9rfzvHaSJhY4hue3sPQ.class) {
            return Optional.RemoteActionCompatParcelizer(49);
        }
        if (cls == r8lambdaGN7c5ha_LrYxg0qpuqGwSIc0Hc.class) {
            return Optional.RemoteActionCompatParcelizer(50);
        }
        if (cls == reenqueueInAppMessage.class) {
            return Optional.RemoteActionCompatParcelizer(51);
        }
        if (cls == r8lambdaVyE3aElBJdrGw6tHJhFdi1NUMg.class) {
            return Optional.RemoteActionCompatParcelizer(52);
        }
        if (cls == handleIncomingIntentlambda2.class) {
            return Optional.RemoteActionCompatParcelizer(53);
        }
        if (cls == recordGeofenceTransition.class) {
            return Optional.RemoteActionCompatParcelizer(54);
        }
        if (cls == r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI.class) {
            return Optional.RemoteActionCompatParcelizer(55);
        }
        if (cls == setStaticExternalIEventMessengerandroid_sdk_base_release.class) {
            return Optional.RemoteActionCompatParcelizer(56);
        }
        if (cls == r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q.class) {
            return Optional.RemoteActionCompatParcelizer(57);
        }
        if (cls == setConfiguredCustomEndpointandroid_sdk_base_release.class) {
            return Optional.RemoteActionCompatParcelizer(58);
        }
        if (cls == onReceivelambda0.class) {
            return Optional.RemoteActionCompatParcelizer(59);
        }
        if (cls == logLocationRecordedEvent.class) {
            return Optional.RemoteActionCompatParcelizer(60);
        }
        if (cls == r8lambda9XibBb_UAwpsuoULwKlfVxtang.class) {
            return Optional.RemoteActionCompatParcelizer(61);
        }
        if (cls == getConfigurationProvider.class) {
            return Optional.RemoteActionCompatParcelizer(62);
        }
        return cls == invokeSuspendlambda1.class ? Optional.RemoteActionCompatParcelizer(63) : Optional.MediaSessionCompatQueueItem();
    }

    public static r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM read(long j) {
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = new r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM();
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.read = Long.valueOf(j);
        return r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm;
    }

    public getVerticalAccuracy(parseLonglambda0 parselonglambda0, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, configureFromServerConfiglambda1 configurefromserverconfiglambda1) {
        this.IconCompatParcelizer = parselonglambda0;
        this.serializer = r8lambdaw447glwjfoun4bg91upxnadqezs;
        this.read = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.RemoteActionCompatParcelizer = configurefromserverconfiglambda1;
    }

    public static Class write(int i) {
        if (i == 1) {
            return r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class;
        }
        if (i == 2) {
            return r8lambda6XVpQwK1zU6mm_JruI3tIJroJFc.class;
        }
        if (i == 3) {
            return r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4.class;
        }
        if (i == 4) {
            return BrazeBootReceiver.class;
        }
        if (i == 5) {
            return r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class;
        }
        if (i == 6) {
            return r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class;
        }
        if (i == 7) {
            return setShouldPersistWebView.class;
        }
        if (i == 8) {
            return r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class;
        }
        if (i == 9) {
            return r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class;
        }
        if (i == 10) {
            return r8lambdaVny7Iop5thIfAArp93JFD1zIPGQ.class;
        }
        if (i == 11) {
            return subscribeToBannersDismissedEvent.class;
        }
        if (i == 12) {
            return handleIncomingIntentlambda0.class;
        }
        if (i == 13) {
            return r8lambdaStxQZ_kvz8RG4Vu3Rz4SVrEa8Y.class;
        }
        if (i == 14) {
            return r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI.class;
        }
        if (i == 15) {
            return BrazeUser.class;
        }
        if (i == 16) {
            return r8lambdaX8O0CQVGYSvyuZ1ZQ9WvuF9jtM.class;
        }
        if (i == 17) {
            return r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A.class;
        }
        if (i == 18) {
            return retryInAppMessage.class;
        }
        if (i == 19) {
            return requestGeofenceRefresh.class;
        }
        if (i == 20) {
            return unsubscribeFromBannersDismissedEvent.class;
        }
        if (i == 21) {
            return onActivityPausedlambda1.class;
        }
        if (i == 22) {
            return setSessionHandlingBlocklist.class;
        }
        if (i == 23) {
            return r8lambda7hSNgpBpNnHwzu2sYrBtefYqHlQ.class;
        }
        if (i == 24) {
            return r8lambdaE7oIx09KQauliA8paOfGanE2_e8.class;
        }
        if (i == 25) {
            return invokeSuspendlambda0.class;
        }
        if (i == 26) {
            return addBannerViewMonitor.class;
        }
        if (i == 27) {
            return refreshBanners.class;
        }
        if (i == 28) {
            return r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug.class;
        }
        if (i == 29) {
            return shouldHandleLifecycleMethodsInActivitylambda0.class;
        }
        if (i == 30) {
            return BrazeActivityLifecycleCallbackListeneronActivityCreated2.class;
        }
        if (i == 31) {
            return wipeDatalambda0.class;
        }
        if (i == 32) {
            return handleInAppMessageTestPush.class;
        }
        if (i == 33) {
            return BrazeInternal.class;
        }
        if (i == 34) {
            return r8lambdalEIfbdvOx5AiS6eOxkCHNl8OjhA.class;
        }
        if (i == 35) {
            return setSdkEnablementProviderandroid_sdk_base_release.class;
        }
        if (i == 36) {
            return getShouldPersistWebView.class;
        }
        if (i == 37) {
            return addSerializedContentCardToStorage.class;
        }
        if (i == 38) {
            return deleteRegisteredGeofenceCache.class;
        }
        if (i == 39) {
            return getDelayedInitializationProviderandroid_sdk_base_release.class;
        }
        if (i == 40) {
            return shouldHandleLifecycleMethodsInActivity.class;
        }
        if (i == 41) {
            return registerOnApplication.class;
        }
        if (i == 42) {
            return setDelayedInitializationProviderandroid_sdk_base_release.class;
        }
        if (i == 43) {
            return r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs.class;
        }
        if (i == 44) {
            return onActivityCreatedlambda0.class;
        }
        if (i == 45) {
            return r8lambdaSfjrR_HlZhgR9qJKoiGmntl4F8o.class;
        }
        if (i == 46) {
            return r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog.class;
        }
        if (i == 47) {
            return r8lambdaCZkUcdbCfyQviN9woG5_oLGdyQ.class;
        }
        if (i == 48) {
            return r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80.class;
        }
        if (i == 49) {
            return r8lambdaKCKMpEZa9rfzvHaSJhY4hue3sPQ.class;
        }
        if (i == 50) {
            return r8lambdaGN7c5ha_LrYxg0qpuqGwSIc0Hc.class;
        }
        if (i == 51) {
            return reenqueueInAppMessage.class;
        }
        if (i == 52) {
            return r8lambdaVyE3aElBJdrGw6tHJhFdi1NUMg.class;
        }
        if (i == 53) {
            return handleIncomingIntentlambda2.class;
        }
        if (i == 54) {
            return recordGeofenceTransition.class;
        }
        if (i == 55) {
            return r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI.class;
        }
        if (i == 56) {
            return setStaticExternalIEventMessengerandroid_sdk_base_release.class;
        }
        if (i == 57) {
            return r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q.class;
        }
        if (i == 58) {
            return setConfiguredCustomEndpointandroid_sdk_base_release.class;
        }
        if (i == 59) {
            return onReceivelambda0.class;
        }
        if (i == 60) {
            return logLocationRecordedEvent.class;
        }
        if (i == 61) {
            return r8lambda9XibBb_UAwpsuoULwKlfVxtang.class;
        }
        if (i == 62) {
            return getConfigurationProvider.class;
        }
        if (i == 63) {
            return invokeSuspendlambda1.class;
        }
        return null;
    }

    public final r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM serializer(long j, String str) {
        return RemoteActionCompatParcelizer(str, j, false, false);
    }

    public final r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM serializer(Throwable th) {
        String stackTraceString = Log.getStackTraceString(th);
        this.read.getClass();
        return RemoteActionCompatParcelizer(stackTraceString, System.currentTimeMillis(), false, false);
    }

    public final r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM write(long j, String str) {
        return RemoteActionCompatParcelizer(str, j, true, true);
    }

    public static r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM write(setConfigurationProvider setconfigurationprovider, Optional optional, Location location, int i, long j) {
        r8lambdaVErYkPFxABVjGz2VB5XGlrkR4_0 r8lambdaverykpfxabvjgz2vb5xglrkr4_0RemoteActionCompatParcelizer;
        if (setconfigurationprovider != null) {
            isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(2);
            iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer = Integer.valueOf((int) (setconfigurationprovider.read * 100000.0d));
            iscontentcardsunreadvisualindicatorenabled.write = Integer.valueOf((int) (setconfigurationprovider.IconCompatParcelizer * 100000.0d));
            iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer = Integer.valueOf((int) setconfigurationprovider.RemoteActionCompatParcelizer);
            iscontentcardsunreadvisualindicatorenabled.read = setconfigurationprovider.MediaDescriptionCompat;
            r8lambdaverykpfxabvjgz2vb5xglrkr4_0RemoteActionCompatParcelizer = iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer();
        } else {
            r8lambdaverykpfxabvjgz2vb5xglrkr4_0RemoteActionCompatParcelizer = null;
        }
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4Serializer = location != null ? serializer(location) : null;
        C$b c$b = new C$b();
        c$b.write = r8lambdaverykpfxabvjgz2vb5xglrkr4_0RemoteActionCompatParcelizer;
        c$b.serializer = Byte.valueOf((byte) i);
        c$b.IconCompatParcelizer = brazeCompanionExternalSyntheticLambda4Serializer;
        r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu = new r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU(c$b);
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = read(j);
        if (optional.IconCompatParcelizer()) {
            r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.IconCompatParcelizer = (Integer) optional.write();
        }
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.getOnBackPressedInput = r8lambdazeccixubf3xvz58yt5bojkwhdu;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        return r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm;
    }

    public static r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM IconCompatParcelizer(Location location, long j, Optional optional) {
        r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk r8lambdamlvle2kr5fvc3vtodzmadfjxk = new r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk();
        r8lambdamlvle2kr5fvc3vtodzmadfjxk.write = serializer(location);
        r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku = new r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU(r8lambdamlvle2kr5fvc3vtodzmadfjxk);
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = read(j);
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.IconCompatParcelizer = (Integer) optional.write();
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = r8lambdaibd0azdffjr6m_pevs2l1iejku;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        return r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm;
    }

    public final r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM read(long j, String str) {
        return RemoteActionCompatParcelizer(str, j, true, false);
    }

    private r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM RemoteActionCompatParcelizer(String str, long j, boolean z, boolean z2) {
        isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(1);
        if (str != null) {
            iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer = str;
            this.RemoteActionCompatParcelizer.getClass();
            iscontentcardsunreadvisualindicatorenabled.write = Boolean.valueOf(Debug.isDebuggerConnected());
            iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer = Boolean.valueOf(!z);
            iscontentcardsunreadvisualindicatorenabled.read = Boolean.valueOf(z2);
            if (((String) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer) != null) {
                r8lambdaStxQZ_kvz8RG4Vu3Rz4SVrEa8Y r8lambdastxqz_kvz8rg4vu3rz4svrea8y = new r8lambdaStxQZ_kvz8RG4Vu3Rz4SVrEa8Y(iscontentcardsunreadvisualindicatorenabled);
                r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = read(j);
                r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
                r8lambdaromdixahini0blcevvl7ehebhj0.onBackPressedDispatcher_delegatelambda0 = r8lambdastxqz_kvz8rg4vu3rz4svrea8y;
                r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
                return r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'stacktrace' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'stacktrace' cannot be null");
        return null;
    }

    @SuppressLint
    public static r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM cj_(long j, ApplicationExitInfo applicationExitInfo, boolean z) {
        byte b;
        if (applicationExitInfo == null) {
            return IconCompatParcelizer(j, (validateAndStorePushId) null, z);
        }
        C$b c$b = new C$b();
        switch (applicationExitInfo.getReason()) {
            case 1:
                b = 1;
                break;
            case 2:
                b = 2;
                break;
            case 3:
                b = 3;
                break;
            case 4:
                b = 4;
                break;
            case 5:
                b = 5;
                break;
            case 6:
                b = 6;
                break;
            case 7:
                b = 7;
                break;
            case 8:
                b = 8;
                break;
            case 9:
                b = 9;
                break;
            case 10:
                b = 10;
                break;
            case 11:
                b = 11;
                break;
            case 12:
                b = 12;
                break;
            case 13:
                b = 13;
                break;
            default:
                b = 0;
                break;
        }
        c$b.write = Byte.valueOf(b);
        c$b.serializer = Long.valueOf(applicationExitInfo.getTimestamp());
        c$b.IconCompatParcelizer = applicationExitInfo.getDescription();
        return IconCompatParcelizer(j, c$b.serializer(), z);
    }

    private static r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM IconCompatParcelizer(long j, validateAndStorePushId validateandstorepushid, boolean z) {
        IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
        iOParser$Decoder.RemoteActionCompatParcelizer = validateandstorepushid;
        iOParser$Decoder.read = Boolean.valueOf(z);
        addBannerViewMonitor addbannerviewmonitor = new addBannerViewMonitor(iOParser$Decoder);
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = read(j);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.getDefaultViewModelProviderFactory = addbannerviewmonitor;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        return r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm;
    }

    public final r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM write(Byte b, Byte b2, byte b3, long j) {
        C$b c$b = new C$b();
        c$b.write = b;
        c$b.IconCompatParcelizer = b2;
        c$b.serializer = Byte.valueOf(b3);
        r8lambdaX8O0CQVGYSvyuZ1ZQ9WvuF9jtM r8lambdax8o0cqvgysvyuz1zq9wvuf9jtm = new r8lambdaX8O0CQVGYSvyuZ1ZQ9WvuF9jtM(c$b);
        this.IconCompatParcelizer.IconCompatParcelizer(String.valueOf(r8lambdax8o0cqvgysvyuz1zq9wvuf9jtm), new Object[0]);
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = read(j);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.addMenuProvider = r8lambdax8o0cqvgysvyuz1zq9wvuf9jtm;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        return r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm;
    }

    public final r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM write(r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug r8lambdafjifijxjxuf3vopuwrut7txivug, long j) {
        this.IconCompatParcelizer.IconCompatParcelizer(String.valueOf(r8lambdafjifijxjxuf3vopuwrut7txivug), new Object[0]);
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = read(j);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.read = r8lambdafjifijxjxuf3vopuwrut7txivug;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        return r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm;
    }

    public static r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k write(r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsu) {
        r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwa = r8lambdaqtf70aj7a5o7b4yj33reyelsu.serializer;
        r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (r8lambdaibd0azdffjr6m_pevs2l1iejku != null) {
            return r8lambdaibd0azdffjr6m_pevs2l1iejku;
        }
        r8lambda6XVpQwK1zU6mm_JruI3tIJroJFc r8lambda6xvpqwk1zu6mm_jrui3tijrojfc = r8lambdaturwertf3otevz1wenzex5tdwa._init_lambda4;
        if (r8lambda6xvpqwk1zu6mm_jrui3tijrojfc != null) {
            return r8lambda6xvpqwk1zu6mm_jrui3tijrojfc;
        }
        r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4 r8lambdaqoq3wl0ry1sjdgdfdxhrnvb36l4 = r8lambdaturwertf3otevz1wenzex5tdwa._init_lambda2;
        if (r8lambdaqoq3wl0ry1sjdgdfdxhrnvb36l4 != null) {
            return r8lambdaqoq3wl0ry1sjdgdfdxhrnvb36l4;
        }
        BrazeBootReceiver brazeBootReceiver = r8lambdaturwertf3otevz1wenzex5tdwa._init_lambda3;
        if (brazeBootReceiver != null) {
            return brazeBootReceiver;
        }
        r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A r8lambdadtwa3yx1e9cvszaagaemidzvt8a = r8lambdaturwertf3otevz1wenzex5tdwa.addObserverForBackInvoker;
        if (r8lambdadtwa3yx1e9cvszaagaemidzvt8a != null) {
            return r8lambdadtwa3yx1e9cvszaagaemidzvt8a;
        }
        r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg r8lambdaqgihof_5nhjpnmm9fgnt61b4dmg = r8lambdaturwertf3otevz1wenzex5tdwa.ensureViewModelStore;
        if (r8lambdaqgihof_5nhjpnmm9fgnt61b4dmg != null) {
            return r8lambdaqgihof_5nhjpnmm9fgnt61b4dmg;
        }
        setShouldPersistWebView setshouldpersistwebview = r8lambdaturwertf3otevz1wenzex5tdwa.menuHostHelperlambda0;
        if (setshouldpersistwebview != null) {
            return setshouldpersistwebview;
        }
        r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I r8lambdaxnkp5mxo9act549dmvgqnyhj0i = r8lambdaturwertf3otevz1wenzex5tdwa.getSavedStateRegistryControllerannotations;
        if (r8lambdaxnkp5mxo9act549dmvgqnyhj0i != null) {
            return r8lambdaxnkp5mxo9act549dmvgqnyhj0i;
        }
        r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu = r8lambdaturwertf3otevz1wenzex5tdwa.fullyDrawnReporter_delegatelambda0;
        if (r8lambdazeccixubf3xvz58yt5bojkwhdu != null) {
            return r8lambdazeccixubf3xvz58yt5bojkwhdu;
        }
        r8lambdaVny7Iop5thIfAArp93JFD1zIPGQ r8lambdavny7iop5thifaarp93jfd1zipgq = r8lambdaturwertf3otevz1wenzex5tdwa.onBackPressedDispatcher_delegatelambda010;
        if (r8lambdavny7iop5thifaarp93jfd1zipgq != null) {
            return r8lambdavny7iop5thifaarp93jfd1zipgq;
        }
        subscribeToBannersDismissedEvent subscribetobannersdismissedevent = r8lambdaturwertf3otevz1wenzex5tdwa.onBackPressedDispatcher_delegatelambda00;
        if (subscribetobannersdismissedevent != null) {
            return subscribetobannersdismissedevent;
        }
        handleIncomingIntentlambda0 handleincomingintentlambda0 = r8lambdaturwertf3otevz1wenzex5tdwa.addOnMultiWindowModeChangedListener;
        if (handleincomingintentlambda0 != null) {
            return handleincomingintentlambda0;
        }
        r8lambdaStxQZ_kvz8RG4Vu3Rz4SVrEa8Y r8lambdastxqz_kvz8rg4vu3rz4svrea8y = r8lambdaturwertf3otevz1wenzex5tdwa.addOnContextAvailableListener;
        if (r8lambdastxqz_kvz8rg4vu3rz4svrea8y != null) {
            return r8lambdastxqz_kvz8rg4vu3rz4svrea8y;
        }
        r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI r8lambdarsln0n_71nx5fiy5yo7knsgyi = r8lambdaturwertf3otevz1wenzex5tdwa.addOnNewIntentListener;
        if (r8lambdarsln0n_71nx5fiy5yo7knsgyi != null) {
            return r8lambdarsln0n_71nx5fiy5yo7knsgyi;
        }
        BrazeUser brazeUser = r8lambdaturwertf3otevz1wenzex5tdwa.addMenuProvider;
        if (brazeUser != null) {
            return brazeUser;
        }
        r8lambdaX8O0CQVGYSvyuZ1ZQ9WvuF9jtM r8lambdax8o0cqvgysvyuz1zq9wvuf9jtm = r8lambdaturwertf3otevz1wenzex5tdwa.addOnConfigurationChangedListener;
        if (r8lambdax8o0cqvgysvyuz1zq9wvuf9jtm != null) {
            return r8lambdax8o0cqvgysvyuz1zq9wvuf9jtm;
        }
        r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A r8lambda2l1vxswbmfutp9a4iejxpq7zf7a = r8lambdaturwertf3otevz1wenzex5tdwa.enterPictureInPictureMode;
        if (r8lambda2l1vxswbmfutp9a4iejxpq7zf7a != null) {
            return r8lambda2l1vxswbmfutp9a4iejxpq7zf7a;
        }
        retryInAppMessage retryinappmessage = r8lambdaturwertf3otevz1wenzex5tdwa.addOnPictureInPictureUiStateChangedListener;
        if (retryinappmessage != null) {
            return retryinappmessage;
        }
        requestGeofenceRefresh requestgeofencerefresh = r8lambdaturwertf3otevz1wenzex5tdwa.addOnPictureInPictureModeChangedListener;
        if (requestgeofencerefresh != null) {
            return requestgeofencerefresh;
        }
        unsubscribeFromBannersDismissedEvent unsubscribefrombannersdismissedevent = r8lambdaturwertf3otevz1wenzex5tdwa.addOnUserLeaveHintListener;
        if (unsubscribefrombannersdismissedevent != null) {
            return unsubscribefrombannersdismissedevent;
        }
        onActivityPausedlambda1 onactivitypausedlambda1 = r8lambdaturwertf3otevz1wenzex5tdwa.addOnTrimMemoryListener;
        if (onactivitypausedlambda1 != null) {
            return onactivitypausedlambda1;
        }
        setSessionHandlingBlocklist setsessionhandlingblocklist = r8lambdaturwertf3otevz1wenzex5tdwa.getDefaultViewModelProviderFactory;
        if (setsessionhandlingblocklist != null) {
            return setsessionhandlingblocklist;
        }
        r8lambda7hSNgpBpNnHwzu2sYrBtefYqHlQ r8lambda7hsngpbpnnhwzu2syrbtefyqhlq = r8lambdaturwertf3otevz1wenzex5tdwa.getDefaultViewModelCreationExtras;
        if (r8lambda7hsngpbpnnhwzu2syrbtefyqhlq != null) {
            return r8lambda7hsngpbpnnhwzu2syrbtefyqhlq;
        }
        r8lambdaE7oIx09KQauliA8paOfGanE2_e8 r8lambdae7oix09kqaulia8paofgane2_e8 = r8lambdaturwertf3otevz1wenzex5tdwa.getActivityResultRegistry;
        if (r8lambdae7oix09kqaulia8paofgane2_e8 != null) {
            return r8lambdae7oix09kqaulia8paofgane2_e8;
        }
        invokeSuspendlambda0 invokesuspendlambda0 = r8lambdaturwertf3otevz1wenzex5tdwa.getFullyDrawnReporter;
        if (invokesuspendlambda0 != null) {
            return invokesuspendlambda0;
        }
        addBannerViewMonitor addbannerviewmonitor = r8lambdaturwertf3otevz1wenzex5tdwa.IconCompatParcelizer;
        if (addbannerviewmonitor != null) {
            return addbannerviewmonitor;
        }
        refreshBanners refreshbanners = r8lambdaturwertf3otevz1wenzex5tdwa.write;
        if (refreshbanners != null) {
            return refreshbanners;
        }
        r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug r8lambdafjifijxjxuf3vopuwrut7txivug = r8lambdaturwertf3otevz1wenzex5tdwa.serializer;
        if (r8lambdafjifijxjxuf3vopuwrut7txivug != null) {
            return r8lambdafjifijxjxuf3vopuwrut7txivug;
        }
        shouldHandleLifecycleMethodsInActivitylambda0 shouldhandlelifecyclemethodsinactivitylambda0 = r8lambdaturwertf3otevz1wenzex5tdwa.read;
        if (shouldhandlelifecyclemethodsinactivitylambda0 != null) {
            return shouldhandlelifecyclemethodsinactivitylambda0;
        }
        BrazeActivityLifecycleCallbackListeneronActivityCreated2 brazeActivityLifecycleCallbackListeneronActivityCreated2 = r8lambdaturwertf3otevz1wenzex5tdwa.MediaDescriptionCompat;
        if (brazeActivityLifecycleCallbackListeneronActivityCreated2 != null) {
            return brazeActivityLifecycleCallbackListeneronActivityCreated2;
        }
        wipeDatalambda0 wipedatalambda0 = r8lambdaturwertf3otevz1wenzex5tdwa.MediaBrowserCompatMediaItem;
        if (wipedatalambda0 != null) {
            return wipedatalambda0;
        }
        handleInAppMessageTestPush handleinappmessagetestpush = r8lambdaturwertf3otevz1wenzex5tdwa.MediaSessionCompatQueueItem;
        if (handleinappmessagetestpush != null) {
            return handleinappmessagetestpush;
        }
        BrazeInternal brazeInternal = r8lambdaturwertf3otevz1wenzex5tdwa.MediaMetadataCompat;
        if (brazeInternal != null) {
            return brazeInternal;
        }
        r8lambdalEIfbdvOx5AiS6eOxkCHNl8OjhA r8lambdaleifbdvox5ais6eoxkchnl8ojha = r8lambdaturwertf3otevz1wenzex5tdwa.RatingCompat;
        if (r8lambdaleifbdvox5ais6eoxkchnl8ojha != null) {
            return r8lambdaleifbdvox5ais6eoxkchnl8ojha;
        }
        setSdkEnablementProviderandroid_sdk_base_release setsdkenablementproviderandroid_sdk_base_release = r8lambdaturwertf3otevz1wenzex5tdwa.PlaybackStateCompat;
        if (setsdkenablementproviderandroid_sdk_base_release != null) {
            return setsdkenablementproviderandroid_sdk_base_release;
        }
        getShouldPersistWebView getshouldpersistwebview = r8lambdaturwertf3otevz1wenzex5tdwa.PlaybackStateCompatCustomAction;
        if (getshouldpersistwebview != null) {
            return getshouldpersistwebview;
        }
        addSerializedContentCardToStorage addserializedcontentcardtostorage = r8lambdaturwertf3otevz1wenzex5tdwa.MediaSessionCompatResultReceiverWrapper;
        if (addserializedcontentcardtostorage != null) {
            return addserializedcontentcardtostorage;
        }
        deleteRegisteredGeofenceCache deleteregisteredgeofencecache = r8lambdaturwertf3otevz1wenzex5tdwa.MediaSessionCompatToken;
        if (deleteregisteredgeofencecache != null) {
            return deleteregisteredgeofencecache;
        }
        getDelayedInitializationProviderandroid_sdk_base_release getdelayedinitializationproviderandroid_sdk_base_release = r8lambdaturwertf3otevz1wenzex5tdwa.ParcelableVolumeInfo;
        if (getdelayedinitializationproviderandroid_sdk_base_release != null) {
            return getdelayedinitializationproviderandroid_sdk_base_release;
        }
        shouldHandleLifecycleMethodsInActivity shouldhandlelifecyclemethodsinactivity = r8lambdaturwertf3otevz1wenzex5tdwa.ComponentActivity;
        if (shouldhandlelifecyclemethodsinactivity != null) {
            return shouldhandlelifecyclemethodsinactivity;
        }
        registerOnApplication registeronapplication = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (registeronapplication != null) {
            return registeronapplication;
        }
        setDelayedInitializationProviderandroid_sdk_base_release setdelayedinitializationproviderandroid_sdk_base_release = r8lambdaturwertf3otevz1wenzex5tdwa.ResultReceiver;
        if (setdelayedinitializationproviderandroid_sdk_base_release != null) {
            return setdelayedinitializationproviderandroid_sdk_base_release;
        }
        r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs r8lambdavyxnhk9sdraxwugvbef6izzxids = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (r8lambdavyxnhk9sdraxwugvbef6izzxids != null) {
            return r8lambdavyxnhk9sdraxwugvbef6izzxids;
        }
        onActivityCreatedlambda0 onactivitycreatedlambda0 = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (onactivitycreatedlambda0 != null) {
            return onactivitycreatedlambda0;
        }
        r8lambdaSfjrR_HlZhgR9qJKoiGmntl4F8o r8lambdasfjrr_hlzhgr9qjkoigmntl4f8o = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (r8lambdasfjrr_hlzhgr9qjkoigmntl4f8o != null) {
            return r8lambdasfjrr_hlzhgr9qjkoigmntl4f8o;
        }
        r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog r8lambdaqoukgs6h1gfby4ttokxnao8yog = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (r8lambdaqoukgs6h1gfby4ttokxnao8yog != null) {
            return r8lambdaqoukgs6h1gfby4ttokxnao8yog;
        }
        r8lambdaCZkUcdbCfyQviN9woG5_oLGdyQ r8lambdaczkucdbcfyqvin9wog5_olgdyq = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (r8lambdaczkucdbcfyqvin9wog5_olgdyq != null) {
            return r8lambdaczkucdbcfyqvin9wog5_olgdyq;
        }
        r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80 r8lambdaf8wsytxo3nnbajq7v_hfblwn80 = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        if (r8lambdaf8wsytxo3nnbajq7v_hfblwn80 != null) {
            return r8lambdaf8wsytxo3nnbajq7v_hfblwn80;
        }
        r8lambdaKCKMpEZa9rfzvHaSJhY4hue3sPQ r8lambdakckmpeza9rfzvhasjhy4hue3spq = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (r8lambdakckmpeza9rfzvhasjhy4hue3spq != null) {
            return r8lambdakckmpeza9rfzvhasjhy4hue3spq;
        }
        r8lambdaGN7c5ha_LrYxg0qpuqGwSIc0Hc r8lambdagn7c5ha_lryxg0qpuqgwsic0hc = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        if (r8lambdagn7c5ha_lryxg0qpuqgwsic0hc != null) {
            return r8lambdagn7c5ha_lryxg0qpuqgwsic0hc;
        }
        reenqueueInAppMessage reenqueueinappmessage = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        if (reenqueueinappmessage != null) {
            return reenqueueinappmessage;
        }
        r8lambdaVyE3aElBJdrGw6tHJhFdi1NUMg r8lambdavye3aelbjdrgw6thjhfdi1numg = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        if (r8lambdavye3aelbjdrgw6thjhfdi1numg != null) {
            return r8lambdavye3aelbjdrgw6thjhfdi1numg;
        }
        handleIncomingIntentlambda2 handleincomingintentlambda2 = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (handleincomingintentlambda2 != null) {
            return handleincomingintentlambda2;
        }
        recordGeofenceTransition recordgeofencetransition = r8lambdaturwertf3otevz1wenzex5tdwa.accessensureViewModelStore;
        if (recordgeofencetransition != null) {
            return recordgeofencetransition;
        }
        r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI r8lambdanpc69wzeqaei66oxsnhlebhusqi = r8lambdaturwertf3otevz1wenzex5tdwa._init_lambda1;
        if (r8lambdanpc69wzeqaei66oxsnhlebhusqi != null) {
            return r8lambdanpc69wzeqaei66oxsnhlebhusqi;
        }
        setStaticExternalIEventMessengerandroid_sdk_base_release setstaticexternalieventmessengerandroid_sdk_base_release = r8lambdaturwertf3otevz1wenzex5tdwa.defaultViewModelProviderFactory_delegatelambda0;
        if (setstaticexternalieventmessengerandroid_sdk_base_release != null) {
            return setstaticexternalieventmessengerandroid_sdk_base_release;
        }
        r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q r8lambdak6izilh9v8ert5zk67d8tg0vc8q = r8lambdaturwertf3otevz1wenzex5tdwa.addObserverForBackInvokerlambda0;
        if (r8lambdak6izilh9v8ert5zk67d8tg0vc8q != null) {
            return r8lambdak6izilh9v8ert5zk67d8tg0vc8q;
        }
        setConfiguredCustomEndpointandroid_sdk_base_release setconfiguredcustomendpointandroid_sdk_base_release = r8lambdaturwertf3otevz1wenzex5tdwa.createFullyDrawnExecutor;
        if (setconfiguredcustomendpointandroid_sdk_base_release != null) {
            return setconfiguredcustomendpointandroid_sdk_base_release;
        }
        onReceivelambda0 onreceivelambda0 = r8lambdaturwertf3otevz1wenzex5tdwa.fullyDrawnReporter_delegatelambda00;
        if (onreceivelambda0 != null) {
            return onreceivelambda0;
        }
        logLocationRecordedEvent loglocationrecordedevent = r8lambdaturwertf3otevz1wenzex5tdwa.getOnBackPressedInput;
        if (loglocationrecordedevent != null) {
            return loglocationrecordedevent;
        }
        r8lambda9XibBb_UAwpsuoULwKlfVxtang r8lambda9xibbb_uawpsuoulwklfvxtang = r8lambdaturwertf3otevz1wenzex5tdwa.onBackPressedDispatcher_delegatelambda0;
        if (r8lambda9xibbb_uawpsuoulwklfvxtang != null) {
            return r8lambda9xibbb_uawpsuoulwklfvxtang;
        }
        getConfigurationProvider getconfigurationprovider = r8lambdaturwertf3otevz1wenzex5tdwa.addContentView;
        if (getconfigurationprovider != null) {
            return getconfigurationprovider;
        }
        invokeSuspendlambda1 invokesuspendlambda1 = r8lambdaturwertf3otevz1wenzex5tdwa.onBackPressedInput_delegatelambda0;
        if (invokesuspendlambda1 != null) {
            return invokesuspendlambda1;
        }
        return null;
    }

    public final r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM write(HashMap map, byte b, long j) {
        H$b h$b = new H$b(29);
        h$b.serializer = map;
        h$b.write = Byte.valueOf(b);
        shouldHandleLifecycleMethodsInActivitylambda0 shouldhandlelifecyclemethodsinactivitylambda0 = h$b.read();
        this.IconCompatParcelizer.IconCompatParcelizer(String.valueOf(shouldhandlelifecyclemethodsinactivitylambda0), new Object[0]);
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = read(j);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.write = shouldhandlelifecyclemethodsinactivitylambda0;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        return r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm;
    }

    public final r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM IconCompatParcelizer(BrazeInternal brazeInternal, long j) {
        this.IconCompatParcelizer.IconCompatParcelizer(String.valueOf(brazeInternal), new Object[0]);
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = read(j);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.MediaBrowserCompatMediaItem = brazeInternal;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        return r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm;
    }

    public final r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM serializer(Location location, byte b, long j) {
        NetworkBody networkBody = new NetworkBody(10);
        if (location != null) {
            networkBody.IconCompatParcelizer = serializer(location);
        }
        networkBody.RemoteActionCompatParcelizer = Byte.valueOf(b);
        setSdkEnablementProviderandroid_sdk_base_release setsdkenablementproviderandroid_sdk_base_release = new setSdkEnablementProviderandroid_sdk_base_release(networkBody);
        this.IconCompatParcelizer.IconCompatParcelizer(String.valueOf(setsdkenablementproviderandroid_sdk_base_release), new Object[0]);
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = read(j);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.MediaDescriptionCompat = setsdkenablementproviderandroid_sdk_base_release;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        return r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm;
    }

    public final r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM RemoteActionCompatParcelizer(Map<String, String> map, long j) {
        R0$b r0$b = new R0$b();
        r0$b.read = map;
        getShouldPersistWebView getshouldpersistwebview = new getShouldPersistWebView(r0$b);
        this.IconCompatParcelizer.IconCompatParcelizer(String.valueOf(getshouldpersistwebview), new Object[0]);
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = read(j);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.RatingCompat = getshouldpersistwebview;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        return r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm;
    }

    public static publishBrazePushAction IconCompatParcelizer(DetectionStatus detectionStatus, SdkStatus.QuotaStatus quotaStatus, SdkStatus.QuotaStatus quotaStatus2, SdkStatus.QuotaStatus quotaStatus3, boolean z, int i, Long l, boolean z2) {
        r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q r8lambdabirsljoagmyxhikohl5z5hht12q = new r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q();
        int i2 = getAccuracy.read[detectionStatus.ordinal()];
        byte b = 1;
        if (i2 != 1) {
            b = 2;
            if (i2 != 2) {
                b = 3;
                if (i2 != 3) {
                    b = 4;
                }
            }
        }
        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaDescriptionCompat = Byte.valueOf(b);
        r8lambdabirsljoagmyxhikohl5z5hht12q.serializer = write(quotaStatus);
        r8lambdabirsljoagmyxhikohl5z5hht12q.RemoteActionCompatParcelizer = write(quotaStatus2);
        r8lambdabirsljoagmyxhikohl5z5hht12q.IconCompatParcelizer = write(quotaStatus3);
        r8lambdabirsljoagmyxhikohl5z5hht12q.write = serializer(Boolean.valueOf(z));
        r8lambdabirsljoagmyxhikohl5z5hht12q.read = Integer.valueOf(i);
        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaMetadataCompat = l;
        r8lambdabirsljoagmyxhikohl5z5hht12q.RatingCompat = z2 ? ThriftBool.TRUE : ThriftBool.FALSE;
        return r8lambdabirsljoagmyxhikohl5z5hht12q.serializer();
    }

    public static logPushCampaign RemoteActionCompatParcelizer(SdkStatus.LocationPermission locationPermission, boolean z, boolean z2, Boolean bool, Boolean bool2, Boolean bool3, Byte b) {
        byte b2;
        i$c i_c = new i$c(0);
        int i = getAccuracy.write[locationPermission.ordinal()];
        if (i == 1) {
            b2 = (byte) 4;
        } else if (i != 2) {
            b2 = (byte) 3;
        } else {
            b2 = (byte) 5;
        }
        i_c.write = b2;
        ThriftBool thriftBoolSerializer = serializer(Boolean.valueOf(z));
        if (thriftBoolSerializer != null) {
            i_c.IconCompatParcelizer = thriftBoolSerializer;
            ThriftBool thriftBoolSerializer2 = serializer(Boolean.valueOf(z2));
            if (thriftBoolSerializer2 != null) {
                i_c.serializer = thriftBoolSerializer2;
                i_c.RemoteActionCompatParcelizer = serializer(bool);
                i_c.read = serializer(bool2);
                i_c.RatingCompat = serializer(bool3);
                i_c.MediaMetadataCompat = b;
                return i_c.IconCompatParcelizer();
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'is_activity_recognition_permission_granted' cannot be null");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'is_precise_location_permission_granted' cannot be null");
        return null;
    }

    public static r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I RemoteActionCompatParcelizer(boolean z, boolean z2, boolean z3, onActivityPausedlambda0 onactivitypausedlambda0, registerOnApplicationlambda0 registeronapplicationlambda0, ArrayList arrayList, boolean z4, boolean z5, boolean z6) {
        r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q r8lambdabirsljoagmyxhikohl5z5hht12q = new r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q();
        ThriftBool thriftBoolSerializer = serializer(Boolean.valueOf(z));
        if (thriftBoolSerializer != null) {
            r8lambdabirsljoagmyxhikohl5z5hht12q.serializer = thriftBoolSerializer;
            ThriftBool thriftBoolSerializer2 = serializer(Boolean.valueOf(z2));
            if (thriftBoolSerializer2 != null) {
                r8lambdabirsljoagmyxhikohl5z5hht12q.IconCompatParcelizer = thriftBoolSerializer2;
                ThriftBool thriftBoolSerializer3 = serializer(Boolean.valueOf(z3));
                if (thriftBoolSerializer3 != null) {
                    r8lambdabirsljoagmyxhikohl5z5hht12q.write = thriftBoolSerializer3;
                    r8lambdabirsljoagmyxhikohl5z5hht12q.read = onactivitypausedlambda0;
                    r8lambdabirsljoagmyxhikohl5z5hht12q.MediaMetadataCompat = registeronapplicationlambda0;
                    r8lambdabirsljoagmyxhikohl5z5hht12q.RemoteActionCompatParcelizer = arrayList;
                    r8lambdabirsljoagmyxhikohl5z5hht12q.MediaSessionCompatQueueItem = serializer(Boolean.valueOf(z4));
                    r8lambdabirsljoagmyxhikohl5z5hht12q.MediaBrowserCompatMediaItem = serializer(Boolean.valueOf(z5));
                    r8lambdabirsljoagmyxhikohl5z5hht12q.MediaDescriptionCompat = serializer(Boolean.valueOf(z6));
                    return r8lambdabirsljoagmyxhikohl5z5hht12q.RemoteActionCompatParcelizer();
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'is_device_power_saving_mode_enabled' cannot be null");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'is_gyroscope_available' cannot be null");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'is_accelerometer_available' cannot be null");
        return null;
    }

    public static r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM RemoteActionCompatParcelizer(String str, byte b, HashMap map, String str2, long j) {
        N$b n$b = new N$b();
        n$b.read = str;
        n$b.IconCompatParcelizer = Byte.valueOf(b);
        n$b.serializer = map;
        n$b.write = str2;
        onActivityCreatedlambda0 onactivitycreatedlambda0RemoteActionCompatParcelizer = n$b.RemoteActionCompatParcelizer();
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = read(j);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = onactivitycreatedlambda0RemoteActionCompatParcelizer;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        return r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm;
    }

    public final r8lambda0MdKuROsXEIrniGHcQsvY2A8sFY write(Short sh) {
        r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer = this.serializer.write().RemoteActionCompatParcelizer();
        if (r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer == null) {
            return null;
        }
        N$b n$b = new N$b();
        n$b.read = r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer.serializer();
        n$b.write = "6.27.1";
        n$b.IconCompatParcelizer = (byte) 1;
        n$b.serializer = sh;
        return n$b.serializer();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static BrazeCompanionExternalSyntheticLambda4 serializer(Location location) {
        byte b;
        byte b2 = -1;
        I$b i$b = new I$b(0);
        i$b.IconCompatParcelizer = Long.valueOf(location.getTime());
        i$b.read = Integer.valueOf((int) (location.getLatitude() * 100000.0d));
        i$b.serializer = Integer.valueOf((int) (location.getLongitude() * 100000.0d));
        String provider = location.getProvider();
        provider.getClass();
        switch (provider.hashCode()) {
            case -792039641:
                if (provider.equals("passive")) {
                    b2 = 0;
                }
                break;
            case 102570:
                if (provider.equals("gps")) {
                    b2 = 1;
                }
                break;
            case 97798435:
                if (provider.equals("fused")) {
                    b2 = 2;
                }
                break;
            case 1843485230:
                if (provider.equals("network")) {
                    b2 = 3;
                }
                break;
        }
        if (b2 == 0) {
            b = (byte) 3;
        } else if (b2 == 1) {
            b = (byte) 1;
        } else if (b2 == 2) {
            b = (byte) 4;
        } else if (b2 != 3) {
            b = (byte) 8;
        } else {
            b = (byte) 2;
        }
        i$b.MediaSessionCompatQueueItem = b;
        if (location.hasAccuracy()) {
            i$b.write = Short.valueOf((short) location.getAccuracy());
        } else {
            i$b.write = (short) -1;
        }
        if (location.hasAltitude()) {
            i$b.MediaDescriptionCompat = Short.valueOf((short) location.getAltitude());
        } else {
            i$b.MediaDescriptionCompat = (short) -1;
        }
        if (location.hasBearing()) {
            i$b.RatingCompat = Short.valueOf((short) location.getBearing());
        } else {
            i$b.RatingCompat = (short) -1;
        }
        if (location.hasSpeed()) {
            i$b.MediaMetadataCompat = Short.valueOf((short) location.getSpeed());
            i$b.MediaBrowserCompatMediaItem = Short.valueOf((short) Math.min(32767.0f, location.getSpeed() * 100.0f));
        } else {
            i$b.MediaMetadataCompat = (short) -1;
            i$b.MediaBrowserCompatMediaItem = (short) -1;
        }
        if (location.hasVerticalAccuracy()) {
            i$b.RemoteActionCompatParcelizer = Short.valueOf((short) location.getVerticalAccuracyMeters());
        } else {
            i$b.RemoteActionCompatParcelizer = (short) -1;
        }
        if (location.hasBearingAccuracy()) {
            i$b.MediaSessionCompatResultReceiverWrapper = Short.valueOf((short) (location.getBearingAccuracyDegrees() * 100.0f));
        } else {
            i$b.MediaSessionCompatResultReceiverWrapper = null;
        }
        if (location.hasSpeedAccuracy()) {
            i$b.PlaybackStateCompat = Short.valueOf((short) Math.min(32767.0f, location.getSpeedAccuracyMetersPerSecond() * 100.0f));
        } else {
            i$b.PlaybackStateCompat = null;
        }
        return i$b.read();
    }

    public static Location write(BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4) {
        String str;
        Byte b = brazeCompanionExternalSyntheticLambda4.MediaDescriptionCompat;
        Short sh = brazeCompanionExternalSyntheticLambda4.MediaSessionCompatQueueItem;
        Short sh2 = brazeCompanionExternalSyntheticLambda4.RatingCompat;
        Short sh3 = brazeCompanionExternalSyntheticLambda4.PlaybackStateCompatCustomAction;
        Short sh4 = brazeCompanionExternalSyntheticLambda4.MediaMetadataCompat;
        Short sh5 = brazeCompanionExternalSyntheticLambda4.MediaBrowserCompatMediaItem;
        Short sh6 = brazeCompanionExternalSyntheticLambda4.serializer;
        byte bByteValue = b.byteValue();
        if (bByteValue == 1) {
            str = "gps";
        } else if (bByteValue == 2) {
            str = "network";
        } else if (bByteValue == 3) {
            str = "passive";
        } else if (bByteValue != 4) {
            str = "other";
        } else {
            str = "fused";
        }
        Location location = new Location(str);
        location.setLatitude(((double) brazeCompanionExternalSyntheticLambda4.read.intValue()) / 100000.0d);
        location.setLongitude(((double) brazeCompanionExternalSyntheticLambda4.write.intValue()) / 100000.0d);
        location.setTime(brazeCompanionExternalSyntheticLambda4.RemoteActionCompatParcelizer.longValue());
        if (sh6 != null && sh6.shortValue() >= 0) {
            location.setAccuracy(sh6.shortValue());
        }
        if (sh5 != null && sh5.shortValue() >= 0) {
            location.setAltitude(sh5.shortValue());
        }
        if (sh4 != null && sh4.shortValue() >= 0) {
            location.setBearing(sh4.shortValue());
        }
        if (sh3 != null && sh3.shortValue() >= 0) {
            location.setSpeed(sh3.shortValue() / 100.0f);
        } else if (sh2 != null && sh2.shortValue() >= 0) {
            location.setSpeed(sh2.shortValue());
        }
        if (sh != null && sh.shortValue() >= 0) {
            location.setVerticalAccuracyMeters(sh.shortValue());
        }
        Short sh7 = brazeCompanionExternalSyntheticLambda4.ParcelableVolumeInfo;
        if (sh7 != null) {
            location.setBearingAccuracyDegrees(sh7.shortValue() / 100.0f);
        }
        Short sh8 = brazeCompanionExternalSyntheticLambda4.PlaybackStateCompat;
        if (sh8 != null) {
            location.setSpeedAccuracyMetersPerSecond(sh8.shortValue() / 100.0f);
        }
        return location;
    }

    public static Byte IconCompatParcelizer(TransportMode transportMode) {
        switch (getAccuracy.serializer[transportMode.ordinal()]) {
            case 1:
                return (byte) 2;
            case 2:
                return (byte) 3;
            case 3:
                return (byte) 4;
            case 4:
                return (byte) 5;
            case 5:
                return (byte) 6;
            case 6:
                return (byte) 7;
            case 7:
                return (byte) 8;
            case 8:
                return (byte) 9;
            case 9:
                return (byte) 10;
            case 10:
                return (byte) 11;
            default:
                return (byte) 1;
        }
    }

    private static ThriftBool serializer(Boolean bool) {
        if (bool == null) {
            return ThriftBool.UNSET;
        }
        if (bool.booleanValue()) {
            return ThriftBool.TRUE;
        }
        return ThriftBool.FALSE;
    }

    private static Byte write(SdkStatus.QuotaStatus quotaStatus) {
        int i = getAccuracy.IconCompatParcelizer[quotaStatus.ordinal()];
        if (i == 1) {
            return (byte) 2;
        }
        if (i != 2) {
            return (byte) 1;
        }
        return (byte) 3;
    }

    public final ArrayList write() {
        parseLonglambda0 parselonglambda0 = this.IconCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        try {
            for (Field field : r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA.class.getFields()) {
                field.setAccessible(true);
                if (!java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                    try {
                        arrayList.add(field.getType());
                    } catch (ClassCastException e) {
                        parselonglambda0.IconCompatParcelizer(false, e, "Failed to cast event property class type to a struct class type", new Object[0]);
                    }
                }
            }
        } catch (SecurityException e2) {
            parselonglambda0.IconCompatParcelizer(false, e2, "Failed to access fields of EventProperty class", new Object[0]);
        }
        return arrayList;
    }

    public final <T> Optional<T> write(r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 r8lambdaqerpunsf6awv6hiw4vcr1aiof0, File file) {
        Optional<T> optionalMediaSessionCompatQueueItem = Optional.MediaSessionCompatQueueItem();
        try {
            r8lambdaaJvt3gXGJaLioJupTNHztNFUpQ r8lambdaajvt3gxgjaliojuptnhztnfupq = new r8lambdaaJvt3gXGJaLioJupTNHztNFUpQ(new r8lambdactPImk7nPmPQDeegHjgpfDqwpkI(new FileInputStream(file)));
            try {
                optionalMediaSessionCompatQueueItem = Optional.RemoteActionCompatParcelizer(r8lambdaqerpunsf6awv6hiw4vcr1aiof0.RemoteActionCompatParcelizer(r8lambdaajvt3gxgjaliojuptnhztnfupq));
                r8lambdaajvt3gxgjaliojuptnhztnfupq.close();
                return optionalMediaSessionCompatQueueItem;
            } catch (Throwable th) {
                try {
                    r8lambdaajvt3gxgjaliojuptnhztnfupq.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            this.IconCompatParcelizer.IconCompatParcelizer(false, e, "Error reading Thrift object from file", new Object[0]);
            return optionalMediaSessionCompatQueueItem;
        }
    }

    public final boolean read(r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 r8lambdaqerpunsf6awv6hiw4vcr1aiof0, r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k r8lambdanclnumohj3w_eprkcj4qjg7b2k, File file, boolean z) {
        OutputStream bufferedOutputStream;
        try {
            if (z) {
                bufferedOutputStream = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(file), 8192), 8192);
            } else {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 8192);
            }
            r8lambdaaJvt3gXGJaLioJupTNHztNFUpQ r8lambdaajvt3gxgjaliojuptnhztnfupq = new r8lambdaaJvt3gXGJaLioJupTNHztNFUpQ(new migratePushDeliveryEventsToJson(bufferedOutputStream));
            try {
                r8lambdaqerpunsf6awv6hiw4vcr1aiof0.read(r8lambdaajvt3gxgjaliojuptnhztnfupq, r8lambdanclnumohj3w_eprkcj4qjg7b2k);
                r8lambdaajvt3gxgjaliojuptnhztnfupq.close();
                return true;
            } catch (Throwable th) {
                try {
                    r8lambdaajvt3gxgjaliojuptnhztnfupq.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            this.IconCompatParcelizer.IconCompatParcelizer(false, e, "Error writing Thrift object to file (class=%s)", r8lambdanclnumohj3w_eprkcj4qjg7b2k.getClass().getName());
            return false;
        }
    }

    public final <T> Optional<T> read(InputStream inputStream, r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 r8lambdaqerpunsf6awv6hiw4vcr1aiof0, boolean z) {
        try {
            if (z) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            r8lambdaaJvt3gXGJaLioJupTNHztNFUpQ r8lambdaajvt3gxgjaliojuptnhztnfupq = new r8lambdaaJvt3gXGJaLioJupTNHztNFUpQ(new r8lambdactPImk7nPmPQDeegHjgpfDqwpkI(inputStream));
            try {
                Optional<T> optionalRemoteActionCompatParcelizer = Optional.RemoteActionCompatParcelizer(r8lambdaqerpunsf6awv6hiw4vcr1aiof0.RemoteActionCompatParcelizer(r8lambdaajvt3gxgjaliojuptnhztnfupq));
                r8lambdaajvt3gxgjaliojuptnhztnfupq.close();
                return optionalRemoteActionCompatParcelizer;
            } catch (Throwable th) {
                try {
                    r8lambdaajvt3gxgjaliojuptnhztnfupq.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            this.IconCompatParcelizer.IconCompatParcelizer(false, e, "Error deserializing thrift payload (adapter=%s)", r8lambdaqerpunsf6awv6hiw4vcr1aiof0.getClass().getName());
            return Optional.MediaSessionCompatQueueItem();
        }
    }
}
