package o;

import com.sentiance.core.model.events.R0$b;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getShouldPersistWebView implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final BrazeCompanionExternalSyntheticLambda21 read = new BrazeCompanionExternalSyntheticLambda21(20);
    public final Map serializer;

    public final int hashCode() {
        return (this.serializer.hashCode() ^ 16777619) * (-2128831035);
    }

    public getShouldPersistWebView(R0$b r0$b) {
        this.serializer = Collections.unmodifiableMap(r0$b.read);
    }

    public final String toString() {
        return SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(new StringBuilder("TripMetadataEvent{metadata="), this.serializer, "}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof getShouldPersistWebView)) {
            return false;
        }
        Object obj2 = ((getShouldPersistWebView) obj).serializer;
        Map map = this.serializer;
        return map == obj2 || map.equals(obj2);
    }
}
