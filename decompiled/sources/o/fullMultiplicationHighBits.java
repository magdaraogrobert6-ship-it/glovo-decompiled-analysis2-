package o;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class fullMultiplicationHighBits {
    public final LinkedHashMap RemoteActionCompatParcelizer;

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public fullMultiplicationHighBits(LinkedHashMap linkedHashMap) {
        this.RemoteActionCompatParcelizer = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fullMultiplicationHighBits) && this.RemoteActionCompatParcelizer.equals(((fullMultiplicationHighBits) obj).RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return "ScreenPerformanceEvent(params=" + this.RemoteActionCompatParcelizer + ")";
    }
}
