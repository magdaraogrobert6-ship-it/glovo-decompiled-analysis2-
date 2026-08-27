package o;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.SystemClock;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.sensorstream.SensorType;
import com.sentiance.sdk.services.ServiceManager;
import com.sentiance.sdk.threading.executors.Executors;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "ContinuousSensorStream")
public class BrazePushReceiverCompanionExternalSyntheticLambda1 {
    private final getAnalyticsEnabledEnterannotations IconCompatParcelizer;
    private final ServiceManager MediaBrowserCompatMediaItem;
    private final getVerticalAccuracy MediaDescriptionCompat;
    private final Executors MediaMetadataCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaSessionCompatQueueItem;
    private final r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0 MediaSessionCompatResultReceiverWrapper;
    private final ConfigurationManager ParcelableVolumeInfo;
    private final SensorManager RatingCompat;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 RemoteActionCompatParcelizer;
    private final readList read;
    private final parseLonglambda0 serializer;
    private final Context write;
    private final HashMap PlaybackStateCompat = new HashMap();
    private final HashSet PlaybackStateCompatCustomAction = new HashSet();
    private final EnumMap<SensorType, readandroid_sdk_base_release> MediaSessionCompatToken = new EnumMap<>(SensorType.class);

    public final void IconCompatParcelizer(BannerExternalSyntheticLambda0 bannerExternalSyntheticLambda0) {
        synchronized (this) {
            handleReceivedIntentdefault handlereceivedintentdefault = new handleReceivedIntentdefault(bannerExternalSyntheticLambda0.serializer(), bannerExternalSyntheticLambda0.RemoteActionCompatParcelizer());
            HashMap map = this.PlaybackStateCompat;
            map.remove(handlereceivedintentdefault.IconCompatParcelizer());
            map.put(handlereceivedintentdefault.IconCompatParcelizer(), handlereceivedintentdefault);
            read();
        }
    }

    public final void serializer() {
        synchronized (this) {
            this.PlaybackStateCompat.clear();
            read();
        }
    }

    private void IconCompatParcelizer(SensorType sensorType) {
        logNotificationMetadataandroid_sdk_ui_release lognotificationmetadataandroid_sdk_ui_release;
        HashSet hashSet = this.PlaybackStateCompatCustomAction;
        Iterator it = hashSet.iterator();
        do {
            if (!it.hasNext()) {
                lognotificationmetadataandroid_sdk_ui_release = null;
                break;
            }
            lognotificationmetadataandroid_sdk_ui_release = (logNotificationMetadataandroid_sdk_ui_release) it.next();
        } while (lognotificationmetadataandroid_sdk_ui_release.write() != sensorType);
        if (lognotificationmetadataandroid_sdk_ui_release != null) {
            this.serializer.IconCompatParcelizer("Stopping %s", sensorType.name());
            lognotificationmetadataandroid_sdk_ui_release.read().write();
            hashSet.remove(lognotificationmetadataandroid_sdk_ui_release);
        }
    }

    public BrazePushReceiverCompanionExternalSyntheticLambda1(parseLonglambda0 parselonglambda0, Context context, getVerticalAccuracy getverticalaccuracy, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, readList readlist, Executors executors, SensorManager sensorManager, ServiceManager serviceManager, ConfigurationManager configurationManager, r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0 r8lambdabeyxiieovxeplp1oh2wlzr3abd0) {
        this.RemoteActionCompatParcelizer = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.serializer = parselonglambda0;
        this.write = context;
        this.IconCompatParcelizer = getanalyticsenabledenterannotations;
        this.read = readlist;
        this.MediaMetadataCompat = executors;
        this.MediaDescriptionCompat = getverticalaccuracy;
        this.MediaSessionCompatQueueItem = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.RatingCompat = sensorManager;
        this.MediaBrowserCompatMediaItem = serviceManager;
        this.MediaSessionCompatResultReceiverWrapper = r8lambdabeyxiieovxeplp1oh2wlzr3abd0;
        this.ParcelableVolumeInfo = configurationManager;
    }

