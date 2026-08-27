package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaKPF3ExuVmwcbLmeNzxtdfQ9jzhs {
    private static int read = 0;
    private static int serializer = 1;
    public final Uri RemoteActionCompatParcelizer;
    public final String write;

    public r8lambdaKPF3ExuVmwcbLmeNzxtdfQ9jzhs(Uri uri, String str) {
        this.RemoteActionCompatParcelizer = uri;
        this.write = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 61;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.write.hashCode() >> (this.RemoteActionCompatParcelizer.hashCode() + 88);
        }
        return (this.RemoteActionCompatParcelizer.hashCode() * 31) + this.write.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CameraImage(contentUri=" + this.RemoteActionCompatParcelizer + ", absolutePath=" + this.write + ")";
        int i2 = serializer + 81;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 35;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof r8lambdaKPF3ExuVmwcbLmeNzxtdfQ9jzhs)) {
                return false;
            }
            r8lambdaKPF3ExuVmwcbLmeNzxtdfQ9jzhs r8lambdakpf3exuvmwcblmenzxtdfq9jzhs = (r8lambdaKPF3ExuVmwcbLmeNzxtdfQ9jzhs) obj;
            if (this.RemoteActionCompatParcelizer.equals(r8lambdakpf3exuvmwcblmenzxtdfq9jzhs.RemoteActionCompatParcelizer)) {
                if (!this.write.equals(r8lambdakpf3exuvmwcblmenzxtdfq9jzhs.write)) {
                    return false;
                }
            } else {
                int i4 = read + 59;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
        }
        return true;
    }
}
