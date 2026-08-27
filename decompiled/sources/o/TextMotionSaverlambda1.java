package o;

/* JADX INFO: loaded from: classes3.dex */
public final class TextMotionSaverlambda1 {
    private static int read = 1;
    private static int write;
    public final SpanStyle IconCompatParcelizer;
    public final emojiSupportMatchSaverlambda0 serializer;

    public TextMotionSaverlambda1(SpanStyle spanStyle, emojiSupportMatchSaverlambda0 emojisupportmatchsaverlambda0) {
        this.IconCompatParcelizer = spanStyle;
        this.serializer = emojisupportmatchsaverlambda0;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 115;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + (this.IconCompatParcelizer.hashCode() * 31);
        int i4 = write + 117;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "AutoAcceptPreferencesUiState(navTitle=, autoAcceptSection=" + this.IconCompatParcelizer + ", endShift=" + this.serializer + ")";
        int i2 = read + 89;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 49;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextMotionSaverlambda1)) {
            return false;
        }
        TextMotionSaverlambda1 textMotionSaverlambda1 = (TextMotionSaverlambda1) obj;
        if (this.IconCompatParcelizer.equals(textMotionSaverlambda1.IconCompatParcelizer)) {
            return this.serializer.equals(textMotionSaverlambda1.serializer);
        }
        int i3 = read + 51;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
