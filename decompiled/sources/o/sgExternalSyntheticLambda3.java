package o;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class sgExternalSyntheticLambda3 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ sgExternalSyntheticLambda3[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public static final sgExternalSyntheticLambda3 PROMO = new sgExternalSyntheticLambda3("PROMO", 0);
    public static final sgExternalSyntheticLambda3 EARNINGS = new sgExternalSyntheticLambda3("EARNINGS", 1);
    public static final sgExternalSyntheticLambda3 UNKNOWN = new sgExternalSyntheticLambda3(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);

    private sgExternalSyntheticLambda3(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 77;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 105;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        sgExternalSyntheticLambda3[] sgexternalsyntheticlambda3Arr$values = $values();
        $VALUES = sgexternalsyntheticlambda3Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) sgexternalsyntheticlambda3Arr$values);
        int i = IconCompatParcelizer + 103;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static sgExternalSyntheticLambda3 valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 21;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        sgExternalSyntheticLambda3 sgexternalsyntheticlambda3 = (sgExternalSyntheticLambda3) Enum.valueOf(sgExternalSyntheticLambda3.class, str);
        int i4 = write + 87;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return sgexternalsyntheticlambda3;
        }
        throw null;
    }

    public static sgExternalSyntheticLambda3[] values() {
        sgExternalSyntheticLambda3[] sgexternalsyntheticlambda3Arr;
        int i = 2 % 2;
        int i2 = write + 1;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            sgexternalsyntheticlambda3Arr = (sgExternalSyntheticLambda3[]) $VALUES.clone();
            int i3 = 92 / 0;
        } else {
            sgexternalsyntheticlambda3Arr = (sgExternalSyntheticLambda3[]) $VALUES.clone();
        }
        int i4 = write + 19;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return sgexternalsyntheticlambda3Arr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ sgExternalSyntheticLambda3[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        sgExternalSyntheticLambda3[] sgexternalsyntheticlambda3Arr = {PROMO, EARNINGS, UNKNOWN};
        int i5 = i3 + 77;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return sgexternalsyntheticlambda3Arr;
        }
        throw null;
    }
}
