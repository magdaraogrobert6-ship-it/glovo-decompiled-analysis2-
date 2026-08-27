package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ParagraphStyleKt {
    private static int read = 0;
    private static int serializer = 1;
    public final List RemoteActionCompatParcelizer;
    public final String write;

    public ParagraphStyleKt(String str, List list) {
        this.write = str;
        this.RemoteActionCompatParcelizer = list;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 75;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return IconCompatParcelizer.read("CacheKey(language=", this.write, ", keys=", this.RemoteActionCompatParcelizer, ")");
        }
        int i3 = 26 / 0;
        return IconCompatParcelizer.read("CacheKey(language=", this.write, ", keys=", this.RemoteActionCompatParcelizer, ")");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023 A[PHI: r2
  0x0023: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v5 java.lang.String) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public final int hashCode() {
        String str;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 81;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode = 0;
        if (i3 % 2 != 0) {
            str = this.write;
            int i4 = 12 / 0;
            if (str == null) {
                int i5 = i2 + 61;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                iHashCode = str.hashCode();
            }
        } else {
            str = this.write;
            if (str == null) {
                int i7 = i2 + 61;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                iHashCode = str.hashCode();
            }
        }
        return this.RemoteActionCompatParcelizer.hashCode() + (iHashCode * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 37;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphStyleKt)) {
            return false;
        }
        ParagraphStyleKt paragraphStyleKt = (ParagraphStyleKt) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, paragraphStyleKt.write}, getCieXyz.write())).booleanValue()) {
            return this.RemoteActionCompatParcelizer.equals(paragraphStyleKt.RemoteActionCompatParcelizer);
        }
        int i4 = read + 101;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
