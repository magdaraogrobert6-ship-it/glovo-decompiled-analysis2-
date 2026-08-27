package bo.app;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setCustomInAppMessageAnimationFactorylambda0;

/* JADX INFO: loaded from: classes.dex */
public final class r7 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public setCustomInAppMessageAnimationFactorylambda0 a;
    public u7 b;
    public String c;
    public long d;
    public int e;
    public final /* synthetic */ u7 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(u7 u7Var, String str, long j, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.f = u7Var;
        this.g = str;
        this.h = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new r7(this.f, this.g, this.h, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((r7) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        u7 u7Var;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        String str;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.e;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            u7Var = this.f;
            setcustominappmessageanimationfactorylambda0 = u7Var.b;
            String str2 = this.g;
            long j2 = this.h;
            this.a = setcustominappmessageanimationfactorylambda0;
            this.b = u7Var;
            this.c = str2;
            this.d = j2;
            this.e = 1;
            if (setcustominappmessageanimationfactorylambda0.lock(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = str2;
            j = j2;
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.d;
            str = this.c;
            u7Var = this.b;
            setcustominappmessageanimationfactorylambda0 = this.a;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        try {
            Map mapA = u7Var.a();
            mapA.put(str, new Long(j));
            u7.a(u7Var, mapA);
            return createFromParcel.INSTANCE;
        } finally {
            setcustominappmessageanimationfactorylambda0.write(null);
        }
    }
}
