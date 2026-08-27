package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class shouldRetryToSendWithUrlStrategy {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ shouldRetryToSendWithUrlStrategy[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public static final shouldRetryToSendWithUrlStrategy Neutral = new shouldRetryToSendWithUrlStrategy("Neutral", 0);
    public static final shouldRetryToSendWithUrlStrategy Alert = new shouldRetryToSendWithUrlStrategy("Alert", 1);
    public static final shouldRetryToSendWithUrlStrategy Error = new shouldRetryToSendWithUrlStrategy("Error", 2);

    private shouldRetryToSendWithUrlStrategy(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 21;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        shouldRetryToSendWithUrlStrategy[] shouldretrytosendwithurlstrategyArr$values = $values();
        $VALUES = shouldretrytosendwithurlstrategyArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) shouldretrytosendwithurlstrategyArr$values);
        int i = write + 25;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 94 / 0;
        }
    }

    public static shouldRetryToSendWithUrlStrategy valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        shouldRetryToSendWithUrlStrategy shouldretrytosendwithurlstrategy = (shouldRetryToSendWithUrlStrategy) Enum.valueOf(shouldRetryToSendWithUrlStrategy.class, str);
        int i4 = RemoteActionCompatParcelizer + 55;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return shouldretrytosendwithurlstrategy;
    }

    public static shouldRetryToSendWithUrlStrategy[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        shouldRetryToSendWithUrlStrategy[] shouldretrytosendwithurlstrategyArr = (shouldRetryToSendWithUrlStrategy[]) $VALUES.clone();
        int i4 = IconCompatParcelizer + 113;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return shouldretrytosendwithurlstrategyArr;
        }
        throw null;
    }

    private static final /* synthetic */ shouldRetryToSendWithUrlStrategy[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 29;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        shouldRetryToSendWithUrlStrategy[] shouldretrytosendwithurlstrategyArr = {Neutral, Alert, Error};
        int i5 = i2 + 7;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return shouldretrytosendwithurlstrategyArr;
    }
}
