package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setShadowui_text {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final double RemoteActionCompatParcelizer;
    public final double read;
    public final String serializer;

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 65;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.serializer;
        int i4 = i3 + 75;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final double RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 57;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        double d = this.read;
        int i4 = i2 + 119;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return d;
        }
        obj.hashCode();
        throw null;
    }

    public final double serializer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 25;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.RemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 51;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.IconCompatParcelizer;
        int i5 = i3 + 27;
        MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public setShadowui_text(double d, double d2, String str, String str2) {
        str2.getClass();
        this.read = d;
        this.RemoteActionCompatParcelizer = d2;
        this.IconCompatParcelizer = str;
        this.serializer = str2;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 3;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, Double.hashCode(this.read) * 31, 31);
        String str = this.IconCompatParcelizer;
        if (str == null) {
            int i5 = MediaBrowserCompatMediaItem + 93;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = 0;
        } else {
            int iHashCode = str.hashCode();
            int i7 = write + 99;
            MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 3 / 4;
            }
            i = iHashCode;
        }
        return this.serializer.hashCode() + ((iRemoteActionCompatParcelizer + i) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 67;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(this.read, "DestinationLocation(latitude=", ", longitude=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", caption=");
        sbM.append(this.IconCompatParcelizer);
        String strM = d$$ExternalSyntheticOutline0.m(sbM, ", vehicleType=", this.serializer, ")");
        int i4 = MediaBrowserCompatMediaItem + 35;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof setShadowui_text)) {
                return false;
            }
            setShadowui_text setshadowui_text = (setShadowui_text) obj;
            if (Double.compare(this.read, setshadowui_text.read) != 0) {
                return false;
            }
            if (Double.compare(this.RemoteActionCompatParcelizer, setshadowui_text.RemoteActionCompatParcelizer) == 0) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, setshadowui_text.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    int i2 = write + 103;
                    MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i2 % 2 == 0;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, setshadowui_text.serializer}, getCieXyz.write())).booleanValue();
            }
            int i3 = write + 13;
            MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i3 % 2 == 0;
        }
        int i4 = write + 11;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
