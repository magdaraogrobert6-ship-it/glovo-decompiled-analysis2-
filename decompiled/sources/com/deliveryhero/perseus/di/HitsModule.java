package com.deliveryhero.perseus.di;

import androidx.work.impl.WorkManagerImpl;
import coil3.ExtrasKt;
import coil3.memory.MemoryCacheService;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.hits.PerseusWorkFinishedCallback;
import com.deliveryhero.perseus.hits.usecase.PerseusSaveHitUseCase;
import com.deliveryhero.perseus.hits.usecase.PerseusSendHitUseCase;
import com.deliveryhero.perseus.logger.PerseusLogger;
import com.deliveryhero.perseus.repository.PerseusHitsRepositoryImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getFill;
import o.getFillAlpha;
import o.getPathData;
import o.getPathFillTypeRgk1Os;
import o.getStroke;
import o.setFillAlpha;
import o.updateRenderPath;

/* JADX INFO: loaded from: classes2.dex */
public final class HitsModule {
    public static PerseusWorkFinishedCallback IconCompatParcelizer;
    public static final HitsModule RemoteActionCompatParcelizer = new HitsModule();
    public static final MemoryCacheService read;

    static {
        WorkManagerImpl workManagerImpl = (WorkManagerImpl) DataModule.write.MediaSessionCompatResultReceiverWrapper();
        workManagerImpl.getClass();
        MemoryCacheService memoryCacheService = new MemoryCacheService();
        memoryCacheService.RemoteActionCompatParcelizer = workManagerImpl;
        read = memoryCacheService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getHitsUseCase(ContinuationImpl continuationImpl) {
        getStroke getstroke;
        if (continuationImpl instanceof getStroke) {
            getstroke = (getStroke) continuationImpl;
            int i = getstroke.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                getstroke.serializer = i - Integer.MIN_VALUE;
            } else {
                getstroke = new getStroke(this, continuationImpl);
            }
        } else {
            getstroke = new getStroke(this, continuationImpl);
        }
        Object objPerseusHitsRepository = getstroke.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getstroke.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objPerseusHitsRepository);
            DataModule dataModule = DataModule.read;
            getstroke.serializer = 1;
            objPerseusHitsRepository = dataModule.perseusHitsRepository(getstroke);
            if (objPerseusHitsRepository == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objPerseusHitsRepository);
        }
        return new setFillAlpha((PerseusHitsRepositoryImpl) objPerseusHitsRepository);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getPerseusSaveHitUseCase(ContinuationImpl continuationImpl) {
        getFill getfill;
        if (continuationImpl instanceof getFill) {
            getfill = (getFill) continuationImpl;
            int i = getfill.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                getfill.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                getfill = new getFill(this, continuationImpl);
            }
        } else {
            getfill = new getFill(this, continuationImpl);
        }
        Object objPerseusHitsRepository = getfill.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getfill.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objPerseusHitsRepository);
            DataModule dataModule = DataModule.read;
            getfill.RemoteActionCompatParcelizer = 1;
            objPerseusHitsRepository = dataModule.perseusHitsRepository(getfill);
            if (objPerseusHitsRepository == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objPerseusHitsRepository);
        }
        PerseusHitsRepositoryImpl perseusHitsRepositoryImpl = (PerseusHitsRepositoryImpl) objPerseusHitsRepository;
        DataModule dataModule2 = DataModule.read;
        return new PerseusSaveHitUseCase(perseusHitsRepositoryImpl, DataModule.write(), DataModule.IconCompatParcelizer(), read, getPathFillTypeRgk1Os.RemoteActionCompatParcelizer(), updateRenderPath.MediaMetadataCompat);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object perseusSendHitUseCase(ContinuationImpl continuationImpl) {
        getFillAlpha getfillalpha;
        if (continuationImpl instanceof getFillAlpha) {
            getfillalpha = (getFillAlpha) continuationImpl;
            int i = getfillalpha.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                getfillalpha.serializer = i - Integer.MIN_VALUE;
            } else {
                getfillalpha = new getFillAlpha(this, continuationImpl);
            }
        } else {
            getfillalpha = new getFillAlpha(this, continuationImpl);
        }
        Object objPerseusHitsRepository = getfillalpha.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getfillalpha.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objPerseusHitsRepository);
            DataModule dataModule = DataModule.read;
            getfillalpha.serializer = 1;
            objPerseusHitsRepository = dataModule.perseusHitsRepository(getfillalpha);
            if (objPerseusHitsRepository == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objPerseusHitsRepository);
        }
        DataModule dataModule2 = DataModule.read;
        return new PerseusSendHitUseCase((PerseusHitsRepositoryImpl) objPerseusHitsRepository, DataModule.write(), updateRenderPath.MediaMetadataCompat);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object perseusWorkFinishedCallback(ContinuationImpl continuationImpl) {
        getPathData getpathdata;
        if (continuationImpl instanceof getPathData) {
            getpathdata = (getPathData) continuationImpl;
            int i = getpathdata.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                getpathdata.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                getpathdata = new getPathData(this, continuationImpl);
            }
        } else {
            getpathdata = new getPathData(this, continuationImpl);
        }
        Object objPerseusHitsRepository = getpathdata.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getpathdata.IconCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objPerseusHitsRepository);
            PerseusWorkFinishedCallback perseusWorkFinishedCallback = IconCompatParcelizer;
            if (perseusWorkFinishedCallback != null) {
                return perseusWorkFinishedCallback;
            }
            DataModule dataModule = DataModule.read;
            getpathdata.IconCompatParcelizer = 1;
            objPerseusHitsRepository = dataModule.perseusHitsRepository(getpathdata);
            if (objPerseusHitsRepository == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objPerseusHitsRepository);
        }
        PerseusLogger perseusLoggerRemoteActionCompatParcelizer = getPathFillTypeRgk1Os.RemoteActionCompatParcelizer();
        DataModule dataModule2 = DataModule.read;
        PerseusWorkFinishedCallback perseusWorkFinishedCallback2 = new PerseusWorkFinishedCallback((PerseusHitsRepositoryImpl) objPerseusHitsRepository, read, perseusLoggerRemoteActionCompatParcelizer, DataModule.IconCompatParcelizer());
        IconCompatParcelizer = perseusWorkFinishedCallback2;
        return perseusWorkFinishedCallback2;
    }
}
