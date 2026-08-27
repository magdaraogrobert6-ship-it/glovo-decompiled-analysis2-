package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda6lBbiU9eA4HcJTh7fZj0mBlQlbQ implements r8lambda56WtWDYfFxH1I9MfVEIOgBnACTY {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final String IconCompatParcelizer;
    public final boolean RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final boolean write;

    public r8lambda6lBbiU9eA4HcJTh7fZj0mBlQlbQ(String str, String str2, String str3, boolean z, String str4, boolean z2) {
        d$$ExternalSyntheticOutline0.m(str, str2, str3, str4);
        this.read = str;
        this.serializer = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.RatingCompat = z;
        this.IconCompatParcelizer = str4;
        this.write = z2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 27;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.write) + af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.serializer), 31, this.RemoteActionCompatParcelizer), 31, this.RatingCompat), 31, this.IconCompatParcelizer);
        int i4 = MediaBrowserCompatMediaItem + 81;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 53;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("PromotionsPreferenceItem(iconUrl=", this.read, ", label=", this.serializer, ", timeRange=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.RemoteActionCompatParcelizer, ", value=", ", type=", sbM, this.RatingCompat);
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", enabled=");
        sbM.append(this.write);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaBrowserCompatMediaItem + 117;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 89;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 125;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof r8lambda6lBbiU9eA4HcJTh7fZj0mBlQlbQ)) {
            int i6 = i3 + 75;
            MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        r8lambda6lBbiU9eA4HcJTh7fZj0mBlQlbQ r8lambda6lbbiu9ea4hcjth7fzj0mblqlbq = (r8lambda6lBbiU9eA4HcJTh7fZj0mBlQlbQ) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, r8lambda6lbbiu9ea4hcjth7fzj0mblqlbq.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambda6lbbiu9ea4hcjth7fzj0mblqlbq.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, r8lambda6lbbiu9ea4hcjth7fzj0mblqlbq.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i8 = MediaBrowserCompatMediaItem + 3;
            MediaDescriptionCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        if (this.RatingCompat == r8lambda6lbbiu9ea4hcjth7fzj0mblqlbq.RatingCompat) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, r8lambda6lbbiu9ea4hcjth7fzj0mblqlbq.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && this.write == r8lambda6lbbiu9ea4hcjth7fzj0mblqlbq.write;
        }
        int i10 = MediaBrowserCompatMediaItem + 33;
        MediaDescriptionCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i10 % 2 != 0;
    }
}
