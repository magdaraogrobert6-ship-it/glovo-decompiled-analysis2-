package com.deliveryhero.perseus.di;

import coil3.ComponentRegistry$Builder;
import coil3.Extras$Key;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.core.session.AppSessionManagerImpl;
import com.deliveryhero.perseus.core.session.ClientIdProviderImpl;
import com.deliveryhero.perseus.data.local.PerseusConfigLocalDataStoreImpl;
import com.deliveryhero.perseus.data.local.db.entity.HitEventFactory;
import com.deliveryhero.perseus.data.remote.PerseusHitsRemoteDataStoreImpl;
import com.deliveryhero.perseus.repository.PerseusHitsRepositoryImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ImageVectorBuilderGroupParams;
import o.PathComponent;
import o.getAlignmentLinesMap;
import o.getCurrentGroup;
import o.getPathFillTypeRgk1Os;
import o.getPathMeasure;
import o.getTmpPath;
import o.isAdapterPositionOnScreen;
import o.onAddedToParentLayer;
import o.updateRenderPath;
import o.verticalLineToRelative;

/* JADX INFO: loaded from: classes2.dex */
public final class DataModule {
    public static PerseusHitsRepositoryImpl RemoteActionCompatParcelizer;
    public static final DataModule read = new DataModule();
    public static final isAdapterPositionOnScreen serializer = new isAdapterPositionOnScreen(new onAddedToParentLayer(19));
    public static final isAdapterPositionOnScreen IconCompatParcelizer = new isAdapterPositionOnScreen(new onAddedToParentLayer(20));
    public static final isAdapterPositionOnScreen write = new isAdapterPositionOnScreen(new onAddedToParentLayer(21));

    public static PerseusConfigLocalDataStoreImpl IconCompatParcelizer() {
        return (PerseusConfigLocalDataStoreImpl) serializer.MediaSessionCompatResultReceiverWrapper();
    }

    public static ComponentRegistry$Builder write() {
        return new ComponentRegistry$Builder(updateRenderPath.IconCompatParcelizer(), updateRenderPath.read(), (ImageVectorBuilderGroupParams) updateRenderPath.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper(), new HitEventFactory(new getAlignmentLinesMap(1)), new ScreenStartObserver$$ExternalSyntheticLambda0(29));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getPerseusHitsRemoteDataStore(ContinuationImpl continuationImpl) {
        getTmpPath gettmppath;
        verticalLineToRelative verticallinetorelative;
        if (continuationImpl instanceof getTmpPath) {
            gettmppath = (getTmpPath) continuationImpl;
            int i = gettmppath.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                gettmppath.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                gettmppath = new getTmpPath(this, continuationImpl);
            }
        } else {
            gettmppath = new getTmpPath(this, continuationImpl);
        }
        Object objPerseusHitsApi = gettmppath.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = gettmppath.IconCompatParcelizer;
        NetworkModule networkModule = NetworkModule.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objPerseusHitsApi);
            gettmppath.IconCompatParcelizer = 1;
            objPerseusHitsApi = networkModule.perseusHitsApi(gettmppath);
            if (objPerseusHitsApi != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(objPerseusHitsApi);
        } else {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            verticallinetorelative = gettmppath.read;
            ExtrasKt.RemoteActionCompatParcelizer(objPerseusHitsApi);
        }
        return new PerseusHitsRemoteDataStoreImpl(verticallinetorelative, (getCurrentGroup) objPerseusHitsApi);
        verticalLineToRelative verticallinetorelative2 = (verticalLineToRelative) objPerseusHitsApi;
        gettmppath.read = verticallinetorelative2;
        gettmppath.IconCompatParcelizer = 2;
        Object objRetrofitBuilder$perseus_release = networkModule.retrofitBuilder$perseus_release(gettmppath);
        if (objRetrofitBuilder$perseus_release != coroutineSingletons) {
            verticallinetorelative = verticallinetorelative2;
            objPerseusHitsApi = objRetrofitBuilder$perseus_release;
            return new PerseusHitsRemoteDataStoreImpl(verticallinetorelative, (getCurrentGroup) objPerseusHitsApi);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object perseusHitsRepository(ContinuationImpl continuationImpl) {
        PathComponent pathComponent;
        HitEventFactory hitEventFactory;
        AppSessionManagerImpl appSessionManagerImpl;
        ClientIdProviderImpl clientIdProviderImpl;
        Extras$Key extras$Key;
        if (continuationImpl instanceof PathComponent) {
            pathComponent = (PathComponent) continuationImpl;
            int i = pathComponent.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                pathComponent.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                pathComponent = new PathComponent(this, continuationImpl);
            }
        } else {
            pathComponent = new PathComponent(this, continuationImpl);
        }
        Object obj = pathComponent.MediaBrowserCompatMediaItem;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pathComponent.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            PerseusHitsRepositoryImpl perseusHitsRepositoryImpl = RemoteActionCompatParcelizer;
            if (perseusHitsRepositoryImpl != null) {
                return perseusHitsRepositoryImpl;
            }
            AppSessionManagerImpl appSessionManagerImplIconCompatParcelizer = updateRenderPath.IconCompatParcelizer();
            ClientIdProviderImpl clientIdProviderImpl2 = updateRenderPath.read();
            hitEventFactory = new HitEventFactory(new ScreenStartObserver$$ExternalSyntheticLambda0(28));
            Extras$Key extras$Key2 = new Extras$Key(getPathMeasure.IconCompatParcelizer);
            pathComponent.IconCompatParcelizer = appSessionManagerImplIconCompatParcelizer;
            pathComponent.serializer = clientIdProviderImpl2;
            pathComponent.write = hitEventFactory;
            pathComponent.read = extras$Key2;
            pathComponent.RemoteActionCompatParcelizer = 1;
            Object perseusHitsRemoteDataStore = getPerseusHitsRemoteDataStore(pathComponent);
            if (perseusHitsRemoteDataStore == obj2) {
                return obj2;
            }
            appSessionManagerImpl = appSessionManagerImplIconCompatParcelizer;
            obj = perseusHitsRemoteDataStore;
            clientIdProviderImpl = clientIdProviderImpl2;
            extras$Key = extras$Key2;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Extras$Key extras$Key3 = pathComponent.read;
            HitEventFactory hitEventFactory2 = pathComponent.write;
            ClientIdProviderImpl clientIdProviderImpl3 = pathComponent.serializer;
            AppSessionManagerImpl appSessionManagerImpl2 = pathComponent.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            hitEventFactory = hitEventFactory2;
            clientIdProviderImpl = clientIdProviderImpl3;
            appSessionManagerImpl = appSessionManagerImpl2;
            extras$Key = extras$Key3;
        }
        PerseusHitsRepositoryImpl perseusHitsRepositoryImpl2 = new PerseusHitsRepositoryImpl((PerseusHitsRemoteDataStoreImpl) obj, extras$Key, appSessionManagerImpl, clientIdProviderImpl, hitEventFactory, getPathFillTypeRgk1Os.RemoteActionCompatParcelizer());
        RemoteActionCompatParcelizer = perseusHitsRepositoryImpl2;
        return perseusHitsRepositoryImpl2;
    }
}
