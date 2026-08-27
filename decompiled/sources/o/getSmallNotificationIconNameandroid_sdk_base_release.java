package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getSmallNotificationIconNameandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Map serializer;

    public getSmallNotificationIconNameandroid_sdk_base_release(com.airbnb.lottie.PerformanceTracker performanceTracker) {
        HashMap map = performanceTracker.IconCompatParcelizer;
        this.serializer = map == null ? null : Collections.unmodifiableMap(map);
    }

    public final String toString() {
        return SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(new StringBuilder("BusProperties{metadata="), this.serializer, "}");
    }

    public final int hashCode() {
        Map map = this.serializer;
        return ((map == null ? 0 : map.hashCode()) ^ 16777619) * (-2128831035);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof getSmallNotificationIconNameandroid_sdk_base_release)) {
            return false;
        }
        Object obj2 = ((getSmallNotificationIconNameandroid_sdk_base_release) obj).serializer;
        Map map = this.serializer;
        return map == obj2 || (map != null && map.equals(obj2));
    }
}
