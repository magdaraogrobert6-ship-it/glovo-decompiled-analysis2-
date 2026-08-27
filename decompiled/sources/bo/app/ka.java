package bo.app;

import coil3.ExtrasKt;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class ka extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ InAppMessageBase b;
    public final /* synthetic */ i9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(String str, InAppMessageBase inAppMessageBase, i9 i9Var, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.a = str;
        this.b = inAppMessageBase;
        this.c = i9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new ka(this.a, this.b, this.c, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((ka) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        g9 g9VarM = n1.g.m(this.a, this.b.getMessageExtras());
        if (g9VarM != null) {
            ((h2) this.c).a(g9VarM);
        }
        return createFromParcel.INSTANCE;
    }
}
