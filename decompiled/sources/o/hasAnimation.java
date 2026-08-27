package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableV2TaskUiItem$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class hasAnimation extends findAnimationSpec {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final accessibleField IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final String read;

    static {
        CustomerUnavailableV2TaskUiItem$Companion customerUnavailableV2TaskUiItem$Companion = accessibleField.Companion;
        int i = serializer + 15;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public hasAnimation(accessibleField accessiblefield, long j, String str) {
        accessiblefield.getClass();
        str.getClass();
        this.IconCompatParcelizer = accessiblefield;
        this.RemoteActionCompatParcelizer = j;
        this.read = str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RatingCompat + 113;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.read.hashCode() - d$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() << 48, 57, this.RemoteActionCompatParcelizer);
        } else {
            iHashCode = this.read.hashCode() + d$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.RemoteActionCompatParcelizer);
        }
        int i3 = MediaBrowserCompatMediaItem + 119;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("OpenChatFlow(item=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", deliveryId=");
        sb.append(this.RemoteActionCompatParcelizer);
        String strM = d$$ExternalSyntheticOutline0.m(sb, ", deliveryState=", this.read, ")");
        int i2 = MediaBrowserCompatMediaItem + 63;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RatingCompat + 59;
            MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(!(obj instanceof hasAnimation))) {
            hasAnimation hasanimation = (hasAnimation) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, hasanimation.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.RemoteActionCompatParcelizer == hasanimation.RemoteActionCompatParcelizer) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, hasanimation.read}, getCieXyz.write())).booleanValue();
            }
            int i4 = RatingCompat + 119;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = MediaBrowserCompatMediaItem + 117;
        RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
