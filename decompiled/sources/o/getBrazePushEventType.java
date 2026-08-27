package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class getBrazePushEventType implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final getVerticalAccuracy IconCompatParcelizer;
    private final handlePushNotificationPayload MediaBrowserCompatMediaItem;
    private final getCooldownEnterSeconds MediaDescriptionCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaMetadataCompat;
    private final handleAdmRegistrationEventIfEnabled MediaSessionCompatQueueItem;
    private final component4android_sdk_base_release RatingCompat;
    private final readandroid_sdk_base_release RemoteActionCompatParcelizer;
    private final r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo read;
    private final createPayload serializer;
    private final getAnalyticsEnabledEnterannotations write;

    public static void read(getBrazePushEventType getbrazepusheventtype, boolean z) {
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A r8lambda2l1vxswbmfutp9a4iejxpq7zf7a;
        createPayload createpayload = getbrazepusheventtype.serializer;
        r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo r8lambdadcttszpevxh1yemb7jfa8hthgho = getbrazepusheventtype.read;
        handlePushNotificationPayload handlepushnotificationpayload = getbrazepusheventtype.MediaBrowserCompatMediaItem;
        getCooldownEnterSeconds getcooldownenterseconds = getbrazepusheventtype.MediaDescriptionCompat;
        getbrazepusheventtype.MediaMetadataCompat.getClass();
        Optional optional = getcooldownenterseconds.read(r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A.class, Long.valueOf(System.currentTimeMillis()));
        if (optional.IconCompatParcelizer() && (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = ((getCooldownEnterSeconds.read) optional.write()).RemoteActionCompatParcelizer(getbrazepusheventtype.RatingCompat)) != null && (r8lambda2l1vxswbmfutp9a4iejxpq7zf7a = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.enterPictureInPictureMode) != null && r8lambda2l1vxswbmfutp9a4iejxpq7zf7a.serializer.byteValue() == 1) {
            Byte bSerializer = handlepushnotificationpayload.serializer();
            Byte bSerializer2 = r8lambdadcttszpevxh1yemb7jfa8hthgho.serializer();
            if (bSerializer == null) {
                bSerializer = bSerializer2;
            }
            if (bSerializer != null) {
                handleAdmRegistrationEventIfEnabled.serializer(getbrazepusheventtype.MediaSessionCompatQueueItem, bSerializer.byteValue());
            }
        }
        if (z) {
            createpayload.MediaBrowserCompatMediaItem();
            handlepushnotificationpayload.MediaDescriptionCompat();
            r8lambdadcttszpevxh1yemb7jfa8hthgho.MediaDescriptionCompat();
        }
        if (!createpayload.MediaDescriptionCompat() && !handlepushnotificationpayload.RatingCompat()) {
            if (createpayload.read()) {
                createpayload.serializer();
            } else {
                handlepushnotificationpayload.MediaMetadataCompat();
            }
        }
        r8lambdadcttszpevxh1yemb7jfa8hthgho.getClass();
        r8lambdadcttszpevxh1yemb7jfa8hthgho.MediaMetadataCompat();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map = new HashMap();
        HashMap mapIconCompatParcelizer = this.read.IconCompatParcelizer();
        HashMap mapIconCompatParcelizer2 = this.serializer.IconCompatParcelizer();
        if (mapIconCompatParcelizer != null) {
            map.putAll(mapIconCompatParcelizer);
        }
        if (mapIconCompatParcelizer2 != null) {
            map.putAll(mapIconCompatParcelizer2);
        }
        return map;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        handleAdmRegistrationEventIfEnabled.write(this.MediaSessionCompatQueueItem);
        this.serializer.MediaBrowserCompatMediaItem();
        this.MediaBrowserCompatMediaItem.MediaDescriptionCompat();
        this.read.MediaDescriptionCompat();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        BrazeNotificationUtilsBrazeNotificationBroadcastType brazeNotificationUtilsBrazeNotificationBroadcastType = new BrazeNotificationUtilsBrazeNotificationBroadcastType(this, this.RemoteActionCompatParcelizer);
        ControlMessage controlMessage = ControlMessage.CALL_DETECTOR_START;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.write;
        getanalyticsenabledenterannotations.read(controlMessage, brazeNotificationUtilsBrazeNotificationBroadcastType);
        getanalyticsenabledenterannotations.read(ControlMessage.CALL_DETECTOR_STOP, brazeNotificationUtilsBrazeNotificationBroadcastType);
    }

    public getBrazePushEventType(getVerticalAccuracy getverticalaccuracy, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo r8lambdadcttszpevxh1yemb7jfa8hthgho, createPayload createpayload, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, handlePushNotificationPayload handlepushnotificationpayload, getCooldownEnterSeconds getcooldownenterseconds, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, component4android_sdk_base_release component4android_sdk_base_releaseVar) {
        this.write = getanalyticsenabledenterannotations;
        this.RemoteActionCompatParcelizer = readandroid_sdk_base_releaseVar;
        this.IconCompatParcelizer = getverticalaccuracy;
        this.read = r8lambdadcttszpevxh1yemb7jfa8hthgho;
        this.serializer = createpayload;
        this.MediaBrowserCompatMediaItem = handlepushnotificationpayload;
        this.MediaDescriptionCompat = getcooldownenterseconds;
        this.MediaMetadataCompat = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.RatingCompat = component4android_sdk_base_releaseVar;
        r8lambdadcttszpevxh1yemb7jfa8hthgho.IconCompatParcelizer(this);
        createpayload.IconCompatParcelizer(this);
        handlepushnotificationpayload.IconCompatParcelizer(this);
        this.MediaSessionCompatQueueItem = new handleAdmRegistrationEventIfEnabled(this);
    }

    public final void IconCompatParcelizer(byte b, byte b2, long j) {
        this.IconCompatParcelizer.getClass();
        r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
        r8lambda1mnczrzuv4owduwgkg6cjtsws.write = Byte.valueOf(b);
        r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer = Byte.valueOf(b2);
        if (((Byte) r8lambda1mnczrzuv4owduwgkg6cjtsws.write) != null) {
            r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A r8lambda2l1vxswbmfutp9a4iejxpq7zf7a = new r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A(r8lambda1mnczrzuv4owduwgkg6cjtsws);
            r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(j);
            r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
            r8lambdaromdixahini0blcevvl7ehebhj0.addOnMultiWindowModeChangedListener = r8lambda2l1vxswbmfutp9a4iejxpq7zf7a;
            r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
            this.write.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
            handleAdmRegistrationEventIfEnabled handleadmregistrationeventifenabled = this.MediaSessionCompatQueueItem;
            if (b == 1) {
                handleAdmRegistrationEventIfEnabled.serializer(handleadmregistrationeventifenabled, b2);
                return;
            } else {
                handleAdmRegistrationEventIfEnabled.write(handleadmregistrationeventifenabled);
                return;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'type' is missing");
    }

    public static void serializer(getBrazePushEventType getbrazepusheventtype) {
        handleAdmRegistrationEventIfEnabled.write(getbrazepusheventtype.MediaSessionCompatQueueItem);
        getbrazepusheventtype.serializer.MediaBrowserCompatMediaItem();
        getbrazepusheventtype.MediaBrowserCompatMediaItem.MediaDescriptionCompat();
        getbrazepusheventtype.read.MediaDescriptionCompat();
    }
}
