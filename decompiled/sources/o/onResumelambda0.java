package o;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.sentiance.sdk.sensorstream.SensorType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class onResumelambda0 implements SensorEventListener {
    private final getAnalyticsEnabledEnterannotations IconCompatParcelizer;
    private final NotificationTrampolineActivity MediaBrowserCompatMediaItem;
    private final HashMap MediaDescriptionCompat = new HashMap();
    private final getVerticalAccuracy MediaMetadataCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaSessionCompatQueueItem;
    private final int MediaSessionCompatResultReceiverWrapper;
    private long MediaSessionCompatToken;
    private r8lambdadmNir0iKfQv2uYAZ5K1OFOU62iI ParcelableVolumeInfo;
    private Long PlaybackStateCompat;
    private final r8lambdaoqJTd6zX2vbP1MOrSGbf1Qi5V0 RatingCompat;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final SensorType read;
    private final Sensor serializer;
    private final readandroid_sdk_base_release write;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        synchronized (this) {
            if (this.PlaybackStateCompat == null) {
                this.PlaybackStateCompat = Long.valueOf(sensorEvent.timestamp);
            }
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(sensorEvent.values, sensorEvent.timestamp, this);
        }
    }

    public abstract void read();

    public abstract void read(float[] fArr, long j);

    public final r8lambdadmNir0iKfQv2uYAZ5K1OFOU62iI serializer() {
        r8lambdadmNir0iKfQv2uYAZ5K1OFOU62iI r8lambdadmnir0ikfqv2uyaz5k1ofou62ii;
        synchronized (this) {
            if (this.ParcelableVolumeInfo == null) {
                MediaMetadataCompat();
            }
            r8lambdadmnir0ikfqv2uyaz5k1ofou62ii = this.ParcelableVolumeInfo;
        }
        return r8lambdadmnir0ikfqv2uyaz5k1ofou62ii;
    }

    public abstract void write();

    public onResumelambda0(Sensor sensor, SensorType sensorType, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, parseLonglambda0 parselonglambda0, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getVerticalAccuracy getverticalaccuracy, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, int i, int i2, int i3) {
        this.read = sensorType;
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.IconCompatParcelizer = getanalyticsenabledenterannotations;
        this.serializer = sensor;
        this.MediaMetadataCompat = getverticalaccuracy;
        this.MediaSessionCompatQueueItem = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaSessionCompatResultReceiverWrapper = i2;
        r8lambdaoqJTd6zX2vbP1MOrSGbf1Qi5V0 r8lambdaoqjtd6zx2vbp1morsgbf1qi5v0 = new r8lambdaoqJTd6zX2vbP1MOrSGbf1Qi5V0(2, 4, i3);
        this.RatingCompat = r8lambdaoqjtd6zx2vbp1morsgbf1qi5v0;
        this.ParcelableVolumeInfo = r8lambdaoqjtd6zx2vbp1morsgbf1qi5v0.serializer();
        this.write = readandroid_sdk_base_releaseVar;
        this.MediaBrowserCompatMediaItem = new NotificationTrampolineActivity(i3, i, parselonglambda0);
    }

    public final Sensor IconCompatParcelizer() {
        return this.serializer;
    }

    public static Long read(onResumelambda0 onresumelambda0, HashMap map, long j) {
        Iterator it = map.entrySet().iterator();
        Long lValueOf = null;
        Long lValueOf2 = null;
        while (it.hasNext()) {
            long jLongValue = (j / 1000000) - ((Long) ((Map.Entry) it.next()).getValue()).longValue();
            long jAbs = Math.abs(jLongValue);
            if (lValueOf == null || jAbs < lValueOf.longValue()) {
                lValueOf = Long.valueOf(jAbs);
                lValueOf2 = Long.valueOf(jLongValue);
            }
        }
        if (lValueOf != null && lValueOf.longValue() <= 60000) {
            return Long.valueOf(lValueOf2.longValue() + ((Long) map.get((byte) 1)).longValue());
        }
        Long l = onresumelambda0.PlaybackStateCompat;
        if (l != null) {
            return Long.valueOf(((j - l.longValue()) / 1000000) + onresumelambda0.MediaSessionCompatToken);
        }
        onresumelambda0.MediaSessionCompatQueueItem.getClass();
        return Long.valueOf(System.currentTimeMillis());
    }

    public final void write(float[] fArr, long j) {
        if (this.ParcelableVolumeInfo == null) {
            MediaMetadataCompat();
            if (this.ParcelableVolumeInfo == null) {
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("No empty buffer. Discarding sensor data.", new Object[0]);
                return;
            }
        }
        read(fArr, j);
        RemoteActionCompatParcelizer(false);
    }

    public final void RemoteActionCompatParcelizer() {
        synchronized (this) {
            this.MediaBrowserCompatMediaItem.serializer(this);
            RemoteActionCompatParcelizer(true);
        }
    }

    public final void RemoteActionCompatParcelizer(long j, long j2, long j3) {
        HashMap map = this.MediaDescriptionCompat;
        map.put((byte) 1, Long.valueOf(j));
        map.put((byte) 2, Long.valueOf(j2));
        map.put((byte) 3, Long.valueOf(j3));
        this.MediaBrowserCompatMediaItem.write();
        this.MediaSessionCompatQueueItem.getClass();
        this.MediaSessionCompatToken = System.currentTimeMillis();
        read();
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        synchronized (this) {
            r8lambdadmNir0iKfQv2uYAZ5K1OFOU62iI r8lambdadmnir0ikfqv2uyaz5k1ofou62ii = this.ParcelableVolumeInfo;
            if (r8lambdadmnir0ikfqv2uyaz5k1ofou62ii != null) {
                int iWrite = r8lambdadmnir0ikfqv2uyaz5k1ofou62ii.write();
                if (iWrite < 2 || r8lambdadmnir0ikfqv2uyaz5k1ofou62ii.read().get(iWrite - 1).longValue() - r8lambdadmnir0ikfqv2uyaz5k1ofou62ii.read().get(0).longValue() < TimeUnit.SECONDS.toNanos(this.MediaSessionCompatResultReceiverWrapper)) {
                    if (z) {
                    }
                }
                r8lambdadmNir0iKfQv2uYAZ5K1OFOU62iI r8lambdadmnir0ikfqv2uyaz5k1ofou62ii2 = this.ParcelableVolumeInfo;
                this.write.RemoteActionCompatParcelizer(new r8lambdavfaiU2EWz9c32wIPux8xRk42dWk(this, r8lambdadmnir0ikfqv2uyaz5k1ofou62ii2), "SensorValAggr-" + this.read.name());
                MediaMetadataCompat();
            }
        }
    }

    public static HashMap read(onResumelambda0 onresumelambda0, r8lambdadmNir0iKfQv2uYAZ5K1OFOU62iI r8lambdadmnir0ikfqv2uyaz5k1ofou62ii) {
        HashMap map = onresumelambda0.MediaDescriptionCompat;
        if (onresumelambda0.PlaybackStateCompat == null) {
            return map;
        }
        long jLongValue = (r8lambdadmnir0ikfqv2uyaz5k1ofou62ii.read().read(0) - onresumelambda0.PlaybackStateCompat.longValue()) / 1000000;
        HashMap map2 = new HashMap();
        map2.put((byte) 3, Long.valueOf(((Long) map.get((byte) 3)).longValue() + jLongValue));
        map2.put((byte) 2, Long.valueOf(((Long) map.get((byte) 2)).longValue() + jLongValue));
        map2.put((byte) 1, Long.valueOf(((Long) map.get((byte) 1)).longValue() + jLongValue));
        return map2;
    }

    private void MediaMetadataCompat() {
        synchronized (this) {
            this.ParcelableVolumeInfo = this.RatingCompat.serializer();
        }
    }
}
