package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sb extends sa {
    private static int read = 0;
    private static int serializer = 1;
    public final boolean IconCompatParcelizer;
    public final List write;

    public sb(List list, boolean z) {
        this.write = list;
        this.IconCompatParcelizer = z;
    }

    public static sb serializer(sb sbVar, ArrayList arrayList) {
        int i = 2 % 2;
        boolean z = sbVar.IconCompatParcelizer;
        sbVar.getClass();
        sb sbVar2 = new sb(arrayList, z);
        int i2 = read + 125;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return sbVar2;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = Boolean.hashCode(this.IconCompatParcelizer) % (this.write.hashCode() / 122);
        } else {
            iHashCode = Boolean.hashCode(this.IconCompatParcelizer) + (this.write.hashCode() * 31);
        }
        int i3 = read + 45;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 83;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof sb)) {
            return false;
        }
        sb sbVar = (sb) obj;
        if (this.write.equals(sbVar.write)) {
            return this.IconCompatParcelizer == sbVar.IconCompatParcelizer;
        }
        int i4 = serializer + 103;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "WorkingOpportunities(opportunities=" + this.write + ", isMultiZoneCity=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 121;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
