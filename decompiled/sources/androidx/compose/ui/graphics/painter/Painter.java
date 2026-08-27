package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import o.createFromParcel;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public abstract class Painter {
    public static final int $stable = 8;
    private ColorFilter colorFilter;
    private Paint layerPaint;
    private boolean useLayer;
    private float alpha = 1.0f;
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM drawLambda = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.graphics.painter.Painter$drawLambda$1
        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((DrawScope) obj);
            return createFromParcel.INSTANCE;
        }

        {
            super(1);
        }

        public final void invoke(DrawScope drawScope) {
            this.this$0.onDraw(drawScope);
        }
    };

    public boolean applyAlpha(float f) {
        return false;
    }

    public boolean applyColorFilter(ColorFilter colorFilter) {
        return false;
    }

    public boolean applyLayoutDirection(LayoutDirection layoutDirection) {
        return false;
    }

    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo1424getIntrinsicSizeNHjbRc();

    public abstract void onDraw(DrawScope drawScope);

    private final void configureColorFilter(ColorFilter colorFilter) {
        Object[] objArr = {this.colorFilter, colorFilter};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        if (!applyColorFilter(colorFilter)) {
            if (colorFilter == null) {
                Paint paint = this.layerPaint;
                if (paint != null) {
                    paint.setColorFilter(null);
                }
                this.useLayer = false;
            } else {
                obtainPaint().setColorFilter(colorFilter);
                this.useLayer = true;
            }
        }
        this.colorFilter = colorFilter;
    }

    /* JADX INFO: renamed from: draw-x_KDEd0, reason: not valid java name */
    public final void m1430drawx_KDEd0(DrawScope drawScope, long j, float f, ColorFilter colorFilter) {
        configureAlpha(f);
        configureColorFilter(colorFilter);
        configureLayoutDirection(drawScope.getLayoutDirection());
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() & 4294967295L)) - Float.intBitsToFloat(i2);
        drawScope.getDrawContext().getTransform().inset(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.useLayer) {
                        long jM493getZeroF1C5BW0 = Offset.Companion.m493getZeroF1C5BW0();
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        Rect rectM517Recttz77jQw = RectKt.m517Recttz77jQw(jM493getZeroF1C5BW0, Size.m537constructorimpl((4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2)))) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32)));
                        Canvas canvas = drawScope.getDrawContext().getCanvas();
                        try {
                            canvas.saveLayer(rectM517Recttz77jQw, obtainPaint());
                            onDraw(drawScope);
                            canvas.restore();
                        } catch (Throwable th) {
                            canvas.restore();
                            throw th;
                        }
                    } else {
                        onDraw(drawScope);
                    }
                }
            } catch (Throwable th2) {
                drawScope.getDrawContext().getTransform().inset(0.0f, 0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        drawScope.getDrawContext().getTransform().inset(0.0f, 0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    private final void configureLayoutDirection(LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            applyLayoutDirection(layoutDirection);
            this.layoutDirection = layoutDirection;
        }
    }

    private final Paint obtainPaint() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        this.layerPaint = Paint;
        return Paint;
    }

    private final void configureAlpha(float f) {
        if (this.alpha == f) {
            return;
        }
        if (!applyAlpha(f)) {
            if (f == 1.0f) {
                Paint paint = this.layerPaint;
                if (paint != null) {
                    paint.setAlpha(f);
                }
                this.useLayer = false;
            } else {
                obtainPaint().setAlpha(f);
                this.useLayer = true;
            }
        }
        this.alpha = f;
    }

    /* JADX INFO: renamed from: draw-x_KDEd0$default, reason: not valid java name */
    public static /* synthetic */ void m1429drawx_KDEd0$default(Painter painter, DrawScope drawScope, long j, float f, ColorFilter colorFilter, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f = 1.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                colorFilter = null;
            }
            painter.m1430drawx_KDEd0(drawScope, j, f2, colorFilter);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
    }
}
