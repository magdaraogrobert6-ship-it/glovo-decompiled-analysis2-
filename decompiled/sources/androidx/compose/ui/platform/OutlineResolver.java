package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class OutlineResolver {
    public static final int $stable = 8;
    private boolean cacheIsDirty;
    private final Outline cachedOutline;
    private Path cachedRrectPath;
    private boolean isSupportedOutline = true;
    private androidx.compose.ui.graphics.Outline outline;
    private boolean outlineNeeded;
    private Path outlinePath;
    private long rectSize;
    private long rectTopLeft;
    private float roundedCornerRadius;
    private Path tmpOpPath;
    private Path tmpPath;
    private RoundRect tmpRoundRect;
    private Path tmpTouchPointPath;
    private boolean usePathForClip;

    public final boolean getCacheIsDirty$ui() {
        return this.cacheIsDirty;
    }

    public final boolean getOutlineClipSupported() {
        return !this.usePathForClip;
    }

    /* JADX INFO: renamed from: update-S_szKao, reason: not valid java name */
    public final boolean m2780updateS_szKao(androidx.compose.ui.graphics.Outline outline, float f, boolean z, float f2, long j) {
        this.cachedOutline.setAlpha(f);
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.outline, outline}, getCieXyz.write())).booleanValue();
        if (!zBooleanValue) {
            this.outline = outline;
            this.cacheIsDirty = true;
        }
        this.rectSize = j;
        boolean z2 = outline != null && (z || f2 > 0.0f);
        if (this.outlineNeeded != z2) {
            this.outlineNeeded = z2;
            this.cacheIsDirty = true;
        }
        return !zBooleanValue;
    }

    /* JADX INFO: renamed from: isSameBounds-4L21HEs, reason: not valid java name */
    private final boolean m2778isSameBounds4L21HEs(RoundRect roundRect, long j, long j2, float f) {
        if (roundRect != null && RoundRectKt.isSimple(roundRect)) {
            int i = (int) (j >> 32);
            if (roundRect.getLeft() == Float.intBitsToFloat(i)) {
                int i2 = (int) (j & 4294967295L);
                if (roundRect.getTop() == Float.intBitsToFloat(i2)) {
                    if (roundRect.getRight() == Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i)) {
                        if (roundRect.getBottom() == Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2) && Float.intBitsToFloat((int) (roundRect.m527getTopLeftCornerRadiuskKHJgLs() >> 32)) == f) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final Outline getAndroidOutline() {
        updateCache();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    public final Path getClipPath() {
        updateCache();
        return this.outlinePath;
    }

    public OutlineResolver() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        this.rectTopLeft = Offset.Companion.m493getZeroF1C5BW0();
        this.rectSize = Size.Companion.m555getZeroNHjbRc();
    }

    private final void updateCache() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = Offset.Companion.m493getZeroF1C5BW0();
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            androidx.compose.ui.graphics.Outline outline = this.outline;
            if (outline == null || !this.outlineNeeded || Float.intBitsToFloat((int) (this.rectSize >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.rectSize & 4294967295L)) <= 0.0f) {
                this.cachedOutline.setEmpty();
                return;
            }
            this.isSupportedOutline = true;
            if (outline instanceof androidx.compose.ui.graphics.Outline.Rectangle) {
                updateCacheWithRect(((androidx.compose.ui.graphics.Outline.Rectangle) outline).getRect());
                return;
            }
            if (outline instanceof androidx.compose.ui.graphics.Outline.Rounded) {
                updateCacheWithRoundRect(((androidx.compose.ui.graphics.Outline.Rounded) outline).getRoundRect());
            } else if (outline instanceof androidx.compose.ui.graphics.Outline.Generic) {
                updateCacheWithPath(((androidx.compose.ui.graphics.Outline.Generic) outline).getPath());
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            }
        }
    }

    private final void updateCacheWithRect(Rect rect) {
        float left = rect.getLeft();
        this.rectTopLeft = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(rect.getTop())) & 4294967295L) | (((long) Float.floatToRawIntBits(left)) << 32));
        float right = rect.getRight();
        float left2 = rect.getLeft();
        float bottom = rect.getBottom();
        float top = rect.getTop();
        this.rectSize = Size.m537constructorimpl((((long) Float.floatToRawIntBits(right - left2)) << 32) | (((long) Float.floatToRawIntBits(bottom - top)) & 4294967295L));
        this.cachedOutline.setRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.getRight()), Math.round(rect.getBottom()));
    }

    public final void clipToOutline(Canvas canvas) {
        int i;
        Object obj;
        Canvas canvas2;
        int i2;
        Path clipPath = getClipPath();
        if (clipPath != null) {
            Canvas.m693clipPathmtrdDE$default(canvas, clipPath, 0, 2, null);
            return;
        }
        float f = this.roundedCornerRadius;
        if (f > 0.0f) {
            Path Path = this.tmpPath;
            RoundRect roundRect = this.tmpRoundRect;
            if (Path == null || !m2778isSameBounds4L21HEs(roundRect, this.rectTopLeft, this.rectSize, f)) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.rectTopLeft >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.rectTopLeft & 4294967295L));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.rectTopLeft >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (this.rectSize >> 32));
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (this.rectTopLeft & 4294967295L));
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (this.rectSize & 4294967295L));
                float f2 = this.roundedCornerRadius;
                float f3 = fIntBitsToFloat4 + fIntBitsToFloat3;
                float f4 = fIntBitsToFloat5 + fIntBitsToFloat6;
                RoundRect roundRectM531RoundRectgG7oq9Y = RoundRectKt.m531RoundRectgG7oq9Y(fIntBitsToFloat, fIntBitsToFloat2, f3, f4, CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32)));
                if (Path == null) {
                    Path = AndroidPath_androidKt.Path();
                } else {
                    Path.reset();
                }
                i = 2;
                obj = null;
                Path.addRoundRect$default(Path, roundRectM531RoundRectgG7oq9Y, null, 2, null);
                this.tmpRoundRect = roundRectM531RoundRectgG7oq9Y;
                this.tmpPath = Path;
                canvas2 = canvas;
                i2 = 0;
            } else {
                canvas2 = canvas;
                i2 = 0;
                i = 2;
                obj = null;
            }
            Canvas.m693clipPathmtrdDE$default(canvas2, Path, i2, i, obj);
            return;
        }
        Canvas.m694clipRectN_I0leg$default(canvas, Float.intBitsToFloat((int) (this.rectTopLeft >> 32)), Float.intBitsToFloat((int) (this.rectTopLeft & 4294967295L)), Float.intBitsToFloat((int) (this.rectTopLeft >> 32)) + Float.intBitsToFloat((int) (this.rectSize >> 32)), Float.intBitsToFloat((int) (this.rectTopLeft & 4294967295L)) + Float.intBitsToFloat((int) (this.rectSize & 4294967295L)), 0, 16, null);
    }

    /* JADX INFO: renamed from: isInOutline-k-4lQ0M, reason: not valid java name */
    public final boolean m2779isInOutlinek4lQ0M(long j) {
        androidx.compose.ui.graphics.Outline outline;
        if (this.outlineNeeded && (outline = this.outline) != null) {
            return ShapeContainingUtilKt.isInOutline(outline, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    private final void updateCacheWithPath(Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i > 28 || path.isConvex()) {
            if (i >= 30) {
                OutlineVerificationHelper.INSTANCE.setPath(this.cachedOutline, path);
            } else {
                Outline outline = this.cachedOutline;
                if (!(path instanceof AndroidPath)) {
                    IBraze$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
                    return;
                }
                outline.setConvexPath(((AndroidPath) path).getInternalPath());
            }
            this.usePathForClip = !this.cachedOutline.canClip();
        } else {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        }
        this.outlinePath = path;
    }

    private final void updateCacheWithRoundRect(RoundRect roundRect) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.m527getTopLeftCornerRadiuskKHJgLs() >> 32));
        float left = roundRect.getLeft();
        float top = roundRect.getTop();
        this.rectTopLeft = Offset.m469constructorimpl((Float.floatToRawIntBits(left) << 32) | (((long) Float.floatToRawIntBits(top)) & 4294967295L));
        float width = roundRect.getWidth();
        float height = roundRect.getHeight();
        this.rectSize = Size.m537constructorimpl((Float.floatToRawIntBits(width) << 32) | (((long) Float.floatToRawIntBits(height)) & 4294967295L));
        if (RoundRectKt.isSimple(roundRect)) {
            this.cachedOutline.setRoundRect(Math.round(roundRect.getLeft()), Math.round(roundRect.getTop()), Math.round(roundRect.getRight()), Math.round(roundRect.getBottom()), fIntBitsToFloat);
            this.roundedCornerRadius = fIntBitsToFloat;
            return;
        }
        Path Path = this.cachedRrectPath;
        if (Path == null) {
            Path = AndroidPath_androidKt.Path();
            this.cachedRrectPath = Path;
        }
        Path.reset();
        Path.addRoundRect$default(Path, roundRect, null, 2, null);
        updateCacheWithPath(Path);
    }
}
