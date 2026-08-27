package com.roadrunner.map.container.enabled.presentation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.LegacySessionConfig;
import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SingleProcessDataStore$file$2;
import androidx.sqlite.SQLite;
import coil3.ComponentRegistry$Builder;
import coil3.compose.AsyncImagePainter$launchJob$1;
import com.huawei.wisesecurity.ucs_credential.x;
import com.logistics.rider.glovo.R;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.animation.CameraAnimationsUtils;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.mapbox.navigation.core.lifecycle.MapboxNavigationApp;
import com.mapbox.navigation.tripdata.maneuver.api.MapboxManeuverApi;
import com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl;
import com.roadrunner.home.HomeFragment;
import com.roadrunner.home.HomeFragment$$ExternalSyntheticLambda4;
import com.roadrunner.map.container.enabled.usecases.recenter.RecenterMapTriggerImpl;
import com.roadrunner.map.integration.mapbox.domain.GetLineLayer;
import com.roadrunner.map.integration.mapbox.maneuver.ManeuverApi;
import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl;
import com.roadrunner.map.integration.mapbox.route.RouteLineApi$$ExternalSyntheticLambda7;
import com.roadrunner.map.integration.mapbox.route.preview.SecondaryRouteApi;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import com.sentiance.core.model.events.H$b;
import com.ui.common.base.BaseInjectionFragment;
import dagger.Lazy;
import io.grpc.internal.SharedResourcePool;
import io.sentry.CombinedScopeView;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.DelayKt;
import o.FontEj4NQ78default;
import o.G;
import o.M;
import o.N;
import o.ShortNewsContentCardView;
import o.accessgetParagraphcp;
import o.accessgetSimplecp;
import o.accessisRenderNodeCompatiblecp;
import o.childSerializers;
import o.createQuery;
import o.dg;
import o.dh;
import o.displayInAppMessagelambda1;
import o.e6;
import o.eb;
import o.fromColorLong;
import o.g3;
import o.getNormalusljTpc;
import o.getSdkEnablementProviderandroid_sdk_base_release;
import o.h5;
import o.hc;
import o.he;
import o.i0;
import o.i2ExternalSyntheticLambda3;
import o.ia;
import o.ie;
import o.igExternalSyntheticLambda1;
import o.igExternalSyntheticLambda2;
import o.igExternalSyntheticLambda7;
import o.initLifecycle;
import o.instance_delegatelambda0;
import o.j2;
import o.j6;
import o.jb;
import o.ld;
import o.m7;
import o.mh;
import o.nExternalSyntheticLambda4;
import o.o6ExternalSyntheticLambda9;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;
import o.toBitmapConfig1JJdX4A;
import o.updateHasCallbacks;
import okio.internal.ResourceFileSystem$$ExternalSyntheticLambda0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class MapboxFragment extends BaseInjectionFragment {
    private static int ResultReceiver = 0;
    private static int getNavigationEventDispatcher = 1;
    public M IconCompatParcelizer;
    public MapNavigationWrapper MediaBrowserCompatMediaItem;
    public ComponentRegistry$Builder MediaDescriptionCompat;
    public N MediaMetadataCompat;
    public e6 MediaSessionCompatQueueItem;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY MediaSessionCompatResultReceiverWrapper;
    public Lazy MediaSessionCompatToken;
    public int ParcelableVolumeInfo;
    public final ComponentRegistry$Builder PlaybackStateCompat;
    public igExternalSyntheticLambda2 PlaybackStateCompatCustomAction;
    public hc RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public createQuery read;
    public Lazy serializer;
    public G write;

    public MapboxFragment() {
        super(0);
        ResourceFileSystem$$ExternalSyntheticLambda0 resourceFileSystem$$ExternalSyntheticLambda0 = new ResourceFileSystem$$ExternalSyntheticLambda0(8, this);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new SingleProcessDataStore$file$2(15, new SingleProcessDataStore$file$2(14, this)));
        this.PlaybackStateCompat = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(MapViewModel.class), new initLifecycle(onviewdetachedfromwindowlambda1Serializer, 2), resourceFileSystem$$ExternalSyntheticLambda0, new initLifecycle(onviewdetachedfromwindowlambda1Serializer, 3));
    }

    public final MapViewModel write() {
        int i = 2 % 2;
        int i2 = ResultReceiver + 19;
        getNavigationEventDispatcher = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (MapViewModel) this.PlaybackStateCompat.MediaSessionCompatResultReceiverWrapper();
        }
        throw null;
    }

    public final Lazy serializer() {
        int i = 2 % 2;
        int i2 = ResultReceiver;
        int i3 = i2 + 109;
        getNavigationEventDispatcher = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Lazy lazy = this.serializer;
        if (lazy == null) {
            removeNodeAtDepth.serializer("centerMapDelegate");
            throw null;
        }
        int i4 = i2 + 53;
        getNavigationEventDispatcher = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return lazy;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 2 % 2;
        int i2 = ResultReceiver + 101;
        getNavigationEventDispatcher = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onResume();
        ComponentRegistry$Builder componentRegistry$Builder = this.MediaDescriptionCompat;
        if (componentRegistry$Builder != null) {
            ((g3) componentRegistry$Builder.serializer).updatePermissionSettings(write().write.serializer);
        }
        int i4 = ResultReceiver + 13;
        getNavigationEventDispatcher = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r0 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r0 = (android.widget.FrameLayout) r0;
        r5.write = new o.G(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        throw new java.lang.NullPointerException("rootView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r0 != null) goto L13;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            r8 = 2
            int r0 = r8 % r8
            int r0 = com.roadrunner.map.container.enabled.presentation.MapboxFragment.getNavigationEventDispatcher
            int r0 = r0 + 75
            int r1 = r0 % 128
            com.roadrunner.map.container.enabled.presentation.MapboxFragment.ResultReceiver = r1
            int r0 = r0 % r8
            r1 = 2131558505(0x7f0d0069, float:1.8742328E38)
            r2 = 0
            if (r0 == 0) goto L1e
            r6.getClass()
            android.view.View r0 = r6.inflate(r1, r7, r2)     // Catch: java.lang.RuntimeException -> L1c
            if (r0 == 0) goto L31
            goto L27
        L1c:
            r0 = move-exception
            goto L39
        L1e:
            r6.getClass()
            android.view.View r0 = r6.inflate(r1, r7, r2)     // Catch: java.lang.RuntimeException -> L1c
            if (r0 == 0) goto L31
        L27:
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0     // Catch: java.lang.RuntimeException -> L1c
            o.G r1 = new o.G     // Catch: java.lang.RuntimeException -> L1c
            r1.<init>(r0, r0)     // Catch: java.lang.RuntimeException -> L1c
            r5.write = r1     // Catch: java.lang.RuntimeException -> L1c
            return r0
        L31:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.RuntimeException -> L1c
            java.lang.String r1 = "rootView"
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> L1c
            throw r0     // Catch: java.lang.RuntimeException -> L1c
        L39:
            timber.log.Timber$Forest r1 = timber.log.Timber.RemoteActionCompatParcelizer
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "MapboxInvalidModuleException occurred"
            r1.RemoteActionCompatParcelizer(r0, r4, r3)
            r0 = 1
            r5.RemoteActionCompatParcelizer = r0
            o.F r6 = o.F.write(r6, r7)
            android.widget.FrameLayout r6 = r6.serializer()
            int r7 = com.roadrunner.map.container.enabled.presentation.MapboxFragment.ResultReceiver
            int r7 = r7 + 123
            int r0 = r7 % 128
            com.roadrunner.map.container.enabled.presentation.MapboxFragment.getNavigationEventDispatcher = r0
            int r7 = r7 % r8
            if (r7 != 0) goto L5b
            r7 = 51
            int r7 = r7 / r2
        L5b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.map.container.enabled.presentation.MapboxFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        createQuery createquery = this.read;
        if (createquery == null) {
            removeNodeAtDepth.serializer("getMapboxInitializationStrategy");
            throw null;
        }
        igExternalSyntheticLambda1 igexternalsyntheticlambda1Write = createquery.write();
        if (igexternalsyntheticlambda1Write != igExternalSyntheticLambda1.NONE) {
            int i2 = getNavigationEventDispatcher;
            int i3 = i2 + 99;
            ResultReceiver = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            igExternalSyntheticLambda2 igexternalsyntheticlambda2 = this.PlaybackStateCompatCustomAction;
            if (igexternalsyntheticlambda2 == null) {
                removeNodeAtDepth.serializer("mapboxInitializationStateProvider");
                throw null;
            }
            int i5 = i2 + 9;
            ResultReceiver = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                igexternalsyntheticlambda2.write.read();
                igExternalSyntheticLambda7 igexternalsyntheticlambda7 = igExternalSyntheticLambda7.NONE;
                throw null;
            }
            if (igexternalsyntheticlambda2.write.read() != igExternalSyntheticLambda7.NONE) {
                accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(viewLifecycleOwner.getLifecycle()), null, null, new AsyncImagePainter$launchJob$1(igexternalsyntheticlambda1Write, this, bundle, null, 25), 3);
                int i6 = ResultReceiver + 77;
                getNavigationEventDispatcher = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return;
            }
        }
        int i8 = getNavigationEventDispatcher + 121;
        ResultReceiver = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            onMapReady(bundle);
        } else {
            onMapReady(bundle);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0077 A[PHI: r4 r5 r8 r9
  0x0077: PHI (r4v18 com.mapbox.maps.MapboxMap) = (r4v1 com.mapbox.maps.MapboxMap), (r4v19 com.mapbox.maps.MapboxMap) binds: [B:20:0x0074, B:17:0x005f] A[DONT_GENERATE, DONT_INLINE]
  0x0077: PHI (r5v8 com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl) = 
  (r5v5 com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl)
  (r5v9 com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl)
 binds: [B:20:0x0074, B:17:0x005f] A[DONT_GENERATE, DONT_INLINE]
  0x0077: PHI (r8v7 o.m7) = (r8v4 o.m7), (r8v8 o.m7) binds: [B:20:0x0074, B:17:0x005f] A[DONT_GENERATE, DONT_INLINE]
  0x0077: PHI (r9v17 com.mapbox.maps.Style) = (r9v2 com.mapbox.maps.Style), (r9v18 com.mapbox.maps.Style) binds: [B:20:0x0074, B:17:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() throws InterruptedException, IOException {
        MapNavigationImpl mapNavigationImpl;
        m7 m7Var;
        MapboxMap mapboxMapDeprecated;
        Style styleDeprecated;
        int i = 2 % 2;
        ComponentRegistry$Builder componentRegistry$Builder = this.MediaDescriptionCompat;
        Object obj = null;
        if (componentRegistry$Builder != null) {
            MapNavigationWrapper mapNavigationWrapper = this.MediaBrowserCompatMediaItem;
            if (mapNavigationWrapper == null) {
                removeNodeAtDepth.serializer("mapNavigationWrapper");
                throw null;
            }
            accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            View viewIconCompatParcelizer = ((g3) componentRegistry$Builder.serializer).IconCompatParcelizer();
            viewIconCompatParcelizer.getClass();
            MapView mapView = (MapView) viewIconCompatParcelizer;
            if (mapNavigationWrapper.MediaDescriptionCompat.serializer() && mapNavigationWrapper.RatingCompat) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("MapNavigationWrapper detach", new Object[0]);
                o6ExternalSyntheticLambda9 o6externalsyntheticlambda9 = mapNavigationWrapper.MediaSessionCompatQueueItem;
                if (o6externalsyntheticlambda9 != null) {
                    int i2 = ResultReceiver + 85;
                    getNavigationEventDispatcher = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        mapNavigationImpl = (MapNavigationImpl) o6externalsyntheticlambda9;
                        m7Var = mapNavigationImpl.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                        MapboxNavigationApp.detach(viewLifecycleOwner);
                        mapboxMapDeprecated = mapView.getMapboxMapDeprecated();
                        mapboxMapDeprecated.getClass();
                        styleDeprecated = mapboxMapDeprecated.getStyleDeprecated();
                        int i3 = 15 / 0;
                        if (styleDeprecated != null) {
                            m7Var.IconCompatParcelizer(styleDeprecated);
                            NetworkingCoreModule$$ExternalSyntheticLambda2 networkingCoreModule$$ExternalSyntheticLambda2 = new NetworkingCoreModule$$ExternalSyntheticLambda2(12, m7Var);
                            m7Var.IconCompatParcelizer(styleDeprecated);
                            m7Var.IconCompatParcelizer().clearRouteLine(new RouteLineApi$$ExternalSyntheticLambda7(m7Var, styleDeprecated, networkingCoreModule$$ExternalSyntheticLambda2));
                        }
                    } else {
                        mapNavigationImpl = (MapNavigationImpl) o6externalsyntheticlambda9;
                        m7Var = mapNavigationImpl.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                        MapboxNavigationApp.detach(viewLifecycleOwner);
                        mapboxMapDeprecated = mapView.getMapboxMapDeprecated();
                        mapboxMapDeprecated.getClass();
                        styleDeprecated = mapboxMapDeprecated.getStyleDeprecated();
                        if (styleDeprecated != null) {
                            m7Var.IconCompatParcelizer(styleDeprecated);
                            NetworkingCoreModule$$ExternalSyntheticLambda2 networkingCoreModule$$ExternalSyntheticLambda3 = new NetworkingCoreModule$$ExternalSyntheticLambda2(12, m7Var);
                            m7Var.IconCompatParcelizer(styleDeprecated);
                            m7Var.IconCompatParcelizer().clearRouteLine(new RouteLineApi$$ExternalSyntheticLambda7(m7Var, styleDeprecated, networkingCoreModule$$ExternalSyntheticLambda3));
                        }
                    }
                    mapNavigationImpl.stopTurnByTurnApis(mapboxMapDeprecated);
                    ld ldVar = mapNavigationImpl._init_lambda1;
                    ldVar.RemoteActionCompatParcelizer = "";
                    ldVar.read = getNormalusljTpc.RemoteActionCompatParcelizer(ldVar.read, "");
                    ia iaVar = mapNavigationImpl.ResultReceiver;
                    iaVar.MediaBrowserCompatMediaItem = null;
                    iaVar.ParcelableVolumeInfo = null;
                    MapView mapView2 = iaVar.MediaMetadataCompat;
                    if (mapView2 != null) {
                        CameraAnimationsPlugin camera = CameraAnimationsUtils.getCamera(mapView2);
                        ie ieVar = iaVar.PlaybackStateCompatCustomAction;
                        ieVar.getClass();
                        ((CameraAnimationsPluginImpl) camera).lifecycleListeners.remove(ieVar);
                        int i4 = ResultReceiver + 109;
                        getNavigationEventDispatcher = i4 % Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                    }
                    MapView mapView3 = iaVar.MediaMetadataCompat;
                    if (mapView3 != null) {
                        SQLite.getCompass(mapView3).setEnabled(true);
                    }
                    MapView mapView4 = iaVar.MediaMetadataCompat;
                    if (mapView4 != null) {
                        int i6 = ResultReceiver + 27;
                        getNavigationEventDispatcher = i6 % Fields.SpotShadowColor;
                        if (i6 % 2 == 0) {
                            mapView4.setKeepScreenOn(true);
                        } else {
                            mapView4.setKeepScreenOn(false);
                        }
                    }
                    iaVar.MediaMetadataCompat = null;
                    iaVar.MediaSessionCompatQueueItem = true;
                    r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = iaVar.read;
                    if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                    }
                    iaVar.read = null;
                    iaVar.RatingCompat = null;
                    i0 i0Var = mapNavigationImpl.write;
                    H$b h$b = i0Var.write;
                    if (h$b != null) {
                        int i7 = getNavigationEventDispatcher + 93;
                        ResultReceiver = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        h$b.cancel();
                    }
                    i0Var.write = null;
                    i0Var.IconCompatParcelizer = null;
                    i0Var.read = null;
                    i0Var.RemoteActionCompatParcelizer.serializer.IconCompatParcelizer(Boolean.FALSE);
                    ManeuverApi maneuverApi = mapNavigationImpl.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    MapboxManeuverApi mapboxManeuverApi = maneuverApi.MediaMetadataCompat;
                    if (mapboxManeuverApi != null) {
                        int i9 = ResultReceiver + 61;
                        getNavigationEventDispatcher = i9 % Fields.SpotShadowColor;
                        if (i9 % 2 == 0) {
                            mapboxManeuverApi.cancel();
                            obj.hashCode();
                            throw null;
                        }
                        mapboxManeuverApi.cancel();
                    }
                    maneuverApi.MediaMetadataCompat = null;
                    mh mhVar = mapNavigationImpl.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                    x xVar = mhVar.RemoteActionCompatParcelizer;
                    if (xVar != null) {
                        xVar.cancel();
                    }
                    LegacySessionConfig legacySessionConfig = mhVar.write;
                    if (legacySessionConfig != null) {
                        legacySessionConfig.shutdown();
                        int i10 = getNavigationEventDispatcher + 25;
                        ResultReceiver = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                    }
                    mhVar.RemoteActionCompatParcelizer = null;
                    mhVar.write = null;
                    nExternalSyntheticLambda4 nexternalsyntheticlambda4 = mhVar.MediaDescriptionCompat;
                    childSerializers childserializers = childSerializers.UNAVAILABLE;
                    childserializers.getClass();
                    nexternalsyntheticlambda4.read.write(childserializers);
                    if (m7Var.IconCompatParcelizer != null) {
                        m7Var.RemoteActionCompatParcelizer().cancel();
                    }
                    m7Var.serializer = null;
                    m7Var.MediaDescriptionCompat = null;
                    m7Var.MediaSessionCompatQueueItem = null;
                    SecondaryRouteApi secondaryRouteApi = mapNavigationImpl.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                    DeferredCoroutine deferredCoroutine = secondaryRouteApi.write;
                    if (deferredCoroutine != null) {
                        int i12 = ResultReceiver + 35;
                        getNavigationEventDispatcher = i12 % Fields.SpotShadowColor;
                        if (i12 % 2 == 0) {
                            deferredCoroutine.write((CancellationException) null);
                            throw null;
                        }
                        deferredCoroutine.write((CancellationException) null);
                    }
                    secondaryRouteApi.write = null;
                    secondaryRouteApi.read = null;
                    LocationComponentPluginImpl locationComponent = DelayKt.getLocationComponent(mapView);
                    Context applicationContext = mapNavigationImpl.IconCompatParcelizer.getApplicationContext();
                    applicationContext.getClass();
                    locationComponent.setLocationProvider(new CombinedScopeView(applicationContext, mapNavigationImpl.PlaybackStateCompatCustomAction));
                    mapNavigationImpl.read = null;
                    mapNavigationImpl.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = instance_delegatelambda0.write;
                    accessgetParagraphcp accessgetparagraphcp = mapNavigationImpl.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    accessgetparagraphcp.IconCompatParcelizer.write(new accessgetSimplecp("navigation_lifecycle_destroy"));
                }
                mapNavigationWrapper.MediaSessionCompatQueueItem = null;
            }
        }
        ComponentRegistry$Builder componentRegistry$Builder2 = this.MediaDescriptionCompat;
        if (componentRegistry$Builder2 != null) {
            ((g3) componentRegistry$Builder2.serializer).destroy();
            componentRegistry$Builder2.serializer = new getSdkEnablementProviderandroid_sdk_base_release(2);
        }
        this.MediaDescriptionCompat = null;
        this.write = null;
        super.onDestroyView();
    }

    public final void onMapReady(Bundle bundle) {
        int i = 2;
        int i2 = 2 % 2;
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i3 = 0;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(viewLifecycleOwner.getLifecycle()), null, null, new MapboxFragment$observeLocationUpdates$1(this, shortNewsContentCardView, i3), 3);
        hc hcVar = this.RatingCompat;
        if (hcVar == null) {
            removeNodeAtDepth.serializer("mapAdapterFactory");
            throw null;
        }
        G g = this.write;
        g.getClass();
        Context context = g.read.getContext();
        context.getClass();
        SharedResourcePool sharedResourcePool = new SharedResourcePool(this);
        N n = this.MediaMetadataCompat;
        if (n == null) {
            removeNodeAtDepth.serializer("isMetricsEnabled");
            throw null;
        }
        boolean z = n.RemoteActionCompatParcelizer.getBoolean(n.IconCompatParcelizer.IconCompatParcelizer(R.string.preference_map_metrics), false);
        accessisRenderNodeCompatiblecp viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        fromColorLong fromcolorlong = toBitmapConfig1JJdX4A.read(viewLifecycleOwner2.getLifecycle());
        he heVar = hcVar.serializer;
        Object objWrite = heVar.write.write();
        objWrite.getClass();
        jb jbVar = (jb) objWrite;
        Object objWrite2 = heVar.read.write();
        objWrite2.getClass();
        j6 j6Var = (j6) objWrite2;
        Object objWrite3 = heVar.RemoteActionCompatParcelizer.write();
        objWrite3.getClass();
        GetLineLayer getLineLayer = (GetLineLayer) objWrite3;
        Object objWrite4 = heVar.serializer.write();
        objWrite4.getClass();
        j2 j2Var = (j2) objWrite4;
        Object objWrite5 = heVar.IconCompatParcelizer.write();
        objWrite5.getClass();
        h5 h5Var = (h5) objWrite5;
        Object objWrite6 = heVar.MediaSessionCompatQueueItem.write();
        objWrite6.getClass();
        Object obj = heVar.MediaMetadataCompat.write;
        obj.getClass();
        ComponentRegistry$Builder componentRegistry$Builder = new ComponentRegistry$Builder(jbVar, j6Var, getLineLayer, j2Var, h5Var, (eb) objWrite6, (i2ExternalSyntheticLambda3) obj, context, sharedResourcePool, z, fromcolorlong);
        G g2 = this.write;
        g2.getClass();
        FrameLayout frameLayout = g2.read;
        View viewIconCompatParcelizer = ((g3) componentRegistry$Builder.serializer).IconCompatParcelizer();
        viewIconCompatParcelizer.getClass();
        frameLayout.addView(viewIconCompatParcelizer);
        MapNavigationWrapper mapNavigationWrapper = this.MediaBrowserCompatMediaItem;
        if (mapNavigationWrapper == null) {
            removeNodeAtDepth.serializer("mapNavigationWrapper");
            throw null;
        }
        int i4 = 1;
        int i5 = getNavigationEventDispatcher + 1;
        ResultReceiver = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        accessisRenderNodeCompatiblecp viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        View viewIconCompatParcelizer2 = ((g3) componentRegistry$Builder.serializer).IconCompatParcelizer();
        viewIconCompatParcelizer2.getClass();
        MapView mapView = (MapView) viewIconCompatParcelizer2;
        if (mapNavigationWrapper.MediaDescriptionCompat.serializer()) {
            mapNavigationWrapper.MediaSessionCompatQueueItem = (o6ExternalSyntheticLambda9) mapNavigationWrapper.MediaMetadataCompat.write();
            if (((Boolean) mapNavigationWrapper.write.write.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(viewLifecycleOwner3.getLifecycle()), null, null, new AsyncImagePainter$launchJob$1(mapNavigationWrapper, viewLifecycleOwner3, mapView, null, 24), 3);
            } else {
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(viewLifecycleOwner3.getLifecycle()), null, null, new MapNavigationWrapper$attachWithEagerInit$1(viewLifecycleOwner3, mapNavigationWrapper, mapView, null), 3);
            }
        }
        this.MediaDescriptionCompat = componentRegistry$Builder;
        accessisRenderNodeCompatiblecp viewLifecycleOwner4 = getViewLifecycleOwner();
        viewLifecycleOwner4.getClass();
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(viewLifecycleOwner4.getLifecycle()), null, null, new MapboxFragment$observeLocationUpdates$1(this, shortNewsContentCardView, i), 3);
        accessisRenderNodeCompatiblecp viewLifecycleOwner5 = getViewLifecycleOwner();
        viewLifecycleOwner5.getClass();
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(viewLifecycleOwner5.getLifecycle()), null, null, new MapboxFragment$observeLocationUpdates$1(this, shortNewsContentCardView, 4), 3);
        dh dhVar = write().write;
        accessisRenderNodeCompatiblecp viewLifecycleOwner6 = getViewLifecycleOwner();
        viewLifecycleOwner6.getClass();
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(viewLifecycleOwner6.getLifecycle()), null, null, new MapboxFragment$observeMapLayering$1$1(this, dhVar, (ShortNewsContentCardView) null), 3);
        dhVar.read.RemoteActionCompatParcelizer(this, new MapboxFragment$$ExternalSyntheticLambda0(this, i3));
        SharedResourcePool sharedResourcePool2 = write().MediaDescriptionCompat;
        accessisRenderNodeCompatiblecp viewLifecycleOwner7 = getViewLifecycleOwner();
        viewLifecycleOwner7.getClass();
        sharedResourcePool2.RemoteActionCompatParcelizer(viewLifecycleOwner7, new HomeFragment.AnonymousClass1(1, this, MapboxFragment.class, "observePendingAction", "observePendingAction(Lcom/roadrunner/map/container/enabled/presentation/viewevent/MapAction;)V", 0, 23));
        G g3 = this.write;
        g3.getClass();
        g3.serializer.setOnApplyWindowInsetsListener(new HomeFragment$$ExternalSyntheticLambda4(this, i4));
        if (bundle == null) {
            int i7 = ResultReceiver + 23;
            getNavigationEventDispatcher = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            MapViewModel mapViewModelWrite = write();
            dg dgVar = mapViewModelWrite.MediaMetadataCompat;
            FontEj4NQ78default fontEj4NQ78default = dgVar.write;
            String str = (String) ((StateV3AnalyticsProviderImpl) fontEj4NQ78default.read).write().get("currentDeliveryId");
            if (str == null) {
                str = "";
            }
            if (str.length() > 0) {
                dgVar.read.logEvent("deliveries_location_icon_clicked", onMove.serializer(fontEj4NQ78default.write(), new onViewAttachedToWindowlambda0("screenName", "Map")));
            }
            RecenterMapTriggerImpl recenterMapTriggerImpl = mapViewModelWrite.MediaSessionCompatQueueItem;
            updateHasCallbacks updatehascallbacks = updateHasCallbacks.Initial;
            recenterMapTriggerImpl.getClass();
            updatehascallbacks.getClass();
            recenterMapTriggerImpl.RemoteActionCompatParcelizer.onNext(updatehascallbacks);
        }
        int i9 = ResultReceiver + 37;
        getNavigationEventDispatcher = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            return;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }
}
