package com.deliveryhero.perseus.core.config;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.PerseusParamsConfig;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultPerseusConfigProvider$mutateConfigSync$1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ PerseusParamsConfig write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DefaultPerseusConfigProvider$mutateConfigSync$1(PerseusParamsConfig perseusParamsConfig, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.read = i;
        this.write = perseusParamsConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.read;
        PerseusParamsConfig perseusParamsConfig = this.write;
        return i != 0 ? new DefaultPerseusConfigProvider$mutateConfigSync$1(perseusParamsConfig, shortNewsContentCardView, 1) : new DefaultPerseusConfigProvider$mutateConfigSync$1(perseusParamsConfig, shortNewsContentCardView, 0);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        return i != 0 ? ((DefaultPerseusConfigProvider$mutateConfigSync$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((DefaultPerseusConfigProvider$mutateConfigSync$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        PerseusParamsConfig perseusParamsConfig = this.write;
        if (i != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.RemoteActionCompatParcelizer;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                DefaultPerseusConfigProvider defaultPerseusConfigProvider = DefaultPerseusConfigProvider.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = 1;
                return DefaultPerseusConfigProvider.access$persistSnapshot(perseusParamsConfig, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            if (i2 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.RemoteActionCompatParcelizer;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            DefaultPerseusConfigProvider defaultPerseusConfigProvider2 = DefaultPerseusConfigProvider.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = 1;
            return DefaultPerseusConfigProvider.access$persistSnapshot(perseusParamsConfig, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        if (i3 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
