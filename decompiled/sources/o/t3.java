package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class t3 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final androidx.compose.ui.graphics.Color IconCompatParcelizer;
    public final androidx.compose.ui.graphics.Color RemoteActionCompatParcelizer;
    public final boolean read;
    public final String serializer;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk write;

    public t3(String str, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, androidx.compose.ui.graphics.Color color, androidx.compose.ui.graphics.Color color2, boolean z) {
        str.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        this.serializer = str;
        this.write = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.RemoteActionCompatParcelizer = color;
        this.IconCompatParcelizer = color2;
        this.read = z;
    }

    public static t3 write(t3 t3Var) {
        int i = 2 % 2;
        String str = t3Var.serializer;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = t3Var.write;
        androidx.compose.ui.graphics.Color color = t3Var.RemoteActionCompatParcelizer;
        androidx.compose.ui.graphics.Color color2 = t3Var.IconCompatParcelizer;
        t3Var.getClass();
        str.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        t3 t3Var2 = new t3(str, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, color, color2, true);
        int i2 = RatingCompat + 99;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return t3Var2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("BonusMultiplier(multiplierText=");
        sb.append(this.serializer);
        sb.append(", bonusIndicators=");
        sb.append(this.write);
        sb.append(", bonusRowBackground=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", multiplierBackground=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", iconsBeforeText=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.read, ")");
        int i2 = RatingCompat + 83;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final int hashCode() {
        int iM729hashCodeimpl;
        int i = 2 % 2;
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = this.write.hashCode();
        androidx.compose.ui.graphics.Color color = this.RemoteActionCompatParcelizer;
        int iM729hashCodeimpl2 = 0;
        if (color == null) {
            int i2 = MediaBrowserCompatMediaItem + 3;
            RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iM729hashCodeimpl = 0;
        } else {
            iM729hashCodeimpl = androidx.compose.ui.graphics.Color.m729hashCodeimpl(color.m732unboximpl());
        }
        androidx.compose.ui.graphics.Color color2 = this.IconCompatParcelizer;
        if (color2 == null) {
            int i4 = RatingCompat + 113;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            iM729hashCodeimpl2 = androidx.compose.ui.graphics.Color.m729hashCodeimpl(color2.m732unboximpl());
        }
        return Boolean.hashCode(this.read) + ((((((iHashCode2 + (iHashCode * 31)) * 31) + iM729hashCodeimpl) * 31) + iM729hashCodeimpl2) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 81;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3)) {
            return false;
        }
        t3 t3Var = (t3) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, t3Var.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, t3Var.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, t3Var.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, t3Var.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return this.read == t3Var.read;
        }
        int i3 = RatingCompat + 93;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
