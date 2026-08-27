package o;

import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.processguard.Guard$Type;
import com.sentiance.sdk.sensorstream.SensorType;
import com.sentiance.sdk.services.ServiceManager;
import com.sentiance.sdk.util.Optional;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "DetectorManager", guardType = Guard$Type.REFERENCE_COUNTED)
public class r8lambda_OYW2CZnqbidZYnUPSCCpYK7kHQ implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final getAnalyticsEnabledEnterannotations IconCompatParcelizer;
    private final getCooldownEnterSeconds MediaBrowserCompatMediaItem;
    private final ServiceManager MediaDescriptionCompat;
    private final readandroid_sdk_base_release MediaMetadataCompat;
    private long MediaSessionCompatQueueItem = 0;
    private final r8lambdatzJkbVNTjaHFjZFTnAhtnBmfgLQ RatingCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI RemoteActionCompatParcelizer;
    private final getVerticalAccuracy read;
    private final component4android_sdk_base_release serializer;
    private final ConfigurationManager write;

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        Class clsIconCompatParcelizer;
        HashMap map = new HashMap();
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(invokeFallbackFirebaseServicelambda2.IconCompatParcelizer, (Long) null, false);
        if (optionalRemoteActionCompatParcelizer.IconCompatParcelizer() && (clsIconCompatParcelizer = getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer.write(), this.read)) != null) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalRemoteActionCompatParcelizer.write(), map, clsIconCompatParcelizer);
        }
        return map;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.MediaSessionCompatQueueItem = 0L;
        this.IconCompatParcelizer.IconCompatParcelizer(ControlMessage.SENSORS_STOP, new getBannerId("DetectorManager"));
        this.MediaDescriptionCompat.write("DetectorManager");
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.RemoteActionCompatParcelizer.getClass();
        this.MediaSessionCompatQueueItem = System.currentTimeMillis();
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new r8lambdaem8lgIsZGv8shengUsFDB4dXI5k(this, this.MediaMetadataCompat));
    }

    public static void serializer(r8lambda_OYW2CZnqbidZYnUPSCCpYK7kHQ r8lambda_oyw2cznqbidzynupsccpyk7khq, r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k r8lambdanclnumohj3w_eprkcj4qjg7b2k) {
        DetectionTrigger detectionTrigger;
        if (r8lambdanclnumohj3w_eprkcj4qjg7b2k == null) {
            return;
        }
        Class<?> cls = r8lambdanclnumohj3w_eprkcj4qjg7b2k.getClass();
        if (Arrays.asList(setShouldPersistWebView.class, BrazeBootReceiver.class, r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class).contains(cls)) {
            detectionTrigger = DetectionTrigger.SDK;
        } else {
            detectionTrigger = r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class == cls ? DetectionTrigger.EXTERNAL : null;
        }
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = r8lambda_oyw2cznqbidzynupsccpyk7khq.IconCompatParcelizer;
        if (detectionTrigger != null) {
            getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.ONDEVICE_TRANSPORT_CLASSIFIER_START, (Object) null);
        } else {
            getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.ONDEVICE_TRANSPORT_CLASSIFIER_STOP, (Object) null);
        }
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations2 = r8lambda_oyw2cznqbidzynupsccpyk7khq.IconCompatParcelizer;
        if (detectionTrigger != null) {
            getanalyticsenabledenterannotations2.IconCompatParcelizer(ControlMessage.HARSH_EVENT_DETECTOR_START, (Object) null);
        } else {
            getanalyticsenabledenterannotations2.IconCompatParcelizer(ControlMessage.HARSH_EVENT_DETECTOR_STOP, (Object) null);
        }
        ConfigurationManager configurationManager = r8lambda_oyw2cznqbidzynupsccpyk7khq.write;
        if (detectionTrigger != null && !configurationManager.write(detectionTrigger).isEmpty()) {
            getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations3 = r8lambda_oyw2cznqbidzynupsccpyk7khq.IconCompatParcelizer;
            ControlMessage controlMessage = ControlMessage.SENSORS_START;
            final getBannerIdannotations getbanneridannotations = new getBannerIdannotations("DetectorManager");
            configurationManager.serializer(detectionTrigger).forEach(new BiConsumer() { // from class: o.requestSingleLocationUpdateFromGooglePlaylambda3
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    SensorType sensorType = (SensorType) obj;
                    Short sh = (Short) obj2;
                    int i = ConfigurationManager.RemoteActionCompatParcelizer;
                    if (sensorType != null) {
                        getbanneridannotations.read(sensorType, sh.shortValue());
                    }
                }
            });
            getanalyticsenabledenterannotations3.IconCompatParcelizer(controlMessage, new BannerExternalSyntheticLambda0(getbanneridannotations));
        } else {
            r8lambda_oyw2cznqbidzynupsccpyk7khq.IconCompatParcelizer.IconCompatParcelizer(ControlMessage.SENSORS_STOP, new getBannerId("DetectorManager"));
        }
        r8lambdatzJkbVNTjaHFjZFTnAhtnBmfgLQ r8lambdatzjkbvntjahfjzftnahtnbmfglq = r8lambda_oyw2cznqbidzynupsccpyk7khq.RatingCompat;
        ConfigurationManager configurationManager2 = r8lambda_oyw2cznqbidzynupsccpyk7khq.write;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations4 = r8lambda_oyw2cznqbidzynupsccpyk7khq.IconCompatParcelizer;
        if (detectionTrigger != null && configurationManager2.read(detectionTrigger).shortValue() > 0) {
            getanalyticsenabledenterannotations4.IconCompatParcelizer(ControlMessage.LOCATION_FIX_START, configurationManager2.serializer(r8lambda_oyw2cznqbidzynupsccpyk7khq.getClass().getName(), detectionTrigger, BrazeBootReceiver.class == cls || detectionTrigger == DetectionTrigger.EXTERNAL));
            getanalyticsenabledenterannotations4.RemoteActionCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, r8lambdatzjkbvntjahfjzftnahtnbmfglq);
            getanalyticsenabledenterannotations4.IconCompatParcelizer(ControlMessage.MOTION_ACTIVITY_START_CONTINUOUS, (Object) null);
        } else {
            getanalyticsenabledenterannotations4.IconCompatParcelizer(ControlMessage.LOCATION_FIX_STOP, new getDismissalTimeMsannotations(r8lambda_oyw2cznqbidzynupsccpyk7khq.getClass().getName()));
            getanalyticsenabledenterannotations4.RemoteActionCompatParcelizer(r8lambdatzjkbvntjahfjzftnahtnbmfglq);
            getanalyticsenabledenterannotations4.IconCompatParcelizer(ControlMessage.MOTION_ACTIVITY_STOP_SINGLE, (Object) null);
            getanalyticsenabledenterannotations4.IconCompatParcelizer(ControlMessage.MOTION_ACTIVITY_STOP_CONTINUOUS, (Object) null);
        }
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations5 = r8lambda_oyw2cznqbidzynupsccpyk7khq.IconCompatParcelizer;
        if (detectionTrigger != null && r8lambda_oyw2cznqbidzynupsccpyk7khq.write.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0()) {
            getanalyticsenabledenterannotations5.IconCompatParcelizer(ControlMessage.CRASH_DETECTOR_START, (Object) null);
        } else {
            getanalyticsenabledenterannotations5.IconCompatParcelizer(ControlMessage.CRASH_DETECTOR_STOP, (Object) null);
        }
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations6 = r8lambda_oyw2cznqbidzynupsccpyk7khq.IconCompatParcelizer;
        if (detectionTrigger != null && r8lambda_oyw2cznqbidzynupsccpyk7khq.write.RemoteActionCompatParcelizer(detectionTrigger)) {
            getanalyticsenabledenterannotations6.IconCompatParcelizer(ControlMessage.CALL_DETECTOR_START, Boolean.valueOf(Arrays.asList(BrazeBootReceiver.class, r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class, r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class).contains(cls)));
        } else {
            getanalyticsenabledenterannotations6.IconCompatParcelizer(ControlMessage.CALL_DETECTOR_STOP, (Object) null);
        }
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations7 = r8lambda_oyw2cznqbidzynupsccpyk7khq.IconCompatParcelizer;
        if (detectionTrigger != null) {
            getanalyticsenabledenterannotations7.IconCompatParcelizer(ControlMessage.ACTIVITY_TRANSITION_START, "DetectorManager");
        } else {
            getanalyticsenabledenterannotations7.IconCompatParcelizer(ControlMessage.ACTIVITY_TRANSITION_STOP, "DetectorManager");
        }
        synchronized (r8lambda_oyw2cznqbidzynupsccpyk7khq) {
            boolean zMediaBrowserCompatMediaItem = r8lambda_oyw2cznqbidzynupsccpyk7khq.write.MediaBrowserCompatMediaItem(detectionTrigger);
            ServiceManager serviceManager = r8lambda_oyw2cznqbidzynupsccpyk7khq.MediaDescriptionCompat;
            if (zMediaBrowserCompatMediaItem) {
                serviceManager.read("DetectorManager");
            } else {
                serviceManager.write("DetectorManager");
            }
        }
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations8 = r8lambda_oyw2cznqbidzynupsccpyk7khq.IconCompatParcelizer;
        if (detectionTrigger != null) {
            getanalyticsenabledenterannotations8.IconCompatParcelizer(ControlMessage.KEYGUARD_STATE_DETECTOR_START, "DetectorManager");
        } else {
            getanalyticsenabledenterannotations8.IconCompatParcelizer(ControlMessage.KEYGUARD_STATE_DETECTOR_STOP, "DetectorManager");
        }
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations9 = r8lambda_oyw2cznqbidzynupsccpyk7khq.IconCompatParcelizer;
        if (detectionTrigger != null) {
            getanalyticsenabledenterannotations9.IconCompatParcelizer(ControlMessage.PHONE_USAGE_DETECTOR_START, (Object) null);
        } else {
            getanalyticsenabledenterannotations9.IconCompatParcelizer(ControlMessage.PHONE_USAGE_DETECTOR_STOP, (Object) null);
        }
    }

    public r8lambda_OYW2CZnqbidZYnUPSCCpYK7kHQ(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getCooldownEnterSeconds getcooldownenterseconds, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getVerticalAccuracy getverticalaccuracy, ConfigurationManager configurationManager, component4android_sdk_base_release component4android_sdk_base_releaseVar, ServiceManager serviceManager, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4) {
        this.IconCompatParcelizer = getanalyticsenabledenterannotations;
        this.MediaBrowserCompatMediaItem = getcooldownenterseconds;
        this.RemoteActionCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.read = getverticalaccuracy;
        this.write = configurationManager;
        this.serializer = component4android_sdk_base_releaseVar;
        this.MediaDescriptionCompat = serviceManager;
        this.MediaMetadataCompat = readandroid_sdk_base_releaseVar;
        this.RatingCompat = new r8lambdatzJkbVNTjaHFjZFTnAhtnBmfgLQ(this, readandroid_sdk_base_releaseVar);
    }
}
