package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getThumbDrawable implements Runnable {
    public final /* synthetic */ androidx.camera.camera2.internal.ZoomControl RemoteActionCompatParcelizer;
    public final /* synthetic */ getViewPortScaleType read;
    public final /* synthetic */ onDrawWithContent serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ getThumbDrawable(androidx.camera.camera2.internal.ZoomControl zoomControl, onDrawWithContent ondrawwithcontent, getViewPortScaleType getviewportscaletype, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = zoomControl;
        this.serializer = ondrawwithcontent;
        this.read = getviewportscaletype;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.write;
        getViewPortScaleType getviewportscaletype = this.read;
        onDrawWithContent ondrawwithcontent = this.serializer;
        androidx.camera.camera2.internal.ZoomControl zoomControl = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            zoomControl.read(ondrawwithcontent, getviewportscaletype);
        } else {
            zoomControl.read(ondrawwithcontent, getviewportscaletype);
        }
    }
}
