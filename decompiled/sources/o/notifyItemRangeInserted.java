package o;

/* JADX INFO: loaded from: classes3.dex */
public final class notifyItemRangeInserted {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    public static androidx.compose.ui.layout.ContentScale read(String str) {
        int i = 2 % 2;
        str.getClass();
        if (!(!str.equals("fit"))) {
            int i2 = write + 17;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            androidx.compose.ui.layout.ContentScale inside = androidx.compose.ui.layout.ContentScale.Companion.getInside();
            int i4 = RemoteActionCompatParcelizer + 105;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return inside;
        }
        if (!str.equals("center")) {
            return androidx.compose.ui.layout.ContentScale.Companion.getInside();
        }
        int i6 = RemoteActionCompatParcelizer + 107;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return androidx.compose.ui.layout.ContentScale.Companion.getNone();
        }
        int i7 = 18 / 0;
        return androidx.compose.ui.layout.ContentScale.Companion.getNone();
    }
}
