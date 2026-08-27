package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdariYSjVayzlYnf6n5A5_kREM1s extends r8lambdaUXVkaZAuUQGBNIXILrAHYRyC1qs {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final double IconCompatParcelizer;

    public r8lambdariYSjVayzlYnf6n5A5_kREM1s(double d) {
        this.IconCompatParcelizer = d;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Double.hashCode(this.IconCompatParcelizer);
        int i4 = RemoteActionCompatParcelizer + 87;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ValidAmountState(differenceAmount=" + this.IconCompatParcelizer + ")";
        int i2 = RemoteActionCompatParcelizer + 69;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 27;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof r8lambdariYSjVayzlYnf6n5A5_kREM1s) {
            if (Double.compare(this.IconCompatParcelizer, ((r8lambdariYSjVayzlYnf6n5A5_kREM1s) obj).IconCompatParcelizer) == 0) {
                return true;
            }
            int i5 = write + 123;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i2 + 19;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
