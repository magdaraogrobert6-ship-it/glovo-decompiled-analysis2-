package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.RectF;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public abstract class newD50Xyzui_graphics {
    public static final android.graphics.Matrix write = new android.graphics.Matrix();
    public static final getE IconCompatParcelizer = new getE(0);
    public static final getE read = new getE(5);
    public static final getE MediaSessionCompatQueueItem = new getE(6);
    public static final getE serializer = new getE(7);
    public static final float RemoteActionCompatParcelizer = (float) (Math.sqrt(2.0d) / 2.0d);

    public static void RemoteActionCompatParcelizer(android.graphics.Canvas canvas, RectF rectF, android.graphics.Paint paint) {
        getMiterLxFBmk8 getmiterlxfbmk8 = getRoundLxFBmk8.read;
        canvas.saveLayer(rectF, paint);
    }

    public static void serializer(android.graphics.Path path, float f, float f2, float f3) {
        getMiterLxFBmk8 getmiterlxfbmk8 = getRoundLxFBmk8.read;
        android.graphics.PathMeasure pathMeasure = (android.graphics.PathMeasure) IconCompatParcelizer.get();
        android.graphics.Path path2 = (android.graphics.Path) read.get();
        android.graphics.Path path3 = (android.graphics.Path) MediaSessionCompatQueueItem.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f == 1.0f && f2 == 0.0f) && length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float fMin = Math.min(f4, f5) + f6;
            float fMax = Math.max(f4, f5) + f6;
            if (fMin >= length && fMax >= length) {
                fMin = getD50.write(fMin, length);
                fMax = getD50.write(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = getD50.write(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = getD50.write(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    public static float IconCompatParcelizer() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static void write(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static Bitmap write(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }
}
