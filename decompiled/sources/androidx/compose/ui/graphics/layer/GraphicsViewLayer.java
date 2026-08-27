package androidx.compose.ui.graphics.layer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidBlendMode_androidKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class GraphicsViewLayer implements GraphicsLayerImpl {
    private float alpha;
    private long ambientShadowColor;
    private int blendMode;
    private final CanvasHolder canvasHolder;
    private boolean clipBoundsInvalidated;
    private final Rect clipRect;
    private boolean clipToBounds;
    private ColorFilter colorFilter;
    private int compositingStrategy;
    private boolean isInvalidated;
    private final DrawChildContainer layerContainer;
    private final long layerId;
    private Paint layerPaint;
    private boolean outlineIsProvided;
    private final long ownerId;
    private final Picture picture;
    private final CanvasHolder pictureCanvasHolder;
    private final CanvasDrawScope pictureDrawScope;
    private long pivotOffset;
    private RenderEffect renderEffect;
    private final Resources resources;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;
    private boolean shouldManuallySetCenterPivot;
    private long size;
    private long spotShadowColor;
    private final boolean supportsSoftwareRendering;
    private float translationX;
    private float translationY;
    private final ViewLayer viewLayer;
    private int x;
    private int y;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final boolean mayRenderInSoftware = !SurfaceUtils.INSTANCE.isLockHardwareCanvasAvailable();
    private static final Canvas PlaceholderCanvas = new Canvas() { // from class: androidx.compose.ui.graphics.layer.GraphicsViewLayer$Companion$PlaceholderCanvas$1
        @Override // android.graphics.Canvas
        public boolean isHardwareAccelerated() {
            return true;
        }
    };

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU */
    public long mo1407getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getBlendMode-0nO6VwU */
    public int mo1408getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    public final CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getCompositingStrategy-ke2Ky5w */
    public int mo1409getCompositingStrategyke2Ky5w() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getLayerId() {
        return this.layerId;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getOwnerId() {
        return this.ownerId;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getPivotOffset-F1C5BW0 */
    public long mo1410getPivotOffsetF1C5BW0() {
        return this.pivotOffset;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU */
    public long mo1411getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean getSupportsSoftwareRendering() {
        return this.supportsSoftwareRendering;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean isInvalidated() {
        return this.isInvalidated;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setInvalidated(boolean z) {
        this.isInvalidated = z;
    }

    /* JADX INFO: renamed from: applyCompositingLayer-Wpw9cng, reason: not valid java name */
    private final void m1421applyCompositingLayerWpw9cng(int i) {
        boolean z;
        ViewLayer viewLayer = this.viewLayer;
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        if (!CompositingStrategy.m1380equalsimpl0(i, companion.m1386getOffscreenke2Ky5w())) {
            boolean zM1380equalsimpl0 = CompositingStrategy.m1380equalsimpl0(i, companion.m1385getModulateAlphake2Ky5w());
            ViewLayer viewLayer2 = this.viewLayer;
            z = false;
            if (zM1380equalsimpl0) {
                viewLayer2.setLayerType(0, this.layerPaint);
            } else {
                viewLayer2.setLayerType(0, this.layerPaint);
            }
            viewLayer.setCanUseCompositingLayer$ui_graphics(z);
        }
        this.viewLayer.setLayerType(2, this.layerPaint);
        z = true;
        viewLayer.setCanUseCompositingLayer$ui_graphics(z);
    }

    private final void recordDrawingOperations() {
        try {
            CanvasHolder canvasHolder = this.canvasHolder;
            Canvas canvas = PlaceholderCanvas;
            Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
            AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            DrawChildContainer drawChildContainer = this.layerContainer;
            ViewLayer viewLayer = this.viewLayer;
            drawChildContainer.drawChild$ui_graphics(androidCanvas, viewLayer, viewLayer.getDrawingTime());
            canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        } catch (ClassCastException unused) {
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public Matrix calculateMatrix() {
        return this.viewLayer.getMatrix();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void discardDisplayList() {
        this.layerContainer.removeViewInLayout(this.viewLayer);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getCameraDistance() {
        return this.viewLayer.getCameraDistance() / this.resources.getDisplayMetrics().densityDpi;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setAlpha(float f) {
        this.alpha = f;
        this.viewLayer.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA */
    public void mo1412setAmbientShadowColor8_81llA(long j) {
        this.ambientShadowColor = j;
        ViewLayerVerificationHelper28.INSTANCE.setOutlineAmbientShadowColor(this.viewLayer, ColorKt.m776toArgb8_81llA(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setBlendMode-s9anfk8 */
    public void mo1413setBlendModes9anfk8(int i) {
        this.blendMode = i;
        obtainLayerPaint().setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m570toPorterDuffModes9anfk8(i)));
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setCameraDistance(float f) {
        this.viewLayer.setCameraDistance(f * this.resources.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        obtainLayerPaint().setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setCompositingStrategy-Wpw9cng */
    public void mo1414setCompositingStrategyWpw9cng(int i) {
        this.compositingStrategy = i;
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setOutline-O0kMr_c */
    public void mo1415setOutlineO0kMr_c(Outline outline, long j) {
        boolean layerOutline = this.viewLayer.setLayerOutline(outline);
        if (getClip() && outline != null) {
            this.viewLayer.setClipToOutline(true);
            if (this.clipToBounds) {
                this.clipToBounds = false;
                this.clipBoundsInvalidated = true;
            }
        }
        this.outlineIsProvided = outline != null;
        if (layerOutline) {
            return;
        }
        this.viewLayer.invalidate();
        recordDrawingOperations();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setPosition-H0pRuoY */
    public void mo1417setPositionH0pRuoY(int i, int i2, long j) {
        if (IntSize.m3842equalsimpl0(this.size, j)) {
            int i3 = this.x;
            if (i3 != i) {
                this.viewLayer.offsetLeftAndRight(i - i3);
            }
            int i4 = this.y;
            if (i4 != i2) {
                this.viewLayer.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (getClip()) {
                this.clipBoundsInvalidated = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            this.viewLayer.layout(i, i2, i + i5, i2 + i6);
            this.size = j;
            if (this.shouldManuallySetCenterPivot) {
                this.viewLayer.setPivotX(i5 / 2.0f);
                this.viewLayer.setPivotY(i6 / 2.0f);
            }
        }
        this.x = i;
        this.y = i2;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this.viewLayer, renderEffect);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationX(float f) {
        this.rotationX = f;
        this.viewLayer.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationY(float f) {
        this.rotationY = f;
        this.viewLayer.setRotationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationZ(float f) {
        this.rotationZ = f;
        this.viewLayer.setRotation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleX(float f) {
        this.scaleX = f;
        this.viewLayer.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleY(float f) {
        this.scaleY = f;
        this.viewLayer.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setShadowElevation(float f) {
        this.shadowElevation = f;
        this.viewLayer.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setSpotShadowColor-8_81llA */
    public void mo1418setSpotShadowColor8_81llA(long j) {
        this.spotShadowColor = j;
        ViewLayerVerificationHelper28.INSTANCE.setOutlineSpotShadowColor(this.viewLayer, ColorKt.m776toArgb8_81llA(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationX(float f) {
        this.translationX = f;
        this.viewLayer.setTranslationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationY(float f) {
        this.translationY = f;
        this.viewLayer.setTranslationY(f);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getMayRenderInSoftware() {
            return GraphicsViewLayer.mayRenderInSoftware;
        }

        public final Canvas getPlaceholderCanvas() {
            return GraphicsViewLayer.PlaceholderCanvas;
        }

        private Companion() {
        }
    }

    public GraphicsViewLayer(DrawChildContainer drawChildContainer, long j, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.layerContainer = drawChildContainer;
        this.ownerId = j;
        this.canvasHolder = canvasHolder;
        ViewLayer viewLayer = new ViewLayer(drawChildContainer, canvasHolder, canvasDrawScope);
        this.viewLayer = viewLayer;
        this.resources = drawChildContainer.getResources();
        this.clipRect = new Rect();
        boolean z = mayRenderInSoftware;
        this.picture = z ? new Picture() : null;
        this.pictureDrawScope = z ? new CanvasDrawScope() : null;
        this.pictureCanvasHolder = z ? new CanvasHolder() : null;
        drawChildContainer.addView(viewLayer);
        viewLayer.setClipBounds(null);
        this.size = IntSize.Companion.m3849getZeroYbymL2g();
        this.isInvalidated = true;
        this.layerId = View.generateViewId();
        this.blendMode = BlendMode.Companion.m662getSrcOver0nO6VwU();
        this.compositingStrategy = CompositingStrategy.Companion.m1384getAutoke2Ky5w();
        this.alpha = 1.0f;
        this.pivotOffset = Offset.Companion.m493getZeroF1C5BW0();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        Color.Companion companion = Color.Companion;
        this.ambientShadowColor = companion.m748getBlack0d7_KjU();
        this.spotShadowColor = companion.m748getBlack0d7_KjU();
        this.supportsSoftwareRendering = z;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void draw(androidx.compose.ui.graphics.Canvas canvas) {
        updateClipBounds();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (nativeCanvas.isHardwareAccelerated()) {
            DrawChildContainer drawChildContainer = this.layerContainer;
            ViewLayer viewLayer = this.viewLayer;
            drawChildContainer.drawChild$ui_graphics(canvas, viewLayer, viewLayer.getDrawingTime());
        } else {
            Picture picture = this.picture;
            if (picture != null) {
                nativeCanvas.drawPicture(picture);
            }
        }
    }

    private final boolean requiresCompositingLayer() {
        return CompositingStrategy.m1380equalsimpl0(mo1409getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m1386getOffscreenke2Ky5w()) || requiresLayerPaint();
    }

    private final boolean requiresLayerPaint() {
        return (BlendMode.m631equalsimpl0(mo1408getBlendMode0nO6VwU(), BlendMode.Companion.m662getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    private final void updateClipBounds() {
        Rect rect;
        if (this.clipBoundsInvalidated) {
            ViewLayer viewLayer = this.viewLayer;
            if (!getClip() || this.outlineIsProvided) {
                rect = null;
            } else {
                rect = this.clipRect;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.viewLayer.getWidth();
                rect.bottom = this.viewLayer.getHeight();
            }
            viewLayer.setClipBounds(rect);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean getClip() {
        return this.clipToBounds || this.viewLayer.getClipToOutline();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setClip(boolean z) {
        this.clipToBounds = z && !this.outlineIsProvided;
        this.clipBoundsInvalidated = true;
        this.viewLayer.setClipToOutline(z && this.outlineIsProvided);
    }

    private final Paint obtainLayerPaint() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.layerPaint = paint2;
        return paint2;
    }

    private final void updateLayerProperties() {
        if (requiresCompositingLayer()) {
            m1421applyCompositingLayerWpw9cng(CompositingStrategy.Companion.m1386getOffscreenke2Ky5w());
        } else {
            m1421applyCompositingLayerWpw9cng(mo1409getCompositingStrategyke2Ky5w());
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void record(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (this.viewLayer.getParent() == null) {
            this.layerContainer.addView(this.viewLayer);
        }
        this.viewLayer.setDrawParams(density, layoutDirection, graphicsLayer, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        if (this.viewLayer.isAttachedToWindow()) {
            this.viewLayer.setVisibility(4);
            this.viewLayer.setVisibility(0);
            recordDrawingOperations();
            Picture picture = this.picture;
            if (picture != null) {
                long j = this.size;
                Canvas canvasBeginRecording = picture.beginRecording((int) (j >> 32), (int) (j & 4294967295L));
                try {
                    CanvasHolder canvasHolder = this.pictureCanvasHolder;
                    if (canvasHolder != null) {
                        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
                        canvasHolder.getAndroidCanvas().setInternalCanvas(canvasBeginRecording);
                        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
                        CanvasDrawScope canvasDrawScope = this.pictureDrawScope;
                        if (canvasDrawScope != null) {
                            long jM3856toSizeozmzZPI = IntSizeKt.m3856toSizeozmzZPI(this.size);
                            Density density2 = canvasDrawScope.getDrawContext().getDensity();
                            LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
                            androidx.compose.ui.graphics.Canvas canvas = canvasDrawScope.getDrawContext().getCanvas();
                            long jMo1225getSizeNHjbRc = canvasDrawScope.getDrawContext().mo1225getSizeNHjbRc();
                            GraphicsLayer graphicsLayer2 = canvasDrawScope.getDrawContext().getGraphicsLayer();
                            DrawContext drawContext = canvasDrawScope.getDrawContext();
                            drawContext.setDensity(density);
                            drawContext.setLayoutDirection(layoutDirection);
                            drawContext.setCanvas(androidCanvas);
                            drawContext.mo1226setSizeuvyYCjk(jM3856toSizeozmzZPI);
                            drawContext.setGraphicsLayer(graphicsLayer);
                            androidCanvas.save();
                            try {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(canvasDrawScope);
                                androidCanvas.restore();
                                DrawContext drawContext2 = canvasDrawScope.getDrawContext();
                                drawContext2.setDensity(density2);
                                drawContext2.setLayoutDirection(layoutDirection2);
                                drawContext2.setCanvas(canvas);
                                drawContext2.mo1226setSizeuvyYCjk(jMo1225getSizeNHjbRc);
                                drawContext2.setGraphicsLayer(graphicsLayer2);
                            } catch (Throwable th) {
                                androidCanvas.restore();
                                DrawContext drawContext3 = canvasDrawScope.getDrawContext();
                                drawContext3.setDensity(density2);
                                drawContext3.setLayoutDirection(layoutDirection2);
                                drawContext3.setCanvas(canvas);
                                drawContext3.mo1226setSizeuvyYCjk(jMo1225getSizeNHjbRc);
                                drawContext3.setGraphicsLayer(graphicsLayer2);
                                throw th;
                            }
                        }
                        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
                    }
                    picture.endRecording();
                } catch (Throwable th2) {
                    picture.endRecording();
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setPivotOffset-k-4lQ0M */
    public void mo1416setPivotOffsetk4lQ0M(long j) {
        this.pivotOffset = j;
        if ((InlineClassHelperKt.DualUnsignedFloatMask & j) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            ViewLayerVerificationHelper28.INSTANCE.resetPivot(this.viewLayer);
            return;
        }
        this.shouldManuallySetCenterPivot = false;
        this.viewLayer.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
        this.viewLayer.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public /* synthetic */ GraphicsViewLayer(DrawChildContainer drawChildContainer, long j, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawChildContainer, j, (i & 4) != 0 ? new CanvasHolder() : canvasHolder, (i & 8) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
