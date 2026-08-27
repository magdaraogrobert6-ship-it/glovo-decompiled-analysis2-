package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__MergeKt$mapLatest$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public /* synthetic */ FlowCollector IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 write;

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowKt__MergeKt$mapLatest$1 flowKt__MergeKt$mapLatest$1 = new FlowKt__MergeKt$mapLatest$1(this.write, (ShortNewsContentCardView) obj3);
        flowKt__MergeKt$mapLatest$1.IconCompatParcelizer = (FlowCollector) obj;
        flowKt__MergeKt$mapLatest$1.RemoteActionCompatParcelizer = obj2;
        return flowKt__MergeKt$mapLatest$1.invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.read
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L17
            if (r1 != r2) goto L11
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r6)
            goto L3c
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r6)
            return r3
        L17:
            kotlinx.coroutines.flow.FlowCollector r1 = r5.IconCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r6)
            goto L31
        L1d:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r6)
            kotlinx.coroutines.flow.FlowCollector r1 = r5.IconCompatParcelizer
            java.lang.Object r6 = r5.RemoteActionCompatParcelizer
            r5.IconCompatParcelizer = r1
            r5.read = r4
            o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r4 = r5.write
            java.lang.Object r6 = r4.invoke(r6, r5)
            if (r6 != r0) goto L31
            goto L3b
        L31:
            r5.IconCompatParcelizer = r3
            r5.read = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L3c
        L3b:
            return r0
        L3c:
            o.createFromParcel r6 = o.createFromParcel.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MergeKt$mapLatest$1(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.write = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }
}
