package o;

/* JADX INFO: loaded from: classes3.dex */
public final class LineHeightStyleModeSaverlambda0 {
    private static int read = 1;
    private static int serializer;

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 25;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 49;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return "CountdownState(progress=0.0, secondsLeft=0)";
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 81;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int iHashCode2 = Float.hashCode(0.0f);
            iHashCode = Long.hashCode(1L);
            i = iHashCode2 << 15;
        } else {
            int iHashCode3 = Float.hashCode(0.0f);
            iHashCode = Long.hashCode(0L);
            i = iHashCode3 * 31;
        }
        return iHashCode + i;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 9;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this != obj) {
            return (obj instanceof LineHeightStyleModeSaverlambda0) && Float.compare(0.0f, 0.0f) == 0;
        }
        int i4 = i3 + 53;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
