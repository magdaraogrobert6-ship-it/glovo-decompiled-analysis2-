package bo.app;

import coil3.ExtrasKt;
import com.braze.support.BrazeLogger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class kh extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public /* synthetic */ Object a;
    public final /* synthetic */ lh b;

    public static final String a() {
        return "User cache was locked, waiting.";
    }

    public static final String b() {
        return "User cache notified. Continuing UserDependencyManager shutdown";
    }

    public static final String c() {
        return "Device cache was locked, waiting.";
    }

    public static final String d() {
        return "Device cache notified. Continuing UserDependencyManager shutdown";
    }

    public static final String e() {
        return "Exception while shutting down dispatch manager. Continuing.";
    }

    public static final String f() {
        return "Exception while stopping data sync. Continuing.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        kh khVar = new kh(this.b, shortNewsContentCardView);
        khVar.a = obj;
        return khVar;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        kh khVar = new kh(this.b, (ShortNewsContentCardView) obj2);
        khVar.a = (getContentViewGroupParentLayout) obj;
        return khVar.invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh(lh lhVar, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.b = lhVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        try {
            SemaphoreAndMutexImpl semaphoreAndMutexImpl = (SemaphoreAndMutexImpl) this.b.a().a;
            semaphoreAndMutexImpl.getClass();
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = SemaphoreAndMutexImpl.IconCompatParcelizer;
            if (Math.max(atomicIntegerFieldUpdater.get(semaphoreAndMutexImpl), 0) == 0) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) getcontentviewgroupparentlayout, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(13), 6, (Object) null);
                ih ihVarA = this.b.a();
                ihVarA.getClass();
                BuildersKt.write(new a(ihVarA, null));
                BrazeLogger.brazelog$default(brazeLogger, (Object) getcontentviewgroupparentlayout, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(14), 7, (Object) null);
            }
            f5 f5Var = this.b.h;
            if (f5Var == null) {
                removeNodeAtDepth.serializer("deviceCache");
                throw null;
            }
            SemaphoreAndMutexImpl semaphoreAndMutexImpl2 = (SemaphoreAndMutexImpl) f5Var.a;
            semaphoreAndMutexImpl2.getClass();
            if (Math.max(atomicIntegerFieldUpdater.get(semaphoreAndMutexImpl2), 0) == 0) {
                BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger2, (Object) getcontentviewgroupparentlayout, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(15), 6, (Object) null);
                f5 f5Var2 = this.b.h;
                if (f5Var2 == null) {
                    removeNodeAtDepth.serializer("deviceCache");
                    throw null;
                }
                BuildersKt.write(new a(f5Var2, null));
                BrazeLogger.brazelog$default(brazeLogger2, (Object) getcontentviewgroupparentlayout, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(16), 7, (Object) null);
            }
            this.b.A.e();
            this.b.i.c();
            this.b.n.m();
            try {
                this.b.m.f();
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) getcontentviewgroupparentlayout, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(18), 4, (Object) null);
            }
            return createFromParcel.INSTANCE;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) getcontentviewgroupparentlayout, BrazeLogger.Priority.W, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(17), 4, (Object) null);
        }
    }
}
