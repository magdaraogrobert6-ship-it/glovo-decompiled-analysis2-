package o;

/* JADX INFO: loaded from: classes3.dex */
public final class toDebugStringdefault extends r8lambdahKqWkK2sqJkz9lmLXp4YuqHwTU {
    public static final toDebugStringdefault IconCompatParcelizer = new toDebugStringdefault(1);
    private static int RatingCompat = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 75;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 103;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "ActivationNotFound";
    }

    static {
        int i = read + 41;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 13;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 119;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return 320487801;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(!(obj instanceof toDebugStringdefault))) {
                return true;
            }
            int i2 = RatingCompat + 119;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = serializer + 53;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RatingCompat = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 33;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }

    public toDebugStringdefault(int i) {
        super(i);
    }
}
