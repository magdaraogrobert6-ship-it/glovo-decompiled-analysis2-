package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SqlDriverDefaultImpls {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ SqlDriverDefaultImpls[] $VALUES;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    private final String value;
    public static final SqlDriverDefaultImpls Rider = new SqlDriverDefaultImpls("Rider", 0, "rider");
    public static final SqlDriverDefaultImpls Applicant = new SqlDriverDefaultImpls("Applicant", 1, "applicant");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 1;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = serializer + 75;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 73;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return str;
    }

    private SqlDriverDefaultImpls(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        SqlDriverDefaultImpls[] sqlDriverDefaultImplsArr$values = $values();
        $VALUES = sqlDriverDefaultImplsArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) sqlDriverDefaultImplsArr$values);
        int i = write + 117;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ SqlDriverDefaultImpls[] $values() {
        int i = 2 % 2;
        int i2 = read + 25;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        SqlDriverDefaultImpls[] sqlDriverDefaultImplsArr = {Rider, Applicant};
        int i5 = i3 + 111;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return sqlDriverDefaultImplsArr;
    }

    public static SqlDriverDefaultImpls valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 111;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SqlDriverDefaultImpls sqlDriverDefaultImpls = (SqlDriverDefaultImpls) Enum.valueOf(SqlDriverDefaultImpls.class, str);
        int i4 = read + 97;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return sqlDriverDefaultImpls;
    }

    public static SqlDriverDefaultImpls[] values() {
        int i = 2 % 2;
        int i2 = serializer + 23;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SqlDriverDefaultImpls[] sqlDriverDefaultImplsArr = (SqlDriverDefaultImpls[]) $VALUES.clone();
        int i4 = read + 41;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return sqlDriverDefaultImplsArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
