package o;

/* JADX INFO: loaded from: classes.dex */
public final class onObservedReadsChanged extends BlurKt {
    public int read;
    public getSizeYbymL2gui write;

    @Override // o.BlurKt
    public final BlurKt write(long j) {
        return new onObservedReadsChanged(j, this.write);
    }

    public onObservedReadsChanged(long j, getSizeYbymL2gui getsizeybyml2gui) {
        super(j);
        this.write = getsizeybyml2gui;
    }

    @Override // o.BlurKt
    public final void RemoteActionCompatParcelizer(BlurKt blurKt) {
        blurKt.getClass();
        onObservedReadsChanged onobservedreadschanged = (onObservedReadsChanged) blurKt;
        synchronized (setOffsetk4lQ0M.RemoteActionCompatParcelizer) {
            this.write = onobservedreadschanged.write;
            this.read = onobservedreadschanged.read;
        }
    }
}
