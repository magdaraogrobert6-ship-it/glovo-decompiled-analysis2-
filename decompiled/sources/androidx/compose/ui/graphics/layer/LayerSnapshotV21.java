package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes.dex */
public final class LayerSnapshotV21 implements LayerSnapshotImpl {
    public static final int $stable = 0;
    public static final LayerSnapshotV21 INSTANCE = new LayerSnapshotV21();

    private LayerSnapshotV21() {
    }

    @Override // androidx.compose.ui.graphics.layer.LayerSnapshotImpl
    public Object toBitmap(GraphicsLayer graphicsLayer, ShortNewsContentCardView<? super Bitmap> shortNewsContentCardView) {
        long jM1395getSizeYbymL2g = graphicsLayer.m1395getSizeYbymL2g();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (jM1395getSizeYbymL2g >> 32), (int) (jM1395getSizeYbymL2g & 4294967295L), Bitmap.Config.ARGB_8888);
        graphicsLayer.draw$ui_graphics(AndroidCanvas_androidKt.Canvas(new Canvas(bitmapCreateBitmap)), null);
        return bitmapCreateBitmap;
    }
}
