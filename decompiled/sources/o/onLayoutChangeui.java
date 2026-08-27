package o;

/* JADX INFO: loaded from: classes.dex */
public final class onLayoutChangeui extends BlurKt {
    public int write;

    @Override // o.BlurKt
    public final BlurKt write(long j) {
        return new onLayoutChangeui(j, this.write);
    }

    public onLayoutChangeui(long j, int i) {
        super(j);
        this.write = i;
    }

    @Override // o.BlurKt
    public final void RemoteActionCompatParcelizer(BlurKt blurKt) {
        blurKt.getClass();
        this.write = ((onLayoutChangeui) blurKt).write;
    }
}
