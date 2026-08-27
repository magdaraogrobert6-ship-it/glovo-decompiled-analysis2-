package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class o9 extends o8ExternalSyntheticLambda0 {
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    public final String RemoteActionCompatParcelizer;
    public final int read;
    public final String serializer;
    public final String write;

    public o9(String str, String str2, int i, String str3) {
        this.write = str;
        this.serializer = str2;
        this.read = i;
        this.RemoteActionCompatParcelizer = str3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 19;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.read, af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.serializer), 31);
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + ((Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_medium_essentials_flag).hashCode() + iM) * 31);
        int i4 = IconCompatParcelizer + 91;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 43;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Available(title=", this.write, ", description=", this.serializer, ", descriptionTextColor=");
        sbM.append(this.read);
        sbM.append(", icon=");
        sbM.append(Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_medium_essentials_flag));
        sbM.append(", actionText=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.RemoteActionCompatParcelizer, ")");
        int i4 = MediaBrowserCompatMediaItem + 125;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 55;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object objValueOf = Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_medium_essentials_flag);
            if (this == obj) {
                int i3 = IconCompatParcelizer + 35;
                MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return true;
            }
            if (!(obj instanceof o9)) {
                return false;
            }
            o9 o9Var = (o9) obj;
            return this.write.equals(o9Var.write) && this.serializer.equals(o9Var.serializer) && this.read == o9Var.read && objValueOf.equals(objValueOf) && this.RemoteActionCompatParcelizer.equals(o9Var.RemoteActionCompatParcelizer);
        }
        Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_medium_essentials_flag);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
