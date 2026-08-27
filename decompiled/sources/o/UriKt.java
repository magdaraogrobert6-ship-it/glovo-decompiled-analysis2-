package o;

/* JADX INFO: loaded from: classes3.dex */
public final class UriKt extends AbstractC0193pointerInteropFilter {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final Throwable serializer;

    public UriKt(Throwable th) {
        this.serializer = th;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer.hashCode();
        }
        this.serializer.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Error(throwable=" + this.serializer + ")";
        int i2 = RemoteActionCompatParcelizer + 61;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 107;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof UriKt) && this.serializer.equals(((UriKt) obj).serializer)) {
            return true;
        }
        int i4 = RemoteActionCompatParcelizer + 121;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
