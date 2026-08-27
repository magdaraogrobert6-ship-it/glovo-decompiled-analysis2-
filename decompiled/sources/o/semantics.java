package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class semantics {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final String IconCompatParcelizer;
    public final int read;
    public final String write;

    public final int IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 113;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.read;
        int i6 = i2 + 39;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 47;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.write;
        int i5 = i2 + 9;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = serializer + 53;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.IconCompatParcelizer;
        int i4 = i3 + 33;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public semantics(int i, String str, String str2) {
        this.read = i;
        this.IconCompatParcelizer = str;
        this.write = str2;
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = serializer + 47;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            strM = ff$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m("Analytics(daysUntilMigration=", this.read, ", isGrabInstalled=false, migrationPhase=", this.IconCompatParcelizer, ", templateVariant="), this.write, ")");
            int i3 = 99 / 0;
        } else {
            strM = ff$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m("Analytics(daysUntilMigration=", this.read, ", isGrabInstalled=false, migrationPhase=", this.IconCompatParcelizer, ", templateVariant="), this.write, ")");
        }
        int i4 = RemoteActionCompatParcelizer + 57;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004c A[PHI: r1 r3
  0x004c: PHI (r1v12 int) = (r1v8 int), (r1v17 int) binds: [B:8:0x0040, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
  0x004c: PHI (r3v5 java.lang.String) = (r3v1 java.lang.String), (r3v11 java.lang.String) binds: [B:8:0x0040, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0042 A[PHI: r1
  0x0042: PHI (r1v9 int) = (r1v8 int), (r1v17 int) binds: [B:8:0x0040, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iM;
        String str;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 123;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode = 0;
        if (i2 % 2 == 0) {
            iM = af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(Integer.hashCode(this.read) >>> 77, 119, true), 103, this.IconCompatParcelizer);
            str = this.write;
            if (str == null) {
                int i3 = serializer + 25;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
            } else {
                iHashCode = str.hashCode();
                int i5 = serializer + 85;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        } else {
            iM = af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(Integer.hashCode(this.read) * 31, 31, false), 31, this.IconCompatParcelizer);
            str = this.write;
            if (str == null) {
                int i7 = serializer + 25;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                iHashCode = str.hashCode();
                int i9 = serializer + 85;
                RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
            }
        }
        return iM + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 35;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 65 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj instanceof semantics) {
            semantics semanticsVar = (semantics) obj;
            if (this.read != semanticsVar.read) {
                int i5 = i2 + 67;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else if (this.IconCompatParcelizer.equals(semanticsVar.IconCompatParcelizer)) {
                Object[] objArr = {this.write, semanticsVar.write};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}
