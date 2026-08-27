package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AndroidFontResolveInterceptor {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ AndroidFontResolveInterceptor[] $VALUES;
    private static int RemoteActionCompatParcelizer = 0;
    public static final AndroidFontResolveInterceptor STATUS = new AndroidFontResolveInterceptor("STATUS", 0, "Status");
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    private final String value;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        int i = 2 % 2;
        int i2 = write + 89;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
            int i4 = 25 / 0;
        } else {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        }
        int i5 = i3 + 101;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 61;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 33;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private AndroidFontResolveInterceptor(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    private static final /* synthetic */ AndroidFontResolveInterceptor[] $values() {
        AndroidFontResolveInterceptor[] androidFontResolveInterceptorArr;
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 77;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            androidFontResolveInterceptorArr = new AndroidFontResolveInterceptor[0];
            androidFontResolveInterceptorArr[1] = STATUS;
        } else {
            androidFontResolveInterceptorArr = new AndroidFontResolveInterceptor[]{STATUS};
        }
        int i4 = i2 + 33;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return androidFontResolveInterceptorArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        AndroidFontResolveInterceptor[] androidFontResolveInterceptorArr$values = $values();
        $VALUES = androidFontResolveInterceptorArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) androidFontResolveInterceptorArr$values);
        int i = RemoteActionCompatParcelizer + 71;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 56 / 0;
        }
    }

    public static AndroidFontResolveInterceptor valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 105;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AndroidFontResolveInterceptor androidFontResolveInterceptor = (AndroidFontResolveInterceptor) Enum.valueOf(AndroidFontResolveInterceptor.class, str);
        int i4 = serializer + 7;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return androidFontResolveInterceptor;
        }
        throw null;
    }

    public static AndroidFontResolveInterceptor[] values() {
        int i = 2 % 2;
        int i2 = serializer + 81;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        AndroidFontResolveInterceptor[] androidFontResolveInterceptorArr = (AndroidFontResolveInterceptor[]) $VALUES.clone();
        int i3 = serializer + 3;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return androidFontResolveInterceptorArr;
        }
        obj.hashCode();
        throw null;
    }
}
