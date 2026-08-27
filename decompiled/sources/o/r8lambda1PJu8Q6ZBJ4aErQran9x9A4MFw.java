package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda1PJu8Q6ZBJ4aErQran9x9A4MFw extends logHtmlInAppMessageClick {
    public double[] serializer;
    public int write;

    @Override // o.logHtmlInAppMessageClick
    public final int serializer() {
        return this.write;
    }

    @Override // o.logHtmlInAppMessageClick
    public final void RemoteActionCompatParcelizer(int i) {
        double[] dArr = this.serializer;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.serializer = Arrays.copyOf(dArr, i);
        }
    }

    @Override // o.logHtmlInAppMessageClick
    public final Object read() {
        return Arrays.copyOf(this.serializer, this.write);
    }

    public r8lambda1PJu8Q6ZBJ4aErQran9x9A4MFw(double[] dArr) {
        dArr.getClass();
        this.serializer = dArr;
        this.write = dArr.length;
        RemoteActionCompatParcelizer(10);
    }

    public final void RemoteActionCompatParcelizer(double d) {
        RemoteActionCompatParcelizer(serializer() + 1);
        double[] dArr = this.serializer;
        int i = this.write;
        this.write = i + 1;
        dArr[i] = d;
    }
}
