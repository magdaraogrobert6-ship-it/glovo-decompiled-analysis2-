package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class onMeasure implements Runnable {
    public final /* synthetic */ androidx.camera.camera2.internal.Camera2CameraImpl IconCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ onMeasure(androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl, int i) {
        this.write = i;
        this.IconCompatParcelizer = camera2CameraImpl;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.write;
        androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl = this.IconCompatParcelizer;
        if (i != 0) {
            camera2CameraImpl.write("Camera is removed. Updating state and cleaning up.");
            setTextFuture settextfuture = camera2CameraImpl._init_lambda1;
            setTextFuture settextfuture2 = setTextFuture.RELEASING;
            if (settextfuture == settextfuture2 || camera2CameraImpl._init_lambda1 == setTextFuture.RELEASED) {
                return;
            }
            Toolbar toolbar = new Toolbar(8, null);
            camera2CameraImpl.MediaMetadataCompat.RemoteActionCompatParcelizer(nativeConvertAndroid420ToABGR.CLOSED, toolbar);
            camera2CameraImpl.serializer(settextfuture2, toolbar, true);
            camera2CameraImpl._init_lambda3.RemoteActionCompatParcelizer();
            camera2CameraImpl.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.read();
            if (camera2CameraImpl.write != null) {
                camera2CameraImpl.write();
                return;
            } else {
                camera2CameraImpl.RemoteActionCompatParcelizer();
                return;
            }
        }
        camera2CameraImpl.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = false;
        camera2CameraImpl.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = false;
        camera2CameraImpl.write("OpenCameraConfigAndClose is done, state: " + camera2CameraImpl._init_lambda1);
        int iOrdinal = camera2CameraImpl._init_lambda1.ordinal();
        if (iOrdinal == 1 || iOrdinal == 5) {
            coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, camera2CameraImpl.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.isEmpty());
            camera2CameraImpl.RemoteActionCompatParcelizer();
            return;
        }
        if (iOrdinal != 7) {
            camera2CameraImpl.write("OpenCameraConfigAndClose finished while in state: " + camera2CameraImpl._init_lambda1);
        } else {
            int i2 = camera2CameraImpl.MediaBrowserCompatMediaItem;
            if (i2 == 0) {
                camera2CameraImpl.serializer(false);
            } else {
                camera2CameraImpl.write("OpenCameraConfigAndClose in error: ".concat(androidx.camera.camera2.internal.Camera2CameraImpl.RemoteActionCompatParcelizer(i2)));
                camera2CameraImpl._init_lambda3.IconCompatParcelizer();
            }
        }
    }
}
