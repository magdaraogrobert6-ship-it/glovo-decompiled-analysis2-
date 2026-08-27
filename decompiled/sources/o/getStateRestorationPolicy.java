package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class getStateRestorationPolicy implements notifyItemChanged {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final ArrayList RemoteActionCompatParcelizer;
    public final Float read;

    public getStateRestorationPolicy(ArrayList arrayList, Float f) {
        this.RemoteActionCompatParcelizer = arrayList;
        this.read = f;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 73;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        Float f = this.read;
        int iHashCode2 = (iHashCode * 31) + (f == null ? 0 : f.hashCode());
        int i4 = serializer + 45;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RowViewEntity(components=" + this.RemoteActionCompatParcelizer + ", weight=" + this.read + ")";
        int i2 = serializer + 91;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 5;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof getStateRestorationPolicy)) {
                return false;
            }
            getStateRestorationPolicy getstaterestorationpolicy = (getStateRestorationPolicy) obj;
            if (!this.RemoteActionCompatParcelizer.equals(getstaterestorationpolicy.RemoteActionCompatParcelizer)) {
                return false;
            }
            Object[] objArr = {this.read, getstaterestorationpolicy.read};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
        }
        int i4 = IconCompatParcelizer + 111;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