    private void read() {
        onResumelambda0 r8lambdacwssejl0mezlibzjae0kmpljeg;
        logNotificationMetadataandroid_sdk_ui_release lognotificationmetadataandroid_sdk_ui_release;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = this.PlaybackStateCompatCustomAction;
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            hashSet.add(((logNotificationMetadataandroid_sdk_ui_release) it.next()).write());
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it2 = this.PlaybackStateCompat.values().iterator();
        while (it2.hasNext()) {
            for (Map.Entry<SensorType, Integer> entry : ((handleReceivedIntentdefault) it2.next()).RemoteActionCompatParcelizer().entrySet()) {
                SensorType key = entry.getKey();
                Integer value = entry.getValue();
                int iIntValue = value.intValue();
                Integer num = (Integer) map2.get(key);
                if (num == null || num.intValue() < iIntValue) {
                    map2.put(key, value);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            SensorType sensorType = (SensorType) entry2.getKey();
            Integer num2 = (Integer) entry2.getValue();
            int iIntValue2 = num2.intValue();
            hashSet.remove(sensorType);
            Iterator it3 = hashSet2.iterator();
            do {
                if (!it3.hasNext()) {
                    lognotificationmetadataandroid_sdk_ui_release = null;
                    break;
                }
                lognotificationmetadataandroid_sdk_ui_release = (logNotificationMetadataandroid_sdk_ui_release) it3.next();
            } while (lognotificationmetadataandroid_sdk_ui_release.write() != sensorType);
            Integer numValueOf = lognotificationmetadataandroid_sdk_ui_release != null ? Integer.valueOf(lognotificationmetadataandroid_sdk_ui_release.RemoteActionCompatParcelizer()) : null;
            if (numValueOf == null || numValueOf.intValue() != iIntValue2) {
                map.put(sensorType, num2);
            }
        }
        Iterator it4 = hashSet.iterator();
        while (it4.hasNext()) {
            IconCompatParcelizer((SensorType) it4.next());
        }
        boolean zIsEmpty = map.isEmpty();
        ServiceManager serviceManager = this.MediaBrowserCompatMediaItem;
        r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4 = this.RemoteActionCompatParcelizer;
        if (!zIsEmpty) {
            r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4.read();
            serviceManager.read("ContinuousSensorStream");
            for (Map.Entry entry3 : map.entrySet()) {
                SensorType sensorType2 = (SensorType) entry3.getKey();
                int iIntValue3 = ((Integer) entry3.getValue()).intValue();
                IconCompatParcelizer(sensorType2);
                Sensor androidSensor = sensorType2.toAndroidSensor(this.RatingCompat);
                parseLonglambda0 parselonglambda0 = this.serializer;
                if (androidSensor != null) {
                    parselonglambda0.IconCompatParcelizer("Starting %s", sensorType2.name());
                    this.ParcelableVolumeInfo.getClass();
                    parseLonglambda0 parselonglambda1 = new parseLonglambda0(this.write, "SensorValuesAggregator-" + sensorType2.name(), this.MediaSessionCompatQueueItem, this.MediaSessionCompatResultReceiverWrapper);
                    boolean zEquals = sensorType2.equals(SensorType.QUATERNION);
                    Executors executors = this.MediaMetadataCompat;
                    EnumMap<SensorType, readandroid_sdk_base_release> enumMap = this.MediaSessionCompatToken;
                    if (zEquals) {
                        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = enumMap.get(sensorType2);
                        if (readandroid_sdk_base_releaseVar == null) {
                            readandroid_sdk_base_releaseVar = executors.read();
                            enumMap.put(sensorType2, readandroid_sdk_base_releaseVar);
                        }
                        r8lambdacwssejl0mezlibzjae0kmpljeg = new r8lambdaOHBP9Z7RkfUShAxt47kMFOoFqn0(this.RatingCompat, androidSensor, sensorType2, parselonglambda1, this.MediaSessionCompatQueueItem, this.IconCompatParcelizer, this.MediaDescriptionCompat, iIntValue3, 10, this.read, readandroid_sdk_base_releaseVar);
                    } else {
                        readandroid_sdk_base_release readandroid_sdk_base_releaseVar2 = enumMap.get(sensorType2);
                        if (readandroid_sdk_base_releaseVar2 == null) {
                            readandroid_sdk_base_releaseVar2 = executors.read();
                            enumMap.put(sensorType2, readandroid_sdk_base_releaseVar2);
                        }
                        r8lambdacwssejl0mezlibzjae0kmpljeg = new r8lambdacwsSEJL0mEZlIBzJAe0kmPlJEg(this.RatingCompat, androidSensor, sensorType2, parselonglambda1, this.MediaSessionCompatQueueItem, this.IconCompatParcelizer, this.MediaDescriptionCompat, iIntValue3, 10, this.read, readandroid_sdk_base_releaseVar2, 3);
                    }
                    hashSet2.add(new logNotificationMetadataandroid_sdk_ui_release(sensorType2, iIntValue3, r8lambdacwssejl0mezlibzjae0kmpljeg));
                    r8lambdacwssejl0mezlibzjae0kmpljeg.RemoteActionCompatParcelizer(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
                } else {
                    parselonglambda0.IconCompatParcelizer("No %s sensor", sensorType2.name());
                }
            }
            return;
        }
        if (map2.isEmpty()) {
            r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4.IconCompatParcelizer();
            serviceManager.write("ContinuousSensorStream");
        }
    }

    public final void read(getBannerId getbannerid) {
        synchronized (this) {
            this.PlaybackStateCompat.remove(getbannerid.RemoteActionCompatParcelizer());
            read();
        }
    }
}
