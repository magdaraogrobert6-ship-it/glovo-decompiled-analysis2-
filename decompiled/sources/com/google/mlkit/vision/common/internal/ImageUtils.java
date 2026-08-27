package com.google.mlkit.vision.common.internal;

import android.graphics.Bitmap;
import android.media.Image;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;
import o.accessgetSystemNavigationDowncp;
import o.setRequestedFrameRate;
import o.toZui_graphics;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageUtils {
    public static final toZui_graphics RemoteActionCompatParcelizer = new toZui_graphics("MLKitImageUtils", "");
    public static final ImageUtils write = new ImageUtils();

    public static int serializer(setRequestedFrameRate setrequestedframerate) {
        int i = setrequestedframerate.MediaSessionCompatQueueItem;
        if (i == -1) {
            Bitmap bitmap = setrequestedframerate.write;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(bitmap);
            return bitmap.getAllocationByteCount();
        }
        if (i == 17 || i == 842094169) {
            ByteBuffer byteBuffer = setrequestedframerate.serializer;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(byteBuffer);
            return byteBuffer.limit();
        }
        if (i != 35) {
            return 0;
        }
        Image.Plane[] planeArr = setrequestedframerate.read();
        accessgetSystemNavigationDowncp.IconCompatParcelizer(planeArr);
        return (planeArr[0].getBuffer().limit() * 3) / 2;
    }

    public static ObjectWrapper getImageDataWrapper(setRequestedFrameRate setrequestedframerate) {
        int i = setrequestedframerate.MediaSessionCompatQueueItem;
        if (i == -1) {
            Bitmap bitmap = setrequestedframerate.write;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(bitmap);
            return new ObjectWrapper(bitmap);
        }
        if (i != 17) {
            if (i == 35) {
                return new ObjectWrapper(setrequestedframerate.RemoteActionCompatParcelizer == null ? null : (Image) setrequestedframerate.RemoteActionCompatParcelizer.read);
            }
            if (i != 842094169) {
                throw new MlKitException(c8$$ExternalSyntheticOutline0.m(setrequestedframerate.MediaSessionCompatQueueItem, "Unsupported image format: "), 3);
            }
        }
        ByteBuffer byteBuffer = setrequestedframerate.serializer;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(byteBuffer);
        return new ObjectWrapper(byteBuffer);
    }
}
