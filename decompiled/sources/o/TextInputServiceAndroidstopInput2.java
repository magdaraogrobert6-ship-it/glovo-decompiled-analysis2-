package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class TextInputServiceAndroidstopInput2 extends TextInputServiceAndroidonImeActionPerformed1 {
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public TextInputServiceAndroidstopInput2(String str, String str2, String str3, String str4) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str4);
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.serializer = str3;
        this.read = str4;
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 95;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("DeliveryNotesLink(title=", this.write, ", pageTitle=", this.RemoteActionCompatParcelizer, ", text="), this.serializer, ", link=", this.read, ")");
            int i3 = 21 / 0;
        } else {
            strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("DeliveryNotesLink(title=", this.write, ", pageTitle=", this.RemoteActionCompatParcelizer, ", text="), this.serializer, ", link=", this.read, ")");
        }
        int i4 = MediaBrowserCompatMediaItem + 97;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 23;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.RemoteActionCompatParcelizer);
        String str = this.serializer;
        if (str == null) {
            int i4 = MediaBrowserCompatMediaItem + 29;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = (i4 % 2 != 0 ? 0 : 1) ^ 1;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode2 = this.read.hashCode() + ((iM + iHashCode) * 31);
        int i5 = MediaBrowserCompatMediaItem + 123;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
        return iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof TextInputServiceAndroidstopInput2) {
                TextInputServiceAndroidstopInput2 textInputServiceAndroidstopInput2 = (TextInputServiceAndroidstopInput2) obj;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, textInputServiceAndroidstopInput2.write}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, textInputServiceAndroidstopInput2.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, textInputServiceAndroidstopInput2.serializer}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, textInputServiceAndroidstopInput2.read}, getCieXyz.write())).booleanValue();
                }
                int i2 = MediaBrowserCompatMediaItem + 111;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = IconCompatParcelizer;
            int i5 = i4 + 11;
            MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = i4 + 71;
            MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 68 / 0;
            }
            return false;
        }
        int i9 = MediaBrowserCompatMediaItem + 81;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return true;
    }
}
