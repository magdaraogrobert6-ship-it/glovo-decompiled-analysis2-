package o;

import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class zf extends zgExternalSyntheticLambda3 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final long serializer;

    public zf(long j) {
        this.serializer = j;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 13;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            Long.hashCode(this.serializer);
            obj.hashCode();
            throw null;
        }
        int iHashCode = Long.hashCode(this.serializer);
        int i3 = write + 37;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = write + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            strM = m1$$ExternalSyntheticOutline0.m(this.serializer, "Collected(value=", ")");
            int i3 = 99 / 0;
        } else {
            strM = m1$$ExternalSyntheticOutline0.m(this.serializer, "Collected(value=", ")");
        }
        int i4 = write + 41;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 23;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 49;
            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 21;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return true;
        }
        if (!(obj instanceof zf)) {
            int i10 = i3 + 103;
            RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i10 % 2 == 0;
        }
        if (this.serializer != ((zf) obj).serializer) {
            return false;
        }
        int i11 = i3 + 45;
        RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i11 % 2 == 0) {
            int i12 = 22 / 0;
        }
        return true;
    }
}
