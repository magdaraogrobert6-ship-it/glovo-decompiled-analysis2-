package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class AccessibilityIterators {
    public final String IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final long serializer;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        long j = this.RemoteActionCompatParcelizer;
        long j2 = this.serializer;
        return ((((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public AccessibilityIterators(String str, long j, long j2) {
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = j;
        this.serializer = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccessibilityIterators)) {
            return false;
        }
        AccessibilityIterators accessibilityIterators = (AccessibilityIterators) obj;
        return this.IconCompatParcelizer.equals(accessibilityIterators.IconCompatParcelizer) && this.RemoteActionCompatParcelizer == accessibilityIterators.RemoteActionCompatParcelizer && this.serializer == accessibilityIterators.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", tokenCreationTimestamp=");
        return c8$$ExternalSyntheticOutline0.m(this.serializer, "}", sb);
    }
}
