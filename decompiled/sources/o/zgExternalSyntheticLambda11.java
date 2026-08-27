package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class zgExternalSyntheticLambda11 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ zgExternalSyntheticLambda11[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public static final zgExternalSyntheticLambda11 COD = new zgExternalSyntheticLambda11("COD", 0);
    public static final zgExternalSyntheticLambda11 ONLINE = new zgExternalSyntheticLambda11("ONLINE", 1);

    private zgExternalSyntheticLambda11(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 69;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 115;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        zgExternalSyntheticLambda11[] zgexternalsyntheticlambda11Arr$values = $values();
        $VALUES = zgexternalsyntheticlambda11Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) zgexternalsyntheticlambda11Arr$values);
        int i = serializer + 47;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ zgExternalSyntheticLambda11[] $values() {
        zgExternalSyntheticLambda11[] zgexternalsyntheticlambda11Arr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 123;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            zgExternalSyntheticLambda11 zgexternalsyntheticlambda11 = COD;
            zgExternalSyntheticLambda11 zgexternalsyntheticlambda12 = ONLINE;
            zgexternalsyntheticlambda11Arr = new zgExternalSyntheticLambda11[3];
            zgexternalsyntheticlambda11Arr[1] = zgexternalsyntheticlambda11;
            zgexternalsyntheticlambda11Arr[1] = zgexternalsyntheticlambda12;
        } else {
            zgexternalsyntheticlambda11Arr = new zgExternalSyntheticLambda11[]{COD, ONLINE};
        }
        int i4 = i3 + 123;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return zgexternalsyntheticlambda11Arr;
        }
        throw null;
    }

    public static zgExternalSyntheticLambda11 valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 109;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        zgExternalSyntheticLambda11 zgexternalsyntheticlambda11 = (zgExternalSyntheticLambda11) Enum.valueOf(zgExternalSyntheticLambda11.class, str);
        int i4 = RemoteActionCompatParcelizer + 1;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return zgexternalsyntheticlambda11;
    }

    public static zgExternalSyntheticLambda11[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (zgExternalSyntheticLambda11[]) $VALUES.clone();
        }
        int i3 = 14 / 0;
        return (zgExternalSyntheticLambda11[]) $VALUES.clone();
    }
}
