package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.createInAppMessageEventSubscriber;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 implements Flow<Object> {
    public final /* synthetic */ Flow IconCompatParcelizer;
    public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY serializer;
    public final /* synthetic */ Object write;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int IconCompatParcelizer;
        public FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 RemoteActionCompatParcelizer;
        public FlowCollector read;
        public /* synthetic */ Object serializer;
        public createInAppMessageEventSubscriber write;

        public AnonymousClass1(ShortNewsContentCardView shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.serializer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0, Flow flow, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        this.write = onviewattachedtowindowlambda0;
        this.IconCompatParcelizer = flow;
        this.serializer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r9.collect(r6, r0) == r1) goto L22;
     */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r8, o.ShortNewsContentCardView r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.IconCompatParcelizer = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.serializer
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.IconCompatParcelizer
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L6d
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
            return r5
        L31:
            o.createInAppMessageEventSubscriber r8 = r0.write
            kotlinx.coroutines.flow.FlowCollector r2 = r0.read
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 r4 = r0.RemoteActionCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L55
        L3b:
            o.createInAppMessageEventSubscriber r9 = bo.app.c8$$ExternalSyntheticOutline0.m3979m(r9)
            java.lang.Object r2 = r7.write
            r9.IconCompatParcelizer = r2
            r0.RemoteActionCompatParcelizer = r7
            r0.read = r8
            r0.write = r9
            r0.IconCompatParcelizer = r4
            java.lang.Object r2 = r8.emit(r2, r0)
            if (r2 != r1) goto L52
            goto L6c
        L52:
            r4 = r7
            r2 = r8
            r8 = r9
        L55:
            kotlinx.coroutines.flow.Flow r9 = r4.IconCompatParcelizer
            o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r4 = r4.serializer
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1 r6 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1
            r6.<init>(r8, r4, r2)
            r0.RemoteActionCompatParcelizer = r5
            r0.read = r5
            r0.write = r5
            r0.IconCompatParcelizer = r3
            java.lang.Object r8 = r9.collect(r6, r0)
            if (r8 != r1) goto L6d
        L6c:
            return r1
        L6d:
            o.createFromParcel r8 = o.createFromParcel.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.collect(kotlinx.coroutines.flow.FlowCollector, o.ShortNewsContentCardView):java.lang.Object");
    }
}
