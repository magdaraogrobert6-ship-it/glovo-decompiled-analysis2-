package androidx.graphics.path;

/* JADX INFO: loaded from: classes4.dex */
public final class ConicConverter {
    public int IconCompatParcelizer;
    public float[] RemoteActionCompatParcelizer;
    public int read;

    private final native int internalConicToQuadratics(float[] fArr, int i, float[] fArr2, float f, float f2);

    public final void read(float f, float f2, float[] fArr, int i) {
        fArr.getClass();
        int iInternalConicToQuadratics = internalConicToQuadratics(fArr, i, this.RemoteActionCompatParcelizer, f, f2);
        this.IconCompatParcelizer = iInternalConicToQuadratics;
        int i2 = (iInternalConicToQuadratics * 4) + 2;
        if (i2 > this.RemoteActionCompatParcelizer.length) {
            float[] fArr2 = new float[i2];
            this.RemoteActionCompatParcelizer = fArr2;
            this.IconCompatParcelizer = internalConicToQuadratics(fArr, i, fArr2, f, f2);
        }
        this.read = 0;
    }

    public final void serializer(float[] fArr, int i) {
        fArr.getClass();
        int i2 = this.read;
        if (i2 < this.IconCompatParcelizer) {
            int i3 = i2 * 4;
            float[] fArr2 = this.RemoteActionCompatParcelizer;
            fArr[i] = fArr2[i3];
            fArr[i + 1] = fArr2[i3 + 1];
            fArr[i + 2] = fArr2[i3 + 2];
            fArr[i + 3] = fArr2[i3 + 3];
            fArr[i + 4] = fArr2[i3 + 4];
            fArr[i + 5] = fArr2[i3 + 5];
            this.read = i2 + 1;
        }
    }
}
