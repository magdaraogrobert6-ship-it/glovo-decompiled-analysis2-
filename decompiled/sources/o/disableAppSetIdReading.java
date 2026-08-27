package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class disableAppSetIdReading {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final String IconCompatParcelizer;
    public final enableCoppaCompliance MediaBrowserCompatMediaItem;
    public final String MediaMetadataCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final int write;

    public disableAppSetIdReading(enableCoppaCompliance enablecoppacompliance, String str, String str2, String str3, int i, String str4, String str5) {
        d$$ExternalSyntheticOutline0.m(str, str2, str4, str5);
        this.MediaBrowserCompatMediaItem = enablecoppacompliance;
        this.MediaMetadataCompat = str;
        this.RemoteActionCompatParcelizer = str2;
        this.IconCompatParcelizer = str3;
        this.write = i;
        this.serializer = str4;
        this.read = str5;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RatingCompat + 75;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.MediaBrowserCompatMediaItem.hashCode() * 31, 31, this.MediaMetadataCompat), 31, this.RemoteActionCompatParcelizer);
        String str = this.IconCompatParcelizer;
        if (str == null) {
            int i4 = MediaDescriptionCompat + 99;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return this.read.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.write, (iM + iHashCode) * 31, 31), 31, this.serializer);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("SafetyRecommendation(tag=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", title=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", message=");
        c8$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, ", callToAction=", this.IconCompatParcelizer, ", priority=");
        sb.append(this.write);
        sb.append(", communicationId=");
        sb.append(this.serializer);
        sb.append(", evaluationId=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.read, ")");
        int i2 = RatingCompat + 115;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 97;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof disableAppSetIdReading) {
            disableAppSetIdReading disableappsetidreading = (disableAppSetIdReading) obj;
            if (this.MediaBrowserCompatMediaItem == disableappsetidreading.MediaBrowserCompatMediaItem) {
                Object[] objArr = {this.MediaMetadataCompat, disableappsetidreading.MediaMetadataCompat};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    Object[] objArr2 = {this.RemoteActionCompatParcelizer, disableappsetidreading.RemoteActionCompatParcelizer};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                        Object[] objArr3 = {this.IconCompatParcelizer, disableappsetidreading.IconCompatParcelizer};
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue() && this.write == disableappsetidreading.write) {
                            Object[] objArr4 = {this.serializer, disableappsetidreading.serializer};
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                                Object[] objArr5 = {this.read, disableappsetidreading.read};
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        int i4 = RatingCompat + 23;
                        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                    }
                }
            }
        }
        int i6 = RatingCompat + 107;
        MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
