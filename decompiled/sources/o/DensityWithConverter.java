package o;

import com.google.android.gms.internal.mlkit_vision_barcode.zzgb;

/* JADX INFO: loaded from: classes3.dex */
public final class DensityWithConverter extends zzgb {
    public static final DensityWithConverter IconCompatParcelizer = new DensityWithConverter();
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        int i = write + 37;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 13;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 29;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "NoCode";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return 1967066140;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        boolean z = true;
        if (this == obj) {
            int i2 = read + 69;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof DensityWithConverter)) {
            int i4 = read + 89;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i5;
            z = i4 % 2 == 0;
            int i6 = i5 + 89;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        return z;
    }
}
