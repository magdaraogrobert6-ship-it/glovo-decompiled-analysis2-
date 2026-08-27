package o;

/* JADX INFO: loaded from: classes3.dex */
public final class toGlobalYPosition implements toGlobal {
    private static int read = 1;
    private static int serializer;
    public final Throwable write;

    @Override // o.toGlobal
    public final Throwable read() {
        int i = 2 % 2;
        int i2 = read + 33;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.write;
        }
        throw null;
    }

    public toGlobalYPosition(Throwable th) {
        this.write = th;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 19;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        Throwable th = this.write;
        if (th != null) {
            return th.hashCode();
        }
        int i5 = i3 + 79;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "UrlGenerating(throwable=" + this.write + ")";
        int i2 = serializer + 111;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof toGlobalYPosition)) {
                return false;
            }
            Object[] objArr = {this.write, ((toGlobalYPosition) obj).write};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = read;
            int i3 = i2 + 3;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 125;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        int i6 = read + 63;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
