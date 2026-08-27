package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class executeAsOneOrNull {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final ExecutableQueryexecuteAsOneOrNull1 MediaMetadataCompat;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public executeAsOneOrNull(ExecutableQueryexecuteAsOneOrNull1 executableQueryexecuteAsOneOrNull1, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.MediaMetadataCompat = executableQueryexecuteAsOneOrNull1;
        this.MediaBrowserCompatMediaItem = str;
        this.RatingCompat = str2;
        this.read = str3;
        this.RemoteActionCompatParcelizer = str4;
        this.IconCompatParcelizer = str5;
        this.serializer = str6;
        this.write = str7;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 71;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("UserProperties(userIdentityProperties=REDACTED, zone=", this.MediaBrowserCompatMediaItem, ", userWorkStatus=", this.RatingCompat, ", currentShiftId=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.read, ", city=", this.RemoteActionCompatParcelizer, ", brand=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.IconCompatParcelizer, ", contractType=", this.serializer, ", globalEntityId=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.write, ")");
        int i4 = MediaDescriptionCompat + 35;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 99;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode3 = this.MediaMetadataCompat.hashCode();
        String str = this.MediaBrowserCompatMediaItem;
        int iHashCode4 = 0;
        if (str == null) {
            int i4 = MediaSessionCompatQueueItem + 53;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i6 = MediaDescriptionCompat + 3;
            MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        String str2 = this.RatingCompat;
        if (str2 == null) {
            int i8 = MediaDescriptionCompat + 19;
            MediaSessionCompatQueueItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i10 = MediaSessionCompatQueueItem + 15;
            MediaDescriptionCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        String str3 = this.read;
        if (str3 != null) {
            iHashCode4 = str3.hashCode();
            int i12 = MediaDescriptionCompat + 19;
            MediaSessionCompatQueueItem = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
        return this.write.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode4) * 31, 31, this.RemoteActionCompatParcelizer), 31, this.IconCompatParcelizer), 31, this.serializer);
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 17;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof executeAsOneOrNull)) {
                return false;
            }
            executeAsOneOrNull executeasoneornull = (executeAsOneOrNull) obj;
            if (!this.MediaMetadataCompat.equals(executeasoneornull.MediaMetadataCompat)) {
                return false;
            }
            Object[] objArr = {this.MediaBrowserCompatMediaItem, executeasoneornull.MediaBrowserCompatMediaItem};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr2 = {this.RatingCompat, executeasoneornull.RatingCompat};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr3 = {this.read, executeasoneornull.read};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!this.RemoteActionCompatParcelizer.equals(executeasoneornull.RemoteActionCompatParcelizer)) {
                i = MediaSessionCompatQueueItem + 1;
                MediaDescriptionCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            } else if (!this.IconCompatParcelizer.equals(executeasoneornull.IconCompatParcelizer)) {
                i = MediaDescriptionCompat + 17;
                MediaSessionCompatQueueItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            } else if (!this.serializer.equals(executeasoneornull.serializer) || !this.write.equals(executeasoneornull.write)) {
                return false;
            }
            int i4 = i % 2;
            return false;
        }
        return true;
    }
}
