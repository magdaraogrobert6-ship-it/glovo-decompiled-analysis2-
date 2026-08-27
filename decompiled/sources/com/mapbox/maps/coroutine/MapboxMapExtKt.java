package com.mapbox.maps.coroutine;

import androidx.room.Room;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.FeatureExtensionValue;
import com.mapbox.maps.FeatureStateOperationCallback;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.NativeObserver;
import com.mapbox.maps.QueryFeatureExtensionCallback;
import com.mapbox.maps.QueryFeatureStateCallback;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.UtilsKt$suspendMapboxCancellableCoroutine$2$1;
import com.mapbox.maps.extension.style.StyleContract$StyleExtension;
import io.grpc.LoadBalancer$Helper;
import java.util.List;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.onItemDismisslambda0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes5.dex */
public final class MapboxMapExtKt {

    /* JADX INFO: renamed from: com.mapbox.maps.coroutine.MapboxMapExtKt$genericEvents$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        final /* synthetic */ String $eventName;
        final /* synthetic */ MapboxMap $this_genericEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.mapbox.maps.coroutine.MapboxMapExtKt$genericEvents$1$1, reason: invalid class name and collision with other inner class name */
        public final /* synthetic */ class C00271 extends FunctionReferenceImpl implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4719invoke() {
                ((Cancelable) this.MediaMetadataCompat).cancel();
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4719invoke();
                return createFromParcel.INSTANCE;
            }

