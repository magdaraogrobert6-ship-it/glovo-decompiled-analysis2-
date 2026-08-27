package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes.dex */
public final class BlendModeColorFilter extends ColorFilter {
    public static final int $stable = 0;
    private final int blendMode;
    private final long color;

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m664getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m665getColor0d7_KjU() {
        return this.color;
    }

    public int hashCode() {
        return BlendMode.m632hashCodeimpl(this.blendMode) + (Color.m729hashCodeimpl(this.color) * 31);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlendModeColorFilter)) {
            return false;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) obj;
        return Color.m723equalsimpl0(this.color, blendModeColorFilter.color) && BlendMode.m631equalsimpl0(this.blendMode, blendModeColorFilter.blendMode);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(this.color, ", blendMode=", sb);
        sb.append((Object) BlendMode.m633toStringimpl(this.blendMode));
        sb.append(')');
        return sb.toString();
    }

    private BlendModeColorFilter(long j, int i) {
        this(j, i, AndroidColorFilter_androidKt.m584actualTintColorFilterxETnrds(j, i), null);
    }

    public /* synthetic */ BlendModeColorFilter(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i);
    }

    private BlendModeColorFilter(long j, int i, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.color = j;
        this.blendMode = i;
    }

    public /* synthetic */ BlendModeColorFilter(long j, int i, android.graphics.ColorFilter colorFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, colorFilter);
    }
}
