package o;

/* JADX INFO: loaded from: classes.dex */
public final class onPrepareSupportNavigateUpTaskStack implements Runnable {
    public final /* synthetic */ int read;
    public final /* synthetic */ onDestroy serializer;

    public /* synthetic */ onPrepareSupportNavigateUpTaskStack(onDestroy ondestroy, int i) {
        this.read = i;
        this.serializer = ondestroy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.read;
        onDestroy ondestroy = this.serializer;
        if (i != 0) {
            ondestroy.read();
            ondestroy.PlaybackStateCompatCustomAction = ondestroy.IconCompatParcelizer.animate().translationY(-ondestroy.IconCompatParcelizer.getHeight()).setListener(ondestroy.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        } else {
            ondestroy.read();
            ondestroy.PlaybackStateCompatCustomAction = ondestroy.IconCompatParcelizer.animate().translationY(0.0f).setListener(ondestroy.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        }
    }
}
