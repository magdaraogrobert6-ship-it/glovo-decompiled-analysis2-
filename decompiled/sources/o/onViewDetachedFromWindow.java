package o;

/* JADX INFO: loaded from: classes.dex */
public final class onViewDetachedFromWindow extends BlurKt {
    public long write;

    @Override // o.BlurKt
    public final BlurKt write(long j) {
        return new onViewDetachedFromWindow(j, this.write);
    }

    public onViewDetachedFromWindow(long j, long j2) {
        super(j);
        this.write = j2;
    }

    @Override // o.BlurKt
    public final void RemoteActionCompatParcelizer(BlurKt blurKt) {
        blurKt.getClass();
        this.write = ((onViewDetachedFromWindow) blurKt).write;
    }
}
