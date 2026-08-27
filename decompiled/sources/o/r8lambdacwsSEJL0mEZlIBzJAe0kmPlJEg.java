package o;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.sentiance.sdk.sensorstream.SensorType;

/* JADX INFO: loaded from: classes3.dex */
class r8lambdacwsSEJL0mEZlIBzJAe0kmPlJEg extends onResumelambda0 {
    private final String IconCompatParcelizer;
    private final readList RemoteActionCompatParcelizer;
    private final SensorManager read;
    private final int write;

    @Override // o.onResumelambda0
    public final void write() {
        this.read.unregisterListener(this);
        RemoteActionCompatParcelizer();
        this.RemoteActionCompatParcelizer.write(this.IconCompatParcelizer);
    }

    @Override // o.onResumelambda0
    public void read(float[] fArr, long j) {
        serializer().serializer(fArr, j);
    }

    @Override // o.onResumelambda0
    public final void read() {
        int i = (int) ((1.0d / ((double) this.write)) * 1000000.0d);
        this.read.registerListener(this, IconCompatParcelizer(), i, this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.IconCompatParcelizer, false).RemoteActionCompatParcelizer());
    }

    public r8lambdacwsSEJL0mEZlIBzJAe0kmPlJEg(SensorManager sensorManager, Sensor sensor, SensorType sensorType, parseLonglambda0 parselonglambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getVerticalAccuracy getverticalaccuracy, int i, int i2, readList readlist, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, int i3) {
        super(sensor, sensorType, getanalyticsenabledenterannotations, parselonglambda0, readandroid_sdk_base_releaseVar, getverticalaccuracy, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, i, i2, i3);
        this.read = sensorManager;
        this.write = i;
        this.IconCompatParcelizer = "Sensor-" + sensorType.name();
        this.RemoteActionCompatParcelizer = readlist;
    }
}
