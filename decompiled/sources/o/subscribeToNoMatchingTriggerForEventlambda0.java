package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class subscribeToNoMatchingTriggerForEventlambda0 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ subscribeToNoMatchingTriggerForEventlambda0[] $VALUES;
    public static final subscribeToNoMatchingTriggerForEventlambda1 Companion;
    private static int IconCompatParcelizer = 1;
    public static final subscribeToNoMatchingTriggerForEventlambda0 NEGATIVE = new subscribeToNoMatchingTriggerForEventlambda0("NEGATIVE", 0, 0);
    public static final subscribeToNoMatchingTriggerForEventlambda0 POSITIVE = new subscribeToNoMatchingTriggerForEventlambda0("POSITIVE", 1, 1);
    private static int read = 1;
    private static int serializer;
    private static int write;
    private final int value;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 113;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 35;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final int getValue() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 33;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.value;
        int i6 = i2 + 79;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 83 / 0;
        }
        return i5;
    }

    private subscribeToNoMatchingTriggerForEventlambda0(String str, int i, int i2) {
        super(str, i);
        this.value = i2;
    }

    static {
        subscribeToNoMatchingTriggerForEventlambda0[] subscribetonomatchingtriggerforeventlambda0Arr$values = $values();
        $VALUES = subscribetonomatchingtriggerforeventlambda0Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) subscribetonomatchingtriggerforeventlambda0Arr$values);
        Companion = new subscribeToNoMatchingTriggerForEventlambda1();
        int i = read + 7;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ subscribeToNoMatchingTriggerForEventlambda0[] $values() {
        subscribeToNoMatchingTriggerForEventlambda0[] subscribetonomatchingtriggerforeventlambda0Arr;
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 27;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            subscribeToNoMatchingTriggerForEventlambda0 subscribetonomatchingtriggerforeventlambda0 = NEGATIVE;
            subscribeToNoMatchingTriggerForEventlambda0 subscribetonomatchingtriggerforeventlambda1 = POSITIVE;
            subscribetonomatchingtriggerforeventlambda0Arr = new subscribeToNoMatchingTriggerForEventlambda0[5];
            subscribetonomatchingtriggerforeventlambda0Arr[1] = subscribetonomatchingtriggerforeventlambda0;
            subscribetonomatchingtriggerforeventlambda0Arr[1] = subscribetonomatchingtriggerforeventlambda1;
        } else {
            subscribetonomatchingtriggerforeventlambda0Arr = new subscribeToNoMatchingTriggerForEventlambda0[]{NEGATIVE, POSITIVE};
        }
        int i4 = i2 + 67;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return subscribetonomatchingtriggerforeventlambda0Arr;
        }
        throw null;
    }

    public static subscribeToNoMatchingTriggerForEventlambda0 valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 75;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (subscribeToNoMatchingTriggerForEventlambda0) Enum.valueOf(subscribeToNoMatchingTriggerForEventlambda0.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static subscribeToNoMatchingTriggerForEventlambda0[] values() {
        int i = 2 % 2;
        int i2 = write + 125;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (subscribeToNoMatchingTriggerForEventlambda0[]) $VALUES.clone();
        }
        throw null;
    }
}
