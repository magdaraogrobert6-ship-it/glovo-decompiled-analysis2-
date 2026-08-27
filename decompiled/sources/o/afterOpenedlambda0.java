package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class afterOpenedlambda0 extends logHtmlInAppMessageClick {
    public float[] serializer;
    public int write;

    @Override // o.logHtmlInAppMessageClick
    public final int serializer() {
        return this.write;
    }

    @Override // o.logHtmlInAppMessageClick
    public final void RemoteActionCompatParcelizer(int i) {
        float[] fArr = this.serializer;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.serializer = Arrays.copyOf(fArr, i);
        }
    }

    @Override // o.logHtmlInAppMessageClick
    public final Object read() {
        return Arrays.copyOf(this.serializer, this.write);
    }

    public afterOpenedlambda0(float[] fArr) {
        fArr.getClass();
        this.serializer = fArr;
        this.write = fArr.length;
        RemoteActionCompatParcelizer(10);
    }

    public final void serializer(float f) {
        RemoteActionCompatParcelizer(serializer() + 1);
        float[] fArr = this.serializer;
        int i = this.write;
        this.write = i + 1;
        fArr[i] = f;
    }
}
