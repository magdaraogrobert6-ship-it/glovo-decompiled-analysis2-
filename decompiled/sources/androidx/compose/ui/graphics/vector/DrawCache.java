package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class DrawCache {
    public static final int $stable = 8;
    private Canvas cachedCanvas;
    private ImageBitmap mCachedImage;
    private Density scopeDensity;
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private long size = IntSize.Companion.m3849getZeroYbymL2g();
    private int config = ImageBitmapConfig.Companion.m956getArgb8888_sVssgQ();
    private final CanvasDrawScope cacheScope = new CanvasDrawScope();

    public static /* synthetic */ void getMCachedImage$annotations() {
    }

    public final ImageBitmap getMCachedImage() {
        return this.mCachedImage;
    }

    public final void setMCachedImage(ImageBitmap imageBitmap) {
        this.mCachedImage = imageBitmap;
    }

    private final void clear(DrawScope drawScope) {
        DrawScope.m1298drawRectnJ9OG0$default(drawScope, Color.Companion.m748getBlack0d7_KjU(), 0L, 0L, 0.0f, null, null, BlendMode.Companion.m635getClear0nO6VwU(), 62, null);
    }

    public final void drawInto(DrawScope drawScope, float f, ColorFilter colorFilter) {
        ImageBitmap imageBitmap = this.mCachedImage;
        if (imageBitmap == null) {
            InlineClassHelperKt.throwIllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        DrawScope.m1287drawImageAZ2fEMs$default(drawScope, imageBitmap, 0L, this.size, 0L, 0L, f, null, colorFilter, 0, 0, 858, null);
    }

    /* JADX INFO: renamed from: drawCachedImage-FqjB98A, reason: not valid java name */
    public final void m1454drawCachedImageFqjB98A(int i, long j, Density density, LayoutDirection layoutDirection, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.scopeDensity = density;
        this.layoutDirection = layoutDirection;
        ImageBitmap imageBitmapM961ImageBitmapx__hDU$default = this.mCachedImage;
        Canvas Canvas = this.cachedCanvas;
        if (imageBitmapM961ImageBitmapx__hDU$default == null || Canvas == null || ((int) (j >> 32)) > imageBitmapM961ImageBitmapx__hDU$default.getWidth() || ((int) (j & 4294967295L)) > imageBitmapM961ImageBitmapx__hDU$default.getHeight() || !ImageBitmapConfig.m951equalsimpl0(this.config, i)) {
            imageBitmapM961ImageBitmapx__hDU$default = ImageBitmapKt.m961ImageBitmapx__hDU$default((int) (j >> 32), (int) (j & 4294967295L), i, false, null, 24, null);
            Canvas = CanvasKt.Canvas(imageBitmapM961ImageBitmapx__hDU$default);
            this.mCachedImage = imageBitmapM961ImageBitmapx__hDU$default;
            this.cachedCanvas = Canvas;
            this.config = i;
        }
        this.size = j;
        CanvasDrawScope canvasDrawScope = this.cacheScope;
        long jM3856toSizeozmzZPI = IntSizeKt.m3856toSizeozmzZPI(j);
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density densityComponent1 = drawParams.component1();
        LayoutDirection layoutDirectionComponent2 = drawParams.component2();
        Canvas canvasComponent3 = drawParams.component3();
        long jM1221component4NHjbRc = drawParams.m1221component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(Canvas);
        drawParams2.m1224setSizeuvyYCjk(jM3856toSizeozmzZPI);
        Canvas.save();
        clear(canvasDrawScope);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(canvasDrawScope);
        Canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(densityComponent1);
        drawParams3.setLayoutDirection(layoutDirectionComponent2);
        drawParams3.setCanvas(canvasComponent3);
        drawParams3.m1224setSizeuvyYCjk(jM1221component4NHjbRc);
        imageBitmapM961ImageBitmapx__hDU$default.prepareToDraw();
    }

    public static /* synthetic */ void drawInto$default(DrawCache drawCache, DrawScope drawScope, float f, ColorFilter colorFilter, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        if ((i & 4) != 0) {
            colorFilter = null;
        }
        drawCache.drawInto(drawScope, f, colorFilter);
    }
}
