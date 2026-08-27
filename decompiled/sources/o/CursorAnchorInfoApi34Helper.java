package o;

import android.net.Uri;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlay;

/* JADX INFO: loaded from: classes3.dex */
public final class CursorAnchorInfoApi34Helper {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public final String IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final Uri read;
    public final boolean serializer;
    public final InAppCameraOverlay write;

    public CursorAnchorInfoApi34Helper(Uri uri, String str, InAppCameraOverlay inAppCameraOverlay, boolean z, boolean z2) {
        inAppCameraOverlay.getClass();
        this.read = uri;
        this.IconCompatParcelizer = str;
        this.write = inAppCameraOverlay;
        this.serializer = z;
        this.RemoteActionCompatParcelizer = z2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 39;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.IconCompatParcelizer);
        int iHashCode = Boolean.hashCode(this.RemoteActionCompatParcelizer) + d$$ExternalSyntheticOutline0.m((this.write.hashCode() + iM) * 31, 31, this.serializer);
        int i4 = MediaMetadataCompat + 69;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return iHashCode;
    }

    public static CursorAnchorInfoApi34Helper RemoteActionCompatParcelizer(CursorAnchorInfoApi34Helper cursorAnchorInfoApi34Helper, Uri uri, String str, InAppCameraOverlay inAppCameraOverlay, boolean z, boolean z2, int i) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = MediaBrowserCompatMediaItem + 69;
            MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            uri = cursorAnchorInfoApi34Helper.read;
        }
        Uri uri2 = uri;
        if ((i & 2) != 0) {
            str = cursorAnchorInfoApi34Helper.IconCompatParcelizer;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            int i5 = MediaMetadataCompat + 1;
            MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            inAppCameraOverlay = cursorAnchorInfoApi34Helper.write;
        }
        InAppCameraOverlay inAppCameraOverlay2 = inAppCameraOverlay;
        if ((i & 8) != 0) {
            int i7 = MediaBrowserCompatMediaItem + 89;
            MediaMetadataCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z = cursorAnchorInfoApi34Helper.serializer;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            int i9 = MediaMetadataCompat + 95;
            MediaBrowserCompatMediaItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                boolean z4 = cursorAnchorInfoApi34Helper.RemoteActionCompatParcelizer;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            z2 = cursorAnchorInfoApi34Helper.RemoteActionCompatParcelizer;
        }
        cursorAnchorInfoApi34Helper.getClass();
        uri2.getClass();
        str2.getClass();
        inAppCameraOverlay2.getClass();
        return new CursorAnchorInfoApi34Helper(uri2, str2, inAppCameraOverlay2, z3, z2);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("InAppCameraWithTagsUiState(clickedPictureUri=");
        sb.append(this.read);
        sb.append(", pictureOutputFilePath=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", overlay=");
        sb.append(this.write);
        sb.append(", enablePinchZoom=");
        sb.append(this.serializer);
        sb.append(", enableZoomControl=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, ")");
        int i2 = MediaMetadataCompat + 7;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 103;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CursorAnchorInfoApi34Helper)) {
            int i4 = i3 + 71;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        CursorAnchorInfoApi34Helper cursorAnchorInfoApi34Helper = (CursorAnchorInfoApi34Helper) obj;
        if (!this.read.equals(cursorAnchorInfoApi34Helper.read) || !this.IconCompatParcelizer.equals(cursorAnchorInfoApi34Helper.IconCompatParcelizer)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, cursorAnchorInfoApi34Helper.write}, getCieXyz.write())).booleanValue() && this.serializer == cursorAnchorInfoApi34Helper.serializer && this.RemoteActionCompatParcelizer == cursorAnchorInfoApi34Helper.RemoteActionCompatParcelizer;
    }
}
