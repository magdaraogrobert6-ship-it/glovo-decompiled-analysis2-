package o;

/* JADX INFO: loaded from: classes3.dex */
public final class AsyncImagePainter {
    private static int serializer = 1;
    private static int write;
    public final String RemoteActionCompatParcelizer;
    public final String read;

    public AsyncImagePainter(String str, String str2) {
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 111;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("OrderDetailsClipboardData(title=", this.RemoteActionCompatParcelizer, ", message=", this.read, ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("OrderDetailsClipboardData(title=", this.RemoteActionCompatParcelizer, ", message=", this.read, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 73;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.read.hashCode() << (this.RemoteActionCompatParcelizer.hashCode() - 16);
        }
        return (this.RemoteActionCompatParcelizer.hashCode() * 31) + this.read.hashCode();
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 29;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsyncImagePainter)) {
            return false;
        }
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) obj;
        if (this.RemoteActionCompatParcelizer.equals(asyncImagePainter.RemoteActionCompatParcelizer)) {
            return this.read.equals(asyncImagePainter.read);
        }
        int i4 = serializer + 99;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
