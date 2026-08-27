package o;

import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.huawei.riemann.gnsslocation.core.bean.sensor.MotionSensors;
import com.huawei.riemann.gnsslocation.core.bean.sensor.SensorAccInput;
import com.huawei.riemann.gnsslocation.core.bean.sensor.SensorGyroInput;
import com.huawei.riemann.gnsslocation.core.bean.sensor.SensorGyroUncalInput;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ComposeScrollCaptureCallback {
    public final accessgetScrollTrackerp MediaBrowserCompatMediaItem;
    public final HandlerThread MediaSessionCompatQueueItem;
    public Handler read;
    public final SensorManager write;
    public final Object MediaMetadataCompat = new Object();
    public final TreeMap RemoteActionCompatParcelizer = new TreeMap();
    public final TreeMap serializer = new TreeMap();
    public final TreeMap IconCompatParcelizer = new TreeMap();

    public final MotionSensors serializer(long j, long j2) {
        synchronized (this.MediaMetadataCompat) {
            if (this.RemoteActionCompatParcelizer.isEmpty() && this.serializer.isEmpty() && this.IconCompatParcelizer.isEmpty()) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SensorProvider", "sensor info is not ready!");
                return null;
            }
            if (j > j2) {
                WrappedCompositionsetContent1211.read("SensorProvider", "TimeStamp input illegal.");
                return null;
            }
            SensorAccInput[] sensorAccInputArr = (SensorAccInput[]) this.RemoteActionCompatParcelizer.subMap(Long.valueOf(j), false, Long.valueOf(j2), true).values().toArray(new SensorAccInput[0]);
            SensorGyroInput[] sensorGyroInputArr = (SensorGyroInput[]) this.serializer.subMap(Long.valueOf(j), false, Long.valueOf(j2), true).values().toArray(new SensorGyroInput[0]);
            SensorGyroUncalInput[] sensorGyroUncalInputArr = (SensorGyroUncalInput[]) this.IconCompatParcelizer.subMap(Long.valueOf(j), false, Long.valueOf(j2), true).values().toArray(new SensorGyroUncalInput[0]);
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SensorProvider", "vdr sensor info acc: " + sensorAccInputArr.length + ", gyro: " + sensorGyroInputArr.length + ", uncal: " + sensorGyroUncalInputArr.length);
            return MotionSensors.Builder.aSensor().withAccInputs(sensorAccInputArr).withGyroInputs(sensorGyroInputArr).withGyroUncalInputs(sensorGyroUncalInputArr).build();
        }
    }

    public ComposeScrollCaptureCallback() {
        accessgetScrollTrackerp accessgetscrolltrackerp = new accessgetScrollTrackerp(this);
        this.MediaBrowserCompatMediaItem = accessgetscrolltrackerp;
        HandlerThread handlerThread = new HandlerThread("Loc-Vdr-sensor");
        this.MediaSessionCompatQueueItem = handlerThread;
        handlerThread.start();
        this.read = new Handler(handlerThread.getLooper());
        Object systemService = placeAtf8xVGno.read().getSystemService("sensor");
        if (systemService instanceof SensorManager) {
            SensorManager sensorManager = (SensorManager) systemService;
            this.write = sensorManager;
            sensorManager.registerListener(accessgetscrolltrackerp, sensorManager.getDefaultSensor(1), 10000, this.read);
            sensorManager.registerListener(accessgetscrolltrackerp, sensorManager.getDefaultSensor(4), 10000, this.read);
            sensorManager.registerListener(accessgetscrolltrackerp, sensorManager.getDefaultSensor(16), 10000, this.read);
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SensorProvider", "RegisterSensor success.");
    }
}
