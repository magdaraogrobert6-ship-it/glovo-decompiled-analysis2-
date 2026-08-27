package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class isGeofencesEnabledandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Map read;

    public isGeofencesEnabledandroid_sdk_base_release(com.airbnb.lottie.PerformanceTracker performanceTracker) {
        HashMap map = performanceTracker.IconCompatParcelizer;
        this.read = map == null ? null : Collections.unmodifiableMap(map);
    }

    public final String toString() {
        return SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(new StringBuilder("TrainProperties{metadata="), this.read, "}");
    }

    public final int hashCode() {
        Map map = this.read;
        return ((map == null ? 0 : map.hashCode()) ^ 16777619) * (-2128831035);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof isGeofencesEnabledandroid_sdk_base_release)) {
            return false;
        }
        Object obj2 = ((isGeofencesEnabledandroid_sdk_base_release) obj).read;
        Map map = this.read;
        return map == obj2 || (map != null && map.equals(obj2));
    }
}
