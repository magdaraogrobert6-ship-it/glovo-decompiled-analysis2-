package com.roadrunner.map.container.enabled.presentation;

import android.content.Context;
import androidx.compose.ui.graphics.Fields;
import androidx.navigation.compose.NavHostKt$NavHost$29$1;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.Vw$Vw;
import com.mapbox.common.LogConfiguration;
import com.mapbox.common.location.AccuracyLevel;
import com.mapbox.common.location.IntervalSettings;
import com.mapbox.common.location.LocationProviderRequest;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.plugin.animation.CameraAnimationsUtils;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.mapbox.navigation.base.formatter.DistanceFormatterOptions;
import com.mapbox.navigation.base.options.NavigationOptions;
import com.mapbox.navigation.base.utils.NavigationPerformance;
import com.mapbox.navigation.core.lifecycle.MapboxNavigationApp;
import com.mapbox.navigation.core.utils.Delayer;
import com.mapbox.navigation.ui.maps.camera.NavigationCamera;
import com.mapbox.navigation.ui.maps.camera.data.FollowingFrameOptions;
import com.mapbox.navigation.ui.maps.camera.data.MapboxNavigationViewportDataSource;
import com.roadrunner.delivery.repository.CachedDeliveryRepository;
import com.roadrunner.domain.usecase.SuspendingWorkUseCase$$ExternalSyntheticLambda0;
import com.roadrunner.home.nest.NestLoadingServiceImpl$special$$inlined$map$1;
import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl;
import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.sentiance.core.model.events.H$b;
import io.sentry.metrics.MetricsBatchProcessor;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import o.C0196q;
import o.C0200s;
import o.ImageHeaderParserImageType;
import o.accessisRenderNodeCompatiblecp;
import o.createFromParcel;
import o.createQuery;
import o.fromColorLong;
import o.getHeadingrAG3T2k;
import o.hb;
import o.i0;
import o.i1;
import o.ia;
import o.igExternalSyntheticLambda1;
import o.igExternalSyntheticLambda2;
import o.igExternalSyntheticLambda7;
import o.l1;
import o.m7;
import o.o6ExternalSyntheticLambda9;
import o.performViewCreated;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.toBitmapConfig1JJdX4A;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class MapNavigationWrapper {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int PlaybackStateCompat = 1;
    public final getHeadingrAG3T2k IconCompatParcelizer;
    public final igExternalSyntheticLambda2 MediaBrowserCompatMediaItem;
    public final performViewCreated MediaDescriptionCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaMetadataCompat;
    public o6ExternalSyntheticLambda9 MediaSessionCompatQueueItem;
    public boolean RatingCompat;
    public final createQuery RemoteActionCompatParcelizer;
    public final MetricsBatchProcessor read;
    public final CachedDeliveryRepository serializer;
    public final hb write;

    public MapNavigationWrapper(l1 l1Var, performViewCreated performviewcreated, CachedDeliveryRepository cachedDeliveryRepository, igExternalSyntheticLambda2 igexternalsyntheticlambda2, createQuery createquery, MetricsBatchProcessor metricsBatchProcessor, getHeadingrAG3T2k getheadingrag3t2k, hb hbVar) {
        l1Var.getClass();
        performviewcreated.getClass();
        igexternalsyntheticlambda2.getClass();
        getheadingrag3t2k.getClass();
        hbVar.getClass();
        this.MediaMetadataCompat = l1Var;
        this.MediaDescriptionCompat = performviewcreated;
        this.serializer = cachedDeliveryRepository;
        this.MediaBrowserCompatMediaItem = igexternalsyntheticlambda2;
        this.RemoteActionCompatParcelizer = createquery;
        this.read = metricsBatchProcessor;
        this.IconCompatParcelizer = getheadingrag3t2k;
        this.write = hbVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public final Object waitForMapboxInitialization(ContinuationImpl continuationImpl) {
        C0196q c0196q;
        int i = 2 % 2;
        if (continuationImpl instanceof C0196q) {
            c0196q = (C0196q) continuationImpl;
            int i2 = c0196q.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0196q.write = i2 - Integer.MIN_VALUE;
                int i3 = PlaybackStateCompat + 53;
                MediaSessionCompatResultReceiverWrapper = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    int i4 = 4 % 4;
                }
            } else {
                c0196q = new C0196q(this, continuationImpl);
                int i5 = PlaybackStateCompat + 113;
                MediaSessionCompatResultReceiverWrapper = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        } else {
            c0196q = new C0196q(this, continuationImpl);
            int i7 = PlaybackStateCompat + 113;
            MediaSessionCompatResultReceiverWrapper = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        Object obj = c0196q.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = c0196q.write;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            igExternalSyntheticLambda1 igexternalsyntheticlambda1Write = this.RemoteActionCompatParcelizer.write();
            if (igexternalsyntheticlambda1Write != igExternalSyntheticLambda1.NONE) {
                igExternalSyntheticLambda2 igexternalsyntheticlambda2 = this.MediaBrowserCompatMediaItem;
                if (((igExternalSyntheticLambda7) igexternalsyntheticlambda2.write.read()) != igExternalSyntheticLambda7.NONE) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("MapNavigationWrapper waiting for Navigation SDK initialization (strategy: " + igexternalsyntheticlambda1Write + ")", new Object[0]);
                    NestLoadingServiceImpl$special$$inlined$map$1 nestLoadingServiceImpl$special$$inlined$map$1 = new NestLoadingServiceImpl$special$$inlined$map$1(igexternalsyntheticlambda2.write, 29);
                    c0196q.write = 1;
                    if (FlowKt.first(nestLoadingServiceImpl$special$$inlined$map$1, c0196q) == coroutineSingletons) {
                        int i10 = MediaSessionCompatResultReceiverWrapper + 121;
                        PlaybackStateCompat = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        return coroutineSingletons;
                    }
                }
            }
            return createFromParcel.INSTANCE;
        }
        int i12 = MediaSessionCompatResultReceiverWrapper + 65;
        PlaybackStateCompat = i12 % Fields.SpotShadowColor;
        if (i12 % 2 != 0 ? i9 != 1 : i9 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("MapNavigationWrapper Navigation SDK initialization complete", new Object[0]);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c A[PHI: r3 r6
  0x008c: PHI (r3v12 timber.log.Timber$Forest) = (r3v11 timber.log.Timber$Forest), (r3v28 timber.log.Timber$Forest) binds: [B:28:0x008a, B:25:0x007e] A[DONT_GENERATE, DONT_INLINE]
  0x008c: PHI (r6v5 o.o6ExternalSyntheticLambda9) = (r6v4 o.o6ExternalSyntheticLambda9), (r6v24 o.o6ExternalSyntheticLambda9) binds: [B:28:0x008a, B:25:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    public static final Object access$initAndAttachNavigation(MapNavigationWrapper mapNavigationWrapper, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, MapView mapView, ContinuationImpl continuationImpl) {
        C0200s c0200s;
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp2;
        MapView mapView2;
        Timber.Forest forest;
        o6ExternalSyntheticLambda9 o6externalsyntheticlambda9;
        MapNavigationImpl mapNavigationImpl;
        boolean zIconCompatParcelizer;
        ImageHeaderParserImageType imageHeaderParserImageType;
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 113;
        int i3 = i2 % Fields.SpotShadowColor;
        PlaybackStateCompat = i3;
        int i4 = i2 % 2;
        if (continuationImpl instanceof C0200s) {
            int i5 = i3 + 59;
            MediaSessionCompatResultReceiverWrapper = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = ((C0200s) continuationImpl).write;
                throw null;
            }
            c0200s = (C0200s) continuationImpl;
            int i7 = c0200s.write;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c0200s.write = i7 - Integer.MIN_VALUE;
            } else {
                c0200s = new C0200s(mapNavigationWrapper, continuationImpl);
            }
        } else {
            c0200s = new C0200s(mapNavigationWrapper, continuationImpl);
        }
        Object obj = c0200s.serializer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = c0200s.write;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            accessisrendernodecompatiblecp2 = accessisrendernodecompatiblecp;
            c0200s.read = accessisrendernodecompatiblecp2;
            c0200s.IconCompatParcelizer = mapView;
            c0200s.write = 1;
            if (mapNavigationWrapper.waitForMapboxInitialization(c0200s) == obj2) {
                return obj2;
            }
            mapView2 = mapView;
        } else {
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mapView2 = c0200s.IconCompatParcelizer;
            accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp3 = c0200s.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            accessisrendernodecompatiblecp2 = accessisrendernodecompatiblecp3;
        }
        int i9 = MediaSessionCompatResultReceiverWrapper + 67;
        PlaybackStateCompat = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            forest = Timber.RemoteActionCompatParcelizer;
            forest.IconCompatParcelizer("MapNavigationWrapper attach", new Object[1]);
            o6externalsyntheticlambda9 = mapNavigationWrapper.MediaSessionCompatQueueItem;
            if (o6externalsyntheticlambda9 != null) {
                mapNavigationImpl = (MapNavigationImpl) o6externalsyntheticlambda9;
                zIconCompatParcelizer = ((FirebaseRemoteConfigImpl) mapNavigationImpl.MediaMetadataCompat).IconCompatParcelizer(updateAdidI.IS_MAPBOX_LOGGING_ENABLED);
                if (zIconCompatParcelizer) {
                    imageHeaderParserImageType = mapNavigationImpl.ComponentActivity;
                } else {
                    imageHeaderParserImageType = null;
                }
                LogConfiguration.registerLogWriterBackend(imageHeaderParserImageType);
                NavigationPerformance.performanceInfoLoggingEnabled(zIconCompatParcelizer);
                if (!MapboxNavigationApp.isSetup()) {
                    forest.IconCompatParcelizer("Initializing Nav SDK v3", new Object[0]);
                    Context applicationContext = mapNavigationImpl.IconCompatParcelizer.getApplicationContext();
                    applicationContext.getClass();
                    NavigationOptions.Builder builder = new NavigationOptions.Builder(applicationContext);
                    builder.distanceFormatterOptions((DistanceFormatterOptions) mapNavigationImpl.serializer.read.MediaSessionCompatResultReceiverWrapper());
                    Delayer delayer = new Delayer();
                    delayer.intervalMillis();
                    builder.routeAlternativesOptions(delayer.build());
                    i$d.a aVar = new i$d.a(28);
                    LocationProviderRequest locationProviderRequestBuild = new LocationProviderRequest.Builder().interval(new IntervalSettings.Builder().interval(1000L).build()).accuracy(AccuracyLevel.HIGHEST).build();
                    locationProviderRequestBuild.getClass();
                    aVar.request(locationProviderRequestBuild);
                    builder.locationOptions(aVar.build());
                    MapboxNavigationApp.setup(builder.build());
                    int i10 = MediaSessionCompatResultReceiverWrapper + 79;
                    PlaybackStateCompat = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                }
            }
        } else {
            forest = Timber.RemoteActionCompatParcelizer;
            forest.IconCompatParcelizer("MapNavigationWrapper attach", new Object[0]);
            o6externalsyntheticlambda9 = mapNavigationWrapper.MediaSessionCompatQueueItem;
            if (o6externalsyntheticlambda9 != null) {
                mapNavigationImpl = (MapNavigationImpl) o6externalsyntheticlambda9;
                zIconCompatParcelizer = ((FirebaseRemoteConfigImpl) mapNavigationImpl.MediaMetadataCompat).IconCompatParcelizer(updateAdidI.IS_MAPBOX_LOGGING_ENABLED);
                if (zIconCompatParcelizer) {
                    imageHeaderParserImageType = mapNavigationImpl.ComponentActivity;
                } else {
                    imageHeaderParserImageType = null;
                }
                LogConfiguration.registerLogWriterBackend(imageHeaderParserImageType);
                NavigationPerformance.performanceInfoLoggingEnabled(zIconCompatParcelizer);
                if (!MapboxNavigationApp.isSetup()) {
                    forest.IconCompatParcelizer("Initializing Nav SDK v3", new Object[0]);
                    Context applicationContext2 = mapNavigationImpl.IconCompatParcelizer.getApplicationContext();
                    applicationContext2.getClass();
                    NavigationOptions.Builder builder2 = new NavigationOptions.Builder(applicationContext2);
                    builder2.distanceFormatterOptions((DistanceFormatterOptions) mapNavigationImpl.serializer.read.MediaSessionCompatResultReceiverWrapper());
                    Delayer delayer2 = new Delayer();
                    delayer2.intervalMillis();
                    builder2.routeAlternativesOptions(delayer2.build());
                    i$d.a aVar2 = new i$d.a(28);
                    LocationProviderRequest locationProviderRequestBuild2 = new LocationProviderRequest.Builder().interval(new IntervalSettings.Builder().interval(1000L).build()).accuracy(AccuracyLevel.HIGHEST).build();
                    locationProviderRequestBuild2.getClass();
                    aVar2.request(locationProviderRequestBuild2);
                    builder2.locationOptions(aVar2.build());
                    MapboxNavigationApp.setup(builder2.build());
                    int i12 = MediaSessionCompatResultReceiverWrapper + 79;
                    PlaybackStateCompat = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                }
            }
        }
        o6ExternalSyntheticLambda9 o6externalsyntheticlambda10 = mapNavigationWrapper.MediaSessionCompatQueueItem;
        if (o6externalsyntheticlambda10 != null) {
            MapNavigationImpl mapNavigationImpl2 = (MapNavigationImpl) o6externalsyntheticlambda10;
            accessisrendernodecompatiblecp2.getClass();
            mapView2.getClass();
            MapboxNavigationApp.attach(accessisrendernodecompatiblecp2);
            MapboxMap mapboxMapDeprecated = mapView2.getMapboxMapDeprecated();
            m7 m7Var = mapNavigationImpl2.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
            SuspendingWorkUseCase$$ExternalSyntheticLambda0 suspendingWorkUseCase$$ExternalSyntheticLambda0 = new SuspendingWorkUseCase$$ExternalSyntheticLambda0(mapNavigationImpl2, 29, mapboxMapDeprecated);
            m7Var.serializer = mapView2;
            m7Var.MediaSessionCompatQueueItem = suspendingWorkUseCase$$ExternalSyntheticLambda0;
            ia iaVar = mapNavigationImpl2.ResultReceiver;
            fromColorLong fromcolorlong = toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp2.getLifecycle());
            mapboxMapDeprecated.getClass();
            iaVar.MediaMetadataCompat = mapView2;
            iaVar.RatingCompat = fromcolorlong;
            MapboxNavigationViewportDataSource mapboxNavigationViewportDataSource = new MapboxNavigationViewportDataSource(mapboxMapDeprecated);
            FollowingFrameOptions followingFrameOptions = mapboxNavigationViewportDataSource.getOptions().getFollowingFrameOptions();
            followingFrameOptions.setMaximizeViewableGeometryWhenPitchZero();
            followingFrameOptions.setMinZoom();
            followingFrameOptions.setMaxZoom();
            iaVar.ParcelableVolumeInfo = mapboxNavigationViewportDataSource;
            iaVar.MediaBrowserCompatMediaItem = new NavigationCamera(mapboxMapDeprecated, CameraAnimationsUtils.getCamera(mapView2), mapboxNavigationViewportDataSource);
            i0 i0Var = mapNavigationImpl2.write;
            if (((FirebaseRemoteConfigImpl) i0Var.MediaDescriptionCompat).ComponentActivity()) {
                i0Var.write = new H$b(mapboxMapDeprecated);
                i0Var.IconCompatParcelizer = new Vw$Vw((byte) 0, 13);
                i0Var.read = new i1(i0Var, mapboxMapDeprecated, i0Var);
                int i14 = MediaSessionCompatResultReceiverWrapper + 69;
                PlaybackStateCompat = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
            }
            mapNavigationImpl2.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.read = toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp2.getLifecycle());
            LocationComponentPluginImpl locationComponent = DelayKt.getLocationComponent(mapView2);
            accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp4 = accessisrendernodecompatiblecp2;
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp2.getLifecycle()), null, null, new ReconnectScheduler$schedule$1(accessisrendernodecompatiblecp4, mapNavigationImpl2, locationComponent, null, 20), 3);
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp2.getLifecycle()), null, null, new NavHostKt$NavHost$29$1(accessisrendernodecompatiblecp4, mapNavigationImpl2, locationComponent, mapboxMapDeprecated, null, 29), 3);
            int i16 = MediaSessionCompatResultReceiverWrapper + 41;
            PlaybackStateCompat = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
        }
        return createFromParcel.INSTANCE;
    }
}
