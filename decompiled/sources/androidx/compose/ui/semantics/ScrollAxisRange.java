package androidx.compose.ui.semantics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.IconCompatParcelizer;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollAxisRange {
    public static final int $stable = 0;
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 maxValue;
    private final boolean reverseScrolling;
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 value;

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getMaxValue() {
        return this.maxValue;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getValue() {
        return this.value;
    }

    public ScrollAxisRange(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, boolean z) {
        this.value = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.maxValue = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.reverseScrolling = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(((Number) this.value.invoke()).floatValue());
        sb.append(", maxValue=");
        sb.append(((Number) this.maxValue.invoke()).floatValue());
        sb.append(", reverseScrolling=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.reverseScrolling, ')');
    }

    public /* synthetic */ ScrollAxisRange(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (i & 4) != 0 ? false : z);
    }
}
