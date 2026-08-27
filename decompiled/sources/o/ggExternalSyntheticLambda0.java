package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ggExternalSyntheticLambda0 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ ggExternalSyntheticLambda0[] $VALUES;
    private static int IconCompatParcelizer = 1;
    public static final ggExternalSyntheticLambda0 MAPBOX = new ggExternalSyntheticLambda0("MAPBOX", 0);
    public static final ggExternalSyntheticLambda0 NAVER = new ggExternalSyntheticLambda0("NAVER", 1);
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;

    private ggExternalSyntheticLambda0(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 119;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 119;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    static {
        ggExternalSyntheticLambda0[] ggexternalsyntheticlambda0Arr$values = $values();
        $VALUES = ggexternalsyntheticlambda0Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) ggexternalsyntheticlambda0Arr$values);
        int i = RemoteActionCompatParcelizer + 103;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ ggExternalSyntheticLambda0[] $values() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 81;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ggExternalSyntheticLambda0[] ggexternalsyntheticlambda0Arr = {MAPBOX, NAVER};
        int i5 = i2 + 11;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 41 / 0;
        }
        return ggexternalsyntheticlambda0Arr;
    }

    public static ggExternalSyntheticLambda0 valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 51;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ggExternalSyntheticLambda0 ggexternalsyntheticlambda0 = (ggExternalSyntheticLambda0) Enum.valueOf(ggExternalSyntheticLambda0.class, str);
        int i4 = IconCompatParcelizer + 89;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return ggexternalsyntheticlambda0;
    }

    public static ggExternalSyntheticLambda0[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 63;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ggExternalSyntheticLambda0[] ggexternalsyntheticlambda0Arr = (ggExternalSyntheticLambda0[]) $VALUES.clone();
        int i4 = write + 53;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return ggexternalsyntheticlambda0Arr;
    }
}
