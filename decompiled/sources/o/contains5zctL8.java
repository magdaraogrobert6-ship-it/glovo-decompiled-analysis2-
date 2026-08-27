package o;

/* JADX INFO: loaded from: classes3.dex */
public final class contains5zctL8 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final float serializer;

    public contains5zctL8(float f, String str) {
        this.serializer = f;
        this.IconCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + (Float.hashCode(this.serializer) * 31);
        int i4 = write + 31;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Tick(progress=" + this.serializer + ", text=" + this.IconCompatParcelizer + ")";
        int i2 = write + 35;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 111;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 11;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof contains5zctL8)) {
            return false;
        }
        contains5zctL8 contains5zctl8 = (contains5zctL8) obj;
        return Float.compare(this.serializer, contains5zctl8.serializer) == 0 && this.IconCompatParcelizer.equals(contains5zctl8.IconCompatParcelizer);
    }
}
