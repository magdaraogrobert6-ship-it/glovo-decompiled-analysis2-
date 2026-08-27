package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.createFromParcel;
import o.markOnScreenCardsAsReadlambda1;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class FlowKt__EmittersKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object access$invokeSafely$FlowKt__EmittersKt(ThrowingCollector throwingCollector, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, Throwable th, ContinuationImpl continuationImpl) {
        FlowKt__EmittersKt$invokeSafely$1 flowKt__EmittersKt$invokeSafely$1;
        if (continuationImpl instanceof FlowKt__EmittersKt$invokeSafely$1) {
            flowKt__EmittersKt$invokeSafely$1 = (FlowKt__EmittersKt$invokeSafely$1) continuationImpl;
            int i = flowKt__EmittersKt$invokeSafely$1.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__EmittersKt$invokeSafely$1.serializer = i - Integer.MIN_VALUE;
            } else {
                flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(continuationImpl);
            }
        } else {
            flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(continuationImpl);
        }
        Object obj = flowKt__EmittersKt$invokeSafely$1.read;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__EmittersKt$invokeSafely$1.serializer;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                flowKt__EmittersKt$invokeSafely$1.write = th;
                flowKt__EmittersKt$invokeSafely$1.serializer = 1;
                if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(throwingCollector, th, flowKt__EmittersKt$invokeSafely$1) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = flowKt__EmittersKt$invokeSafely$1.write;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createFromParcel.INSTANCE;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                markOnScreenCardsAsReadlambda1.read(th2, th);
            }
            throw th2;
        }
    }
}
