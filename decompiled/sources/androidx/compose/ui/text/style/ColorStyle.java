package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
final class ColorStyle implements TextForegroundStyle {
    private final long value;

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m3393component10d7_KjU() {
        return this.value;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public Brush getBrush() {
        return null;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    /* JADX INFO: renamed from: getColor-0d7_KjU */
    public long mo3391getColor0d7_KjU() {
        return this.value;
    }

    /* JADX INFO: renamed from: getValue-0d7_KjU, reason: not valid java name */
    public final long m3395getValue0d7_KjU() {
        return this.value;
    }

    public int hashCode() {
        return Color.m729hashCodeimpl(this.value);
    }

    private ColorStyle(long j) {
        this.value = j;
        if (j != 16) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    /* JADX INFO: renamed from: copy-8_81llA, reason: not valid java name */
    public final ColorStyle m3394copy8_81llA(long j) {
        return new ColorStyle(j, null);
    }

    /* JADX INFO: renamed from: copy-8_81llA$default, reason: not valid java name */
    public static /* synthetic */ ColorStyle m3392copy8_81llA$default(ColorStyle colorStyle, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = colorStyle.value;
        }
        return colorStyle.m3394copy8_81llA(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorStyle) && Color.m723equalsimpl0(this.value, ((ColorStyle) obj).value);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public float getAlpha() {
        return Color.m724getAlphaimpl(mo3391getColor0d7_KjU());
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) Color.m730toStringimpl(this.value)) + ')';
    }

    public /* synthetic */ ColorStyle(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }
}
