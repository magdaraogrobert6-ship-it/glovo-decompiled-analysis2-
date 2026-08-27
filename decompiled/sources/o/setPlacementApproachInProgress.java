package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class setPlacementApproachInProgress {
    public static int serializer(int i) {
        int i2 = -1;
        while (i != 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public abstract void RemoteActionCompatParcelizer(int i);

    public abstract void serializer(android.graphics.Typeface typeface, boolean z);

    public static int serializer(int i, int i2) {
        if (i2 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (serializer(i) >= serializer(i2)) {
            i ^= i2 << (serializer(i) - serializer(i2));
        }
        return i;
    }

    public static int read(int i, int i2, int i3) {
        int iSerializer = serializer(i, i3);
        int iSerializer2 = serializer(i2, i3);
        int i4 = 0;
        if (iSerializer2 != 0) {
            int iSerializer3 = serializer(i3);
            while (iSerializer != 0) {
                if (((byte) (iSerializer & 1)) == 1) {
                    i4 ^= iSerializer2;
                }
                iSerializer >>>= 1;
                iSerializer2 <<= 1;
                if (iSerializer2 >= (1 << iSerializer3)) {
                    iSerializer2 ^= i3;
                }
            }
        }
        return i4;
    }
}
