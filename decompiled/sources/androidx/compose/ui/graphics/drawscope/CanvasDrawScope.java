package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class CanvasDrawScope implements DrawScope {
    public static final int $stable = 0;
    private Paint fillPaint;
    private Paint strokePaint;
    private final DrawParams drawParams = new DrawParams(null, null, null, 0, 15, null);
    private final DrawContext drawContext = new DrawContext() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1
        private GraphicsLayer graphicsLayer;
        private final DrawTransform transform = CanvasDrawScopeKt.asDrawTransform(this);

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public GraphicsLayer getGraphicsLayer() {
            return this.graphicsLayer;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public DrawTransform getTransform() {
            return this.transform;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setGraphicsLayer(GraphicsLayer graphicsLayer) {
            this.graphicsLayer = graphicsLayer;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public Canvas getCanvas() {
            return this.this$0.getDrawParams().getCanvas();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public Density getDensity() {
            return this.this$0.getDrawParams().getDensity();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public LayoutDirection getLayoutDirection() {
            return this.this$0.getDrawParams().getLayoutDirection();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public long mo1225getSizeNHjbRc() {
            return this.this$0.getDrawParams().m1223getSizeNHjbRc();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setCanvas(Canvas canvas) {
            this.this$0.getDrawParams().setCanvas(canvas);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setDensity(Density density) {
            this.this$0.getDrawParams().setDensity(density);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setLayoutDirection(LayoutDirection layoutDirection) {
            this.this$0.getDrawParams().setLayoutDirection(layoutDirection);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* JADX INFO: renamed from: setSize-uvyYCjk, reason: not valid java name */
        public void mo1226setSizeuvyYCjk(long j) {
            this.this$0.getDrawParams().m1224setSizeuvyYCjk(j);
        }
    };

    public static final class DrawParams {
        public static final int $stable = 8;
        private Canvas canvas;
        private Density density;
        private LayoutDirection layoutDirection;
        private long size;

        public final Density component1() {
            return this.density;
        }

        public final LayoutDirection component2() {
            return this.layoutDirection;
        }

        public final Canvas component3() {
            return this.canvas;
        }

        /* JADX INFO: renamed from: component4-NH-jbRc, reason: not valid java name */
        public final long m1221component4NHjbRc() {
            return this.size;
        }

        public final Canvas getCanvas() {
            return this.canvas;
        }

        public final Density getDensity() {
            return this.density;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long m1223getSizeNHjbRc() {
            return this.size;
        }

        public final void setCanvas(Canvas canvas) {
            this.canvas = canvas;
        }

        public final void setDensity(Density density) {
            this.density = density;
        }

        public final void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        /* JADX INFO: renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void m1224setSizeuvyYCjk(long j) {
            this.size = j;
        }

        public int hashCode() {
            int iHashCode = this.density.hashCode();
            int iHashCode2 = this.layoutDirection.hashCode();
            return Size.m547hashCodeimpl(this.size) + ((this.canvas.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
        }

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? DrawContextKt.getDefaultDensity() : density, (i & 2) != 0 ? LayoutDirection.Ltr : layoutDirection, (i & 4) != 0 ? EmptyCanvas.INSTANCE : canvas, (i & 8) != 0 ? Size.Companion.m555getZeroNHjbRc() : j, null);
        }

        /* JADX INFO: renamed from: copy-Ug5Nnss$default, reason: not valid java name */
        public static /* synthetic */ DrawParams m1220copyUg5Nnss$default(DrawParams drawParams, Density density, LayoutDirection layoutDirection, Canvas canvas, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                density = drawParams.density;
            }
            if ((i & 2) != 0) {
                layoutDirection = drawParams.layoutDirection;
            }
            LayoutDirection layoutDirection2 = layoutDirection;
            if ((i & 4) != 0) {
                canvas = drawParams.canvas;
            }
            Canvas canvas2 = canvas;
            if ((i & 8) != 0) {
                j = drawParams.size;
            }
            return drawParams.m1222copyUg5Nnss(density, layoutDirection2, canvas2, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.density, drawParams.density}, getCieXyz.write())).booleanValue() || this.layoutDirection != drawParams.layoutDirection) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.canvas, drawParams.canvas}, getCieXyz.write())).booleanValue() && Size.m542equalsimpl0(this.size, drawParams.size);
        }

        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((Object) Size.m550toStringimpl(this.size)) + ')';
        }

        /* JADX INFO: renamed from: copy-Ug5Nnss, reason: not valid java name */
        public final DrawParams m1222copyUg5Nnss(Density density, LayoutDirection layoutDirection, Canvas canvas, long j) {
            return new DrawParams(density, layoutDirection, canvas, j, null);
        }

        private DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.canvas = canvas;
            this.size = j;
        }

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(density, layoutDirection, canvas, j);
        }
    }

    public static /* synthetic */ void getDrawParams$annotations() {
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public DrawContext getDrawContext() {
        return this.drawContext;
    }

    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    private final Paint selectPaint(DrawStyle drawStyle) {
        Object[] objArr = {drawStyle, Fill.INSTANCE};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return obtainFillPaint();
        }
        if (!(drawStyle instanceof Stroke)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        Paint paintObtainStrokePaint = obtainStrokePaint();
        Stroke stroke = (Stroke) drawStyle;
        if (paintObtainStrokePaint.getStrokeWidth() != stroke.getWidth()) {
            paintObtainStrokePaint.setStrokeWidth(stroke.getWidth());
        }
        if (!StrokeCap.m1095equalsimpl0(paintObtainStrokePaint.mo594getStrokeCapKaPHkGw(), stroke.m1373getCapKaPHkGw())) {
            paintObtainStrokePaint.mo600setStrokeCapBeK7IIE(stroke.m1373getCapKaPHkGw());
        }
        if (paintObtainStrokePaint.getStrokeMiterLimit() != stroke.getMiter()) {
            paintObtainStrokePaint.setStrokeMiterLimit(stroke.getMiter());
        }
        if (!StrokeJoin.m1105equalsimpl0(paintObtainStrokePaint.mo595getStrokeJoinLxFBmk8(), stroke.m1374getJoinLxFBmk8())) {
            paintObtainStrokePaint.mo601setStrokeJoinWw9F2mQ(stroke.m1374getJoinLxFBmk8());
        }
        Object[] objArr2 = {paintObtainStrokePaint.getPathEffect(), stroke.getPathEffect()};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            paintObtainStrokePaint.setPathEffect(stroke.getPathEffect());
        }
        return paintObtainStrokePaint;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-illE91I, reason: not valid java name */
    public void mo1201drawArcillE91I(Brush brush, float f, float f2, boolean z, long j, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Canvas canvas = this.drawParams.getCanvas();
        int i2 = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i2);
        int i3 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i3);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat5 = Float.intBitsToFloat(i3);
        canvas.drawArc(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3 + fIntBitsToFloat4, Float.intBitsToFloat((int) (j2 & 4294967295L)) + fIntBitsToFloat5, f, f2, z, m1194configurePaintswdJneE$default(this, brush, drawStyle, f3, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-yD3GUKo, reason: not valid java name */
    public void mo1202drawArcyD3GUKo(long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Canvas canvas = this.drawParams.getCanvas();
        int i2 = (int) (j2 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i2);
        int i3 = (int) (j2 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i3);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat5 = Float.intBitsToFloat(i3);
        canvas.drawArc(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat4 + fIntBitsToFloat3, Float.intBitsToFloat((int) (j3 & 4294967295L)) + fIntBitsToFloat5, f, f2, z, m1192configurePaint2qPWKa0$default(this, j, drawStyle, f3, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-V9BoPsw, reason: not valid java name */
    public void mo1203drawCircleV9BoPsw(Brush brush, float f, long j, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.drawParams.getCanvas().mo574drawCircle9KIMszo(j, f, m1194configurePaintswdJneE$default(this, brush, drawStyle, f2, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-VaOC9Bg, reason: not valid java name */
    public void mo1204drawCircleVaOC9Bg(long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.drawParams.getCanvas().mo574drawCircle9KIMszo(j2, f, m1192configurePaint2qPWKa0$default(this, j, drawStyle, f2, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @onItemDismisslambda0
    /* JADX INFO: renamed from: drawImage-9jGpkUE, reason: not valid java name */
    public /* synthetic */ void mo1205drawImage9jGpkUE(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.drawParams.getCanvas().mo576drawImageRectHPBpro0(imageBitmap, j, j2, j3, j4, m1194configurePaintswdJneE$default(this, null, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-AZ2fEMs, reason: not valid java name */
    public void mo1206drawImageAZ2fEMs(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
        this.drawParams.getCanvas().mo576drawImageRectHPBpro0(imageBitmap, j, j2, j3, j4, m1193configurePaintswdJneE(null, drawStyle, f, colorFilter, i, i2));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-gbVJVH8, reason: not valid java name */
    public void mo1207drawImagegbVJVH8(ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.drawParams.getCanvas().mo575drawImaged4ec7I(imageBitmap, j, m1194configurePaintswdJneE$default(this, null, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-1RTmtNc, reason: not valid java name */
    public void mo1208drawLine1RTmtNc(Brush brush, long j, long j2, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().mo577drawLineWko1d7g(j, j2, m1198configureStrokePaintho4zsrM$default(this, brush, f, 4.0f, i, StrokeJoin.Companion.m1110getMiterLxFBmk8(), pathEffect, f2, colorFilter, i2, 0, Fields.RotationY, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-NGM6Ib0, reason: not valid java name */
    public void mo1209drawLineNGM6Ib0(long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2) {
        this.drawParams.getCanvas().mo577drawLineWko1d7g(j2, j3, m1196configureStrokePaintQ_0CZUI$default(this, j, f, 4.0f, i, StrokeJoin.Companion.m1110getMiterLxFBmk8(), pathEffect, f2, colorFilter, i2, 0, Fields.RotationY, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-AsUm42w, reason: not valid java name */
    public void mo1210drawOvalAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Canvas canvas = this.drawParams.getCanvas();
        int i2 = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i2);
        int i3 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i3);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat5 = Float.intBitsToFloat(i3);
        canvas.drawOval(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat4 + fIntBitsToFloat3, Float.intBitsToFloat((int) (j2 & 4294967295L)) + fIntBitsToFloat5, m1194configurePaintswdJneE$default(this, brush, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-n-J9OG0, reason: not valid java name */
    public void mo1211drawOvalnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Canvas canvas = this.drawParams.getCanvas();
        int i2 = (int) (j2 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i2);
        int i3 = (int) (j2 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i3);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat5 = Float.intBitsToFloat(i3);
        canvas.drawOval(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat4 + fIntBitsToFloat3, Float.intBitsToFloat((int) (j3 & 4294967295L)) + fIntBitsToFloat5, m1192configurePaint2qPWKa0$default(this, j, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-GBMwjPU, reason: not valid java name */
    public void mo1212drawPathGBMwjPU(Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.drawParams.getCanvas().drawPath(path, m1194configurePaintswdJneE$default(this, brush, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-LG529CI, reason: not valid java name */
    public void mo1213drawPathLG529CI(Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.drawParams.getCanvas().drawPath(path, m1192configurePaint2qPWKa0$default(this, j, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-F8ZwMP8, reason: not valid java name */
    public void mo1214drawPointsF8ZwMP8(List<Offset> list, int i, long j, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3) {
        this.drawParams.getCanvas().mo578drawPointsO7TthRY(i, list, m1196configureStrokePaintQ_0CZUI$default(this, j, f, 4.0f, i2, StrokeJoin.Companion.m1110getMiterLxFBmk8(), pathEffect, f2, colorFilter, i3, 0, Fields.RotationY, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-Gsft0Ws, reason: not valid java name */
    public void mo1215drawPointsGsft0Ws(List<Offset> list, int i, Brush brush, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3) {
        this.drawParams.getCanvas().mo578drawPointsO7TthRY(i, list, m1198configureStrokePaintho4zsrM$default(this, brush, f, 4.0f, i2, StrokeJoin.Companion.m1110getMiterLxFBmk8(), pathEffect, f2, colorFilter, i3, 0, Fields.RotationY, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-AsUm42w, reason: not valid java name */
    public void mo1216drawRectAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Canvas canvas = this.drawParams.getCanvas();
        int i2 = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i2);
        int i3 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i3);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat5 = Float.intBitsToFloat(i3);
        canvas.drawRect(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat4 + fIntBitsToFloat3, Float.intBitsToFloat((int) (j2 & 4294967295L)) + fIntBitsToFloat5, m1194configurePaintswdJneE$default(this, brush, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-n-J9OG0, reason: not valid java name */
    public void mo1217drawRectnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Canvas canvas = this.drawParams.getCanvas();
        int i2 = (int) (j2 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i2);
        int i3 = (int) (j2 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i3);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat5 = Float.intBitsToFloat(i3);
        canvas.drawRect(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat4 + fIntBitsToFloat3, Float.intBitsToFloat((int) (j3 & 4294967295L)) + fIntBitsToFloat5, m1192configurePaint2qPWKa0$default(this, j, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-ZuiqVtQ, reason: not valid java name */
    public void mo1218drawRoundRectZuiqVtQ(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Canvas canvas = this.drawParams.getCanvas();
        int i2 = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i2);
        int i3 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i3);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat5 = Float.intBitsToFloat(i3);
        canvas.drawRoundRect(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat4 + fIntBitsToFloat3, Float.intBitsToFloat((int) (j2 & 4294967295L)) + fIntBitsToFloat5, Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), m1194configurePaintswdJneE$default(this, brush, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-u-Aw5IA, reason: not valid java name */
    public void mo1219drawRoundRectuAw5IA(long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i) {
        Canvas canvas = this.drawParams.getCanvas();
        int i2 = (int) (j2 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i2);
        int i3 = (int) (j2 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i3);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat5 = Float.intBitsToFloat(i3);
        canvas.drawRoundRect(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat4 + fIntBitsToFloat3, Float.intBitsToFloat((int) (j3 & 4294967295L)) + fIntBitsToFloat5, Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), m1192configurePaint2qPWKa0$default(this, j, drawStyle, f, colorFilter, i, 0, 32, null));
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.drawParams.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.drawParams.getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public LayoutDirection getLayoutDirection() {
        return this.drawParams.getLayoutDirection();
    }

    /* JADX INFO: renamed from: configurePaint-2qPWKa0, reason: not valid java name */
    private final Paint m1191configurePaint2qPWKa0(long j, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2) {
        Paint paintSelectPaint = selectPaint(drawStyle);
        long jM1199modulate5vOe2sY = m1199modulate5vOe2sY(j, f);
        if (!Color.m723equalsimpl0(paintSelectPaint.mo592getColor0d7_KjU(), jM1199modulate5vOe2sY)) {
            paintSelectPaint.mo598setColor8_81llA(jM1199modulate5vOe2sY);
        }
        if (paintSelectPaint.getShader() != null) {
            paintSelectPaint.setShader(null);
        }
        Object[] objArr = {paintSelectPaint.getColorFilter(), colorFilter};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            paintSelectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m631equalsimpl0(paintSelectPaint.mo591getBlendMode0nO6VwU(), i)) {
            paintSelectPaint.mo597setBlendModes9anfk8(i);
        }
        if (!FilterQuality.m820equalsimpl0(paintSelectPaint.mo593getFilterQualityfv9h1I(), i2)) {
            paintSelectPaint.mo599setFilterQualityvDHp3xo(i2);
        }
        return paintSelectPaint;
    }

    /* JADX INFO: renamed from: configurePaint-2qPWKa0$default, reason: not valid java name */
    public static /* synthetic */ Paint m1192configurePaint2qPWKa0$default(CanvasDrawScope canvasDrawScope, long j, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        return canvasDrawScope.m1191configurePaint2qPWKa0(j, drawStyle, f, colorFilter, i, (i3 & 32) != 0 ? DrawScope.Companion.m1307getDefaultFilterQualityfv9h1I() : i2);
    }

    /* JADX INFO: renamed from: configurePaint-swdJneE$default, reason: not valid java name */
    public static /* synthetic */ Paint m1194configurePaintswdJneE$default(CanvasDrawScope canvasDrawScope, Brush brush, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i2 = DrawScope.Companion.m1307getDefaultFilterQualityfv9h1I();
        }
        return canvasDrawScope.m1193configurePaintswdJneE(brush, drawStyle, f, colorFilter, i, i2);
    }

    /* JADX INFO: renamed from: configureStrokePaint-Q_0CZUI, reason: not valid java name */
    private final Paint m1195configureStrokePaintQ_0CZUI(long j, float f, float f2, int i, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4) {
        Paint paintObtainStrokePaint = obtainStrokePaint();
        long jM1199modulate5vOe2sY = m1199modulate5vOe2sY(j, f3);
        if (!Color.m723equalsimpl0(paintObtainStrokePaint.mo592getColor0d7_KjU(), jM1199modulate5vOe2sY)) {
            paintObtainStrokePaint.mo598setColor8_81llA(jM1199modulate5vOe2sY);
        }
        if (paintObtainStrokePaint.getShader() != null) {
            paintObtainStrokePaint.setShader(null);
        }
        Object[] objArr = {paintObtainStrokePaint.getColorFilter(), colorFilter};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            paintObtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m631equalsimpl0(paintObtainStrokePaint.mo591getBlendMode0nO6VwU(), i3)) {
            paintObtainStrokePaint.mo597setBlendModes9anfk8(i3);
        }
        if (paintObtainStrokePaint.getStrokeWidth() != f) {
            paintObtainStrokePaint.setStrokeWidth(f);
        }
        if (paintObtainStrokePaint.getStrokeMiterLimit() != f2) {
            paintObtainStrokePaint.setStrokeMiterLimit(f2);
        }
        if (!StrokeCap.m1095equalsimpl0(paintObtainStrokePaint.mo594getStrokeCapKaPHkGw(), i)) {
            paintObtainStrokePaint.mo600setStrokeCapBeK7IIE(i);
        }
        if (!StrokeJoin.m1105equalsimpl0(paintObtainStrokePaint.mo595getStrokeJoinLxFBmk8(), i2)) {
            paintObtainStrokePaint.mo601setStrokeJoinWw9F2mQ(i2);
        }
        Object[] objArr2 = {paintObtainStrokePaint.getPathEffect(), pathEffect};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            paintObtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m820equalsimpl0(paintObtainStrokePaint.mo593getFilterQualityfv9h1I(), i4)) {
            paintObtainStrokePaint.mo599setFilterQualityvDHp3xo(i4);
        }
        return paintObtainStrokePaint;
    }

    private final Paint obtainFillPaint() {
        Paint paint = this.fillPaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo602setStylek9PVt8s(PaintingStyle.Companion.m1006getFillTiuSbCo());
        this.fillPaint = Paint;
        return Paint;
    }

    private final Paint obtainStrokePaint() {
        Paint paint = this.strokePaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo602setStylek9PVt8s(PaintingStyle.Companion.m1007getStrokeTiuSbCo());
        this.strokePaint = Paint;
        return Paint;
    }

    /* JADX INFO: renamed from: draw-yzxVdVo, reason: not valid java name */
    public final void m1200drawyzxVdVo(Density density, LayoutDirection layoutDirection, Canvas canvas, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        DrawParams drawParams = getDrawParams();
        Density densityComponent1 = drawParams.component1();
        LayoutDirection layoutDirectionComponent2 = drawParams.component2();
        Canvas canvasComponent3 = drawParams.component3();
        long jM1221component4NHjbRc = drawParams.m1221component4NHjbRc();
        DrawParams drawParams2 = getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m1224setSizeuvyYCjk(j);
        canvas.save();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this);
        canvas.restore();
        DrawParams drawParams3 = getDrawParams();
        drawParams3.setDensity(densityComponent1);
        drawParams3.setLayoutDirection(layoutDirectionComponent2);
        drawParams3.setCanvas(canvasComponent3);
        drawParams3.m1224setSizeuvyYCjk(jM1221component4NHjbRc);
    }

    /* JADX INFO: renamed from: configurePaint-swdJneE, reason: not valid java name */
    private final Paint m1193configurePaintswdJneE(Brush brush, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2) {
        Paint paintSelectPaint = selectPaint(drawStyle);
        if (brush != null) {
            brush.mo667applyToPq9zytI(mo1304getSizeNHjbRc(), paintSelectPaint, f);
        } else {
            if (paintSelectPaint.getShader() != null) {
                paintSelectPaint.setShader(null);
            }
            long jMo592getColor0d7_KjU = paintSelectPaint.mo592getColor0d7_KjU();
            Color.Companion companion = Color.Companion;
            if (!Color.m723equalsimpl0(jMo592getColor0d7_KjU, companion.m748getBlack0d7_KjU())) {
                paintSelectPaint.mo598setColor8_81llA(companion.m748getBlack0d7_KjU());
            }
            if (paintSelectPaint.getAlpha() != f) {
                paintSelectPaint.setAlpha(f);
            }
        }
        Object[] objArr = {paintSelectPaint.getColorFilter(), colorFilter};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            paintSelectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m631equalsimpl0(paintSelectPaint.mo591getBlendMode0nO6VwU(), i)) {
            paintSelectPaint.mo597setBlendModes9anfk8(i);
        }
        if (!FilterQuality.m820equalsimpl0(paintSelectPaint.mo593getFilterQualityfv9h1I(), i2)) {
            paintSelectPaint.mo599setFilterQualityvDHp3xo(i2);
        }
        return paintSelectPaint;
    }

    /* JADX INFO: renamed from: configureStrokePaint-Q_0CZUI$default, reason: not valid java name */
    public static /* synthetic */ Paint m1196configureStrokePaintQ_0CZUI$default(CanvasDrawScope canvasDrawScope, long j, float f, float f2, int i, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4, int i5, Object obj) {
        return canvasDrawScope.m1195configureStrokePaintQ_0CZUI(j, f, f2, i, i2, pathEffect, f3, colorFilter, i3, (i5 & Fields.RotationY) != 0 ? DrawScope.Companion.m1307getDefaultFilterQualityfv9h1I() : i4);
    }

    /* JADX INFO: renamed from: configureStrokePaint-ho4zsrM, reason: not valid java name */
    private final Paint m1197configureStrokePaintho4zsrM(Brush brush, float f, float f2, int i, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4) {
        Paint paintObtainStrokePaint = obtainStrokePaint();
        if (brush != null) {
            brush.mo667applyToPq9zytI(mo1304getSizeNHjbRc(), paintObtainStrokePaint, f3);
        } else if (paintObtainStrokePaint.getAlpha() != f3) {
            paintObtainStrokePaint.setAlpha(f3);
        }
        Object[] objArr = {paintObtainStrokePaint.getColorFilter(), colorFilter};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            paintObtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m631equalsimpl0(paintObtainStrokePaint.mo591getBlendMode0nO6VwU(), i3)) {
            paintObtainStrokePaint.mo597setBlendModes9anfk8(i3);
        }
        if (paintObtainStrokePaint.getStrokeWidth() != f) {
            paintObtainStrokePaint.setStrokeWidth(f);
        }
        if (paintObtainStrokePaint.getStrokeMiterLimit() != f2) {
            paintObtainStrokePaint.setStrokeMiterLimit(f2);
        }
        if (!StrokeCap.m1095equalsimpl0(paintObtainStrokePaint.mo594getStrokeCapKaPHkGw(), i)) {
            paintObtainStrokePaint.mo600setStrokeCapBeK7IIE(i);
        }
        if (!StrokeJoin.m1105equalsimpl0(paintObtainStrokePaint.mo595getStrokeJoinLxFBmk8(), i2)) {
            paintObtainStrokePaint.mo601setStrokeJoinWw9F2mQ(i2);
        }
        Object[] objArr2 = {paintObtainStrokePaint.getPathEffect(), pathEffect};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            paintObtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m820equalsimpl0(paintObtainStrokePaint.mo593getFilterQualityfv9h1I(), i4)) {
            paintObtainStrokePaint.mo599setFilterQualityvDHp3xo(i4);
        }
        return paintObtainStrokePaint;
    }

    /* JADX INFO: renamed from: configureStrokePaint-ho4zsrM$default, reason: not valid java name */
    public static /* synthetic */ Paint m1198configureStrokePaintho4zsrM$default(CanvasDrawScope canvasDrawScope, Brush brush, float f, float f2, int i, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4, int i5, Object obj) {
        return canvasDrawScope.m1197configureStrokePaintho4zsrM(brush, f, f2, i, i2, pathEffect, f3, colorFilter, i3, (i5 & Fields.RotationY) != 0 ? DrawScope.Companion.m1307getDefaultFilterQualityfv9h1I() : i4);
    }

    /* JADX INFO: renamed from: modulate-5vOe2sY, reason: not valid java name */
    private final long m1199modulate5vOe2sY(long j, float f) {
        return f == 1.0f ? j : Color.m721copywmQWz5c$default(j, Color.m724getAlphaimpl(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }
}
