package o;

/* JADX INFO: loaded from: classes3.dex */
public final class requestGeofenceRefresh implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Long write;

    public requestGeofenceRefresh(BrazeCompanionExternalSyntheticLambda8 brazeCompanionExternalSyntheticLambda8) {
        this.write = brazeCompanionExternalSyntheticLambda8.IconCompatParcelizer;
    }

    public final String toString() {
        return "SdkStartedEvent{expires_on=" + this.write + "}";
    }

    public final int hashCode() {
        Long l = this.write;
        return ((l == null ? 0 : l.hashCode()) ^ 16777619) * (-2128831035);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof requestGeofenceRefresh)) {
            return false;
        }
        Object obj2 = ((requestGeofenceRefresh) obj).write;
        Long l = this.write;
        return l == obj2 || (l != null && l.equals(obj2));
    }
}
