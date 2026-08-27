package o;

import com.sentiance.sdk.eventtimeline.timelines.stores.entries.OccupantRoleInternal;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaWCg3UcfFIZmFRiKL7zmHbVZif3M {
    private final OccupantRoleInternal IconCompatParcelizer;
    private final Double RemoteActionCompatParcelizer;
    private final Double read;
    public static final RemoteActionCompatParcelizer write = new RemoteActionCompatParcelizer(null);
    private static final r8lambdaWCg3UcfFIZmFRiKL7zmHbVZif3M serializer = new r8lambdaWCg3UcfFIZmFRiKL7zmHbVZif3M(OccupantRoleInternal.UNAVAILABLE, null, null);

    public static final class RemoteActionCompatParcelizer {
        public RemoteActionCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final Double IconCompatParcelizer() {
        return this.read;
    }

    public final Double read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final OccupantRoleInternal serializer() {
        return this.IconCompatParcelizer;
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        Double d = this.read;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        Double d2 = this.RemoteActionCompatParcelizer;
        return (((iHashCode * 31) + iHashCode2) * 31) + (d2 != null ? d2.hashCode() : 0);
    }

    public r8lambdaWCg3UcfFIZmFRiKL7zmHbVZif3M(OccupantRoleInternal occupantRoleInternal, Double d, Double d2) {
        occupantRoleInternal.getClass();
        this.IconCompatParcelizer = occupantRoleInternal;
        this.read = d;
        this.RemoteActionCompatParcelizer = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaWCg3UcfFIZmFRiKL7zmHbVZif3M)) {
            return false;
        }
        r8lambdaWCg3UcfFIZmFRiKL7zmHbVZif3M r8lambdawcg3ucffizmfrikl7zmhbvzif3m = (r8lambdaWCg3UcfFIZmFRiKL7zmHbVZif3M) obj;
        if (this.IconCompatParcelizer != r8lambdawcg3ucffizmfrikl7zmhbvzif3m.IconCompatParcelizer) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, r8lambdawcg3ucffizmfrikl7zmhbvzif3m.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, r8lambdawcg3ucffizmfrikl7zmhbvzif3m.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "TransportOccupantRoleClassifierResult(role=" + this.IconCompatParcelizer + ", probability=" + this.read + ", threshold=" + this.RemoteActionCompatParcelizer + ')';
    }
}
