package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class addMapJson {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public final String IconCompatParcelizer;
    public final String MediaDescriptionCompat;
    public final String MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final containsFireIds RemoteActionCompatParcelizer;
    public final addJsonObject read;
    public final String serializer;
    public final addInteger write;

    public addMapJson(String str, String str2, String str3, String str4, String str5, containsFireIds containsfireids, addInteger addinteger, addJsonObject addjsonobject) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.IconCompatParcelizer = str;
        this.serializer = str2;
        this.RatingCompat = str3;
        this.MediaDescriptionCompat = str4;
        this.MediaSessionCompatQueueItem = str5;
        this.RemoteActionCompatParcelizer = containsfireids;
        this.write = addinteger;
        this.read = addjsonobject;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 61;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Quest(id=", this.IconCompatParcelizer, ", name=", this.serializer, ", url=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.RatingCompat, ", timeFrame=", this.MediaDescriptionCompat, ", state=");
        sbM.append(this.MediaSessionCompatQueueItem);
        sbM.append(", reward=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", earning=");
        sbM.append(this.write);
        sbM.append(", progress=");
        sbM.append(this.read);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaBrowserCompatMediaItem + 71;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 77;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.serializer), 31, this.RatingCompat);
        String str = this.MediaDescriptionCompat;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.MediaSessionCompatQueueItem;
        int iHashCode4 = 1;
        if (str2 == null) {
            int i4 = MediaMetadataCompat + 19;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str2.hashCode();
        }
        containsFireIds containsfireids = this.RemoteActionCompatParcelizer;
        if (containsfireids == null) {
            int i5 = MediaBrowserCompatMediaItem + 25;
            MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                iHashCode4 = 0;
            }
        } else {
            iHashCode4 = containsfireids.hashCode();
            int i6 = MediaMetadataCompat + 115;
            MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 5 % 4;
            }
        }
        addInteger addinteger = this.write;
        int iHashCode5 = addinteger == null ? 0 : addinteger.hashCode();
        addJsonObject addjsonobject = this.read;
        if (addjsonobject != null) {
            iHashCode2 = addjsonobject.hashCode();
            int i8 = MediaMetadataCompat + 71;
            MediaBrowserCompatMediaItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        return ((((((((iM + iHashCode3) * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof addMapJson)) {
                return false;
            }
            addMapJson addmapjson = (addMapJson) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, addmapjson.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, addmapjson.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, addmapjson.RatingCompat}, getCieXyz.write())).booleanValue()) {
                int i2 = MediaMetadataCompat + 107;
                MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, addmapjson.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, addmapjson.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, addmapjson.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, addmapjson.write}, getCieXyz.write())).booleanValue()) {
                    int i4 = MediaBrowserCompatMediaItem + 101;
                    MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i4 % 2 != 0;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, addmapjson.read}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i5 = MediaBrowserCompatMediaItem + 21;
                MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            int i7 = MediaBrowserCompatMediaItem + 73;
            MediaMetadataCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = MediaMetadataCompat + 121;
        int i10 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i10;
        int i11 = i9 % 2;
        int i12 = i10 + 93;
        MediaMetadataCompat = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i12 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
