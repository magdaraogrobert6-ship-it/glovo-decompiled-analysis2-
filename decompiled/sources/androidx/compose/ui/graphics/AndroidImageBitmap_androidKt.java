package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidImageBitmap_androidKt {
    public static final ImageBitmap createImageBitmap(byte[] bArr) {
        return asImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    public static final ImageBitmap asImageBitmap(Bitmap bitmap) {
        return new AndroidImageBitmap(bitmap);
    }

    /* JADX INFO: renamed from: toBitmapConfig-1JJdX4A, reason: not valid java name */
    public static final Bitmap.Config m588toBitmapConfig1JJdX4A(int i) {
        ImageBitmapConfig.Companion companion = ImageBitmapConfig.Companion;
        if (ImageBitmapConfig.m951equalsimpl0(i, companion.m956getArgb8888_sVssgQ())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (ImageBitmapConfig.m951equalsimpl0(i, companion.m955getAlpha8_sVssgQ())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (ImageBitmapConfig.m951equalsimpl0(i, companion.m959getRgb565_sVssgQ())) {
            return Bitmap.Config.RGB_565;
        }
        if (ImageBitmapConfig.m951equalsimpl0(i, companion.m957getF16_sVssgQ())) {
            return Bitmap.Config.RGBA_F16;
        }
        return ImageBitmapConfig.m951equalsimpl0(i, companion.m958getGpu_sVssgQ()) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    /* JADX INFO: renamed from: ActualImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m587ActualImageBitmapx__hDU(int i, int i2, int i3, boolean z, ColorSpace colorSpace) {
        m588toBitmapConfig1JJdX4A(i3);
        return new AndroidImageBitmap(Bitmap.createBitmap((DisplayMetrics) null, i, i2, m588toBitmapConfig1JJdX4A(i3), z, AndroidColorSpace_androidKt.toAndroidColorSpace(colorSpace)));
    }

    public static final Bitmap asAndroidBitmap(ImageBitmap imageBitmap) {
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).getBitmap$ui_graphics();
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static final int toImageConfig(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return ImageBitmapConfig.Companion.m955getAlpha8_sVssgQ();
        }
        if (config == Bitmap.Config.RGB_565) {
            return ImageBitmapConfig.Companion.m959getRgb565_sVssgQ();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return ImageBitmapConfig.Companion.m956getArgb8888_sVssgQ();
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return ImageBitmapConfig.Companion.m957getF16_sVssgQ();
        }
        return config == Bitmap.Config.HARDWARE ? ImageBitmapConfig.Companion.m958getGpu_sVssgQ() : ImageBitmapConfig.Companion.m956getArgb8888_sVssgQ();
    }
}
