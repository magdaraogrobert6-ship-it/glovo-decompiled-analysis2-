package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class LineBreak extends HyphensCompanion {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final String RemoteActionCompatParcelizer;

    public final String read() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 101;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.RemoteActionCompatParcelizer;
        int i4 = i2 + 59;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public LineBreak(String str) {
        this.RemoteActionCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 41;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() * 31;
        int i4 = serializer + 25;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 57;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("Error(reason=", this.RemoteActionCompatParcelizer, ", throwable=null)");
        int i4 = serializer + 75;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 9;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (obj instanceof LineBreak) {
                if (!this.RemoteActionCompatParcelizer.equals(((LineBreak) obj).RemoteActionCompatParcelizer)) {
                    return false;
                }
            } else {
                int i5 = i3 + 21;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return false;
                }
                int i6 = 2 / 5;
                return false;
            }
        }
        int i7 = IconCompatParcelizer + 13;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }
}
