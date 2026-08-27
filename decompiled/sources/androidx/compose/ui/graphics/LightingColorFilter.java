package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes4.dex */
public final class LightingColorFilter extends ColorFilter {
    public static final int $stable = 0;
    private final long add;
    private final long multiply;

    /* JADX INFO: renamed from: getAdd-0d7_KjU, reason: not valid java name */
    public final long m962getAdd0d7_KjU() {
        return this.add;
    }

    /* JADX INFO: renamed from: getMultiply-0d7_KjU, reason: not valid java name */
    public final long m963getMultiply0d7_KjU() {
        return this.multiply;
    }

    public int hashCode() {
        return Color.m729hashCodeimpl(this.add) + (Color.m729hashCodeimpl(this.multiply) * 31);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LightingColorFilter)) {
            return false;
        }
        LightingColorFilter lightingColorFilter = (LightingColorFilter) obj;
        return Color.m723equalsimpl0(this.multiply, lightingColorFilter.multiply) && Color.m723equalsimpl0(this.add, lightingColorFilter.add);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LightingColorFilter(multiply=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(this.multiply, ", add=", sb);
        sb.append((Object) Color.m730toStringimpl(this.add));
        sb.append(')');
        return sb.toString();
    }

    private LightingColorFilter(long j, long j2) {
        this(j, j2, AndroidColorFilter_androidKt.m583actualLightingColorFilterOWjLjI(j, j2), null);
    }

    public /* synthetic */ LightingColorFilter(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    private LightingColorFilter(long j, long j2, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.multiply = j;
        this.add = j2;
    }

    public /* synthetic */ LightingColorFilter(long j, long j2, android.graphics.ColorFilter colorFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, colorFilter);
    }
}
