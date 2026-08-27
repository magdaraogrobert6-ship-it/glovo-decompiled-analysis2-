package com.mapbox.navigation.ui.utils.internal.resource;

import androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda3;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.network.NetworkFetcher;
import com.huawei.location.Vw$Vw;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.common.Cancelable;
import com.mapbox.common.NetworkRestriction;
import com.mapbox.common.ResourceDescription;
import com.mapbox.common.ResourceLoadFlags;
import com.mapbox.common.ResourceLoadOptions;
import com.mapbox.common.TileDataDomain;
import com.mapbox.common.TileStore;
import com.mapbox.navigation.base.internal.tilestore.NavigationTileStoreOwner;
import com.mapbox.navigation.core.reroute.MapboxRerouteController$requestAsync$2$1;
import com.mapbox.navigation.voice.api.MapboxSpeechProvider$load$1;
import io.grpc.LoadBalancer$Helper;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ResourceLoaderExtensionsKt {

    /* JADX INFO: renamed from: com.mapbox.navigation.ui.utils.internal.resource.ResourceLoaderExtensionsKt$load$1, reason: invalid class name */
    public final class AnonymousClass1 {
        public final /* synthetic */ NetworkFetcher.AnonymousClass2 $onFinished;

        public AnonymousClass1(NetworkFetcher.AnonymousClass2 anonymousClass2) {
            this.$onFinished = anonymousClass2;
        }
    }

    public static final Object load(DefaultResourceLoader defaultResourceLoader, x xVar, MapboxSpeechProvider$load$1 mapboxSpeechProvider$load$1) {
        ResourceLoadOptions resourceLoadOptions;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(mapboxSpeechProvider$load$1));
        cancellableContinuationImpl.read();
        NetworkFetcher.AnonymousClass2 anonymousClass2 = new NetworkFetcher.AnonymousClass2(1, cancellableContinuationImpl, RangesKt.class, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 1, 10);
        defaultResourceLoader.getClass();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(anonymousClass2);
        TileStore tileStoreInvoke = NavigationTileStoreOwner.INSTANCE.invoke();
        NetworkRestriction networkRestriction = (NetworkRestriction) xVar.IconCompatParcelizer;
        long jIncrementAndGet = defaultResourceLoader.nextRequestId.incrementAndGet();
        ConcurrentLinkedQueue concurrentLinkedQueue = defaultResourceLoader.observers;
        Vw$Vw vw$Vw = new Vw$Vw(xVar, anonymousClass1, concurrentLinkedQueue);
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            ((AnonymousClass1) it.next()).getClass();
        }
        ConcurrentHashMap concurrentHashMap = defaultResourceLoader.cancelableMap;
        ResourceDescription resourceDescription = new ResourceDescription(TileDataDomain.NAVIGATION, (String) xVar.read);
        NetworkRestriction networkRestriction2 = NetworkRestriction.DISALLOW_ALL;
        boolean z = networkRestriction != networkRestriction2;
        String strM = af$$ExternalSyntheticOutline0.m(jIncrementAndGet, "DefaultResourceLoader-");
        if (z && !defaultResourceLoader.reachability.isReachable()) {
            resourceLoadOptions = new ResourceLoadOptions(strM, ResourceLoadFlags.ACCEPT_EXPIRED, networkRestriction2, null);
        } else {
            resourceLoadOptions = new ResourceLoadOptions(strM, (ResourceLoadFlags) xVar.RemoteActionCompatParcelizer, networkRestriction, null);
        }
        Cancelable cancelableLoadResource = tileStoreInvoke.loadResource(resourceDescription, resourceLoadOptions, vw$Vw, new Futures$$ExternalSyntheticLambda3(defaultResourceLoader, jIncrementAndGet, vw$Vw, 4));
        cancelableLoadResource.getClass();
        concurrentHashMap.put(Long.valueOf(jIncrementAndGet), cancelableLoadResource);
        cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new MapboxRerouteController$requestAsync$2$1(jIncrementAndGet, 2, defaultResourceLoader));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }
}
