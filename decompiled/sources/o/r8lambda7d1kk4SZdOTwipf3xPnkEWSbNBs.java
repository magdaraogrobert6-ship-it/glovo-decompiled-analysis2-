package o;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.sentiance.core.model.thrift.O$b;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.services.ServiceManager;
import com.sentiance.sdk.task.TaskManager;
import com.sentiance.sdk.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "StepCount", componentName = "StepCount")
public class r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs extends handleHmsRemoteMessageDatalambda1 implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final ArrayList ComponentActivity;
    private final getCooldownEnterSeconds IconCompatParcelizer;
    private final readandroid_sdk_base_release MediaBrowserCompatMediaItem;
    private final ConfigurationManager MediaDescriptionCompat;
    private final readList MediaMetadataCompat;
    private final parseLonglambda0 MediaSessionCompatQueueItem;
    private final populateNotificationBuilderlambda1 MediaSessionCompatResultReceiverWrapper;
    private final ServiceManager MediaSessionCompatToken;
    private final onLocationRequestCompletelambda1 ParcelableVolumeInfo;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 PlaybackStateCompat;
    private final migrateTriggersReeligibilityToJsonlambda4<r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI> PlaybackStateCompatCustomAction;
    private final SensorManager RatingCompat;
    private final getAnalyticsEnabledEnterannotations RemoteActionCompatParcelizer;
    private int ResultReceiver;
    private SensorEventListener r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    private final Sensor r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    private boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    private final component4android_sdk_base_release read;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI serializer;
    private final getVerticalAccuracy write;

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer() {
        synchronized (this) {
            SensorEventListener sensorEventListener = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            if (sensorEventListener != null) {
                this.RatingCompat.unregisterListener(sensorEventListener);
                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                this.MediaSessionCompatToken.write("StepCountTracker");
                this.MediaMetadataCompat.write("step.count.tracker");
            }
        }
    }

    public static void RemoteActionCompatParcelizer(r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs r8lambda7d1kk4szdotwipf3xpnkewsbnbs) {
        synchronized (r8lambda7d1kk4szdotwipf3xpnkewsbnbs) {
            if (!r8lambda7d1kk4szdotwipf3xpnkewsbnbs.ComponentActivity.isEmpty()) {
                r8lambda7d1kk4szdotwipf3xpnkewsbnbs.ComponentActivity.clear();
                r8lambda7d1kk4szdotwipf3xpnkewsbnbs.PlaybackStateCompat.IconCompatParcelizer();
            }
        }
    }

    public r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getCooldownEnterSeconds getcooldownenterseconds, component4android_sdk_base_release component4android_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getVerticalAccuracy getverticalaccuracy, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, parseLonglambda0 parselonglambda0, SensorManager sensorManager, readList readlist, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, ServiceManager serviceManager, ConfigurationManager configurationManager, onLocationRequestCompletelambda1 onlocationrequestcompletelambda1, populateNotificationBuilderlambda1 populatenotificationbuilderlambda1) {
        super("StepCountTracker", getanalyticsenabledenterannotations);
        this.ResultReceiver = -1;
        this.RemoteActionCompatParcelizer = getanalyticsenabledenterannotations;
        this.IconCompatParcelizer = getcooldownenterseconds;
        this.read = component4android_sdk_base_releaseVar;
        this.serializer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.write = getverticalaccuracy;
        this.MediaBrowserCompatMediaItem = readandroid_sdk_base_releaseVar;
        this.MediaSessionCompatQueueItem = parselonglambda0;
        this.RatingCompat = sensorManager;
        this.MediaMetadataCompat = readlist;
        this.PlaybackStateCompat = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.MediaSessionCompatToken = serviceManager;
        this.MediaDescriptionCompat = configurationManager;
        this.ParcelableVolumeInfo = onlocationrequestcompletelambda1;
        this.MediaSessionCompatResultReceiverWrapper = populatenotificationbuilderlambda1;
        this.ComponentActivity = new ArrayList();
        this.PlaybackStateCompatCustomAction = new r8lambdaW4ejTlUEHRcW71vWwsPlZdJRCg(this);
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = sensorManager.getDefaultSensor(19);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
        if (write()) {
            ((TaskManager) setPushUniqueId.read(TaskManager.class)).read((createOrGetDataStorelambda00) setPushUniqueId.read(r8lambda5l9iaoWfq17IIiUdmbHKrQzx4oA.class), true);
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map = new HashMap();
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI.class, (Long) null);
        if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalIconCompatParcelizer.write(), map, r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI.class);
        }
        return map;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = true;
            this.ResultReceiver = -1;
            this.PlaybackStateCompat.IconCompatParcelizer();
            RemoteActionCompatParcelizer();
            this.PlaybackStateCompatCustomAction.write();
            this.ComponentActivity.clear();
        }
    }

    public final r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI read() {
        return this.PlaybackStateCompatCustomAction.read();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.MediaBrowserCompatMediaItem;
        r8lambdasW1kjTfLCAbvSoQYVDN9aNo31jo r8lambdasw1kjtflcabvsoqyvdn9ano31jo = new r8lambdasW1kjTfLCAbvSoQYVDN9aNo31jo(this, readandroid_sdk_base_releaseVar);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.RemoteActionCompatParcelizer;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, r8lambdasw1kjtflcabvsoqyvdn9ano31jo);
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(invokeSuspendlambda0.class, new r8lambda_m4s0FIhwe07JEl0zgGGZ2HhHI(this, readandroid_sdk_base_releaseVar, this.MediaSessionCompatResultReceiverWrapper));
        getanalyticsenabledenterannotations.read(ControlMessage.CONFIGURATION_UPDATED, new r8lambdawBrKwWasLyyD1y67ddXVRT4D0A(this, readandroid_sdk_base_releaseVar));
    }

    public static void c(r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs r8lambda7d1kk4szdotwipf3xpnkewsbnbs) {
        r8lambda7d1kk4szdotwipf3xpnkewsbnbs.MediaSessionCompatQueueItem.IconCompatParcelizer("Registering the step count listener", new Object[0]);
        r8lambda7d1kk4szdotwipf3xpnkewsbnbs.IconCompatParcelizer(new r8lambdatPe3bWA7ww79d9YcAdnLj_rfMyM());
    }

    public final boolean write() {
        return this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null && this.MediaDescriptionCompat.addObserverForBackInvoker() && this.ParcelableVolumeInfo.serializer() && !this.MediaSessionCompatResultReceiverWrapper.read().contains((byte) 3);
    }

    public final boolean IconCompatParcelizer(r8lambdarAXTMPneU6bGuXRLQL3WE3DesY r8lambdaraxtmpneu6bguxrlql3we3desy) {
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null) {
            return false;
        }
        synchronized (this) {
            if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                this.MediaSessionCompatQueueItem.IconCompatParcelizer("Unable to read step count. SDK is killswitched.", new Object[0]);
                return false;
            }
            int i = this.ResultReceiver;
            if (i != -1) {
                r8lambdaraxtmpneu6bguxrlql3we3desy.IconCompatParcelizer(i);
                return true;
            }
            this.ComponentActivity.add(r8lambdaraxtmpneu6bguxrlql3we3desy);
            if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != null) {
                return true;
            }
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new r8lambdaDSYQr7P8UdxTxS6nrnXJ3tjz5yQ(this);
            boolean zRegisterListener = this.RatingCompat.registerListener(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, 3, this.MediaMetadataCompat.IconCompatParcelizer("step.count.tracker", false).RemoteActionCompatParcelizer());
            if (zRegisterListener) {
                this.PlaybackStateCompat.read();
                this.MediaSessionCompatToken.read("StepCountTracker");
            } else {
                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                this.MediaMetadataCompat.write("step.count.tracker");
                this.ComponentActivity.clear();
                this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Failed to register step count listener", new Object[0]);
            }
            return zRegisterListener;
        }
    }

    public static boolean RatingCompat(r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs r8lambda7d1kk4szdotwipf3xpnkewsbnbs) {
        r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI r8lambdanpc69wzeqaei66oxsnhlebhusqi = r8lambda7d1kk4szdotwipf3xpnkewsbnbs.PlaybackStateCompatCustomAction.read();
        if (r8lambdanpc69wzeqaei66oxsnhlebhusqi == null) {
            return true;
        }
        long jLongValue = r8lambdanpc69wzeqaei66oxsnhlebhusqi.RemoteActionCompatParcelizer.longValue();
        r8lambda7d1kk4szdotwipf3xpnkewsbnbs.serializer.getClass();
        return jLongValue + DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM < System.currentTimeMillis();
    }

    public final void IconCompatParcelizer(long j, int i, int i2, long j2, long j3, boolean z) {
        this.write.getClass();
        O$b o$b = new O$b();
        o$b.serializer = Integer.valueOf(i);
        o$b.read = Integer.valueOf(i2);
        o$b.write = Long.valueOf(j2);
        o$b.RemoteActionCompatParcelizer = Long.valueOf(j3);
        o$b.IconCompatParcelizer = Boolean.valueOf(z);
        r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI r8lambdanpc69wzeqaei66oxsnhlebhusqiWrite = o$b.write();
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(j);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0._init_lambda1 = r8lambdanpc69wzeqaei66oxsnhlebhusqiWrite;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        this.RemoteActionCompatParcelizer.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
        O$b o$b2 = new O$b();
        o$b2.serializer = Integer.valueOf(i);
        o$b2.read = Integer.valueOf(i2);
        o$b2.write = Long.valueOf(j2);
        o$b2.RemoteActionCompatParcelizer = Long.valueOf(j3);
        o$b2.IconCompatParcelizer = Boolean.valueOf(z);
        this.PlaybackStateCompatCustomAction.IconCompatParcelizer(o$b2.write());
    }

    public final void RemoteActionCompatParcelizer(Runnable runnable) {
        if (IconCompatParcelizer(new r8lambda7ntmeWuzpoGpnijJy3eVfXjye58(this, this.PlaybackStateCompatCustomAction.read(), runnable))) {
            return;
        }
        IconCompatParcelizer(runnable);
    }

    @Override // o.handleHmsRemoteMessageDatalambda1
    public final void serializer(long j, Class cls) {
        if (write()) {
            this.MediaSessionCompatQueueItem.IconCompatParcelizer("Moving state changed. Requesting step count.", new Object[0]);
            RemoteActionCompatParcelizer((Runnable) null);
        }
    }
}
