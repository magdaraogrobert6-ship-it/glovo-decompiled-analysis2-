package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__DelayKt$fixedPeriodTicker$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ long RemoteActionCompatParcelizer;
    public int serializer;
    public /* synthetic */ Object write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        FlowKt__DelayKt$fixedPeriodTicker$1 flowKt__DelayKt$fixedPeriodTicker$1 = new FlowKt__DelayKt$fixedPeriodTicker$1(this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        flowKt__DelayKt$fixedPeriodTicker$1.write = obj;
        return flowKt__DelayKt$fixedPeriodTicker$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__DelayKt$fixedPeriodTicker$1) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c A[PHI: r1
  0x003c: PHI (r1v3 o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) = 
  (r1v2 o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1)
  (r1v4 o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1)
  (r1v6 o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1)
 binds: [B:15:0x003b, B:20:0x0059, B:11:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0051 A[PHI: r1
  0x0051: PHI (r1v4 o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) = 
  (r1v3 o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1)
  (r1v8 o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1)
 binds: [B:17:0x004e, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0059 -> B:16:0x003c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.serializer
            long r2 = r7.RemoteActionCompatParcelizer
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L29
            if (r1 == r6) goto L21
            if (r1 == r5) goto L19
            if (r1 != r4) goto L12
            goto L21
        L12:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
            r8 = 0
            return r8
        L19:
            java.lang.Object r1 = r7.write
            o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 r1 = (o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) r1
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            goto L51
        L21:
            java.lang.Object r1 = r7.write
            o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 r1 = (o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) r1
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            goto L3c
        L29:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            java.lang.Object r8 = r7.write
            o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 r8 = (o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) r8
            r7.write = r8
            r7.serializer = r6
            java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r2, r7)
            if (r1 != r0) goto L3b
            goto L5b
        L3b:
            r1 = r8
        L3c:
            r8 = r1
            kotlinx.coroutines.channels.ProducerCoroutine r8 = (kotlinx.coroutines.channels.ProducerCoroutine) r8
            r8.getClass()
            r7.write = r1
            r7.serializer = r5
            kotlinx.coroutines.channels.BufferedChannel r8 = r8.read
            o.createFromParcel r6 = o.createFromParcel.INSTANCE
            java.lang.Object r8 = r8.serializer(r6, r7)
            if (r8 != r0) goto L51
            goto L5b
        L51:
            r7.write = r1
            r7.serializer = r4
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r2, r7)
            if (r8 != r0) goto L3c
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$fixedPeriodTicker$1(long j, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = j;
    }
}
