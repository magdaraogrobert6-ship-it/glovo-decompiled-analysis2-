package com.roadrunner.map.integration.mapbox.navigation;

import android.app.Application;
import android.content.Context;
import androidx.camera.core.LegacySessionConfig;
import androidx.camera.core.impl.UseCaseAdditionSimulator;
import androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$2;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.logger.PerseusLogger$e$1;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.common.location.Location;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import com.mapbox.maps.plugin.LocationPuck2D;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.animation.CameraAnimationsUtils;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.trip.session.LocationMatcherResult;
import com.mapbox.navigation.ui.maps.location.NavigationLocationProvider;
import com.mapbox.navigation.ui.maps.route.arrow.api.MapboxRouteArrowApi;
import com.mapbox.navigation.ui.maps.route.arrow.api.MapboxRouteArrowView;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.analytics.loggers.TurnByTurnNavigationLogger;
import com.roadrunner.delivery.ontheway.turnbyturn.analytics.loggers.TurnByTurnNavigationLogger$logNavigationArrival$1;
import com.roadrunner.delivery.state.VehicleType;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.map.integration.mapbox.maneuver.ManeuverApi;
import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl;
import com.roadrunner.map.integration.mapbox.route.FetchMapboxRouteUseCase;
import com.roadrunner.map.integration.mapbox.route.RouteArrowApi;
import com.roadrunner.map.integration.mapbox.route.RouteLineApi$$ExternalSyntheticLambda7;
import com.roadrunner.map.integration.mapbox.route.preview.SecondaryRouteApi;
import com.roadrunner.map.integration.mapbox.speedlimit.SpeedLimitApi;
import com.roadrunner.map.integration.mapbox.tripprogress.TripProgressApi;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import com.roadrunner.rider.recruitment.applicant.domain.ApplicantAuthenticationInterceptorImpl$intercept$1;
import io.grpc.LoadBalancer$Helper;
import io.sentry.CombinedScopeView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.DrawableTransformation;
import o.Hyphens;
import o.ImageHeaderParserImageType;
import o.LineBreakStrictnessCompanion;
import o.ShortNewsContentCardView;
import o.accessgetGocp;
import o.accessgetInstancedelegatecp;
import o.accessgetParagraphcp;
import o.component10d7_KjU;
import o.copygijOMQMdefault;
import o.createFromParcel;
import o.f2ExternalSyntheticLambda4;
import o.fromColorLong;
import o.geExternalSyntheticLambda0;
import o.getCieXyz;
import o.getHeadingrAG3T2k;
import o.getHeadingrAG3T2kannotations;
import o.getLooseusljTpc;
import o.getNormalusljTpc;
import o.getPresentationContext;
import o.getRootInfoui;
import o.getSimplefcGXIks;
import o.getStrategyfcGXIks;
import o.getStrictnessusljTpc;
import o.i0;
import o.ia;
import o.ie;
import o.instance_delegatelambda0;
import o.isAdapterPositionOnScreen;
import o.j4;
import o.j7;
import o.j8;
import o.k6;
import o.k7;
import o.k7ExternalSyntheticLambda1;
import o.kf;
import o.lExternalSyntheticLambda0;
import o.ld;
import o.lerpjWV1Mfo;
import o.m1ExternalSyntheticLambda22;
import o.m1ExternalSyntheticLambda7;
import o.m3;
import o.m7;
import o.mh;
import o.n2ExternalSyntheticLambda0;
import o.o6ExternalSyntheticLambda9;
import o.onContentCardDismissed;
import o.onPrimaryNavigationFragmentChanged;
import o.performCreate;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.resolveBulletTextUnitToPxo2QH7mI;
import o.setRectOutlinetz77jQwdefault;
import o.setSizeuvyYCjk;
import o.transferSessionPackageI;
import o.waExternalSyntheticLambda3;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class MapNavigationImpl implements o6ExternalSyntheticLambda9 {
    private static int createFullyDrawnExecutor = 1;
    private static int ensureViewModelStore;
    public final ImageHeaderParserImageType ComponentActivity;
    public final Application IconCompatParcelizer;
    public final getHeadingrAG3T2k MediaBrowserCompatMediaItem;
    public final FetchMapboxRouteUseCase MediaDescriptionCompat;
    public final transferSessionPackageI MediaMetadataCompat;
    public final m3 MediaSessionCompatQueueItem;
    public final j8 MediaSessionCompatResultReceiverWrapper;
    public final component10d7_KjU MediaSessionCompatToken;
    public final Path$Companion ParcelableVolumeInfo;
    public final resolveBulletTextUnitToPxo2QH7mI PlaybackStateCompat;
    public final getPresentationContext PlaybackStateCompatCustomAction;
    public final lerpjWV1Mfo RatingCompat;
    public final SharedFlowImpl RemoteActionCompatParcelizer;
    public final ia ResultReceiver;
    public final ld _init_lambda1;
    public final LineBreakStrictnessCompanion _init_lambda2;
    public final getLooseusljTpc _init_lambda3;
    public final f2ExternalSyntheticLambda4 _init_lambda4;
    public final TripProgressApi accessensureViewModelStore;
    public final ManeuverApi r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final accessgetParagraphcp r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final k7 r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final InitializeAppStartupItemsImpl r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final RouteArrowApi r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final performCreate r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final mh r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final SpeedLimitApi r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public final m7 r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final n2ExternalSyntheticLambda0 r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final SecondaryRouteApi r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public getSimplefcGXIks read;
    public final k6 serializer;
    public final i0 write;
    public final isAdapterPositionOnScreen r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new isAdapterPositionOnScreen(new waExternalSyntheticLambda3(10));
    public List r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = instance_delegatelambda0.write;

    public MapNavigationImpl(Application application, j8 j8Var, TripProgressApi tripProgressApi, m7 m7Var, RouteArrowApi routeArrowApi, ia iaVar, Path$Companion path$Companion, ManeuverApi maneuverApi, SecondaryRouteApi secondaryRouteApi, SpeedLimitApi speedLimitApi, n2ExternalSyntheticLambda0 n2externalsyntheticlambda0, mh mhVar, getHeadingrAG3T2k getheadingrag3t2k, k6 k6Var, getLooseusljTpc getlooseusljtpc, accessgetParagraphcp accessgetparagraphcp, lerpjWV1Mfo lerpjwv1mfo, component10d7_KjU component10d7_kju, ld ldVar, LineBreakStrictnessCompanion lineBreakStrictnessCompanion, i0 i0Var, performCreate performcreate, f2ExternalSyntheticLambda4 f2externalsyntheticlambda4, getPresentationContext getpresentationcontext, transferSessionPackageI transfersessionpackagei, FetchMapboxRouteUseCase fetchMapboxRouteUseCase, m3 m3Var, ImageHeaderParserImageType imageHeaderParserImageType, k7 k7Var, resolveBulletTextUnitToPxo2QH7mI resolvebullettextunittopxo2qh7mi, InitializeAppStartupItemsImpl initializeAppStartupItemsImpl) {
        this.IconCompatParcelizer = application;
        this.MediaSessionCompatResultReceiverWrapper = j8Var;
        this.accessensureViewModelStore = tripProgressApi;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = m7Var;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = routeArrowApi;
        this.ResultReceiver = iaVar;
        this.ParcelableVolumeInfo = path$Companion;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = maneuverApi;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = secondaryRouteApi;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = speedLimitApi;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = n2externalsyntheticlambda0;
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = mhVar;
        this.MediaBrowserCompatMediaItem = getheadingrag3t2k;
        this.serializer = k6Var;
        this._init_lambda3 = getlooseusljtpc;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = accessgetparagraphcp;
        this.RatingCompat = lerpjwv1mfo;
        this.MediaSessionCompatToken = component10d7_kju;
        this._init_lambda1 = ldVar;
        this._init_lambda2 = lineBreakStrictnessCompanion;
        this.write = i0Var;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = performcreate;
        this._init_lambda4 = f2externalsyntheticlambda4;
        this.PlaybackStateCompatCustomAction = getpresentationcontext;
        this.MediaMetadataCompat = transfersessionpackagei;
        this.MediaDescriptionCompat = fetchMapboxRouteUseCase;
        this.MediaSessionCompatQueueItem = m3Var;
        this.ComponentActivity = imageHeaderParserImageType;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = k7Var;
        this.PlaybackStateCompat = resolvebullettextunittopxo2qh7mi;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = initializeAppStartupItemsImpl;
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(1, 0, null, 6);
        sharedFlowImplRemoteActionCompatParcelizer.write(createFromParcel.INSTANCE);
        this.RemoteActionCompatParcelizer = sharedFlowImplRemoteActionCompatParcelizer;
    }

    public final void write(MapboxNavigation mapboxNavigation, LocationComponentPluginImpl locationComponentPluginImpl, List list, getSimplefcGXIks getsimplefcgxiks) throws Throwable {
        int i = 2 % 2;
        int i2 = ensureViewModelStore + 33;
        createFullyDrawnExecutor = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ld ldVar = this._init_lambda1;
        ldVar.RemoteActionCompatParcelizer = "";
        ldVar.read = getNormalusljTpc.RemoteActionCompatParcelizer(ldVar.read, "");
        if (ldVar.RemoteActionCompatParcelizer.length() == 0) {
            String strM = d$$ExternalSyntheticOutline0.m();
            ldVar.RemoteActionCompatParcelizer = strM;
            ldVar.read = getNormalusljTpc.RemoteActionCompatParcelizer(ldVar.read, strM);
            int i4 = ensureViewModelStore + 91;
            createFullyDrawnExecutor = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 5 / 4;
            }
        }
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = list;
        MapboxNavigation.setNavigationRoutes$default(mapboxNavigation, list, null, 6);
        IconCompatParcelizer(locationComponentPluginImpl, getsimplefcgxiks, true);
    }

    public final void resetPluckIfNeeded(LocationComponentPluginImpl locationComponentPluginImpl) {
        int i = 2 % 2;
        j8 j8Var = this.MediaSessionCompatResultReceiverWrapper;
        j7 j7Var = j8Var.read;
        j7 j7Var2 = j7.DEFAULT;
        if (j7Var == j7Var2) {
            int i2 = ensureViewModelStore + 117;
            createFullyDrawnExecutor = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            j7Var2.getClass();
            j8Var.read = j7Var2;
            LocationPuck2D locationPuck2DRemoteActionCompatParcelizer = j8Var.RemoteActionCompatParcelizer();
            locationComponentPluginImpl.getClass();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{locationComponentPluginImpl.getInternalSettings().locationPuck, locationPuck2DRemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                LocationComponentSettings.Builder builder = locationComponentPluginImpl.getInternalSettings().toBuilder();
                builder.locationPuck = locationPuck2DRemoteActionCompatParcelizer;
                locationComponentPluginImpl.internalSettings = builder.build();
                locationComponentPluginImpl.applySettings();
            }
        }
        int i4 = ensureViewModelStore + 125;
        createFullyDrawnExecutor = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final void RemoteActionCompatParcelizer(List list, MapboxNavigation mapboxNavigation, MapboxMap mapboxMap) {
        int i = 2 % 2;
        int i2 = ensureViewModelStore + 73;
        createFullyDrawnExecutor = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        TurnByTurnNavigationLogger turnByTurnNavigationLogger = this._init_lambda3.RemoteActionCompatParcelizer;
        if (!list.isEmpty()) {
            int i4 = ensureViewModelStore + 71;
            createFullyDrawnExecutor = i4 % Fields.SpotShadowColor;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (i4 % 2 == 0) {
                this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = list;
                UseCaseAdditionSimulator.isNavigationInActiveGuidance(mapboxNavigation);
                shortNewsContentCardView.hashCode();
                throw null;
            }
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = list;
            int i5 = 3;
            if (UseCaseAdditionSimulator.isNavigationInActiveGuidance(mapboxNavigation)) {
                MapboxNavigation.setNavigationRoutes$default(mapboxNavigation, list, null, 6);
                BuildersKt.RemoteActionCompatParcelizer(turnByTurnNavigationLogger.write, null, null, new TurnByTurnNavigationLogger$logNavigationArrival$1(turnByTurnNavigationLogger, shortNewsContentCardView, i5), 3);
                return;
            } else {
                this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.serializer(list, mapboxMap, new setRectOutlinetz77jQwdefault(23));
                BuildersKt.RemoteActionCompatParcelizer(turnByTurnNavigationLogger.write, null, null, new TurnByTurnNavigationLogger$logNavigationArrival$1(turnByTurnNavigationLogger, shortNewsContentCardView, 5), 3);
            }
        }
        int i6 = createFullyDrawnExecutor + 75;
        ensureViewModelStore = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    public final void IconCompatParcelizer(LocationComponentPluginImpl locationComponentPluginImpl, getSimplefcGXIks getsimplefcgxiks, boolean z) throws Throwable {
        int i = 2 % 2;
        locationComponentPluginImpl.setLocationProvider((NavigationLocationProvider) this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.MediaSessionCompatResultReceiverWrapper());
        j7 j7Var = j7.TURN_BY_TURN;
        j7Var.getClass();
        this.MediaSessionCompatResultReceiverWrapper.read = j7Var;
        locationComponentPluginImpl.updateSettings(new MapNavigationImpl$$ExternalSyntheticLambda3(this, 1));
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.IconCompatParcelizer(onPrimaryNavigationFragmentChanged.COLLAPSED);
        Object obj = null;
        if (z) {
            int i2 = createFullyDrawnExecutor + 23;
            ensureViewModelStore = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                ((getRootInfoui) this._init_lambda2.read).write("tbt_trace_navigationStart");
                throw null;
            }
            ((getRootInfoui) this._init_lambda2.read).write("tbt_trace_navigationStart");
        }
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.write();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer.write(new getStrategyfcGXIks(getsimplefcgxiks));
        int i3 = ensureViewModelStore + 111;
        createFullyDrawnExecutor = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public static final CoroutineSingletons access$collectNavigationState(MapNavigationImpl mapNavigationImpl, MapboxNavigation mapboxNavigation, LocationComponentPluginImpl locationComponentPluginImpl, MapboxMap mapboxMap, ContinuationImpl continuationImpl) {
        k7ExternalSyntheticLambda1 k7externalsyntheticlambda1;
        int i = 2 % 2;
        mapNavigationImpl.getClass();
        if (continuationImpl instanceof k7ExternalSyntheticLambda1) {
            k7externalsyntheticlambda1 = (k7ExternalSyntheticLambda1) continuationImpl;
            int i2 = k7externalsyntheticlambda1.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k7externalsyntheticlambda1.serializer = i2 - Integer.MIN_VALUE;
            } else {
                k7externalsyntheticlambda1 = new k7ExternalSyntheticLambda1(mapNavigationImpl, continuationImpl);
                int i3 = createFullyDrawnExecutor + 91;
                ensureViewModelStore = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
        } else {
            k7externalsyntheticlambda1 = new k7ExternalSyntheticLambda1(mapNavigationImpl, continuationImpl);
            int i5 = createFullyDrawnExecutor + 91;
            ensureViewModelStore = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        k7ExternalSyntheticLambda1 k7externalsyntheticlambda2 = k7externalsyntheticlambda1;
        Object obj = k7externalsyntheticlambda2.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = k7externalsyntheticlambda2.serializer;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MutableStateFlow mutableStateFlow = mapNavigationImpl.MediaBrowserCompatMediaItem.read;
            CoreTextFieldKt$CoreTextField$5$1$2 coreTextFieldKt$CoreTextField$5$1$2 = new CoreTextFieldKt$CoreTextField$5$1$2(mapNavigationImpl, mapboxNavigation, locationComponentPluginImpl, mapboxMap, 2);
            k7externalsyntheticlambda2.serializer = 1;
            if (mutableStateFlow.collect(coreTextFieldKt$CoreTextField$5$1$2, k7externalsyntheticlambda2) == coroutineSingletons) {
                int i8 = createFullyDrawnExecutor + 97;
                ensureViewModelStore = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    int i9 = 37 / 0;
                }
                return coroutineSingletons;
            }
        } else {
            if (i7 != 1) {
                int i10 = createFullyDrawnExecutor + 97;
                ensureViewModelStore = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        DrawableTransformation.read();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0040 A[PHI: r1 r2
  0x0040: PHI (r1v12 com.mapbox.maps.Style) = (r1v7 com.mapbox.maps.Style), (r1v16 com.mapbox.maps.Style) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r2v11 com.roadrunner.map.integration.mapbox.route.RouteArrowApi) = 
  (r2v2 com.roadrunner.map.integration.mapbox.route.RouteArrowApi)
  (r2v13 com.roadrunner.map.integration.mapbox.route.RouteArrowApi)
 binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:13:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00be  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    public final void stopTurnByTurnApis(MapboxMap mapboxMap) throws InterruptedException, IOException {
        Style styleDeprecated;
        RouteArrowApi routeArrowApi;
        fromColorLong fromcolorlong;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer;
        MapboxRouteArrowApi mapboxRouteArrowApi;
        MapboxRouteArrowView mapboxRouteArrowView;
        int i = 2 % 2;
        int i2 = ensureViewModelStore + 23;
        createFullyDrawnExecutor = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.accessensureViewModelStore.MediaMetadataCompat.read.write(geExternalSyntheticLambda0.IconCompatParcelizer);
            mapboxMap.getClass();
            styleDeprecated = mapboxMap.getStyleDeprecated();
            routeArrowApi = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            int i3 = 76 / 0;
            if (styleDeprecated != null) {
                if (routeArrowApi.read != null) {
                    int i4 = createFullyDrawnExecutor + 67;
                    ensureViewModelStore = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                } else {
                    routeArrowApi.read = j4.RemoteActionCompatParcelizer(styleDeprecated);
                }
                mapboxRouteArrowApi = routeArrowApi.serializer;
                if (mapboxRouteArrowApi != null && (mapboxRouteArrowView = routeArrowApi.MediaBrowserCompatMediaItem) != null) {
                    mapboxRouteArrowView.render(styleDeprecated, mapboxRouteArrowApi.clearArrows());
                }
            }
        } else {
            this.accessensureViewModelStore.MediaMetadataCompat.read.write(geExternalSyntheticLambda0.IconCompatParcelizer);
            mapboxMap.getClass();
            styleDeprecated = mapboxMap.getStyleDeprecated();
            routeArrowApi = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            if (styleDeprecated != null) {
                if (routeArrowApi.read != null) {
                    int i6 = createFullyDrawnExecutor + 67;
                    ensureViewModelStore = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                } else {
                    routeArrowApi.read = j4.RemoteActionCompatParcelizer(styleDeprecated);
                }
                mapboxRouteArrowApi = routeArrowApi.serializer;
                if (mapboxRouteArrowApi != null) {
                    mapboxRouteArrowView.render(styleDeprecated, mapboxRouteArrowApi.clearArrows());
                }
            }
        }
        ShortNewsContentCardView shortNewsContentCardView = null;
        routeArrowApi.serializer = null;
        routeArrowApi.MediaBrowserCompatMediaItem = null;
        ia iaVar = this.ResultReceiver;
        MapView mapView = iaVar.MediaMetadataCompat;
        if (mapView != null) {
            int i8 = ensureViewModelStore + 55;
            createFullyDrawnExecutor = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                CameraAnimationsPlugin camera = CameraAnimationsUtils.getCamera(mapView);
                ie ieVar = iaVar.PlaybackStateCompatCustomAction;
                ieVar.getClass();
                ((CameraAnimationsPluginImpl) camera).lifecycleListeners.remove(ieVar);
                shortNewsContentCardView.hashCode();
                throw null;
            }
            CameraAnimationsPlugin camera2 = CameraAnimationsUtils.getCamera(mapView);
            ie ieVar2 = iaVar.PlaybackStateCompatCustomAction;
            ieVar2.getClass();
            ((CameraAnimationsPluginImpl) camera2).lifecycleListeners.remove(ieVar2);
        }
        iaVar.MediaSessionCompatQueueItem = true;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = iaVar.read;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i9 = ensureViewModelStore + 125;
            createFullyDrawnExecutor = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.I_()) {
                int i11 = ensureViewModelStore + 65;
                createFullyDrawnExecutor = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
            } else {
                fromcolorlong = iaVar.RatingCompat;
                if (fromcolorlong != null) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(fromcolorlong, null, null, new DividerUiModelImpl$1(iaVar, shortNewsContentCardView, 27), 3);
                } else {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer = null;
                }
                iaVar.read = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer;
            }
        } else {
            fromcolorlong = iaVar.RatingCompat;
            if (fromcolorlong != null) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(fromcolorlong, null, null, new DividerUiModelImpl$1(iaVar, shortNewsContentCardView, 27), 3);
            } else {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer = null;
            }
            iaVar.read = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer;
        }
        this.write.RemoteActionCompatParcelizer(mapboxMap);
        mh mhVar = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        x xVar = mhVar.RemoteActionCompatParcelizer;
        if (xVar != null) {
            int i13 = ensureViewModelStore + 13;
            createFullyDrawnExecutor = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                xVar.cancel();
                shortNewsContentCardView.hashCode();
                throw null;
            }
            xVar.cancel();
        }
        LegacySessionConfig legacySessionConfig = mhVar.write;
        if (legacySessionConfig != null) {
            int i14 = ensureViewModelStore + 79;
            createFullyDrawnExecutor = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                legacySessionConfig.clear();
            } else {
                legacySessionConfig.clear();
                int i15 = 71 / 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o.ShortNewsContentCardView] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void serializer(MapboxNavigation mapboxNavigation, LocationComponentPluginImpl locationComponentPluginImpl, MapboxMap mapboxMap, String str, boolean z) {
        copygijOMQMdefault copygijomqmdefault;
        int i = 2 % 2;
        SharedFlowImpl sharedFlowImpl = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer;
        accessgetGocp accessgetgocp = 0;
        accessgetGocp accessgetgocpSerializer = null;
        try {
            resetPluckIfNeeded(locationComponentPluginImpl);
            m7 m7Var = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
            mapboxMap.getClass();
            Style styleDeprecated = mapboxMap.getStyleDeprecated();
            if (styleDeprecated != null) {
                m7Var.IconCompatParcelizer(styleDeprecated);
                NetworkingCoreModule$$ExternalSyntheticLambda2 networkingCoreModule$$ExternalSyntheticLambda2 = new NetworkingCoreModule$$ExternalSyntheticLambda2(12, m7Var);
                m7Var.IconCompatParcelizer(styleDeprecated);
                m7Var.IconCompatParcelizer().clearRouteLine(new RouteLineApi$$ExternalSyntheticLambda7(m7Var, styleDeprecated, networkingCoreModule$$ExternalSyntheticLambda2));
                int i2 = ensureViewModelStore + 59;
                createFullyDrawnExecutor = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
            }
            if (UseCaseAdditionSimulator.isNavigationInActiveGuidance(mapboxNavigation)) {
                TurnByTurnNavigationLogger turnByTurnNavigationLogger = this._init_lambda3.RemoteActionCompatParcelizer;
                BuildersKt.RemoteActionCompatParcelizer(turnByTurnNavigationLogger.write, null, null, new PerseusLogger$e$1((Object) turnByTurnNavigationLogger, str, (ShortNewsContentCardView) accessgetgocp, 15), 3);
                mapboxNavigation.stopTripSession();
                stopTurnByTurnApis(mapboxMap);
                Context applicationContext = this.IconCompatParcelizer.getApplicationContext();
                applicationContext.getClass();
                locationComponentPluginImpl.setLocationProvider(new CombinedScopeView(applicationContext, this.PlaybackStateCompatCustomAction));
                if (z) {
                    return;
                }
                getSimplefcGXIks getsimplefcgxiks = this.read;
                copygijomqmdefault = new copygijOMQMdefault(getsimplefcgxiks != null ? getsimplefcgxiks.serializer() : null, str);
            } else {
                int i4 = ensureViewModelStore;
                int i5 = i4 + 91;
                createFullyDrawnExecutor = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (z) {
                    return;
                }
                int i7 = i4 + 17;
                createFullyDrawnExecutor = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    accessgetgocp.hashCode();
                    throw null;
                }
                getSimplefcGXIks getsimplefcgxiks2 = this.read;
                if (getsimplefcgxiks2 != null) {
                    accessgetgocpSerializer = getsimplefcgxiks2.serializer();
                    int i8 = createFullyDrawnExecutor + 23;
                    ensureViewModelStore = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                }
                copygijomqmdefault = new copygijOMQMdefault(accessgetgocpSerializer, str);
                int i10 = createFullyDrawnExecutor + 53;
                ensureViewModelStore = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
            sharedFlowImpl.write(copygijomqmdefault);
        } catch (Throwable th) {
            if (!z) {
                getSimplefcGXIks getsimplefcgxiks3 = this.read;
                sharedFlowImpl.write(new copygijOMQMdefault(getsimplefcgxiks3 != null ? getsimplefcgxiks3.serializer() : 0, str));
                int i12 = createFullyDrawnExecutor + 43;
                ensureViewModelStore = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.util.ArrayList] */
    public static final Object access$updatePuckPosition(MapNavigationImpl mapNavigationImpl, LocationMatcherResult locationMatcherResult, ContinuationImpl continuationImpl) {
        lExternalSyntheticLambda0 lexternalsyntheticlambda0;
        Hyphens hyphens;
        getSimplefcGXIks getsimplefcgxiks;
        Location enhancedLocation;
        ?? keyPoints;
        int i = 2 % 2;
        InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = mapNavigationImpl.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (continuationImpl instanceof lExternalSyntheticLambda0) {
            lexternalsyntheticlambda0 = (lExternalSyntheticLambda0) continuationImpl;
            int i2 = lexternalsyntheticlambda0.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lexternalsyntheticlambda0.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                lexternalsyntheticlambda0 = new lExternalSyntheticLambda0(mapNavigationImpl, continuationImpl);
            }
        } else {
            lexternalsyntheticlambda0 = new lExternalSyntheticLambda0(mapNavigationImpl, continuationImpl);
        }
        Object objValueOf = lexternalsyntheticlambda0.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lexternalsyntheticlambda0.RemoteActionCompatParcelizer;
        boolean z = true;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objValueOf);
            lexternalsyntheticlambda0.serializer = locationMatcherResult;
            lexternalsyntheticlambda0.RemoteActionCompatParcelizer = 1;
            Object obj = (getStrictnessusljTpc) ((getHeadingrAG3T2k) initializeAppStartupItemsImpl.IconCompatParcelizer).read.read();
            if ((obj instanceof getHeadingrAG3T2kannotations) && ((getHeadingrAG3T2kannotations) obj).RemoteActionCompatParcelizer()) {
                int i4 = createFullyDrawnExecutor + 77;
                ensureViewModelStore = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    objValueOf = Boolean.TRUE;
                    int i5 = 15 / 0;
                } else {
                    objValueOf = Boolean.TRUE;
                }
            } else {
                if (obj instanceof Hyphens) {
                    int i6 = createFullyDrawnExecutor + 89;
                    ensureViewModelStore = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        hyphens = (Hyphens) obj;
                        int i7 = 97 / 0;
                    } else {
                        hyphens = (Hyphens) obj;
                    }
                } else {
                    hyphens = null;
                }
                if (hyphens == null || (getsimplefcgxiks = hyphens.read()) == null) {
                    objValueOf = Boolean.FALSE;
                } else {
                    String str = getsimplefcgxiks.read();
                    if (str == null) {
                        int i8 = ensureViewModelStore + 109;
                        createFullyDrawnExecutor = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        objValueOf = Boolean.FALSE;
                    } else {
                        if (!str.equals(VehicleType.Walker.getCode())) {
                            int i10 = createFullyDrawnExecutor + 9;
                            ensureViewModelStore = i10 % Fields.SpotShadowColor;
                            int i11 = i10 % 2;
                            if (!str.equals(VehicleType.Bike.getCode())) {
                                z = false;
                            }
                        }
                        objValueOf = Boolean.valueOf(z);
                    }
                }
            }
            if (objValueOf == coroutineSingletons) {
                int i12 = createFullyDrawnExecutor;
                int i13 = i12 + 81;
                ensureViewModelStore = i13 % Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    throw null;
                }
                int i14 = i12 + 51;
                ensureViewModelStore = i14 % Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    int i15 = 35 / 0;
                }
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i16 = ensureViewModelStore + 83;
            createFullyDrawnExecutor = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            locationMatcherResult = lexternalsyntheticlambda0.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(objValueOf);
        }
        if (((Boolean) objValueOf).booleanValue()) {
            Double d = (Double) initializeAppStartupItemsImpl.serializer;
            enhancedLocation = locationMatcherResult.getEnhancedLocation().toBuilder().bearing(d).build();
            enhancedLocation.getClass();
            List keyPoints2 = locationMatcherResult.getKeyPoints();
            keyPoints = new ArrayList(accessgetInstancedelegatecp.write(keyPoints2, 10));
            Iterator it = keyPoints2.iterator();
            while (it.hasNext()) {
                keyPoints.add(((Location) it.next()).toBuilder().bearing(d).build());
            }
        } else {
            enhancedLocation = locationMatcherResult.getEnhancedLocation();
            keyPoints = locationMatcherResult.getKeyPoints();
        }
        NavigationLocationProvider.changePosition$default((NavigationLocationProvider) mapNavigationImpl.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.MediaSessionCompatResultReceiverWrapper(), enhancedLocation, keyPoints);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:37:0x0100  */
    /* JADX WARN: Code duplicated, block: B:39:0x0104  */
    /* JADX WARN: Code duplicated, block: B:41:0x010e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0111  */
    /* JADX WARN: Code duplicated, block: B:44:0x0115  */
    /* JADX WARN: Code duplicated, block: B:46:0x0119  */
    /* JADX WARN: Code duplicated, block: B:47:0x011c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0120  */
    /* JADX WARN: Code duplicated, block: B:51:0x012b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0133  */
    /* JADX WARN: Code duplicated, block: B:60:0x013f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0157  */
    /* JADX WARN: Code duplicated, block: B:67:0x0183  */
    /* JADX WARN: Code duplicated, block: B:69:0x0187  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ce, code lost:
    
        if (androidx.camera.core.impl.UseCaseAdditionSimulator.awaitNavigationRoutes(r1, r7) == r9) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0130, code lost:
    
        if ((r1 instanceof o.lh) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0135, code lost:
    
        if ((r1 instanceof o.lh) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0138, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013b, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object requestRoute(com.mapbox.navigation.core.MapboxNavigation r25, com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl r26, o.getSimplefcGXIks r27, boolean r28, o.ShortNewsContentCardView r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl.requestRoute(com.mapbox.navigation.core.MapboxNavigation, com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl, o.getSimplefcGXIks, boolean, o.ShortNewsContentCardView):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0046  */
    /* JADX WARN: Code duplicated, block: B:44:0x017c  */
    /* JADX WARN: Code duplicated, block: B:49:0x018e A[PHI: r1 r2 r3
  0x018e: PHI (r1v7 com.mapbox.navigation.core.MapboxNavigation) = 
  (r1v3 com.mapbox.navigation.core.MapboxNavigation)
  (r1v3 com.mapbox.navigation.core.MapboxNavigation)
  (r1v10 com.mapbox.navigation.core.MapboxNavigation)
 binds: [B:35:0x0105, B:37:0x012d, B:48:0x0185] A[DONT_GENERATE, DONT_INLINE]
  0x018e: PHI (r2v4 o.getSimplefcGXIks) = (r2v3 o.getSimplefcGXIks), (r2v3 o.getSimplefcGXIks), (r2v5 o.getSimplefcGXIks) binds: [B:35:0x0105, B:37:0x012d, B:48:0x0185] A[DONT_GENERATE, DONT_INLINE]
  0x018e: PHI (r3v3 com.mapbox.maps.MapboxMap) = (r3v1 com.mapbox.maps.MapboxMap), (r3v1 com.mapbox.maps.MapboxMap), (r3v5 com.mapbox.maps.MapboxMap) binds: [B:35:0x0105, B:37:0x012d, B:48:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f4  */
    public static final Object access$requestOrShowRoutePreview(final MapNavigationImpl mapNavigationImpl, MapboxNavigation mapboxNavigation, getSimplefcGXIks getsimplefcgxiks, MapboxMap mapboxMap, ShortNewsContentCardView shortNewsContentCardView) {
        kf kfVar;
        Object result;
        MapboxNavigation mapboxNavigation2;
        MapboxMap mapboxMap2;
        MapboxMap mapboxMap3;
        m1ExternalSyntheticLambda7 m1externalsyntheticlambda7;
        MapboxNavigation mapboxNavigation3 = mapboxNavigation;
        getSimplefcGXIks getsimplefcgxiks2 = getsimplefcgxiks;
        MapboxMap mapboxMap4 = mapboxMap;
        int i = 2 % 2;
        int i2 = ensureViewModelStore + 105;
        createFullyDrawnExecutor = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        m3 m3Var = mapNavigationImpl.MediaSessionCompatQueueItem;
        TurnByTurnNavigationLogger turnByTurnNavigationLogger = mapNavigationImpl._init_lambda3.RemoteActionCompatParcelizer;
        m7 m7Var = mapNavigationImpl.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        if (shortNewsContentCardView instanceof kf) {
            int i4 = createFullyDrawnExecutor + 1;
            ensureViewModelStore = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = ((kf) shortNewsContentCardView).serializer;
                shortNewsContentCardView2.hashCode();
                throw null;
            }
            kfVar = (kf) shortNewsContentCardView;
            int i6 = kfVar.serializer;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                kfVar.serializer = i6 - Integer.MIN_VALUE;
            } else {
                kfVar = new kf(mapNavigationImpl, shortNewsContentCardView);
            }
        } else {
            kfVar = new kf(mapNavigationImpl, shortNewsContentCardView);
        }
        Object objInvoke = kfVar.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = kfVar.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        final int i8 = 0;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            if (!mapNavigationImpl.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.isEmpty() && !mapboxNavigation.getNavigationRoutes().isEmpty()) {
                int i9 = ensureViewModelStore + 53;
                createFullyDrawnExecutor = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mapNavigationImpl.read, getsimplefcgxiks2}, getCieXyz.write())).booleanValue()) {
                    m7Var.serializer(mapNavigationImpl.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, mapboxMap4, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(mapNavigationImpl) { // from class: o.k7ExternalSyntheticLambda4
                        private static int serializer = 0;
                        private static int write = 1;
                        public final /* synthetic */ MapNavigationImpl RemoteActionCompatParcelizer;

                        {
                            this.RemoteActionCompatParcelizer = mapNavigationImpl;
                        }

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i11 = 2 % 2;
                            int i12 = i8;
                            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                            MapNavigationImpl mapNavigationImpl2 = this.RemoteActionCompatParcelizer;
                            if (i12 == 0) {
                                mapNavigationImpl2.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.write(true);
                                int i13 = write + 1;
                                serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i13 % 2 != 0) {
                                    int i14 = 8 / 0;
                                }
                                return createfromparcel2;
                            }
                            mapNavigationImpl2.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.write(true);
                            int i15 = write + 39;
                            serializer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i15 % 2 == 0) {
                                return createfromparcel2;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    });
                    BuildersKt.RemoteActionCompatParcelizer(turnByTurnNavigationLogger.write, null, null, new ApplicantAuthenticationInterceptorImpl$intercept$1(turnByTurnNavigationLogger, true, m3.RemoteActionCompatParcelizer(mapNavigationImpl.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg), null), 3);
                    return createfromparcel;
                }
            }
            kfVar.IconCompatParcelizer = mapboxNavigation3;
            kfVar.RemoteActionCompatParcelizer = getsimplefcgxiks2;
            kfVar.write = mapboxMap4;
            kfVar.serializer = 1;
            if (UseCaseAdditionSimulator.awaitNavigationRoutes(mapboxNavigation3, kfVar) != coroutineSingletons) {
            }
            int i11 = ensureViewModelStore + 123;
            createFullyDrawnExecutor = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return coroutineSingletons;
        }
        if (i7 == 1) {
            MapboxMap mapboxMap5 = kfVar.write;
            getsimplefcgxiks2 = kfVar.RemoteActionCompatParcelizer;
            MapboxNavigation mapboxNavigation4 = kfVar.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            mapboxMap4 = mapboxMap5;
            mapboxNavigation3 = mapboxNavigation4;
        } else {
            if (i7 == 2) {
                mapboxMap2 = kfVar.write;
                getsimplefcgxiks2 = kfVar.RemoteActionCompatParcelizer;
                mapboxNavigation2 = kfVar.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                mapNavigationImpl.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = instance_delegatelambda0.write;
                MapboxNavigation mapboxNavigation5 = mapboxNavigation2;
                mapboxMap4 = mapboxMap2;
                mapboxNavigation3 = mapboxNavigation5;
                UseCaseAdditionSimulator.IconCompatParcelizer(mapboxNavigation3, new MapNavigationImpl$$ExternalSyntheticLambda3(mapNavigationImpl, i8));
                FetchMapboxRouteUseCase fetchMapboxRouteUseCase = mapNavigationImpl.MediaDescriptionCompat;
                kfVar.IconCompatParcelizer = null;
                kfVar.RemoteActionCompatParcelizer = getsimplefcgxiks2;
                kfVar.write = mapboxMap4;
                kfVar.serializer = 3;
                objInvoke = fetchMapboxRouteUseCase.invoke(mapboxNavigation3, getsimplefcgxiks2, kfVar);
                if (objInvoke != coroutineSingletons) {
                    mapboxMap3 = mapboxMap4;
                }
                int i13 = ensureViewModelStore + 123;
                createFullyDrawnExecutor = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                return coroutineSingletons;
            }
            if (i7 != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mapboxMap3 = kfVar.write;
            getsimplefcgxiks2 = kfVar.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        }
        m1externalsyntheticlambda7 = (m1ExternalSyntheticLambda7) objInvoke;
        if (m1externalsyntheticlambda7 instanceof m1ExternalSyntheticLambda22) {
            mapNavigationImpl.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.write(false);
            BuildersKt.RemoteActionCompatParcelizer(turnByTurnNavigationLogger.write, null, null, new TurnByTurnNavigationLogger$logNavigationArrival$1(turnByTurnNavigationLogger, shortNewsContentCardView2, 4), 3);
            return createfromparcel;
        }
        mapNavigationImpl.read = getsimplefcgxiks2;
        m1ExternalSyntheticLambda22 m1externalsyntheticlambda22 = (m1ExternalSyntheticLambda22) m1externalsyntheticlambda7;
        mapNavigationImpl.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = m1externalsyntheticlambda22.serializer();
        mapNavigationImpl.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.IconCompatParcelizer((NavigationRoute) onContentCardDismissed.MediaMetadataCompat(m1externalsyntheticlambda22.serializer()));
        m7Var.write();
        List listSerializer = m1externalsyntheticlambda22.serializer();
        final int i15 = 1;
        m7Var.serializer(listSerializer, mapboxMap3, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(mapNavigationImpl) { // from class: o.k7ExternalSyntheticLambda4
            private static int serializer = 0;
            private static int write = 1;
            public final /* synthetic */ MapNavigationImpl RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = mapNavigationImpl;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i16 = 2 % 2;
                int i17 = i15;
                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                MapNavigationImpl mapNavigationImpl2 = this.RemoteActionCompatParcelizer;
                if (i17 == 0) {
                    mapNavigationImpl2.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.write(true);
                    int i18 = write + 1;
                    serializer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i18 % 2 != 0) {
                        int i19 = 8 / 0;
                    }
                    return createfromparcel2;
                }
                mapNavigationImpl2.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.write(true);
                int i110 = write + 39;
                serializer = i110 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i110 % 2 == 0) {
                    return createfromparcel2;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        BuildersKt.RemoteActionCompatParcelizer(turnByTurnNavigationLogger.write, null, null, new ApplicantAuthenticationInterceptorImpl$intercept$1(turnByTurnNavigationLogger, false, m3.RemoteActionCompatParcelizer(mapNavigationImpl.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg), null), 3);
        return createfromparcel;
        if (mapNavigationImpl.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.isEmpty()) {
            UseCaseAdditionSimulator.IconCompatParcelizer(mapboxNavigation3, new MapNavigationImpl$$ExternalSyntheticLambda3(mapNavigationImpl, i8));
            FetchMapboxRouteUseCase fetchMapboxRouteUseCase2 = mapNavigationImpl.MediaDescriptionCompat;
            kfVar.IconCompatParcelizer = null;
            kfVar.RemoteActionCompatParcelizer = getsimplefcgxiks2;
            kfVar.write = mapboxMap4;
            kfVar.serializer = 3;
            objInvoke = fetchMapboxRouteUseCase2.invoke(mapboxNavigation3, getsimplefcgxiks2, kfVar);
            if (objInvoke != coroutineSingletons) {
                mapboxMap3 = mapboxMap4;
                m1externalsyntheticlambda7 = (m1ExternalSyntheticLambda7) objInvoke;
                if (m1externalsyntheticlambda7 instanceof m1ExternalSyntheticLambda22) {
                    mapNavigationImpl.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.write(false);
                    BuildersKt.RemoteActionCompatParcelizer(turnByTurnNavigationLogger.write, null, null, new TurnByTurnNavigationLogger$logNavigationArrival$1(turnByTurnNavigationLogger, shortNewsContentCardView2, 4), 3);
                    return createfromparcel;
                }
                mapNavigationImpl.read = getsimplefcgxiks2;
                m1ExternalSyntheticLambda22 m1externalsyntheticlambda23 = (m1ExternalSyntheticLambda22) m1externalsyntheticlambda7;
                mapNavigationImpl.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = m1externalsyntheticlambda23.serializer();
                mapNavigationImpl.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.IconCompatParcelizer((NavigationRoute) onContentCardDismissed.MediaMetadataCompat(m1externalsyntheticlambda23.serializer()));
                m7Var.write();
                List listSerializer2 = m1externalsyntheticlambda23.serializer();
                final int i16 = 1;
                m7Var.serializer(listSerializer2, mapboxMap3, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(mapNavigationImpl) { // from class: o.k7ExternalSyntheticLambda4
                    private static int serializer = 0;
                    private static int write = 1;
                    public final /* synthetic */ MapNavigationImpl RemoteActionCompatParcelizer;

                    {
                        this.RemoteActionCompatParcelizer = mapNavigationImpl;
                    }

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i17 = 2 % 2;
                        int i18 = i16;
                        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                        MapNavigationImpl mapNavigationImpl2 = this.RemoteActionCompatParcelizer;
                        if (i18 == 0) {
                            mapNavigationImpl2.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.write(true);
                            int i19 = write + 1;
                            serializer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i19 % 2 != 0) {
                                int i110 = 8 / 0;
                            }
                            return createfromparcel2;
                        }
                        mapNavigationImpl2.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.write(true);
                        int i111 = write + 39;
                        serializer = i111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i111 % 2 == 0) {
                            return createfromparcel2;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                });
                BuildersKt.RemoteActionCompatParcelizer(turnByTurnNavigationLogger.write, null, null, new ApplicantAuthenticationInterceptorImpl$intercept$1(turnByTurnNavigationLogger, false, m3.RemoteActionCompatParcelizer(mapNavigationImpl.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg), null), 3);
                return createfromparcel;
            }
        } else {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mapNavigationImpl.read, getsimplefcgxiks2}, getCieXyz.write())).booleanValue()) {
                UseCaseAdditionSimulator.IconCompatParcelizer(mapboxNavigation3, new MapNavigationImpl$$ExternalSyntheticLambda3(mapNavigationImpl, i8));
                FetchMapboxRouteUseCase fetchMapboxRouteUseCase3 = mapNavigationImpl.MediaDescriptionCompat;
                kfVar.IconCompatParcelizer = null;
                kfVar.RemoteActionCompatParcelizer = getsimplefcgxiks2;
                kfVar.write = mapboxMap4;
                kfVar.serializer = 3;
                objInvoke = fetchMapboxRouteUseCase3.invoke(mapboxNavigation3, getsimplefcgxiks2, kfVar);
                if (objInvoke != coroutineSingletons) {
                    mapboxMap3 = mapboxMap4;
                    m1externalsyntheticlambda7 = (m1ExternalSyntheticLambda7) objInvoke;
                    if (m1externalsyntheticlambda7 instanceof m1ExternalSyntheticLambda22) {
                        mapNavigationImpl.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.write(false);
                        BuildersKt.RemoteActionCompatParcelizer(turnByTurnNavigationLogger.write, null, null, new TurnByTurnNavigationLogger$logNavigationArrival$1(turnByTurnNavigationLogger, shortNewsContentCardView2, 4), 3);
                        return createfromparcel;
                    }
                    mapNavigationImpl.read = getsimplefcgxiks2;
                    m1ExternalSyntheticLambda22 m1externalsyntheticlambda24 = (m1ExternalSyntheticLambda22) m1externalsyntheticlambda7;
                    mapNavigationImpl.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = m1externalsyntheticlambda24.serializer();
                    mapNavigationImpl.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.IconCompatParcelizer((NavigationRoute) onContentCardDismissed.MediaMetadataCompat(m1externalsyntheticlambda24.serializer()));
                    m7Var.write();
                    List listSerializer3 = m1externalsyntheticlambda24.serializer();
                    final int i17 = 1;
                    m7Var.serializer(listSerializer3, mapboxMap3, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(mapNavigationImpl) { // from class: o.k7ExternalSyntheticLambda4
                        private static int serializer = 0;
                        private static int write = 1;
                        public final /* synthetic */ MapNavigationImpl RemoteActionCompatParcelizer;

                        {
                            this.RemoteActionCompatParcelizer = mapNavigationImpl;
                        }

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i18 = 2 % 2;
                            int i19 = i17;
                            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                            MapNavigationImpl mapNavigationImpl2 = this.RemoteActionCompatParcelizer;
                            if (i19 == 0) {
                                mapNavigationImpl2.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.write(true);
                                int i110 = write + 1;
                                serializer = i110 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i110 % 2 != 0) {
                                    int i111 = 8 / 0;
                                }
                                return createfromparcel2;
                            }
                            mapNavigationImpl2.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.write(true);
                            int i112 = write + 39;
                            serializer = i112 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i112 % 2 == 0) {
                                return createfromparcel2;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    });
                    BuildersKt.RemoteActionCompatParcelizer(turnByTurnNavigationLogger.write, null, null, new ApplicantAuthenticationInterceptorImpl$intercept$1(turnByTurnNavigationLogger, false, m3.RemoteActionCompatParcelizer(mapNavigationImpl.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg), null), 3);
                    return createfromparcel;
                }
            } else {
                int i18 = createFullyDrawnExecutor + 55;
                ensureViewModelStore = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                kfVar.IconCompatParcelizer = mapboxNavigation3;
                kfVar.RemoteActionCompatParcelizer = getsimplefcgxiks2;
                kfVar.write = mapboxMap4;
                kfVar.serializer = 2;
                Style styleDeprecated = mapboxMap4.getStyleDeprecated();
                if (styleDeprecated == null) {
                    result = createfromparcel;
                } else {
                    m7Var.IconCompatParcelizer(styleDeprecated);
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(kfVar));
                    cancellableContinuationImpl.read();
                    r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ r8lambdafy5cfs23n4jmtz3paokfibbqq = new r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ(7, cancellableContinuationImpl);
                    m7Var.IconCompatParcelizer(styleDeprecated);
                    m7Var.IconCompatParcelizer().clearRouteLine(new RouteLineApi$$ExternalSyntheticLambda7(m7Var, styleDeprecated, r8lambdafy5cfs23n4jmtz3paokfibbqq));
                    cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new setSizeuvyYCjk(9, m7Var));
                    result = cancellableContinuationImpl.getResult();
                    if (result != coroutineSingletons) {
                        result = createfromparcel;
                    }
                }
                if (result != coroutineSingletons) {
                    MapboxMap mapboxMap6 = mapboxMap4;
                    mapboxNavigation2 = mapboxNavigation3;
                    mapboxMap2 = mapboxMap6;
                    mapNavigationImpl.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = instance_delegatelambda0.write;
                    MapboxNavigation mapboxNavigation6 = mapboxNavigation2;
                    mapboxMap4 = mapboxMap2;
                    mapboxNavigation3 = mapboxNavigation6;
                    UseCaseAdditionSimulator.IconCompatParcelizer(mapboxNavigation3, new MapNavigationImpl$$ExternalSyntheticLambda3(mapNavigationImpl, i8));
                    FetchMapboxRouteUseCase fetchMapboxRouteUseCase4 = mapNavigationImpl.MediaDescriptionCompat;
                    kfVar.IconCompatParcelizer = null;
                    kfVar.RemoteActionCompatParcelizer = getsimplefcgxiks2;
                    kfVar.write = mapboxMap4;
                    kfVar.serializer = 3;
                    objInvoke = fetchMapboxRouteUseCase4.invoke(mapboxNavigation3, getsimplefcgxiks2, kfVar);
                    if (objInvoke != coroutineSingletons) {
                        mapboxMap3 = mapboxMap4;
                        m1externalsyntheticlambda7 = (m1ExternalSyntheticLambda7) objInvoke;
                        if (m1externalsyntheticlambda7 instanceof m1ExternalSyntheticLambda22) {
                            mapNavigationImpl.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.write(false);
                            BuildersKt.RemoteActionCompatParcelizer(turnByTurnNavigationLogger.write, null, null, new TurnByTurnNavigationLogger$logNavigationArrival$1(turnByTurnNavigationLogger, shortNewsContentCardView2, 4), 3);
                            return createfromparcel;
                        }
                        mapNavigationImpl.read = getsimplefcgxiks2;
                        m1ExternalSyntheticLambda22 m1externalsyntheticlambda25 = (m1ExternalSyntheticLambda22) m1externalsyntheticlambda7;
                        mapNavigationImpl.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = m1externalsyntheticlambda25.serializer();
                        mapNavigationImpl.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.IconCompatParcelizer((NavigationRoute) onContentCardDismissed.MediaMetadataCompat(m1externalsyntheticlambda25.serializer()));
                        m7Var.write();
                        List listSerializer4 = m1externalsyntheticlambda25.serializer();
                        final int i110 = 1;
                        m7Var.serializer(listSerializer4, mapboxMap3, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(mapNavigationImpl) { // from class: o.k7ExternalSyntheticLambda4
                            private static int serializer = 0;
                            private static int write = 1;
                            public final /* synthetic */ MapNavigationImpl RemoteActionCompatParcelizer;

                            {
                                this.RemoteActionCompatParcelizer = mapNavigationImpl;
                            }

                            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                            public final Object invoke() {
                                int i111 = 2 % 2;
                                int i112 = i110;
                                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                                MapNavigationImpl mapNavigationImpl2 = this.RemoteActionCompatParcelizer;
                                if (i112 == 0) {
                                    mapNavigationImpl2.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.write(true);
                                    int i113 = write + 1;
                                    serializer = i113 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i113 % 2 != 0) {
                                        int i114 = 8 / 0;
                                    }
                                    return createfromparcel2;
                                }
                                mapNavigationImpl2.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.write(true);
                                int i115 = write + 39;
                                serializer = i115 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i115 % 2 == 0) {
                                    return createfromparcel2;
                                }
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                        });
                        BuildersKt.RemoteActionCompatParcelizer(turnByTurnNavigationLogger.write, null, null, new ApplicantAuthenticationInterceptorImpl$intercept$1(turnByTurnNavigationLogger, false, m3.RemoteActionCompatParcelizer(mapNavigationImpl.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg), null), 3);
                        return createfromparcel;
                    }
                }
            }
        }
        int i111 = ensureViewModelStore + 123;
        createFullyDrawnExecutor = i111 % Fields.SpotShadowColor;
        int i112 = i111 % 2;
        return coroutineSingletons;
    }
}
