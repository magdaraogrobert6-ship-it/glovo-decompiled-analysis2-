package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import bo.app.af$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class Bullet implements AnnotatedString.Annotation {
    private static final Bullet Default;
    private static final long DefaultPadding;
    private static final long DefaultSize;
    private final float alpha;
    private final Brush brush;
    private final DrawStyle drawStyle;
    private final long height;
    private final long padding;
    private final Shape shape;
    private final long width;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = DrawStyle.$stable;
    private static final long DefaultIndentation = TextUnitKt.getEm(1);

    public final float getAlpha() {
        return this.alpha;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    /* JADX INFO: renamed from: getHeight-XSAIIZE, reason: not valid java name */
    public final long m2890getHeightXSAIIZE() {
        return this.height;
    }

    /* JADX INFO: renamed from: getPadding-XSAIIZE, reason: not valid java name */
    public final long m2891getPaddingXSAIIZE() {
        return this.padding;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: getWidth-XSAIIZE, reason: not valid java name */
    public final long m2892getWidthXSAIIZE() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = this.shape.hashCode();
        int iM3868hashCodeimpl = TextUnit.m3868hashCodeimpl(this.width);
        int iM3868hashCodeimpl2 = TextUnit.m3868hashCodeimpl(this.height);
        int iM3868hashCodeimpl3 = TextUnit.m3868hashCodeimpl(this.padding);
        Brush brush = this.brush;
        return this.drawStyle.hashCode() + af$$ExternalSyntheticOutline1.m(this.alpha, (((iM3868hashCodeimpl3 + ((iM3868hashCodeimpl2 + ((iM3868hashCodeimpl + (iHashCode * 31)) * 31)) * 31)) * 31) + (brush != null ? brush.hashCode() : 0)) * 31, 31);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bullet getDefault() {
            return Bullet.Default;
        }

        /* JADX INFO: renamed from: getDefaultIndentation-XSAIIZE, reason: not valid java name */
        public final long m2893getDefaultIndentationXSAIIZE() {
            return Bullet.DefaultIndentation;
        }

        /* JADX INFO: renamed from: getDefaultPadding-XSAIIZE, reason: not valid java name */
        public final long m2894getDefaultPaddingXSAIIZE() {
            return Bullet.DefaultPadding;
        }

        /* JADX INFO: renamed from: getDefaultSize-XSAIIZE, reason: not valid java name */
        public final long m2895getDefaultSizeXSAIIZE() {
            return Bullet.DefaultSize;
        }

        private Companion() {
        }
    }

    static {
        long em = TextUnitKt.getEm(0.25d);
        DefaultSize = em;
        long em2 = TextUnitKt.getEm(0.25d);
        DefaultPadding = em2;
        Default = new Bullet(CircleShape.INSTANCE, em, em, em2, null, 0.0f, null, 112, null);
    }

    public String toString() {
        return "Bullet(shape=" + this.shape + ", size=(" + ((Object) TextUnit.m3874toStringimpl(this.width)) + ", " + ((Object) TextUnit.m3874toStringimpl(this.height)) + "), padding=" + ((Object) TextUnit.m3874toStringimpl(this.padding)) + ", brush=" + this.brush + ", alpha=" + this.alpha + ", drawStyle=" + this.drawStyle + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof Bullet)) {
            Bullet bullet = (Bullet) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shape, bullet.shape}, getCieXyz.write())).booleanValue() || !TextUnit.m3864equalsimpl0(this.width, bullet.width) || !TextUnit.m3864equalsimpl0(this.height, bullet.height) || !TextUnit.m3864equalsimpl0(this.padding, bullet.padding)) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.brush, bullet.brush}, getCieXyz.write())).booleanValue() && this.alpha == bullet.alpha) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.drawStyle, bullet.drawStyle}, getCieXyz.write())).booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: copy-w_4Rhrw, reason: not valid java name */
    public final Bullet m2889copyw_4Rhrw(Shape shape, long j, long j2, long j3, Brush brush, float f, DrawStyle drawStyle) {
        return new Bullet(shape, j, j2, j3, brush, f, drawStyle, null);
    }

    public /* synthetic */ Bullet(Shape shape, long j, long j2, long j3, Brush brush, float f, DrawStyle drawStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(shape, j, j2, j3, (i & 16) != 0 ? null : brush, (i & 32) != 0 ? Float.NaN : f, (i & 64) != 0 ? Fill.INSTANCE : drawStyle, null);
    }

    private Bullet(Shape shape, long j, long j2, long j3, Brush brush, float f, DrawStyle drawStyle) {
        this.shape = shape;
        this.width = j;
        this.height = j2;
        this.padding = j3;
        this.brush = brush;
        this.alpha = f;
        this.drawStyle = drawStyle;
    }

    public /* synthetic */ Bullet(Shape shape, long j, long j2, long j3, Brush brush, float f, DrawStyle drawStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(shape, j, j2, j3, brush, f, drawStyle);
    }
}
