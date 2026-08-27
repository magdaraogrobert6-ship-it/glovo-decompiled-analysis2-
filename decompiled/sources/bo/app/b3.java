package bo.app;

import coil3.ExtrasKt;
import com.braze.BrazeUser;
import com.braze.enums.Gender;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class b3 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ BrazeUser a;
    public final /* synthetic */ Gender b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(BrazeUser brazeUser, Gender gender, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.a = brazeUser;
        this.b = gender;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new b3(this.a, this.b, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return new b3(this.a, this.b, (ShortNewsContentCardView) obj2).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strForJsonPut;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ih ihVar = this.a.userCache;
        Gender gender = this.b;
        synchronized (ihVar) {
            if (gender != null) {
                try {
                    strForJsonPut = gender.forJsonPut();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                strForJsonPut = null;
            }
            ihVar.c("gender", strForJsonPut);
        }
        return createFromParcel.INSTANCE;
    }
}
