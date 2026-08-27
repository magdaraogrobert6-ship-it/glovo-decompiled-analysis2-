package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface Canvas {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: clipRect-mtrdD-E, reason: not valid java name */
        public static void m700clipRectmtrdDE(Canvas canvas, Rect rect, int i) {
            Canvas.super.m697clipRectmtrdDE(rect, i);
        }

        @Deprecated
        public static void drawArc(Canvas canvas, Rect rect, float f, float f2, boolean z, Paint paint) {
            Canvas.super.drawArc(rect, f, f2, z, paint);
        }

        @Deprecated
        public static void drawArcRad(Canvas canvas, Rect rect, float f, float f2, boolean z, Paint paint) {
            Canvas.super.drawArcRad(rect, f, f2, z, paint);
        }

        @Deprecated
        public static void drawOval(Canvas canvas, Rect rect, Paint paint) {
            Canvas.super.drawOval(rect, paint);
        }

        @Deprecated
        public static void drawRect(Canvas canvas, Rect rect, Paint paint) {
            Canvas.super.drawRect(rect, paint);
        }

        @Deprecated
        public static void skewRad(Canvas canvas, float f, float f2) {
            Canvas.super.skewRad(f, f2);
        }
    }

    /* JADX INFO: renamed from: clipPath-mtrdD-E */
    void mo571clipPathmtrdDE(Path path, int i);

    /* JADX INFO: renamed from: clipRect-N_I0leg */
    void mo572clipRectN_I0leg(float f, float f2, float f3, float f4, int i);

    /* JADX INFO: renamed from: concat-58bKbWc */
    void mo573concat58bKbWc(float[] fArr);

    void disableZ();

    void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint);

    /* JADX INFO: renamed from: drawCircle-9KIMszo */
    void mo574drawCircle9KIMszo(long j, float f, Paint paint);

    /* JADX INFO: renamed from: drawImage-d-4ec7I */
    void mo575drawImaged4ec7I(ImageBitmap imageBitmap, long j, Paint paint);

    /* JADX INFO: renamed from: drawImageRect-HPBpro0 */
    void mo576drawImageRectHPBpro0(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint);

    /* JADX INFO: renamed from: drawLine-Wko1d7g */
    void mo577drawLineWko1d7g(long j, long j2, Paint paint);

    void drawOval(float f, float f2, float f3, float f4, Paint paint);

    void drawPath(Path path, Paint paint);

    /* JADX INFO: renamed from: drawPoints-O7TthRY */
    void mo578drawPointsO7TthRY(int i, List<Offset> list, Paint paint);

    /* JADX INFO: renamed from: drawRawPoints-O7TthRY */
    void mo579drawRawPointsO7TthRY(int i, float[] fArr, Paint paint);

    void drawRect(float f, float f2, float f3, float f4, Paint paint);

    void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint);

    /* JADX INFO: renamed from: drawVertices-TPEHhCM */
    void mo580drawVerticesTPEHhCM(Vertices vertices, int i, Paint paint);

    void enableZ();

    void restore();

    void rotate(float f);

    void save();

    void saveLayer(Rect rect, Paint paint);

    void scale(float f, float f2);

    void skew(float f, float f2);

    void translate(float f, float f2);

    /* JADX INFO: renamed from: clipRect-mtrdD-E, reason: not valid java name */
    default void m697clipRectmtrdDE(Rect rect, int i) {
        mo572clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), i);
    }

    default void drawArc(Rect rect, float f, float f2, boolean z, Paint paint) {
        drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2, z, paint);
    }

    default void drawArcRad(Rect rect, float f, float f2, boolean z, Paint paint) {
        drawArc(rect, DegreesKt.degrees(f), DegreesKt.degrees(f2), z, paint);
    }

    default void drawOval(Rect rect, Paint paint) {
        drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    default void drawRect(Rect rect, Paint paint) {
        drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    default void skewRad(float f, float f2) {
        skew(DegreesKt.degrees(f), DegreesKt.degrees(f2));
    }

    /* JADX INFO: renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m693clipPathmtrdDE$default(Canvas canvas, Path path, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = ClipOp.Companion.m711getIntersectrtfAjoo();
            }
            canvas.mo571clipPathmtrdDE(path, i);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
    }

    /* JADX INFO: renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static /* synthetic */ void m694clipRectN_I0leg$default(Canvas canvas, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 16) != 0) {
                i = ClipOp.Companion.m711getIntersectrtfAjoo();
            }
            canvas.mo572clipRectN_I0leg(f, f2, f3, f4, i);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
    }

    /* JADX INFO: renamed from: clipRect-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m695clipRectmtrdDE$default(Canvas canvas, Rect rect, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = ClipOp.Companion.m711getIntersectrtfAjoo();
            }
            canvas.m697clipRectmtrdDE(rect, i);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
    }

    /* JADX INFO: renamed from: drawImageRect-HPBpro0$default, reason: not valid java name */
    static /* synthetic */ void m696drawImageRectHPBpro0$default(Canvas canvas, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint, int i, Object obj) {
        long jM3839constructorimpl;
        if (obj == null) {
            long jM3812getZeronOccac = (i & 2) != 0 ? IntOffset.Companion.m3812getZeronOccac() : j;
            if ((i & 4) != 0) {
                jM3839constructorimpl = IntSize.m3839constructorimpl((((long) imageBitmap.getHeight()) & 4294967295L) | (((long) imageBitmap.getWidth()) << 32));
            } else {
                jM3839constructorimpl = j2;
            }
            canvas.mo576drawImageRectHPBpro0(imageBitmap, jM3812getZeronOccac, jM3839constructorimpl, (i & 8) != 0 ? IntOffset.Companion.m3812getZeronOccac() : j3, (i & 16) != 0 ? jM3839constructorimpl : j4, paint);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
    }

    static /* synthetic */ void scale$default(Canvas canvas, float f, float f2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f2 = f;
            }
            canvas.scale(f, f2);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: scale");
    }
}
