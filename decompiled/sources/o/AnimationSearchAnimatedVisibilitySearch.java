package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AnimationSearchAnimatedVisibilitySearch {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ AnimationSearchAnimatedVisibilitySearch[] $VALUES;
    public static final findRememberCallWithType Companion;
    public static final AnimationSearchAnimatedVisibilitySearch POST = new AnimationSearchAnimatedVisibilitySearch("POST", 0);
    public static final AnimationSearchAnimatedVisibilitySearch PUT = new AnimationSearchAnimatedVisibilitySearch("PUT", 1);
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    private AnimationSearchAnimatedVisibilitySearch(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 33;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 21;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        AnimationSearchAnimatedVisibilitySearch[] animationSearchAnimatedVisibilitySearchArr$values = $values();
        $VALUES = animationSearchAnimatedVisibilitySearchArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) animationSearchAnimatedVisibilitySearchArr$values);
        Companion = new findRememberCallWithType();
        int i = read + 55;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static final /* synthetic */ AnimationSearchAnimatedVisibilitySearch[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 87;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new AnimationSearchAnimatedVisibilitySearch[]{POST, PUT};
        }
        AnimationSearchAnimatedVisibilitySearch animationSearchAnimatedVisibilitySearch = POST;
        AnimationSearchAnimatedVisibilitySearch animationSearchAnimatedVisibilitySearch2 = PUT;
        AnimationSearchAnimatedVisibilitySearch[] animationSearchAnimatedVisibilitySearchArr = new AnimationSearchAnimatedVisibilitySearch[3];
        animationSearchAnimatedVisibilitySearchArr[0] = animationSearchAnimatedVisibilitySearch;
        animationSearchAnimatedVisibilitySearchArr[1] = animationSearchAnimatedVisibilitySearch2;
        return animationSearchAnimatedVisibilitySearchArr;
    }

    public static AnimationSearchAnimatedVisibilitySearch valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 97;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AnimationSearchAnimatedVisibilitySearch animationSearchAnimatedVisibilitySearch = (AnimationSearchAnimatedVisibilitySearch) Enum.valueOf(AnimationSearchAnimatedVisibilitySearch.class, str);
        int i4 = serializer + 59;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return animationSearchAnimatedVisibilitySearch;
    }

    public static AnimationSearchAnimatedVisibilitySearch[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 1;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AnimationSearchAnimatedVisibilitySearch[] animationSearchAnimatedVisibilitySearchArr = (AnimationSearchAnimatedVisibilitySearch[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 5;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return animationSearchAnimatedVisibilitySearchArr;
    }
}
