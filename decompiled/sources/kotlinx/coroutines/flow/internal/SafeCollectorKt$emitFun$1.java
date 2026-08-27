package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public static final SafeCollectorKt$emitFun$1 write = new SafeCollectorKt$emitFun$1(3, FlowCollector.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((FlowCollector) obj).emit(obj2, (ShortNewsContentCardView) obj3);
    }

    public SafeCollectorKt$emitFun$1(int i, Class cls, String str, String str2, int i2) {
        super(i, cls, str, str2, i2);
    }
}
