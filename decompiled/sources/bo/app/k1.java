package bo.app;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Number c;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(Number number, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.c = number;
        this.d = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        k1 k1Var = new k1(this.c, this.d, shortNewsContentCardView);
        k1Var.b = obj;
        return k1Var;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((k1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r9.invoke(r8) == r1) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            o.getContentViewGroupParentLayout r0 = (o.getContentViewGroupParentLayout) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r8.a
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1f
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L46
        L15:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            return r3
        L1b:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L33
        L1f:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            java.lang.Number r9 = r8.c
            long r6 = r9.longValue()
            r8.b = r0
            r8.a = r5
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r6, r8)
            if (r9 != r1) goto L33
            goto L45
        L33:
            boolean r9 = kotlinx.coroutines.YieldKt.write(r0)
            if (r9 == 0) goto L46
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r9 = r8.d
            r8.b = r3
            r8.a = r4
            java.lang.Object r9 = r9.invoke(r8)
            if (r9 != r1) goto L46
        L45:
            return r1
        L46:
            o.createFromParcel r9 = o.createFromParcel.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.k1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
