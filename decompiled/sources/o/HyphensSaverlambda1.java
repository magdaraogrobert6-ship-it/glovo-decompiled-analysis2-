package o;

/* JADX INFO: loaded from: classes3.dex */
public final class HyphensSaverlambda1 {
    private static int serializer = 0;
    private static int write = 1;
    public final float RemoteActionCompatParcelizer;
    public final long read;

    public HyphensSaverlambda1(float f, long j) {
        this.RemoteActionCompatParcelizer = f;
        this.read = j;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 71;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return Long.hashCode(this.read) >>> (Float.hashCode(this.RemoteActionCompatParcelizer) % 110);
        }
        return (Float.hashCode(this.RemoteActionCompatParcelizer) * 31) + Long.hashCode(this.read);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CountdownState(progress=" + this.RemoteActionCompatParcelizer + ", secondsLeft=" + this.read + ")";
        int i2 = serializer + 111;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 57 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 45;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 121;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            boolean z = i5 % 2 == 0;
            int i6 = i3 + 65;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return z;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof HyphensSaverlambda1)) {
            return false;
        }
        HyphensSaverlambda1 hyphensSaverlambda1 = (HyphensSaverlambda1) obj;
        if (Float.compare(this.RemoteActionCompatParcelizer, hyphensSaverlambda1.RemoteActionCompatParcelizer) != 0) {
            return false;
        }
        if (this.read == hyphensSaverlambda1.read) {
            return true;
        }
        int i7 = write + 57;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
