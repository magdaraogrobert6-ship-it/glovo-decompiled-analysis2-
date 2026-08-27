package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda1rNldqZTruYAmq0tSFsnillPA extends AnimationSearchExternalSyntheticLambda2 {
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    private static int write = 1;
    public final long RemoteActionCompatParcelizer;
    public final String read;
    public final makeTreedefault serializer;

    static {
        CustomerUnavailableTaskUiItem$Companion customerUnavailableTaskUiItem$Companion = makeTreedefault.Companion;
        int i = IconCompatParcelizer + 77;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public r8lambda1rNldqZTruYAmq0tSFsnillPA(makeTreedefault maketreedefault, long j, String str) {
        maketreedefault.getClass();
        str.getClass();
        this.serializer = maketreedefault;
        this.RemoteActionCompatParcelizer = j;
        this.read = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RatingCompat + 39;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + d$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.RemoteActionCompatParcelizer);
        int i4 = RatingCompat + 109;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("OpenChatFlow(item=");
        sb.append(this.serializer);
        sb.append(", deliveryId=");
        sb.append(this.RemoteActionCompatParcelizer);
        String strM = d$$ExternalSyntheticOutline0.m(sb, ", deliveryState=", this.read, ")");
        int i2 = MediaBrowserCompatMediaItem + 43;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof r8lambda1rNldqZTruYAmq0tSFsnillPA) {
                r8lambda1rNldqZTruYAmq0tSFsnillPA r8lambda1rnldqztruyamq0tsfsnillpa = (r8lambda1rNldqZTruYAmq0tSFsnillPA) obj;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambda1rnldqztruyamq0tsfsnillpa.serializer}, getCieXyz.write())).booleanValue()) {
                    if (this.RemoteActionCompatParcelizer != r8lambda1rnldqztruyamq0tsfsnillpa.RemoteActionCompatParcelizer) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, r8lambda1rnldqztruyamq0tsfsnillpa.read}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    int i2 = RatingCompat + 41;
                    MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return true;
                }
                int i4 = MediaBrowserCompatMediaItem;
                int i5 = i4 + 63;
                RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                int i7 = i4 + 43;
                RatingCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 15 / 0;
                }
                return false;
            }
            int i9 = MediaBrowserCompatMediaItem + 79;
            RatingCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i9 % 2 == 0;
        }
        int i10 = MediaBrowserCompatMediaItem + 71;
        RatingCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return true;
    }
}
