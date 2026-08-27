package o;

/* JADX INFO: loaded from: classes4.dex */
public final class DataStoreProviderea {
    private int read;
    private final int serializer;
    private final boolean write;

    public final int IconCompatParcelizer() {
        return this.serializer;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.write;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.serializer);
        boolean z = this.write;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return (iHashCode * 31) + r1;
    }

    public DataStoreProviderea(int i, boolean z) {
        this.serializer = i;
        this.write = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataStoreProviderea)) {
            return false;
        }
        DataStoreProviderea dataStoreProviderea = (DataStoreProviderea) obj;
        return this.serializer == dataStoreProviderea.serializer && this.write == dataStoreProviderea.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoadDirectionInfo(directionSigned180Degrees=");
        sb.append(this.serializer);
        sb.append(", hasCloseByRoadWithOpposingDirection=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.write, ')');
    }

    public final int write() {
        if (this.read == 0) {
            this.read = (this.serializer + 360) % 360;
        }
        return this.read;
    }
}
