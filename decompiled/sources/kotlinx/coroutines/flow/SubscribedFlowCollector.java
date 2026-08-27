package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes4.dex */
public final class SubscribedFlowCollector<T> implements FlowCollector<T> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1, reason: invalid class name */
    final class AnonymousClass1 extends ContinuationImpl {
        public int RemoteActionCompatParcelizer;
        public /* synthetic */ Object serializer;

        public AnonymousClass1(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.serializer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            SubscribedFlowCollector.this.onSubscription(this);
            return createFromParcel.INSTANCE;
        }
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onSubscription(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = (kotlinx.coroutines.flow.SubscribedFlowCollector.AnonymousClass1) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.RemoteActionCompatParcelizer = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = new kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.serializer
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r0.RemoteActionCompatParcelizer
            r1 = 0
            if (r0 == 0) goto L38
            r2 = 1
            if (r0 == r2) goto L33
            r2 = 2
            if (r0 != r2) goto L2d
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r5)
            o.createFromParcel r5 = o.createFromParcel.INSTANCE
            return r5
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r5)
            return r1
        L33:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r5)     // Catch: java.lang.Throwable -> L37
            throw r1
        L37:
            throw r1
        L38:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SubscribedFlowCollector.onSubscription(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
