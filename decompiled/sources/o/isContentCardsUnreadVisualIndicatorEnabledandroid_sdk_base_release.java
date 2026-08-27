package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class isContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Map write;

    public isContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release(com.airbnb.lottie.PerformanceTracker performanceTracker) {
        HashMap map = performanceTracker.IconCompatParcelizer;
        this.write = map == null ? null : Collections.unmodifiableMap(map);
    }

    public final String toString() {
        return SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(new StringBuilder("OnFootProperties{metadata="), this.write, "}");
    }

    public final int hashCode() {
        Map map = this.write;
        return ((map == null ? 0 : map.hashCode()) ^ 16777619) * (-2128831035);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof isContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release)) {
            return false;
        }
        Object obj2 = ((isContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release) obj).write;
        Map map = this.write;
        return map == obj2 || (map != null && map.equals(obj2));
    }
}
