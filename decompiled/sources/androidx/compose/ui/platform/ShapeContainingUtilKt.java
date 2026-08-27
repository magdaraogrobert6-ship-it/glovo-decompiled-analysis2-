package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class ShapeContainingUtilKt {
    public static final boolean isInOutline(Outline outline, float f, float f2, Path path, Path path2) {
        if (outline instanceof Outline.Rectangle) {
            return isInRectangle(((Outline.Rectangle) outline).getRect(), f, f2);
        }
        if (outline instanceof Outline.Rounded) {
            return isInRoundedRect((Outline.Rounded) outline, f, f2, path, path2);
        }
        if (outline instanceof Outline.Generic) {
            return isInPath(((Outline.Generic) outline).getPath(), f, f2, path, path2);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return false;
    }

    private static final boolean isInRoundedRect(Outline.Rounded rounded, float f, float f2, Path path, Path path2) {
        RoundRect roundRect = rounded.getRoundRect();
        if (f < roundRect.getLeft() || f >= roundRect.getRight() || f2 < roundRect.getTop() || f2 >= roundRect.getBottom()) {
            return false;
        }
        if (!cornersFit(roundRect)) {
            Path Path = path2 == null ? AndroidPath_androidKt.Path() : path2;
            Path.addRoundRect$default(Path, roundRect, null, 2, null);
            return isInPath(Path, f, f2, path, path2);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.m527getTopLeftCornerRadiuskKHJgLs() >> 32)) + roundRect.getLeft();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (roundRect.m527getTopLeftCornerRadiuskKHJgLs() & 4294967295L)) + roundRect.getTop();
        float right = roundRect.getRight() - Float.intBitsToFloat((int) (roundRect.m528getTopRightCornerRadiuskKHJgLs() >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (roundRect.m528getTopRightCornerRadiuskKHJgLs() & 4294967295L)) + roundRect.getTop();
        float right2 = roundRect.getRight() - Float.intBitsToFloat((int) (roundRect.m526getBottomRightCornerRadiuskKHJgLs() >> 32));
        float bottom = roundRect.getBottom() - Float.intBitsToFloat((int) (roundRect.m526getBottomRightCornerRadiuskKHJgLs() & 4294967295L));
        float bottom2 = roundRect.getBottom() - Float.intBitsToFloat((int) (4294967295L & roundRect.m525getBottomLeftCornerRadiuskKHJgLs()));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (roundRect.m525getBottomLeftCornerRadiuskKHJgLs() >> 32)) + roundRect.getLeft();
        if (f < fIntBitsToFloat && f2 < fIntBitsToFloat2) {
            return m2784isWithinEllipseVE1yxkc(f, f2, roundRect.m527getTopLeftCornerRadiuskKHJgLs(), fIntBitsToFloat, fIntBitsToFloat2);
        }
        if (f < fIntBitsToFloat4 && f2 > bottom2) {
            return m2784isWithinEllipseVE1yxkc(f, f2, roundRect.m525getBottomLeftCornerRadiuskKHJgLs(), fIntBitsToFloat4, bottom2);
        }
        if (f > right && f2 < fIntBitsToFloat3) {
            return m2784isWithinEllipseVE1yxkc(f, f2, roundRect.m528getTopRightCornerRadiuskKHJgLs(), right, fIntBitsToFloat3);
        }
        if (f <= right2 || f2 <= bottom) {
            return true;
        }
        return m2784isWithinEllipseVE1yxkc(f, f2, roundRect.m526getBottomRightCornerRadiuskKHJgLs(), right2, bottom);
    }

    /* JADX INFO: renamed from: isWithinEllipse-VE1yxkc, reason: not valid java name */
    private static final boolean m2784isWithinEllipseVE1yxkc(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    private static final boolean cornersFit(RoundRect roundRect) {
        if (Float.intBitsToFloat((int) (roundRect.m528getTopRightCornerRadiuskKHJgLs() >> 32)) + Float.intBitsToFloat((int) (roundRect.m527getTopLeftCornerRadiuskKHJgLs() >> 32)) > roundRect.getWidth()) {
            return false;
        }
        if (Float.intBitsToFloat((int) (roundRect.m526getBottomRightCornerRadiuskKHJgLs() >> 32)) + Float.intBitsToFloat((int) (roundRect.m525getBottomLeftCornerRadiuskKHJgLs() >> 32)) > roundRect.getWidth()) {
            return false;
        }
        if (Float.intBitsToFloat((int) (roundRect.m525getBottomLeftCornerRadiuskKHJgLs() & 4294967295L)) + Float.intBitsToFloat((int) (roundRect.m527getTopLeftCornerRadiuskKHJgLs() & 4294967295L)) > roundRect.getHeight()) {
            return false;
        }
        return Float.intBitsToFloat((int) (roundRect.m526getBottomRightCornerRadiuskKHJgLs() & 4294967295L)) + Float.intBitsToFloat((int) (roundRect.m528getTopRightCornerRadiuskKHJgLs() & 4294967295L)) <= roundRect.getHeight();
    }

    private static final boolean isInRectangle(Rect rect, float f, float f2) {
        return rect.getLeft() <= f && f < rect.getRight() && rect.getTop() <= f2 && f2 < rect.getBottom();
    }

    public static /* synthetic */ boolean isInOutline$default(Outline outline, float f, float f2, Path path, Path path2, int i, Object obj) {
        if ((i & 8) != 0) {
            path = null;
        }
        if ((i & 16) != 0) {
            path2 = null;
        }
        return isInOutline(outline, f, f2, path, path2);
    }

    private static final boolean isInPath(Path path, float f, float f2, Path path2, Path path3) {
        Rect rect = new Rect(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        if (path2 == null) {
            path2 = AndroidPath_androidKt.Path();
        }
        Path.addRect$default(path2, rect, null, 2, null);
        if (path3 == null) {
            path3 = AndroidPath_androidKt.Path();
        }
        path3.mo611opN5in7k0(path, path2, PathOperation.Companion.m1032getIntersectb3I0S0c());
        boolean zIsEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !zIsEmpty;
    }
}
