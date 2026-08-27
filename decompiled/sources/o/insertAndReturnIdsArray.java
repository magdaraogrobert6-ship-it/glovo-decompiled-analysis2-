package o;

/* JADX INFO: loaded from: classes3.dex */
public final class insertAndReturnIdsArray implements resizeToBitmapDimensionslambda0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final insertAndReturnIdsArrayBox write;

    public insertAndReturnIdsArray(insertAndReturnIdsArrayBox insertandreturnidsarraybox) {
        this.write = insertandreturnidsarraybox;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 19;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        insertAndReturnIdsArrayBox insertandreturnidsarraybox = this.write;
        if (insertandreturnidsarraybox != null) {
            return insertandreturnidsarraybox.hashCode();
        }
        int i5 = i2 + 67;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "BookShiftConfirmationViewState(shift=" + this.write + ")";
        int i2 = IconCompatParcelizer + 21;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 115;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof insertAndReturnIdsArray)) {
            int i4 = i3 + 11;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, ((insertAndReturnIdsArray) obj).write}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i6 = read + 25;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
