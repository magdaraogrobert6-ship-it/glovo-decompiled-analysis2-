package androidx.compose.ui.layout;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.math.MathKt;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AlignmentLineKt$LastBaseline$1 extends FunctionReferenceImpl implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public static final AlignmentLineKt$LastBaseline$1 INSTANCE = new AlignmentLineKt$LastBaseline$1();

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
    }

    public AlignmentLineKt$LastBaseline$1() {
        super(2, MathKt.class, "max", "max(II)I", 1);
    }

    public final Integer invoke(int i, int i2) {
        return Integer.valueOf(Math.max(i, i2));
    }
}
