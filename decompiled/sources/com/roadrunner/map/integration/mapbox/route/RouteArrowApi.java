package com.roadrunner.map.integration.mapbox.route;

import android.app.Application;
import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SingleProcessDataStore$data$1;
import androidx.datastore.migrations.SharedPreferencesMigration;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.Expected;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.core.directions.session.RoutesUpdatedResult;
import com.mapbox.navigation.ui.maps.route.arrow.api.MapboxRouteArrowApi;
import com.mapbox.navigation.ui.maps.route.arrow.api.MapboxRouteArrowView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.isAdapterPositionOnScreen;
import o.isOpenInternalroom_runtime;
import o.j4;
import o.m1ExternalSyntheticOutline0;
import o.m4;
import o.prepareForActivityTransitionCarryover;
import o.transferSessionPackageI;
import o.waExternalSyntheticLambda3;
import okio.internal.ResourceFileSystem$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class RouteArrowApi {
    private static int MediaSessionCompatToken = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final getContentViewGroupParentLayout IconCompatParcelizer;
    public MapboxRouteArrowView MediaBrowserCompatMediaItem;
    public final DeferredCoroutine MediaMetadataCompat;
    public final DeferredCoroutine MediaSessionCompatQueueItem;
    public final isAdapterPositionOnScreen RatingCompat;
    public String read;
    public MapboxRouteArrowApi serializer;
    public final transferSessionPackageI write;
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new ResourceFileSystem$$ExternalSyntheticLambda0(12, this));
    public final isAdapterPositionOnScreen MediaDescriptionCompat = new isAdapterPositionOnScreen(new waExternalSyntheticLambda3(11));

    public RouteArrowApi(Application application, j4 j4Var, transferSessionPackageI transfersessionpackagei, getContentViewGroupParentLayout getcontentviewgroupparentlayout, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.write = transfersessionpackagei;
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        CoroutineStart coroutineStart = CoroutineStart.LAZY;
        this.MediaSessionCompatQueueItem = BuildersKt.write(getcontentviewgroupparentlayout, defaultScheduler, coroutineStart, new SharedPreferencesMigration.AnonymousClass3(2, 1, null));
        this.RatingCompat = new isAdapterPositionOnScreen(new SealedClassSerializer$$ExternalSyntheticLambda0(this, 4, application));
        this.MediaMetadataCompat = BuildersKt.write(getcontentviewgroupparentlayout, defaultScheduler, coroutineStart, new SingleProcessDataStore$data$1.AnonymousClass1(this, application, null, 26));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r1.length() > 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r1 = new com.mapbox.navigation.ui.maps.route.arrow.model.RouteArrowOptions.Builder(r7);
        r7 = r6.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r7 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r1.withAboveLayerId(r7);
        r7 = r1.build();
        r1 = com.roadrunner.map.integration.mapbox.route.RouteArrowApi.PlaybackStateCompatCustomAction + 55;
        com.roadrunner.map.integration.mapbox.route.RouteArrowApi.MediaSessionCompatToken = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if ((r1 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r0 = 4 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        o.removeNodeAtDepth.serializer("layerId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        return new com.mapbox.navigation.ui.maps.route.arrow.model.RouteArrowOptions.Builder(r7).build();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r1.length() > 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.mapbox.navigation.ui.maps.route.arrow.model.RouteArrowOptions IconCompatParcelizer(android.app.Application r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.map.integration.mapbox.route.RouteArrowApi.MediaSessionCompatToken
            int r1 = r1 + 93
            int r2 = r1 % 128
            com.roadrunner.map.integration.mapbox.route.RouteArrowApi.PlaybackStateCompatCustomAction = r2
            int r1 = r1 % r0
            java.lang.String r1 = r6.read
            r3 = 0
            java.lang.String r4 = "layerId"
            if (r1 == 0) goto L5a
            int r2 = r2 + 89
            int r5 = r2 % 128
            com.roadrunner.map.integration.mapbox.route.RouteArrowApi.MediaSessionCompatToken = r5
            int r2 = r2 % r0
            if (r2 == 0) goto L27
            int r1 = r1.length()
            r2 = 26
            int r2 = r2 / 0
            if (r1 <= 0) goto L50
            goto L2d
        L27:
            int r1 = r1.length()
            if (r1 <= 0) goto L50
        L2d:
            com.mapbox.navigation.ui.maps.route.arrow.model.RouteArrowOptions$Builder r1 = new com.mapbox.navigation.ui.maps.route.arrow.model.RouteArrowOptions$Builder
            r1.<init>(r7)
            java.lang.String r7 = r6.read
            if (r7 == 0) goto L4c
            r1.withAboveLayerId(r7)
            com.mapbox.navigation.ui.maps.route.arrow.model.RouteArrowOptions r7 = r1.build()
            int r1 = com.roadrunner.map.integration.mapbox.route.RouteArrowApi.PlaybackStateCompatCustomAction
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.roadrunner.map.integration.mapbox.route.RouteArrowApi.MediaSessionCompatToken = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L4b
            r0 = 4
            int r0 = r0 / 0
        L4b:
            return r7
        L4c:
            o.removeNodeAtDepth.serializer(r4)
            throw r3
        L50:
            com.mapbox.navigation.ui.maps.route.arrow.model.RouteArrowOptions$Builder r0 = new com.mapbox.navigation.ui.maps.route.arrow.model.RouteArrowOptions$Builder
            r0.<init>(r7)
            com.mapbox.navigation.ui.maps.route.arrow.model.RouteArrowOptions r7 = r0.build()
            return r7
        L5a:
            o.removeNodeAtDepth.serializer(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.map.integration.mapbox.route.RouteArrowApi.IconCompatParcelizer(android.app.Application):com.mapbox.navigation.ui.maps.route.arrow.model.RouteArrowOptions");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object onRoutesUpdatedResult$mapbox(RoutesUpdatedResult routesUpdatedResult, MapboxMap mapboxMap, ContinuationImpl continuationImpl) {
        m4 m4Var;
        Style styleDeprecated;
        Object objAwaitInternal;
        RouteArrowApi routeArrowApi;
        MapboxRouteArrowView mapboxRouteArrowView;
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 9;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof m4) {
            m4Var = (m4) continuationImpl;
            int i4 = m4Var.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                m4Var.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                m4Var = new m4(this, continuationImpl);
            }
        } else {
            m4Var = new m4(this, continuationImpl);
        }
        Object obj = m4Var.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = m4Var.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (routesUpdatedResult.getNavigationRoutes().isEmpty() && (styleDeprecated = mapboxMap.getStyleDeprecated()) != null) {
                if (this.read == null) {
                    this.read = j4.RemoteActionCompatParcelizer(styleDeprecated);
                }
                m4Var.serializer = mapboxMap;
                m4Var.read = this;
                m4Var.RemoteActionCompatParcelizer = 1;
                if (((Boolean) this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                    int i6 = MediaSessionCompatToken + 103;
                    PlaybackStateCompatCustomAction = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        this.MediaMetadataCompat.awaitInternal(m4Var);
                        throw null;
                    }
                    objAwaitInternal = this.MediaMetadataCompat.awaitInternal(m4Var);
                } else {
                    objAwaitInternal = (MapboxRouteArrowView) this.RatingCompat.MediaSessionCompatResultReceiverWrapper();
                }
                obj = objAwaitInternal;
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                routeArrowApi = this;
            }
            return createfromparcel;
        }
        int i7 = PlaybackStateCompatCustomAction + 85;
        MediaSessionCompatToken = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0 ? i5 != 1 : i5 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        routeArrowApi = m4Var.read;
        mapboxMap = m4Var.serializer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        routeArrowApi.MediaBrowserCompatMediaItem = (MapboxRouteArrowView) obj;
        Style styleDeprecated2 = mapboxMap.getStyleDeprecated();
        if (styleDeprecated2 == null) {
            int i8 = PlaybackStateCompatCustomAction + 123;
            MediaSessionCompatToken = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        } else {
            if (this.read == null) {
                this.read = j4.RemoteActionCompatParcelizer(styleDeprecated2);
                int i10 = PlaybackStateCompatCustomAction + 97;
                MediaSessionCompatToken = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
            MapboxRouteArrowApi mapboxRouteArrowApi = this.serializer;
            if (mapboxRouteArrowApi != null && (mapboxRouteArrowView = this.MediaBrowserCompatMediaItem) != null) {
                int i12 = MediaSessionCompatToken + 33;
                PlaybackStateCompatCustomAction = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                mapboxRouteArrowView.render(styleDeprecated2, mapboxRouteArrowApi.clearArrows());
            }
        }
        return createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object onRouteProgress$mapbox(RouteProgress routeProgress, MapboxMap mapboxMap, ContinuationImpl continuationImpl) {
        m1ExternalSyntheticOutline0 m1externalsyntheticoutline0;
        Style styleDeprecated;
        RouteProgress routeProgress2;
        RouteArrowApi routeArrowApi;
        RouteArrowApi routeArrowApi2;
        RouteProgress routeProgress3;
        MapboxRouteArrowApi mapboxRouteArrowApi;
        Expected expectedAddUpcomingManeuverArrow;
        MapboxRouteArrowView mapboxRouteArrowView;
        int i = 2 % 2;
        if (continuationImpl instanceof m1ExternalSyntheticOutline0) {
            m1externalsyntheticoutline0 = (m1ExternalSyntheticOutline0) continuationImpl;
            int i2 = m1externalsyntheticoutline0.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = MediaSessionCompatToken + 125;
                PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                m1externalsyntheticoutline0.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                m1externalsyntheticoutline0 = new m1ExternalSyntheticOutline0(this, continuationImpl);
            }
        } else {
            m1externalsyntheticoutline0 = new m1ExternalSyntheticOutline0(this, continuationImpl);
        }
        Object objAwaitInternal = m1externalsyntheticoutline0.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = m1externalsyntheticoutline0.IconCompatParcelizer;
        isAdapterPositionOnScreen isadapterpositiononscreen = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i5 != 0) {
            if (i5 != 1) {
                int i6 = MediaSessionCompatToken + 33;
                PlaybackStateCompatCustomAction = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (i5 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                routeArrowApi2 = m1externalsyntheticoutline0.read;
                styleDeprecated = m1externalsyntheticoutline0.serializer;
                routeProgress3 = m1externalsyntheticoutline0.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objAwaitInternal);
            } else {
                routeArrowApi = m1externalsyntheticoutline0.read;
                styleDeprecated = m1externalsyntheticoutline0.serializer;
                routeProgress2 = m1externalsyntheticoutline0.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objAwaitInternal);
            }
            routeArrowApi2.MediaBrowserCompatMediaItem = (MapboxRouteArrowView) objAwaitInternal;
            mapboxRouteArrowApi = this.serializer;
            if (mapboxRouteArrowApi != null) {
                expectedAddUpcomingManeuverArrow = mapboxRouteArrowApi.addUpcomingManeuverArrow(routeProgress3);
                mapboxRouteArrowView = this.MediaBrowserCompatMediaItem;
                if (mapboxRouteArrowView != null) {
                    mapboxRouteArrowView.renderManeuverUpdate(styleDeprecated, expectedAddUpcomingManeuverArrow);
                }
            }
            return createfromparcel;
        }
        ExtrasKt.RemoteActionCompatParcelizer(objAwaitInternal);
        styleDeprecated = mapboxMap.getStyleDeprecated();
        if (styleDeprecated != null) {
            if (this.read == null) {
                this.read = j4.RemoteActionCompatParcelizer(styleDeprecated);
            }
            m1externalsyntheticoutline0.RemoteActionCompatParcelizer = routeProgress;
            m1externalsyntheticoutline0.serializer = styleDeprecated;
            m1externalsyntheticoutline0.read = this;
            m1externalsyntheticoutline0.IconCompatParcelizer = 1;
            if (!((Boolean) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                objAwaitInternal = (MapboxRouteArrowApi) this.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper();
                int i8 = MediaSessionCompatToken + 75;
                PlaybackStateCompatCustomAction = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            } else {
                objAwaitInternal = this.MediaSessionCompatQueueItem.awaitInternal(m1externalsyntheticoutline0);
            }
            if (objAwaitInternal == coroutineSingletons) {
                int i10 = PlaybackStateCompatCustomAction + 61;
                MediaSessionCompatToken = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            } else {
                routeProgress2 = routeProgress;
                routeArrowApi = this;
            }
            return coroutineSingletons;
        }
        return createfromparcel;
        routeArrowApi.serializer = (MapboxRouteArrowApi) objAwaitInternal;
        m1externalsyntheticoutline0.RemoteActionCompatParcelizer = routeProgress2;
        m1externalsyntheticoutline0.serializer = styleDeprecated;
        m1externalsyntheticoutline0.read = this;
        m1externalsyntheticoutline0.IconCompatParcelizer = 2;
        objAwaitInternal = ((Boolean) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).booleanValue() ? this.MediaMetadataCompat.awaitInternal(m1externalsyntheticoutline0) : (MapboxRouteArrowView) this.RatingCompat.MediaSessionCompatResultReceiverWrapper();
        int i12 = PlaybackStateCompatCustomAction + 37;
        MediaSessionCompatToken = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        if (objAwaitInternal != coroutineSingletons) {
            routeArrowApi2 = this;
            routeProgress3 = routeProgress2;
            routeArrowApi2.MediaBrowserCompatMediaItem = (MapboxRouteArrowView) objAwaitInternal;
            mapboxRouteArrowApi = this.serializer;
            if (mapboxRouteArrowApi != null) {
                expectedAddUpcomingManeuverArrow = mapboxRouteArrowApi.addUpcomingManeuverArrow(routeProgress3);
                mapboxRouteArrowView = this.MediaBrowserCompatMediaItem;
                if (mapboxRouteArrowView != null) {
                    mapboxRouteArrowView.renderManeuverUpdate(styleDeprecated, expectedAddUpcomingManeuverArrow);
                }
            }
            return createfromparcel;
        }
        return coroutineSingletons;
    }
}
