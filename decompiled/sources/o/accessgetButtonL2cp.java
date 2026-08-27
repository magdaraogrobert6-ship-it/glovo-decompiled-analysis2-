package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButtonL2cp extends accessgetCalendarcp {
    public final ArrayList read;

    public final int hashCode() {
        return this.read.hashCode() ^ 1000003;
    }

    public accessgetButtonL2cp(ArrayList arrayList) {
        this.read = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetCalendarcp)) {
            return false;
        }
        return this.read.equals(((accessgetButtonL2cp) ((accessgetCalendarcp) obj)).read);
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.read + "}";
    }
}
