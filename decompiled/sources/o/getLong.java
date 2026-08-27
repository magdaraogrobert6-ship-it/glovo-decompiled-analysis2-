package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getLong extends QueryResultDefaultImpls {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public final boolean IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;
    public final clearReturnedFromScrapFlag read;
    public final String serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getLong(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, String str, String str2, String str3, String str4, clearReturnedFromScrapFlag clearreturnedfromscrapflag, boolean z) {
        super(new getBoolean(str3, androidx.compose.ui.text.input.KeyboardType.Companion.m3321getPhonePjHm6EE(), str4, clearreturnedfromscrapflag, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z));
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        str4.getClass();
        clearreturnedfromscrapflag.getClass();
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RatingCompat = str;
        this.MediaBrowserCompatMediaItem = str2;
        this.serializer = str3;
        this.MediaSessionCompatQueueItem = str4;
        this.read = clearreturnedfromscrapflag;
        this.IconCompatParcelizer = z;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        String str = this.RatingCompat;
        int iHashCode3 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = MediaMetadataCompat + 49;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int iM = af$$ExternalSyntheticOutline0.m(((iHashCode2 * 31) + iHashCode) * 31, 31, this.MediaBrowserCompatMediaItem);
        String str2 = this.serializer;
        if (str2 != null) {
            iHashCode3 = str2.hashCode();
            int i4 = MediaMetadataCompat + 31;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        return Boolean.hashCode(this.IconCompatParcelizer) + ((this.read.hashCode() + af$$ExternalSyntheticOutline0.m((iM + iHashCode3) * 31, 31, this.MediaSessionCompatQueueItem)) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("PhoneEntity(onTextChanged=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", prefix=");
        sb.append(this.RatingCompat);
        sb.append(", subTitle=");
        c8$$ExternalSyntheticOutline0.m(sb, this.MediaBrowserCompatMediaItem, ", hint=", this.serializer, ", username=REDACTED, inputValidator=");
        sb.append(this.read);
        sb.append(", isInitialState=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        String string = sb.toString();
        int i2 = MediaMetadataCompat + 15;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaDescriptionCompat + 31;
            MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getLong)) {
            return false;
        }
        getLong getlong = (getLong) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getlong.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i4 = MediaDescriptionCompat + 41;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, getlong.RatingCompat}, getCieXyz.write())).booleanValue()) {
            int i5 = MediaMetadataCompat + 91;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, getlong.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getlong.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, getlong.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
            int i6 = MediaDescriptionCompat + 49;
            MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getlong.read}, getCieXyz.write())).booleanValue()) {
            return this.IconCompatParcelizer == getlong.IconCompatParcelizer;
        }
        int i8 = MediaMetadataCompat + 85;
        MediaDescriptionCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
