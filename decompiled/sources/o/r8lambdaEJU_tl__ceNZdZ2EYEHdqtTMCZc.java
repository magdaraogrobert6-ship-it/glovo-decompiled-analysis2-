package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaEJU_tl__ceNZdZ2EYEHdqtTMCZc implements r8lambda6sk4DzA3gskBkuQlANQmRL8Dlpk {
    public static final r8lambdaEJU_tl__ceNZdZ2EYEHdqtTMCZc IconCompatParcelizer = new r8lambdaEJU_tl__ceNZdZ2EYEHdqtTMCZc();
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;

    static {
        int i = RemoteActionCompatParcelizer + 47;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 71;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 111;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return "SignOutBlocked";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 45;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 17;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return 351075414;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 117;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (obj instanceof r8lambdaEJU_tl__ceNZdZ2EYEHdqtTMCZc) {
            return true;
        }
        int i3 = serializer + 103;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
