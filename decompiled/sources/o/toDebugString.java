package o;

/* JADX INFO: loaded from: classes3.dex */
public final class toDebugString extends r8lambdahKqWkK2sqJkz9lmLXp4YuqHwTU {
    private static int IconCompatParcelizer = 0;
    private static int RatingCompat = 1;
    private static int read = 0;
    public static final toDebugString serializer = new toDebugString(5);
    private static int write = 1;

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 23;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return "CancelPayment";
        }
        int i3 = 42 / 0;
        return "CancelPayment";
    }

    static {
        int i = IconCompatParcelizer + 53;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RatingCompat + 93;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 49;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 932798424;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 93;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i5 = i2 + 35;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof toDebugString) {
            return true;
        }
        int i7 = i4 + 57;
        RatingCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }

    public toDebugString(int i) {
        super(i);
    }
}
