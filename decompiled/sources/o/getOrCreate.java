package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getOrCreate {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;

    public getOrCreate(String str, String str2, String str3, String str4) {
        this.read = str;
        this.serializer = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.IconCompatParcelizer = str4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 19;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("ErrorDialogState(title=", this.read, ", message=", this.serializer, ", affirmativeActionTitle="), this.RemoteActionCompatParcelizer, ", dismissActionTitle=", this.IconCompatParcelizer, ")");
        int i4 = MediaBrowserCompatMediaItem + 53;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 81;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.serializer), 31, this.RemoteActionCompatParcelizer);
        int i4 = write + 9;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 3;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 61 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj instanceof getOrCreate) {
            getOrCreate getorcreate = (getOrCreate) obj;
            if (this.read.equals(getorcreate.read) && this.serializer.equals(getorcreate.serializer) && this.RemoteActionCompatParcelizer.equals(getorcreate.RemoteActionCompatParcelizer) && this.IconCompatParcelizer.equals(getorcreate.IconCompatParcelizer)) {
                return true;
            }
        } else {
            int i5 = i2 + 117;
            MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 5 / 2;
            }
        }
        return false;
    }
}
