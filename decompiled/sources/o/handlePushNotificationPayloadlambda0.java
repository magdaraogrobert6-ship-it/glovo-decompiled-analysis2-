package o;

import android.content.IntentFilter;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.ControlMessage;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "KeyguardStateDetector")
public class handlePushNotificationPayloadlambda0 implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    public static final IntentFilter write = new IntentFilter("android.intent.action.USER_PRESENT");
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI IconCompatParcelizer;
    private final removeGeofencesRegisteredWithGeofencingClientlambda22 MediaBrowserCompatMediaItem = new handlePushNotificationPayloadlambda40(this);
    private final handlePushNotificationPayloadlambda2 MediaDescriptionCompat;
    private final readandroid_sdk_base_release MediaMetadataCompat;
    private final ServerConfigDataStoreProviderCompanion RatingCompat;
    private final getAnalyticsEnabledEnterannotations RemoteActionCompatParcelizer;
    private final getVerticalAccuracy read;
    private final parseLonglambda0 serializer;

    public final void RemoteActionCompatParcelizer() {
        synchronized (this) {
            this.serializer.IconCompatParcelizer("Stopping KeyguardStateDetector", new Object[0]);
            this.RatingCompat.serializer(this.MediaBrowserCompatMediaItem);
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        RemoteActionCompatParcelizer();
    }

    public final void read() {
        synchronized (this) {
            this.serializer.IconCompatParcelizer("Starting KeyguardStateDetector", new Object[0]);
            this.RatingCompat.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, write);
        }
    }

    public static void read(handlePushNotificationPayloadlambda0 handlepushnotificationpayloadlambda0) {
        getVerticalAccuracy getverticalaccuracy = handlepushnotificationpayloadlambda0.read;
        handlepushnotificationpayloadlambda0.IconCompatParcelizer.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        setStaticExternalIEventMessengerandroid_sdk_base_release setstaticexternalieventmessengerandroid_sdk_base_release = new setStaticExternalIEventMessengerandroid_sdk_base_release();
        getverticalaccuracy.getClass();
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(jCurrentTimeMillis);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0._init_lambda3 = setstaticexternalieventmessengerandroid_sdk_base_release;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        handlepushnotificationpayloadlambda0.RemoteActionCompatParcelizer.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        ControlMessage controlMessage = ControlMessage.KEYGUARD_STATE_DETECTOR_START;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.RemoteActionCompatParcelizer;
        handlePushNotificationPayloadlambda2 handlepushnotificationpayloadlambda2 = this.MediaDescriptionCompat;
        getanalyticsenabledenterannotations.read(controlMessage, handlepushnotificationpayloadlambda2);
        getanalyticsenabledenterannotations.read(ControlMessage.KEYGUARD_STATE_DETECTOR_STOP, handlepushnotificationpayloadlambda2);
    }

    public handlePushNotificationPayloadlambda0(parseLonglambda0 parselonglambda0, getVerticalAccuracy getverticalaccuracy, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, ServerConfigDataStoreProviderCompanion serverConfigDataStoreProviderCompanion, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        this.serializer = parselonglambda0;
        this.read = getverticalaccuracy;
        this.RemoteActionCompatParcelizer = getanalyticsenabledenterannotations;
        this.IconCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.RatingCompat = serverConfigDataStoreProviderCompanion;
        this.MediaMetadataCompat = readandroid_sdk_base_releaseVar;
        this.MediaDescriptionCompat = new handlePushNotificationPayloadlambda2(this, readandroid_sdk_base_releaseVar);
    }
}
