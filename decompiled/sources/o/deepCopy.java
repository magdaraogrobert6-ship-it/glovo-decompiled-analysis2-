package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class deepCopy {
    private static int serializer = 0;
    private static int write = 1;
    public final GooglePlayInstallReferrerDetails IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;

    public deepCopy(GooglePlayInstallReferrerDetails googlePlayInstallReferrerDetails, String str, String str2) {
        googlePlayInstallReferrerDetails.getClass();
        str.getClass();
        this.IconCompatParcelizer = googlePlayInstallReferrerDetails;
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0041 A[PHI: r1 r2
  0x0041: PHI (r1v11 int) = (r1v7 int), (r1v15 int) binds: [B:8:0x0034, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0041: PHI (r2v6 java.lang.String) = (r2v2 java.lang.String), (r2v8 java.lang.String) binds: [B:8:0x0034, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[PHI: r1
  0x0036: PHI (r1v8 int) = (r1v7 int), (r1v15 int) binds: [B:8:0x0034, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iM;
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 93;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iM = af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() >> 70, 91, this.RemoteActionCompatParcelizer);
            str = this.read;
            if (str == null) {
                int i3 = serializer + 73;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.RemoteActionCompatParcelizer);
            str = this.read;
            if (str == null) {
                int i5 = serializer + 73;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        }
        return iM + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("StatusAction(type=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", text=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", url=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.read, ")");
        int i2 = write + 123;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof deepCopy) {
                deepCopy deepcopy = (deepCopy) obj;
                if (this.IconCompatParcelizer != deepcopy.IconCompatParcelizer) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, deepcopy.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, deepcopy.read}, getCieXyz.write())).booleanValue();
                }
                int i2 = write + 53;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 != 0;
            }
            int i3 = serializer + 81;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = write + 85;
        int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i6;
        boolean z = i5 % 2 == 0;
        int i7 = i6 + 71;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return z;
    }
}
