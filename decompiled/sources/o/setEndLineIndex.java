package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setEndLineIndex extends ParagraphDefaultImpls {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final double IconCompatParcelizer;
    public final double read;

    public final double RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 5;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        double d = this.read;
        int i5 = i3 + 11;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 64 / 0;
        }
        return d;
    }

    public final double write() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 1;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        double d = this.IconCompatParcelizer;
        int i4 = i2 + 45;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return d;
    }

    public setEndLineIndex(double d, double d2) {
        this.read = d;
        this.IconCompatParcelizer = d2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 5;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Double.hashCode(this.IconCompatParcelizer) + (Double.hashCode(this.read) * 31);
        int i4 = serializer + 119;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, ")", af$$ExternalSyntheticOutline0.m(this.read, "LocationMessageClicked(lat=", ", long="));
            int i3 = serializer + 13;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return strM;
            }
            obj.hashCode();
            throw null;
        }
        ff$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, ")", af$$ExternalSyntheticOutline0.m(this.read, "LocationMessageClicked(lat=", ", long="));
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 121;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i4;
        int i5 = i3 % 2;
        if (this != obj) {
            if (obj instanceof setEndLineIndex) {
                setEndLineIndex setendlineindex = (setEndLineIndex) obj;
                if (Double.compare(this.read, setendlineindex.read) != 0) {
                    int i6 = serializer + 37;
                    RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i6 % 2 != 0;
                }
                if (Double.compare(this.IconCompatParcelizer, setendlineindex.IconCompatParcelizer) == 0) {
                    return true;
                }
                int i7 = RemoteActionCompatParcelizer + 75;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return false;
            }
            int i9 = i4 + 47;
            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        int i11 = i2 + 53;
        serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        int i13 = i2 + 3;
        serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i14 = i13 % 2;
        return true;
    }
}
