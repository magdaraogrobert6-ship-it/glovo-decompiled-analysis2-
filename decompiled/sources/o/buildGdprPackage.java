package o;

/* JADX INFO: loaded from: classes3.dex */
public final class buildGdprPackage {
    private static int serializer = 0;
    private static int write = 1;
    public final setLastHorizontalStyle IconCompatParcelizer;

    public /* synthetic */ buildGdprPackage(setLastHorizontalStyle setlasthorizontalstyle) {
        this.IconCompatParcelizer = setlasthorizontalstyle;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    public int serializer(String str) {
        long overflowIcon;
        int i = 2 % 2;
        int iHashCode = str.hashCode();
        setLastHorizontalStyle setlasthorizontalstyle = this.IconCompatParcelizer;
        if (iHashCode != 75572) {
            if (iHashCode != 76328) {
                int i2 = serializer + 65;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (iHashCode == 2217378 && str.equals("HIGH")) {
                    overflowIcon = setlasthorizontalstyle.IconCompatParcelizer().setWindowTitle();
                    int i3 = serializer + 45;
                    write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                } else {
                    overflowIcon = setlasthorizontalstyle.IconCompatParcelizer().getSupportBackgroundTintList();
                }
            } else if (str.equals("MID")) {
                overflowIcon = setlasthorizontalstyle.IconCompatParcelizer().setExpandedActionViewsExclusive();
            } else {
                overflowIcon = setlasthorizontalstyle.IconCompatParcelizer().getSupportBackgroundTintList();
            }
        } else if (!str.equals("LOW")) {
            overflowIcon = setlasthorizontalstyle.IconCompatParcelizer().getSupportBackgroundTintList();
        } else {
            overflowIcon = setlasthorizontalstyle.IconCompatParcelizer().getOverflowIcon();
        }
        return androidx.compose.ui.graphics.ColorKt.m776toArgb8_81llA(overflowIcon);
    }
}
