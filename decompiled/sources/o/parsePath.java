package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class parsePath extends InAppMessageManagerBaseWhenMappings {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final String read;
    public final isAtEnd serializer;
    public final String write;

    public final getStrokeLineCapCSYIeUkdefault IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 65;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        isAtEnd isatend = this.serializer;
        int i5 = i2 + 95;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return isatend;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.write;
        int i5 = i3 + 71;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.read;
        int i5 = i3 + 51;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public parsePath(String str, isAtEnd isatend, String str2) {
        str.getClass();
        this.write = str;
        this.serializer = isatend;
        this.read = str2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0045 A[PHI: r1 r3 r4
  0x0045: PHI (r1v8 int) = (r1v5 int), (r1v10 int) binds: [B:8:0x0038, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0045: PHI (r3v9 int) = (r3v3 int), (r3v12 int) binds: [B:8:0x0038, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0045: PHI (r4v4 java.lang.String) = (r4v0 java.lang.String), (r4v6 java.lang.String) binds: [B:8:0x0038, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x003a A[PHI: r1 r3
  0x003a: PHI (r1v6 int) = (r1v5 int), (r1v10 int) binds: [B:8:0x0038, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r3v4 int) = (r3v3 int), (r3v12 int) binds: [B:8:0x0038, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iM;
        int iHashCode;
        String str;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iM = af$$ExternalSyntheticOutline0.m(-1890929257, 61, this.write);
            iHashCode = this.serializer.serializer.hashCode();
            str = this.read;
            if (str != null) {
                iHashCode2 = str.hashCode();
            } else {
                int i3 = RemoteActionCompatParcelizer + 43;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                iHashCode2 = 0;
            }
        } else {
            iM = af$$ExternalSyntheticOutline0.m(-1890929257, 31, this.write);
            iHashCode = this.serializer.serializer.hashCode();
            str = this.read;
            if (str != null) {
                iHashCode2 = str.hashCode();
            } else {
                int i5 = RemoteActionCompatParcelizer + 43;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                iHashCode2 = 0;
            }
        }
        return ((iHashCode + iM) * 31) + iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("NonBlockingDialogViewModel(dialogTag=api_error_v3_dialog_tag, message=");
        sb.append(this.write);
        sb.append(", actions=");
        sb.append(this.serializer);
        sb.append(", title=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.read, ")");
        int i2 = IconCompatParcelizer + 41;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 61;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof parsePath)) {
            return false;
        }
        parsePath parsepath = (parsePath) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, parsepath.write}, getCieXyz.write())).booleanValue() || !this.serializer.equals(parsepath.serializer)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, parsepath.read}, getCieXyz.write())).booleanValue();
    }
}
