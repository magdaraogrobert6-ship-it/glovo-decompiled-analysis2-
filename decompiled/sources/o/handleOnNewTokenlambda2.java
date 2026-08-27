package o;

import android.location.Location;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.wg$$ExternalSyntheticLambda0;
import com.deliveryhero.fwf_http.ConstantKt;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "LikelyStationaryDetector")
public class handleOnNewTokenlambda2 implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final getCooldownEnterSeconds IconCompatParcelizer;
    private final migrateTriggersReeligibilityToJsonlambda4<handleBrazeRemoteMessagelambda4> MediaBrowserCompatMediaItem;
    private long MediaDescriptionCompat = 0;
    private final component4android_sdk_base_release MediaMetadataCompat;
    private final readandroid_sdk_base_release MediaSessionCompatQueueItem;
    private final ConfigurationManager RatingCompat;
    private final getVerticalAccuracy RemoteActionCompatParcelizer;
    private final getAnalyticsEnabledEnterannotations read;
    private final parseLonglambda0 serializer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI write;

    public static handleBrazeRemoteMessagelambda4 IconCompatParcelizer(handleOnNewTokenlambda2 handleonnewtokenlambda2, long j) {
        synchronized (handleonnewtokenlambda2) {
            getCooldownEnterSeconds getcooldownenterseconds = handleonnewtokenlambda2.IconCompatParcelizer;
            List<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> list = invokeFallbackFirebaseServicelambda2.IconCompatParcelizer;
            Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = getcooldownenterseconds.RemoteActionCompatParcelizer(list, Long.valueOf(j), true);
            if (!optionalRemoteActionCompatParcelizer.IconCompatParcelizer()) {
                return null;
            }
            getVerticalAccuracy getverticalaccuracy = handleonnewtokenlambda2.RemoteActionCompatParcelizer;
            int iMediaSessionCompatQueueItem = optionalRemoteActionCompatParcelizer.write().MediaSessionCompatQueueItem();
            getverticalaccuracy.getClass();
            if (getVerticalAccuracy.write(iMediaSessionCompatQueueItem) == setShouldPersistWebView.class) {
                Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer2 = handleonnewtokenlambda2.IconCompatParcelizer.RemoteActionCompatParcelizer(list, Long.valueOf(optionalRemoteActionCompatParcelizer.write().serializer()), false);
                if (optionalRemoteActionCompatParcelizer2.IconCompatParcelizer()) {
                    getVerticalAccuracy getverticalaccuracy2 = handleonnewtokenlambda2.RemoteActionCompatParcelizer;
                    int iMediaSessionCompatQueueItem2 = optionalRemoteActionCompatParcelizer2.write().MediaSessionCompatQueueItem();
                    getverticalaccuracy2.getClass();
                    Class clsWrite = getVerticalAccuracy.write(iMediaSessionCompatQueueItem2);
                    if (clsWrite == r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class || clsWrite == BrazeBootReceiver.class) {
                        return new handleBrazeRemoteMessagelambda4(clsWrite, Long.valueOf(optionalRemoteActionCompatParcelizer2.write().RemoteActionCompatParcelizer()), Long.valueOf(optionalRemoteActionCompatParcelizer2.write().serializer()));
                    }
                }
            }
            getVerticalAccuracy getverticalaccuracy3 = handleonnewtokenlambda2.RemoteActionCompatParcelizer;
            int iMediaSessionCompatQueueItem3 = optionalRemoteActionCompatParcelizer.write().MediaSessionCompatQueueItem();
            getverticalaccuracy3.getClass();
            Class clsWrite2 = getVerticalAccuracy.write(iMediaSessionCompatQueueItem3);
            if (clsWrite2 == null) {
                return null;
            }
            return new handleBrazeRemoteMessagelambda4(clsWrite2, Long.valueOf(optionalRemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer()), Long.valueOf(optionalRemoteActionCompatParcelizer.write().serializer()));
        }
    }

    private long write(long j) {
        synchronized (this) {
            this.write.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() - (j + 120000);
            handleBrazeRemoteMessagelambda4 handlebrazeremotemessagelambda4 = this.MediaBrowserCompatMediaItem.read();
            if (handlebrazeremotemessagelambda4 == null) {
                return jCurrentTimeMillis - DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
            }
            return Math.max(jCurrentTimeMillis - DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, handlebrazeremotemessagelambda4.read - DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map;
        synchronized (this) {
            map = new HashMap();
            handleBrazeRemoteMessagelambda4 handlebrazeremotemessagelambda4 = this.MediaBrowserCompatMediaItem.read();
            if (handlebrazeremotemessagelambda4 != null) {
                map.put(handlebrazeremotemessagelambda4.IconCompatParcelizer, Long.valueOf(handlebrazeremotemessagelambda4.read));
                ConfigurationManager configurationManager = this.RatingCompat;
                map.put(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, Long.valueOf(write(Math.max(configurationManager.onBackPressedDispatcher_delegatelambda010(), configurationManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus()))));
            }
        }
        return map;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            this.MediaBrowserCompatMediaItem.IconCompatParcelizer(null);
            this.MediaDescriptionCompat = 0L;
        }
    }

    public final invokeFallbackFirebaseServicelambda1 IconCompatParcelizer(Location location) {
        Location location2;
        synchronized (this) {
            handleBrazeRemoteMessagelambda4 handlebrazeremotemessagelambda4 = this.MediaBrowserCompatMediaItem.read();
            float accuracy = location.getAccuracy();
            ConfigurationManager configurationManager = this.RatingCompat;
            long jR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = accuracy <= 500.0f ? configurationManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() : Math.max(configurationManager.onBackPressedDispatcher_delegatelambda010(), configurationManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus());
            ArrayList<Location> arrayListIconCompatParcelizer = IconCompatParcelizer(jR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
            ArrayList arrayList = new ArrayList();
            for (Location location3 : arrayListIconCompatParcelizer) {
                if (arrayList.size() >= 2 && read(arrayList) >= jR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus - DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                    break;
                }
                arrayList.add(location3);
            }
            if (arrayList.size() < 2) {
                return null;
            }
            Location location4 = new Location((Location) arrayListIconCompatParcelizer.get(0));
            ArrayList arrayListWrite = write(arrayList, location4);
            int iRound = Math.round((arrayListWrite.size() * 100.0f) / arrayList.size());
            boolean z = iRound >= (arrayList.size() <= 3 ? 60 : arrayList.size() <= 4 ? 75 : 80);
            long j = read(arrayListWrite);
            boolean z2 = j >= jR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus - DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM && z;
            this.serializer.IconCompatParcelizer("Number of location within 50m of the centroid is %d%% or %d/%d, covering a time span of %d secs. %s", Integer.valueOf(iRound), Integer.valueOf(arrayListWrite.size()), Integer.valueOf(arrayList.size()), Long.valueOf(j / 1000), z2 ? "Good enough." : "Not good enough");
            if (!z2) {
                return null;
            }
            Iterator it = arrayListIconCompatParcelizer.iterator();
            do {
                if (!it.hasNext()) {
                    ArrayList arrayList2 = new ArrayList(arrayListIconCompatParcelizer);
                    Collections.sort(arrayList2, new wg$$ExternalSyntheticLambda0(25));
                    location2 = (Location) arrayList2.get(0);
                    break;
                }
                location2 = (Location) it.next();
            } while (location2.getAccuracy() > 120.0f);
            long time = ((Location) arrayListWrite.get(arrayListWrite.size() - 1)).getTime();
            if (location2.getTime() > time) {
                location2.setTime(time);
            }
            if (handlebrazeremotemessagelambda4 != null) {
                Optional optionalWrite = this.IconCompatParcelizer.write(handlebrazeremotemessagelambda4.write, invokeFallbackFirebaseServicelambda2.IconCompatParcelizer, true);
                if (optionalWrite.IconCompatParcelizer()) {
                    location2.setTime(Math.max(((getCooldownEnterSeconds.read) optionalWrite.write()).serializer() + 1, location2.getTime()));
                }
            }
            write(location2);
            if (handlebrazeremotemessagelambda4 != null) {
                location2.setTime(Math.max(location2.getTime(), handlebrazeremotemessagelambda4.write + 60000));
            }
            long time2 = location2.getTime();
            this.write.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            parseLonglambda0 parselonglambda0 = this.serializer;
            if (time2 > jCurrentTimeMillis) {
                parselonglambda0.IconCompatParcelizer("Postponing the stationary, because its start time adjustment puts it in the future.", new Object[0]);
                return null;
            }
            parselonglambda0.IconCompatParcelizer("Returning %f,%f acc=%d time=%d as the likely stationary location", Double.valueOf(location2.getLatitude()), Double.valueOf(location2.getLongitude()), Integer.valueOf((int) location2.getAccuracy()), Long.valueOf(location2.getTime()));
            this.RemoteActionCompatParcelizer.getClass();
            BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4Serializer = getVerticalAccuracy.serializer(location2);
            this.RemoteActionCompatParcelizer.getClass();
            return new invokeFallbackFirebaseServicelambda1(brazeCompanionExternalSyntheticLambda4Serializer, getVerticalAccuracy.serializer(location4));
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.write.getClass();
        this.MediaDescriptionCompat = System.currentTimeMillis();
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.MediaSessionCompatQueueItem;
        handleOnNewTokenlambda0 handleonnewtokenlambda0 = new handleOnNewTokenlambda0(this, readandroid_sdk_base_releaseVar);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.read;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, handleonnewtokenlambda0);
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new invokeFallbackFirebaseServicelambda0(this, readandroid_sdk_base_releaseVar));
    }

    public handleOnNewTokenlambda2(parseLonglambda0 parselonglambda0, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getCooldownEnterSeconds getcooldownenterseconds, getVerticalAccuracy getverticalaccuracy, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, component4android_sdk_base_release component4android_sdk_base_releaseVar, ConfigurationManager configurationManager, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        this.serializer = parselonglambda0;
        this.read = getanalyticsenabledenterannotations;
        this.MediaSessionCompatQueueItem = readandroid_sdk_base_releaseVar;
        this.IconCompatParcelizer = getcooldownenterseconds;
        this.RemoteActionCompatParcelizer = getverticalaccuracy;
        this.write = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaMetadataCompat = component4android_sdk_base_releaseVar;
        this.RatingCompat = configurationManager;
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        this.MediaBrowserCompatMediaItem = new handleOnNewTokenlambda1(this, System.currentTimeMillis());
    }

    private static long read(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            return ((Location) arrayList.get(0)).getTime() - ((Location) af$$ExternalSyntheticOutline0.m(1, arrayList)).getTime();
        }
        return 0L;
    }

    public static void serializer(handleOnNewTokenlambda2 handleonnewtokenlambda2, Location location) {
        synchronized (handleonnewtokenlambda2) {
            Class[] clsArr = {wipeDatalambda0.class, r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class};
            handleBrazeRemoteMessagelambda4 handlebrazeremotemessagelambda4 = handleonnewtokenlambda2.MediaBrowserCompatMediaItem.read();
            if (handlebrazeremotemessagelambda4 != null) {
                for (int i = 0; i < 2; i++) {
                    if (handlebrazeremotemessagelambda4.IconCompatParcelizer == clsArr[i]) {
                        handleonnewtokenlambda2.serializer.IconCompatParcelizer("Not calculating likely stationary because we're already stationary", new Object[0]);
                        return;
                    }
                }
            }
            invokeFallbackFirebaseServicelambda1 invokefallbackfirebaseservicelambda1IconCompatParcelizer = handleonnewtokenlambda2.IconCompatParcelizer(location);
            if (invokefallbackfirebaseservicelambda1IconCompatParcelizer != null) {
                handleonnewtokenlambda2.read.IconCompatParcelizer(ControlMessage.LIKELY_STATIONARY, invokefallbackfirebaseservicelambda1IconCompatParcelizer);
            }
        }
    }

    public static void RemoteActionCompatParcelizer(handleOnNewTokenlambda2 handleonnewtokenlambda2, Class cls, long j, long j2) {
        synchronized (handleonnewtokenlambda2) {
            if (cls == setShouldPersistWebView.class) {
                Class[] clsArr = {BrazeBootReceiver.class, r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class};
                handleBrazeRemoteMessagelambda4 handlebrazeremotemessagelambda4 = handleonnewtokenlambda2.MediaBrowserCompatMediaItem.read();
                if (handlebrazeremotemessagelambda4 != null) {
                    for (int i = 0; i < 2; i++) {
                        if (handlebrazeremotemessagelambda4.IconCompatParcelizer == clsArr[i]) {
                            return;
                        }
                    }
                }
            }
            handleonnewtokenlambda2.MediaBrowserCompatMediaItem.IconCompatParcelizer(new handleBrazeRemoteMessagelambda4(cls, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    private ArrayList write(ArrayList arrayList, Location location) {
        ArrayList arrayList2 = new ArrayList();
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Location location2 = (Location) it.next();
            float fDistanceTo = location2.distanceTo(location);
            if (fDistanceTo < 50.0f) {
                arrayList2.add(location2);
            }
            sb.append(String.format(java.util.Locale.ENGLISH, "(%f, %f) => %f, ", Double.valueOf(location2.getLatitude()), Double.valueOf(location2.getLongitude()), Float.valueOf(fDistanceTo)));
        }
        this.serializer.IconCompatParcelizer("Location distances: %s", sb.toString());
        return arrayList2;
    }

    private void write(Location location) {
        long time = location.getTime();
        this.write.getClass();
        List<getCooldownEnterSeconds.read> listRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdaE7oIx09KQauliA8paOfGanE2_e8.class, Long.valueOf(time), Long.valueOf(System.currentTimeMillis()), false, true);
        Long lValueOf = listRemoteActionCompatParcelizer.isEmpty() ? null : Long.valueOf(listRemoteActionCompatParcelizer.get(0).serializer());
        if (lValueOf != null) {
            location.setTime(lValueOf.longValue() + 1);
        }
    }

    public static void serializer(handleOnNewTokenlambda2 handleonnewtokenlambda2) {
        invokeFallbackFirebaseServicelambda3 invokefallbackfirebaseservicelambda3 = new invokeFallbackFirebaseServicelambda3(handleonnewtokenlambda2, handleonnewtokenlambda2.MediaSessionCompatQueueItem);
        HashMap map = new HashMap();
        Iterator<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> it = invokeFallbackFirebaseServicelambda2.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            map.put(it.next(), invokefallbackfirebaseservicelambda3);
        }
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = handleonnewtokenlambda2.read;
        long jCurrentTimeMillis = handleonnewtokenlambda2.MediaDescriptionCompat;
        if (jCurrentTimeMillis <= 0) {
            handleonnewtokenlambda2.write.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        getanalyticsenabledenterannotations.IconCompatParcelizer(map, jCurrentTimeMillis);
    }

    public final long RemoteActionCompatParcelizer() {
        DetectionTrigger detectionTrigger = DetectionTrigger.SDK;
        ConfigurationManager configurationManager = this.RatingCompat;
        return Math.max((((long) configurationManager.read(detectionTrigger).shortValue()) * ConstantKt.DEFAULT_REQUEST_TIMEOUT) + DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, configurationManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() + DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
    }

    private ArrayList IconCompatParcelizer(long j) {
        r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwa;
        r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        List<getCooldownEnterSeconds.read> listRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, Long.valueOf(write(j)), null, false, true);
        Iterator<getCooldownEnterSeconds.read> it = listRemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            hashSet.add(Long.valueOf(it.next().serializer()));
        }
        if (hashSet.size() >= 2) {
            hashSet.clear();
            Location location = null;
            for (int i = 0; i < listRemoteActionCompatParcelizer.size(); i++) {
                r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = listRemoteActionCompatParcelizer.get(i).RemoteActionCompatParcelizer(this.MediaMetadataCompat);
                if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer != null && (r8lambdaibd0azdffjr6m_pevs2l1iejku = (r8lambdaturwertf3otevz1wenzex5tdwa = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer).r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) != null && hashSet.add(r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer)) {
                    BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.RemoteActionCompatParcelizer;
                    this.RemoteActionCompatParcelizer.getClass();
                    Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
                    if (location != null && location.getTime() - locationWrite.getTime() > 300000) {
                        break;
                    }
                    arrayList.add(locationWrite);
                    location = locationWrite;
                }
            }
        }
        return arrayList;
    }
}
