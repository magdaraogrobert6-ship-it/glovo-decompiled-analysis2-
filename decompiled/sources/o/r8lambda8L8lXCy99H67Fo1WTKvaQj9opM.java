package o;

import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda8L8lXCy99H67Fo1WTKvaQj9opM {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final long read;

    public final long write() {
        int i = 2 % 2;
        int i2 = serializer + 47;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.read;
        }
        int i3 = 12 / 0;
        return this.read;
    }

    public r8lambda8L8lXCy99H67Fo1WTKvaQj9opM(long j) {
        this.read = j;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = m1$$ExternalSyntheticOutline0.m(this.read, "Params(deliveryId=", ", canUseCache=false)");
        int i4 = IconCompatParcelizer + 35;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 113;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = Boolean.hashCode(true) * (Long.hashCode(this.read) / 6);
        } else {
            iHashCode = Boolean.hashCode(false) + (Long.hashCode(this.read) * 31);
        }
        int i3 = IconCompatParcelizer + 115;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 115;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if ((obj instanceof r8lambda8L8lXCy99H67Fo1WTKvaQj9opM) && this.read == ((r8lambda8L8lXCy99H67Fo1WTKvaQj9opM) obj).read) {
            return true;
        }
        int i4 = i2 + 83;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
