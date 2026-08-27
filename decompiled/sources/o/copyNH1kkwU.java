package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class copyNH1kkwU implements copyxPh5V4g {
    private static int serializer = 0;
    private static int write = 1;
    public final Uri IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;

    public final Uri IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 101;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        Uri uri = this.IconCompatParcelizer;
        int i5 = i3 + 67;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return uri;
    }

    public copyNH1kkwU(int i, Uri uri) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = uri;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = Integer.hashCode(this.RemoteActionCompatParcelizer);
        Uri uri = this.IconCompatParcelizer;
        if (uri == null) {
            int i3 = serializer + 79;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode2 = uri.hashCode();
            int i5 = serializer + 119;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof copyNH1kkwU)) {
                return false;
            }
            copyNH1kkwU copynh1kkwu = (copyNH1kkwU) obj;
            if (this.RemoteActionCompatParcelizer == copynh1kkwu.RemoteActionCompatParcelizer) {
                Object[] objArr = {this.IconCompatParcelizer, copynh1kkwu.IconCompatParcelizer};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return false;
                }
            } else {
                int i2 = serializer + 95;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
        }
        int i4 = serializer + 111;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Success(requestCode=" + this.RemoteActionCompatParcelizer + ", uri=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 13;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
