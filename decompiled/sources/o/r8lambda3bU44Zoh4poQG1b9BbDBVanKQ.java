package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda3bU44Zoh4poQG1b9BbDBVanKQ {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ r8lambda3bU44Zoh4poQG1b9BbDBVanKQ[] $VALUES;
    public static final r8lambda3bU44Zoh4poQG1b9BbDBVanKQ AVAILABLE = new r8lambda3bU44Zoh4poQG1b9BbDBVanKQ("AVAILABLE", 0);
    public static final r8lambda3bU44Zoh4poQG1b9BbDBVanKQ NOT_AVAILABLE = new r8lambda3bU44Zoh4poQG1b9BbDBVanKQ("NOT_AVAILABLE", 1);
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    private r8lambda3bU44Zoh4poQG1b9BbDBVanKQ(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 71;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 109;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        r8lambda3bU44Zoh4poQG1b9BbDBVanKQ[] r8lambda3bu44zoh4poqg1b9bbdbvankqArr$values = $values();
        $VALUES = r8lambda3bu44zoh4poqg1b9bbdbvankqArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) r8lambda3bu44zoh4poqg1b9bbdbvankqArr$values);
        int i = RemoteActionCompatParcelizer + 87;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ r8lambda3bU44Zoh4poQG1b9BbDBVanKQ[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 17;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new r8lambda3bU44Zoh4poQG1b9BbDBVanKQ[]{AVAILABLE, NOT_AVAILABLE};
        }
        r8lambda3bU44Zoh4poQG1b9BbDBVanKQ r8lambda3bu44zoh4poqg1b9bbdbvankq = AVAILABLE;
        r8lambda3bU44Zoh4poQG1b9BbDBVanKQ r8lambda3bu44zoh4poqg1b9bbdbvankq2 = NOT_AVAILABLE;
        r8lambda3bU44Zoh4poQG1b9BbDBVanKQ[] r8lambda3bu44zoh4poqg1b9bbdbvankqArr = new r8lambda3bU44Zoh4poQG1b9BbDBVanKQ[3];
        r8lambda3bu44zoh4poqg1b9bbdbvankqArr[1] = r8lambda3bu44zoh4poqg1b9bbdbvankq;
        r8lambda3bu44zoh4poqg1b9bbdbvankqArr[0] = r8lambda3bu44zoh4poqg1b9bbdbvankq2;
        return r8lambda3bu44zoh4poqg1b9bbdbvankqArr;
    }

    public static r8lambda3bU44Zoh4poQG1b9BbDBVanKQ valueOf(String str) {
        r8lambda3bU44Zoh4poQG1b9BbDBVanKQ r8lambda3bu44zoh4poqg1b9bbdbvankq;
        int i = 2 % 2;
        int i2 = serializer + 83;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            r8lambda3bu44zoh4poqg1b9bbdbvankq = (r8lambda3bU44Zoh4poQG1b9BbDBVanKQ) Enum.valueOf(r8lambda3bU44Zoh4poQG1b9BbDBVanKQ.class, str);
            int i3 = 89 / 0;
        } else {
            r8lambda3bu44zoh4poqg1b9bbdbvankq = (r8lambda3bU44Zoh4poQG1b9BbDBVanKQ) Enum.valueOf(r8lambda3bU44Zoh4poQG1b9BbDBVanKQ.class, str);
        }
        int i4 = read + 107;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return r8lambda3bu44zoh4poqg1b9bbdbvankq;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static r8lambda3bU44Zoh4poQG1b9BbDBVanKQ[] values() {
        int i = 2 % 2;
        int i2 = read + 101;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda3bU44Zoh4poQG1b9BbDBVanKQ[] r8lambda3bu44zoh4poqg1b9bbdbvankqArr = (r8lambda3bU44Zoh4poQG1b9BbDBVanKQ[]) $VALUES.clone();
        int i4 = serializer + 67;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return r8lambda3bu44zoh4poqg1b9bbdbvankqArr;
    }
}
