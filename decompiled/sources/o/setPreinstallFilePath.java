package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setPreinstallFilePath {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final boolean RemoteActionCompatParcelizer;
    public final boolean write;

    public setPreinstallFilePath(boolean z, boolean z2) {
        this.RemoteActionCompatParcelizer = z;
        this.write = z2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 35;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return Boolean.hashCode(this.write) << (Boolean.hashCode(this.RemoteActionCompatParcelizer) * 16);
        }
        return (Boolean.hashCode(this.RemoteActionCompatParcelizer) * 31) + Boolean.hashCode(this.write);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 1;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof setPreinstallFilePath)) {
            return false;
        }
        setPreinstallFilePath setpreinstallfilepath = (setPreinstallFilePath) obj;
        if (this.RemoteActionCompatParcelizer == setpreinstallfilepath.RemoteActionCompatParcelizer) {
            if (this.write != setpreinstallfilepath.write) {
                int i3 = read;
                int i4 = i3 + 43;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                boolean z = i4 % 2 != 0;
                int i5 = i3 + 119;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return z;
            }
            int i7 = read + 89;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                return true;
            }
            throw null;
        }
        int i8 = IconCompatParcelizer + 41;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "BreakRequest(isEndBreakAllowed=" + this.RemoteActionCompatParcelizer + ", isBreakScheduled=" + this.write + ")";
        int i2 = read + 83;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
