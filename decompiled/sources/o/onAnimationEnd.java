package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class onAnimationEnd implements Runnable {
    public final /* synthetic */ int read;
    public final /* synthetic */ SurfaceViewStretchedQuirk serializer;

    public /* synthetic */ onAnimationEnd(SurfaceViewStretchedQuirk surfaceViewStretchedQuirk, int i) {
        this.read = i;
        this.serializer = surfaceViewStretchedQuirk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.read;
        SurfaceViewStretchedQuirk surfaceViewStretchedQuirk = this.serializer;
        if (i == 0) {
            surfaceViewStretchedQuirk.serializer();
            return;
        }
        if (i == 1) {
            surfaceViewStretchedQuirk.write();
            return;
        }
        SurfaceViewNotCroppedByParentQuirk surfaceViewNotCroppedByParentQuirk = surfaceViewStretchedQuirk.RemoteActionCompatParcelizer;
        if (surfaceViewNotCroppedByParentQuirk != null) {
            surfaceViewNotCroppedByParentQuirk.RemoteActionCompatParcelizer();
        }
        if (surfaceViewStretchedQuirk.ResultReceiver == null) {
            surfaceViewStretchedQuirk.read.serializer();
        }
        surfaceViewStretchedQuirk.ResultReceiver = null;
    }
}
