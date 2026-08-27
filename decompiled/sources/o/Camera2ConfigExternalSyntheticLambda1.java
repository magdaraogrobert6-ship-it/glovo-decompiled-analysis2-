package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Camera2ConfigExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ getCollapseContentDescription read;
    public final /* synthetic */ Camera2CameraImpl write;

    public /* synthetic */ Camera2ConfigExternalSyntheticLambda1(Camera2CameraImpl camera2CameraImpl, getCollapseContentDescription getcollapsecontentdescription, int i) {
        this.IconCompatParcelizer = i;
        this.write = camera2CameraImpl;
        this.read = getcollapsecontentdescription;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        getCollapseContentDescription getcollapsecontentdescription = this.read;
        Camera2CameraImpl camera2CameraImpl = this.write;
        if (i != 0) {
            camera2CameraImpl.write(getcollapsecontentdescription);
        } else {
            camera2CameraImpl.write(getcollapsecontentdescription);
        }
    }
}
