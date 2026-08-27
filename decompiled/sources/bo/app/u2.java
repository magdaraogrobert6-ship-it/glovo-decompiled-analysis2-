package bo.app;

import coil3.ExtrasKt;
import com.braze.BrazeUser;
import com.braze.models.outgoing.AttributionData;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class u2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ BrazeUser a;
    public final /* synthetic */ AttributionData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(BrazeUser brazeUser, AttributionData attributionData, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.a = brazeUser;
        this.b = attributionData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new u2(this.a, this.b, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return new u2(this.a, this.b, (ShortNewsContentCardView) obj2).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        JSONObject jSONObjectForJsonPut;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ih ihVar = this.a.userCache;
        AttributionData attributionData = this.b;
        synchronized (ihVar) {
            if (attributionData != null) {
                try {
                    jSONObjectForJsonPut = attributionData.forJsonPut();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                jSONObjectForJsonPut = null;
            }
            ihVar.b(jSONObjectForJsonPut);
        }
        return createFromParcel.INSTANCE;
    }
}
