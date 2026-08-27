package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public final String IconCompatParcelizer;
    public final r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c MediaSessionCompatQueueItem;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final boolean write;

    public r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI(r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c, String str, String str2, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, String str3, boolean z) {
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        this.MediaSessionCompatQueueItem = r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c;
        this.IconCompatParcelizer = str;
        this.serializer = str2;
        this.RemoteActionCompatParcelizer = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.read = str3;
        this.write = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 119;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.MediaSessionCompatQueueItem.hashCode() * 31, 31, this.IconCompatParcelizer), 31, this.serializer);
        int iHashCode = Boolean.hashCode(this.write) + af$$ExternalSyntheticOutline0.m((this.RemoteActionCompatParcelizer.hashCode() + iM) * 31, 31, this.read);
        int i4 = MediaDescriptionCompat + 97;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NaverRoutePreviewSetting(switchItem=" + this.MediaSessionCompatQueueItem + ", descriptionTitle=" + this.IconCompatParcelizer + ", descriptionHeading=" + this.serializer + ", description=" + this.RemoteActionCompatParcelizer + ", descriptionGotIt=" + this.read + ", showDescription=" + this.write + ")";
        int i2 = MediaBrowserCompatMediaItem + 75;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 125;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI)) {
            return false;
        }
        r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI r8lambdav9hvubmv32qeolrxalsjens1hri = (r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI) obj;
        if (!this.MediaSessionCompatQueueItem.equals(r8lambdav9hvubmv32qeolrxalsjens1hri.MediaSessionCompatQueueItem) || !this.IconCompatParcelizer.equals(r8lambdav9hvubmv32qeolrxalsjens1hri.IconCompatParcelizer)) {
            return false;
        }
        if (this.serializer.equals(r8lambdav9hvubmv32qeolrxalsjens1hri.serializer)) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, r8lambdav9hvubmv32qeolrxalsjens1hri.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() && this.read.equals(r8lambdav9hvubmv32qeolrxalsjens1hri.read) && this.write == r8lambdav9hvubmv32qeolrxalsjens1hri.write;
        }
        int i4 = MediaDescriptionCompat + 39;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
