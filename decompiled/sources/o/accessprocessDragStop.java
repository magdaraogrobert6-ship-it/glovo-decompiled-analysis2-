package o;

/* JADX INFO: loaded from: classes.dex */
public final class accessprocessDragStop extends getSidePaddingValue {
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ accessprocessDragStart read;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.RemoteActionCompatParcelizer < this.read.write();
    }

    public accessprocessDragStop(accessprocessDragStart accessprocessdragstart) {
        this.read = accessprocessdragstart;
    }

    @Override // o.getSidePaddingValue
    public final int RemoteActionCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i + 1;
        return this.read.IconCompatParcelizer(i);
    }
}
