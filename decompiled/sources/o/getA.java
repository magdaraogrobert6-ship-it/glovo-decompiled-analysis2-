package o;

/* JADX INFO: loaded from: classes.dex */
public final class getA {
    public int IconCompatParcelizer;
    public float RemoteActionCompatParcelizer;
    public float read;
    public float serializer;
    public float[] write;

    public final void RemoteActionCompatParcelizer(int i, copyzey9I6wdefault copyzey9i6wdefault) {
        int iAlpha = android.graphics.Color.alpha(this.IconCompatParcelizer);
        int iWrite = getD50.write(i);
        android.graphics.Matrix matrix = newD50Xyzui_graphics.write;
        int i2 = (int) ((((iAlpha / 255.0f) * iWrite) / 255.0f) * 255.0f);
        if (i2 <= 0) {
            copyzey9i6wdefault.clearShadowLayer();
        } else {
            copyzey9i6wdefault.setShadowLayer(Math.max(this.RemoteActionCompatParcelizer, Float.MIN_VALUE), this.serializer, this.read, android.graphics.Color.argb(i2, android.graphics.Color.red(this.IconCompatParcelizer), android.graphics.Color.green(this.IconCompatParcelizer), android.graphics.Color.blue(this.IconCompatParcelizer)));
        }
    }

    public final void serializer(int i) {
        this.IconCompatParcelizer = android.graphics.Color.argb(Math.round((getD50.write(i) * android.graphics.Color.alpha(this.IconCompatParcelizer)) / 255.0f), android.graphics.Color.red(this.IconCompatParcelizer), android.graphics.Color.green(this.IconCompatParcelizer), android.graphics.Color.blue(this.IconCompatParcelizer));
    }

    public getA(getA geta) {
        this.RemoteActionCompatParcelizer = 0.0f;
        this.serializer = 0.0f;
        this.read = 0.0f;
        this.IconCompatParcelizer = 0;
        this.RemoteActionCompatParcelizer = geta.RemoteActionCompatParcelizer;
        this.serializer = geta.serializer;
        this.read = geta.read;
        this.IconCompatParcelizer = geta.IconCompatParcelizer;
        this.write = null;
    }

    public final void write(android.graphics.Matrix matrix) {
        if (this.write == null) {
            this.write = new float[2];
        }
        float[] fArr = this.write;
        fArr[0] = this.serializer;
        fArr[1] = this.read;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.write;
        this.serializer = fArr2[0];
        this.read = fArr2[1];
        this.RemoteActionCompatParcelizer = matrix.mapRadius(this.RemoteActionCompatParcelizer);
    }

    public getA() {
    }
}
