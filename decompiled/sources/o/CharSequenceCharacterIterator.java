package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class CharSequenceCharacterIterator {
    private static int PlaybackStateCompatCustomAction = 1;
    private static int RatingCompat;
    public final boolean IconCompatParcelizer;
    public final CanvasCompatS MediaBrowserCompatMediaItem;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final String RemoteActionCompatParcelizer;
    public final int read;
    public final String serializer;
    public final String write;

    public CharSequenceCharacterIterator(CanvasCompatS canvasCompatS, String str, String str2, String str3, String str4, int i, boolean z, boolean z2, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
        canvasCompatS.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        this.MediaBrowserCompatMediaItem = canvasCompatS;
        this.MediaMetadataCompat = str;
        this.RemoteActionCompatParcelizer = str2;
        this.write = str3;
        this.serializer = str4;
        this.read = i;
        this.MediaSessionCompatQueueItem = z;
        this.IconCompatParcelizer = z2;
        this.MediaDescriptionCompat = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RatingCompat + 29;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.MediaBrowserCompatMediaItem.hashCode();
        String str = this.MediaMetadataCompat;
        int iHashCode3 = 1;
        if (str == null) {
            int i4 = RatingCompat + 105;
            PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.RemoteActionCompatParcelizer;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.write;
        if (str3 == null) {
            int i5 = RatingCompat + 91;
            PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                iHashCode3 = 0;
            }
        } else {
            iHashCode3 = str3.hashCode();
            int i6 = PlaybackStateCompatCustomAction + 41;
            RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        String str4 = this.serializer;
        return this.MediaDescriptionCompat.hashCode() + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.read, ((((((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31, 31), 31, this.MediaSessionCompatQueueItem), 31, this.IconCompatParcelizer);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("DestinationUiState(type=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", title=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", name=");
        c8$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, ", address=", this.write, ", estimatedTimeDistance=");
        sb.append(this.serializer);
        sb.append(", icon=");
        sb.append(this.read);
        sb.append(", visibleRouteLine=");
        af$$ExternalSyntheticOutline0.m(sb, this.MediaSessionCompatQueueItem, ", isNewAndNotLastDetail=", this.IconCompatParcelizer, ", tags=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(")");
        String string = sb.toString();
        int i2 = PlaybackStateCompatCustomAction + 55;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 113;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CharSequenceCharacterIterator)) {
            return false;
        }
        CharSequenceCharacterIterator charSequenceCharacterIterator = (CharSequenceCharacterIterator) obj;
        if (this.MediaBrowserCompatMediaItem != charSequenceCharacterIterator.MediaBrowserCompatMediaItem) {
            return false;
        }
        Object[] objArr = {this.MediaMetadataCompat, charSequenceCharacterIterator.MediaMetadataCompat};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i3 = PlaybackStateCompatCustomAction + 97;
            RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        Object[] objArr2 = {this.RemoteActionCompatParcelizer, charSequenceCharacterIterator.RemoteActionCompatParcelizer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.write, charSequenceCharacterIterator.write};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr4 = {this.serializer, charSequenceCharacterIterator.serializer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
            int i5 = RatingCompat + 123;
            PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (this.read != charSequenceCharacterIterator.read) {
            int i7 = PlaybackStateCompatCustomAction + 103;
            RatingCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (this.MediaSessionCompatQueueItem != charSequenceCharacterIterator.MediaSessionCompatQueueItem || this.IconCompatParcelizer != charSequenceCharacterIterator.IconCompatParcelizer) {
            return false;
        }
        Object[] objArr5 = {this.MediaDescriptionCompat, charSequenceCharacterIterator.MediaDescriptionCompat};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
            int i9 = RatingCompat + 19;
            PlaybackStateCompatCustomAction = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return true;
        }
        int i11 = PlaybackStateCompatCustomAction + 23;
        RatingCompat = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i11 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
