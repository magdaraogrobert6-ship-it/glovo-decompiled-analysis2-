package bo.app;

import coil3.ExtrasKt;
import com.braze.BrazeUser;
import com.braze.enums.NotificationSubscriptionType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class h3 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ BrazeUser a;
    public final /* synthetic */ NotificationSubscriptionType b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(BrazeUser brazeUser, NotificationSubscriptionType notificationSubscriptionType, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.a = brazeUser;
        this.b = notificationSubscriptionType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new h3(this.a, this.b, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return new h3(this.a, this.b, (ShortNewsContentCardView) obj2).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strForJsonPut;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ih ihVar = this.a.userCache;
        NotificationSubscriptionType notificationSubscriptionType = this.b;
        synchronized (ihVar) {
            if (notificationSubscriptionType != null) {
                try {
                    strForJsonPut = notificationSubscriptionType.forJsonPut();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                strForJsonPut = null;
            }
            ihVar.c("push_subscribe", strForJsonPut);
        }
        return createFromParcel.INSTANCE;
    }
}
