package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ApproachLayoutModifierNodeImpl {
    public static int RemoteActionCompatParcelizer(double d, double d2) {
        if (d < d2) {
            return -1;
        }
        if (d > d2) {
            return 1;
        }
        if (d == d2) {
            return 0;
        }
        if (Double.isNaN(d2)) {
            return !Double.isNaN(d) ? 1 : 0;
        }
        return -1;
    }

    public static int serializer(double d, long j) {
        if (Double.isNaN(d) || d < -9.223372036854776E18d) {
            return -1;
        }
        if (d >= 9.223372036854776E18d) {
            return 1;
        }
        int iCompare = Long.compare((long) d, j);
        return iCompare != 0 ? iCompare : RemoteActionCompatParcelizer(d, j);
    }
}
