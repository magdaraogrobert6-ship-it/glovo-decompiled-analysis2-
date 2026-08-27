package o;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class accessgetNearcp extends FunctionReferenceImpl implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public static final accessgetNearcp serializer = new accessgetNearcp(2, MathKt.class, "min", "min(II)I", 1);

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }

    public accessgetNearcp(int i, Class cls, String str, String str2, int i2) {
        super(i, cls, str, str2, i2);
    }
}
