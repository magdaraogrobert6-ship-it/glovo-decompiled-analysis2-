package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ResourceIdCache {
    public static long write(double d, double d2) {
        double d3 = -90.0d;
        double d4 = 90.0d;
        double d5 = -180.0d;
        double d6 = 180.0d;
        long j = 0;
        boolean z = true;
        for (long j2 = Long.MIN_VALUE; j2 != 4294967296L; j2 >>>= 1) {
            if (z) {
                double d7 = (d5 + d6) / 2.0d;
                if (d >= d7) {
                    j |= j2;
                    d5 = d7;
                } else {
                    d6 = d7;
                }
            } else {
                double d8 = (d3 + d4) / 2.0d;
                if (d2 >= d8) {
                    j |= j2;
                    d3 = d8;
                } else {
                    d4 = d8;
                }
            }
            z = !z;
        }
        return (j >>> 5) | 8646911284551352320L;
    }
}
