package o;

/* JADX INFO: loaded from: classes3.dex */
public final class findFragmentByTag {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int read;
    public final getFragment IconCompatParcelizer;
    public final getFragment RemoteActionCompatParcelizer;
    public final boolean serializer;
    public final getFragment write;

    public findFragmentByTag(getFragment getfragment, getFragment getfragment2, getFragment getfragment3, boolean z, int i) {
        if ((i & 1) != 0) {
            int i2 = read + 89;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaBrowserCompatMediaItem = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 5;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            getfragment = null;
        }
        if ((i & 4) != 0) {
            int i7 = read + 105;
            MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                throw null;
            }
            getfragment3 = null;
        }
        if ((i & 8) != 0) {
            int i8 = MediaBrowserCompatMediaItem + 13;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            z = i8 % 2 != 0;
        }
        this.IconCompatParcelizer = getfragment;
        this.write = getfragment2;
        this.RemoteActionCompatParcelizer = getfragment3;
        this.serializer = z;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        getFragment getfragment = this.IconCompatParcelizer;
        int iHashCode2 = 0;
        int iHashCode3 = getfragment == null ? 0 : getfragment.hashCode();
        getFragment getfragment2 = this.write;
        if (getfragment2 == null) {
            int i2 = read + 21;
            MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = getfragment2.hashCode();
        }
        getFragment getfragment3 = this.RemoteActionCompatParcelizer;
        if (getfragment3 == null) {
            int i3 = MediaBrowserCompatMediaItem + 23;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            iHashCode2 = getfragment3.hashCode();
        }
        return Boolean.hashCode(this.serializer) + (((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "FloatingRowState(start=" + this.IconCompatParcelizer + ", center=" + this.write + ", end=" + this.RemoteActionCompatParcelizer + ", extendToEdges=" + this.serializer + ")";
        int i2 = read + 31;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 125;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 47;
            MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof findFragmentByTag)) {
            return false;
        }
        findFragmentByTag findfragmentbytag = (findFragmentByTag) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, findfragmentbytag.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, findfragmentbytag.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, findfragmentbytag.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() && this.serializer == findfragmentbytag.serializer;
    }
}
