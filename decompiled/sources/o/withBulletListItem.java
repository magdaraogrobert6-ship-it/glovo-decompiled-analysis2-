package o;

/* JADX INFO: loaded from: classes3.dex */
public final class withBulletListItem implements AnnotatedStringBuilderBulletScope {
    private static int read = 0;
    private static int write = 1;
    public final Throwable RemoteActionCompatParcelizer;

    @Override // o.AnnotatedStringBuilderBulletScope
    public final Throwable serializer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 11;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Throwable th = this.RemoteActionCompatParcelizer;
        int i5 = i2 + 71;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return th;
    }

    public withBulletListItem(Throwable th) {
        this.RemoteActionCompatParcelizer = th;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 121;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int i4 = read + 53;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "WriteFailure(throwable=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = write + 9;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            int i4 = 74 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (!(obj instanceof withBulletListItem)) {
            int i5 = i3 + 41;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else if (this.RemoteActionCompatParcelizer.equals(((withBulletListItem) obj).RemoteActionCompatParcelizer)) {
            return true;
        }
        int i7 = read + 79;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
