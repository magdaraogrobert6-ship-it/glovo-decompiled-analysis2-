package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class igExternalSyntheticLambda7 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ igExternalSyntheticLambda7[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public static final igExternalSyntheticLambda7 ENABLED = new igExternalSyntheticLambda7("ENABLED", 0);
    public static final igExternalSyntheticLambda7 MAPBOX_INITIALIZED = new igExternalSyntheticLambda7("MAPBOX_INITIALIZED", 1);
    public static final igExternalSyntheticLambda7 NAVIGATION_INITIALIZED = new igExternalSyntheticLambda7("NAVIGATION_INITIALIZED", 2);
    public static final igExternalSyntheticLambda7 NONE = new igExternalSyntheticLambda7("NONE", 3);

    private igExternalSyntheticLambda7(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 47;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 45;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    static {
        igExternalSyntheticLambda7[] igexternalsyntheticlambda7Arr$values = $values();
        $VALUES = igexternalsyntheticlambda7Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) igexternalsyntheticlambda7Arr$values);
        int i = read + 95;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static igExternalSyntheticLambda7 valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 103;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        igExternalSyntheticLambda7 igexternalsyntheticlambda7 = (igExternalSyntheticLambda7) Enum.valueOf(igExternalSyntheticLambda7.class, str);
        int i3 = IconCompatParcelizer + 123;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return igexternalsyntheticlambda7;
        }
        throw null;
    }

    public static igExternalSyntheticLambda7[] values() {
        int i = 2 % 2;
        int i2 = serializer + 61;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (igExternalSyntheticLambda7[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ igExternalSyntheticLambda7[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 121;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        igExternalSyntheticLambda7[] igexternalsyntheticlambda7Arr = {ENABLED, MAPBOX_INITIALIZED, NAVIGATION_INITIALIZED, NONE};
        int i5 = i2 + 65;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return igexternalsyntheticlambda7Arr;
    }
}
