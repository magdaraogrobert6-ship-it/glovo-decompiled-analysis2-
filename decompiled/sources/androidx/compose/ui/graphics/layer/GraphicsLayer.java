package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ShortNewsContentCardView;
import o.awaitLongPressOrCancellationrnUCldI;
import o.awaitTouchSlopOrCancellationjO51t88;
import o.createFromParcel;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.relocationOffsetfbGrOKE;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class GraphicsLayer {
    private static final LayerSnapshotImpl SnapshotImpl;
    private static final boolean isRobolectric;
    private Outline androidOutline;
    private final ChildLayerDependenciesTracker childDependenciesTracker;
    private boolean clip;
    private final GraphicsLayerImpl impl;
    private androidx.compose.ui.graphics.Outline internalOutline;
    private boolean isReleased;
    private Path outlinePath;
    private int parentLayerUsages;
    private RectF pathBounds;
    private long pivotOffset;
    private Path roundRectClipPath;
    private float roundRectCornerRadius;
    private long roundRectOutlineSize;
    private long roundRectOutlineTopLeft;
    private long size;
    private CanvasDrawScope softwareDrawScope;
    private Paint softwareLayerPaint;
    private long topLeft;
    private boolean usePathForClip;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private Density density = DrawContextKt.getDefaultDensity();
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM drawBlock = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$drawBlock$1
        public final void invoke(DrawScope drawScope) {
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((DrawScope) obj);
            return createFromParcel.INSTANCE;
        }
    };
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM clipDrawBlock = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$clipDrawBlock$1
        public final void invoke(DrawScope drawScope) {
            Path path = this.this$0.outlinePath;
            if (!this.this$0.usePathForClip || !this.this$0.getClip() || path == null) {
                this.this$0.drawWithChildTracking(drawScope);
                return;
            }
            GraphicsLayer graphicsLayer = this.this$0;
            int iM711getIntersectrtfAjoo = ClipOp.Companion.m711getIntersectrtfAjoo();
            DrawContext drawContext = drawScope.getDrawContext();
            long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo1227clipPathmtrdDE(path, iM711getIntersectrtfAjoo);
                graphicsLayer.drawWithChildTracking(drawScope);
            } finally {
                c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
            }
        }

        {
            super(1);
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((DrawScope) obj);
            return createFromParcel.INSTANCE;
        }
    };
    private boolean outlineDirty = true;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GraphicsLayer.this.toImageBitmap(this);
        }
    }

    public static /* synthetic */ void getClip$annotations() {
    }

    private final void resetOutlineParams() {
        this.internalOutline = null;
        this.outlinePath = null;
        this.roundRectOutlineSize = Size.Companion.m554getUnspecifiedNHjbRc();
        this.roundRectOutlineTopLeft = Offset.Companion.m493getZeroF1C5BW0();
        this.roundRectCornerRadius = 0.0f;
        this.outlineDirty = true;
        this.usePathForClip = false;
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final GraphicsLayerImpl getImpl$ui_graphics() {
        return this.impl;
    }

    /* JADX INFO: renamed from: getPivotOffset-F1C5BW0, reason: not valid java name */
    public final long m1394getPivotOffsetF1C5BW0() {
        return this.pivotOffset;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m1395getSizeYbymL2g() {
        return this.size;
    }

    /* JADX INFO: renamed from: getTopLeft-nOcc-ac, reason: not valid java name */
    public final long m1397getTopLeftnOccac() {
        return this.topLeft;
    }

    public final boolean isReleased() {
        return this.isReleased;
    }

    private final void addSubLayer(GraphicsLayer graphicsLayer) {
        if (this.childDependenciesTracker.onDependencyAdded(graphicsLayer)) {
            graphicsLayer.onAddedToParentLayer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008e A[LOOP:0: B:20:0x0057->B:30:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0091 A[EDGE_INSN: B:34:0x0091->B:31:0x0091 BREAK  A[LOOP:0: B:20:0x0057->B:30:0x008e], SYNTHETIC] */
    public final void drawWithChildTracking(DrawScope drawScope) {
        ChildLayerDependenciesTracker childLayerDependenciesTracker = this.childDependenciesTracker;
        childLayerDependenciesTracker.oldDependency = childLayerDependenciesTracker.dependency;
        relocationOffsetfbGrOKE relocationoffsetfbgroke = childLayerDependenciesTracker.dependenciesSet;
        if (relocationoffsetfbgroke != null && relocationoffsetfbgroke.read()) {
            relocationOffsetfbGrOKE relocationoffsetfbgroke2 = childLayerDependenciesTracker.oldDependenciesSet;
            if (relocationoffsetfbgroke2 == null) {
                relocationOffsetfbGrOKE relocationoffsetfbgroke3 = awaitLongPressOrCancellationrnUCldI.IconCompatParcelizer;
                relocationoffsetfbgroke2 = new relocationOffsetfbGrOKE();
                childLayerDependenciesTracker.oldDependenciesSet = relocationoffsetfbgroke2;
            }
            relocationoffsetfbgroke2.serializer((awaitTouchSlopOrCancellationjO51t88) relocationoffsetfbgroke);
            relocationoffsetfbgroke.serializer();
        }
        childLayerDependenciesTracker.trackingInProgress = true;
        this.drawBlock.invoke(drawScope);
        childLayerDependenciesTracker.trackingInProgress = false;
        GraphicsLayer graphicsLayer = childLayerDependenciesTracker.oldDependency;
        if (graphicsLayer != null) {
            graphicsLayer.onRemovedFromParentLayer();
        }
        relocationOffsetfbGrOKE relocationoffsetfbgroke4 = childLayerDependenciesTracker.oldDependenciesSet;
        if (relocationoffsetfbgroke4 == null || !relocationoffsetfbgroke4.read()) {
            return;
        }
        Object[] objArr = relocationoffsetfbgroke4.RemoteActionCompatParcelizer;
        long[] jArr = relocationoffsetfbgroke4.IconCompatParcelizer;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ((GraphicsLayer) objArr[(i << 3) + i3]).onRemovedFromParentLayer();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        relocationoffsetfbgroke4.serializer();
    }

    private final void recordInternal() {
        this.impl.record(this.density, this.layoutDirection, this, this.clipDrawBlock);
    }

    private final void recreateDisplayListIfNeeded() {
        if (this.impl.getHasDisplayList()) {
            return;
        }
        try {
            recordInternal();
        } catch (Throwable unused) {
        }
    }

    private final <T> T resolveOutlinePosition(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        long jM3856toSizeozmzZPI = IntSizeKt.m3856toSizeozmzZPI(this.size);
        long j = this.roundRectOutlineTopLeft;
        long j2 = this.roundRectOutlineSize;
        if (j2 != InlineClassHelperKt.UnspecifiedPackedFloats) {
            jM3856toSizeozmzZPI = j2;
        }
        return (T) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(Offset.m466boximpl(j), Size.m534boximpl(jM3856toSizeozmzZPI));
    }

    /* JADX INFO: renamed from: setPosition-VbeCjmY, reason: not valid java name */
    private final void m1387setPositionVbeCjmY(long j, long j2) {
        this.impl.mo1417setPositionH0pRuoY(IntOffset.m3801getXimpl(j), IntOffset.m3802getYimpl(j), j2);
    }

    /* JADX INFO: renamed from: setSize-ozmzZPI, reason: not valid java name */
    private final void m1390setSizeozmzZPI(long j) {
        if (IntSize.m3842equalsimpl0(this.size, j)) {
            return;
        }
        this.size = j;
        m1387setPositionVbeCjmY(this.topLeft, j);
        if (this.roundRectOutlineSize == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.outlineDirty = true;
            configureOutlineAndClip();
        }
    }

    private final void transformCanvas(Canvas canvas) {
        float fM3801getXimpl = IntOffset.m3801getXimpl(this.topLeft);
        float fM3802getYimpl = IntOffset.m3802getYimpl(this.topLeft);
        float fM3801getXimpl2 = IntOffset.m3801getXimpl(this.topLeft);
        float f = (int) (this.size >> 32);
        float fM3802getYimpl2 = IntOffset.m3802getYimpl(this.topLeft);
        float f2 = (int) (this.size & 4294967295L);
        float alpha = getAlpha();
        ColorFilter colorFilter = getColorFilter();
        int iM1392getBlendMode0nO6VwU = m1392getBlendMode0nO6VwU();
        if (alpha < 1.0f || !BlendMode.m631equalsimpl0(iM1392getBlendMode0nO6VwU, BlendMode.Companion.m662getSrcOver0nO6VwU()) || colorFilter != null || CompositingStrategy.m1380equalsimpl0(m1393getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m1386getOffscreenke2Ky5w())) {
            Paint Paint = this.softwareLayerPaint;
            if (Paint == null) {
                Paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = Paint;
            }
            Paint.setAlpha(alpha);
            Paint.mo597setBlendModes9anfk8(iM1392getBlendMode0nO6VwU);
            Paint.setColorFilter(colorFilter);
            canvas.saveLayer(fM3801getXimpl, fM3802getYimpl, fM3801getXimpl2 + f, fM3802getYimpl2 + f2, AndroidPaint_androidKt.getNativePaint(Paint));
        } else {
            canvas.save();
        }
        canvas.translate(fM3801getXimpl, fM3802getYimpl);
        canvas.concat(this.impl.calculateMatrix());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[LOOP:0: B:10:0x0020->B:20:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x005a A[EDGE_INSN: B:25:0x005a->B:21:0x005a BREAK  A[LOOP:0: B:10:0x0020->B:20:0x0057], SYNTHETIC] */
    public final void discardDisplayList$ui_graphics() {
        ChildLayerDependenciesTracker childLayerDependenciesTracker = this.childDependenciesTracker;
        GraphicsLayer graphicsLayer = childLayerDependenciesTracker.dependency;
        if (graphicsLayer != null) {
            graphicsLayer.onRemovedFromParentLayer();
            childLayerDependenciesTracker.dependency = null;
        }
        relocationOffsetfbGrOKE relocationoffsetfbgroke = childLayerDependenciesTracker.dependenciesSet;
        if (relocationoffsetfbgroke != null) {
            Object[] objArr = relocationoffsetfbgroke.RemoteActionCompatParcelizer;
            long[] jArr = relocationoffsetfbgroke.IconCompatParcelizer;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ((GraphicsLayer) objArr[(i << 3) + i3]).onRemovedFromParentLayer();
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            relocationoffsetfbgroke.serializer();
        }
        this.impl.discardDisplayList();
    }

    public final void emulateTrimMemory$ui_graphics() {
        this.impl.discardDisplayList();
    }

    public final float getAlpha() {
        return this.impl.getAlpha();
    }

    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m1391getAmbientShadowColor0d7_KjU() {
        return this.impl.mo1407getAmbientShadowColor0d7_KjU();
    }

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m1392getBlendMode0nO6VwU() {
        return this.impl.mo1408getBlendMode0nO6VwU();
    }

    public final float getCameraDistance() {
        return this.impl.getCameraDistance();
    }

    public final ColorFilter getColorFilter() {
        return this.impl.getColorFilter();
    }

    /* JADX INFO: renamed from: getCompositingStrategy-ke2Ky5w, reason: not valid java name */
    public final int m1393getCompositingStrategyke2Ky5w() {
        return this.impl.mo1409getCompositingStrategyke2Ky5w();
    }

    public final long getLayerId() {
        return this.impl.getLayerId();
    }

    public final androidx.compose.ui.graphics.Outline getOutline() {
        androidx.compose.ui.graphics.Outline rectangle;
        androidx.compose.ui.graphics.Outline outline = this.internalOutline;
        Path path = this.outlinePath;
        if (outline != null) {
            return outline;
        }
        if (path != null) {
            androidx.compose.ui.graphics.Outline.Generic generic = new androidx.compose.ui.graphics.Outline.Generic(path);
            this.internalOutline = generic;
            return generic;
        }
        long jM3856toSizeozmzZPI = IntSizeKt.m3856toSizeozmzZPI(this.size);
        long j = this.roundRectOutlineTopLeft;
        long j2 = this.roundRectOutlineSize;
        if (j2 != InlineClassHelperKt.UnspecifiedPackedFloats) {
            jM3856toSizeozmzZPI = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM3856toSizeozmzZPI >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jM3856toSizeozmzZPI & 4294967295L)) + fIntBitsToFloat2;
        float f = this.roundRectCornerRadius;
        if (f > 0.0f) {
            rectangle = new androidx.compose.ui.graphics.Outline.Rounded(RoundRectKt.m531RoundRectgG7oq9Y(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32))));
        } else {
            rectangle = new androidx.compose.ui.graphics.Outline.Rectangle(new Rect(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.internalOutline = rectangle;
        return rectangle;
    }

    public final long getOwnerViewId() {
        return this.impl.getOwnerId();
    }

    public final RenderEffect getRenderEffect() {
        return this.impl.getRenderEffect();
    }

    public final float getRotationX() {
        return this.impl.getRotationX();
    }

    public final float getRotationY() {
        return this.impl.getRotationY();
    }

    public final float getRotationZ() {
        return this.impl.getRotationZ();
    }

    public final float getScaleX() {
        return this.impl.getScaleX();
    }

    public final float getScaleY() {
        return this.impl.getScaleY();
    }

    public final float getShadowElevation() {
        return this.impl.getShadowElevation();
    }

    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m1396getSpotShadowColor0d7_KjU() {
        return this.impl.mo1411getSpotShadowColor0d7_KjU();
    }

    public final float getTranslationX() {
        return this.impl.getTranslationX();
    }

    public final float getTranslationY() {
        return this.impl.getTranslationY();
    }

    public final void setAlpha(float f) {
        if (this.impl.getAlpha() == f) {
            return;
        }
        this.impl.setAlpha(f);
    }

    /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    public final void m1399setAmbientShadowColor8_81llA(long j) {
        if (Color.m723equalsimpl0(j, this.impl.mo1407getAmbientShadowColor0d7_KjU())) {
            return;
        }
        this.impl.mo1412setAmbientShadowColor8_81llA(j);
    }

    /* JADX INFO: renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m1400setBlendModes9anfk8(int i) {
        if (BlendMode.m631equalsimpl0(this.impl.mo1408getBlendMode0nO6VwU(), i)) {
            return;
        }
        this.impl.mo1413setBlendModes9anfk8(i);
    }

    public final void setCameraDistance(float f) {
        if (this.impl.getCameraDistance() == f) {
            return;
        }
        this.impl.setCameraDistance(f);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Object[] objArr = {this.impl.getColorFilter(), colorFilter};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.impl.setColorFilter(colorFilter);
    }

    /* JADX INFO: renamed from: setCompositingStrategy-Wpw9cng, reason: not valid java name */
    public final void m1401setCompositingStrategyWpw9cng(int i) {
        if (CompositingStrategy.m1380equalsimpl0(this.impl.mo1409getCompositingStrategyke2Ky5w(), i)) {
            return;
        }
        this.impl.mo1414setCompositingStrategyWpw9cng(i);
    }

    /* JADX INFO: renamed from: setPivotOffset-k-4lQ0M, reason: not valid java name */
    public final void m1402setPivotOffsetk4lQ0M(long j) {
        if (Offset.m474equalsimpl0(this.pivotOffset, j)) {
            return;
        }
        this.pivotOffset = j;
        this.impl.mo1416setPivotOffsetk4lQ0M(j);
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        Object[] objArr = {this.impl.getRenderEffect(), renderEffect};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.impl.setRenderEffect(renderEffect);
    }

    public final void setRotationX(float f) {
        if (this.impl.getRotationX() == f) {
            return;
        }
        this.impl.setRotationX(f);
    }

    public final void setRotationY(float f) {
        if (this.impl.getRotationY() == f) {
            return;
        }
        this.impl.setRotationY(f);
    }

    public final void setRotationZ(float f) {
        if (this.impl.getRotationZ() == f) {
            return;
        }
        this.impl.setRotationZ(f);
    }

    /* JADX INFO: renamed from: setRoundRectOutline-TNW_H78, reason: not valid java name */
    public final void m1404setRoundRectOutlineTNW_H78(long j, long j2, float f) {
        if (Offset.m474equalsimpl0(this.roundRectOutlineTopLeft, j) && Size.m542equalsimpl0(this.roundRectOutlineSize, j2) && this.roundRectCornerRadius == f && this.outlinePath == null) {
            return;
        }
        resetOutlineParams();
        this.roundRectOutlineTopLeft = j;
        this.roundRectOutlineSize = j2;
        this.roundRectCornerRadius = f;
        configureOutlineAndClip();
    }

    public final void setScaleX(float f) {
        if (this.impl.getScaleX() == f) {
            return;
        }
        this.impl.setScaleX(f);
    }

    public final void setScaleY(float f) {
        if (this.impl.getScaleY() == f) {
            return;
        }
        this.impl.setScaleY(f);
    }

    public final void setShadowElevation(float f) {
        if (this.impl.getShadowElevation() == f) {
            return;
        }
        this.impl.setShadowElevation(f);
        this.outlineDirty = true;
        configureOutlineAndClip();
    }

    /* JADX INFO: renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    public final void m1405setSpotShadowColor8_81llA(long j) {
        if (Color.m723equalsimpl0(j, this.impl.mo1411getSpotShadowColor0d7_KjU())) {
            return;
        }
        this.impl.mo1418setSpotShadowColor8_81llA(j);
    }

    /* JADX INFO: renamed from: setTopLeft--gyyYBs, reason: not valid java name */
    public final void m1406setTopLeftgyyYBs(long j) {
        if (IntOffset.m3800equalsimpl0(this.topLeft, j)) {
            return;
        }
        this.topLeft = j;
        m1387setPositionVbeCjmY(j, this.size);
    }

    public final void setTranslationX(float f) {
        if (this.impl.getTranslationX() == f) {
            return;
        }
        this.impl.setTranslationX(f);
    }

    public final void setTranslationY(float f) {
        if (this.impl.getTranslationY() == f) {
            return;
        }
        this.impl.setTranslationY(f);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        LayerSnapshotImpl layerSnapshotImpl;
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        boolean zEquals = lowerCase.equals("robolectric");
        isRobolectric = zEquals;
        if (zEquals) {
            layerSnapshotImpl = LayerSnapshotV21.INSTANCE;
        } else {
            layerSnapshotImpl = LayerSnapshotV28.INSTANCE;
        }
        SnapshotImpl = layerSnapshotImpl;
    }

    public GraphicsLayer(GraphicsLayerImpl graphicsLayerImpl) {
        this.impl = graphicsLayerImpl;
        Offset.Companion companion = Offset.Companion;
        this.roundRectOutlineTopLeft = companion.m493getZeroF1C5BW0();
        this.roundRectOutlineSize = Size.Companion.m554getUnspecifiedNHjbRc();
        this.childDependenciesTracker = new ChildLayerDependenciesTracker();
        graphicsLayerImpl.setClip(false);
        this.topLeft = IntOffset.Companion.m3812getZeronOccac();
        this.size = IntSize.Companion.m3849getZeroYbymL2g();
        this.pivotOffset = companion.m492getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: renamed from: record-mL-hObY, reason: not valid java name */
    public final void m1398recordmLhObY(Density density, LayoutDirection layoutDirection, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        m1390setSizeozmzZPI(j);
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.impl.setInvalidated(true);
        recordInternal();
    }

    public final void setPathOutline(Path path) {
        resetOutlineParams();
        this.outlinePath = path;
        configureOutlineAndClip();
    }

    private final void discardContentIfReleasedAndHaveNoParentLayerUsages() {
        if (this.isReleased && this.parentLayerUsages == 0) {
            discardDisplayList$ui_graphics();
        }
    }

    private final void onAddedToParentLayer() {
        this.parentLayerUsages++;
    }

    private final void onRemovedFromParentLayer() {
        this.parentLayerUsages--;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    /* JADX INFO: renamed from: setRectOutline-tz77jQw$default, reason: not valid java name */
    public static /* synthetic */ void m1388setRectOutlinetz77jQw$default(GraphicsLayer graphicsLayer, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Offset.Companion.m493getZeroF1C5BW0();
        }
        if ((i & 2) != 0) {
            j2 = Size.Companion.m554getUnspecifiedNHjbRc();
        }
        graphicsLayer.m1403setRectOutlinetz77jQw(j, j2);
    }

    /* JADX INFO: renamed from: setRoundRectOutline-TNW_H78$default, reason: not valid java name */
    public static /* synthetic */ void m1389setRoundRectOutlineTNW_H78$default(GraphicsLayer graphicsLayer, long j, long j2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Offset.Companion.m493getZeroF1C5BW0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = Size.Companion.m554getUnspecifiedNHjbRc();
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        graphicsLayer.m1404setRoundRectOutlineTNW_H78(j3, j4, f);
    }

    public final void drawForPersistence$ui_graphics(androidx.compose.ui.graphics.Canvas canvas) {
        if (AndroidCanvas_androidKt.getNativeCanvas(canvas).isHardwareAccelerated() || this.impl.getSupportsSoftwareRendering()) {
            recreateDisplayListIfNeeded();
            this.impl.draw(canvas);
        }
    }

    public final void setClip(boolean z) {
        if (this.clip != z) {
            this.clip = z;
            this.outlineDirty = true;
            configureOutlineAndClip();
        }
    }

    /* JADX INFO: renamed from: setRectOutline-tz77jQw, reason: not valid java name */
    public final void m1403setRectOutlinetz77jQw(long j, long j2) {
        m1404setRoundRectOutlineTNW_H78(j, j2, 0.0f);
    }

    private final void configureOutlineAndClip() {
        if (this.outlineDirty) {
            Outline outline = null;
            if (this.clip || getShadowElevation() > 0.0f) {
                Path path = this.outlinePath;
                if (path != null) {
                    RectF rectFObtainPathBounds = obtainPathBounds();
                    if (!(path instanceof AndroidPath)) {
                        IBraze$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
                        return;
                    }
                    ((AndroidPath) path).getInternalPath().computeBounds(rectFObtainPathBounds, false);
                    Outline outlineUpdatePathOutline = updatePathOutline(path);
                    if (outlineUpdatePathOutline != null) {
                        outlineUpdatePathOutline.setAlpha(getAlpha());
                        outline = outlineUpdatePathOutline;
                    }
                    this.impl.mo1415setOutlineO0kMr_c(outline, IntSize.m3839constructorimpl((4294967295L & ((long) Math.round(rectFObtainPathBounds.height()))) | (((long) Math.round(rectFObtainPathBounds.width())) << 32)));
                    if (this.usePathForClip && this.clip) {
                        this.impl.setClip(false);
                        this.impl.discardDisplayList();
                    } else {
                        this.impl.setClip(this.clip);
                    }
                } else {
                    this.impl.setClip(this.clip);
                    Size.Companion.m555getZeroNHjbRc();
                    Outline outlineObtainAndroidOutline = obtainAndroidOutline();
                    long jM3856toSizeozmzZPI = IntSizeKt.m3856toSizeozmzZPI(this.size);
                    long j = this.roundRectOutlineTopLeft;
                    long j2 = this.roundRectOutlineSize;
                    long j3 = j2 == InlineClassHelperKt.UnspecifiedPackedFloats ? jM3856toSizeozmzZPI : j2;
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    outlineObtainAndroidOutline.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i2)), this.roundRectCornerRadius);
                    outlineObtainAndroidOutline.setAlpha(getAlpha());
                    this.impl.mo1415setOutlineO0kMr_c(outlineObtainAndroidOutline, IntSizeKt.m3852roundToIntSizeuvyYCjk(j3));
                }
            } else {
                this.impl.setClip(false);
                this.impl.mo1415setOutlineO0kMr_c(null, IntSize.Companion.m3849getZeroYbymL2g());
            }
        }
        this.outlineDirty = false;
    }

    public final void release$ui_graphics() {
        if (this.isReleased) {
            return;
        }
        this.isReleased = true;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object toImageBitmap(ShortNewsContentCardView<? super ImageBitmap> shortNewsContentCardView) {
        AnonymousClass1 anonymousClass1;
        if (shortNewsContentCardView instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) shortNewsContentCardView;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
        }
        Object bitmap = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(bitmap);
            LayerSnapshotImpl layerSnapshotImpl = SnapshotImpl;
            anonymousClass1.label = 1;
            bitmap = layerSnapshotImpl.toBitmap(this, anonymousClass1);
            if (bitmap == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(bitmap);
        }
        return AndroidImageBitmap_androidKt.asImageBitmap((Bitmap) bitmap);
    }

    private final Outline obtainAndroidOutline() {
        Outline outline = this.androidOutline;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.androidOutline = outline2;
        return outline2;
    }

    private final RectF obtainPathBounds() {
        RectF rectF = this.pathBounds;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.pathBounds = rectF2;
        return rectF2;
    }

    public final void draw$ui_graphics(androidx.compose.ui.graphics.Canvas canvas, GraphicsLayer graphicsLayer) {
        if (this.isReleased) {
            return;
        }
        configureOutlineAndClip();
        recreateDisplayListIfNeeded();
        boolean z = getShadowElevation() > 0.0f;
        if (z) {
            canvas.enableZ();
        }
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean zIsHardwareAccelerated = nativeCanvas.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            transformCanvas(nativeCanvas);
        }
        boolean z2 = !zIsHardwareAccelerated && this.clip;
        if (z2) {
            canvas.save();
            androidx.compose.ui.graphics.Outline outline = getOutline();
            if (outline instanceof androidx.compose.ui.graphics.Outline.Rectangle) {
                androidx.compose.ui.graphics.Canvas.m695clipRectmtrdDE$default(canvas, ((androidx.compose.ui.graphics.Outline.Rectangle) outline).getBounds(), 0, 2, null);
            } else if (outline instanceof androidx.compose.ui.graphics.Outline.Rounded) {
                Path Path = this.roundRectClipPath;
                if (Path != null) {
                    Path.rewind();
                } else {
                    Path = AndroidPath_androidKt.Path();
                    this.roundRectClipPath = Path;
                }
                Path.addRoundRect$default(Path, ((androidx.compose.ui.graphics.Outline.Rounded) outline).getRoundRect(), null, 2, null);
                androidx.compose.ui.graphics.Canvas.m693clipPathmtrdDE$default(canvas, Path, 0, 2, null);
            } else if (outline instanceof androidx.compose.ui.graphics.Outline.Generic) {
                androidx.compose.ui.graphics.Canvas.m693clipPathmtrdDE$default(canvas, ((androidx.compose.ui.graphics.Outline.Generic) outline).getPath(), 0, 2, null);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
        }
        if (graphicsLayer != null) {
            graphicsLayer.addSubLayer(this);
        }
        if (!AndroidCanvas_androidKt.getNativeCanvas(canvas).isHardwareAccelerated() && !this.impl.getSupportsSoftwareRendering()) {
            CanvasDrawScope canvasDrawScope = this.softwareDrawScope;
            if (canvasDrawScope == null) {
                canvasDrawScope = new CanvasDrawScope();
                this.softwareDrawScope = canvasDrawScope;
            }
            DrawScope drawScope = canvasDrawScope;
            Density density = this.density;
            LayoutDirection layoutDirection = this.layoutDirection;
            long jM3856toSizeozmzZPI = IntSizeKt.m3856toSizeozmzZPI(this.size);
            Density density2 = drawScope.getDrawContext().getDensity();
            LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
            androidx.compose.ui.graphics.Canvas canvas2 = drawScope.getDrawContext().getCanvas();
            long jMo1225getSizeNHjbRc = drawScope.getDrawContext().mo1225getSizeNHjbRc();
            GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
            DrawContext drawContext = drawScope.getDrawContext();
            drawContext.setDensity(density);
            drawContext.setLayoutDirection(layoutDirection);
            drawContext.setCanvas(canvas);
            drawContext.mo1226setSizeuvyYCjk(jM3856toSizeozmzZPI);
            drawContext.setGraphicsLayer(this);
            canvas.save();
            try {
                drawWithChildTracking(drawScope);
                canvas.restore();
                DrawContext drawContext2 = drawScope.getDrawContext();
                drawContext2.setDensity(density2);
                drawContext2.setLayoutDirection(layoutDirection2);
                drawContext2.setCanvas(canvas2);
                drawContext2.mo1226setSizeuvyYCjk(jMo1225getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer2);
            } catch (Throwable th) {
                canvas.restore();
                DrawContext drawContext3 = drawScope.getDrawContext();
                drawContext3.setDensity(density2);
                drawContext3.setLayoutDirection(layoutDirection2);
                drawContext3.setCanvas(canvas2);
                drawContext3.mo1226setSizeuvyYCjk(jMo1225getSizeNHjbRc);
                drawContext3.setGraphicsLayer(graphicsLayer2);
                throw th;
            }
        } else {
            this.impl.draw(canvas);
        }
        if (z2) {
            canvas.restore();
        }
        if (z) {
            canvas.disableZ();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        nativeCanvas.restore();
    }

    private final Outline updatePathOutline(Path path) {
        int i = Build.VERSION.SDK_INT;
        Outline outline = null;
        if (i > 28 || path.isConvex()) {
            Outline outlineObtainAndroidOutline = obtainAndroidOutline();
            if (i >= 30) {
                OutlineVerificationHelper.INSTANCE.setPath(outlineObtainAndroidOutline, path);
            } else {
                if (!(path instanceof AndroidPath)) {
                    IBraze$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
                    return null;
                }
                outlineObtainAndroidOutline.setConvexPath(((AndroidPath) path).getInternalPath());
            }
            this.usePathForClip = !outlineObtainAndroidOutline.canClip();
            outline = outlineObtainAndroidOutline;
        } else {
            Outline outline2 = this.androidOutline;
            if (outline2 != null) {
                outline2.setEmpty();
            }
            this.usePathForClip = true;
            this.impl.setInvalidated(true);
        }
        this.outlinePath = path;
        return outline;
    }
}
