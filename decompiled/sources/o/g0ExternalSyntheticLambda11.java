package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import okio.Options;

/* JADX INFO: loaded from: classes3.dex */
public final class g0ExternalSyntheticLambda11 extends Options.Companion {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final boolean IconCompatParcelizer;
    public final boolean MediaDescriptionCompat;
    public final f6 RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final int write;

    @Override // okio.Options.Companion
    public final f6 L_() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 19;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        f6 f6Var = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 37;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return f6Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // okio.Options.Companion
    public final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 105;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        boolean z = this.IconCompatParcelizer;
        int i5 = i3 + 55;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return z;
    }

    public g0ExternalSyntheticLambda11(int i, int i2, int i3, f6 f6Var, boolean z, boolean z2, int i4) {
        if ((i4 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
            int i5 = MediaMetadataCompat + 37;
            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaSessionCompatQueueItem = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 5;
            MediaMetadataCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            z2 = false;
        }
        f6Var.getClass();
        this.read = i;
        this.serializer = i2;
        this.write = i3;
        this.RemoteActionCompatParcelizer = f6Var;
        this.IconCompatParcelizer = z;
        this.MediaDescriptionCompat = z2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 53;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(this.read, this.serializer, "RingIconMarker(iconDrawable=", ", iconBackgroundColor=", ", ringBackgroundColor=");
        sbM.append(this.write);
        sbM.append(", iconColor=2131101537, badgeDrawable=null, iconAnchor=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", highlighted=");
        String strSerializer = MediaSessionCompatQueueItem.serializer(sbM, this.IconCompatParcelizer, ", small=", this.MediaDescriptionCompat, ")");
        int i4 = MediaSessionCompatQueueItem + 9;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strSerializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 13;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(com.logistics.rider.glovo.R.color.neutral_00, af$$ExternalSyntheticOutline0.m(this.write, af$$ExternalSyntheticOutline0.m(this.serializer, Integer.hashCode(this.read) * 31, 31), 31), 961);
        int iHashCode = Boolean.hashCode(this.MediaDescriptionCompat) + d$$ExternalSyntheticOutline0.m((this.RemoteActionCompatParcelizer.hashCode() + iM) * 31, 31, this.IconCompatParcelizer);
        int i4 = MediaMetadataCompat + 75;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0ExternalSyntheticLambda11) {
            g0ExternalSyntheticLambda11 g0externalsyntheticlambda11 = (g0ExternalSyntheticLambda11) obj;
            if (this.read == g0externalsyntheticlambda11.read) {
                if (this.serializer == g0externalsyntheticlambda11.serializer) {
                    if (this.write == g0externalsyntheticlambda11.write) {
                        Object[] objArr = {this.RemoteActionCompatParcelizer, g0externalsyntheticlambda11.RemoteActionCompatParcelizer};
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer == g0externalsyntheticlambda11.IconCompatParcelizer && this.MediaDescriptionCompat == g0externalsyntheticlambda11.MediaDescriptionCompat) {
                            return true;
                        }
                    }
                } else {
                    int i2 = MediaMetadataCompat + 119;
                    MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                }
            }
        }
        int i4 = MediaSessionCompatQueueItem + 97;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
