package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class DistanceAndFlagsdefault extends replaceAll {
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int serializer;
    public final accessDistanceAndFlags write;

    public DistanceAndFlagsdefault(int i, int i2, int i3, accessDistanceAndFlags accessdistanceandflags) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.serializer = i3;
        this.write = accessdistanceandflags;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.write);
        sb.append(", ");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("-byte IV, ");
        sb.append(this.serializer);
        sb.append("-byte tag, and ");
        return af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, "-byte key)", sb);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DistanceAndFlagsdefault)) {
            return false;
        }
        DistanceAndFlagsdefault distanceAndFlagsdefault = (DistanceAndFlagsdefault) obj;
        return distanceAndFlagsdefault.IconCompatParcelizer == this.IconCompatParcelizer && distanceAndFlagsdefault.RemoteActionCompatParcelizer == this.RemoteActionCompatParcelizer && distanceAndFlagsdefault.serializer == this.serializer && distanceAndFlagsdefault.write == this.write;
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        int i2 = this.RemoteActionCompatParcelizer;
        int i3 = this.serializer;
        return Objects.hash(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), this.write);
    }
}
