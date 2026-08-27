package o;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambdaDSYQr7P8UdxTxS6nrnXJ3tjz5yQ implements SensorEventListener {
    final /* synthetic */ r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs write;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public r8lambdaDSYQr7P8UdxTxS6nrnXJ3tjz5yQ(r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs r8lambda7d1kk4szdotwipf3xpnkewsbnbs) {
        this.write = r8lambda7d1kk4szdotwipf3xpnkewsbnbs;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        ArrayList arrayList;
        int i = (int) sensorEvent.values[0];
        synchronized (this.write) {
            this.write.ResultReceiver = i;
        }
        synchronized (this.write) {
            arrayList = new ArrayList(this.write.ComponentActivity);
            this.write.ComponentActivity.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((r8lambdarAXTMPneU6bGuXRLQL3WE3DesY) it.next()).IconCompatParcelizer(i);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.write.PlaybackStateCompat.IconCompatParcelizer();
    }
}
