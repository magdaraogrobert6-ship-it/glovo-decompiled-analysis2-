package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Camera2ConfigDefaultProvider implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ androidx.camera.core.SurfaceRequest RemoteActionCompatParcelizer;

    public /* synthetic */ Camera2ConfigDefaultProvider(androidx.camera.core.SurfaceRequest surfaceRequest, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = surfaceRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        androidx.camera.core.SurfaceRequest surfaceRequest = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            surfaceRequest.RemoteActionCompatParcelizer();
        } else {
            surfaceRequest.PlaybackStateCompatCustomAction.cancel(true);
        }
    }
}
