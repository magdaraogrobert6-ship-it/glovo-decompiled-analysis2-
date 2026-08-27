package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class SemanticsNodeemitFakeNodesfakeNode2 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final accesscontentDescriptionFakeNodeId serializer;
    public final String write;

    public SemanticsNodeemitFakeNodesfakeNode2(String str, accesscontentDescriptionFakeNodeId accesscontentdescriptionfakenodeid, String str2, String str3, String str4) {
        str.getClass();
        this.IconCompatParcelizer = str;
        this.serializer = accesscontentdescriptionfakenodeid;
        this.write = str2;
        this.read = str3;
        this.RemoteActionCompatParcelizer = str4;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("AppMigrationActionsState(ctaButtonText=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", urgencyState=");
        sb.append(this.serializer);
        sb.append(", termsAndConditionsText=");
        c8$$ExternalSyntheticOutline0.m(sb, this.write, ", termsAndConditions=", this.read, ", dismissButtonText=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, ")");
        int i2 = MediaBrowserCompatMediaItem + 45;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        accesscontentDescriptionFakeNodeId accesscontentdescriptionfakenodeid = this.serializer;
        if (accesscontentdescriptionfakenodeid == null) {
            int i2 = MediaMetadataCompat + 39;
            MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = accesscontentdescriptionfakenodeid.hashCode();
            int i4 = MediaMetadataCompat + 25;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        String str = this.write;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.read;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.RemoteActionCompatParcelizer;
        return (((((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsNodeemitFakeNodesfakeNode2)) {
            int i2 = MediaBrowserCompatMediaItem + 21;
            MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        SemanticsNodeemitFakeNodesfakeNode2 semanticsNodeemitFakeNodesfakeNode2 = (SemanticsNodeemitFakeNodesfakeNode2) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, semanticsNodeemitFakeNodesfakeNode2.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, semanticsNodeemitFakeNodesfakeNode2.serializer}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, semanticsNodeemitFakeNodesfakeNode2.write}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, semanticsNodeemitFakeNodesfakeNode2.read}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, semanticsNodeemitFakeNodesfakeNode2.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i4 = MediaBrowserCompatMediaItem + 107;
                MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = MediaMetadataCompat + 57;
            MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = MediaBrowserCompatMediaItem + 85;
        MediaMetadataCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
