package com.braze;

import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.braze.support.BrazeLogger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public /* synthetic */ Object a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Braze e;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 f;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z, boolean z2, boolean z3, Braze braze, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = braze;
        this.f = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.g = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        c cVar = new c(this.b, this.c, this.d, this.e, this.f, this.g, shortNewsContentCardView);
        cVar.a = obj;
        return cVar;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        boolean z = this.b;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if ((z && Braze.Companion.isDisabled()) || (this.c && Braze.Companion.isDelayedInitializationEnabled())) {
            return createfromparcel;
        }
        if (this.d && this.e.udm == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) getcontentviewgroupparentlayout, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda0(0, this.g), 6, (Object) null);
            return createfromparcel;
        }
        this.f.invoke();
        return createfromparcel;
    }

    public static final String a(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return m1$$ExternalSyntheticOutline0.m(r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke(), "Early returning because the Braze instance isn't fully initialized. Always use Braze.getInstance(context) to get the latest Braze instance. Please report to Braze if the issue continues. > ");
    }
}
