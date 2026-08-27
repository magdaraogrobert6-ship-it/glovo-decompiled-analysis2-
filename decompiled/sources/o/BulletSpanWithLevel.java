package o;

/* JADX INFO: loaded from: classes3.dex */
public final class BulletSpanWithLevel {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final String serializer;
    public final getDefaultIndentationXSAIIZE write;

    public final getDefaultIndentationXSAIIZE RemoteActionCompatParcelizer() {
        getDefaultIndentationXSAIIZE getdefaultindentationxsaiize;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 17;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            getdefaultindentationxsaiize = this.write;
            int i4 = 10 / 0;
        } else {
            getdefaultindentationxsaiize = this.write;
        }
        int i5 = i2 + 69;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getdefaultindentationxsaiize;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.serializer;
        int i4 = i3 + 63;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public BulletSpanWithLevel(getDefaultIndentationXSAIIZE getdefaultindentationxsaiize, String str) {
        getdefaultindentationxsaiize.getClass();
        this.write = getdefaultindentationxsaiize;
        this.serializer = str;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 23;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int iHashCode2 = this.write.hashCode();
            iHashCode = this.serializer.hashCode();
            i = iHashCode2 << 101;
        } else {
            int iHashCode3 = this.write.hashCode();
            iHashCode = this.serializer.hashCode();
            i = iHashCode3 * 31;
        }
        int i4 = iHashCode + i;
        int i5 = RemoteActionCompatParcelizer + 103;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return i4;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CachedChatAsset(asset=" + this.write + ", absolutePath=" + this.serializer + ")";
        int i2 = read + 77;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 13;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof BulletSpanWithLevel) {
            BulletSpanWithLevel bulletSpanWithLevel = (BulletSpanWithLevel) obj;
            Object[] objArr = {this.write, bulletSpanWithLevel.write};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && this.serializer.equals(bulletSpanWithLevel.serializer)) {
                return true;
            }
        }
        int i4 = read + 85;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
