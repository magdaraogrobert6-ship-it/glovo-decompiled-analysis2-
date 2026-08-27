package o;

import com.google.android.gms.location.DeviceOrientationRequest;
import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.events.controlmessageextras.StartLocationFixRequest$Purpose;
import com.sentiance.sdk.services.ServiceForegroundMode;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "ShortStationaryEndDetector")
public final class addNotificationActionlambda0 extends handleHmsRemoteMessageDatalambda1 implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final readandroid_sdk_base_release IconCompatParcelizer;
    private readDatalambda0 MediaBrowserCompatMediaItem;
    private final readStringlambda0 MediaDescriptionCompat;
    private final getVerticalAccuracy MediaMetadataCompat;
    private boolean MediaSessionCompatQueueItem;
    private final ConfigurationManager RatingCompat;
    private final getAnalyticsEnabledEnterannotations RemoteActionCompatParcelizer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI read;
    private final parseLonglambda0 serializer;
    private final getCooldownEnterSeconds write;

    public static final class RemoteActionCompatParcelizer {
        public RemoteActionCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    private final void serializer() {
        synchronized (this) {
            if (this.MediaSessionCompatQueueItem) {
                this.MediaSessionCompatQueueItem = false;
                readDatalambda0 readdatalambda0 = this.MediaBrowserCompatMediaItem;
                if (readdatalambda0 != null) {
                    readdatalambda0.write();
                }
                this.MediaBrowserCompatMediaItem = null;
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(ControlMessage.LOCATION_FIX_STOP, new getDismissalTimeMsannotations("ShortStationaryEndDetector"));
                this.serializer.serializer("Stopped short stationary assistant", new Object[0]);
            }
        }
    }

    public static void write(addNotificationActionlambda0 addnotificationactionlambda0) {
        addnotificationactionlambda0.serializer();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        serializer();
    }

    private final getCooldownEnterSeconds.read write() {
        getCooldownEnterSeconds.read readVarRemoteActionCompatParcelizer;
        List<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> list = invokeFallbackFirebaseServicelambda2.IconCompatParcelizer;
        getCooldownEnterSeconds getcooldownenterseconds = this.write;
        getCooldownEnterSeconds.read readVarRemoteActionCompatParcelizer2 = getcooldownenterseconds.RemoteActionCompatParcelizer(list, (Long) null, false).RemoteActionCompatParcelizer();
        if (readVarRemoteActionCompatParcelizer2 == null) {
            return null;
        }
        int iMediaSessionCompatQueueItem = readVarRemoteActionCompatParcelizer2.MediaSessionCompatQueueItem();
        this.MediaMetadataCompat.getClass();
        return (r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class.equals(getVerticalAccuracy.write(iMediaSessionCompatQueueItem)) && (readVarRemoteActionCompatParcelizer = getcooldownenterseconds.RemoteActionCompatParcelizer(list, Long.valueOf(readVarRemoteActionCompatParcelizer2.serializer()), false).RemoteActionCompatParcelizer()) != null && wipeDatalambda0.class.equals(getVerticalAccuracy.write(readVarRemoteActionCompatParcelizer.MediaSessionCompatQueueItem()))) ? readVarRemoteActionCompatParcelizer : readVarRemoteActionCompatParcelizer2;
    }

    static {
        new RemoteActionCompatParcelizer(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addNotificationActionlambda0(parseLonglambda0 parselonglambda0, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getCooldownEnterSeconds getcooldownenterseconds, getVerticalAccuracy getverticalaccuracy, ConfigurationManager configurationManager, readStringlambda0 readstringlambda0) {
        super("ShortStationaryEndDetector", getanalyticsenabledenterannotations);
        parselonglambda0.getClass();
        getanalyticsenabledenterannotations.getClass();
        readandroid_sdk_base_releaseVar.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        getcooldownenterseconds.getClass();
        getverticalaccuracy.getClass();
        configurationManager.getClass();
        readstringlambda0.getClass();
        this.serializer = parselonglambda0;
        this.RemoteActionCompatParcelizer = getanalyticsenabledenterannotations;
        this.IconCompatParcelizer = readandroid_sdk_base_releaseVar;
        this.read = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.write = getcooldownenterseconds;
        this.MediaMetadataCompat = getverticalaccuracy;
        this.RatingCompat = configurationManager;
        this.MediaDescriptionCompat = readstringlambda0;
    }

    @Override // o.handleHmsRemoteMessageDatalambda1
    public final void serializer(long j, Class cls) {
        String str;
        if (!this.RatingCompat._init_lambda2() && !this.RatingCompat.addOnContextAvailableListener()) {
            serializer();
            return;
        }
        if (this.RatingCompat.MediaSessionCompatToken() * 1000 < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
            serializer();
            return;
        }
        parseLonglambda0 parselonglambda0 = this.serializer;
        if (cls == setShouldPersistWebView.class) {
            str = "MovingState";
        } else if (cls == r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4.class) {
            str = "StoppedState";
        } else if (cls == BrazeBootReceiver.class) {
            str = "UnknownState";
        } else if (cls == r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class) {
            str = "StationaryState";
        } else if (cls == r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class) {
            str = "UnconfirmedMovingState";
        } else if (cls == r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class) {
            str = "ForcedMovingState";
        } else if (cls == wipeDatalambda0.class) {
            str = "GeofencelessStationaryState";
        } else if (cls == BrazeActivityLifecycleCallbackListeneronActivityCreated2.class) {
            str = "UnconfirmedStationaryState";
        } else {
            str = "???";
        }
        parselonglambda0.IconCompatParcelizer("Received moving state change event: ".concat(str), new Object[0]);
        if (cls.equals(wipeDatalambda0.class) || cls.equals(r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class)) {
            synchronized (this) {
                if (this.MediaSessionCompatQueueItem) {
                    return;
                }
                this.read.getClass();
                long jMediaSessionCompatToken = (this.RatingCompat.MediaSessionCompatToken() * 1000) - Math.max(0L, System.currentTimeMillis() - j);
                if (jMediaSessionCompatToken < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                    serializer();
                    return;
                }
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(ControlMessage.LOCATION_FIX_START, r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0.read("ShortStationaryEndDetector", Math.max(1000L, this.RatingCompat.PlaybackStateCompat() * 1000), ServiceForegroundMode.ENABLED, false, true, StartLocationFixRequest$Purpose.DETECTIONS));
                this.MediaSessionCompatQueueItem = true;
                readDatalambda0 readdatalambda0Write = readStringlambda0.write(this.MediaDescriptionCompat, this.IconCompatParcelizer, jMediaSessionCompatToken, "ShortStationaryEndDetector", new ZM$$ExternalSyntheticLambda2(27, this), 4);
                readdatalambda0Write.serializer();
                this.MediaBrowserCompatMediaItem = readdatalambda0Write;
                this.read.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.serializer.serializer("Started short stationary assistant, will stop at " + com.sentiance.sdk.util.x.c(jCurrentTimeMillis + jMediaSessionCompatToken), new Object[0]);
                return;
            }
        }
        serializer();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        long jCurrentTimeMillis;
        getCooldownEnterSeconds.read readVarWrite = write();
        if (readVarWrite != null) {
            jCurrentTimeMillis = readVarWrite.RemoteActionCompatParcelizer() - 1;
            if (jCurrentTimeMillis < 0) {
                jCurrentTimeMillis = 0;
            }
        } else {
            this.read.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        read(this.IconCompatParcelizer, jCurrentTimeMillis);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        Class clsIconCompatParcelizer;
        getCooldownEnterSeconds.read readVarWrite = write();
        if (readVarWrite == null || (clsIconCompatParcelizer = getBitmapFromCache.IconCompatParcelizer(readVarWrite, this.MediaMetadataCompat)) == null) {
            return SimpleItemTouchHelperCallback.serializer;
        }
        Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> mapSingletonMap = Collections.singletonMap(clsIconCompatParcelizer, Long.valueOf(readVarWrite.RemoteActionCompatParcelizer()));
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}
