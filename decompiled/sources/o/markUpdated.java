package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class markUpdated {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final String IconCompatParcelizer;
    public final String MediaDescriptionCompat;
    public final String RemoteActionCompatParcelizer;
    public final int read;
    public final q6 serializer;
    public final safeSetClipToOutline write;

    public markUpdated(String str, String str2, String str3, int i, q6 q6Var, safeSetClipToOutline safesetcliptooutline) {
        str.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.MediaDescriptionCompat = str2;
        this.IconCompatParcelizer = str3;
        this.read = i;
        this.serializer = q6Var;
        this.write = safesetcliptooutline;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 15;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.read, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.MediaDescriptionCompat), 31, this.IconCompatParcelizer), 31);
        q6 q6Var = this.serializer;
        int iHashCode = this.write.hashCode() + ((iM + (q6Var == null ? 0 : q6Var.hashCode())) * 31);
        int i4 = MediaBrowserCompatMediaItem + 77;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 19;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("CriticalHttpIssueData(method=", this.RemoteActionCompatParcelizer, ", url=", this.MediaDescriptionCompat, ", message=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", httpCode=");
        sbM.append(this.read);
        sbM.append(", errorOrigin=");
        sbM.append(this.serializer);
        sbM.append(", tags=");
        sbM.append(this.write);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaBrowserCompatMediaItem + 61;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaBrowserCompatMediaItem + 87;
            MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof markUpdated)) {
            return false;
        }
        markUpdated markupdated = (markUpdated) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, markupdated.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return this.MediaDescriptionCompat.equals(markupdated.MediaDescriptionCompat) && this.IconCompatParcelizer.equals(markupdated.IconCompatParcelizer) && this.read == markupdated.read && this.serializer == markupdated.serializer && this.write.equals(markupdated.write);
        }
        int i4 = MediaSessionCompatQueueItem + 49;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
