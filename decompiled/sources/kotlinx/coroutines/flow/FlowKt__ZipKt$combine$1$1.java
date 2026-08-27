package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__ZipKt$combine$1$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public /* synthetic */ Object[] IconCompatParcelizer;
    public /* synthetic */ FlowCollector RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY read;
    public int write;

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.read, (ShortNewsContentCardView) obj3);
        flowKt__ZipKt$combine$1$1.RemoteActionCompatParcelizer = (FlowCollector) obj;
        flowKt__ZipKt$combine$1$1.IconCompatParcelizer = (Object[]) obj2;
        return flowKt__ZipKt$combine$1$1.invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r1.emit(r7, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.write
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L17
            if (r1 != r2) goto L11
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
            goto L41
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r7)
            return r3
        L17:
            kotlinx.coroutines.flow.FlowCollector r1 = r6.RemoteActionCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
            goto L36
        L1d:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
            kotlinx.coroutines.flow.FlowCollector r1 = r6.RemoteActionCompatParcelizer
            java.lang.Object[] r7 = r6.IconCompatParcelizer
            r5 = 0
            r5 = r7[r5]
            r7 = r7[r4]
            r6.RemoteActionCompatParcelizer = r1
            r6.write = r4
            o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r4 = r6.read
            java.lang.Object r7 = r4.invoke(r5, r7, r6)
            if (r7 != r0) goto L36
            goto L40
        L36:
            r6.RemoteActionCompatParcelizer = r3
            r6.write = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L41
        L40:
            return r0
        L41:
            o.createFromParcel r7 = o.createFromParcel.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$1$1(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.read = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
    }
}
