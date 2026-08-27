package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setDrawFilter {
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    public final boolean RemoteActionCompatParcelizer;
    public final boolean read;
    public final String serializer;
    public final boolean write;

    public setDrawFilter(String str, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.serializer = str;
        this.RemoteActionCompatParcelizer = z;
        this.write = z2;
        this.read = z3;
    }

    public static setDrawFilter serializer(setDrawFilter setdrawfilter, boolean z) {
        int i = 2 % 2;
        String str = setdrawfilter.serializer;
        boolean z2 = setdrawfilter.RemoteActionCompatParcelizer;
        boolean z3 = setdrawfilter.read;
        str.getClass();
        setDrawFilter setdrawfilter2 = new setDrawFilter(str, z2, z, z3);
        int i2 = MediaBrowserCompatMediaItem + 7;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return setdrawfilter2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 21;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strSerializer = MediaSessionCompatQueueItem.serializer(af$$ExternalSyntheticOutline0.m("ButtonState(text=", this.serializer, ", isEnabled=", ", isLoading=", this.RemoteActionCompatParcelizer), this.write, ", showButton=", this.read, ")");
        int i4 = IconCompatParcelizer + 113;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strSerializer;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.read) + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.RemoteActionCompatParcelizer), 31, this.write);
        int i4 = MediaBrowserCompatMediaItem + 115;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 57;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setDrawFilter)) {
            return false;
        }
        setDrawFilter setdrawfilter = (setDrawFilter) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, setdrawfilter.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.RemoteActionCompatParcelizer == setdrawfilter.RemoteActionCompatParcelizer) {
            return this.write == setdrawfilter.write && this.read == setdrawfilter.read;
        }
        int i4 = MediaBrowserCompatMediaItem + 125;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
