package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class SolidColor extends Brush implements Interpolatable {
    public static final int $stable = 0;
    private final long value;

    private SolidColor(long j) {
        super(null);
        this.value = j;
    }

    /* JADX INFO: renamed from: getValue-0d7_KjU, reason: not valid java name */
    public final long m1081getValue0d7_KjU() {
        return this.value;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* JADX INFO: renamed from: applyTo-Pq9zytI */
    public void mo667applyToPq9zytI(long j, Paint paint, float f) {
        paint.setAlpha(1.0f);
        long jM721copywmQWz5c$default = this.value;
        if (f != 1.0f) {
            jM721copywmQWz5c$default = Color.m721copywmQWz5c$default(jM721copywmQWz5c$default, Color.m724getAlphaimpl(jM721copywmQWz5c$default) * f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        paint.mo598setColor8_81llA(jM721copywmQWz5c$default);
        if (paint.getShader() != null) {
            paint.setShader(null);
        }
    }

    public int hashCode() {
        return Color.m729hashCodeimpl(this.value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SolidColor) && Color.m723equalsimpl0(this.value, ((SolidColor) obj).value);
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) Color.m730toStringimpl(this.value)) + ')';
    }

    @Override // androidx.compose.ui.graphics.Interpolatable
    public Object lerp(Object obj, float f) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (obj == null) {
            obj = new SolidColor(Color.Companion.m757getTransparent0d7_KjU(), defaultConstructorMarker);
        }
        if (obj instanceof SolidColor) {
            return new SolidColor(ColorKt.m773lerpjxsXWHM(this.value, ((SolidColor) obj).value, f), defaultConstructorMarker);
        }
        return null;
    }

    public /* synthetic */ SolidColor(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }
}
