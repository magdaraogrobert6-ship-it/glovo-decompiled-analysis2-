package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createBrazeUserChangeEventSubscriberlambda0;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getContentViewGroupParentLayout;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public /* synthetic */ Object IconCompatParcelizer;
    public createBrazeUserChangeEventSubscriberlambda0 MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ Flow serializer;
    public createInAppMessageEventSubscriber write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Flow flow, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = flow;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.RemoteActionCompatParcelizer, this.serializer, (ShortNewsContentCardView) obj3);
        flowKt__DelayKt$debounceInternal$1.read = (getContentViewGroupParentLayout) obj;
        flowKt__DelayKt$debounceInternal$1.IconCompatParcelizer = (FlowCollector) obj2;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1 A[PHI: r8 r9 r10 r11
  0x00a1: PHI (r8v3 o.createInAppMessageEventSubscriber) = 
  (r8v5 o.createInAppMessageEventSubscriber)
  (r8v6 o.createInAppMessageEventSubscriber)
  (r8v6 o.createInAppMessageEventSubscriber)
 binds: [B:29:0x0097, B:15:0x0062, B:21:0x007d] A[DONT_GENERATE, DONT_INLINE]
  0x00a1: PHI (r9v3 o.onBackCancelledlambda3) = (r9v5 o.onBackCancelledlambda3), (r9v6 o.onBackCancelledlambda3), (r9v6 o.onBackCancelledlambda3) binds: [B:29:0x0097, B:15:0x0062, B:21:0x007d] A[DONT_GENERATE, DONT_INLINE]
  0x00a1: PHI (r10v2 kotlinx.coroutines.flow.FlowCollector) = 
  (r10v9 kotlinx.coroutines.flow.FlowCollector)
  (r10v10 kotlinx.coroutines.flow.FlowCollector)
  (r10v10 kotlinx.coroutines.flow.FlowCollector)
 binds: [B:29:0x0097, B:15:0x0062, B:21:0x007d] A[DONT_GENERATE, DONT_INLINE]
  0x00a1: PHI (r11v0 o.createBrazeUserChangeEventSubscriberlambda0) = 
  (r11v4 o.createBrazeUserChangeEventSubscriberlambda0)
  (r11v6 o.createBrazeUserChangeEventSubscriberlambda0)
  (r11v6 o.createBrazeUserChangeEventSubscriberlambda0)
 binds: [B:29:0x0097, B:15:0x0062, B:21:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:38:0x0118  */
    /* JADX WARN: Code duplicated, block: B:39:0x011d  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
