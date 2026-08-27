package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getBottomD9Ej5fMannotations extends copya9UjIt4default {
    private static int read = 0;
    private static int serializer = 1;
    public final androidx.compose.ui.graphics.ImageBitmap write;

    public getBottomD9Ej5fMannotations(androidx.compose.ui.graphics.ImageBitmap imageBitmap) {
        imageBitmap.getClass();
        this.write = imageBitmap;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 85;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int i4 = read + 11;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Success(imageBitmap=" + this.write + ")";
        int i2 = serializer + 35;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 15;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(!(obj instanceof getBottomD9Ej5fMannotations))) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, ((getBottomD9Ej5fMannotations) obj).write}, getCieXyz.write())).booleanValue();
        }
        int i4 = serializer + 57;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
