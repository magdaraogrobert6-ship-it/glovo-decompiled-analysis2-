package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaDkEaEKXSs3Ki_DJIrtNZPaii1iU extends r8lambda9Lt3kLpaW5zRqYNsCjcVpu8Vc {
    private static int IconCompatParcelizer = 0;
    private static int MediaMetadataCompat = 1;
    private static int read = 0;
    public static final r8lambdaDkEaEKXSs3Ki_DJIrtNZPaii1iU serializer = new r8lambdaDkEaEKXSs3Ki_DJIrtNZPaii1iU();
    private static int write = 1;

    static {
        int i = IconCompatParcelizer + 105;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 49;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 81;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "OpenWelcomeScreenAction";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 125;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 63;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return -421365620;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaMetadataCompat + 105;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof r8lambdaDkEaEKXSs3Ki_DJIrtNZPaii1iU) {
            return true;
        }
        int i4 = MediaMetadataCompat + 43;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
