package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setRolekuIjeqM extends setInputTextSuggestionState {
    private static int IconCompatParcelizer = 0;
    private static int RatingCompat = 1;
    private static int read = 1;
    private static int serializer;
    public static final setRolekuIjeqM write = new setRolekuIjeqM(setSelection.NOT_LOGGED_IN);

    static {
        int i = IconCompatParcelizer + 125;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 51;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RatingCompat = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 29;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return "NotLoggedIn";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 29;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return 639380638;
        }
        int i3 = 70 / 0;
        return 639380638;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof setRolekuIjeqM) {
                return true;
            }
            int i2 = RatingCompat + 19;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = RatingCompat + 75;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public setRolekuIjeqM(setSelection setselection) {
        super(setselection);
    }
}
