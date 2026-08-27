package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getMinDurationMs implements Runnable {
    public final /* synthetic */ getViewportBounds IconCompatParcelizer;
    public final /* synthetic */ long RemoteActionCompatParcelizer;
    public final /* synthetic */ OnFirstVisibleNode read;
    public final /* synthetic */ getViewportBounds serializer;
    public final /* synthetic */ boolean write;

    public getMinDurationMs(OnFirstVisibleNode onFirstVisibleNode, getViewportBounds getviewportbounds, getViewportBounds getviewportbounds2, long j, boolean z) {
        this.IconCompatParcelizer = getviewportbounds;
        this.serializer = getviewportbounds2;
        this.RemoteActionCompatParcelizer = j;
        this.write = z;
        this.read = onFirstVisibleNode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.read.read(this.IconCompatParcelizer, this.serializer, this.RemoteActionCompatParcelizer, this.write, null);
    }
}
