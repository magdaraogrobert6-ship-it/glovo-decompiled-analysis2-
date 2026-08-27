package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class requestImmediateDataFlush {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ requestImmediateDataFlush[] $VALUES;
    private static int IconCompatParcelizer = 0;
    public static final requestImmediateDataFlush ORDER_ACCEPTED = new requestImmediateDataFlush("ORDER_ACCEPTED", 0);
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;

    private requestImmediateDataFlush(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 53;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 121;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        requestImmediateDataFlush[] requestimmediatedataflushArr$values = $values();
        $VALUES = requestimmediatedataflushArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) requestimmediatedataflushArr$values);
        int i = IconCompatParcelizer + 55;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ requestImmediateDataFlush[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        requestImmediateDataFlush[] requestimmediatedataflushArr = {ORDER_ACCEPTED};
        int i5 = i3 + 67;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return requestimmediatedataflushArr;
    }

    public static requestImmediateDataFlush valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 35;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        requestImmediateDataFlush requestimmediatedataflush = (requestImmediateDataFlush) Enum.valueOf(requestImmediateDataFlush.class, str);
        int i3 = read + 35;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return requestimmediatedataflush;
    }

    public static requestImmediateDataFlush[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        requestImmediateDataFlush[] requestimmediatedataflushArr = (requestImmediateDataFlush[]) $VALUES.clone();
        int i3 = read + 29;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return requestimmediatedataflushArr;
        }
        obj.hashCode();
        throw null;
    }
}
