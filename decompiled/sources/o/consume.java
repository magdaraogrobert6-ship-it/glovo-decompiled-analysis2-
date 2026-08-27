package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class consume {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ consume[] $VALUES;
    public static final consume CustomerChat = new consume("CustomerChat", 0, com.deliveryhero.customerchat.CustomerChatModule.serializer);
    public static final consume DispatcherChat = new consume("DispatcherChat", 1, "com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity");
    public static final consume Main = new consume("Main", 2, "com.foodora.courier.main.presentation.MainActivity");
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    private final String value;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 55;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 121;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 3;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.value;
        int i4 = i2 + 115;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    static {
        consume[] consumeVarArr$values = $values();
        $VALUES = consumeVarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) consumeVarArr$values);
        int i = RemoteActionCompatParcelizer + 105;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private consume(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    public static consume valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 43;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        consume consumeVar = (consume) Enum.valueOf(consume.class, str);
        int i3 = read + 89;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return consumeVar;
        }
        throw null;
    }

    public static consume[] values() {
        int i = 2 % 2;
        int i2 = serializer + 19;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        consume[] consumeVarArr = (consume[]) $VALUES.clone();
        int i4 = serializer + 79;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return consumeVarArr;
    }

    private static final /* synthetic */ consume[] $values() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 27;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        consume[] consumeVarArr = {CustomerChat, DispatcherChat, Main};
        int i5 = i2 + 9;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return consumeVarArr;
    }
}
