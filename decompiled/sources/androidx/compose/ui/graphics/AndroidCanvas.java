package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntOffset;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidCanvas implements Canvas {
    public static final int $stable = 8;
    private Rect dstRect;
    private android.graphics.Canvas internalCanvas = AndroidCanvas_androidKt.EmptyCanvas;
    private Rect srcRect;

    private final void drawPoints(List<Offset> list, Paint paint) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            long jM487unboximpl = list.get(i).m487unboximpl();
            this.internalCanvas.drawPoint(Float.intBitsToFloat((int) (jM487unboximpl >> 32)), Float.intBitsToFloat((int) (jM487unboximpl & 4294967295L)), AndroidPaint_androidKt.getNativePaint(paint));
        }
    }

    public static /* synthetic */ void getInternalCanvas$annotations() {
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipRect-N_I0leg, reason: not valid java name */
    public void mo572clipRectN_I0leg(float f, float f2, float f3, float f4, int i) {
        this.internalCanvas.clipRect(f, f2, f3, f4, m581toRegionOp7u2Bmg(i));
    }

    public final android.graphics.Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    public final void setInternalCanvas(android.graphics.Canvas canvas) {
        this.internalCanvas = canvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipPath-mtrdD-E, reason: not valid java name */
    public void mo571clipPathmtrdDE(Path path, int i) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (path instanceof AndroidPath) {
            canvas.clipPath(((AndroidPath) path).getInternalPath(), m581toRegionOp7u2Bmg(i));
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        this.internalCanvas.drawArc(f, f2, f3, f4, f5, f6, z, AndroidPaint_androidKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawImage-d-4ec7I, reason: not valid java name */
    public void mo575drawImaged4ec7I(ImageBitmap imageBitmap, long j, Paint paint) {
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), AndroidPaint_androidKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        this.internalCanvas.drawOval(f, f2, f3, f4, AndroidPaint_androidKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (path instanceof AndroidPath) {
            canvas.drawPath(((AndroidPath) path).getInternalPath(), AndroidPaint_androidKt.getNativePaint(paint));
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawPoints-O7TthRY, reason: not valid java name */
    public void mo578drawPointsO7TthRY(int i, List<Offset> list, Paint paint) {
        PointMode.Companion companion = PointMode.Companion;
        if (PointMode.m1040equalsimpl0(i, companion.m1044getLinesr_lszbg())) {
            drawLines(list, paint, 2);
        } else if (PointMode.m1040equalsimpl0(i, companion.m1046getPolygonr_lszbg())) {
            drawLines(list, paint, 1);
        } else if (PointMode.m1040equalsimpl0(i, companion.m1045getPointsr_lszbg())) {
            drawPoints(list, paint);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        this.internalCanvas.drawRect(f, f2, f3, f4, AndroidPaint_androidKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        this.internalCanvas.drawRoundRect(f, f2, f3, f4, f5, f6, AndroidPaint_androidKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawVertices-TPEHhCM, reason: not valid java name */
    public void mo580drawVerticesTPEHhCM(Vertices vertices, int i, Paint paint) {
        this.internalCanvas.drawVertices(AndroidVertexMode_androidKt.m626toAndroidVertexModeJOOmi9M(vertices.m1150getVertexModec2xauaI()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, AndroidPaint_androidKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void restore() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void rotate(float f) {
        this.internalCanvas.rotate(f);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void saveLayer(androidx.compose.ui.geometry.Rect rect, Paint paint) {
        this.internalCanvas.saveLayer(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), AndroidPaint_androidKt.getNativePaint(paint), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void scale(float f, float f2) {
        this.internalCanvas.scale(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void skew(float f, float f2) {
        this.internalCanvas.skew(f, f2);
    }

    /* JADX INFO: renamed from: toRegionOp--7u2Bmg, reason: not valid java name */
    public final Region.Op m581toRegionOp7u2Bmg(int i) {
        return ClipOp.m706equalsimpl0(i, ClipOp.Companion.m710getDifferencertfAjoo()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void translate(float f, float f2) {
        this.internalCanvas.translate(f, f2);
    }

    private final void drawRawPoints(float[] fArr, Paint paint, int i) {
        if (fArr.length % 2 == 0) {
            android.graphics.Paint nativePaint = AndroidPaint_androidKt.getNativePaint(paint);
            int i2 = 0;
            while (i2 < fArr.length - 1) {
                this.internalCanvas.drawPoint(fArr[i2], fArr[i2 + 1], nativePaint);
                i2 += i;
            }
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawRawPoints-O7TthRY, reason: not valid java name */
    public void mo579drawRawPointsO7TthRY(int i, float[] fArr, Paint paint) {
        if (fArr.length % 2 != 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("points must have an even number of values");
            return;
        }
        PointMode.Companion companion = PointMode.Companion;
        if (PointMode.m1040equalsimpl0(i, companion.m1044getLinesr_lszbg())) {
            drawRawLines(fArr, paint, 2);
        } else if (PointMode.m1040equalsimpl0(i, companion.m1046getPolygonr_lszbg())) {
            drawRawLines(fArr, paint, 1);
        } else if (PointMode.m1040equalsimpl0(i, companion.m1045getPointsr_lszbg())) {
            drawRawPoints(fArr, paint, 2);
        }
    }

    private final void drawRawLines(float[] fArr, Paint paint, int i) {
        if (fArr.length < 4 || fArr.length % 2 != 0) {
            return;
        }
        android.graphics.Paint nativePaint = AndroidPaint_androidKt.getNativePaint(paint);
        int i2 = 0;
        while (i2 < fArr.length - 3) {
            this.internalCanvas.drawLine(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3], nativePaint);
            i2 += i * 2;
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawImageRect-HPBpro0, reason: not valid java name */
    public void mo576drawImageRectHPBpro0(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint) {
        if (this.srcRect == null) {
            this.srcRect = new Rect();
            this.dstRect = new Rect();
        }
        android.graphics.Canvas canvas = this.internalCanvas;
        Bitmap bitmapAsAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap);
        Rect rect = this.srcRect;
        rect.getClass();
        rect.left = IntOffset.m3801getXimpl(j);
        rect.top = IntOffset.m3802getYimpl(j);
        rect.right = IntOffset.m3801getXimpl(j) + ((int) (j2 >> 32));
        rect.bottom = IntOffset.m3802getYimpl(j) + ((int) (j2 & 4294967295L));
        Rect rect2 = this.dstRect;
        rect2.getClass();
        rect2.left = IntOffset.m3801getXimpl(j3);
        rect2.top = IntOffset.m3802getYimpl(j3);
        rect2.right = IntOffset.m3801getXimpl(j3) + ((int) (j4 >> 32));
        rect2.bottom = IntOffset.m3802getYimpl(j3) + ((int) (j4 & 4294967295L));
        canvas.drawBitmap(bitmapAsAndroidBitmap, rect, rect2, AndroidPaint_androidKt.getNativePaint(paint));
    }

    private final void drawLines(List<Offset> list, Paint paint, int i) {
        if (list.size() >= 2) {
            android.graphics.Paint nativePaint = AndroidPaint_androidKt.getNativePaint(paint);
            int i2 = 0;
            while (i2 < list.size() - 1) {
                long jM487unboximpl = list.get(i2).m487unboximpl();
                long jM487unboximpl2 = list.get(i2 + 1).m487unboximpl();
                this.internalCanvas.drawLine(Float.intBitsToFloat((int) (jM487unboximpl >> 32)), Float.intBitsToFloat((int) (jM487unboximpl & 4294967295L)), Float.intBitsToFloat((int) (jM487unboximpl2 >> 32)), Float.intBitsToFloat((int) (jM487unboximpl2 & 4294967295L)), nativePaint);
                i2 += i;
            }
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawCircle-9KIMszo, reason: not valid java name */
    public void mo574drawCircle9KIMszo(long j, float f, Paint paint) {
        this.internalCanvas.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, AndroidPaint_androidKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawLine-Wko1d7g, reason: not valid java name */
    public void mo577drawLineWko1d7g(long j, long j2, Paint paint) {
        this.internalCanvas.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), AndroidPaint_androidKt.getNativePaint(paint));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: concat-58bKbWc, reason: not valid java name */
    public void mo573concat58bKbWc(float[] fArr) {
        if (MatrixKt.m994isIdentity58bKbWc(fArr)) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        AndroidMatrixConversions_androidKt.m589setFromEL8BTi8(matrix, fArr);
        this.internalCanvas.concat(matrix);
    }
}
