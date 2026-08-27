package o;

/* JADX INFO: loaded from: classes.dex */
public final class isEnabledui extends BlurKt {
    public float IconCompatParcelizer;

    @Override // o.BlurKt
    public final BlurKt write(long j) {
        return new isEnabledui(j, this.IconCompatParcelizer);
    }

    public isEnabledui(long j, float f) {
        super(j);
        this.IconCompatParcelizer = f;
    }

    @Override // o.BlurKt
    public final void RemoteActionCompatParcelizer(BlurKt blurKt) {
        blurKt.getClass();
        this.IconCompatParcelizer = ((isEnabledui) blurKt).IconCompatParcelizer;
    }
}
