package o;

import com.google.zxing.WriterException;

/* JADX INFO: loaded from: classes3.dex */
public final class getZeroRKDOV3M extends copya9UjIt4default {
    private static int serializer = 1;
    private static int write;
    public final WriterException read;

    public getZeroRKDOV3M(WriterException writerException) {
        this.read = writerException;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 113;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.read.hashCode();
        }
        this.read.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof getZeroRKDOV3M))) {
            if (this.read == ((getZeroRKDOV3M) obj).read) {
                int i2 = serializer + 47;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = write + 1;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        int i5 = write + 27;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i5 % 2 == 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Error(exception=" + this.read + ")";
        int i2 = serializer + 83;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
