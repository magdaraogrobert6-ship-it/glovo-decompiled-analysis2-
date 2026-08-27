package o;

/* JADX INFO: loaded from: classes.dex */
public final class getTextOn implements DisplayInfoManager {
    public float IconCompatParcelizer;
    public final float RemoteActionCompatParcelizer;
    public final float read;
    public float write;

    @Override // o.DisplayInfoManager
    public final float IconCompatParcelizer() {
        return this.read;
    }

    @Override // o.DisplayInfoManager
    public final float RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.DisplayInfoManager
    public final float read() {
        return this.write;
    }

    @Override // o.DisplayInfoManager
    public final float write() {
        return this.IconCompatParcelizer;
    }

    public getTextOn(float f, float f2) {
        this.RemoteActionCompatParcelizer = f;
        this.read = f2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    public final void RemoteActionCompatParcelizer(float f) {
        float f2;
        float f3 = this.RemoteActionCompatParcelizer;
        float f4 = this.read;
        if (f > f3 || f < f4) {
            throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + f4 + " , " + f3 + "]");
        }
        this.write = f;
        if (f3 == f4) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
            if (f != f3) {
                if (f == f4) {
                    f2 = 0.0f;
                } else {
                    float f5 = 1.0f / f4;
                    f2 = ((1.0f / f) - f5) / ((1.0f / f3) - f5);
                }
            }
        }
        this.IconCompatParcelizer = f2;
    }

    public final void read(float f) {
        if (f <= 1.0f && f >= 0.0f) {
            this.IconCompatParcelizer = f;
            float f2 = this.RemoteActionCompatParcelizer;
            if (f != 1.0f) {
                float f3 = this.read;
                if (f == 0.0f) {
                    f2 = f3;
                } else {
                    double d = 1.0f / f3;
                    double d2 = 1.0d / (((((double) (1.0f / f2)) - d) * ((double) f)) + d);
                    double d3 = f3;
                    double d4 = f2;
                    if (d2 < d3) {
                        d2 = d3;
                    } else if (d2 > d4) {
                        d2 = d4;
                    }
                    f2 = (float) d2;
                }
            }
            this.write = f2;
            return;
        }
        throw new IllegalArgumentException("Requested linearZoom " + f + " is not within valid range [0..1]");
    }
}
