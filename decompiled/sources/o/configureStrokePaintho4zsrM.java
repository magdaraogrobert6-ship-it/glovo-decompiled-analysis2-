package o;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class configureStrokePaintho4zsrM implements drawImagegbVJVH8, r8lambdayrUYrLf4y8jALbFcm2n28OpawQ {
    public static final configureStrokePaintho4zsrM RemoteActionCompatParcelizer = new configureStrokePaintho4zsrM(1);
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ configureStrokePaintho4zsrM(int i) {
        this.IconCompatParcelizer = i;
    }

    public static ByteArrayInputStream serializer(String str) {
        if (!str.startsWith("data:image")) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Not a valid image data URL.");
            return null;
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Missing comma in data URL.");
            return null;
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Not a base64 image data URL.");
        return null;
    }

    @Override // o.r8lambdayrUYrLf4y8jALbFcm2n28OpawQ
    public boolean IconCompatParcelizer(Object obj, File file, getEotfFuncui_graphics geteotffuncui_graphics) throws Throwable {
        try {
            DrawScopeMarker.RemoteActionCompatParcelizer((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }

    public Class serializer() {
        int i = this.IconCompatParcelizer;
        if (i != 2) {
            return (i == 4 || i != 8) ? InputStream.class : ParcelFileDescriptor.class;
        }
        return ByteBuffer.class;
    }

    @Override // o.drawImagegbVJVH8
    public drawImage9jGpkUE IconCompatParcelizer(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
        int i = this.IconCompatParcelizer;
        int i2 = 1;
        if (i == 1) {
            return drawRoundRectZuiqVtQ.RemoteActionCompatParcelizer;
        }
        if (i == 3) {
            return new obtainFillPaint(i2, new configureStrokePaintho4zsrM(2));
        }
        if (i == 5) {
            return new obtainFillPaint(i2, new configureStrokePaintho4zsrM(4));
        }
        if (i == 6) {
            return new drawRoundRectZuiqVtQ(i2);
        }
        switch (i) {
            case 11:
                return new drawPathGBMwjPU(multiModelLoaderFactory.serializer(Uri.class, AssetFileDescriptor.class), 0);
            case 12:
                return new drawPathGBMwjPU(multiModelLoaderFactory.serializer(Uri.class, ParcelFileDescriptor.class), 0);
            case 13:
                return new drawPathGBMwjPU(multiModelLoaderFactory.serializer(Uri.class, InputStream.class), 0);
            default:
                return new drawPointsF8ZwMP8(multiModelLoaderFactory.serializer(modulate5vOe2sY.class, InputStream.class));
        }
    }
}
