package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class onPrimaryNavigationFragmentChanged {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ onPrimaryNavigationFragmentChanged[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public static final onPrimaryNavigationFragmentChanged COLLAPSED = new onPrimaryNavigationFragmentChanged("COLLAPSED", 0);
    public static final onPrimaryNavigationFragmentChanged HALF_EXPANDED = new onPrimaryNavigationFragmentChanged("HALF_EXPANDED", 1);
    public static final onPrimaryNavigationFragmentChanged EXPANDED = new onPrimaryNavigationFragmentChanged("EXPANDED", 2);

    private onPrimaryNavigationFragmentChanged(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 7;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onPrimaryNavigationFragmentChanged[] onprimarynavigationfragmentchangedArr$values = $values();
        $VALUES = onprimarynavigationfragmentchangedArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) onprimarynavigationfragmentchangedArr$values);
        int i = serializer + 107;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static onPrimaryNavigationFragmentChanged valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 87;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        onPrimaryNavigationFragmentChanged onprimarynavigationfragmentchanged = (onPrimaryNavigationFragmentChanged) Enum.valueOf(onPrimaryNavigationFragmentChanged.class, str);
        int i3 = IconCompatParcelizer + 77;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return onprimarynavigationfragmentchanged;
    }

    public static onPrimaryNavigationFragmentChanged[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (onPrimaryNavigationFragmentChanged[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ onPrimaryNavigationFragmentChanged[] $values() {
        onPrimaryNavigationFragmentChanged[] onprimarynavigationfragmentchangedArr;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 125;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            onPrimaryNavigationFragmentChanged onprimarynavigationfragmentchanged = COLLAPSED;
            onPrimaryNavigationFragmentChanged onprimarynavigationfragmentchanged2 = HALF_EXPANDED;
            onPrimaryNavigationFragmentChanged onprimarynavigationfragmentchanged3 = EXPANDED;
            onprimarynavigationfragmentchangedArr = new onPrimaryNavigationFragmentChanged[3];
            onprimarynavigationfragmentchangedArr[1] = onprimarynavigationfragmentchanged;
            onprimarynavigationfragmentchangedArr[0] = onprimarynavigationfragmentchanged2;
            onprimarynavigationfragmentchangedArr[4] = onprimarynavigationfragmentchanged3;
        } else {
            onprimarynavigationfragmentchangedArr = new onPrimaryNavigationFragmentChanged[]{COLLAPSED, HALF_EXPANDED, EXPANDED};
        }
        int i4 = i3 + 9;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onprimarynavigationfragmentchangedArr;
    }
}
