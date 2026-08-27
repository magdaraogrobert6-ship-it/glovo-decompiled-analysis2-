package o;

/* JADX INFO: loaded from: classes.dex */
public final class AutofillApi27Helper implements emit {
    public float RemoteActionCompatParcelizer;
    public float serializer;

    @Override // o.emit
    public float write() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.emit
    public long serializer(float f) {
        return ((long) ((((float) Math.log(this.RemoteActionCompatParcelizer / Math.abs(f))) * 1000.0f) / this.serializer)) * 1000000;
    }

    @Override // o.emit
    public float IconCompatParcelizer(float f, long j) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.serializer));
    }

    @Override // o.emit
    public float read(float f, float f2, long j) {
        float f3 = this.serializer;
        float f4 = f2 / f3;
        return (((float) Math.exp((f3 * (j / 1000000)) / 1000.0f)) * f4) + (f - f4);
    }

    @Override // o.emit
    public float write(float f, float f2) {
        float fAbs = Math.abs(f2);
        float f3 = this.RemoteActionCompatParcelizer;
        if (fAbs <= f3) {
            return f;
        }
        double dLog = Math.log(Math.abs(f3 / f2));
        float f4 = this.serializer;
        double d = f4;
        float f5 = f2 / f4;
        return (((float) Math.exp((d * ((dLog / d) * 1000.0d)) / 1000.0d)) * f5) + (f - f5);
    }

    public AutofillApi27Helper() {
        this.RemoteActionCompatParcelizer = Math.max(1.0E-7f, Math.abs(0.1f));
        this.serializer = Math.max(1.0E-4f, 1.0f) * (-4.2f);
    }

    public AutofillApi27Helper(int i) {
    }
}
