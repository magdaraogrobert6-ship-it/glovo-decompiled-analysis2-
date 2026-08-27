package bo.app;

import coil3.ExtrasKt;
import com.braze.Braze;
import com.braze.support.BrazeLogger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Braze b;
    public final /* synthetic */ JSONObject c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(Braze braze, JSONObject jSONObject, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.b = braze;
        this.c = jSONObject;
    }

    public static final String a() {
        return "Content Cards are disabled. Not deserializing json. Returning null.";
    }

    public static final String b() {
        return "Cannot deserialize null content card json. Returning null.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        q0 q0Var = new q0(this.b, this.c, shortNewsContentCardView);
        q0Var.a = obj;
        return q0Var;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((q0) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (!((lh) this.b.getUdm$android_sdk_base_release()).j.G()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) getcontentviewgroupparentlayout, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(15), 6, (Object) null);
            return null;
        }
        if (this.c == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) getcontentviewgroupparentlayout, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(16), 6, (Object) null);
            return null;
        }
        d4 d4Var = ((lh) this.b.getUdm$android_sdk_base_release()).y;
        JSONObject jSONObject = this.c;
        d4Var.getClass();
        jSONObject.getClass();
        return q3.a(jSONObject, d4Var.b, d4Var, d4Var.j);
    }
}
