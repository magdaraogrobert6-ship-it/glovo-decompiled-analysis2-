package bo.app;

import coil3.ExtrasKt;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public c0(ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        return new c0(shortNewsContentCardView);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ReentrantLock reentrantLock = g0.l;
        reentrantLock.lock();
        try {
            g0.k = null;
            Iterator it = g0.m.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                a0 a0Var = (a0) it.next();
                try {
                    if (!a0Var.c) {
                        d0 d0Var = g0.i;
                        if (d0Var.a(a0Var)) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c0$$ExternalSyntheticLambda0(a0Var, 0), 7, (Object) null);
                            it.remove();
                        }
                    }
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g0.i, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c0$$ExternalSyntheticLambda0(a0Var, 1), 4, (Object) null);
                    it.remove();
                }
                reentrantLock.unlock();
                throw th;
            }
            ArrayList arrayList = g0.m;
            if (arrayList == null || !arrayList.isEmpty()) {
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (!((a0) obj2).c) {
                        if (g0.k == null) {
                            g0.k = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, 200L, null, new c0(null), 2, null);
                            break;
                        }
                        break;
                    }
                }
            }
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            reentrantLock.unlock();
            return createfromparcel;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String a(a0 a0Var) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Removing banner from monitor list ", a0Var.a);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        return new c0((ShortNewsContentCardView) obj).invokeSuspend(createFromParcel.INSTANCE);
    }

    public static final String b(a0 a0Var) {
        return ff$$ExternalSyntheticOutline0.m("Error checking banner visibility for ", a0Var.a, ".Removing banner from visibility monitoring.");
    }
}
