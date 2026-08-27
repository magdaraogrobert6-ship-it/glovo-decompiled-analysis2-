package o;

/* JADX INFO: loaded from: classes.dex */
public final class composite7EN7VTw extends BlurEffect {
    public boolean RemoteActionCompatParcelizer = false;
    public final /* synthetic */ androidx.recyclerview.widget.PagerSnapHelper write;

    @Override // o.BlurEffect
    public final void RemoteActionCompatParcelizer(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        if (i == 0 && this.RemoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer = false;
            this.write.snapToTargetExistingView();
        }
    }

    public composite7EN7VTw(androidx.recyclerview.widget.PagerSnapHelper pagerSnapHelper) {
        this.write = pagerSnapHelper;
    }

    @Override // o.BlurEffect
    public final void IconCompatParcelizer(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.RemoteActionCompatParcelizer = true;
    }
}
