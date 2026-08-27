package o;

/* JADX INFO: loaded from: classes3.dex */
public final class AnnotatedStringBuilderMutableRange implements AnnotatedStringBuilderBulletScope {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final Throwable serializer;

    @Override // o.AnnotatedStringBuilderBulletScope
    public final Throwable serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        Throwable th = this.serializer;
        int i5 = i3 + 69;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return th;
    }

    public AnnotatedStringBuilderMutableRange(Throwable th) {
        this.serializer = th;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 29;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer.hashCode();
            throw null;
        }
        int iHashCode = this.serializer.hashCode();
        int i3 = write + 81;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ReadFailure(throwable=" + this.serializer + ")";
        int i2 = RemoteActionCompatParcelizer + 89;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 31 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 109;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            return (obj instanceof AnnotatedStringBuilderMutableRange) && this.serializer.equals(((AnnotatedStringBuilderMutableRange) obj).serializer);
        }
        int i5 = i3 + 117;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return true;
        }
        int i6 = 4 / 2;
        return true;
    }
}
