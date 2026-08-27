package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.ArrayMap;
import androidx.camera.core.ImageCapture$1;
import o.getThumbTintList;

/* JADX INFO: loaded from: classes.dex */
public final class CameraManagerCompat {
    public final ArrayMap read = new ArrayMap(4);
    public final ImageCapture$1 serializer;

    public static CameraManagerCompat RemoteActionCompatParcelizer(Context context) {
        ImageCapture$1 cameraManagerCompatApi29Impl;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            cameraManagerCompatApi29Impl = new CameraManagerCompatApi30Impl(context, 15);
        } else {
            cameraManagerCompatApi29Impl = i >= 29 ? new CameraManagerCompatApi29Impl(context, 15) : new ImageCapture$1(context, 15);
        }
        return new CameraManagerCompat(cameraManagerCompatApi29Impl);
    }

    public final String[] RemoteActionCompatParcelizer() throws CameraAccessExceptionCompat {
        ImageCapture$1 imageCapture$1 = this.serializer;
        imageCapture$1.getClass();
        try {
            return ((CameraManager) imageCapture$1.MediaSessionCompatQueueItem).getCameraIdList();
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }

    public final getThumbTintList serializer(String str) {
        getThumbTintList getthumbtintlist;
        synchronized (this.read) {
            getthumbtintlist = (getThumbTintList) this.read.get(str);
            if (getthumbtintlist == null) {
                try {
                    getThumbTintList getthumbtintlist2 = new getThumbTintList(this.serializer.read(str), str);
                    this.read.put(str, getthumbtintlist2);
                    getthumbtintlist = getthumbtintlist2;
                } catch (AssertionError e) {
                    throw new CameraAccessExceptionCompat(e.getMessage(), e);
                }
            }
        }
        return getthumbtintlist;
    }

    public CameraManagerCompat(ImageCapture$1 imageCapture$1) {
        this.serializer = imageCapture$1;
    }
}
