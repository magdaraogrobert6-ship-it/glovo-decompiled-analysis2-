package o;

import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class accessaddNotificationForSysPropsChange {
    public final HashSet RemoteActionCompatParcelizer;

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() ^ 1000003;
    }

    public accessaddNotificationForSysPropsChange(HashSet hashSet) {
        this.RemoteActionCompatParcelizer = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessaddNotificationForSysPropsChange)) {
            return false;
        }
        return this.RemoteActionCompatParcelizer.equals(((accessaddNotificationForSysPropsChange) obj).RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.RemoteActionCompatParcelizer + "}";
    }
}
