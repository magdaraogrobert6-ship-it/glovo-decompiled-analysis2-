package bo.app;

import android.content.BroadcastReceiver;
import coil3.ExtrasKt;
import com.braze.support.BrazeLogger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class q2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public /* synthetic */ Object a;
    public final /* synthetic */ t2 b;
    public final /* synthetic */ BroadcastReceiver.PendingResult c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(t2 t2Var, BroadcastReceiver.PendingResult pendingResult, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.b = t2Var;
        this.c = pendingResult;
    }

    public static final String a() {
        return "Failed to log throwable during seal session.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        q2 q2Var = new q2(this.b, this.c, shortNewsContentCardView);
        q2Var.a = obj;
        return q2Var;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((q2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        t2 t2Var = this.b;
        ReentrantLock reentrantLock = t2Var.g;
        reentrantLock.lock();
        try {
            try {
                t2Var.j();
            } catch (Exception e) {
                try {
                    t2Var.c.b(e, Throwable.class);
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) getcontentviewgroupparentlayout, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(17), 4, (Object) null);
                }
            }
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            reentrantLock.unlock();
            this.c.finish();
            return createfromparcel;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
