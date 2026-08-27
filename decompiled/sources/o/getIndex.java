package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class getIndex {
    public final Set serializer;

    public final int hashCode() {
        return this.serializer.hashCode() + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(Boolean.hashCode(false) * 31, 31, false), 31, false), 31, false);
    }

    public getIndex(Set set) {
        this.serializer = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getIndex) && this.serializer.equals(((getIndex) obj).serializer);
    }

    public final String toString() {
        return "ScreenPerformanceConfig(trackRichContentLoad=false, trackScreenMemoryUsage=false, isManualActivityPreCreated=false, trackTapResponse=false, excludeList=" + this.serializer + ")";
    }
}
