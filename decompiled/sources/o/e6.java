package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e6 {
    private static int read = 1;
    private static int write;
    public final List IconCompatParcelizer;
    public final g6 RemoteActionCompatParcelizer;

    public e6(List list, g6 g6Var) {
        g6Var.getClass();
        this.IconCompatParcelizer = list;
        this.RemoteActionCompatParcelizer = g6Var;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + (this.IconCompatParcelizer.hashCode() * 31);
        int i4 = read + 57;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "MapLayersUiState(elements=" + this.IconCompatParcelizer + ", safeArea=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = write + 109;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 69;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 99;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof e6)) {
            int i6 = i2 + 27;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        e6 e6Var = (e6) obj;
        if (!this.IconCompatParcelizer.equals(e6Var.IconCompatParcelizer)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, e6Var.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
    }
}
