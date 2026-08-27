package bo.app;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class p4 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public long a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ q4 d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(q4 q4Var, long j, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.d = q4Var;
        this.e = j;
    }

    public static final String a() {
        return "Requesting data flush from automatic sync policy";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        p4 p4Var = new p4(this.d, this.e, shortNewsContentCardView);
        p4Var.c = obj;
        return p4Var;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((p4) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:21:0x007c  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r4, r14) == r1) goto L19;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0057 -> B:20:0x005a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.c
            o.getContentViewGroupParentLayout r0 = (o.getContentViewGroupParentLayout) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r14.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L16
            long r4 = r14.a
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r15)
            goto L5a
        L16:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r15)
            r15 = 0
            return r15
        L1d:
            long r4 = r14.a
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r15)
            goto L3a
        L23:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r15)
            bo.app.q4 r15 = r14.d
            long r5 = r15.g
            long r7 = r14.e
            r14.c = r0
            r14.a = r5
            r14.b = r4
            java.lang.Object r15 = kotlinx.coroutines.DelayKt.delay(r7, r14)
            if (r15 != r1) goto L39
            goto L59
        L39:
            r4 = r5
        L3a:
            com.braze.Braze$Companion r15 = com.braze.Braze.Companion
            bo.app.q4 r2 = r14.d
            android.content.Context r2 = r2.a
            com.braze.Braze r15 = r15.getInstance(r2)
            r15.requestImmediateDataFlush()
        L47:
            boolean r15 = kotlinx.coroutines.YieldKt.write(r0)
            if (r15 == 0) goto L7c
            r14.c = r0
            r14.a = r4
            r14.b = r3
            java.lang.Object r15 = kotlinx.coroutines.DelayKt.delay(r4, r14)
            if (r15 != r1) goto L5a
        L59:
            return r1
        L5a:
            com.braze.support.BrazeLogger r6 = com.braze.support.BrazeLogger.INSTANCE
            java.lang.String r7 = bo.app.q4.m
            com.braze.support.BrazeLogger$Priority r8 = com.braze.support.BrazeLogger.Priority.V
            bo.app.o8$$ExternalSyntheticLambda6 r11 = new bo.app.o8$$ExternalSyntheticLambda6
            r15 = 4
            r11.<init>(r15)
            r9 = 0
            r10 = 0
            r12 = 12
            r13 = 0
            com.braze.support.BrazeLogger.brazelog$default(r6, r7, r8, r9, r10, r11, r12, r13)
            com.braze.Braze$Companion r15 = com.braze.Braze.Companion
            bo.app.q4 r2 = r14.d
            android.content.Context r2 = r2.a
            com.braze.Braze r15 = r15.getInstance(r2)
            r15.requestImmediateDataFlush()
            goto L47
        L7c:
            o.createFromParcel r15 = o.createFromParcel.INSTANCE
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.p4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
