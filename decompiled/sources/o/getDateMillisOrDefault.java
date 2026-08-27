package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class getDateMillisOrDefault {
    public int RemoteActionCompatParcelizer;
    public int[] read;

    public void IconCompatParcelizer(int i) {
        int[] iArrCopyOf = this.read;
        if (this.RemoteActionCompatParcelizer >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.read = iArrCopyOf;
        }
        int i2 = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i2 + 1;
        iArrCopyOf[i2] = i;
    }

    public int RemoteActionCompatParcelizer() {
        int[] iArr = this.read;
        int i = this.RemoteActionCompatParcelizer - 1;
        this.RemoteActionCompatParcelizer = i;
        return iArr[i];
    }

    public void write(int i, int i2) {
        int[] iArr = this.read;
        if (i >= iArr.length) {
            return;
        }
        this.RemoteActionCompatParcelizer |= 1 << i;
        iArr[i] = i2;
    }

    public getDateMillisOrDefault(int i) {
        if (i != 1) {
            this.read = new int[10];
        } else {
            this.read = new int[10];
        }
    }

    public boolean write(int i) {
        return ((1 << i) & this.RemoteActionCompatParcelizer) != 0;
    }

    public int read(int i) {
        int i2 = this.RemoteActionCompatParcelizer - 1;
        return i2 >= 0 ? this.read[i2] : i;
    }
}
