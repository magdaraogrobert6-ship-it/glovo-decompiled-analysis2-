package com.deliveryhero.perseus.common;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class Coroutines$Companion$enqueue$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Coroutines$Companion$enqueue$1(int i, ShortNewsContentCardView shortNewsContentCardView, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.RemoteActionCompatParcelizer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.write;
        if (i != 0) {
            return i != 1 ? new Coroutines$Companion$enqueue$1(2, shortNewsContentCardView, r8lambdaunavo3sxub_pc9xroryotnrlvsm) : new Coroutines$Companion$enqueue$1(1, shortNewsContentCardView, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
        return new Coroutines$Companion$enqueue$1(0, shortNewsContentCardView, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i != 0) {
            return i != 1 ? ((Coroutines$Companion$enqueue$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((Coroutines$Companion$enqueue$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        return ((Coroutines$Companion$enqueue$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.write;
        if (i == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.read;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.read = 1;
                return r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            if (i2 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (i != 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.read;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.read = 1;
                return r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
            }
            if (i3 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.read;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.read = 1;
            return r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this) == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
        }
        if (i4 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
