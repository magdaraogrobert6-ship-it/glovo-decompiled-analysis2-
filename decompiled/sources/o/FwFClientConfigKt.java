package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FwFClientConfigKt {
    public int RemoteActionCompatParcelizer = 0;
    public int write = 0;

    public abstract void serializer();

    public static final void write(short[] sArr) {
        Arrays.fill(sArr, (short) 1024);
    }

    public final int IconCompatParcelizer(short[] sArr, int i) {
        serializer();
        short s = sArr[i];
        int i2 = (this.RemoteActionCompatParcelizer >>> 11) * s;
        if (Integer.compareUnsigned(this.write, i2) < 0) {
            this.RemoteActionCompatParcelizer = i2;
            sArr[i] = (short) (s + ((2048 - s) >>> 5));
            return 0;
        }
        this.RemoteActionCompatParcelizer -= i2;
        this.write -= i2;
        sArr[i] = (short) (s - (s >>> 5));
        return 1;
    }

    public final int RemoteActionCompatParcelizer(short[] sArr) {
        int iIconCompatParcelizer = 1;
        do {
            iIconCompatParcelizer = (iIconCompatParcelizer << 1) | IconCompatParcelizer(sArr, iIconCompatParcelizer);
        } while (iIconCompatParcelizer < sArr.length);
        return iIconCompatParcelizer - sArr.length;
    }
}
