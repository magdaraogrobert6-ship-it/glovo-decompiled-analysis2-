package bo.app;

import android.content.BroadcastReceiver;
import android.content.Intent;
import coil3.ExtrasKt;
import com.braze.support.BrazeLogger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class n4 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public /* synthetic */ Object a;
    public final /* synthetic */ q4 b;
    public final /* synthetic */ Intent c;
    public final /* synthetic */ BroadcastReceiver.PendingResult d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(q4 q4Var, Intent intent, BroadcastReceiver.PendingResult pendingResult, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.b = q4Var;
        this.c = intent;
        this.d = pendingResult;
    }

    public static final String a() {
        return "Retrieving connectivity event data in background";
    }

    public static final String b() {
        return "Failed to process connectivity event.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        n4 n4Var = new n4(this.b, this.c, this.d, shortNewsContentCardView);
        n4Var.a = obj;
        return n4Var;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((n4) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) getcontentviewgroupparentlayout, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(0), 6, (Object) null);
        try {
            q4 q4Var = this.b;
            kb kbVar = q4Var.j;
            q4Var.j = com.braze.support.b.a(this.c, q4Var.i);
            q4 q4Var2 = this.b;
            kb kbVar2 = q4Var2.j;
            if (kbVar != kbVar2) {
                q4Var2.b.b(new lb(kbVar, kbVar2), lb.class);
            }
            this.b.b();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) getcontentviewgroupparentlayout, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(1), 4, (Object) null);
            q4 q4Var3 = this.b;
            q4Var3.a(q4Var3.b, e);
        }
        this.d.finish();
        return createFromParcel.INSTANCE;
    }
}
