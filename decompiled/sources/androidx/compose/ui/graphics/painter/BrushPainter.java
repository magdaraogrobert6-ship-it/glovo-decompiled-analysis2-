package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class BrushPainter extends Painter {
    public static final int $stable = 8;
    private float alpha = 1.0f;
    private final Brush brush;
    private ColorFilter colorFilter;

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f) {
        this.alpha = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo1424getIntrinsicSizeNHjbRc() {
        return this.brush.mo668getIntrinsicSizeNHjbRc();
    }

    public int hashCode() {
        return this.brush.hashCode();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        DrawScope.m1297drawRectAsUm42w$default(drawScope, this.brush, 0L, 0L, this.alpha, null, this.colorFilter, 0, 86, null);
    }

    public BrushPainter(Brush brush) {
        this.brush = brush;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrushPainter)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.brush, ((BrushPainter) obj).brush}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "BrushPainter(brush=" + this.brush + ')';
    }
}
