package com.deliveryhero.perseus;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.core.config.DefaultPerseusConfigProvider;
import com.deliveryhero.perseus.core.session.ClientIdProviderImpl;
import com.deliveryhero.perseus.data.local.PerseusConfigLocalDataStoreImpl;
import com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl;
import com.deliveryhero.perseus.di.DataModule;
import com.deliveryhero.perseus.di.HitsModule;
import com.deliveryhero.perseus.hits.usecase.RunTelemetryUseCase;
import com.deliveryhero.perseus.logger.PerseusLogger;
import com.deliveryhero.perseus.utils.BackoffTimer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.accesssetColorFilterjd;
import o.createFromParcel;
import o.getPathFillTypeRgk1Os;
import o.getStrokeLineWidth;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.updateRenderPath;

/* JADX INFO: loaded from: classes2.dex */
public final class PerseusApp$init$1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PerseusApp$init$1(int i, int i2, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i == 0) {
            return ((PerseusApp$init$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i == 1) {
            return ((PerseusApp$init$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i != 2) {
            return i != 3 ? ((PerseusApp$init$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((PerseusApp$init$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        return ((PerseusApp$init$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.IconCompatParcelizer;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ClientIdProviderImpl clientIdProviderImpl = updateRenderPath.read();
                this.IconCompatParcelizer = 1;
                return clientIdProviderImpl.warmUpClientId(this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            if (i2 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (i == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.IconCompatParcelizer;
            if (i3 != 0) {
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            DataModule dataModule = DataModule.read;
            PerseusUserLocalDataStoreImpl perseusUserLocalDataStoreImpl = (PerseusUserLocalDataStoreImpl) DataModule.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
            this.IconCompatParcelizer = 1;
            return perseusUserLocalDataStoreImpl.getSessionId(this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        if (i == 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.IconCompatParcelizer;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                PerseusLogger perseusLoggerRemoteActionCompatParcelizer = getPathFillTypeRgk1Os.RemoteActionCompatParcelizer();
                DataModule dataModule2 = DataModule.read;
                PerseusConfigLocalDataStoreImpl perseusConfigLocalDataStoreImplIconCompatParcelizer = DataModule.IconCompatParcelizer();
                this.IconCompatParcelizer = 1;
                obj = BackoffTimer.IconCompatParcelizer.getInstance$perseus_release(perseusLoggerRemoteActionCompatParcelizer, perseusConfigLocalDataStoreImplIconCompatParcelizer, this);
                if (obj == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
            } else {
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            HitsModule.read.serializer(((BackoffTimer) obj).write, accesssetColorFilterjd.APPEND_OR_REPLACE);
            return createfromparcel;
        }
        if (i != 3) {
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.IconCompatParcelizer;
            if (i5 != 0) {
                if (i5 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            RunTelemetryUseCase runTelemetryUseCase = (RunTelemetryUseCase) getStrokeLineWidth.read.MediaSessionCompatResultReceiverWrapper();
            this.IconCompatParcelizer = 1;
            Object objRun = runTelemetryUseCase.run(this);
            return objRun == coroutineSingletons4 ? coroutineSingletons4 : objRun;
        }
        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = this.IconCompatParcelizer;
        if (i6 != 0) {
            if (i6 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        DefaultPerseusConfigProvider defaultPerseusConfigProvider = updateRenderPath.MediaSessionCompatQueueItem;
        this.IconCompatParcelizer = 1;
        Object config = defaultPerseusConfigProvider.getConfig(this);
        return config == coroutineSingletons5 ? coroutineSingletons5 : config;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.RemoteActionCompatParcelizer;
        int i2 = 1;
        if (i == 0) {
            return new PerseusApp$init$1(i2, 0, shortNewsContentCardView);
        }
        if (i == 1) {
            return new PerseusApp$init$1(i2, i2, shortNewsContentCardView);
        }
        int i3 = 2;
        if (i != 2) {
            return i != 3 ? new PerseusApp$init$1(i2, 4, shortNewsContentCardView) : new PerseusApp$init$1(i2, 3, shortNewsContentCardView);
        }
        return new PerseusApp$init$1(i2, i3, shortNewsContentCardView);
    }
}
