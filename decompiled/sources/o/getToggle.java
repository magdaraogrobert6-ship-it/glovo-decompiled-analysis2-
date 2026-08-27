package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class getToggle {
    public static final androidx.compose.ui.text.font.FontWeight IconCompatParcelizer;
    public static final androidx.compose.ui.text.font.GenericFontFamily RemoteActionCompatParcelizer;
    public static final androidx.compose.ui.text.font.GenericFontFamily read;
    public static final androidx.compose.ui.text.font.FontWeight serializer;
    public static final androidx.compose.ui.text.font.FontWeight write;

    static {
        androidx.compose.ui.text.font.FontFamily.Companion companion = androidx.compose.ui.text.font.FontFamily.Companion;
        read = companion.getSansSerif();
        RemoteActionCompatParcelizer = companion.getSansSerif();
        androidx.compose.ui.text.font.FontWeight.Companion companion2 = androidx.compose.ui.text.font.FontWeight.Companion;
        serializer = companion2.getBold();
        write = companion2.getMedium();
        IconCompatParcelizer = companion2.getNormal();
    }
}
