package bo.app;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getDefaultInAppMessageViewFactory;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public getDefaultInAppMessageViewFactory a;
    public int b;
    public final /* synthetic */ b c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new a(this.c, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return new a(this.c, (ShortNewsContentCardView) obj2).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getDefaultInAppMessageViewFactory getdefaultinappmessageviewfactory = this.c.a;
            this.a = getdefaultinappmessageviewfactory;
            this.b = 1;
            if (((SemaphoreAndMutexImpl) getdefaultinappmessageviewfactory).acquire(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = getdefaultinappmessageviewfactory;
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj3 = this.a;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            obj2 = obj3;
        }
        try {
            return createFromParcel.INSTANCE;
        } finally {
            ((SemaphoreAndMutexImpl) obj2).IconCompatParcelizer();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.c = bVar;
    }
}
