package o;

/* JADX INFO: loaded from: classes3.dex */
public final class g0ExternalSyntheticLambda1 extends fe {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final g5 RemoteActionCompatParcelizer;
    public final g4 read;

    @Override // o.fe
    public final g5 read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 63;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        g5 g5Var = this.RemoteActionCompatParcelizer;
        int i5 = i2 + 105;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return g5Var;
    }

    @Override // o.fe
    public final g4 serializer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 55;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        g4 g4Var = this.read;
        int i5 = i2 + 15;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return g4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0ExternalSyntheticLambda1(g4 g4Var, g5 g5Var) {
        super(g5Var);
        g4Var.getClass();
        g5Var.getClass();
        this.read = g4Var;
        this.RemoteActionCompatParcelizer = g5Var;
    }

    public g0ExternalSyntheticLambda1(g5 g5Var) {
        this(new g4(), g5Var);
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode() * (this.read.hashCode() >>> 11);
        } else {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode() + (this.read.hashCode() * 31);
        }
        int i3 = IconCompatParcelizer + 61;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 103;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            if (!(obj instanceof g0ExternalSyntheticLambda1)) {
                return false;
            }
            g0ExternalSyntheticLambda1 g0externalsyntheticlambda1 = (g0ExternalSyntheticLambda1) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, g0externalsyntheticlambda1.read}, getCieXyz.write())).booleanValue()) {
                return this.RemoteActionCompatParcelizer == g0externalsyntheticlambda1.RemoteActionCompatParcelizer;
            }
            int i5 = IconCompatParcelizer + 55;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 != 0;
        }
        int i6 = i2 + 75;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "LiveLocation(visibleZoomRange=" + this.read + ", showInSafeArea=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = write + 63;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
