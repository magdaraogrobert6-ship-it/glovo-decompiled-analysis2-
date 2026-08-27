package o;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class plusMKHz9U {
    public final SparseArray RemoteActionCompatParcelizer;
    public unaryMinusF1C5BW0 write;

    public final void write(unaryMinusF1C5BW0 unaryminusf1c5bw0, int i, int i2) {
        int iWrite = unaryminusf1c5bw0.write(i);
        SparseArray sparseArray = this.RemoteActionCompatParcelizer;
        plusMKHz9U plusmkhz9u = sparseArray == null ? null : (plusMKHz9U) sparseArray.get(iWrite);
        if (plusmkhz9u == null) {
            plusmkhz9u = new plusMKHz9U(1);
            sparseArray.put(unaryminusf1c5bw0.write(i), plusmkhz9u);
        }
        if (i2 > i) {
            plusmkhz9u.write(unaryminusf1c5bw0, i + 1, i2);
        } else {
            plusmkhz9u.write = unaryminusf1c5bw0;
        }
    }

    public plusMKHz9U(int i) {
        this.RemoteActionCompatParcelizer = new SparseArray(i);
    }
}
