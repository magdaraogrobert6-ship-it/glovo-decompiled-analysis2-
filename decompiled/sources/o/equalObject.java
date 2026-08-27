package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class equalObject {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ equalObject[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public static final equalObject Big = new equalObject("Big", 0);
    public static final equalObject Medium = new equalObject("Medium", 1);
    public static final equalObject Small = new equalObject("Small", 2);

    private equalObject(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 119;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        int i3 = 80 / 0;
        return $ENTRIES;
    }

    static {
        equalObject[] equalobjectArr$values = $values();
        $VALUES = equalobjectArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) equalobjectArr$values);
        int i = IconCompatParcelizer + 75;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 77 / 0;
        }
    }

    public static equalObject valueOf(String str) {
        equalObject equalobject;
        int i = 2 % 2;
        int i2 = read + 69;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            equalobject = (equalObject) Enum.valueOf(equalObject.class, str);
            int i3 = 63 / 0;
        } else {
            equalobject = (equalObject) Enum.valueOf(equalObject.class, str);
        }
        int i4 = RemoteActionCompatParcelizer + 95;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return equalobject;
    }

    public static equalObject[] values() {
        equalObject[] equalobjectArr;
        int i = 2 % 2;
        int i2 = read + 69;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            equalobjectArr = (equalObject[]) $VALUES.clone();
            int i3 = 47 / 0;
        } else {
            equalobjectArr = (equalObject[]) $VALUES.clone();
        }
        int i4 = RemoteActionCompatParcelizer + 59;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return equalobjectArr;
    }

    private static final /* synthetic */ equalObject[] $values() {
        equalObject[] equalobjectArr;
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 19;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            equalObject equalobject = Big;
            equalObject equalobject2 = Medium;
            equalObject equalobject3 = Small;
            equalobjectArr = new equalObject[5];
            equalobjectArr[0] = equalobject;
            equalobjectArr[0] = equalobject2;
            equalobjectArr[4] = equalobject3;
        } else {
            equalobjectArr = new equalObject[]{Big, Medium, Small};
        }
        int i4 = i2 + 63;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return equalobjectArr;
    }
}
