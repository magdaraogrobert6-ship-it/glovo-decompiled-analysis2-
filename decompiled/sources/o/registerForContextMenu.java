package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class registerForContextMenu implements writeGlobalCallbackParametersI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ registerForContextMenu[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private final String variantName;
    public static final registerForContextMenu CONTROL = new registerForContextMenu("CONTROL", 0, "Control");
    public static final registerForContextMenu VARIATION1 = new registerForContextMenu("VARIATION1", 1, "Variation1");
    public static final registerForContextMenu VARIATION2 = new registerForContextMenu("VARIATION2", 2, "Variation2");
    public static final registerForContextMenu VARIATION3 = new registerForContextMenu("VARIATION3", 3, "Variation3");
    public static final registerForContextMenu VARIATION4 = new registerForContextMenu("VARIATION4", 4, "Variation4");
    public static final registerForContextMenu VARIATION5 = new registerForContextMenu("VARIATION5", 5, "Variation5");
    public static final registerForContextMenu VARIATION6 = new registerForContextMenu("VARIATION6", 6, "Variation6");
    public static final registerForContextMenu VARIATION7 = new registerForContextMenu("VARIATION7", 7, "Variation7");
    public static final registerForContextMenu VARIATION8 = new registerForContextMenu("VARIATION8", 8, "Variation8");
    public static final registerForContextMenu VARIATION9 = new registerForContextMenu("VARIATION9", 9, "Variation9");
    public static final registerForContextMenu VARIATION10 = new registerForContextMenu("VARIATION10", 10, "Variation10");
    public static final registerForContextMenu VARIATION11 = new registerForContextMenu("VARIATION11", 11, "Variation11");
    public static final registerForContextMenu VARIATION12 = new registerForContextMenu("VARIATION12", 12, "Variation12");
    public static final registerForContextMenu VARIATION13 = new registerForContextMenu("VARIATION13", 13, "Variation13");
    public static final registerForContextMenu VARIATION14 = new registerForContextMenu("VARIATION14", 14, "Variation14");
    public static final registerForContextMenu VARIATION15 = new registerForContextMenu("VARIATION15", 15, "Variation15");
    public static final registerForContextMenu VARIATION16 = new registerForContextMenu("VARIATION16", 16, "Variation16");
    public static final registerForContextMenu VARIATION17 = new registerForContextMenu("VARIATION17", 17, "Variation17");
    public static final registerForContextMenu VARIATION18 = new registerForContextMenu("VARIATION18", 18, "Variation18");
    public static final registerForContextMenu VARIATION19 = new registerForContextMenu("VARIATION19", 19, "Variation19");
    public static final registerForContextMenu VARIATION20 = new registerForContextMenu("VARIATION20", 20, "Variation20");
    public static final registerForContextMenu VARIATION21 = new registerForContextMenu("VARIATION21", 21, "Variation21");
    public static final registerForContextMenu VARIATION22 = new registerForContextMenu("VARIATION22", 22, "Variation22");
    public static final registerForContextMenu VARIATION23 = new registerForContextMenu("VARIATION23", 23, "Variation23");
    public static final registerForContextMenu VARIATION24 = new registerForContextMenu("VARIATION24", 24, "Variation24");
    public static final registerForContextMenu VARIATION25 = new registerForContextMenu("VARIATION25", 25, "Variation25");
    public static final registerForContextMenu VARIATION26 = new registerForContextMenu("VARIATION26", 26, "Variation26");
    public static final registerForContextMenu VARIATION27 = new registerForContextMenu("VARIATION27", 27, "Variation27");
    public static final registerForContextMenu VARIATION28 = new registerForContextMenu("VARIATION28", 28, "Variation28");
    public static final registerForContextMenu VARIATION29 = new registerForContextMenu("VARIATION29", 29, "Variation29");
    public static final registerForContextMenu VARIATION30 = new registerForContextMenu("VARIATION30", 30, "Variation30");
    public static final registerForContextMenu VARIATION31 = new registerForContextMenu("VARIATION31", 31, "Variation31");
    public static final registerForContextMenu VARIATION32 = new registerForContextMenu("VARIATION32", 32, "Variation32");
    public static final registerForContextMenu VARIATION33 = new registerForContextMenu("VARIATION33", 33, "Variation33");
    public static final registerForContextMenu VARIATION34 = new registerForContextMenu("VARIATION34", 34, "Variation34");
    public static final registerForContextMenu VARIATION35 = new registerForContextMenu("VARIATION35", 35, "Variation35");
    public static final registerForContextMenu VARIATION36 = new registerForContextMenu("VARIATION36", 36, "Variation36");
    public static final registerForContextMenu VARIATION37 = new registerForContextMenu("VARIATION37", 37, "Variation37");
    public static final registerForContextMenu VARIATION38 = new registerForContextMenu("VARIATION38", 38, "Variation38");
    public static final registerForContextMenu VARIATION39 = new registerForContextMenu("VARIATION39", 39, "Variation39");
    public static final registerForContextMenu VARIATION40 = new registerForContextMenu("VARIATION40", 40, "Variation40");
    public static final registerForContextMenu VARIATION41 = new registerForContextMenu("VARIATION41", 41, "Variation41");
    public static final registerForContextMenu VARIATION42 = new registerForContextMenu("VARIATION42", 42, "Variation42");
    public static final registerForContextMenu VARIATION43 = new registerForContextMenu("VARIATION43", 43, "Variation43");
    public static final registerForContextMenu VARIATION44 = new registerForContextMenu("VARIATION44", 44, "Variation44");
    public static final registerForContextMenu VARIATION45 = new registerForContextMenu("VARIATION45", 45, "Variation45");
    public static final registerForContextMenu VARIATION46 = new registerForContextMenu("VARIATION46", 46, "Variation46");
    public static final registerForContextMenu VARIATION47 = new registerForContextMenu("VARIATION47", 47, "Variation47");
    public static final registerForContextMenu VARIATION48 = new registerForContextMenu("VARIATION48", 48, "Variation48");
    public static final registerForContextMenu VARIATION49 = new registerForContextMenu("VARIATION49", 49, "Variation49");
    public static final registerForContextMenu VARIATION50 = new registerForContextMenu("VARIATION50", 50, "Variation50");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 125;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 13;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    @Override // o.writeGlobalCallbackParametersI
    public String getVariantName() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 41;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.variantName;
        int i5 = i2 + 87;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private registerForContextMenu(String str, int i, String str2) {
        super(str, i);
        this.variantName = str2;
    }

    static {
        registerForContextMenu[] registerforcontextmenuArr$values = $values();
        $VALUES = registerforcontextmenuArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) registerforcontextmenuArr$values);
        int i = serializer + 105;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static registerForContextMenu valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        registerForContextMenu registerforcontextmenu = (registerForContextMenu) Enum.valueOf(registerForContextMenu.class, str);
        int i4 = read + 75;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return registerforcontextmenu;
    }

    public static registerForContextMenu[] values() {
        int i = 2 % 2;
        int i2 = read + 71;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        registerForContextMenu[] registerforcontextmenuArr = (registerForContextMenu[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 97;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return registerforcontextmenuArr;
    }

    private static final /* synthetic */ registerForContextMenu[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 3;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        registerForContextMenu[] registerforcontextmenuArr = {CONTROL, VARIATION1, VARIATION2, VARIATION3, VARIATION4, VARIATION5, VARIATION6, VARIATION7, VARIATION8, VARIATION9, VARIATION10, VARIATION11, VARIATION12, VARIATION13, VARIATION14, VARIATION15, VARIATION16, VARIATION17, VARIATION18, VARIATION19, VARIATION20, VARIATION21, VARIATION22, VARIATION23, VARIATION24, VARIATION25, VARIATION26, VARIATION27, VARIATION28, VARIATION29, VARIATION30, VARIATION31, VARIATION32, VARIATION33, VARIATION34, VARIATION35, VARIATION36, VARIATION37, VARIATION38, VARIATION39, VARIATION40, VARIATION41, VARIATION42, VARIATION43, VARIATION44, VARIATION45, VARIATION46, VARIATION47, VARIATION48, VARIATION49, VARIATION50};
        int i5 = i2 + 113;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return registerforcontextmenuArr;
    }
}
