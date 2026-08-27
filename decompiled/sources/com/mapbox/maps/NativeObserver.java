package com.mapbox.maps;

import com.google.android.gms.internal.mlkit_vision_face.zzlq;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.plugin.delegates.listeners.OnCameraChangeListener;
import com.mapbox.maps.plugin.delegates.listeners.OnMapIdleListener;
import com.mapbox.maps.plugin.delegates.listeners.OnMapLoadErrorListener;
import com.mapbox.maps.plugin.delegates.listeners.OnMapLoadedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnRenderFrameFinishedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnRenderFrameStartedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnSourceAddedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnSourceDataLoadedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnSourceRemovedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnStyleDataLoadedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnStyleImageMissingListener;
import com.mapbox.maps.plugin.delegates.listeners.OnStyleImageUnusedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnStyleLoadedListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;
import o.getCieXyz;
import o.onItemDismisslambda0;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeObserver {
    private final Set<? extends Cancelable> _cancelableSet;
    private final Set<? extends Cancelable> _resubscribableSet;
    private final CopyOnWriteArraySet<ExtendedCancelable> cancelableSet;
    private final CopyOnWriteArraySet<MapLoadingErrorCallback> mapLoadingErrorCallbackSet;
    private final NativeMapImpl observable;
    private final CopyOnWriteArraySet<ResubscribeExtendedCancelable> resubscribableSet;

    public class ExtendedCancelable implements Cancelable {
        private final Set<ExtendedCancelable> cancelableSet;
        private final Object listener;
        private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 onCancel;
        private final Cancelable originalCancelable;
        final /* synthetic */ NativeObserver this$0;

        public final Object getListener() {
            return this.listener;
        }

        public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getOnCancel() {
            return this.onCancel;
        }

        public Cancelable getOriginalCancelable() {
            return this.originalCancelable;
        }

        @Override // com.mapbox.common.Cancelable
        public void cancel() {
            this.cancelableSet.remove(this);
            getOriginalCancelable().cancel();
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.onCancel;
            if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            }
        }

        public ExtendedCancelable(NativeObserver nativeObserver, Cancelable cancelable, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Set<ExtendedCancelable> set, Object obj) {
            cancelable.getClass();
            set.getClass();
            this.this$0 = nativeObserver;
            this.originalCancelable = cancelable;
            this.onCancel = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
            this.cancelableSet = set;
            this.listener = obj;
            set.add(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!getClass().equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            ExtendedCancelable extendedCancelable = (ExtendedCancelable) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getOriginalCancelable(), extendedCancelable.getOriginalCancelable()}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cancelableSet, extendedCancelable.cancelableSet}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.onCancel, extendedCancelable.onCancel}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.listener, extendedCancelable.listener}, getCieXyz.write())).booleanValue();
        }

        public int hashCode() {
            return Objects.hash(getOriginalCancelable(), this.cancelableSet, this.onCancel, this.listener);
        }

        public /* synthetic */ ExtendedCancelable(NativeObserver nativeObserver, Cancelable cancelable, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Set set, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(nativeObserver, cancelable, (i & 2) != 0 ? null : r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (i & 4) != 0 ? nativeObserver.cancelableSet : set, (i & 8) != 0 ? null : obj);
        }
    }

    public static /* synthetic */ void get_cancelableSet$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void get_resubscribableSet$maps_sdk_release$annotations() {
    }

    public final Set<? extends Cancelable> get_cancelableSet$maps_sdk_release() {
        return this._cancelableSet;
    }

    public final Set<? extends Cancelable> get_resubscribableSet$maps_sdk_release() {
        return this._resubscribableSet;
    }

    public final class ResubscribeExtendedCancelable extends ExtendedCancelable {
        private Cancelable originalCancelable;
        private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 resubscriber;
        final /* synthetic */ NativeObserver this$0;

        @Override // com.mapbox.maps.NativeObserver.ExtendedCancelable
        public Cancelable getOriginalCancelable() {
            return this.originalCancelable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResubscribeExtendedCancelable(NativeObserver nativeObserver, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Cancelable cancelable, Set<ResubscribeExtendedCancelable> set, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Object obj) {
            super(nativeObserver, cancelable, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, pauseWebviewIfNecessarylambda10.write(set), obj);
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            cancelable.getClass();
            set.getClass();
            this.this$0 = nativeObserver;
            this.resubscriber = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
            this.originalCancelable = cancelable;
        }

        public void setOriginalCancelable(Cancelable cancelable) {
            cancelable.getClass();
            this.originalCancelable = cancelable;
        }

        public final void resubscribe() {
            getOriginalCancelable().cancel();
            setOriginalCancelable((Cancelable) this.resubscriber.invoke());
        }

        @Override // com.mapbox.maps.NativeObserver.ExtendedCancelable
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!ResubscribeExtendedCancelable.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
                return false;
            }
            obj.getClass();
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.resubscriber, ((ResubscribeExtendedCancelable) obj).resubscriber}, getCieXyz.write())).booleanValue();
        }

        @Override // com.mapbox.maps.NativeObserver.ExtendedCancelable
        public int hashCode() {
            int iHashCode = super.hashCode();
            return Objects.hash(Integer.valueOf(iHashCode), this.resubscriber);
        }

        public /* synthetic */ ResubscribeExtendedCancelable(NativeObserver nativeObserver, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Cancelable cancelable, Set set, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(nativeObserver, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, cancelable, set, (i & 8) != 0 ? null : r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (i & 16) != 0 ? null : obj);
        }
    }

    public final void onDestroy() {
        Iterator<T> it = this.cancelableSet.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        Iterator<T> it2 = this.resubscribableSet.iterator();
        while (it2.hasNext()) {
            ((Cancelable) it2.next()).cancel();
        }
    }

    public final void resubscribeStyleLoadListeners() {
        Iterator<T> it = this.resubscribableSet.iterator();
        while (it.hasNext()) {
            ((ResubscribeExtendedCancelable) it.next()).resubscribe();
        }
    }

    public NativeObserver(NativeMapImpl nativeMapImpl) {
        nativeMapImpl.getClass();
        this.observable = nativeMapImpl;
        this.mapLoadingErrorCallbackSet = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<ExtendedCancelable> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.cancelableSet = copyOnWriteArraySet;
        this._cancelableSet = copyOnWriteArraySet;
        CopyOnWriteArraySet<ResubscribeExtendedCancelable> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.resubscribableSet = copyOnWriteArraySet2;
        this._resubscribableSet = copyOnWriteArraySet2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnCameraChangeListener$lambda$2(OnCameraChangeListener onCameraChangeListener, CameraChanged cameraChanged) {
        onCameraChangeListener.getClass();
        cameraChanged.getClass();
        zzlq.toCameraChangedEventData(cameraChanged);
        onCameraChangeListener.onCameraChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnMapIdleListener$lambda$4(OnMapIdleListener onMapIdleListener, MapIdle mapIdle) {
        onMapIdleListener.getClass();
        mapIdle.getClass();
        zzlq.toMapIdleEventData(mapIdle);
        onMapIdleListener.onMapIdle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnMapLoadErrorListener$lambda$5(OnMapLoadErrorListener onMapLoadErrorListener, MapLoadingError mapLoadingError) {
        onMapLoadErrorListener.getClass();
        mapLoadingError.getClass();
        zzlq.toMapLoadingErrorEventData(mapLoadingError);
        onMapLoadErrorListener.onMapLoadError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnMapLoadedListener$lambda$3(OnMapLoadedListener onMapLoadedListener, MapLoaded mapLoaded) {
        onMapLoadedListener.getClass();
        mapLoaded.getClass();
        zzlq.toMapLoadedEventData(mapLoaded);
        onMapLoadedListener.onMapLoaded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnRenderFrameFinishedListener$lambda$14(OnRenderFrameFinishedListener onRenderFrameFinishedListener, RenderFrameFinished renderFrameFinished) {
        onRenderFrameFinishedListener.getClass();
        renderFrameFinished.getClass();
        zzlq.toRenderFrameFinishedEventData(renderFrameFinished);
        onRenderFrameFinishedListener.onRenderFrameFinished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnRenderFrameStartedListener$lambda$13(OnRenderFrameStartedListener onRenderFrameStartedListener, RenderFrameStarted renderFrameStarted) {
        onRenderFrameStartedListener.getClass();
        renderFrameStarted.getClass();
        zzlq.toRenderFrameStartedEventData(renderFrameStarted);
        onRenderFrameStartedListener.onRenderFrameStarted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnSourceAddedListener$lambda$9(OnSourceAddedListener onSourceAddedListener, SourceAdded sourceAdded) {
        onSourceAddedListener.getClass();
        sourceAdded.getClass();
        zzlq.toSourceAddedEventData(sourceAdded);
        onSourceAddedListener.onSourceAdded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnSourceDataLoadedListener$lambda$8(OnSourceDataLoadedListener onSourceDataLoadedListener, SourceDataLoaded sourceDataLoaded) {
        onSourceDataLoadedListener.getClass();
        sourceDataLoaded.getClass();
        zzlq.toSourceDataLoadedEventData(sourceDataLoaded);
        onSourceDataLoadedListener.onSourceDataLoaded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnSourceRemovedListener$lambda$10(OnSourceRemovedListener onSourceRemovedListener, SourceRemoved sourceRemoved) {
        onSourceRemovedListener.getClass();
        sourceRemoved.getClass();
        zzlq.toSourceRemovedEventData(sourceRemoved);
        onSourceRemovedListener.onSourceRemoved();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnStyleDataLoadedListener$lambda$7(OnStyleDataLoadedListener onStyleDataLoadedListener, StyleDataLoaded styleDataLoaded) {
        onStyleDataLoadedListener.getClass();
        styleDataLoaded.getClass();
        zzlq.toStyleDataLoadedEventData(styleDataLoaded);
        onStyleDataLoadedListener.onStyleDataLoaded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnStyleImageMissingListener$lambda$11(OnStyleImageMissingListener onStyleImageMissingListener, StyleImageMissing styleImageMissing) {
        onStyleImageMissingListener.getClass();
        styleImageMissing.getClass();
        zzlq.toStyleImageMissingEventData(styleImageMissing);
        onStyleImageMissingListener.onStyleImageMissing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnStyleImageUnusedListener$lambda$12(OnStyleImageUnusedListener onStyleImageUnusedListener, StyleImageRemoveUnused styleImageRemoveUnused) {
        onStyleImageUnusedListener.getClass();
        styleImageRemoveUnused.getClass();
        zzlq.toStyleImageUnusedEventData(styleImageRemoveUnused);
        onStyleImageUnusedListener.onStyleImageUnused();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnStyleLoadedListener$lambda$6(OnStyleLoadedListener onStyleLoadedListener, StyleLoaded styleLoaded) {
        onStyleLoadedListener.getClass();
        styleLoaded.getClass();
        zzlq.toStyleLoadedEventData(styleLoaded);
        onStyleLoadedListener.onStyleLoaded();
    }

    @onItemDismisslambda0
    public final void removeOnCameraChangeListener(OnCameraChangeListener onCameraChangeListener) {
        onCameraChangeListener.getClass();
        unsubscribeListener(onCameraChangeListener, this.cancelableSet);
    }

    @onItemDismisslambda0
    public final void removeOnMapIdleListener(OnMapIdleListener onMapIdleListener) {
        onMapIdleListener.getClass();
        unsubscribeListener(onMapIdleListener, this.cancelableSet);
    }

    @onItemDismisslambda0
    public final void removeOnMapLoadErrorListener(OnMapLoadErrorListener onMapLoadErrorListener) {
        onMapLoadErrorListener.getClass();
        unsubscribeListener(onMapLoadErrorListener, this.cancelableSet);
    }

    @onItemDismisslambda0
    public final void removeOnMapLoadedListener(OnMapLoadedListener onMapLoadedListener) {
        onMapLoadedListener.getClass();
        unsubscribeListener(onMapLoadedListener, this.cancelableSet);
    }

    @onItemDismisslambda0
    public final void removeOnRenderFrameFinishedListener(OnRenderFrameFinishedListener onRenderFrameFinishedListener) {
        onRenderFrameFinishedListener.getClass();
        unsubscribeListener(onRenderFrameFinishedListener, this.cancelableSet);
    }

    @onItemDismisslambda0
    public final void removeOnRenderFrameStartedListener(OnRenderFrameStartedListener onRenderFrameStartedListener) {
        onRenderFrameStartedListener.getClass();
        unsubscribeListener(onRenderFrameStartedListener, this.cancelableSet);
    }

    @onItemDismisslambda0
    public final void removeOnSourceAddedListener(OnSourceAddedListener onSourceAddedListener) {
        onSourceAddedListener.getClass();
        unsubscribeListener(onSourceAddedListener, this.cancelableSet);
    }

    @onItemDismisslambda0
    public final void removeOnSourceDataLoadedListener(OnSourceDataLoadedListener onSourceDataLoadedListener) {
        onSourceDataLoadedListener.getClass();
        unsubscribeListener(onSourceDataLoadedListener, this.cancelableSet);
    }

    @onItemDismisslambda0
    public final void removeOnSourceRemovedListener(OnSourceRemovedListener onSourceRemovedListener) {
        onSourceRemovedListener.getClass();
        unsubscribeListener(onSourceRemovedListener, this.cancelableSet);
    }

    @onItemDismisslambda0
    public final void removeOnStyleDataLoadedListener(OnStyleDataLoadedListener onStyleDataLoadedListener) {
        onStyleDataLoadedListener.getClass();
        unsubscribeListener(onStyleDataLoadedListener, this.resubscribableSet);
    }

    @onItemDismisslambda0
    public final void removeOnStyleImageMissingListener(OnStyleImageMissingListener onStyleImageMissingListener) {
        onStyleImageMissingListener.getClass();
        unsubscribeListener(onStyleImageMissingListener, this.cancelableSet);
    }

    @onItemDismisslambda0
    public final void removeOnStyleImageUnusedListener(OnStyleImageUnusedListener onStyleImageUnusedListener) {
        onStyleImageUnusedListener.getClass();
        unsubscribeListener(onStyleImageUnusedListener, this.cancelableSet);
    }

    @onItemDismisslambda0
    public final void removeOnStyleLoadedListener(OnStyleLoadedListener onStyleLoadedListener) {
        onStyleLoadedListener.getClass();
        unsubscribeListener(onStyleLoadedListener, this.resubscribableSet);
    }

    public final void sendMapLoadingError(MapLoadingError mapLoadingError) {
        mapLoadingError.getClass();
        Iterator<T> it = this.mapLoadingErrorCallbackSet.iterator();
        while (it.hasNext()) {
            ((MapLoadingErrorCallback) it.next()).run(mapLoadingError);
        }
    }

    @MapboxExperimental
    public final Cancelable subscribeGenericEvent(String str, GenericEventCallback genericEventCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        str.getClass();
        genericEventCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(str, genericEventCallback), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, null, 12, null);
    }

    public final Cancelable subscribeMapLoadingError(final MapLoadingErrorCallback mapLoadingErrorCallback, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnMapLoadErrorListener onMapLoadErrorListener) {
        mapLoadingErrorCallback.getClass();
        this.mapLoadingErrorCallbackSet.add(mapLoadingErrorCallback);
        return new ExtendedCancelable(this, this.observable.subscribe(mapLoadingErrorCallback), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.maps.NativeObserver.subscribeMapLoadingError.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4709invoke() {
                NativeObserver.this.mapLoadingErrorCallbackSet.remove(mapLoadingErrorCallback);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
                if (r8lambdardpfsr94j4iebcwx_kpqzpm8k1 != null) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke();
                }
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4709invoke();
                return createFromParcel.INSTANCE;
            }
        }, null, onMapLoadErrorListener, 4, null);
    }

    private final void unsubscribeListener(Object obj, Set<? extends ExtendedCancelable> set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            Object[] objArr = {((ExtendedCancelable) obj2).getListener(), obj};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ExtendedCancelable) it.next()).cancel();
        }
    }

    public static /* synthetic */ Cancelable subscribeCameraChangedCoalesced$default(NativeObserver nativeObserver, CameraChangedCoalescedCallback cameraChangedCoalescedCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
        }
        return nativeObserver.subscribeCameraChangedCoalesced(cameraChangedCoalescedCallback, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public static /* synthetic */ Cancelable subscribeGenericEvent$default(NativeObserver nativeObserver, String str, GenericEventCallback genericEventCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, Object obj) {
        if ((i & 4) != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
        }
        return nativeObserver.subscribeGenericEvent(str, genericEventCallback, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public static /* synthetic */ Cancelable subscribeResourceRequest$default(NativeObserver nativeObserver, ResourceRequestCallback resourceRequestCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
        }
        return nativeObserver.subscribeResourceRequest(resourceRequestCallback, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    @onItemDismisslambda0
    public final void addOnMapIdleListener(OnMapIdleListener onMapIdleListener) {
        onMapIdleListener.getClass();
        subscribeMapIdle$default(this, new MapIdleCallback() { // from class: com.mapbox.maps.NativeObserver$$ExternalSyntheticLambda0
            @Override // com.mapbox.maps.MapIdleCallback
            public final void run(MapIdle mapIdle) {
                NativeObserver.addOnMapIdleListener$lambda$4(null, mapIdle);
            }
        }, null, onMapIdleListener, 2, null);
    }

    @onItemDismisslambda0
    public final void addOnMapLoadErrorListener(OnMapLoadErrorListener onMapLoadErrorListener) {
        onMapLoadErrorListener.getClass();
        subscribeMapLoadingError$default(this, new MapLoadingErrorCallback() { // from class: com.mapbox.maps.NativeObserver$$ExternalSyntheticLambda3
            @Override // com.mapbox.maps.MapLoadingErrorCallback
            public final void run(MapLoadingError mapLoadingError) {
                NativeObserver.addOnMapLoadErrorListener$lambda$5(null, mapLoadingError);
            }
        }, null, onMapLoadErrorListener, 2, null);
    }

    public final Cancelable subscribeCameraChanged(CameraChangedCallback cameraChangedCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnCameraChangeListener onCameraChangeListener) {
        cameraChangedCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(cameraChangedCallback), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, onCameraChangeListener, 4, null);
    }

    @com.mapbox.annotation.MapboxExperimental
    public final Cancelable subscribeCameraChangedCoalesced(CameraChangedCoalescedCallback cameraChangedCoalescedCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        cameraChangedCoalescedCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(cameraChangedCoalescedCallback), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, null, 12, null);
    }

    public final Cancelable subscribeMapIdle(MapIdleCallback mapIdleCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnMapIdleListener onMapIdleListener) {
        mapIdleCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(mapIdleCallback), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, onMapIdleListener, 4, null);
    }

    public final Cancelable subscribeMapLoaded(MapLoadedCallback mapLoadedCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnMapLoadedListener onMapLoadedListener) {
        mapLoadedCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(mapLoadedCallback), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, onMapLoadedListener, 4, null);
    }

    public final Cancelable subscribeRenderFrameFinished(RenderFrameFinishedCallback renderFrameFinishedCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnRenderFrameFinishedListener onRenderFrameFinishedListener) {
        renderFrameFinishedCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(renderFrameFinishedCallback), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, onRenderFrameFinishedListener, 4, null);
    }

    public final Cancelable subscribeRenderFrameStarted(RenderFrameStartedCallback renderFrameStartedCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnRenderFrameStartedListener onRenderFrameStartedListener) {
        renderFrameStartedCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(renderFrameStartedCallback), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, onRenderFrameStartedListener, 4, null);
    }

    public final Cancelable subscribeResourceRequest(ResourceRequestCallback resourceRequestCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        resourceRequestCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(resourceRequestCallback), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, null, 12, null);
    }

    public final Cancelable subscribeSourceAdded(SourceAddedCallback sourceAddedCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnSourceAddedListener onSourceAddedListener) {
        sourceAddedCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(sourceAddedCallback), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, onSourceAddedListener, 4, null);
    }

    public final Cancelable subscribeSourceDataLoaded(SourceDataLoadedCallback sourceDataLoadedCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnSourceDataLoadedListener onSourceDataLoadedListener) {
        sourceDataLoadedCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(sourceDataLoadedCallback), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, onSourceDataLoadedListener, 4, null);
    }

    public final Cancelable subscribeSourceRemoved(SourceRemovedCallback sourceRemovedCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnSourceRemovedListener onSourceRemovedListener) {
        sourceRemovedCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(sourceRemovedCallback), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, onSourceRemovedListener, 4, null);
    }

    public final Cancelable subscribeStyleDataLoaded(final StyleDataLoadedCallback styleDataLoadedCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnStyleDataLoadedListener onStyleDataLoadedListener) {
        styleDataLoadedCallback.getClass();
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.maps.NativeObserver$subscribeStyleDataLoaded$resubscriber$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Cancelable invoke() {
                return this.this$0.observable.subscribe(styleDataLoadedCallback);
            }
        };
        return new ResubscribeExtendedCancelable(this, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (Cancelable) r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke(), this.resubscribableSet, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, onStyleDataLoadedListener);
    }

    public final Cancelable subscribeStyleImageMissing(StyleImageMissingCallback styleImageMissingCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnStyleImageMissingListener onStyleImageMissingListener) {
        styleImageMissingCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(styleImageMissingCallback), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, onStyleImageMissingListener, 4, null);
    }

    public final Cancelable subscribeStyleImageRemoveUnused(StyleImageRemoveUnusedCallback styleImageRemoveUnusedCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnStyleImageUnusedListener onStyleImageUnusedListener) {
        styleImageRemoveUnusedCallback.getClass();
        return new ExtendedCancelable(this, this.observable.subscribe(styleImageRemoveUnusedCallback), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, onStyleImageUnusedListener, 4, null);
    }

    public final Cancelable subscribeStyleLoaded(final StyleLoadedCallback styleLoadedCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnStyleLoadedListener onStyleLoadedListener) {
        styleLoadedCallback.getClass();
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.maps.NativeObserver$subscribeStyleLoaded$resubscriber$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Cancelable invoke() {
                return this.this$0.observable.subscribe(styleLoadedCallback);
            }
        };
        return new ResubscribeExtendedCancelable(this, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (Cancelable) r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke(), this.resubscribableSet, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, onStyleLoadedListener);
    }

    @onItemDismisslambda0
    public final void addOnCameraChangeListener(OnCameraChangeListener onCameraChangeListener) {
        onCameraChangeListener.getClass();
        subscribeCameraChanged$default(this, new Snapshotter$$ExternalSyntheticLambda0(5), null, onCameraChangeListener, 2, null);
    }

    @onItemDismisslambda0
    public final void addOnRenderFrameFinishedListener(OnRenderFrameFinishedListener onRenderFrameFinishedListener) {
        onRenderFrameFinishedListener.getClass();
        subscribeRenderFrameFinished$default(this, new Snapshotter$$ExternalSyntheticLambda0(2), null, onRenderFrameFinishedListener, 2, null);
    }

    @onItemDismisslambda0
    public final void addOnRenderFrameStartedListener(OnRenderFrameStartedListener onRenderFrameStartedListener) {
        onRenderFrameStartedListener.getClass();
        subscribeRenderFrameStarted$default(this, new Snapshotter$$ExternalSyntheticLambda0(6), null, onRenderFrameStartedListener, 2, null);
    }

    @onItemDismisslambda0
    public final void addOnSourceRemovedListener(OnSourceRemovedListener onSourceRemovedListener) {
        onSourceRemovedListener.getClass();
        subscribeSourceRemoved$default(this, new Snapshotter$$ExternalSyntheticLambda0(3), null, onSourceRemovedListener, 2, null);
    }

    @onItemDismisslambda0
    public final void addOnStyleDataLoadedListener(OnStyleDataLoadedListener onStyleDataLoadedListener) {
        onStyleDataLoadedListener.getClass();
        subscribeStyleDataLoaded$default(this, new Snapshotter$$ExternalSyntheticLambda0(4), null, onStyleDataLoadedListener, 2, null);
    }

    @onItemDismisslambda0
    public final void addOnStyleImageUnusedListener(OnStyleImageUnusedListener onStyleImageUnusedListener) {
        onStyleImageUnusedListener.getClass();
        subscribeStyleImageRemoveUnused$default(this, new Snapshotter$$ExternalSyntheticLambda0(1), null, onStyleImageUnusedListener, 2, null);
    }

    @onItemDismisslambda0
    public final void addOnStyleLoadedListener(OnStyleLoadedListener onStyleLoadedListener) {
        onStyleLoadedListener.getClass();
        subscribeStyleLoaded$default(this, new Snapshotter$$ExternalSyntheticLambda0(7), null, onStyleLoadedListener, 2, null);
    }

    @onItemDismisslambda0
    public final void addOnMapLoadedListener(OnMapLoadedListener onMapLoadedListener) {
        onMapLoadedListener.getClass();
        subscribeMapLoaded$default(this, new MapboxMap$$ExternalSyntheticLambda0(29), null, onMapLoadedListener, 2, null);
    }

    @onItemDismisslambda0
    public final void addOnSourceAddedListener(OnSourceAddedListener onSourceAddedListener) {
        onSourceAddedListener.getClass();
        subscribeSourceAdded$default(this, new Snapshotter$$ExternalSyntheticLambda0(8), null, onSourceAddedListener, 2, null);
    }

    @onItemDismisslambda0
    public final void addOnSourceDataLoadedListener(OnSourceDataLoadedListener onSourceDataLoadedListener) {
        onSourceDataLoadedListener.getClass();
        subscribeSourceDataLoaded$default(this, new Snapshotter$$ExternalSyntheticLambda0(9), null, onSourceDataLoadedListener, 2, null);
    }

    @onItemDismisslambda0
    public final void addOnStyleImageMissingListener(OnStyleImageMissingListener onStyleImageMissingListener) {
        onStyleImageMissingListener.getClass();
        subscribeStyleImageMissing$default(this, new MapboxMap$$ExternalSyntheticLambda0(28), null, onStyleImageMissingListener, 2, null);
    }

    public static /* synthetic */ Cancelable subscribeCameraChanged$default(NativeObserver nativeObserver, CameraChangedCallback cameraChangedCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnCameraChangeListener onCameraChangeListener, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
        }
        if ((i & 4) != 0) {
            onCameraChangeListener = null;
        }
        return nativeObserver.subscribeCameraChanged(cameraChangedCallback, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, onCameraChangeListener);
    }

    public static /* synthetic */ Cancelable subscribeMapIdle$default(NativeObserver nativeObserver, MapIdleCallback mapIdleCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnMapIdleListener onMapIdleListener, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
        }
        if ((i & 4) != 0) {
            onMapIdleListener = null;
        }
        return nativeObserver.subscribeMapIdle(mapIdleCallback, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, onMapIdleListener);
    }

    public static /* synthetic */ Cancelable subscribeMapLoaded$default(NativeObserver nativeObserver, MapLoadedCallback mapLoadedCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnMapLoadedListener onMapLoadedListener, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
        }
        if ((i & 4) != 0) {
            onMapLoadedListener = null;
        }
        return nativeObserver.subscribeMapLoaded(mapLoadedCallback, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, onMapLoadedListener);
    }

    public static /* synthetic */ Cancelable subscribeMapLoadingError$default(NativeObserver nativeObserver, MapLoadingErrorCallback mapLoadingErrorCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnMapLoadErrorListener onMapLoadErrorListener, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
        }
        if ((i & 4) != 0) {
            onMapLoadErrorListener = null;
        }
        return nativeObserver.subscribeMapLoadingError(mapLoadingErrorCallback, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, onMapLoadErrorListener);
    }

    public static /* synthetic */ Cancelable subscribeRenderFrameFinished$default(NativeObserver nativeObserver, RenderFrameFinishedCallback renderFrameFinishedCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnRenderFrameFinishedListener onRenderFrameFinishedListener, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
        }
        if ((i & 4) != 0) {
            onRenderFrameFinishedListener = null;
        }
        return nativeObserver.subscribeRenderFrameFinished(renderFrameFinishedCallback, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, onRenderFrameFinishedListener);
    }

    public static /* synthetic */ Cancelable subscribeRenderFrameStarted$default(NativeObserver nativeObserver, RenderFrameStartedCallback renderFrameStartedCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnRenderFrameStartedListener onRenderFrameStartedListener, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
        }
        if ((i & 4) != 0) {
            onRenderFrameStartedListener = null;
        }
        return nativeObserver.subscribeRenderFrameStarted(renderFrameStartedCallback, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, onRenderFrameStartedListener);
    }

    public static /* synthetic */ Cancelable subscribeSourceAdded$default(NativeObserver nativeObserver, SourceAddedCallback sourceAddedCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnSourceAddedListener onSourceAddedListener, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
        }
        if ((i & 4) != 0) {
            onSourceAddedListener = null;
        }
        return nativeObserver.subscribeSourceAdded(sourceAddedCallback, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, onSourceAddedListener);
    }

    public static /* synthetic */ Cancelable subscribeSourceDataLoaded$default(NativeObserver nativeObserver, SourceDataLoadedCallback sourceDataLoadedCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnSourceDataLoadedListener onSourceDataLoadedListener, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
        }
        if ((i & 4) != 0) {
            onSourceDataLoadedListener = null;
        }
        return nativeObserver.subscribeSourceDataLoaded(sourceDataLoadedCallback, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, onSourceDataLoadedListener);
    }

    public static /* synthetic */ Cancelable subscribeSourceRemoved$default(NativeObserver nativeObserver, SourceRemovedCallback sourceRemovedCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnSourceRemovedListener onSourceRemovedListener, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
        }
        if ((i & 4) != 0) {
            onSourceRemovedListener = null;
        }
        return nativeObserver.subscribeSourceRemoved(sourceRemovedCallback, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, onSourceRemovedListener);
    }

    public static /* synthetic */ Cancelable subscribeStyleDataLoaded$default(NativeObserver nativeObserver, StyleDataLoadedCallback styleDataLoadedCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnStyleDataLoadedListener onStyleDataLoadedListener, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
        }
        if ((i & 4) != 0) {
            onStyleDataLoadedListener = null;
        }
        return nativeObserver.subscribeStyleDataLoaded(styleDataLoadedCallback, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, onStyleDataLoadedListener);
    }

    public static /* synthetic */ Cancelable subscribeStyleImageMissing$default(NativeObserver nativeObserver, StyleImageMissingCallback styleImageMissingCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnStyleImageMissingListener onStyleImageMissingListener, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
        }
        if ((i & 4) != 0) {
            onStyleImageMissingListener = null;
        }
        return nativeObserver.subscribeStyleImageMissing(styleImageMissingCallback, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, onStyleImageMissingListener);
    }

    public static /* synthetic */ Cancelable subscribeStyleImageRemoveUnused$default(NativeObserver nativeObserver, StyleImageRemoveUnusedCallback styleImageRemoveUnusedCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnStyleImageUnusedListener onStyleImageUnusedListener, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
        }
        if ((i & 4) != 0) {
            onStyleImageUnusedListener = null;
        }
        return nativeObserver.subscribeStyleImageRemoveUnused(styleImageRemoveUnusedCallback, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, onStyleImageUnusedListener);
    }

    public static /* synthetic */ Cancelable subscribeStyleLoaded$default(NativeObserver nativeObserver, StyleLoadedCallback styleLoadedCallback, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, OnStyleLoadedListener onStyleLoadedListener, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
        }
        if ((i & 4) != 0) {
            onStyleLoadedListener = null;
        }
        return nativeObserver.subscribeStyleLoaded(styleLoadedCallback, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, onStyleLoadedListener);
    }
}
