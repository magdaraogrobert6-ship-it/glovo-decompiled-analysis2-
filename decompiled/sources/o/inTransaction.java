package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class inTransaction {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final int write;

    public inTransaction(int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 1;
        int i6 = com.logistics.rider.glovo.R.string.camera_permission_title;
        if (i5 != 0) {
            int i7 = MediaMetadataCompat + 63;
            MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 = com.logistics.rider.glovo.R.string.camera_permission_title;
        } else {
            i2 = com.logistics.rider.glovo.R.string.df_crowdsourcing_camera_permission_rationale_title;
        }
        if ((i & 2) != 0) {
            int i9 = MediaMetadataCompat + 47;
            MediaBrowserCompatMediaItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            i3 = com.logistics.rider.glovo.R.string.camera_permission_rational_message;
        } else {
            int i12 = 2 % 2;
            i3 = com.logistics.rider.glovo.R.string.df_crowdsourcing_camera_permission_rationale_message;
        }
        if ((i & 4) != 0) {
            int i13 = MediaMetadataCompat + 1;
            MediaBrowserCompatMediaItem = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                int i14 = 14 / 0;
            }
            int i15 = 2 % 2;
            i4 = com.logistics.rider.glovo.R.string.camera_permission_rational_button_text;
        } else {
            i4 = com.logistics.rider.glovo.R.string.df_crowdsourcing_camera_permission_rationale_button_text;
        }
        if ((i & 8) != 0) {
            int i16 = 2 % 2;
        } else {
            int i17 = MediaBrowserCompatMediaItem + 101;
            MediaMetadataCompat = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i17 % 2 == 0) {
                int i18 = 2 % 2;
            }
            i6 = com.logistics.rider.glovo.R.string.df_crowdsourcing_camera_permission_denied_title;
        }
        int i19 = (i & 16) != 0 ? com.logistics.rider.glovo.R.string.camera_permission_denied_message : com.logistics.rider.glovo.R.string.df_crowdsourcing_camera_permission_denied_message;
        this.write = i2;
        this.RemoteActionCompatParcelizer = i3;
        this.read = i4;
        this.IconCompatParcelizer = i6;
        this.serializer = i19;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 23;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(this.write, this.RemoteActionCompatParcelizer, "CameraPermissionStrings(rationaleTitle=", ", rationaleDescription=", ", rationaleButtonName=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.read, this.IconCompatParcelizer, ", deniedTitle=", ", deniedDescription=", sbM);
        String strM = af$$ExternalSyntheticOutline0.m(this.serializer, ", deniedButtonName=2132017607)", sbM);
        int i4 = MediaMetadataCompat + 1;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 27;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(com.logistics.rider.glovo.R.string.camera_permission_denied_button_text) + af$$ExternalSyntheticOutline0.m(this.serializer, af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, af$$ExternalSyntheticOutline0.m(this.read, af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, Integer.hashCode(this.write) * 31, 31), 31), 31), 31);
        int i4 = MediaMetadataCompat + 111;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = MediaMetadataCompat + 99;
            MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof inTransaction)) {
            return false;
        }
        inTransaction intransaction = (inTransaction) obj;
        if (this.write == intransaction.write) {
            if (this.RemoteActionCompatParcelizer != intransaction.RemoteActionCompatParcelizer) {
                return false;
            }
            if (this.read == intransaction.read) {
                return this.IconCompatParcelizer == intransaction.IconCompatParcelizer && this.serializer == intransaction.serializer;
            }
            i = MediaBrowserCompatMediaItem + 7;
        } else {
            i = MediaBrowserCompatMediaItem + 15;
        }
        MediaMetadataCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i % 2;
        return false;
    }
}
