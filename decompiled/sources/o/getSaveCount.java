package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.LastStop$Confirmation$RemoveDetails$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class getSaveCount {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    private static int PlaybackStateCompatCustomAction = 1;
    private static int RatingCompat;
    public static final int read;
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final ProcessLifecycleOwner serializer;
    public final boolean write;

    public getSaveCount(String str, String str2, String str3, boolean z, boolean z2, ProcessLifecycleOwner processLifecycleOwner) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        processLifecycleOwner.getClass();
        this.MediaDescriptionCompat = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompatMediaItem = str3;
        this.RemoteActionCompatParcelizer = z;
        this.write = z2;
        this.serializer = processLifecycleOwner;
    }

    static {
        LastStop$Confirmation$RemoveDetails$Companion lastStop$Confirmation$RemoveDetails$Companion = ProcessLifecycleOwner.Companion;
        read = 8;
        int i = MediaSessionCompatQueueItem + 9;
        RatingCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 63;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.MediaDescriptionCompat.hashCode() * 31, 31, this.IconCompatParcelizer), 31, this.MediaBrowserCompatMediaItem), 31, this.RemoteActionCompatParcelizer), 31, this.write);
        int i4 = PlaybackStateCompatCustomAction + 101;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 35;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("LastStopAddressManageItems(title=", this.MediaDescriptionCompat, ", editTitle=", this.IconCompatParcelizer, ", removeTitle=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.MediaBrowserCompatMediaItem, ", isEditEnabled=", ", isRemoveEnabled=", sbM, this.RemoteActionCompatParcelizer);
        sbM.append(this.write);
        sbM.append(", removeDetails=");
        sbM.append(this.serializer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = PlaybackStateCompatCustomAction + 19;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 61;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof getSaveCount))) {
            getSaveCount getsavecount = (getSaveCount) obj;
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, getsavecount.MediaDescriptionCompat}, getCieXyz.write())).booleanValue())) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getsavecount.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, getsavecount.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) || this.RemoteActionCompatParcelizer != getsavecount.RemoteActionCompatParcelizer) {
                        return false;
                    }
                    if (this.write != getsavecount.write) {
                        int i4 = MediaMetadataCompat + 63;
                        PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getsavecount.serializer}, getCieXyz.write())).booleanValue();
                }
                int i6 = MediaMetadataCompat + 55;
                PlaybackStateCompatCustomAction = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = MediaMetadataCompat + 91;
            PlaybackStateCompatCustomAction = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        return false;
    }
}
