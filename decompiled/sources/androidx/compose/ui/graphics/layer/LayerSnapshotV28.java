package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes.dex */
public final class LayerSnapshotV28 implements LayerSnapshotImpl {
    public static final int $stable = 0;
    public static final LayerSnapshotV28 INSTANCE = new LayerSnapshotV28();

    /* JADX INFO: loaded from: classes4.dex */
    public static final class GraphicsLayerPicture extends Picture {
        private final GraphicsLayer graphicsLayer;

        @Override // android.graphics.Picture
        public void endRecording() {
        }

        public final GraphicsLayer getGraphicsLayer() {
            return this.graphicsLayer;
        }

        @Override // android.graphics.Picture
        public boolean requiresHardwareAcceleration() {
            return true;
        }

        @Override // android.graphics.Picture
        public Canvas beginRecording(int i, int i2) {
            return new Canvas();
        }

        @Override // android.graphics.Picture
        public void draw(Canvas canvas) {
            this.graphicsLayer.draw$ui_graphics(AndroidCanvas_androidKt.Canvas(canvas), null);
        }

        @Override // android.graphics.Picture
        public int getHeight() {
            return (int) (this.graphicsLayer.m1395getSizeYbymL2g() & 4294967295L);
        }

        @Override // android.graphics.Picture
        public int getWidth() {
            return (int) (this.graphicsLayer.m1395getSizeYbymL2g() >> 32);
        }

        public GraphicsLayerPicture(GraphicsLayer graphicsLayer) {
            this.graphicsLayer = graphicsLayer;
        }
    }

    private LayerSnapshotV28() {
    }

    @Override // androidx.compose.ui.graphics.layer.LayerSnapshotImpl
    public Object toBitmap(GraphicsLayer graphicsLayer, ShortNewsContentCardView<? super Bitmap> shortNewsContentCardView) {
        return Bitmap.createBitmap(new GraphicsLayerPicture(graphicsLayer));
    }
}
