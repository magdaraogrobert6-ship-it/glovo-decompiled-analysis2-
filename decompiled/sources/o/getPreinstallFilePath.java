package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getPreinstallFilePath {
    private static int read = 0;
    private static int serializer = 1;
    public final enableDeviceIdsReadingOnce IconCompatParcelizer;
    public final float RemoteActionCompatParcelizer;
    public final String write;

    public getPreinstallFilePath(float f, String str, enableDeviceIdsReadingOnce enabledeviceidsreadingonce) {
        this.RemoteActionCompatParcelizer = f;
        this.write = str;
        this.IconCompatParcelizer = enabledeviceidsreadingonce;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 113;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(Float.hashCode(this.RemoteActionCompatParcelizer) * 31, 31, this.write);
        int i4 = serializer + 37;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 33;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof getPreinstallFilePath) {
            getPreinstallFilePath getpreinstallfilepath = (getPreinstallFilePath) obj;
            return Float.compare(this.RemoteActionCompatParcelizer, getpreinstallfilepath.RemoteActionCompatParcelizer) == 0 && this.write.equals(getpreinstallfilepath.write) && this.IconCompatParcelizer == getpreinstallfilepath.IconCompatParcelizer;
        }
        int i4 = i3 + 65;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Score(score=" + this.RemoteActionCompatParcelizer + ", formattedScore=" + this.write + ", tag=" + this.IconCompatParcelizer + ")";
        int i2 = read + 89;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
