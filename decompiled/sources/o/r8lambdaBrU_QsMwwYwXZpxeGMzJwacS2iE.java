package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaBrU_QsMwwYwXZpxeGMzJwacS2iE extends r8lambda9Lt3kLpaW5zRqYNsCjcVpu8Vc {
    private static int IconCompatParcelizer = 1;
    private static int MediaDescriptionCompat = 1;
    private static int read;
    public static final r8lambdaBrU_QsMwwYwXZpxeGMzJwacS2iE serializer = new r8lambdaBrU_QsMwwYwXZpxeGMzJwacS2iE();
    private static int write;

    static {
        int i = write + 89;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 21;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return "LogoutApplicant";
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 71;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 85;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return -959881334;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof r8lambdaBrU_QsMwwYwXZpxeGMzJwacS2iE) {
                return true;
            }
            int i2 = MediaDescriptionCompat + 125;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = MediaDescriptionCompat + 17;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 == 0;
    }
}
