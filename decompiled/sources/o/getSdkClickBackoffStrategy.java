package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getSdkClickBackoffStrategy implements writeGlobalCallbackParametersI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ getSdkClickBackoffStrategy[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    private final String variantName;
    public static final getSdkClickBackoffStrategy CONTROL = new getSdkClickBackoffStrategy("CONTROL", 0, "Control");
    public static final getSdkClickBackoffStrategy TREATMENT = new getSdkClickBackoffStrategy("TREATMENT", 1, "Variation1");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 107;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    @Override // o.writeGlobalCallbackParametersI
    public String getVariantName() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 87;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.variantName;
        int i5 = i2 + 43;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private getSdkClickBackoffStrategy(String str, int i, String str2) {
        super(str, i);
        this.variantName = str2;
    }

    static {
        getSdkClickBackoffStrategy[] getsdkclickbackoffstrategyArr$values = $values();
        $VALUES = getsdkclickbackoffstrategyArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) getsdkclickbackoffstrategyArr$values);
        int i = IconCompatParcelizer + 3;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ getSdkClickBackoffStrategy[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 119;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new getSdkClickBackoffStrategy[]{CONTROL, TREATMENT};
        }
        getSdkClickBackoffStrategy getsdkclickbackoffstrategy = CONTROL;
        getSdkClickBackoffStrategy getsdkclickbackoffstrategy2 = TREATMENT;
        getSdkClickBackoffStrategy[] getsdkclickbackoffstrategyArr = new getSdkClickBackoffStrategy[5];
        getsdkclickbackoffstrategyArr[1] = getsdkclickbackoffstrategy;
        getsdkclickbackoffstrategyArr[0] = getsdkclickbackoffstrategy2;
        return getsdkclickbackoffstrategyArr;
    }

    public static getSdkClickBackoffStrategy valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 45;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getSdkClickBackoffStrategy getsdkclickbackoffstrategy = (getSdkClickBackoffStrategy) Enum.valueOf(getSdkClickBackoffStrategy.class, str);
        int i4 = read + 13;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getsdkclickbackoffstrategy;
    }

    public static getSdkClickBackoffStrategy[] values() {
        getSdkClickBackoffStrategy[] getsdkclickbackoffstrategyArr;
        int i = 2 % 2;
        int i2 = read + 73;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            getsdkclickbackoffstrategyArr = (getSdkClickBackoffStrategy[]) $VALUES.clone();
            int i3 = 70 / 0;
        } else {
            getsdkclickbackoffstrategyArr = (getSdkClickBackoffStrategy[]) $VALUES.clone();
        }
        int i4 = read + 99;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return getsdkclickbackoffstrategyArr;
        }
        throw null;
    }
}
