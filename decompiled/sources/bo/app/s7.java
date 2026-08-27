package bo.app;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setCustomInAppMessageAnimationFactorylambda0;

/* JADX INFO: loaded from: classes.dex */
public final class s7 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public setCustomInAppMessageAnimationFactorylambda0 a;
    public u7 b;
    public String c;
    public int d;
    public final /* synthetic */ u7 e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(u7 u7Var, String str, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.e = u7Var;
        this.f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new s7(this.e, this.f, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return new s7(this.e, this.f, (ShortNewsContentCardView) obj2).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        u7 u7Var;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            u7Var = this.e;
            setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = u7Var.b;
            String str2 = this.f;
            this.a = setcustominappmessageanimationfactorylambda1;
            this.b = u7Var;
            this.c = str2;
            this.d = 1;
            if (setcustominappmessageanimationfactorylambda1.lock(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
            str = str2;
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = this.c;
            u7Var = this.b;
            setcustominappmessageanimationfactorylambda0 = this.a;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        try {
            Map mapA = u7Var.a();
            mapA.remove(str);
            u7.a(u7Var, mapA);
            return createFromParcel.INSTANCE;
        } finally {
            setcustominappmessageanimationfactorylambda0.write(null);
        }
    }
}
