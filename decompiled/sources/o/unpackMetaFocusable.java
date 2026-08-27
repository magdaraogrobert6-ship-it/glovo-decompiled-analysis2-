package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class unpackMetaFocusable {
    private static int ParcelableVolumeInfo = 0;
    private static int PlaybackStateCompat = 1;
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final long MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public unpackMetaFocusable(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        this.MediaSessionCompatQueueItem = j;
        this.MediaDescriptionCompat = str;
        this.serializer = str2;
        this.write = str3;
        this.read = str4;
        this.RemoteActionCompatParcelizer = str5;
        this.MediaBrowserCompatMediaItem = str6;
        this.IconCompatParcelizer = str7;
        this.RatingCompat = str8;
        this.MediaMetadataCompat = str9;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 43;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("CountryConfigEntity(id=", ", name=", this.MediaSessionCompatQueueItem, this.MediaDescriptionCompat);
        c8$$ExternalSyntheticOutline0.m(sb, ", countryCode=", this.serializer, ", countryIsoCode=", this.write);
        c8$$ExternalSyntheticOutline0.m(sb, ", brand=", this.read, ", currency=", this.RemoteActionCompatParcelizer);
        c8$$ExternalSyntheticOutline0.m(sb, ", url=", this.MediaBrowserCompatMediaItem, ", globalEntityId=", this.IconCompatParcelizer);
        c8$$ExternalSyntheticOutline0.m(sb, ", registerUrl=", this.RatingCompat, ", privacyPolicyUrl=", this.MediaMetadataCompat);
        sb.append(")");
        String string = sb.toString();
        int i4 = PlaybackStateCompat + 83;
        ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return string;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 117;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Long.hashCode(this.MediaSessionCompatQueueItem) * 31, 31, this.MediaDescriptionCompat), 31, this.serializer), 31, this.write), 31, this.read), 31, this.RemoteActionCompatParcelizer), 31, this.MediaBrowserCompatMediaItem), 31, this.IconCompatParcelizer);
        String str = this.RatingCompat;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.MediaMetadataCompat;
        if (str2 == null) {
            int i4 = ParcelableVolumeInfo + 93;
            PlaybackStateCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 5 / 3;
            }
        } else {
            iHashCode = str2.hashCode();
        }
        return ((iM + iHashCode2) * 31) + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 119;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        PlaybackStateCompat = i3;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unpackMetaFocusable)) {
            int i4 = i3 + 55;
            ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
        unpackMetaFocusable unpackmetafocusable = (unpackMetaFocusable) obj;
        if (this.MediaSessionCompatQueueItem != unpackmetafocusable.MediaSessionCompatQueueItem) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, unpackmetafocusable.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, unpackmetafocusable.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, unpackmetafocusable.write}, getCieXyz.write())).booleanValue()) {
            int i5 = PlaybackStateCompat + 69;
            ParcelableVolumeInfo = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, unpackmetafocusable.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, unpackmetafocusable.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i7 = PlaybackStateCompat + 91;
            ParcelableVolumeInfo = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, unpackmetafocusable.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, unpackmetafocusable.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i9 = ParcelableVolumeInfo + 59;
            PlaybackStateCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, unpackmetafocusable.RatingCompat}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, unpackmetafocusable.MediaMetadataCompat}, getCieXyz.write())).booleanValue();
        }
        int i11 = ParcelableVolumeInfo + 1;
        PlaybackStateCompat = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i11 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }
}
