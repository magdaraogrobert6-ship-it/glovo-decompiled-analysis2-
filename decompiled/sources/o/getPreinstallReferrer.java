package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class getPreinstallReferrer extends getRawReferrer {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final Uri RemoteActionCompatParcelizer;

    public getPreinstallReferrer(Uri uri) {
        this.RemoteActionCompatParcelizer = uri;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 51;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.RemoteActionCompatParcelizer.hashCode();
        }
        this.RemoteActionCompatParcelizer.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OpenDeepLink(uri=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = write + 41;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 27 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 109;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj && (!(obj instanceof getPreinstallReferrer) || !this.RemoteActionCompatParcelizer.equals(((getPreinstallReferrer) obj).RemoteActionCompatParcelizer))) {
            return false;
        }
        int i3 = write + 99;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return true;
    }
}
