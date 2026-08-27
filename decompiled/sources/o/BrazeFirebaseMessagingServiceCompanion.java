package o;

import android.location.Location;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.util.Optional;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BrazeFirebaseMessagingServiceCompanion {
    static final List<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> RemoteActionCompatParcelizer = Arrays.asList(wipeDatalambda0.class, r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class);
    private Integer ComponentActivity;
    final populateNotificationBuilderlambda1 IconCompatParcelizer;
    private final component4android_sdk_base_release MediaBrowserCompatMediaItem;
    private final getVerticalAccuracy MediaDescriptionCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaMetadataCompat;
    private final getCooldownEnterSeconds MediaSessionCompatQueueItem;
    private final migrateTriggersReeligibilityToJsonlambda1<r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM> MediaSessionCompatResultReceiverWrapper;
    private final getShouldFetchTestTriggers MediaSessionCompatToken;
    private final readandroid_sdk_base_release ParcelableVolumeInfo;
    private long PlaybackStateCompat = 0;
    private r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k PlaybackStateCompatCustomAction;
    private final parseLonglambda0 RatingCompat;
    protected final ConfigurationManager read;
    protected final retrieveRegisteredGeofencesFromLocalStorageandroid_sdk_location_release serializer;
    final getAnalyticsEnabledEnterannotations write;

    private void RemoteActionCompatParcelizer() {
        synchronized (this) {
            r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM r8lambdanfvmncwkeo3bw4nh1rxy5p2jm = this.MediaSessionCompatResultReceiverWrapper.read();
            if (r8lambdanfvmncwkeo3bw4nh1rxy5p2jm.IconCompatParcelizer) {
                this.MediaSessionCompatResultReceiverWrapper.read(new r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM(r8lambdanfvmncwkeo3bw4nh1rxy5p2jm.RemoteActionCompatParcelizer, false));
                this.write.IconCompatParcelizer(ControlMessage.GEOFENCE_STATE_STOP, (Object) null);
            }
        }
    }

    private void RemoteActionCompatParcelizer(r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k r8lambdanclnumohj3w_eprkcj4qjg7b2k, long j) {
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        this.RatingCompat.IconCompatParcelizer("Last moving state was restore", new Object[0]);
        if (r8lambdanclnumohj3w_eprkcj4qjg7b2k.getClass() == r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class) {
            BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = ((r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A) r8lambdanclnumohj3w_eprkcj4qjg7b2k).write;
            this.MediaDescriptionCompat.getClass();
            Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
            locationWrite.setProvider("stationary");
            this.write.IconCompatParcelizer(ControlMessage.ENSURE_STATIONARY_GEOFENCE, locationWrite);
            return;
        }
        if (RemoteActionCompatParcelizer(r8lambdanclnumohj3w_eprkcj4qjg7b2k)) {
            Optional optional = this.MediaSessionCompatQueueItem.read(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class, Long.valueOf(j));
            if (optional.IconCompatParcelizer() && (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = ((getCooldownEnterSeconds.read) optional.write()).RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem)) != null) {
                r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwa = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer;
                if (r8lambdaturwertf3otevz1wenzex5tdwa.fullyDrawnReporter_delegatelambda0 != null && Arrays.asList((byte) 4, (byte) 3, (byte) 8, (byte) 10, (byte) 1).contains(r8lambdaturwertf3otevz1wenzex5tdwa.fullyDrawnReporter_delegatelambda0.read)) {
                    return;
                }
            }
            RemoteActionCompatParcelizer(true);
        }
    }

    private void RemoteActionCompatParcelizer(boolean z) {
        synchronized (this) {
            r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM r8lambdanfvmncwkeo3bw4nh1rxy5p2jm = this.MediaSessionCompatResultReceiverWrapper.read();
            if (z || !r8lambdanfvmncwkeo3bw4nh1rxy5p2jm.IconCompatParcelizer) {
                this.MediaSessionCompatResultReceiverWrapper.read(new r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM(r8lambdanfvmncwkeo3bw4nh1rxy5p2jm.RemoteActionCompatParcelizer, true));
                this.write.IconCompatParcelizer(ControlMessage.GEOFENCE_STATE_RESET, (Object) null);
            }
        }
    }

    public abstract void IconCompatParcelizer();

    public abstract boolean RemoteActionCompatParcelizer(r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k r8lambdanclnumohj3w_eprkcj4qjg7b2k);

    public abstract void read(Location location);

    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map = new HashMap();
        List<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> list = invokeFallbackFirebaseServicelambda2.IconCompatParcelizer;
        this.MediaMetadataCompat.getClass();
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(list, Long.valueOf(System.currentTimeMillis()), false);
        if (optionalRemoteActionCompatParcelizer.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalRemoteActionCompatParcelizer.write(), map, getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer.write(), this.MediaDescriptionCompat));
        }
        return map;
    }

    public final void subscribe() {
        this.MediaMetadataCompat.getClass();
        this.PlaybackStateCompat = System.currentTimeMillis();
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.ParcelableVolumeInfo;
        r8lambdaKfXGqug8le_u7rGS0A6KBzpCzrU r8lambdakfxgqug8le_u7rgs0a6kbzpczru = new r8lambdaKfXGqug8le_u7rGS0A6KBzpCzrU(this, readandroid_sdk_base_releaseVar);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.write;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class, r8lambdakfxgqug8le_u7rgs0a6kbzpczru);
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(invokeSuspendlambda0.class, new r8lambdaWBVilekvEkojJMnnxmOUmVyZHjs(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new r8lambdaNtG5NEKcccOqnooqF6fU4TyhuQo(this, readandroid_sdk_base_releaseVar));
    }

    public final void onKillswitchActivated() {
        synchronized (this) {
            this.PlaybackStateCompat = 0L;
            this.MediaSessionCompatResultReceiverWrapper.read(new r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM(null, false));
            RemoteActionCompatParcelizer();
        }
    }

    public BrazeFirebaseMessagingServiceCompanion(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getCooldownEnterSeconds getcooldownenterseconds, getVerticalAccuracy getverticalaccuracy, parseLonglambda0 parselonglambda0, component4android_sdk_base_release component4android_sdk_base_releaseVar, ConfigurationManager configurationManager, populateNotificationBuilderlambda1 populatenotificationbuilderlambda1, retrieveRegisteredGeofencesFromLocalStorageandroid_sdk_location_release retrieveregisteredgeofencesfromlocalstorageandroid_sdk_location_release, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getShouldFetchTestTriggers getshouldfetchtesttriggers) {
        this.write = getanalyticsenabledenterannotations;
        this.MediaMetadataCompat = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaSessionCompatQueueItem = getcooldownenterseconds;
        this.MediaDescriptionCompat = getverticalaccuracy;
        this.RatingCompat = parselonglambda0;
        this.read = configurationManager;
        this.IconCompatParcelizer = populatenotificationbuilderlambda1;
        this.MediaBrowserCompatMediaItem = component4android_sdk_base_releaseVar;
        this.serializer = retrieveregisteredgeofencesfromlocalstorageandroid_sdk_location_release;
        this.ParcelableVolumeInfo = readandroid_sdk_base_releaseVar;
        this.MediaSessionCompatToken = getshouldfetchtesttriggers;
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        this.MediaSessionCompatResultReceiverWrapper = new r8lambdaFvXm7SghxZVnjM1gtsrin9D1WFY(this, System.currentTimeMillis());
    }

    private void IconCompatParcelizer(r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k r8lambdanclnumohj3w_eprkcj4qjg7b2k) {
        if (RemoteActionCompatParcelizer(r8lambdanclnumohj3w_eprkcj4qjg7b2k)) {
            RemoteActionCompatParcelizer(false);
            return;
        }
        RemoteActionCompatParcelizer();
        if (serializer()) {
            IconCompatParcelizer();
            return;
        }
        Class<?> cls = r8lambdanclnumohj3w_eprkcj4qjg7b2k.getClass();
        getVerticalAccuracy getverticalaccuracy = this.MediaDescriptionCompat;
        if (wipeDatalambda0.class == cls) {
            wipeDatalambda0 wipedatalambda0 = (wipeDatalambda0) r8lambdanclnumohj3w_eprkcj4qjg7b2k;
            BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = wipedatalambda0.serializer;
            if (brazeCompanionExternalSyntheticLambda4 == null) {
                brazeCompanionExternalSyntheticLambda4 = wipedatalambda0.RemoteActionCompatParcelizer;
            }
            getverticalaccuracy.getClass();
            Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
            locationWrite.setProvider("stationary");
            read(locationWrite);
            return;
        }
        if (r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class == r8lambdanclnumohj3w_eprkcj4qjg7b2k.getClass()) {
            BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda5 = ((r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A) r8lambdanclnumohj3w_eprkcj4qjg7b2k).write;
            getverticalaccuracy.getClass();
            Location locationWrite2 = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda5);
            locationWrite2.setProvider("stationary");
            this.write.IconCompatParcelizer(ControlMessage.ENSURE_STATIONARY_GEOFENCE, locationWrite2);
            return;
        }
        r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k r8lambdanclnumohj3w_eprkcj4qjg7b2k2 = this.PlaybackStateCompatCustomAction;
        if (r8lambdanclnumohj3w_eprkcj4qjg7b2k2 == null || !RemoteActionCompatParcelizer.contains(r8lambdanclnumohj3w_eprkcj4qjg7b2k2.getClass())) {
            return;
        }
        IconCompatParcelizer();
    }

    public final boolean serializer() {
        return !this.MediaSessionCompatToken.read();
    }

    public static void serializer(BrazeFirebaseMessagingServiceCompanion brazeFirebaseMessagingServiceCompanion) {
        r8lambdaNTBZsbIdupb1ADp9xGt79E9xKzE r8lambdantbzsbidupb1adp9xgt79e9xkze = new r8lambdaNTBZsbIdupb1ADp9xGt79E9xKzE(brazeFirebaseMessagingServiceCompanion, brazeFirebaseMessagingServiceCompanion.ParcelableVolumeInfo);
        HashMap map = new HashMap();
        Iterator<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> it = invokeFallbackFirebaseServicelambda2.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            map.put(it.next(), r8lambdantbzsbidupb1adp9xgt79e9xkze);
        }
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = brazeFirebaseMessagingServiceCompanion.write;
        long jCurrentTimeMillis = brazeFirebaseMessagingServiceCompanion.PlaybackStateCompat;
        if (jCurrentTimeMillis <= 0) {
            brazeFirebaseMessagingServiceCompanion.MediaMetadataCompat.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        getanalyticsenabledenterannotations.IconCompatParcelizer(map, jCurrentTimeMillis);
    }

    public static void serializer(BrazeFirebaseMessagingServiceCompanion brazeFirebaseMessagingServiceCompanion, boolean z, long j) {
        synchronized (brazeFirebaseMessagingServiceCompanion) {
            r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k r8lambdanclnumohj3w_eprkcj4qjg7b2k = brazeFirebaseMessagingServiceCompanion.MediaSessionCompatResultReceiverWrapper.read().RemoteActionCompatParcelizer;
            if (r8lambdanclnumohj3w_eprkcj4qjg7b2k == null) {
                brazeFirebaseMessagingServiceCompanion.RatingCompat.IconCompatParcelizer("Last moving state event is null", new Object[0]);
                brazeFirebaseMessagingServiceCompanion.write.IconCompatParcelizer(ControlMessage.GEOFENCE_STATE_STOP, (Object) null);
            } else {
                if (z) {
                    brazeFirebaseMessagingServiceCompanion.RemoteActionCompatParcelizer(r8lambdanclnumohj3w_eprkcj4qjg7b2k, j);
                } else {
                    brazeFirebaseMessagingServiceCompanion.IconCompatParcelizer(r8lambdanclnumohj3w_eprkcj4qjg7b2k);
                }
            }
        }
    }

    public static r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k read(BrazeFirebaseMessagingServiceCompanion brazeFirebaseMessagingServiceCompanion, long j) {
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = brazeFirebaseMessagingServiceCompanion.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(invokeFallbackFirebaseServicelambda2.IconCompatParcelizer, Long.valueOf(j), true);
        if (!optionalRemoteActionCompatParcelizer.IconCompatParcelizer() || (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = optionalRemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer(brazeFirebaseMessagingServiceCompanion.MediaBrowserCompatMediaItem)) == null) {
            return null;
        }
        r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwa = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer;
        r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4 r8lambdaqoq3wl0ry1sjdgdfdxhrnvb36l4 = r8lambdaturwertf3otevz1wenzex5tdwa._init_lambda2;
        if (r8lambdaqoq3wl0ry1sjdgdfdxhrnvb36l4 != null) {
            return r8lambdaqoq3wl0ry1sjdgdfdxhrnvb36l4;
        }
        r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A r8lambdadtwa3yx1e9cvszaagaemidzvt8a = r8lambdaturwertf3otevz1wenzex5tdwa.addObserverForBackInvoker;
        if (r8lambdadtwa3yx1e9cvszaagaemidzvt8a != null) {
            return r8lambdadtwa3yx1e9cvszaagaemidzvt8a;
        }
        wipeDatalambda0 wipedatalambda0 = r8lambdaturwertf3otevz1wenzex5tdwa.MediaBrowserCompatMediaItem;
        if (wipedatalambda0 != null) {
            return wipedatalambda0;
        }
        BrazeBootReceiver brazeBootReceiver = r8lambdaturwertf3otevz1wenzex5tdwa._init_lambda3;
        if (brazeBootReceiver != null) {
            return brazeBootReceiver;
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
        return null;
    }

    public static void IconCompatParcelizer(BrazeFirebaseMessagingServiceCompanion brazeFirebaseMessagingServiceCompanion, r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu, Optional optional) {
        if (!brazeFirebaseMessagingServiceCompanion.MediaSessionCompatResultReceiverWrapper.read().IconCompatParcelizer) {
            brazeFirebaseMessagingServiceCompanion.RatingCompat.IconCompatParcelizer("Continuous geofencing is not allowed", new Object[0]);
            return;
        }
        List listAsList = Arrays.asList((byte) 2, (byte) 9);
        Byte b = r8lambdazeccixubf3xvz58yt5bojkwhdu.read;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdazeccixubf3xvz58yt5bojkwhdu.serializer;
        if (listAsList.contains(b)) {
            if ((optional.IconCompatParcelizer() && ((Integer) optional.write()).equals(brazeFirebaseMessagingServiceCompanion.ComponentActivity)) || brazeCompanionExternalSyntheticLambda4 == null) {
                return;
            }
            brazeFirebaseMessagingServiceCompanion.ComponentActivity = optional.IconCompatParcelizer() ? (Integer) optional.write() : null;
            getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = brazeFirebaseMessagingServiceCompanion.write;
            ControlMessage controlMessage = ControlMessage.GEOFENCE_STATE_RESET;
            brazeFirebaseMessagingServiceCompanion.MediaDescriptionCompat.getClass();
            getanalyticsenabledenterannotations.IconCompatParcelizer(controlMessage, getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4));
        }
    }
}
