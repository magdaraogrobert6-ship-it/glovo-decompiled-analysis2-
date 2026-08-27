package o;

import com.google.firebase.firestore.model.SnapshotVersion;

/* JADX INFO: loaded from: classes2.dex */
public final class accessnextUntilhw7D004 {
    public static final accessnextUntilhw7D004 serializer = new accessnextUntilhw7D004(null, null);
    public final Boolean read;
    public final SnapshotVersion write;

    public final int hashCode() {
        SnapshotVersion snapshotVersion = this.write;
        int iHashCode = snapshotVersion != null ? snapshotVersion.read.hashCode() : 0;
        Boolean bool = this.read;
        return (iHashCode * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0024 A[RETURN] */
    public final boolean serializer(NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1) {
        SnapshotVersion snapshotVersion = this.write;
        if (snapshotVersion != null) {
            if (nodeCoordinatorCompanionPointerInputSource1.read() && nodeCoordinatorCompanionPointerInputSource1.MediaDescriptionCompat.equals(snapshotVersion)) {
                return true;
            }
            return false;
        }
        Boolean bool = this.read;
        if (bool == null) {
            getRectManager.RemoteActionCompatParcelizer(snapshotVersion == null && bool == null, "Precondition should be empty", new Object[0]);
            return true;
        }
        if (bool.booleanValue() == nodeCoordinatorCompanionPointerInputSource1.read()) {
            return true;
        }
        return false;
    }

    public final String toString() {
        Boolean bool = this.read;
        SnapshotVersion snapshotVersion = this.write;
        if (snapshotVersion == null && bool == null) {
            return "Precondition{<none>}";
        }
        if (snapshotVersion != null) {
            return "Precondition{updateTime=" + snapshotVersion + "}";
        }
        if (bool == null) {
            getRectManager.write("Invalid Precondition", new Object[0]);
            throw null;
        }
        return "Precondition{exists=" + bool + "}";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && accessnextUntilhw7D004.class == obj.getClass()) {
            accessnextUntilhw7D004 accessnextuntilhw7d004 = (accessnextUntilhw7D004) obj;
            SnapshotVersion snapshotVersion = accessnextuntilhw7d004.write;
            SnapshotVersion snapshotVersion2 = this.write;
            if (snapshotVersion2 == null ? snapshotVersion != null : !snapshotVersion2.equals(snapshotVersion)) {
                return false;
            }
            Boolean bool = accessnextuntilhw7d004.read;
            Boolean bool2 = this.read;
            if (bool2 != null) {
                return bool2.equals(bool);
            }
            if (bool == null) {
                return true;
            }
        }
        return false;
    }

    public accessnextUntilhw7D004(SnapshotVersion snapshotVersion, Boolean bool) {
        getRectManager.RemoteActionCompatParcelizer(snapshotVersion == null || bool == null, "Precondition can specify \"exists\" or \"updateTime\" but not both", new Object[0]);
        this.write = snapshotVersion;
        this.read = bool;
    }
}
