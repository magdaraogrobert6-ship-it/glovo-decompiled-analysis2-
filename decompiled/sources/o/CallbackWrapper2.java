package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class CallbackWrapper2 implements writeGlobalCallbackParametersI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ CallbackWrapper2[] $VALUES;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    private final String variantName;
    public static final CallbackWrapper2 CONTROL = new CallbackWrapper2("CONTROL", 0, "Control");
    public static final CallbackWrapper2 TREATMENT = new CallbackWrapper2("TREATMENT", 1, "Variation1");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 123;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 1;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    @Override // o.writeGlobalCallbackParametersI
    public String getVariantName() {
        int i = 2 % 2;
        int i2 = serializer + 103;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.variantName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private CallbackWrapper2(String str, int i, String str2) {
        super(str, i);
        this.variantName = str2;
    }

    static {
        CallbackWrapper2[] callbackWrapper2Arr$values = $values();
        $VALUES = callbackWrapper2Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) callbackWrapper2Arr$values);
        int i = write + 19;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ CallbackWrapper2[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 123;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new CallbackWrapper2[]{CONTROL, TREATMENT};
        }
        CallbackWrapper2 callbackWrapper2 = CONTROL;
        CallbackWrapper2 callbackWrapper3 = TREATMENT;
        CallbackWrapper2[] callbackWrapper2Arr = new CallbackWrapper2[5];
        callbackWrapper2Arr[0] = callbackWrapper2;
        callbackWrapper2Arr[0] = callbackWrapper3;
        return callbackWrapper2Arr;
    }

    public static CallbackWrapper2 valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 107;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CallbackWrapper2 callbackWrapper2 = (CallbackWrapper2) Enum.valueOf(CallbackWrapper2.class, str);
        int i4 = RemoteActionCompatParcelizer + 33;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return callbackWrapper2;
    }

    public static CallbackWrapper2[] values() {
        int i = 2 % 2;
        int i2 = serializer + 119;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (CallbackWrapper2[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
