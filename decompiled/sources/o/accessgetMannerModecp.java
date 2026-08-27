package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetMannerModecp {
    public final long read;
    public final accessgetEightcp serializer;
    public final accessgetDvrcp write;

    public final int hashCode() {
        long j = this.read;
        int iHashCode = this.serializer.hashCode();
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ this.write.hashCode();
    }

    public accessgetMannerModecp(long j, accessgetEightcp accessgeteightcp, accessgetDvrcp accessgetdvrcp) {
        this.read = j;
        this.serializer = accessgeteightcp;
        this.write = accessgetdvrcp;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetMannerModecp)) {
            return false;
        }
        accessgetMannerModecp accessgetmannermodecp = (accessgetMannerModecp) obj;
        return this.read == accessgetmannermodecp.read && this.serializer.equals(accessgetmannermodecp.serializer) && this.write.equals(accessgetmannermodecp.write);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.read + ", transportContext=" + this.serializer + ", event=" + this.write + "}";
    }
}
