package kotlinx.coroutines.flow;

import o.createInAppMessageEventSubscriber;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__TransformKt$runningFold$1$1<T> implements FlowCollector {
    public final /* synthetic */ FlowCollector IconCompatParcelizer;
    public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY read;
    public final /* synthetic */ createInAppMessageEventSubscriber write;

    public FlowKt__TransformKt$runningFold$1$1(createInAppMessageEventSubscriber createinappmessageeventsubscriber, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, FlowCollector flowCollector) {
        this.write = createinappmessageeventsubscriber;
        this.read = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.IconCompatParcelizer = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r8.emit(r9, r0) == r1) goto L22;
     */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, o.ShortNewsContentCardView r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.write = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.RemoteActionCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.write
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L6a
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
            return r5
        L31:
            o.createInAppMessageEventSubscriber r8 = r0.IconCompatParcelizer
            java.lang.Object r2 = r0.read
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1 r2 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1) r2
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L55
        L3b:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            o.createInAppMessageEventSubscriber r9 = r7.write
            java.lang.Object r2 = r9.IconCompatParcelizer
            r0.read = r7
            r0.IconCompatParcelizer = r9
            r0.write = r4
            o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r4 = r7.read
            java.lang.Object r8 = r4.invoke(r2, r8, r0)
            if (r8 != r1) goto L51
            goto L69
        L51:
            r2 = r7
            r6 = r9
            r9 = r8
            r8 = r6
        L55:
            r8.IconCompatParcelizer = r9
            kotlinx.coroutines.flow.FlowCollector r8 = r2.IconCompatParcelizer
            o.createInAppMessageEventSubscriber r9 = r2.write
            java.lang.Object r9 = r9.IconCompatParcelizer
            r0.read = r5
            r0.IconCompatParcelizer = r5
            r0.write = r3
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r1) goto L6a
        L69:
            return r1
        L6a:
            o.createFromParcel r8 = o.createFromParcel.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1.emit(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
    }
}
