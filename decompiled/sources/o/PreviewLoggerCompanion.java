package o;

/* JADX INFO: loaded from: classes3.dex */
public final class PreviewLoggerCompanion {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final int read;
    public final float serializer;

    public PreviewLoggerCompanion(float f, int i) {
        this.serializer = f;
        this.read = i;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 107;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = Integer.hashCode(this.read) - (Float.hashCode(this.serializer) + 30);
        } else {
            iHashCode = Integer.hashCode(this.read) + (Float.hashCode(this.serializer) * 31);
        }
        int i3 = RemoteActionCompatParcelizer + 101;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 73;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i5 = i4 + 89;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof PreviewLoggerCompanion)) {
            int i7 = i2 + 77;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 9 / 0;
            }
            return false;
        }
        PreviewLoggerCompanion previewLoggerCompanion = (PreviewLoggerCompanion) obj;
        if (Float.compare(this.serializer, previewLoggerCompanion.serializer) != 0) {
            return false;
        }
        if (this.read == previewLoggerCompanion.read) {
            return true;
        }
        int i9 = write + 121;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Compression(quality=" + this.serializer + ", maxDimension=" + this.read + ")";
        int i2 = RemoteActionCompatParcelizer + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
