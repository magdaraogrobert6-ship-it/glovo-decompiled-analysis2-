package o;

/* JADX INFO: loaded from: classes3.dex */
public final class CircleShape {
    private static int serializer = 0;
    private static int write = 1;
    public final Throwable IconCompatParcelizer;
    public final getDefaultIndentationXSAIIZE read;

    public CircleShape(getDefaultIndentationXSAIIZE getdefaultindentationxsaiize, Throwable th) {
        getdefaultindentationxsaiize.getClass();
        this.read = getdefaultindentationxsaiize;
        this.IconCompatParcelizer = th;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 121;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.IconCompatParcelizer.hashCode() / (this.read.hashCode() % 20);
        }
        return this.IconCompatParcelizer.hashCode() + (this.read.hashCode() * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ChatAssetDownloadFailure(asset=" + this.read + ", throwable=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 57;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 61;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CircleShape)) {
            return false;
        }
        CircleShape circleShape = (CircleShape) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, circleShape.read}, getCieXyz.write())).booleanValue()) {
            return this.IconCompatParcelizer.equals(circleShape.IconCompatParcelizer);
        }
        int i3 = serializer + 53;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
