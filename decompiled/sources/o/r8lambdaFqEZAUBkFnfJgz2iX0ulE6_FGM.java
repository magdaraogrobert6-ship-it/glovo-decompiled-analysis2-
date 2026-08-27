package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaFqEZAUBkFnfJgz2iX0ulE6_FGM {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ r8lambdaFqEZAUBkFnfJgz2iX0ulE6_FGM[] $VALUES;
    private static int IconCompatParcelizer = 0;
    public static final r8lambdaFqEZAUBkFnfJgz2iX0ulE6_FGM NAVIGATION = new r8lambdaFqEZAUBkFnfJgz2iX0ulE6_FGM("NAVIGATION", 0);
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;

    private r8lambdaFqEZAUBkFnfJgz2iX0ulE6_FGM(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 33;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 115;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        obj.hashCode();
        throw null;
    }

    static {
        r8lambdaFqEZAUBkFnfJgz2iX0ulE6_FGM[] r8lambdafqezaubkfnfjgz2ix0ule6_fgmArr$values = $values();
        $VALUES = r8lambdafqezaubkfnfjgz2ix0ule6_fgmArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) r8lambdafqezaubkfnfjgz2ix0ule6_fgmArr$values);
        int i = serializer + 39;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static final /* synthetic */ r8lambdaFqEZAUBkFnfJgz2iX0ulE6_FGM[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 3;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaFqEZAUBkFnfJgz2iX0ulE6_FGM[] r8lambdafqezaubkfnfjgz2ix0ule6_fgmArr = {NAVIGATION};
        int i5 = i2 + 67;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdafqezaubkfnfjgz2ix0ule6_fgmArr;
    }

    public static r8lambdaFqEZAUBkFnfJgz2iX0ulE6_FGM valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdaFqEZAUBkFnfJgz2iX0ulE6_FGM r8lambdafqezaubkfnfjgz2ix0ule6_fgm = (r8lambdaFqEZAUBkFnfJgz2iX0ulE6_FGM) Enum.valueOf(r8lambdaFqEZAUBkFnfJgz2iX0ulE6_FGM.class, str);
        int i4 = RemoteActionCompatParcelizer + 77;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdafqezaubkfnfjgz2ix0ule6_fgm;
    }

    public static r8lambdaFqEZAUBkFnfJgz2iX0ulE6_FGM[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdaFqEZAUBkFnfJgz2iX0ulE6_FGM[] r8lambdafqezaubkfnfjgz2ix0ule6_fgmArr = (r8lambdaFqEZAUBkFnfJgz2iX0ulE6_FGM[]) $VALUES.clone();
        int i4 = IconCompatParcelizer + 99;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return r8lambdafqezaubkfnfjgz2ix0ule6_fgmArr;
        }
        throw null;
    }
}
