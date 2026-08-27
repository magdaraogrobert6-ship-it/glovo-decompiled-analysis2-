package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 {
    private static int MediaMetadataCompat = 1;
    private static int serializer;
    public final double IconCompatParcelizer;
    public final g6 RemoteActionCompatParcelizer;
    public final ArrayList read;
    public final boolean write;

    public e1(ArrayList arrayList, g6 g6Var, double d, boolean z) {
        g6Var.getClass();
        this.read = arrayList;
        this.RemoteActionCompatParcelizer = g6Var;
        this.IconCompatParcelizer = d;
        this.write = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 23;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int iHashCode2 = Boolean.hashCode(this.write) + r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.IconCompatParcelizer, (this.RemoteActionCompatParcelizer.hashCode() + (iHashCode * 31)) * 31, 31);
        int i4 = MediaMetadataCompat + 35;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CenterMapOnElements(elements=" + this.read + ", safeArea=" + this.RemoteActionCompatParcelizer + ", defaultZoomLevel=" + this.IconCompatParcelizer + ", isLocationTriggered=" + this.write + ")";
        int i2 = MediaMetadataCompat + 11;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaMetadataCompat + 55;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return true;
            }
            int i3 = 4 / 2;
            return true;
        }
        if (obj instanceof e1) {
            e1 e1Var = (e1) obj;
            if (!this.read.equals(e1Var.read)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, e1Var.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() && Double.compare(this.IconCompatParcelizer, e1Var.IconCompatParcelizer) == 0 && this.write == e1Var.write;
        }
        int i4 = serializer + 3;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
