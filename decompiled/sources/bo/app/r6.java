package bo.app;

import coil3.ExtrasKt;
import com.braze.support.BrazeLogger;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.BufferedReader;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class r6 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public Object a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ BufferedReader d;
    public final /* synthetic */ InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(BufferedReader bufferedReader, InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.d = bufferedReader;
        this.e = inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        r6 r6Var = new r6(this.d, this.e, shortNewsContentCardView);
        r6Var.c = obj;
        return r6Var;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((r6) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        try {
            if (i != 0) {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            String line = this.d.readLine();
            if (line != null) {
                InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 = this.e;
                this.c = getcontentviewgroupparentlayout;
                this.a = null;
                this.b = 1;
                if (((ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1).read.serializer((Object) line, (ShortNewsContentCardView) this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return createfromparcel;
        } catch (Exception e) {
            if (YieldKt.write(getcontentviewgroupparentlayout)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w6.c, BrazeLogger.Priority.D, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(11), 8, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w6.c, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a5$$ExternalSyntheticLambda0(21, e), 14, (Object) null);
            }
        }
    }

    public static final String a(Exception exc) {
        return "Stream producer job cancelled " + exc;
    }

    public static final String a() {
        return "Caught unexpected exception in dust stream producer";
    }
}
