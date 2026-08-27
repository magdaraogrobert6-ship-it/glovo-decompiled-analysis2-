package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class displayInAppMessagelambda9 {
    public static final displayInAppMessagelambda2 serializer;
    public static final displayInAppMessagelambda6 write = new displayInAppMessagelambda6();

    public abstract int IconCompatParcelizer(int i);

    public abstract int serializer();

    static {
        Integer num = r8lambda2zSFBPLtwLtfQ0sDu9QVpb5s9w.write;
        serializer = (num == null || num.intValue() >= 34) ? new displayInAppMessagesuspendImpl() : new displayInAppMessagelambda3();
    }

    public double write() {
        return displayInAppMessagelambda7.RemoteActionCompatParcelizer(IconCompatParcelizer(26), IconCompatParcelizer(27));
    }

    public int RemoteActionCompatParcelizer(int i, int i2) {
        int iSerializer;
        int i3;
        int iIconCompatParcelizer;
        if (i2 <= i) {
            DrawableTransformation.serializer((Object) setNativeShader.write((Number) Integer.valueOf(i), (Number) Integer.valueOf(i2)));
            return 0;
        }
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iIconCompatParcelizer = IconCompatParcelizer(31 - Integer.numberOfLeadingZeros(i4));
            } else {
                do {
                    iSerializer = serializer() >>> 1;
                    i3 = iSerializer % i4;
                } while ((i4 - 1) + (iSerializer - i3) < 0);
                iIconCompatParcelizer = i3;
            }
            return i + iIconCompatParcelizer;
        }
        while (true) {
            int iSerializer2 = serializer();
            if (i <= iSerializer2 && iSerializer2 < i2) {
                return iSerializer2;
            }
        }
    }

    public long write(long j, long j2) {
        long j3;
        long j4;
        long jIconCompatParcelizer;
        int iSerializer;
        if (j2 <= j) {
            DrawableTransformation.serializer((Object) setNativeShader.write((Number) Long.valueOf(j), (Number) Long.valueOf(j2)));
            return 0L;
        }
        long j5 = j2 - j;
        if (j5 > 0) {
            if (((-j5) & j5) == j5) {
                int i = (int) j5;
                int i2 = (int) (j5 >>> 32);
                if (i != 0) {
                    iSerializer = IconCompatParcelizer(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    iSerializer = serializer();
                } else {
                    jIconCompatParcelizer = (((long) IconCompatParcelizer(31 - Integer.numberOfLeadingZeros(i2))) << 32) + (((long) serializer()) & 4294967295L);
                }
                jIconCompatParcelizer = ((long) iSerializer) & 4294967295L;
            } else {
                do {
                    j3 = read() >>> 1;
                    j4 = j3 % j5;
                } while ((j5 - 1) + (j3 - j4) < 0);
                jIconCompatParcelizer = j4;
            }
            return j + jIconCompatParcelizer;
        }
        while (true) {
            long j6 = read();
            if (j <= j6 && j6 < j2) {
                return j6;
            }
        }
    }

    public int RemoteActionCompatParcelizer(int i) {
        return RemoteActionCompatParcelizer(0, i);
    }

    public long read() {
        return (((long) serializer()) << 32) + ((long) serializer());
    }
}
