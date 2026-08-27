package o;

import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class opticalSizingR2X_6o {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final setLastHorizontalStyle IconCompatParcelizer;

    public opticalSizingR2X_6o(setLastHorizontalStyle setlasthorizontalstyle) {
        this.IconCompatParcelizer = setlasthorizontalstyle;
    }

    public final List write(f8 f8Var, g5 g5Var, int i) {
        int i2 = 2 % 2;
        g5Var.getClass();
        String str = "df_dynamic_line_" + UUID.randomUUID();
        int iSerializer = getQueryParameterslambda2.serializer();
        fg fgVar = new fg(null, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{f8Var}, getQueryParameterslambda2.serializer(), -516583649, iSerializer), 0.0d, fb.ARC, null, 0, g5Var, 297);
        String strConcat = str.concat("_shadow");
        setLastHorizontalStyle setlasthorizontalstyle = this.IconCompatParcelizer;
        List list = androidx.sqlite.SQLite.read(fg.serializer(fgVar, strConcat, 14.0d, 12.0d, null, androidx.compose.ui.graphics.ColorKt.m776toArgb8_81llA(setlasthorizontalstyle.IconCompatParcelizer().setOnMenuItemClickListener()), 946), fg.serializer(fgVar, str.concat("_white"), 8.0d, 0.0d, null, androidx.compose.ui.graphics.ColorKt.m776toArgb8_81llA(setlasthorizontalstyle.IconCompatParcelizer().getPopupTheme()), 954), fg.serializer(fgVar, str.concat("_dashed"), 2.0d, 0.0d, new fd(2.0d, 1.5d), i, 922));
        int i3 = read + 1;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public static List serializer(opticalSizingR2X_6o opticalsizingr2x_6o, f8 f8Var, f8 f8Var2, g5 g5Var, int i, String str, int i2) {
        String strConcat;
        String strConcat2;
        int i3 = 2 % 2;
        int iM776toArgb8_81llA = (i2 & 8) != 0 ? androidx.compose.ui.graphics.ColorKt.m776toArgb8_81llA(opticalsizingr2x_6o.IconCompatParcelizer.IconCompatParcelizer().setOnMenuItemClickListener()) : i;
        String str2 = (i2 & 16) != 0 ? null : str;
        opticalsizingr2x_6o.getClass();
        setLastHorizontalStyle setlasthorizontalstyle = opticalsizingr2x_6o.IconCompatParcelizer;
        f8Var.getClass();
        g5Var.getClass();
        fg fgVar = new fg(null, androidx.sqlite.SQLite.read(f8Var, f8Var2), 0.0d, fb.ARC, null, 0, g5Var, 425);
        if (str2 != null) {
            strConcat = str2.concat("_shadow");
        } else {
            int i4 = RemoteActionCompatParcelizer + 111;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            strConcat = null;
        }
        fg fgVarSerializer = fg.serializer(fgVar, strConcat, 14.0d, 12.0d, null, androidx.compose.ui.graphics.ColorKt.m776toArgb8_81llA(setlasthorizontalstyle.IconCompatParcelizer().setOnMenuItemClickListener()), 946);
        if (str2 != null) {
            int i6 = RemoteActionCompatParcelizer + 1;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            strConcat2 = str2.concat("_white");
        } else {
            strConcat2 = null;
        }
        return androidx.sqlite.SQLite.read(fgVarSerializer, fg.serializer(fgVar, strConcat2, 8.0d, 0.0d, null, androidx.compose.ui.graphics.ColorKt.m776toArgb8_81llA(setlasthorizontalstyle.IconCompatParcelizer().getPopupTheme()), 954), fg.serializer(fgVar, str2 != null ? str2.concat("_dashed") : null, 2.0d, 0.0d, new fd(2.0d, 1.5d), iM776toArgb8_81llA, 922));
    }
}
