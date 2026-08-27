package o;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class onCreateInputConnection implements Runnable {
    public final /* synthetic */ ArrayList IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.camera.camera2.internal.Camera2CameraImpl write;

    public /* synthetic */ onCreateInputConnection(androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl, ArrayList arrayList, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = camera2CameraImpl;
        this.IconCompatParcelizer = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        androidx.navigation.NavArgsLazy navArgsLazy;
        if (this.RemoteActionCompatParcelizer == 0) {
            androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl = this.write;
            ArrayList arrayList = this.IconCompatParcelizer;
            androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl = camera2CameraImpl.read;
            try {
                camera2CameraImpl.write(arrayList);
                return;
            } finally {
                camera2CameraControlImpl.RemoteActionCompatParcelizer();
            }
        }
        androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl2 = this.write;
        ArrayList<access801> arrayList2 = this.IconCompatParcelizer;
        ArrayList arrayList3 = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        for (access801 access801Var : arrayList2) {
            if (camera2CameraImpl2.addObserverForBackInvoker.serializer(access801Var.MediaSessionCompatQueueItem)) {
                camera2CameraImpl2.addObserverForBackInvoker.serializer.remove(access801Var.MediaSessionCompatQueueItem);
                arrayList3.add(access801Var.MediaSessionCompatQueueItem);
                if (access801Var.MediaBrowserCompatMediaItem == AuthenticatorUtils.class) {
                    z2 = true;
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        camera2CameraImpl2.write("Use cases [" + TextUtils.join(", ", arrayList3) + "] now DETACHED for camera");
        if (z2) {
            camera2CameraImpl2.read.PlaybackStateCompatCustomAction.ResultReceiver = null;
        }
        camera2CameraImpl2.read();
        if (camera2CameraImpl2.addObserverForBackInvoker.MediaMetadataCompat().isEmpty()) {
            androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl2 = camera2CameraImpl2.read;
            getThumbTextPadding getthumbtextpadding = camera2CameraControlImpl2.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            boolean z3 = getthumbtextpadding.RatingCompat;
            getthumbtextpadding.RatingCompat = false;
            camera2CameraControlImpl2.IconCompatParcelizer(false);
        } else {
            camera2CameraImpl2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            camera2CameraImpl2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        }
        if (!camera2CameraImpl2.addObserverForBackInvoker.IconCompatParcelizer().isEmpty()) {
            camera2CameraImpl2.PlaybackStateCompat();
            camera2CameraImpl2.PlaybackStateCompatCustomAction();
            if (camera2CameraImpl2._init_lambda1 == setTextFuture.OPENED) {
                camera2CameraImpl2.MediaSessionCompatToken();
                return;
            }
            return;
        }
        camera2CameraImpl2.read.RemoteActionCompatParcelizer();
        camera2CameraImpl2.PlaybackStateCompatCustomAction();
        camera2CameraImpl2.read.RemoteActionCompatParcelizer(false);
        camera2CameraImpl2.PlaybackStateCompat = camera2CameraImpl2.RatingCompat();
        camera2CameraImpl2.write("Closing camera.");
        switch (camera2CameraImpl2._init_lambda1.ordinal()) {
            case 3:
            case 4:
                coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, camera2CameraImpl2.write == null);
                camera2CameraImpl2.read(setTextFuture.INITIALIZED);
                return;
            case 5:
            default:
                camera2CameraImpl2.write("close() ignored due to being in state: " + camera2CameraImpl2._init_lambda1);
                return;
            case 6:
            case 7:
            case 8:
                if (camera2CameraImpl2._init_lambda3.RemoteActionCompatParcelizer() || ((navArgsLazy = (androidx.navigation.NavArgsLazy) camera2CameraImpl2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.serializer) != null && !((AtomicBoolean) navArgsLazy.read).get())) {
                    z = true;
                }
                camera2CameraImpl2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.read();
                camera2CameraImpl2.read(setTextFuture.CLOSING);
                if (z) {
                    coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, camera2CameraImpl2.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.isEmpty());
                    camera2CameraImpl2.IconCompatParcelizer();
                    return;
                }
                return;
            case 9:
            case 10:
                camera2CameraImpl2.read(setTextFuture.CLOSING);
                camera2CameraImpl2.write();
                return;
        }
    }
}
