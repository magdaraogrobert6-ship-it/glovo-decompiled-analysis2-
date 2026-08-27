package o;

/* JADX INFO: loaded from: classes3.dex */
public final class lambda310 extends lambda311 {
    private static int serializer = 0;
    private static int write = 1;
    public final String IconCompatParcelizer;
    public final lambda322 read;

    public lambda310(String str, lambda322 lambda322Var) {
        str.getClass();
        lambda322Var.getClass();
        this.IconCompatParcelizer = str;
        this.read = lambda322Var;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 77;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + (this.IconCompatParcelizer.hashCode() * 31);
        int i4 = write + 79;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 87;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lambda310)) {
            int i4 = i2 + 27;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        lambda310 lambda310Var = (lambda310) obj;
        Object[] objArr = {this.IconCompatParcelizer, lambda310Var.IconCompatParcelizer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.read != lambda310Var.read) {
            int i6 = serializer + 39;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = write + 103;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "LabelViewEntity(text=" + this.IconCompatParcelizer + ", type=" + this.read + ")";
        int i2 = write + 73;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
