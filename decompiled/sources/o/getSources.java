package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getSources implements invoke0E7RQCE {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final int IconCompatParcelizer;
    public final String read;

    public getSources(int i, String str) {
        this.IconCompatParcelizer = i;
        this.read = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.read.hashCode() * (Integer.hashCode(this.IconCompatParcelizer) / 101);
        }
        return this.read.hashCode() + (Integer.hashCode(this.IconCompatParcelizer) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 123;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else if (obj instanceof getSources) {
            getSources getsources = (getSources) obj;
            if (this.IconCompatParcelizer != getsources.IconCompatParcelizer || !this.read.equals(getsources.read)) {
                return false;
            }
        } else {
            int i4 = write + 101;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Error(imageRes=" + this.IconCompatParcelizer + ", title=" + this.read + ")";
        int i2 = RemoteActionCompatParcelizer + 19;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
