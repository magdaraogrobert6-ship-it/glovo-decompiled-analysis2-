package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class getOffset {
    public final double[] write;

    public final int hashCode() {
        return Arrays.hashCode(this.write);
    }

    public getOffset(double[] dArr) {
        this.write = (double[]) dArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getOffset.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.write, ((getOffset) obj).write);
    }
}
