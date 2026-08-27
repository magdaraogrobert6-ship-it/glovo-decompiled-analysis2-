package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class StaggeredGridLayoutManagerLazySpanLookupFullSpanItem1 extends StaggeredGridLayoutManager {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final ArrayList serializer;
    public final String write;

    public StaggeredGridLayoutManagerLazySpanLookupFullSpanItem1(String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.read = str4;
        this.serializer = arrayList;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 15;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.IconCompatParcelizer), 31, this.RemoteActionCompatParcelizer), 31, this.read);
        int i4 = MediaMetadataCompat + 59;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 33;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("BookableShifts(title=", this.write, ", subTitle=", this.IconCompatParcelizer, ", viewAllButtonText=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.RemoteActionCompatParcelizer, ", viewAllDescription=", this.read, ", shiftList=");
        sbM.append(this.serializer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaMetadataCompat + 49;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 53;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof StaggeredGridLayoutManagerLazySpanLookupFullSpanItem1)) {
                return false;
            }
            StaggeredGridLayoutManagerLazySpanLookupFullSpanItem1 staggeredGridLayoutManagerLazySpanLookupFullSpanItem1 = (StaggeredGridLayoutManagerLazySpanLookupFullSpanItem1) obj;
            if (!this.write.equals(staggeredGridLayoutManagerLazySpanLookupFullSpanItem1.write) || !this.IconCompatParcelizer.equals(staggeredGridLayoutManagerLazySpanLookupFullSpanItem1.IconCompatParcelizer)) {
                return false;
            }
            if (this.RemoteActionCompatParcelizer.equals(staggeredGridLayoutManagerLazySpanLookupFullSpanItem1.RemoteActionCompatParcelizer)) {
                if (!this.read.equals(staggeredGridLayoutManagerLazySpanLookupFullSpanItem1.read) || (!this.serializer.equals(staggeredGridLayoutManagerLazySpanLookupFullSpanItem1.serializer))) {
                    return false;
                }
            } else {
                int i4 = MediaBrowserCompatMediaItem + 121;
                MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
        }
        return true;
    }
}
