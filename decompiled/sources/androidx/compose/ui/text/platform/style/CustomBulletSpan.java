package androidx.compose.ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.math.MathKt;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class CustomBulletSpan implements LeadingMarginSpan {
    public static final int $stable = DrawStyle.$stable;
    private final float alpha;
    private final Brush brush;
    private final float bulletHeightPx;
    private final float bulletWidthPx;
    private final Density density;
    private final int diff;
    private final DrawStyle drawStyle;
    private final int minimumRequiredIndent;
    private final Shape shape;

    public CustomBulletSpan(Shape shape, float f, float f2, float f3, Brush brush, float f4, DrawStyle drawStyle, Density density, float f5) {
        this.shape = shape;
        this.bulletWidthPx = f;
        this.bulletHeightPx = f2;
        this.brush = brush;
        this.alpha = f4;
        this.drawStyle = drawStyle;
        this.density = density;
        int iWrite = MathKt.write(f + f3);
        this.minimumRequiredIndent = iWrite;
        this.diff = MathKt.write(f5) - iWrite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel drawLeadingMargin$lambda$0$0(CustomBulletSpan customBulletSpan, long j, int i, Canvas canvas, Paint paint, int i2, float f) {
        BulletSpan_androidKt.draw(customBulletSpan.shape.mo24createOutlinePq9zytI(j, i > 0 ? LayoutDirection.Ltr : LayoutDirection.Rtl, customBulletSpan.density), canvas, paint, i2, f, i);
        return createFromParcel.INSTANCE;
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        int i = this.diff;
        if (i >= 0) {
            return 0;
        }
        return Math.abs(i);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(final Canvas canvas, final Paint paint, int i, final int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (canvas == null) {
            return;
        }
        final float f = (i3 + i5) / 2.0f;
        int i8 = i - this.minimumRequiredIndent;
        if (i8 < 0) {
            i8 = 0;
        }
        final int i9 = i8;
        charSequence.getClass();
        if (((Spanned) charSequence).getSpanStart(this) != i6 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        BulletSpan_androidKt.setDrawStyle(paint, this.drawStyle);
        final long jM537constructorimpl = Size.m537constructorimpl((((long) Float.floatToRawIntBits(this.bulletHeightPx)) & 4294967295L) | (((long) Float.floatToRawIntBits(this.bulletWidthPx)) << 32));
        BulletSpan_androidKt.m3367setBrushAndDrawyzxVdVo(paint, this.brush, this.alpha, jM537constructorimpl, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.text.platform.style.CustomBulletSpan$$ExternalSyntheticLambda0
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                return CustomBulletSpan.drawLeadingMargin$lambda$0$0(this.f$0, jM537constructorimpl, i2, canvas, paint, i9, f);
            }
        });
        paint.setStyle(style);
    }
}
