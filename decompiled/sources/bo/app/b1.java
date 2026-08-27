package bo.app;

import coil3.ExtrasKt;
import com.braze.Braze;
import com.braze.support.BrazeLogger;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class b1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Braze d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 f;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(boolean z, Braze braze, Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.c = z;
        this.d = braze;
        this.e = obj;
        this.f = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.g = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        b1 b1Var = new b1(this.c, this.d, this.e, this.f, this.g, shortNewsContentCardView);
        b1Var.b = obj;
        return b1Var;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((b1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (this.c && this.d.udm == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) getcontentviewgroupparentlayout, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b1$$ExternalSyntheticLambda0(0, this.g), 6, (Object) null);
            return this.e;
        }
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.f;
        this.b = null;
        this.a = 1;
        Object objInvoke = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getcontentviewgroupparentlayout, this);
        return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
    }

    public static final String a(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return m1$$ExternalSyntheticOutline0.m(r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke(), "Early returning because the Braze instance isn't fully initialized. Always use Braze.getInstance(context) to get the latest Braze instance. Please report to Braze if the issue continues. > ");
    }
}
