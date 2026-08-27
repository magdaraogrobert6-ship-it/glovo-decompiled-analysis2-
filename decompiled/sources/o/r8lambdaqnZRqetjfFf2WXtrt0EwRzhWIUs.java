package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final r8lambdaltZ1uNITaEov9GRvWdNWxxSy0k IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs(String str, String str2, String str3, String str4, r8lambdaltZ1uNITaEov9GRvWdNWxxSy0k r8lambdaltz1unitaeov9grvwdnwxxsy0k) {
        str.getClass();
        str4.getClass();
        this.read = str;
        this.write = str2;
        this.serializer = str3;
        this.RemoteActionCompatParcelizer = str4;
        this.IconCompatParcelizer = r8lambdaltz1unitaeov9grvwdnwxxsy0k;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 37;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("FrequentlyUsedItem(title=", this.read, ", unreadCount=", this.write, ", iconUrl=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.serializer, ", analyticsName=", this.RemoteActionCompatParcelizer, ", action=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RatingCompat + 117;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 121;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.read.hashCode();
        String str = this.write;
        int iHashCode3 = 0;
        if (str == null) {
            int i4 = MediaBrowserCompatMediaItem + 59;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RatingCompat = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 83;
            MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                int i8 = 4 / 3;
            }
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.serializer;
        if (str2 == null) {
            int i9 = RatingCompat + 7;
            MediaBrowserCompatMediaItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                int i10 = 5 % 3;
            }
        } else {
            iHashCode3 = str2.hashCode();
        }
        return this.IconCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3) * 31, 31, this.RemoteActionCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaBrowserCompatMediaItem + 65;
            RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 2 / 3;
            }
        } else {
            if (!(obj instanceof r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs)) {
                return false;
            }
            r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs r8lambdaqnzrqetjfff2wxtrt0ewrzhwius = (r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, r8lambdaqnzrqetjfff2wxtrt0ewrzhwius.read}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, r8lambdaqnzrqetjfff2wxtrt0ewrzhwius.write}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambdaqnzrqetjfff2wxtrt0ewrzhwius.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, r8lambdaqnzrqetjfff2wxtrt0ewrzhwius.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() || (!this.IconCompatParcelizer.equals(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius.IconCompatParcelizer))) {
                return false;
            }
        }
        int i4 = MediaBrowserCompatMediaItem + 105;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
