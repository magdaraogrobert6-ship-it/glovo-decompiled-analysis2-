package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.OccupantRoleFeedbackInternal;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.OccupantRoleInternal;

/* JADX INFO: loaded from: classes4.dex */
public final class getFlushMaxMinutes {
    private final OccupantRoleInternal IconCompatParcelizer;
    private final Double MediaDescriptionCompat;
    private final String RemoteActionCompatParcelizer;
    private final long read;
    private final Double serializer;
    private final OccupantRoleFeedbackInternal write;

    public final Double IconCompatParcelizer() {
        return this.serializer;
    }

    public final String MediaSessionCompatQueueItem() {
        return this.RemoteActionCompatParcelizer;
    }

    public final long RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final Double read() {
        return this.MediaDescriptionCompat;
    }

    public final OccupantRoleInternal serializer() {
        return this.IconCompatParcelizer;
    }

    public final OccupantRoleFeedbackInternal write() {
        return this.write;
    }

    public final int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.read);
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = this.write.hashCode();
        Double d = this.serializer;
        int iHashCode3 = d == null ? 0 : d.hashCode();
        Double d2 = this.MediaDescriptionCompat;
        return ((((iHashCode2 + ((iHashCode + iM) * 31)) * 31) + iHashCode3) * 31) + (d2 != null ? d2.hashCode() : 0);
    }

    public getFlushMaxMinutes(String str, long j, OccupantRoleInternal occupantRoleInternal, OccupantRoleFeedbackInternal occupantRoleFeedbackInternal, Double d, Double d2) {
        str.getClass();
        occupantRoleInternal.getClass();
        occupantRoleFeedbackInternal.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.read = j;
        this.IconCompatParcelizer = occupantRoleInternal;
        this.write = occupantRoleFeedbackInternal;
        this.serializer = d;
        this.MediaDescriptionCompat = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getFlushMaxMinutes)) {
            return false;
        }
        getFlushMaxMinutes getflushmaxminutes = (getFlushMaxMinutes) obj;
        if (!this.RemoteActionCompatParcelizer.equals(getflushmaxminutes.RemoteActionCompatParcelizer) || this.read != getflushmaxminutes.read || this.IconCompatParcelizer != getflushmaxminutes.IconCompatParcelizer || this.write != getflushmaxminutes.write) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getflushmaxminutes.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, getflushmaxminutes.MediaDescriptionCompat}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "OccupantRoleFeedbackSubmissionExtra(transportId=" + this.RemoteActionCompatParcelizer + ", feedbackTime=" + this.read + ", predictedOccupantRole=" + this.IconCompatParcelizer + ", providedFeedbackOccupantRole=" + this.write + ", probability=" + this.serializer + ", threshold=" + this.MediaDescriptionCompat + ')';
    }
}
