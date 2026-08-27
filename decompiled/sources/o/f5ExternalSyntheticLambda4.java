package o;

/* JADX INFO: loaded from: classes3.dex */
public final class f5ExternalSyntheticLambda4 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final double IconCompatParcelizer;
    public final f8 serializer;
    public final g6 write;

    public f5ExternalSyntheticLambda4(double d, f8 f8Var, g6 g6Var) {
        this.IconCompatParcelizer = d;
        this.serializer = f8Var;
        this.write = g6Var;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 75;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int iHashCode = Double.hashCode(this.IconCompatParcelizer);
            return this.write.hashCode() >>> ((this.serializer.hashCode() >> (iHashCode << 116)) >> 92);
        }
        int iHashCode2 = Double.hashCode(this.IconCompatParcelizer);
        return this.write.hashCode() + ((this.serializer.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public static f5ExternalSyntheticLambda4 RemoteActionCompatParcelizer(f5ExternalSyntheticLambda4 f5externalsyntheticlambda4, double d, f8 f8Var, g6 g6Var, int i) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = read + 49;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                d = f5externalsyntheticlambda4.IconCompatParcelizer;
                int i4 = 48 / 0;
            } else {
                d = f5externalsyntheticlambda4.IconCompatParcelizer;
            }
        }
        if ((i & 2) != 0) {
            int i5 = read + 65;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            f8Var = f5externalsyntheticlambda4.serializer;
        }
        if ((i & 4) != 0) {
            g6Var = f5externalsyntheticlambda4.write;
        }
        f5externalsyntheticlambda4.getClass();
        g6Var.getClass();
        return new f5ExternalSyntheticLambda4(d, f8Var, g6Var);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CameraOptions(zoom=" + this.IconCompatParcelizer + ", center=" + this.serializer + ", paddings=" + this.write + ")";
        int i2 = read + 61;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof f5ExternalSyntheticLambda4)) {
                return false;
            }
            f5ExternalSyntheticLambda4 f5externalsyntheticlambda4 = (f5ExternalSyntheticLambda4) obj;
            if (Double.compare(this.IconCompatParcelizer, f5externalsyntheticlambda4.IconCompatParcelizer) == 0) {
                if (this.serializer.equals(f5externalsyntheticlambda4.serializer)) {
                    if (!this.write.equals(f5externalsyntheticlambda4.write)) {
                        return false;
                    }
                } else {
                    i = read + 95;
                }
            } else {
                i = read + 55;
            }
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i % 2;
            return false;
        }
        int i4 = RemoteActionCompatParcelizer + 81;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
