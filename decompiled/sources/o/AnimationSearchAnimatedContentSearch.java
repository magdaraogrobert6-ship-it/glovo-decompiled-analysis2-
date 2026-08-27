package o;

/* JADX INFO: loaded from: classes3.dex */
public final class AnimationSearchAnimatedContentSearch extends toAnimationGroup {
    public static final AnimationSearchAnimatedContentSearch IconCompatParcelizer = new AnimationSearchAnimatedContentSearch();
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = read + 65;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 103;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return "NotDisplayable";
        }
        int i3 = 1 / 0;
        return "NotDisplayable";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 1;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 121;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return -1944210727;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 37;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this != obj) {
            return obj instanceof AnimationSearchAnimatedContentSearch;
        }
        int i4 = i3 + 121;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return true;
    }
}
