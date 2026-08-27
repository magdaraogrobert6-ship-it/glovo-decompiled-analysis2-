package o;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class drawPathGBMwjPUdefault implements getInverseTransform {
    public final /* synthetic */ int serializer;
    public final getD write;

    public drawPathGBMwjPUdefault() {
        this.serializer = 1;
        this.write = new toContentCaptureSession(false);
    }

    @Override // o.getInverseTransform
    public final generateOetf IconCompatParcelizer(Object obj, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics) {
        if (this.serializer != 0) {
            return serializer((ImageDecoder.Source) obj, i, i2, geteotffuncui_graphics);
        }
        Bitmap bitmapIconCompatParcelizer = ((DoubleIdentitylambda0) obj).IconCompatParcelizer();
        if (bitmapIconCompatParcelizer == null) {
            return null;
        }
        return new getCanvas(bitmapIconCompatParcelizer, this.write);
    }

    @Override // o.getInverseTransform
    public final /* bridge */ /* synthetic */ boolean RemoteActionCompatParcelizer(Object obj, getEotfFuncui_graphics geteotffuncui_graphics) {
        if (this.serializer != 0) {
            return true;
        }
        return true;
    }

    public drawPathGBMwjPUdefault(getD getd) {
        this.serializer = 0;
        this.write = getd;
    }

    public getCanvas serializer(ImageDecoder.Source source, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new getDrawParams(i, i2, geteotffuncui_graphics));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new getCanvas(bitmapDecodeBitmap, (toContentCaptureSession) this.write);
    }
}
