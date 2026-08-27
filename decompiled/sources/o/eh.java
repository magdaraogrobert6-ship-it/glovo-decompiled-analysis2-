package o;

/* JADX INFO: loaded from: classes3.dex */
public final class eh extends f1 {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final f8 serializer;

    public eh(f8 f8Var) {
        this.serializer = f8Var;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 113;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer.hashCode();
        }
        this.serializer.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "EmptySpaceClicked(point=" + this.serializer + ")";
        int i2 = write + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 69;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 61;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else if (!(obj instanceof eh) || !this.serializer.equals(((eh) obj).serializer)) {
            return false;
        }
        int i7 = IconCompatParcelizer + 57;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
