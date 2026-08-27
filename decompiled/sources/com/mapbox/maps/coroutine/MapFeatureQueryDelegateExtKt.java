package com.mapbox.maps.coroutine;

import com.mapbox.bindgen.Expected;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.QueriedRasterValues;
import com.mapbox.maps.QueriedRenderedFeature;
import com.mapbox.maps.QueriedSourceFeature;
import com.mapbox.maps.QueryRenderedFeaturesCallback;
import com.mapbox.maps.QueryRenderedRasterValuesCallback;
import com.mapbox.maps.QuerySourceFeaturesCallback;
import com.mapbox.maps.RenderedQueryGeometry;
import com.mapbox.maps.RenderedQueryOptions;
import com.mapbox.maps.RenderedRasterQueryOptions;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.SourceQueryOptions;
import com.mapbox.maps.UtilsKt$suspendMapboxCancellableCoroutine$2$1;
import com.mapbox.maps.plugin.delegates.MapFeatureQueryDelegate;
import io.grpc.LoadBalancer$Helper;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.ShortNewsContentCardView;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes5.dex */
public final class MapFeatureQueryDelegateExtKt {
    public static final Object queryRenderedFeatures(MapFeatureQueryDelegate mapFeatureQueryDelegate, RenderedQueryGeometry renderedQueryGeometry, RenderedQueryOptions renderedQueryOptions, ShortNewsContentCardView shortNewsContentCardView) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapFeatureQueryDelegate.queryRenderedFeatures(renderedQueryGeometry, renderedQueryOptions, new QueryRenderedFeaturesCallback() { // from class: com.mapbox.maps.coroutine.MapFeatureQueryDelegateExtKt$queryRenderedFeatures$2$1
            @Override // com.mapbox.maps.QueryRenderedFeaturesCallback
            public final void run(Expected<String, List<QueriedRenderedFeature>> expected) {
                expected.getClass();
                cancellableContinuationImpl.resumeWith(expected);
            }
        })));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    @MapboxExperimental
    public static final Object queryRenderedRasterValues(MapFeatureQueryDelegate mapFeatureQueryDelegate, ScreenCoordinate screenCoordinate, RenderedRasterQueryOptions renderedRasterQueryOptions, ShortNewsContentCardView shortNewsContentCardView) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapFeatureQueryDelegate.queryRenderedRasterValues(screenCoordinate, renderedRasterQueryOptions, new QueryRenderedRasterValuesCallback() { // from class: com.mapbox.maps.coroutine.MapFeatureQueryDelegateExtKt$queryRenderedRasterValues$2$1
            @Override // com.mapbox.maps.QueryRenderedRasterValuesCallback
            public final void run(Expected<String, QueriedRasterValues> expected) {
                expected.getClass();
                cancellableContinuationImpl.resumeWith(expected);
            }
        })));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public static final Object querySourceFeatures(MapFeatureQueryDelegate mapFeatureQueryDelegate, String str, SourceQueryOptions sourceQueryOptions, ShortNewsContentCardView shortNewsContentCardView) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapFeatureQueryDelegate.querySourceFeatures(str, sourceQueryOptions, new QuerySourceFeaturesCallback() { // from class: com.mapbox.maps.coroutine.MapFeatureQueryDelegateExtKt$querySourceFeatures$2$1
            @Override // com.mapbox.maps.QuerySourceFeaturesCallback
            public final void run(Expected<String, List<QueriedSourceFeature>> expected) {
                expected.getClass();
                cancellableContinuationImpl.resumeWith(expected);
            }
        })));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }
}
