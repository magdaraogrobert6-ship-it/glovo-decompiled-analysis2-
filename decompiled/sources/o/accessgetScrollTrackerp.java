package o;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import com.huawei.riemann.gnsslocation.core.bean.sensor.SensorAccInput;
import com.huawei.riemann.gnsslocation.core.bean.sensor.SensorGyroInput;
import com.huawei.riemann.gnsslocation.core.bean.sensor.SensorGyroUncalInput;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetScrollTrackerp implements SensorEventListener {
    public final /* synthetic */ ComposeScrollCaptureCallback write;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        TreeMap treeMap;
        Long lValueOf;
        Object objBuild;
        ComposeScrollCaptureCallback composeScrollCaptureCallback = this.write;
        synchronized (composeScrollCaptureCallback.MediaMetadataCompat) {
            int type = sensorEvent.sensor.getType();
            float[] fArr = sensorEvent.values;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            if (type != 1) {
                if (type != 4) {
                    if (type == 16 && fArr.length >= 6) {
                        if (composeScrollCaptureCallback.IconCompatParcelizer.size() > 1000) {
                            TreeMap treeMap2 = composeScrollCaptureCallback.IconCompatParcelizer;
                            treeMap2.remove(treeMap2.firstKey());
                        }
                        treeMap = composeScrollCaptureCallback.IconCompatParcelizer;
                        lValueOf = Long.valueOf(jElapsedRealtimeNanos);
                        objBuild = SensorGyroUncalInput.Builder.aSensorGyroUncalInput().withUgx(fArr[0]).withUgy(fArr[1]).withUgz(fArr[2]).withBiasx(fArr[3]).withBiasy(fArr[4]).withBiasz(fArr[5]).withBt(jElapsedRealtimeNanos / 1000000).build();
                        treeMap.put(lValueOf, objBuild);
                    }
                } else if (fArr.length >= 3) {
                    if (composeScrollCaptureCallback.serializer.size() > 1000) {
                        TreeMap treeMap3 = composeScrollCaptureCallback.serializer;
                        treeMap3.remove(treeMap3.firstKey());
                    }
                    treeMap = composeScrollCaptureCallback.serializer;
                    lValueOf = Long.valueOf(jElapsedRealtimeNanos);
                    objBuild = SensorGyroInput.Builder.aSensorGyroInput().withGx(fArr[0]).withGy(fArr[1]).withGz(fArr[2]).withBootTime(jElapsedRealtimeNanos / 1000000).build();
                    treeMap.put(lValueOf, objBuild);
                }
            } else if (fArr.length >= 3) {
                if (composeScrollCaptureCallback.RemoteActionCompatParcelizer.size() > 1000) {
                    TreeMap treeMap4 = composeScrollCaptureCallback.RemoteActionCompatParcelizer;
                    treeMap4.remove(treeMap4.firstKey());
                }
                treeMap = composeScrollCaptureCallback.RemoteActionCompatParcelizer;
                lValueOf = Long.valueOf(jElapsedRealtimeNanos);
                objBuild = SensorAccInput.Builder.aSensorAccInput().withAx(fArr[0]).withAy(fArr[1]).withAz(fArr[2]).withBootTime(jElapsedRealtimeNanos / 1000000).build();
                treeMap.put(lValueOf, objBuild);
            }
        }
    }

    public accessgetScrollTrackerp(ComposeScrollCaptureCallback composeScrollCaptureCallback) {
        this.write = composeScrollCaptureCallback;
    }
}
