package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class requireParentFragment {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ requireParentFragment[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public static final requireParentFragment NOT_ACTIVE = new requireParentFragment("NOT_ACTIVE", 0);
    public static final requireParentFragment HAS_WORK_NOW_OPPORTUNITY = new requireParentFragment("HAS_WORK_NOW_OPPORTUNITY", 1);
    public static final requireParentFragment PREPARING_TO_WORK = new requireParentFragment("PREPARING_TO_WORK", 2);
    public static final requireParentFragment WAITING_FOR_DELIVERIES = new requireParentFragment("WAITING_FOR_DELIVERIES", 3);
    public static final requireParentFragment ACCEPTING_DELIVERIES = new requireParentFragment("ACCEPTING_DELIVERIES", 4);
    public static final requireParentFragment ON_THE_WAY = new requireParentFragment("ON_THE_WAY", 5);
    public static final requireParentFragment PICK_UP_DROP_OFF = new requireParentFragment("PICK_UP_DROP_OFF", 6);
    public static final requireParentFragment PAUSED = new requireParentFragment("PAUSED", 7);
    public static final requireParentFragment ENDING_WITHOUT_ORDERS = new requireParentFragment("ENDING_WITHOUT_ORDERS", 8);
    public static final requireParentFragment LAST_STOP = new requireParentFragment("LAST_STOP", 9);

    private requireParentFragment(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 121;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 19;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        requireParentFragment[] requireparentfragmentArr$values = $values();
        $VALUES = requireparentfragmentArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) requireparentfragmentArr$values);
        int i = serializer + 77;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static requireParentFragment valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 1;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        requireParentFragment requireparentfragment = (requireParentFragment) Enum.valueOf(requireParentFragment.class, str);
        int i4 = IconCompatParcelizer + 101;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return requireparentfragment;
    }

    public static requireParentFragment[] values() {
        requireParentFragment[] requireparentfragmentArr;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            requireparentfragmentArr = (requireParentFragment[]) $VALUES.clone();
            int i3 = 66 / 0;
        } else {
            requireparentfragmentArr = (requireParentFragment[]) $VALUES.clone();
        }
        int i4 = write + 113;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return requireparentfragmentArr;
    }

    private static final /* synthetic */ requireParentFragment[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 121;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        requireParentFragment[] requireparentfragmentArr = {NOT_ACTIVE, HAS_WORK_NOW_OPPORTUNITY, PREPARING_TO_WORK, WAITING_FOR_DELIVERIES, ACCEPTING_DELIVERIES, ON_THE_WAY, PICK_UP_DROP_OFF, PAUSED, ENDING_WITHOUT_ORDERS, LAST_STOP};
        int i5 = i3 + 3;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return requireparentfragmentArr;
    }
}
