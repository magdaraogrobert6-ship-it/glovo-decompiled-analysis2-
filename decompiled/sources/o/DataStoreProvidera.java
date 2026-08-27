package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class DataStoreProvidera {
    private final boolean IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final boolean read;

    public final boolean IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public final int hashCode() {
        boolean z = this.IconCompatParcelizer;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        boolean z2 = this.RemoteActionCompatParcelizer;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        boolean z3 = this.read;
        return (((r0 * 31) + r2) * 31) + (z3 ? 1 : z3);
    }

    public final boolean serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean write() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataStoreProvidera)) {
            return false;
        }
        DataStoreProvidera dataStoreProvidera = (DataStoreProvidera) obj;
        return this.IconCompatParcelizer == dataStoreProvidera.IconCompatParcelizer && this.RemoteActionCompatParcelizer == dataStoreProvidera.RemoteActionCompatParcelizer && this.read == dataStoreProvidera.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GisFeatures(hasBusRoute=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", hasTrainRoute=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", hasRailRoute=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.read, ')');
    }

    public /* synthetic */ DataStoreProvidera(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }

    public DataStoreProvidera(boolean z, boolean z2, boolean z3) {
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = z2;
        this.read = z3;
    }

    public DataStoreProvidera() {
        this(false, false, false, 7, null);
    }
}
