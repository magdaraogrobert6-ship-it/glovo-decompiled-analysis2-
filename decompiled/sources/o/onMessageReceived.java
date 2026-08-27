package o;

import android.os.SystemClock;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.ControlMessage;
import io.socket.parser.IOParser$Decoder;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "MotionActivityDetector")
public class onMessageReceived implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    public static int IconCompatParcelizer;
    public static int read;
    private final getTotalDiscounts.serializer MediaBrowserCompatMediaItem;
    private final getTotalDiscounts MediaDescriptionCompat;
    private final getVerticalAccuracy MediaMetadataCompat;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 MediaSessionCompatQueueItem;
    private boolean MediaSessionCompatResultReceiverWrapper;
    private final getTotalDiscounts.serializer MediaSessionCompatToken;
    private final Runnable ParcelableVolumeInfo;
    private boolean PlaybackStateCompatCustomAction;
    private final onLocationRequestCompletelambda1 RatingCompat;
    private final getAnalyticsEnabledEnterannotations RemoteActionCompatParcelizer;
    private final parseLonglambda0 serializer;
    private final readandroid_sdk_base_release write;

    public static void serializer(onMessageReceived onmessagereceived) {
        synchronized (onmessagereceived) {
            if (!onmessagereceived.RatingCompat.serializer()) {
                onmessagereceived.serializer.IconCompatParcelizer("Activity recognition permission not granted: not starting", new Object[0]);
                return;
            }
            boolean z = onmessagereceived.PlaybackStateCompatCustomAction;
            parseLonglambda0 parselonglambda0 = onmessagereceived.serializer;
            if (z) {
                parselonglambda0.serializer("Single updates already started", new Object[0]);
                return;
            }
            parselonglambda0.serializer("Starting single motion activity updates", new Object[0]);
            onmessagereceived.PlaybackStateCompatCustomAction = true;
            onmessagereceived.MediaSessionCompatQueueItem.read();
            if (onmessagereceived.PlaybackStateCompatCustomAction) {
                onmessagereceived.MediaDescriptionCompat.serializer(onmessagereceived.MediaSessionCompatToken);
                onmessagereceived.write.IconCompatParcelizer("MotionActivityDetector", DeviceOrientationRequest.OUTPUT_PERIOD_FAST, onmessagereceived.ParcelableVolumeInfo);
            } else {
                onmessagereceived.serializer.write("Cannot request single motion activity updates: detector not started", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write() {
        synchronized (this) {
            boolean z = this.PlaybackStateCompatCustomAction;
            parseLonglambda0 parselonglambda0 = this.serializer;
            if (!z) {
                parselonglambda0.serializer("Not stopping, wasn't started", new Object[0]);
                return;
            }
            parselonglambda0.serializer("Stopping single motion activity updates", new Object[0]);
            this.write.IconCompatParcelizer(this.ParcelableVolumeInfo);
            this.MediaDescriptionCompat.write(this.MediaSessionCompatToken);
            this.MediaSessionCompatQueueItem.IconCompatParcelizer();
            this.PlaybackStateCompatCustomAction = false;
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    public static void IconCompatParcelizer(onMessageReceived onmessagereceived) {
        parseLonglambda0 parselonglambda0 = onmessagereceived.serializer;
        if (!onmessagereceived.RatingCompat.serializer()) {
            parselonglambda0.IconCompatParcelizer("Activity recognition permission not granted: not starting interval updates", new Object[0]);
        } else {
            if (onmessagereceived.MediaSessionCompatResultReceiverWrapper) {
                parselonglambda0.serializer("Continuous updates already started", new Object[0]);
                return;
            }
            parselonglambda0.serializer("Starting continuous motion activity updates", new Object[0]);
            onmessagereceived.MediaSessionCompatResultReceiverWrapper = true;
            onmessagereceived.MediaDescriptionCompat.serializer(onmessagereceived.MediaBrowserCompatMediaItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer() {
        boolean z = this.MediaSessionCompatResultReceiverWrapper;
        parseLonglambda0 parselonglambda0 = this.serializer;
        if (!z) {
            parselonglambda0.serializer("Not stopping, wasn't started", new Object[0]);
            return;
        }
        this.MediaSessionCompatResultReceiverWrapper = false;
        parselonglambda0.serializer("Stopping continuous motion activity updates", new Object[0]);
        this.MediaDescriptionCompat.write(this.MediaBrowserCompatMediaItem);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        handleOnNewToken handleonnewtoken = new handleOnNewToken(this, this.write);
        ControlMessage controlMessage = ControlMessage.MOTION_ACTIVITY_START_SINGLE;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.RemoteActionCompatParcelizer;
        getanalyticsenabledenterannotations.read(controlMessage, handleonnewtoken);
        getanalyticsenabledenterannotations.read(ControlMessage.MOTION_ACTIVITY_STOP_SINGLE, handleonnewtoken);
        getanalyticsenabledenterannotations.read(ControlMessage.MOTION_ACTIVITY_START_CONTINUOUS, handleonnewtoken);
        getanalyticsenabledenterannotations.read(ControlMessage.MOTION_ACTIVITY_STOP_CONTINUOUS, handleonnewtoken);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        RemoteActionCompatParcelizer();
        write();
    }

    public onMessageReceived(parseLonglambda0 parselonglambda0, onLocationRequestCompletelambda1 onlocationrequestcompletelambda1, getVerticalAccuracy getverticalaccuracy, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, getTotalDiscounts gettotaldiscounts) {
        onNewToken onnewtoken = new onNewToken(this);
        this.ParcelableVolumeInfo = new isBrazePushNotification(this);
        this.serializer = parselonglambda0;
        this.write = readandroid_sdk_base_releaseVar;
        this.RemoteActionCompatParcelizer = getanalyticsenabledenterannotations;
        this.MediaMetadataCompat = getverticalaccuracy;
        this.RatingCompat = onlocationrequestcompletelambda1;
        this.MediaSessionCompatQueueItem = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.MediaDescriptionCompat = gettotaldiscounts;
        this.MediaBrowserCompatMediaItem = new getTotalDiscounts.serializer(60000L, readandroid_sdk_base_releaseVar, onnewtoken);
        this.MediaSessionCompatToken = new getTotalDiscounts.serializer(1000L, readandroid_sdk_base_releaseVar, onnewtoken);
        this.PlaybackStateCompatCustomAction = false;
    }

    public static r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM serializer(onMessageReceived onmessagereceived, BrazeFirebaseMessagingService brazeFirebaseMessagingService) {
        byte b;
        switch (brazeFirebaseMessagingService.serializer()) {
            case 0:
                b = 1;
                break;
            case 1:
                b = 2;
                break;
            case 2:
                b = 3;
                break;
            case 3:
                b = 5;
                break;
            case 4:
                b = 7;
                break;
            case 5:
                b = 6;
                break;
            case 6:
            default:
                return null;
            case 7:
                b = 8;
                break;
            case 8:
                b = 4;
                break;
        }
        getVerticalAccuracy getverticalaccuracy = onmessagereceived.MediaMetadataCompat;
        byte bWrite = (byte) brazeFirebaseMessagingService.write();
        long jRemoteActionCompatParcelizer = brazeFirebaseMessagingService.RemoteActionCompatParcelizer();
        getverticalaccuracy.getClass();
        IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
        iOParser$Decoder.RemoteActionCompatParcelizer = Byte.valueOf(b);
        r8lambdaRBUg8qiONCPYgCSL25Td35Mcmxs r8lambdarbug8qioncpygcsl25td35mcmxs = new r8lambdaRBUg8qiONCPYgCSL25Td35Mcmxs();
        r8lambdarbug8qioncpygcsl25td35mcmxs.serializer = Byte.valueOf(bWrite);
        iOParser$Decoder.read = r8lambdarbug8qioncpygcsl25td35mcmxs.IconCompatParcelizer();
        setSessionHandlingBlocklist setsessionhandlingblocklistIconCompatParcelizer = iOParser$Decoder.IconCompatParcelizer();
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(jRemoteActionCompatParcelizer);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.addOnPictureInPictureUiStateChangedListener = setsessionhandlingblocklistIconCompatParcelizer;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        return r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm;
    }

    public static void write(onMessageReceived onmessagereceived, r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm) {
        onmessagereceived.serializer.serializer("Dispatching activity: " + r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm, new Object[0]);
        onmessagereceived.RemoteActionCompatParcelizer.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
        if (onmessagereceived.PlaybackStateCompatCustomAction) {
            onmessagereceived.write();
        }
    }

    public static int IconCompatParcelizer() {
        int i = read;
        int i2 = i % 9761927;
        read = i + 1;
        if (i2 != 0) {
            return IconCompatParcelizer;
        }
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        IconCompatParcelizer = iUptimeMillis;
        return iUptimeMillis;
    }
}
