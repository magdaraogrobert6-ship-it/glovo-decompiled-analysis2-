package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class getPreinstallPayloadReadStatus extends getRawReferrer {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final Uri serializer;

    public getPreinstallPayloadReadStatus(Uri uri) {
        this.serializer = uri;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.serializer.hashCode();
            int i3 = 24 / 0;
        } else {
            iHashCode = this.serializer.hashCode();
        }
        int i4 = IconCompatParcelizer + 29;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OpenLink(uri=" + this.serializer + ")";
        int i2 = IconCompatParcelizer + 107;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj || ((obj instanceof getPreinstallPayloadReadStatus) && this.serializer.equals(((getPreinstallPayloadReadStatus) obj).serializer))) {
            int i2 = IconCompatParcelizer + 121;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = RemoteActionCompatParcelizer + 113;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return false;
    }
}
