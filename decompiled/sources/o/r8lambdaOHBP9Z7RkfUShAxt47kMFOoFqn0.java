package o;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.sentiance.sdk.sensorstream.SensorType;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaOHBP9Z7RkfUShAxt47kMFOoFqn0 extends r8lambdacwsSEJL0mEZlIBzJAe0kmPlJEg {

    public static final class IconCompatParcelizer {
        public IconCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // o.r8lambdacwsSEJL0mEZlIBzJAe0kmPlJEg, o.onResumelambda0
    public final void read(float[] fArr, long j) {
        float[] fArr2 = new float[4];
        SensorManager.getQuaternionFromVector(fArr2, fArr);
        serializer().serializer(fArr2, j);
    }

    static {
        new IconCompatParcelizer(null);
    }

    public r8lambdaOHBP9Z7RkfUShAxt47kMFOoFqn0(SensorManager sensorManager, Sensor sensor, SensorType sensorType, parseLonglambda0 parselonglambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getVerticalAccuracy getverticalaccuracy, int i, int i2, readList readlist, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(sensorManager, sensor, sensorType, parselonglambda0, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getanalyticsenabledenterannotations, getverticalaccuracy, i, i2, readlist, readandroid_sdk_base_releaseVar, 4);
    }
}
