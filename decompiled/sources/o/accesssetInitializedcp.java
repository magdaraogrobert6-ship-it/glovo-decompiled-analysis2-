package o;

/* JADX INFO: loaded from: classes3.dex */
public final class accesssetInitializedcp extends StaticLayoutFactory33 {
    private static int serializer = 0;
    private static int write = 1;
    public final accesssetStaticLayoutConstructorcp IconCompatParcelizer;

    public accesssetInitializedcp(accesssetStaticLayoutConstructorcp accesssetstaticlayoutconstructorcp) {
        this.IconCompatParcelizer = accesssetstaticlayoutconstructorcp;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 63;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i4 = serializer + 121;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SingleEarningsState(earnings=" + this.IconCompatParcelizer + ")";
        int i2 = write + 21;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 117;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 57 / 0;
            if (this == obj) {
                int i5 = i2 + 71;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else if (!(obj instanceof accesssetInitializedcp) || !this.IconCompatParcelizer.equals(((accesssetInitializedcp) obj).IconCompatParcelizer)) {
                return false;
            }
        } else {
            if (this != obj) {
                if (!(obj instanceof accesssetInitializedcp)) {
                }
                return false;
            }
            int i7 = i2 + 71;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        return true;
    }
}
