package androidx.camera.core.internal.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import android.util.Rational;
import androidx.camera.core.ImageProcessingUtil;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import o.CodecStuckOnFlushQuirk;
import o.ExcludeStretchedVideoQualityQuirk;
import o.ExtraSupportedResolutionQuirk;
import o.HdrRepeatingRequestFailureQuirk;
import o.MediaCodecDefaultDataSpaceQuirk;
import o.Toolbar4;
import o.getInflatedId;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImageUtil {
    public static boolean read(int i) {
        return i == 256 || i == 4101;
    }

    public static byte[] RemoteActionCompatParcelizer(getInflatedId getinflatedid, Rect rect, int i, int i2) throws CodecFailedException {
        if (getinflatedid.write() != 35) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(getinflatedid.write(), "Incorrect image format of the input image proxy: ");
            return null;
        }
        Toolbar4 toolbar4 = getinflatedid.IconCompatParcelizer()[0];
        Toolbar4 toolbar5 = getinflatedid.IconCompatParcelizer()[1];
        Toolbar4 toolbar6 = getinflatedid.IconCompatParcelizer()[2];
        ByteBuffer byteBufferWrite = toolbar4.write();
        ByteBuffer byteBufferWrite2 = toolbar5.write();
        ByteBuffer byteBufferWrite3 = toolbar6.write();
        byteBufferWrite.rewind();
        byteBufferWrite2.rewind();
        byteBufferWrite3.rewind();
        int iRemaining = byteBufferWrite.remaining();
        byte[] bArr = new byte[((getinflatedid.serializer() * getinflatedid.RatingCompat()) / 2) + iRemaining];
        int iRatingCompat = 0;
        for (int i3 = 0; i3 < getinflatedid.serializer(); i3++) {
            byteBufferWrite.get(bArr, iRatingCompat, getinflatedid.RatingCompat());
            iRatingCompat += getinflatedid.RatingCompat();
            byteBufferWrite.position(Math.min(iRemaining, toolbar4.IconCompatParcelizer() + (byteBufferWrite.position() - getinflatedid.RatingCompat())));
        }
        int iSerializer = getinflatedid.serializer() / 2;
        int iRatingCompat2 = getinflatedid.RatingCompat() / 2;
        int iIconCompatParcelizer = toolbar6.IconCompatParcelizer();
        int iIconCompatParcelizer2 = toolbar5.IconCompatParcelizer();
        int iRemoteActionCompatParcelizer = toolbar6.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = toolbar5.RemoteActionCompatParcelizer();
        byte[] bArr2 = new byte[iIconCompatParcelizer];
        byte[] bArr3 = new byte[iIconCompatParcelizer2];
        for (int i4 = 0; i4 < iSerializer; i4++) {
            byteBufferWrite3.get(bArr2, 0, Math.min(iIconCompatParcelizer, byteBufferWrite3.remaining()));
            byteBufferWrite2.get(bArr3, 0, Math.min(iIconCompatParcelizer2, byteBufferWrite2.remaining()));
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < iRatingCompat2) {
                bArr[iRatingCompat] = bArr2[i6];
                bArr[iRatingCompat + 1] = bArr3[i7];
                i6 += iRemoteActionCompatParcelizer;
                i7 += iRemoteActionCompatParcelizer2;
                i5++;
                iRatingCompat += 2;
            }
        }
        YuvImage yuvImage = new YuvImage(bArr, 17, getinflatedid.RatingCompat(), getinflatedid.serializer(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ExtraSupportedResolutionQuirk[] extraSupportedResolutionQuirkArr = CodecStuckOnFlushQuirk.read;
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        ExcludeStretchedVideoQualityQuirk excludeStretchedVideoQualityQuirk = new ExcludeStretchedVideoQualityQuirk();
        ArrayList arrayList = excludeStretchedVideoQualityQuirk.serializer;
        excludeStretchedVideoQualityQuirk.RemoteActionCompatParcelizer("Orientation", String.valueOf(1), arrayList);
        excludeStretchedVideoQualityQuirk.RemoteActionCompatParcelizer("XResolution", "72/1", arrayList);
        excludeStretchedVideoQualityQuirk.RemoteActionCompatParcelizer("YResolution", "72/1", arrayList);
        excludeStretchedVideoQualityQuirk.RemoteActionCompatParcelizer("ResolutionUnit", String.valueOf(2), arrayList);
        excludeStretchedVideoQualityQuirk.RemoteActionCompatParcelizer("YCbCrPositioning", String.valueOf(1), arrayList);
        excludeStretchedVideoQualityQuirk.RemoteActionCompatParcelizer("Make", Build.MANUFACTURER, arrayList);
        excludeStretchedVideoQualityQuirk.RemoteActionCompatParcelizer("Model", Build.MODEL, arrayList);
        if (getinflatedid.read() != null) {
            getinflatedid.read().serializer(excludeStretchedVideoQualityQuirk);
        }
        excludeStretchedVideoQualityQuirk.RemoteActionCompatParcelizer(i2);
        excludeStretchedVideoQualityQuirk.RemoteActionCompatParcelizer("ImageWidth", String.valueOf(getinflatedid.RatingCompat()), arrayList);
        excludeStretchedVideoQualityQuirk.RemoteActionCompatParcelizer("ImageLength", String.valueOf(getinflatedid.serializer()), arrayList);
        ArrayList list = Collections.list(new HdrRepeatingRequestFailureQuirk(excludeStretchedVideoQualityQuirk));
        if (!((Map) list.get(1)).isEmpty()) {
            excludeStretchedVideoQualityQuirk.write("ExposureProgram", String.valueOf(0), list);
            excludeStretchedVideoQualityQuirk.write("ExifVersion", "0230", list);
            excludeStretchedVideoQualityQuirk.write("ComponentsConfiguration", CodecStuckOnFlushQuirk.write, list);
            excludeStretchedVideoQualityQuirk.write("MeteringMode", String.valueOf(0), list);
            excludeStretchedVideoQualityQuirk.write("LightSource", String.valueOf(0), list);
            excludeStretchedVideoQualityQuirk.write("FlashpixVersion", "0100", list);
            excludeStretchedVideoQualityQuirk.write("FocalPlaneResolutionUnit", String.valueOf(2), list);
            excludeStretchedVideoQualityQuirk.write("FileSource", String.valueOf(3), list);
            excludeStretchedVideoQualityQuirk.write("SceneType", String.valueOf(1), list);
            excludeStretchedVideoQualityQuirk.write("CustomRendered", String.valueOf(0), list);
            excludeStretchedVideoQualityQuirk.write("SceneCaptureType", String.valueOf(0), list);
            excludeStretchedVideoQualityQuirk.write("Contrast", String.valueOf(0), list);
            excludeStretchedVideoQualityQuirk.write("Saturation", String.valueOf(0), list);
            excludeStretchedVideoQualityQuirk.write("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(2)).isEmpty()) {
            excludeStretchedVideoQualityQuirk.write("GPSVersionID", "2300", list);
            excludeStretchedVideoQualityQuirk.write("GPSSpeedRef", "K", list);
            excludeStretchedVideoQualityQuirk.write("GPSTrackRef", "T", list);
            excludeStretchedVideoQualityQuirk.write("GPSImgDirectionRef", "T", list);
            excludeStretchedVideoQualityQuirk.write("GPSDestBearingRef", "T", list);
            excludeStretchedVideoQualityQuirk.write("GPSDestDistanceRef", "K", list);
        }
        if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, getinflatedid.RatingCompat(), getinflatedid.serializer()) : rect, i, new MediaCodecDefaultDataSpaceQuirk(byteArrayOutputStream, new CodecStuckOnFlushQuirk(excludeStretchedVideoQualityQuirk.RatingCompat, list)))) {
            return byteArrayOutputStream.toByteArray();
        }
        CodecFailedException.read readVar = CodecFailedException.read.ENCODE_FAILED;
        throw new CodecFailedException("YuvImage failed to encode jpeg.");
    }

    public static Rational serializer(int i, Rational rational) {
        if (i == 90 || i == 270) {
            return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
        }
        return new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static Bitmap IconCompatParcelizer(getInflatedId getinflatedid) {
        int iWrite = getinflatedid.write();
        if (iWrite == 1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getinflatedid.RatingCompat(), getinflatedid.serializer(), Bitmap.Config.ARGB_8888);
            getinflatedid.IconCompatParcelizer()[0].write().rewind();
            ImageProcessingUtil.IconCompatParcelizer(bitmapCreateBitmap, getinflatedid.IconCompatParcelizer()[0].write(), getinflatedid.IconCompatParcelizer()[0].IconCompatParcelizer());
            return bitmapCreateBitmap;
        }
        if (iWrite == 35) {
            return ImageProcessingUtil.read(getinflatedid);
        }
        if (iWrite != 256 && iWrite != 4101) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(getinflatedid.write(), "Incorrect image format of the input image proxy: ", ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
            return null;
        }
        if (!read(getinflatedid.write())) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(getinflatedid.write(), "Incorrect image format of the input image proxy: ");
            return null;
        }
        ByteBuffer byteBufferWrite = getinflatedid.IconCompatParcelizer()[0].write();
        int iCapacity = byteBufferWrite.capacity();
        byte[] bArr = new byte[iCapacity];
        byteBufferWrite.rewind();
        byteBufferWrite.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iCapacity, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Decode jpeg byte array failed");
        return null;
    }

    public final class CodecFailedException extends Exception {

        public enum read {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        public CodecFailedException(String str) {
            super(str);
        }
    }
}
