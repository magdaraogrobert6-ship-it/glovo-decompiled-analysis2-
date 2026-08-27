package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import coil3.util.UtilsKt;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.nio.ByteBuffer;
import java.util.Locale;
import o.AuthPromptFailureException;
import o.ToolbarSavedState;
import o.getCameraXConfig;
import o.getDefaultImageFormat;
import o.getInflatedId;
import o.setInflatedId;
import o.setTitleMarginTop;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImageProcessingUtil {
    public static int RemoteActionCompatParcelizer;

    public enum IconCompatParcelizer {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    public static boolean IconCompatParcelizer(int i) {
        return i == 0 || i == 90 || i == 180 || i == 270;
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Bitmap bitmap, int i6, int i7, int i8);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    public static native int nativeGetYUVImageVUOff(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public static native ByteBuffer nativeNewDirectByteBuffer(ByteBuffer byteBuffer, int i, int i2);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i10, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i11, int i12, int i13);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static getCameraXConfig serializer(getInflatedId getinflatedid, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i) {
        if (!RemoteActionCompatParcelizer(getinflatedid)) {
            setInflatedId.serializer("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!IconCompatParcelizer(i)) {
            setInflatedId.serializer("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        if (i == 0 && getinflatedid.IconCompatParcelizer().length == 3 && getinflatedid.IconCompatParcelizer()[1].RemoteActionCompatParcelizer() == 2 && nativeGetYUVImageVUOff(getinflatedid.IconCompatParcelizer()[2].write(), getinflatedid.IconCompatParcelizer()[1].write()) == -1) {
            return null;
        }
        int i2 = i % 180;
        int iRatingCompat = i2 == 0 ? getinflatedid.RatingCompat() : getinflatedid.serializer();
        int iSerializer = i2 == 0 ? getinflatedid.serializer() : getinflatedid.RatingCompat();
        ByteBuffer byteBufferNativeNewDirectByteBuffer = nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
        if (nativeRotateYUV(getinflatedid.IconCompatParcelizer()[0].write(), getinflatedid.IconCompatParcelizer()[0].IconCompatParcelizer(), getinflatedid.IconCompatParcelizer()[1].write(), getinflatedid.IconCompatParcelizer()[1].IconCompatParcelizer(), getinflatedid.IconCompatParcelizer()[2].write(), getinflatedid.IconCompatParcelizer()[2].IconCompatParcelizer(), getinflatedid.IconCompatParcelizer()[2].RemoteActionCompatParcelizer(), byteBuffer4, iRatingCompat, 1, byteBufferNativeNewDirectByteBuffer, iRatingCompat, 2, byteBuffer5, iRatingCompat, 2, byteBuffer, byteBuffer2, byteBuffer3, getinflatedid.RatingCompat(), getinflatedid.serializer(), i) == 0) {
            return new getCameraXConfig(new ToolbarSavedState(getinflatedid, byteBuffer4, byteBufferNativeNewDirectByteBuffer, byteBuffer5, iRatingCompat, iSerializer));
        }
        setInflatedId.serializer("ImageProcessingUtil", "rotate YUV failure");
        return null;
    }

    public static void write(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            setInflatedId.serializer("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    public static void IconCompatParcelizer(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static void serializer(getInflatedId getinflatedid) {
        if (!RemoteActionCompatParcelizer(getinflatedid)) {
            setInflatedId.serializer("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return;
        }
        int iRatingCompat = getinflatedid.RatingCompat();
        int iSerializer = getinflatedid.serializer();
        int iIconCompatParcelizer = getinflatedid.IconCompatParcelizer()[0].IconCompatParcelizer();
        int iIconCompatParcelizer2 = getinflatedid.IconCompatParcelizer()[1].IconCompatParcelizer();
        int iIconCompatParcelizer3 = getinflatedid.IconCompatParcelizer()[2].IconCompatParcelizer();
        int iRemoteActionCompatParcelizer = getinflatedid.IconCompatParcelizer()[0].RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = getinflatedid.IconCompatParcelizer()[1].RemoteActionCompatParcelizer();
        if ((nativeShiftPixel(getinflatedid.IconCompatParcelizer()[0].write(), iIconCompatParcelizer, getinflatedid.IconCompatParcelizer()[1].write(), iIconCompatParcelizer2, getinflatedid.IconCompatParcelizer()[2].write(), iIconCompatParcelizer3, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, iRatingCompat, iSerializer, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, iRemoteActionCompatParcelizer2) != 0 ? IconCompatParcelizer.ERROR_CONVERSION : IconCompatParcelizer.SUCCESS) == IconCompatParcelizer.ERROR_CONVERSION) {
            setInflatedId.serializer("ImageProcessingUtil", "One pixel shift for YUV failure");
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00f4  */
    public static getCameraXConfig IconCompatParcelizer(getInflatedId getinflatedid, getDefaultImageFormat getdefaultimageformat, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        IconCompatParcelizer iconCompatParcelizer;
        if (!RemoteActionCompatParcelizer(getinflatedid)) {
            setInflatedId.serializer("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!IconCompatParcelizer(i)) {
            setInflatedId.serializer("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        IconCompatParcelizer iconCompatParcelizer2 = IconCompatParcelizer.ERROR_CONVERSION;
        if (i > 0) {
            int iRatingCompat = getinflatedid.RatingCompat();
            int iSerializer = getinflatedid.serializer();
            int iIconCompatParcelizer = getinflatedid.IconCompatParcelizer()[0].IconCompatParcelizer();
            int iIconCompatParcelizer2 = getinflatedid.IconCompatParcelizer()[1].IconCompatParcelizer();
            int iIconCompatParcelizer3 = getinflatedid.IconCompatParcelizer()[2].IconCompatParcelizer();
            int iRemoteActionCompatParcelizer = getinflatedid.IconCompatParcelizer()[1].RemoteActionCompatParcelizer();
            Image imageDequeueInputImage = imageWriter.dequeueInputImage();
            if (imageDequeueInputImage != null && nativeRotateYUV(getinflatedid.IconCompatParcelizer()[0].write(), iIconCompatParcelizer, getinflatedid.IconCompatParcelizer()[1].write(), iIconCompatParcelizer2, getinflatedid.IconCompatParcelizer()[2].write(), iIconCompatParcelizer3, iRemoteActionCompatParcelizer, imageDequeueInputImage.getPlanes()[0].getBuffer(), imageDequeueInputImage.getPlanes()[0].getRowStride(), imageDequeueInputImage.getPlanes()[0].getPixelStride(), imageDequeueInputImage.getPlanes()[1].getBuffer(), imageDequeueInputImage.getPlanes()[1].getRowStride(), imageDequeueInputImage.getPlanes()[1].getPixelStride(), imageDequeueInputImage.getPlanes()[2].getBuffer(), imageDequeueInputImage.getPlanes()[2].getRowStride(), imageDequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, iRatingCompat, iSerializer, i) == 0) {
                imageWriter.queueInputImage(imageDequeueInputImage);
                iconCompatParcelizer = IconCompatParcelizer.SUCCESS;
            } else {
                iconCompatParcelizer = iconCompatParcelizer2;
            }
        } else {
            iconCompatParcelizer = iconCompatParcelizer2;
        }
        if (iconCompatParcelizer == iconCompatParcelizer2) {
            setInflatedId.serializer("ImageProcessingUtil", "rotate YUV failure");
            return null;
        }
        getInflatedId getinflatedidWrite = getdefaultimageformat.write();
        if (getinflatedidWrite == null) {
            setInflatedId.serializer("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
            return null;
        }
        getCameraXConfig getcameraxconfig = new getCameraXConfig(getinflatedidWrite);
        getcameraxconfig.RemoteActionCompatParcelizer(new setTitleMarginTop(getinflatedidWrite, getinflatedid, 1));
        return getcameraxconfig;
    }

    public static getCameraXConfig read(getInflatedId getinflatedid, getDefaultImageFormat getdefaultimageformat, ByteBuffer byteBuffer, int i, boolean z) {
        if (!RemoteActionCompatParcelizer(getinflatedid)) {
            setInflatedId.serializer("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        System.currentTimeMillis();
        if (!IconCompatParcelizer(i)) {
            setInflatedId.serializer("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        Surface surfaceRatingCompat = getdefaultimageformat.RatingCompat();
        int iRatingCompat = getinflatedid.RatingCompat();
        int iSerializer = getinflatedid.serializer();
        int iIconCompatParcelizer = getinflatedid.IconCompatParcelizer()[0].IconCompatParcelizer();
        int iIconCompatParcelizer2 = getinflatedid.IconCompatParcelizer()[1].IconCompatParcelizer();
        int iIconCompatParcelizer3 = getinflatedid.IconCompatParcelizer()[2].IconCompatParcelizer();
        int iRemoteActionCompatParcelizer = getinflatedid.IconCompatParcelizer()[0].RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = getinflatedid.IconCompatParcelizer()[1].RemoteActionCompatParcelizer();
        if ((nativeConvertAndroid420ToABGR(getinflatedid.IconCompatParcelizer()[0].write(), iIconCompatParcelizer, getinflatedid.IconCompatParcelizer()[1].write(), iIconCompatParcelizer2, getinflatedid.IconCompatParcelizer()[2].write(), iIconCompatParcelizer3, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, surfaceRatingCompat, byteBuffer, iRatingCompat, iSerializer, z ? iRemoteActionCompatParcelizer : 0, z ? iRemoteActionCompatParcelizer2 : 0, z ? iRemoteActionCompatParcelizer2 : 0, i) != 0 ? IconCompatParcelizer.ERROR_CONVERSION : IconCompatParcelizer.SUCCESS) == IconCompatParcelizer.ERROR_CONVERSION) {
            setInflatedId.serializer("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            System.currentTimeMillis();
            setInflatedId.IconCompatParcelizer(3, "ImageProcessingUtil");
            RemoteActionCompatParcelizer++;
        }
        getInflatedId getinflatedidWrite = getdefaultimageformat.write();
        if (getinflatedidWrite == null) {
            setInflatedId.serializer("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        getCameraXConfig getcameraxconfig = new getCameraXConfig(getinflatedidWrite);
        getcameraxconfig.RemoteActionCompatParcelizer(new setTitleMarginTop(getinflatedidWrite, getinflatedid, 0));
        return getcameraxconfig;
    }

    public static boolean RemoteActionCompatParcelizer(getInflatedId getinflatedid) {
        return getinflatedid.write() == 35 && getinflatedid.IconCompatParcelizer().length == 3;
    }

    public static Bitmap read(getInflatedId getinflatedid) {
        if (getinflatedid.write() != 35) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Input image format must be YUV_420_888");
            return null;
        }
        int iRatingCompat = getinflatedid.RatingCompat();
        int iSerializer = getinflatedid.serializer();
        int iIconCompatParcelizer = getinflatedid.IconCompatParcelizer()[0].IconCompatParcelizer();
        int iIconCompatParcelizer2 = getinflatedid.IconCompatParcelizer()[1].IconCompatParcelizer();
        int iIconCompatParcelizer3 = getinflatedid.IconCompatParcelizer()[2].IconCompatParcelizer();
        int iRemoteActionCompatParcelizer = getinflatedid.IconCompatParcelizer()[0].RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = getinflatedid.IconCompatParcelizer()[1].RemoteActionCompatParcelizer();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getinflatedid.RatingCompat(), getinflatedid.serializer(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(getinflatedid.IconCompatParcelizer()[0].write(), iIconCompatParcelizer, getinflatedid.IconCompatParcelizer()[1].write(), iIconCompatParcelizer2, getinflatedid.IconCompatParcelizer()[2].write(), iIconCompatParcelizer3, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), iRatingCompat, iSerializer) == 0) {
            return bitmapCreateBitmap;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("YUV to RGB conversion failed");
        return null;
    }

    public static getInflatedId write(AuthPromptFailureException authPromptFailureException, byte[] bArr) {
        UtilsKt.serializer(authPromptFailureException.MediaBrowserCompatMediaItem() == 256);
        bArr.getClass();
        Surface surfaceRatingCompat = authPromptFailureException.RatingCompat();
        surfaceRatingCompat.getClass();
        if (nativeWriteJpegToSurface(bArr, surfaceRatingCompat) != 0) {
            setInflatedId.serializer("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        getInflatedId getinflatedidWrite = authPromptFailureException.write();
        if (getinflatedidWrite == null) {
            setInflatedId.serializer("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return getinflatedidWrite;
    }
}
