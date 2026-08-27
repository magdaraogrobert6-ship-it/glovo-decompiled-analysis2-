package o;

/* JADX INFO: loaded from: classes3.dex */
public final class RecyclerViewRecycler extends RecyclerViewLayoutManager {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final hasStableIds serializer;

    public RecyclerViewRecycler(hasStableIds hasstableids) {
        hasstableids.getClass();
        this.serializer = hasstableids;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.serializer.hashCode();
            int i3 = 54 / 0;
        } else {
            iHashCode = this.serializer.hashCode();
        }
        int i4 = read + 53;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Available(page=" + this.serializer + ")";
        int i2 = RemoteActionCompatParcelizer + 125;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 111;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecyclerViewRecycler)) {
            return false;
        }
        Object[] objArr = {this.serializer, ((RecyclerViewRecycler) obj).serializer};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i4 = read + 123;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = read + 3;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
