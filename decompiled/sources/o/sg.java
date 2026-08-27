package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class sg {
    private static int read = 1;
    private static int serializer;
    public final int IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String write;

    public sg(int i, String str, String str2) {
        str.getClass();
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 99;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m("StartNow(zoneId=", this.IconCompatParcelizer, ", type=", this.RemoteActionCompatParcelizer, ", startTime="), this.write, ")");
            int i3 = read + 89;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 64 / 0;
            }
            return strM;
        }
        ff$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m("StartNow(zoneId=", this.IconCompatParcelizer, ", type=", this.RemoteActionCompatParcelizer, ", startTime="), this.write, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0041 A[PHI: r1 r2
  0x0041: PHI (r1v11 int) = (r1v7 int), (r1v15 int) binds: [B:8:0x0034, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0041: PHI (r2v11 java.lang.String) = (r2v2 java.lang.String), (r2v14 java.lang.String) binds: [B:8:0x0034, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[PHI: r1
  0x0036: PHI (r1v8 int) = (r1v7 int), (r1v15 int) binds: [B:8:0x0034, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iM;
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 63;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iM = af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.IconCompatParcelizer) % 23, 107, this.RemoteActionCompatParcelizer);
            str = this.write;
            if (str == null) {
                int i3 = serializer + 123;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        } else {
            iM = af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.IconCompatParcelizer) * 31, 31, this.RemoteActionCompatParcelizer);
            str = this.write;
            if (str == null) {
                int i5 = serializer + 123;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        }
        int i7 = iM + iHashCode;
        int i8 = read + 27;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return i7;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 5;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 27;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof sg)) {
            return false;
        }
        sg sgVar = (sg) obj;
        if (this.IconCompatParcelizer != sgVar.IconCompatParcelizer) {
            return false;
        }
        Object[] objArr = {this.RemoteActionCompatParcelizer, sgVar.RemoteActionCompatParcelizer};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.write, sgVar.write};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i7 = read + 35;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = read + 91;
        int i10 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i10;
        int i11 = i9 % 2;
        int i12 = i10 + 93;
        read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i12 % 2 == 0) {
            int i13 = 41 / 0;
        }
        return false;
    }
}
