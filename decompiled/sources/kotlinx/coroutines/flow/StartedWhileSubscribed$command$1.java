package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes4.dex */
final class StartedWhileSubscribed$command$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ StartedWhileSubscribed RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ FlowCollector write;

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.RemoteActionCompatParcelizer, (ShortNewsContentCardView) obj3);
        startedWhileSubscribed$command$1.write = (FlowCollector) obj;
        startedWhileSubscribed$command$1.IconCompatParcelizer = iIntValue;
        return startedWhileSubscribed$command$1.invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c A[PHI: r0
  0x006c: PHI (r0v5 kotlinx.coroutines.flow.FlowCollector) = (r0v4 kotlinx.coroutines.flow.FlowCollector), (r0v8 kotlinx.coroutines.flow.FlowCollector) binds: [B:28:0x0069, B:13:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0077 A[PHI: r0
  0x0077: PHI (r0v6 kotlinx.coroutines.flow.FlowCollector) = 
  (r0v4 kotlinx.coroutines.flow.FlowCollector)
  (r0v5 kotlinx.coroutines.flow.FlowCollector)
  (r0v9 kotlinx.coroutines.flow.FlowCollector)
 binds: [B:26:0x005d, B:31:0x0074, B:12:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r13.emit(r0, r12) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        if (r0.emit(r13, r12) == r3) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlinx.coroutines.flow.StartedWhileSubscribed r0 = r12.RemoteActionCompatParcelizer
            long r1 = r0.read
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r12.read
            r5 = 4
            r6 = 5
            r7 = 0
            r8 = 3
            r9 = 2
            r10 = 1
            if (r4 == 0) goto L37
            if (r4 == r10) goto L33
            if (r4 == r9) goto L2d
            if (r4 == r8) goto L27
            if (r4 == r5) goto L21
            if (r4 != r6) goto L1b
            goto L33
        L1b:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r13)
            return r7
        L21:
            kotlinx.coroutines.flow.FlowCollector r0 = r12.write
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r13)
            goto L77
        L27:
            kotlinx.coroutines.flow.FlowCollector r0 = r12.write
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r13)
            goto L6c
        L2d:
            kotlinx.coroutines.flow.FlowCollector r0 = r12.write
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r13)
            goto L59
        L33:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r13)
            goto L84
        L37:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r13)
            kotlinx.coroutines.flow.FlowCollector r13 = r12.write
            int r4 = r12.IconCompatParcelizer
            if (r4 <= 0) goto L4b
            kotlinx.coroutines.flow.SharingCommand r0 = kotlinx.coroutines.flow.SharingCommand.START
            r12.read = r10
            java.lang.Object r13 = r13.emit(r0, r12)
            if (r13 != r3) goto L84
            goto L83
        L4b:
            long r10 = r0.IconCompatParcelizer
            r12.write = r13
            r12.read = r9
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r10, r12)
            if (r0 != r3) goto L58
            goto L83
        L58:
            r0 = r13
        L59:
            r9 = 0
            int r13 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r13 <= 0) goto L77
            kotlinx.coroutines.flow.SharingCommand r13 = kotlinx.coroutines.flow.SharingCommand.STOP
            r12.write = r0
            r12.read = r8
            java.lang.Object r13 = r0.emit(r13, r12)
            if (r13 != r3) goto L6c
            goto L83
        L6c:
            r12.write = r0
            r12.read = r5
            java.lang.Object r13 = kotlinx.coroutines.DelayKt.delay(r1, r12)
            if (r13 != r3) goto L77
            goto L83
        L77:
            kotlinx.coroutines.flow.SharingCommand r13 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE
            r12.write = r7
            r12.read = r6
            java.lang.Object r13 = r0.emit(r13, r12)
            if (r13 != r3) goto L84
        L83:
            return r3
        L84:
            o.createFromParcel r13 = o.createFromParcel.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedWhileSubscribed$command$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(StartedWhileSubscribed startedWhileSubscribed, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = startedWhileSubscribed;
    }
}
