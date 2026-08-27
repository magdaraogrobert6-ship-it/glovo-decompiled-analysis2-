package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class LineHeightStyleTrimSaverlambda1 {
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final boolean write;

    public LineHeightStyleTrimSaverlambda1(String str, String str2, String str3, boolean z) {
        this.RemoteActionCompatParcelizer = str;
        this.serializer = str2;
        this.read = str3;
        this.write = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.serializer);
        int iHashCode = Boolean.hashCode(this.write) + ((((this.read.hashCode() + iM) * 31) - 2114376878) * 31);
        int i4 = MediaBrowserCompatMediaItem + 111;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 107;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("DialogState(title=", this.RemoteActionCompatParcelizer, ", description=", this.serializer, ", mainActionButtonTitle=");
        sbM.append(this.read);
        sbM.append(", tag=state_api_error_dialog, isOverlayDialog=");
        sbM.append(this.write);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = IconCompatParcelizer + 15;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof LineHeightStyleTrimSaverlambda1)) {
                return false;
            }
            LineHeightStyleTrimSaverlambda1 lineHeightStyleTrimSaverlambda1 = (LineHeightStyleTrimSaverlambda1) obj;
            if (!this.RemoteActionCompatParcelizer.equals(lineHeightStyleTrimSaverlambda1.RemoteActionCompatParcelizer) || !this.serializer.equals(lineHeightStyleTrimSaverlambda1.serializer) || !this.read.equals(lineHeightStyleTrimSaverlambda1.read) || this.write != lineHeightStyleTrimSaverlambda1.write) {
                return false;
            }
        }
        int i4 = IconCompatParcelizer + 17;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
