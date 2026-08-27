package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getBaseUrl extends getConnectionOptions {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int read;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String serializer;
    public final String write;

    public getBaseUrl(String str, String str2, String str3, String str4) {
        d$$ExternalSyntheticOutline0.m(str, str2, str3, str4);
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.IconCompatParcelizer = str3;
        this.serializer = str4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 29;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("CashBlock(title=", this.write, ", description=", this.RemoteActionCompatParcelizer, ", buttonText="), this.IconCompatParcelizer, ", link=", this.serializer, ")");
        int i4 = MediaBrowserCompatMediaItem + 99;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 75;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.RemoteActionCompatParcelizer), 31, this.IconCompatParcelizer);
        int i4 = read + 89;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof getBaseUrl) {
                getBaseUrl getbaseurl = (getBaseUrl) obj;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, getbaseurl.write}, getCieXyz.write())).booleanValue()) {
                    int i2 = MediaBrowserCompatMediaItem + 25;
                    read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i2 % 2 != 0;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getbaseurl.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getbaseurl.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getbaseurl.serializer}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i3 = read + 25;
                MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i3 % 2 == 0;
            }
            int i4 = MediaBrowserCompatMediaItem + 103;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
        int i5 = MediaBrowserCompatMediaItem + 71;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return true;
    }
}
