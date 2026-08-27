package o;

/* JADX INFO: loaded from: classes5.dex */
public class r8lambdaYtjc53jC0xlp5SArMoWh5Yv2E6w extends r8lambdafYywCNCBkMKwevJ2aCjE3Zl24I {
    private final float[] write;

    public final float read(int i) {
        return this.write[write(i)];
    }

    public r8lambdaYtjc53jC0xlp5SArMoWh5Yv2E6w(int i) {
        super(i);
        this.write = new float[i];
    }

    public final void RemoteActionCompatParcelizer(float[] fArr, int i) {
        int iMin = Math.min(Math.min(i, IconCompatParcelizer()), fArr.length);
        for (int i2 = 0; i2 < iMin; i2++) {
            fArr[i2] = read(i2);
        }
    }

    public final void serializer(float f) {
        this.write[read()] = f;
        RemoteActionCompatParcelizer();
    }
}
