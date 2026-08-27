package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ShadowRenderer {
    public static final int $stable = 8;
    private final Outline outline;
    private Path path;
    private ColorFilter shadowTint;
    private long shadowTintColor = Color.Companion.m758getUnspecified0d7_KjU();
    private long cornerRadius = CornerRadius.Companion.m449getZerokKHJgLs();
    private long generatedSize = Size.Companion.m554getUnspecifiedNHjbRc();
    private LayoutDirection generatedLayoutDirection = LayoutDirection.Ltr;
    private float generatedDensity = 1.0f;

    /* JADX INFO: renamed from: buildShadow-_SMYjrA */
    public abstract void mo1442buildShadow_SMYjrA(DrawScope drawScope, long j, long j2, Path path);

    public final Outline getOutline() {
        return this.outline;
    }

    /* JADX INFO: renamed from: onDrawShadow-MLmccfk */
    public abstract void mo1443onDrawShadowMLmccfk(DrawScope drawScope, long j, long j2, Path path, float f, ColorFilter colorFilter, Brush brush, int i);

    /* JADX INFO: renamed from: drawShadow-erFMhIw, reason: not valid java name */
    public final void m1453drawShadowerFMhIw(DrawScope drawScope, ColorFilter colorFilter, long j, long j2, Brush brush, float f, int i) {
        ColorFilter colorFilterM1452obtainTint8_81llA;
        updateParamsFromOutline(this.outline);
        if (colorFilter != null) {
            colorFilterM1452obtainTint8_81llA = colorFilter;
        } else {
            colorFilterM1452obtainTint8_81llA = (brush != null || j2 == 16) ? null : m1452obtainTint8_81llA(j2);
        }
        long j3 = this.generatedSize;
        if (j3 == InlineClassHelperKt.UnspecifiedPackedFloats || !Size.m542equalsimpl0(j3, j) || this.generatedLayoutDirection != drawScope.getLayoutDirection() || this.generatedDensity != drawScope.getDensity()) {
            mo1442buildShadow_SMYjrA(drawScope, j, this.cornerRadius, this.path);
            this.generatedSize = j;
            this.generatedLayoutDirection = drawScope.getLayoutDirection();
            this.generatedDensity = drawScope.getDensity();
        }
        mo1443onDrawShadowMLmccfk(drawScope, j, this.cornerRadius, this.path, f, colorFilterM1452obtainTint8_81llA, brush, i);
    }

    public void invalidateShadow() {
        this.generatedSize = Size.Companion.m554getUnspecifiedNHjbRc();
        this.generatedLayoutDirection = LayoutDirection.Ltr;
        this.generatedDensity = 1.0f;
    }

    public ShadowRenderer(Outline outline) {
        this.outline = outline;
    }

    /* JADX INFO: renamed from: obtainTint-8_81llA, reason: not valid java name */
    private final ColorFilter m1452obtainTint8_81llA(long j) {
        ColorFilter colorFilter = this.shadowTint;
        if (colorFilter != null && Color.m723equalsimpl0(this.shadowTintColor, j)) {
            return colorFilter;
        }
        ColorFilter colorFilterM763tintxETnrds$default = ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, j, 0, 2, null);
        this.shadowTintColor = j;
        this.shadowTint = colorFilterM763tintxETnrds$default;
        return colorFilterM763tintxETnrds$default;
    }

    private final void updateParamsFromOutline(Outline outline) {
        if (outline instanceof Outline.Generic) {
            this.path = ((Outline.Generic) outline).getPath();
            this.cornerRadius = CornerRadius.Companion.m449getZerokKHJgLs();
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Rectangle)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            } else {
                this.path = null;
                this.cornerRadius = CornerRadius.Companion.m449getZerokKHJgLs();
                return;
            }
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            this.path = null;
            this.cornerRadius = rounded.getRoundRect().m527getTopLeftCornerRadiuskKHJgLs();
        } else {
            this.path = rounded.getRoundRectPath$ui_graphics();
            this.cornerRadius = CornerRadius.Companion.m449getZerokKHJgLs();
        }
    }
}
