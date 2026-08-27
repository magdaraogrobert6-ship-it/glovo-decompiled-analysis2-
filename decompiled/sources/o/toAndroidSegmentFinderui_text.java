package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class toAndroidSegmentFinderui_text {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public final ArrayList IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public toAndroidSegmentFinderui_text(String str, String str2, String str3, String str4, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        this.write = str;
        this.read = str2;
        this.IconCompatParcelizer = arrayList;
        this.RemoteActionCompatParcelizer = str3;
        this.serializer = str4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 119;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("OrderItem(serial=", this.write, ", name=", this.read, ", orderItemProducts=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", pickupInstructions=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", dropoffInstructions=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.serializer, ")");
        int i4 = MediaBrowserCompatMediaItem + 125;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 67;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iWrite = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.IconCompatParcelizer, af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.read), 31);
        String str = this.RemoteActionCompatParcelizer;
        if (str == null) {
            int i5 = MediaBrowserCompatMediaItem + 11;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            i = i5 % 2 == 0 ? 1 : 0;
        } else {
            int iHashCode = str.hashCode();
            int i6 = MediaDescriptionCompat + 95;
            MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i = iHashCode;
        }
        String str2 = this.serializer;
        return ((iWrite + i) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaBrowserCompatMediaItem + 75;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            if (!(obj instanceof toAndroidSegmentFinderui_text)) {
                return false;
            }
            toAndroidSegmentFinderui_text toandroidsegmentfinderui_text = (toAndroidSegmentFinderui_text) obj;
            Object[] objArr = {this.write, toandroidsegmentfinderui_text.write};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr2 = {this.read, toandroidsegmentfinderui_text.read};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() || !this.IconCompatParcelizer.equals(toandroidsegmentfinderui_text.IconCompatParcelizer)) {
                return false;
            }
            Object[] objArr3 = {this.RemoteActionCompatParcelizer, toandroidsegmentfinderui_text.RemoteActionCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr4 = {this.serializer, toandroidsegmentfinderui_text.serializer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                return false;
            }
        }
        int i4 = MediaDescriptionCompat + 73;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
