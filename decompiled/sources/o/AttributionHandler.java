package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class AttributionHandler extends setTimer {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int write;
    public final boolean IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;

    public AttributionHandler(String str, String str2, String str3, boolean z) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
        this.serializer = str3;
        this.IconCompatParcelizer = z;
    }

    public /* synthetic */ AttributionHandler(String str, String str2, String str3) {
        this(str, str2, str3, true);
    }

    public static AttributionHandler write(AttributionHandler attributionHandler, boolean z) {
        int i = 2 % 2;
        String str = attributionHandler.RemoteActionCompatParcelizer;
        String str2 = attributionHandler.read;
        String str3 = attributionHandler.serializer;
        str.getClass();
        str2.getClass();
        str3.getClass();
        AttributionHandler attributionHandler2 = new AttributionHandler(str, str2, str3, z);
        int i2 = MediaBrowserCompatMediaItem + 63;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return attributionHandler2;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 87;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.IconCompatParcelizer) + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.read), 31, this.serializer);
        int i4 = write + 43;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 121;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Working(title=", this.RemoteActionCompatParcelizer, ", description=", this.read, ", area=");
        sbM.append(this.serializer);
        sbM.append(", isStopWorkingButtonEnabled=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = write + 125;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 113;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttributionHandler)) {
            return false;
        }
        AttributionHandler attributionHandler = (AttributionHandler) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, attributionHandler.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, attributionHandler.read}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, attributionHandler.serializer}, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer == attributionHandler.IconCompatParcelizer;
        }
        int i4 = MediaBrowserCompatMediaItem + 69;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
