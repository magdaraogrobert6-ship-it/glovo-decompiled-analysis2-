package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class setAutoSizeTextTypeUniformWithPresetSizes implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ setAutoSizeTextTypeUniformWithPresetSizes(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
        this.read = obj2;
        this.serializer = obj3;
        this.IconCompatParcelizer = obj4;
        this.MediaSessionCompatQueueItem = obj5;
        this.MediaBrowserCompatMediaItem = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl = (androidx.camera.camera2.internal.Camera2CameraImpl) this.write;
            String str = (String) this.read;
            mapToBase maptobase = (mapToBase) this.serializer;
            ImageUtilCodecFailedException imageUtilCodecFailedException = (ImageUtilCodecFailedException) this.IconCompatParcelizer;
            SmallDisplaySizeQuirk smallDisplaySizeQuirk = (SmallDisplaySizeQuirk) this.MediaSessionCompatQueueItem;
            List list = (List) this.MediaBrowserCompatMediaItem;
            camera2CameraImpl.write("Use case " + str + " UPDATED");
            camera2CameraImpl.addObserverForBackInvoker.serializer(str, maptobase, imageUtilCodecFailedException, smallDisplaySizeQuirk, list);
            camera2CameraImpl.PlaybackStateCompat();
            return;
        }
        if (i == 1) {
            androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl2 = (androidx.camera.camera2.internal.Camera2CameraImpl) this.write;
            String str2 = (String) this.read;
            mapToBase maptobase2 = (mapToBase) this.serializer;
            ImageUtilCodecFailedException imageUtilCodecFailedException2 = (ImageUtilCodecFailedException) this.IconCompatParcelizer;
            SmallDisplaySizeQuirk smallDisplaySizeQuirk2 = (SmallDisplaySizeQuirk) this.MediaSessionCompatQueueItem;
            List list2 = (List) this.MediaBrowserCompatMediaItem;
            camera2CameraImpl2.write("Use case " + str2 + " ACTIVE");
            LinkedHashMap linkedHashMap = camera2CameraImpl2.addObserverForBackInvoker.serializer;
            SurfaceOrderQuirk surfaceOrderQuirk = (SurfaceOrderQuirk) linkedHashMap.get(str2);
            if (surfaceOrderQuirk == null) {
                surfaceOrderQuirk = new SurfaceOrderQuirk(maptobase2, imageUtilCodecFailedException2, smallDisplaySizeQuirk2, list2);
                linkedHashMap.put(str2, surfaceOrderQuirk);
            }
            surfaceOrderQuirk.RemoteActionCompatParcelizer = true;
            camera2CameraImpl2.addObserverForBackInvoker.serializer(str2, maptobase2, imageUtilCodecFailedException2, smallDisplaySizeQuirk2, list2);
            camera2CameraImpl2.PlaybackStateCompat();
            return;
        }
        if (i != 2) {
            ((com.airbnb.lottie.parser.DropShadowEffect) this.write).read((ImageCapture1) this.read, (ImageCapture1) this.serializer, (setBrightness) this.IconCompatParcelizer, (setBrightness) this.MediaSessionCompatQueueItem, (Map.Entry) this.MediaBrowserCompatMediaItem);
            return;
        }
        androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl3 = (androidx.camera.camera2.internal.Camera2CameraImpl) this.write;
        String str3 = (String) this.read;
        mapToBase maptobase3 = (mapToBase) this.serializer;
        ImageUtilCodecFailedException imageUtilCodecFailedException3 = (ImageUtilCodecFailedException) this.IconCompatParcelizer;
        SmallDisplaySizeQuirk smallDisplaySizeQuirk3 = (SmallDisplaySizeQuirk) this.MediaSessionCompatQueueItem;
        List list3 = (List) this.MediaBrowserCompatMediaItem;
        camera2CameraImpl3.write("Use case " + str3 + " RESET");
        camera2CameraImpl3.addObserverForBackInvoker.serializer(str3, maptobase3, imageUtilCodecFailedException3, smallDisplaySizeQuirk3, list3);
        camera2CameraImpl3.read();
        camera2CameraImpl3.PlaybackStateCompatCustomAction();
        camera2CameraImpl3.PlaybackStateCompat();
        if (camera2CameraImpl3._init_lambda1 == setTextFuture.OPENED) {
            camera2CameraImpl3.MediaSessionCompatToken();
        }
    }
}
