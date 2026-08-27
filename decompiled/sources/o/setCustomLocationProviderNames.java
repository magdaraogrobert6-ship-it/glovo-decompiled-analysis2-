package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomLocationProviderNames implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setDefaultNotificationChannelNameandroid_sdk_base_release RemoteActionCompatParcelizer = new setDefaultNotificationChannelNameandroid_sdk_base_release(13);
    public final Map serializer;

    public setCustomLocationProviderNames(com.airbnb.lottie.PerformanceTracker performanceTracker) {
        HashMap map = performanceTracker.IconCompatParcelizer;
        this.serializer = map == null ? null : Collections.unmodifiableMap(map);
    }

    public final String toString() {
        return SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(new StringBuilder("TripPayloadConfig{sensor_sampling_rates="), this.serializer, "}");
    }

    public final int hashCode() {
        Map map = this.serializer;
        return ((map == null ? 0 : map.hashCode()) ^ 16777619) * (-2128831035);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof setCustomLocationProviderNames)) {
            return false;
        }
        Object obj2 = ((setCustomLocationProviderNames) obj).serializer;
        Map map = this.serializer;
        return map == obj2 || (map != null && map.equals(obj2));
    }
}
