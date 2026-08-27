package o;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU {
    public int set;
    public final int[] values = new int[10];

    public final void read(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.values;
            if (i >= iArr.length) {
                return;
            }
            this.set |= 1 << i;
            iArr[i] = i2;
        }
    }

    public final int serializer() {
        if ((this.set & 16) != 0) {
            return this.values[4];
        }
        return 65535;
    }
}
