package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaAPdVUOgzpxu3R_AiyI3q29AyoU implements r8lambda6sk4DzA3gskBkuQlANQmRL8Dlpk {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final String read;

    public r8lambdaAPdVUOgzpxu3R_AiyI3q29AyoU(String str) {
        ddefault ddefaultVar = ddefault.serializer;
        this.read = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 111;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int iHashCode2 = Integer.hashCode(0) + ((ddefault.IconCompatParcelizer.hashCode() + (iHashCode * 31)) * 31);
        int i4 = serializer + 17;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 63;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof r8lambdaAPdVUOgzpxu3R_AiyI3q29AyoU)) {
            int i3 = serializer + 113;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else if (this.read.equals(((r8lambdaAPdVUOgzpxu3R_AiyI3q29AyoU) obj).read)) {
            ddefault ddefaultVar = ddefault.serializer;
            return true;
        }
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowSnackbar(message=" + this.read + ", type=" + ddefault.IconCompatParcelizer + ", length=0)";
        int i2 = serializer + 13;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
