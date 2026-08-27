package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButtonL1cp extends accessgetCapsLockcp {
    public final accessgetCameracp serializer;
    public final accessgetButtonCcp write;

    public accessgetButtonL1cp(accessgetCameracp accessgetcameracp, accessgetButtonCcp accessgetbuttonccp) {
        this.serializer = accessgetcameracp;
        this.write = accessgetbuttonccp;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetCapsLockcp)) {
            return false;
        }
        accessgetCapsLockcp accessgetcapslockcp = (accessgetCapsLockcp) obj;
        accessgetCameracp accessgetcameracp = this.serializer;
        if (accessgetcameracp == null) {
            if (((accessgetButtonL1cp) accessgetcapslockcp).serializer != null) {
                return false;
            }
        } else if (!accessgetcameracp.equals(((accessgetButtonL1cp) accessgetcapslockcp).serializer)) {
            return false;
        }
        return this.write.equals(((accessgetButtonL1cp) accessgetcapslockcp).write);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.serializer + ", androidClientInfo=" + this.write + "}";
    }

    public final int hashCode() {
        accessgetCameracp accessgetcameracp = this.serializer;
        return (((accessgetcameracp == null ? 0 : accessgetcameracp.hashCode()) ^ 1000003) * 1000003) ^ this.write.hashCode();
    }
}