            public C00271(Object obj) {
                super(0, 0, Cancelable.class, obj, "cancel", "cancel()V");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MapboxMap mapboxMap, String str, ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$this_genericEvents = mapboxMap;
            this.$eventName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_genericEvents, this.$eventName, shortNewsContentCardView);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.L$0;
                NativeObserver nativeObserver$maps_sdk_release = this.$this_genericEvents.getNativeObserver$maps_sdk_release();
                String str = this.$eventName;
                MapboxMapExtKt$genericEvents$1$$ExternalSyntheticLambda0 mapboxMapExtKt$genericEvents$1$$ExternalSyntheticLambda0 = new MapboxMapExtKt$genericEvents$1$$ExternalSyntheticLambda0(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1);
                ProducerCoroutine producerCoroutine = (ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
                producerCoroutine.getClass();
                C00271 c00271 = new C00271(nativeObserver$maps_sdk_release.subscribeGenericEvent(str, mapboxMapExtKt$genericEvents$1$$ExternalSyntheticLambda0, new MapboxMapExtKt$genericEvents$1$cancelable$2(producerCoroutine)));
                this.label = 1;
                if (Room.awaitClose(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, c00271, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createFromParcel.INSTANCE;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass1) create(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    @MapboxExperimental
    public static /* synthetic */ void getCameraChangedCoalescedEvents$annotations(MapboxMap mapboxMap) {
    }

    public static final Object awaitLoadStyle(MapboxMap mapboxMap, StyleContract$StyleExtension styleContract$StyleExtension, ShortNewsContentCardView shortNewsContentCardView) {
        SafeContinuation safeContinuation = new SafeContinuation(LoadBalancer$Helper.intercepted(shortNewsContentCardView), CoroutineSingletons.UNDECIDED);
        mapboxMap.loadStyle(styleContract$StyleExtension, new MapboxMapExtKt$awaitLoadStyle$2$1(safeContinuation));
        return safeContinuation.getOrThrow();
    }

    public static final Object awaitStyle(MapboxMap mapboxMap, ShortNewsContentCardView shortNewsContentCardView) {
        SafeContinuation safeContinuation = new SafeContinuation(LoadBalancer$Helper.intercepted(shortNewsContentCardView), CoroutineSingletons.UNDECIDED);
        mapboxMap.getStyle(new MapboxMapExtKt$awaitStyle$2$1(safeContinuation));
        return safeContinuation.getOrThrow();
    }

    @onItemDismisslambda0
    public static final Object cameraForCoordinates(MapboxMap mapboxMap, List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d, ScreenCoordinate screenCoordinate, ShortNewsContentCardView shortNewsContentCardView) {
        SafeContinuation safeContinuation = new SafeContinuation(LoadBalancer$Helper.intercepted(shortNewsContentCardView), CoroutineSingletons.UNDECIDED);
        mapboxMap.cameraForCoordinates(list, cameraOptions, edgeInsets, d, screenCoordinate, new MapboxMapExtKt$cameraForCoordinates$2$1(safeContinuation));
        return safeContinuation.getOrThrow();
    }

    public static final Object getFeatureState(MapboxMap mapboxMap, String str, String str2, String str3, ShortNewsContentCardView shortNewsContentCardView) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.getFeatureState(str, str2, str3, new QueryFeatureStateCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$getFeatureState$2$1
            @Override // com.mapbox.maps.QueryFeatureStateCallback
            public final void run(Expected<String, Value> expected) {
                expected.getClass();
                cancellableContinuationImpl.resumeWith(expected);
            }
        })));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public static final Object getGeoJsonClusterChildren(MapboxMap mapboxMap, String str, Feature feature, ShortNewsContentCardView shortNewsContentCardView) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.getGeoJsonClusterChildren(str, feature, new QueryFeatureExtensionCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$getGeoJsonClusterChildren$2$1
            @Override // com.mapbox.maps.QueryFeatureExtensionCallback
            public final void run(Expected<String, FeatureExtensionValue> expected) {
                expected.getClass();
                cancellableContinuationImpl.resumeWith(expected);
            }
        })));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public static final Object getGeoJsonClusterExpansionZoom(MapboxMap mapboxMap, String str, Feature feature, ShortNewsContentCardView shortNewsContentCardView) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.getGeoJsonClusterExpansionZoom(str, feature, new QueryFeatureExtensionCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$getGeoJsonClusterExpansionZoom$2$1
            @Override // com.mapbox.maps.QueryFeatureExtensionCallback
            public final void run(Expected<String, FeatureExtensionValue> expected) {
                expected.getClass();
                cancellableContinuationImpl.resumeWith(expected);
            }
        })));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public static final Object getGeoJsonClusterLeaves(MapboxMap mapboxMap, String str, Feature feature, long j, long j2, ShortNewsContentCardView shortNewsContentCardView) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.getGeoJsonClusterLeaves(str, feature, j, j2, new QueryFeatureExtensionCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$getGeoJsonClusterLeaves$2$1
            @Override // com.mapbox.maps.QueryFeatureExtensionCallback
            public final void run(Expected<String, FeatureExtensionValue> expected) {
                expected.getClass();
                cancellableContinuationImpl.resumeWith(expected);
            }
        })));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public static final Object removeFeatureState(MapboxMap mapboxMap, String str, String str2, String str3, String str4, ShortNewsContentCardView shortNewsContentCardView) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.removeFeatureState(str, str2, str3, str4, new FeatureStateOperationCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$removeFeatureState$2$1
            @Override // com.mapbox.maps.FeatureStateOperationCallback
            public final void run(Expected<String, None> expected) {
                expected.getClass();
                cancellableContinuationImpl.resumeWith(expected);
            }
        })));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public static final Object resetFeatureStates(MapboxMap mapboxMap, String str, String str2, ShortNewsContentCardView shortNewsContentCardView) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.resetFeatureStates(str, str2, new FeatureStateOperationCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$resetFeatureStates$2$1
            @Override // com.mapbox.maps.FeatureStateOperationCallback
            public final void run(Expected<String, None> expected) {
                expected.getClass();
                cancellableContinuationImpl.resumeWith(expected);
            }
        })));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public static final Object setFeatureState(MapboxMap mapboxMap, String str, String str2, String str3, Value value, ShortNewsContentCardView shortNewsContentCardView) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new UtilsKt$suspendMapboxCancellableCoroutine$2$1(mapboxMap.setFeatureState(str, str2, str3, value, new FeatureStateOperationCallback() { // from class: com.mapbox.maps.coroutine.MapboxMapExtKt$setFeatureState$2$1
            @Override // com.mapbox.maps.FeatureStateOperationCallback
            public final void run(Expected<String, None> expected) {
                expected.getClass();
                cancellableContinuationImpl.resumeWith(expected);
            }
        })));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    @com.mapbox.maps.MapboxExperimental
    public static final Flow genericEvents(MapboxMap mapboxMap, String str) {
        mapboxMap.getClass();
        str.getClass();
        Flow flowWrite = FlowKt.write(new AnonymousClass1(mapboxMap, str, null));
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        return FlowKt.IconCompatParcelizer(FlowKt.RemoteActionCompatParcelizer(flowWrite, MainDispatcherLoader.read.IconCompatParcelizer()), -1);
    }

    public static /* synthetic */ Object getFeatureState$default(MapboxMap mapboxMap, String str, String str2, String str3, ShortNewsContentCardView shortNewsContentCardView, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return getFeatureState(mapboxMap, str, str2, str3, shortNewsContentCardView);
    }

    public static /* synthetic */ Object resetFeatureStates$default(MapboxMap mapboxMap, String str, String str2, ShortNewsContentCardView shortNewsContentCardView, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return resetFeatureStates(mapboxMap, str, str2, shortNewsContentCardView);
    }

    public static final Flow getCameraChangedCoalescedEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        Flow flowWrite = FlowKt.write(new MapboxMapExtKt$cameraChangedCoalescedEvents$1(mapboxMap, null));
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        return FlowKt.IconCompatParcelizer(FlowKt.RemoteActionCompatParcelizer(flowWrite, MainDispatcherLoader.read.IconCompatParcelizer()), -1);
    }

    public static final Flow getCameraChangedEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        Flow flowWrite = FlowKt.write(new MapboxMapExtKt$cameraChangedEvents$1(mapboxMap, null));
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        return FlowKt.IconCompatParcelizer(FlowKt.RemoteActionCompatParcelizer(flowWrite, MainDispatcherLoader.read.IconCompatParcelizer()), -1);
    }

    public static final Flow getMapIdleEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        Flow flowWrite = FlowKt.write(new MapboxMapExtKt$mapIdleEvents$1(mapboxMap, null));
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        return FlowKt.IconCompatParcelizer(FlowKt.RemoteActionCompatParcelizer(flowWrite, MainDispatcherLoader.read.IconCompatParcelizer()), -1);
    }

    public static final Flow getMapLoadedEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        Flow flowWrite = FlowKt.write(new MapboxMapExtKt$mapLoadedEvents$1(mapboxMap, null));
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        return FlowKt.IconCompatParcelizer(FlowKt.RemoteActionCompatParcelizer(flowWrite, MainDispatcherLoader.read.IconCompatParcelizer()), -1);
    }

    public static final Flow getMapLoadingErrorEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        Flow flowWrite = FlowKt.write(new MapboxMapExtKt$mapLoadingErrorEvents$1(mapboxMap, null));
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        return FlowKt.IconCompatParcelizer(FlowKt.RemoteActionCompatParcelizer(flowWrite, MainDispatcherLoader.read.IconCompatParcelizer()), -1);
    }

    public static final Flow getRenderFrameFinishedEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        Flow flowWrite = FlowKt.write(new MapboxMapExtKt$renderFrameFinishedEvents$1(mapboxMap, null));
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        return FlowKt.IconCompatParcelizer(FlowKt.RemoteActionCompatParcelizer(flowWrite, MainDispatcherLoader.read.IconCompatParcelizer()), -1);
    }

    public static final Flow getRenderFrameStartedEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        Flow flowWrite = FlowKt.write(new MapboxMapExtKt$renderFrameStartedEvents$1(mapboxMap, null));
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        return FlowKt.IconCompatParcelizer(FlowKt.RemoteActionCompatParcelizer(flowWrite, MainDispatcherLoader.read.IconCompatParcelizer()), -1);
    }

    public static final Flow getResourceRequestEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        Flow flowWrite = FlowKt.write(new MapboxMapExtKt$resourceRequestEvents$1(mapboxMap, null));
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        return FlowKt.IconCompatParcelizer(FlowKt.RemoteActionCompatParcelizer(flowWrite, MainDispatcherLoader.read.IconCompatParcelizer()), -1);
    }

    public static final Flow getSourceAddedEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        Flow flowWrite = FlowKt.write(new MapboxMapExtKt$sourceAddedEvents$1(mapboxMap, null));
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        return FlowKt.IconCompatParcelizer(FlowKt.RemoteActionCompatParcelizer(flowWrite, MainDispatcherLoader.read.IconCompatParcelizer()), -1);
    }

    public static final Flow getSourceDataLoadedEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        Flow flowWrite = FlowKt.write(new MapboxMapExtKt$sourceDataLoadedEvents$1(mapboxMap, null));
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        return FlowKt.IconCompatParcelizer(FlowKt.RemoteActionCompatParcelizer(flowWrite, MainDispatcherLoader.read.IconCompatParcelizer()), -1);
    }

    public static final Flow getSourceRemovedEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        Flow flowWrite = FlowKt.write(new MapboxMapExtKt$sourceRemovedEvents$1(mapboxMap, null));
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        return FlowKt.IconCompatParcelizer(FlowKt.RemoteActionCompatParcelizer(flowWrite, MainDispatcherLoader.read.IconCompatParcelizer()), -1);
    }

    public static final Flow getStyleDataLoadedEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        Flow flowWrite = FlowKt.write(new MapboxMapExtKt$styleDataLoadedEvents$1(mapboxMap, null));
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        return FlowKt.IconCompatParcelizer(FlowKt.RemoteActionCompatParcelizer(flowWrite, MainDispatcherLoader.read.IconCompatParcelizer()), -1);
    }

    public static final Flow getStyleImageMissingEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        Flow flowWrite = FlowKt.write(new MapboxMapExtKt$styleImageMissingEvents$1(mapboxMap, null));
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        return FlowKt.IconCompatParcelizer(FlowKt.RemoteActionCompatParcelizer(flowWrite, MainDispatcherLoader.read.IconCompatParcelizer()), -1);
    }

    public static final Flow getStyleImageRemoveUnusedEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        Flow flowWrite = FlowKt.write(new MapboxMapExtKt$styleImageRemoveUnusedEvents$1(mapboxMap, null));
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        return FlowKt.IconCompatParcelizer(FlowKt.RemoteActionCompatParcelizer(flowWrite, MainDispatcherLoader.read.IconCompatParcelizer()), -1);
    }

    public static final Flow getStyleLoadedEvents(MapboxMap mapboxMap) {
        mapboxMap.getClass();
        Flow flowWrite = FlowKt.write(new MapboxMapExtKt$styleLoadedEvents$1(mapboxMap, null));
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        return FlowKt.IconCompatParcelizer(FlowKt.RemoteActionCompatParcelizer(flowWrite, MainDispatcherLoader.read.IconCompatParcelizer()), -1);
    }

    public static /* synthetic */ Object setFeatureState$default(MapboxMap mapboxMap, String str, String str2, String str3, Value value, ShortNewsContentCardView shortNewsContentCardView, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return setFeatureState(mapboxMap, str, str2, str3, value, shortNewsContentCardView);
    }

    public static final Object awaitLoadStyle(MapboxMap mapboxMap, String str, ShortNewsContentCardView shortNewsContentCardView) {
        SafeContinuation safeContinuation = new SafeContinuation(LoadBalancer$Helper.intercepted(shortNewsContentCardView), CoroutineSingletons.UNDECIDED);
        mapboxMap.loadStyle(str, new MapboxMapExtKt$awaitLoadStyle$4$1(safeContinuation));
        return safeContinuation.getOrThrow();
    }
}
