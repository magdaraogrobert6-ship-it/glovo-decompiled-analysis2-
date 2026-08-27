package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandler21 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String write;

    public ActivityHandler21(String str, String str2, String str3) {
        str.getClass();
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
        this.write = str3;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 111;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("SignInApplicantArguments(phone=", this.read, ", password=", this.RemoteActionCompatParcelizer, ", email="), this.write, ")");
            int i3 = serializer + 85;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strM;
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("SignInApplicantArguments(phone=", this.read, ", password=", this.RemoteActionCompatParcelizer, ", email="), this.write, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
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
        int i2 = serializer + 67;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iM = af$$ExternalSyntheticOutline0.m(this.read.hashCode() + 3, 55, this.RemoteActionCompatParcelizer);
            str = this.write;
            if (str == null) {
                int i3 = serializer + 45;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.RemoteActionCompatParcelizer);
            str = this.write;
            if (str == null) {
                int i5 = serializer + 45;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        }
        return iM + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivityHandler21) {
            ActivityHandler21 activityHandler21 = (ActivityHandler21) obj;
            Object[] objArr = {this.read, activityHandler21.read};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && this.RemoteActionCompatParcelizer.equals(activityHandler21.RemoteActionCompatParcelizer)) {
                Object[] objArr2 = {this.write, activityHandler21.write};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    return true;
                }
            }
        } else {
            int i2 = IconCompatParcelizer + 5;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int i4 = IconCompatParcelizer + 37;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
