package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;

/* JADX INFO: loaded from: classes.dex */
public final class BitmapPainterKt {
    /* JADX INFO: renamed from: BitmapPainter-QZhYCtY$default, reason: not valid java name */
    public static /* synthetic */ BitmapPainter m1427BitmapPainterQZhYCtY$default(ImageBitmap imageBitmap, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = IntOffset.Companion.m3812getZeronOccac();
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = IntSize.m3839constructorimpl((((long) imageBitmap.getHeight()) & 4294967295L) | (((long) imageBitmap.getWidth()) << 32));
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            i = FilterQuality.Companion.m825getLowfv9h1I();
        }
        return m1426BitmapPainterQZhYCtY(imageBitmap, j3, j4, i);
    }

    /* JADX INFO: renamed from: BitmapPainter-QZhYCtY, reason: not valid java name */
    public static final BitmapPainter m1426BitmapPainterQZhYCtY(ImageBitmap imageBitmap, long j, long j2, int i) {
        BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, j, j2, null);
        bitmapPainter.m1425setFilterQualityvDHp3xo$ui_graphics(i);
        return bitmapPainter;
    }
}
