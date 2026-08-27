package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class t1 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RemoteActionCompatParcelizer;
    public final int IconCompatParcelizer;
    public final ArrayList read;
    public final String serializer;
    public final ArrayList write;

    public t1(ArrayList arrayList, ArrayList arrayList2, String str, int i) {
        str.getClass();
        this.read = arrayList;
        this.write = arrayList2;
        this.serializer = str;
        this.IconCompatParcelizer = i;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.IconCompatParcelizer) + af$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.write, this.read.hashCode() * 31, 31), 31, this.serializer);
        int i4 = RemoteActionCompatParcelizer + 117;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "StartingPoint(area=" + this.read + ", center=" + this.write + ", name=" + this.serializer + ", id=" + this.IconCompatParcelizer + ")";
        int i2 = RemoteActionCompatParcelizer + 95;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 61;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        if (this.read.equals(t1Var.read)) {
            if (!this.write.equals(t1Var.write)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, t1Var.serializer}, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer == t1Var.IconCompatParcelizer;
        }
        int i3 = MediaSessionCompatQueueItem + 93;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
