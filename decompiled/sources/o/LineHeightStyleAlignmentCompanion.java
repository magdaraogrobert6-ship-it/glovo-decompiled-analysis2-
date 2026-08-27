package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class LineHeightStyleAlignmentCompanion extends LineHeightStyleAlignment {
    private static int serializer = 1;
    private static int write;
    public final Object read;

    public LineHeightStyleAlignmentCompanion(Object obj) {
        this.read = obj;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 73;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = serializer + 103;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = serializer + 3;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            strM = af$$ExternalSyntheticOutline0.m(this.read, "ManeuverState(data=", ")");
            int i3 = 2 / 0;
        } else {
            strM = af$$ExternalSyntheticOutline0.m(this.read, "ManeuverState(data=", ")");
        }
        int i4 = write + 61;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 63;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 69;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else if (!(obj instanceof LineHeightStyleAlignmentCompanion) || !this.read.equals(((LineHeightStyleAlignmentCompanion) obj).read)) {
            return false;
        }
        int i7 = write + 119;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
