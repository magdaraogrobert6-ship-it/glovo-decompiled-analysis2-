package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class KeyboardType implements accessgetDecimalcp {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final String IconCompatParcelizer;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final List read;
    public final List serializer;
    public final String write;

    public KeyboardType(String str, String str2, String str3, String str4, List list, List list2, String str5, String str6) {
        str4.getClass();
        this.MediaSessionCompatQueueItem = str;
        this.write = str2;
        this.MediaMetadataCompat = str3;
        this.RatingCompat = str4;
        this.serializer = list;
        this.read = list2;
        this.RemoteActionCompatParcelizer = str5;
        this.IconCompatParcelizer = str6;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 71;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.read, c8$$ExternalSyntheticOutline0.m(this.serializer, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.MediaSessionCompatQueueItem.hashCode() * 31, 31, this.write), 31, this.MediaMetadataCompat), 31, this.RatingCompat), 31), 31), 31, this.RemoteActionCompatParcelizer);
        int i4 = MediaDescriptionCompat + 81;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 45;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("TermsData(header=", this.MediaSessionCompatQueueItem, ", guidelinesFullText=", this.write, ", guidelinesLinkedText=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.MediaMetadataCompat, ", guidelinesUrl=", this.RatingCompat, ", guidelinePoints=");
        sbM.append(this.serializer);
        sbM.append(", examplePhotos=");
        sbM.append(this.read);
        sbM.append(", agreeButtonText=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.RemoteActionCompatParcelizer, ", goBackText=", this.IconCompatParcelizer, ")");
        int i4 = MediaDescriptionCompat + 17;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 67;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 77 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj instanceof KeyboardType) {
            KeyboardType keyboardType = (KeyboardType) obj;
            if (this.MediaSessionCompatQueueItem.equals(keyboardType.MediaSessionCompatQueueItem)) {
                if (!this.write.equals(keyboardType.write)) {
                    int i4 = MediaBrowserCompatMediaItem + 29;
                    MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                } else if (this.MediaMetadataCompat.equals(keyboardType.MediaMetadataCompat)) {
                    Object[] objArr = {this.RatingCompat, keyboardType.RatingCompat};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && this.serializer.equals(keyboardType.serializer) && this.read.equals(keyboardType.read) && this.RemoteActionCompatParcelizer.equals(keyboardType.RemoteActionCompatParcelizer) && this.IconCompatParcelizer.equals(keyboardType.IconCompatParcelizer)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
