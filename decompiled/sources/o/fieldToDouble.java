package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fieldToDouble {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ fieldToDouble[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public static final fieldToDouble Complete = new fieldToDouble("Complete", 0);
    public static final fieldToDouble Active = new fieldToDouble("Active", 1);
    public static final fieldToDouble Inactive = new fieldToDouble("Inactive", 2);

    private fieldToDouble(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 17;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        fieldToDouble[] fieldtodoubleArr$values = $values();
        $VALUES = fieldtodoubleArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) fieldtodoubleArr$values);
        int i = RemoteActionCompatParcelizer + 109;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static fieldToDouble valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 15;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        fieldToDouble fieldtodouble = (fieldToDouble) Enum.valueOf(fieldToDouble.class, str);
        int i4 = serializer + 83;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return fieldtodouble;
    }

    public static fieldToDouble[] values() {
        int i = 2 % 2;
        int i2 = serializer + 91;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        fieldToDouble[] fieldtodoubleArr = (fieldToDouble[]) $VALUES.clone();
        int i4 = serializer + 95;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return fieldtodoubleArr;
    }

    private static final /* synthetic */ fieldToDouble[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 47;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        fieldToDouble[] fieldtodoubleArr = {Complete, Active, Inactive};
        int i5 = i3 + 39;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return fieldtodoubleArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
