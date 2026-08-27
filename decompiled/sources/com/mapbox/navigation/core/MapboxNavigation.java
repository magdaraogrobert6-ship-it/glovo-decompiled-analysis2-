package com.mapbox.navigation.core;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.speech.tts.TextToSpeech;
import androidx.biometric.CryptoObjectUtils;
import androidx.camera.core.FocusMeteringAction;
import androidx.collection.ObjectList$toString$1;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import androidx.navigation.compose.NavHostKt$NavHost$29$1;
import androidx.navigation.internal.NavContext;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.SQLite;
import androidx.transition.TransitionValuesMaps;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.network.NetworkFetcher;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.logger.PerseusLogger$e$1;
import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.google.android.gms.internal.mlkit_vision_face.zzdr;
import com.google.android.gms.internal.mlkit_vision_face.zznc;
import com.google.android.gms.internal.mlkit_vision_face.zzon;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksImpl;
import com.google.firestore.v1.FirestoreGrpc;
import com.google.re2j.Parser;
import com.huawei.agconnect.config.impl.m;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.Vw$Vw;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.huawei.wisesecurity.ucs_credential.x;
import com.logistics.rider.glovo.R;
import com.mapbox.annotation.module.MapboxModuleType;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.BillingService;
import com.mapbox.common.BillingSessionStatus;
import com.mapbox.common.HttpServiceFactory;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.ReachabilityInterface;
import com.mapbox.common.SdkInformation;
import com.mapbox.common.SessionSKUIdentifier;
import com.mapbox.common.TileDataDomain;
import com.mapbox.common.TileStore;
import com.mapbox.common.location.LocationServiceFactory;
import com.mapbox.common.module.provider.MapboxModuleProvider;
import com.mapbox.geojson.Point;
import com.mapbox.maps.extension.style.layers.LayerUtils$getLayer$source$2;
import com.mapbox.navigation.base.internal.DecodeUtilsExKt;
import com.mapbox.navigation.base.internal.SDKRouteParser$Companion;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.internal.route.parsing.ParsingEntryPoint;
import com.mapbox.navigation.base.internal.route.parsing.parser.directions.NnAndModelsParallelNavigationRoutesParser;
import com.mapbox.navigation.base.internal.tilestore.NavigationTileStoreOwner;
import com.mapbox.navigation.base.internal.utils.OptimisedForJavaMemoryRoutesParsingQueue;
import com.mapbox.navigation.base.options.AlertServiceOptions;
import com.mapbox.navigation.base.options.DeviceProfile;
import com.mapbox.navigation.base.options.LocationOptions;
import com.mapbox.navigation.base.options.NavigationOptions;
import com.mapbox.navigation.base.options.RerouteOptions;
import com.mapbox.navigation.base.options.RoadObjectMatcherOptions;
import com.mapbox.navigation.base.options.RoutingTilesOptions;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.route.RouteAlternativesOptions;
import com.mapbox.navigation.base.route.RouteRefreshOptions;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.base.trip.notification.TripNotification;
import com.mapbox.navigation.base.utils.DecodeUtils;
import com.mapbox.navigation.base.utils.DecodeUtils$stepsGeometryDecodeCache$1;
import com.mapbox.navigation.core.accounts.BillingController$$ExternalSyntheticLambda1;
import com.mapbox.navigation.core.accounts.BillingController$arrivalObserver$1;
import com.mapbox.navigation.core.accounts.BillingController$onExternalRouteSet$newWaypoints$1;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.directions.session.DirectionsSessionKt;
import com.mapbox.navigation.core.directions.session.IgnoredRoute;
import com.mapbox.navigation.core.directions.session.MapboxDirectionsSession;
import com.mapbox.navigation.core.directions.session.RoutesObserver;
import com.mapbox.navigation.core.directions.session.RoutesUpdatedResult;
import com.mapbox.navigation.core.history.MapboxHistoryRecorder;
import com.mapbox.navigation.core.internal.LowMemoryManager$Observer;
import com.mapbox.navigation.core.internal.MapboxNavigationSDKInitializerImpl;
import com.mapbox.navigation.core.internal.ReachabilityService;
import com.mapbox.navigation.core.internal.SdkInfoProvider$WhenMappings;
import com.mapbox.navigation.core.internal.SdkVariantKt;
import com.mapbox.navigation.core.internal.congestions.TrafficOverrideHandler;
import com.mapbox.navigation.core.internal.router.OngoingRequest;
import com.mapbox.navigation.core.navigator.offline.TilesetVersionsApi$json$1;
import com.mapbox.navigation.core.preview.RoutesPreviewUpdate;
import com.mapbox.navigation.core.reroute.MapboxRerouteController;
import com.mapbox.navigation.core.reroute.NativeMapboxRerouteController;
import com.mapbox.navigation.core.routealternatives.AlternativeRouteMetadata;
import com.mapbox.navigation.core.routerefresh.ExpiringDataRemover$removeExpiringDataFromRoute$1;
import com.mapbox.navigation.core.routerefresh.MapboxHistoryRecorderWrapper;
import com.mapbox.navigation.core.routerefresh.RouteRefreshValidator;
import com.mapbox.navigation.core.routerefresh.RouteRefreshValidator$RouteValidationResult$Invalid;
import com.mapbox.navigation.core.routerefresh.RouteRefreshValidator$RouteValidationResult$Valid;
import com.mapbox.navigation.core.routerefresh.RouteRefresher;
import com.mapbox.navigation.core.telemetry.ApplicationLifecycleMonitor;
import com.mapbox.navigation.core.trip.service.MapboxTripService;
import com.mapbox.navigation.core.trip.session.MapboxTripSession;
import com.mapbox.navigation.core.trip.session.MapboxTripSession$$ExternalSyntheticLambda3;
import com.mapbox.navigation.core.trip.session.NativeSetRouteValue;
import com.mapbox.navigation.core.trip.session.NavigationSession;
import com.mapbox.navigation.core.trip.session.eh.EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1;
import com.mapbox.navigation.core.utils.Delayer;
import com.mapbox.navigation.core.utils.SystemLocaleWatcher;
import com.mapbox.navigation.core.utils.ThreadUtils;
import com.mapbox.navigation.navigator.internal.MapboxNativeNavigatorImpl;
import com.mapbox.navigation.navigator.internal.NavigatorLoader$HistoryRecorderHandles;
import com.mapbox.navigation.navigator.internal.NavigatorLoader$WhenMappings;
import com.mapbox.navigation.utils.internal.ConnectivityHandler;
import com.mapbox.navigation.utils.internal.JobControl;
import com.mapbox.navigation.utils.internal.LoggerProvider;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigation.utils.internal.ThreadController;
import com.mapbox.navigation.utils.internal.Time$SystemClockImpl;
import com.mapbox.navigation.voice.api.VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes;
import com.mapbox.navigation.voice.model.AudioFocusOwner;
import com.mapbox.navigator.AdasisFacadeHandle;
import com.mapbox.navigator.AlertsServiceOptions;
import com.mapbox.navigator.ConfigFactory;
import com.mapbox.navigator.ConfigHandle;
import com.mapbox.navigator.ElectronicHorizonOptions;
import com.mapbox.navigator.Experimental;
import com.mapbox.navigator.HistoryRecorderHandle;
import com.mapbox.navigator.NavigatorConfig;
import com.mapbox.navigator.PollingConfig;
import com.mapbox.navigator.ProfileApplication;
import com.mapbox.navigator.ProfilePlatform;
import com.mapbox.navigator.RerouteStrategyForMatchRoute;
import com.mapbox.navigator.RoadObjectMatcherConfig;
import com.mapbox.navigator.RoadObjectsMatcherOptions;
import com.mapbox.navigator.RoadObjectsStoreInterface;
import com.mapbox.navigator.RouteAlternativesControllerInterface;
import com.mapbox.navigator.SettingsProfile;
import com.mapbox.navigator.TileEndpointConfiguration;
import com.mapbox.navigator.TilesConfig;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.appmigration.presentation.AppMigrationBannerUiModelImpl;
import com.roadrunner.appmigration.presentation.AppMigrationUiModelImpl;
import com.roadrunner.auth.data.AuthRepository$logoutUser$2;
import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import com.roadrunner.custom.password.api.CustomPasswordLaunchData;
import com.roadrunner.custom.password.presentation.CustomPasswordViewModel;
import com.roadrunner.customerchat.selfservice.presentation.BridgeManager$trackEvent$2;
import com.roadrunner.delivery.accept.acceptbutton.presentation.DeliveryAcceptButtonUiModelImpl;
import com.roadrunner.delivery.accept.autoaccept.preferences.presentation.AutoAcceptPreferencesViewModel;
import com.roadrunner.delivery.accept.declinebutton.presentation.DeclineButtonUiModelImpl$1;
import com.roadrunner.delivery.accept.earnings.api.EarningsUiModel;
import com.roadrunner.delivery.accept.earnings.presentation.EarningsUiModelImpl;
import com.roadrunner.delivery.accept.laststop.api.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModel;
import com.roadrunner.delivery.accept.laststop.presentation.LastStopOptionUiModelImpl;
import com.roadrunner.delivery.accept.laststop.presentation.LastStopOptionUiModelImpl$trackEvent$1;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import com.roadrunner.delivery.common.data.model.TrackingEventExtensionsKt;
import com.roadrunner.delivery.state.TrackingEvent;
import com.roadrunner.delivery.state.Trigger;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.face.verification.data.SelfieFlowRepository$uploadSelfie$2;
import com.sentiance.core.model.events.E$b;
import com.sentiance.core.model.events.I$b;
import com.sentiance.core.model.events.N$b;
import fwfd.com.fwfsdk.util.FWFHelper;
import io.grpc.internal.MetadataApplierImpl;
import io.sentry.util.UrlUtils;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.sync.MutexImpl;
import o.AndroidLayoutApi34;
import o.AndroidLayoutApi34ExternalSyntheticLambda0;
import o.BoringLayoutFactory;
import o.BoringLayoutFactory33ExternalSyntheticApiModelOutline0;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerWhenMappings;
import o.DefaultInAppMessageViewWrapper;
import o.FontWeightSaverlambda0;
import o.HyphensSaverlambda0;
import o.IInAppMessageViewWrapper;
import o.LayoutCompatBreakStrategy;
import o.LayoutCompatHyphenationFrequency;
import o.LayoutCompatJustificationMode;
import o.SemanticsListener;
import o.SemanticsModifier;
import o.SemanticsModifierDefaultImpls;
import o.SemanticsSortKtgeometryDepthFirstSearchisTraversalGroup1;
import o.ShortNewsContentCardView;
import o.StaticLayoutFactory28;
import o.TapGestureDetectorKt;
import o.TtsAnnotation;
import o.VerbatimTtsAnnotation;
import o.accessgetIdjd;
import o.accessgetInstancedelegatecp;
import o.accesssemanticsScrollByd4ec7I;
import o.applyUnregisterDisplayedMessageResult;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.ddefault;
import o.drawText;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.fastMergedSHsh3o;
import o.getCharacterRightBounds;
import o.getCieXyz;
import o.getClearTextSubstitution;
import o.getClipBounds;
import o.getCopyText;
import o.getCutText;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.getLayingOutChildren;
import o.getOnFillData;
import o.getQueryContext;
import o.getRangeForRectlambda0;
import o.getScrollByOffset;
import o.getStripNonMetricAffectingCharSpansannotations;
import o.getTextBounds;
import o.getTrackingServicefwf_client_release;
import o.getUseEvaluationsCachefwf_client_release;
import o.getVerbatim;
import o.get_nativeCanvasui_text;
import o.hashCodeimpl;
import o.hideCurrentlyDisplayingInAppMessage;
import o.insertOrUpdateTransformedNodeSubhierarchy;
import o.instance_delegatelambda0;
import o.invalidateCallbacksFor;
import o.isInvalidIndex;
import o.isOpaque;
import o.measurexDpz5zYdefault;
import o.mergedSemanticsConfiguration;
import o.nearestParentThatHasSemantics;
import o.onBackInvokedlambda0;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewAttachedToWindow;
import o.onViewAttachedToWindowlambda0;
import o.q4ExternalSyntheticLambda9;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambda8Qf6Vtl1pxlFHiMZeMUbAdi_ww;
import o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ;
import o.removeNodeAtDepth;
import o.resolveSpanStyleDefaults;
import o.restoreToCount;
import o.saveLayerAlpha;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setBitmap;
import o.setMatrix;
import o.setShowingTextSubstitution;
import o.setToggleableState;
import o.set_nativeCanvasui_text;
import o.sortByGeometryGroupingslambda1;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.core.scope.Scope;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxNavigation {
    public static volatile boolean hasInstance;
    public MapboxNativeNavigatorImpl _navigator;
    public final ApplicationLifecycleMonitor appLifecycleMonitor;
    public final ArrivalProgressObserver arrivalProgressObserver;
    public final E$b billingController;
    public final MapboxHistoryRecorder compositeRecorder;
    public final ConnectivityHandler connectivityHandler;
    public final MapboxHistoryRecorder copilotHistoryRecorder;
    public final DeveloperMetadataAggregator developerMetadataAggregator;
    public final MapboxDirectionsSession directionsSession;
    public final i$d.a etcGateAPI;
    public final Parser.Pair evDynamicDataHolder;
    public final MapboxHistoryRecorder historyRecorder;
    public final List historyRecorders;
    public final HistoryRecordingStateHandler historyRecordingStateHandler;
    public volatile boolean isDestroyed;
    public Integer latestLegIndex;
    public final x lowMemoryManager;
    public final MapboxNavigation$$ExternalSyntheticLambda0 lowMemoryObserver;
    public final JobControl mainJobController;
    public final NavigationOptions navigationOptions;
    public final NavigationSession navigationSession;
    public final AnalyticsServiceImpl navigationTelemetry;
    public final LinkedHashSet navigationVersionSwitchObservers;
    public final Field notificationChannelField;
    public Long reachabilityObserverId;
    public final zznc rerouteController;
    public final MetadataApplierImpl routeAlternativesController;
    public final E$b routeRefreshController;
    public final MutexImpl routeUpdateMutex;
    public final BlockRunner routerWrapper;
    public final RoutesCacheClearer routesCacheClearer;
    public final DropShadowEffect routesPreviewController;
    public final RoutesProgressDataProvider routesProgressDataProvider;
    public final SystemLocaleWatcher systemLocaleWatcher;
    public final ThreadController threadController;
    public final getCopyText tripNotificationInterceptorOwner;
    public final MapboxTripSession tripSession;
    public final DisplayCallbacksImpl tripSessionLocationEngine;

    /* JADX INFO: renamed from: com.mapbox.navigation.core.MapboxNavigation$11, reason: invalid class name */
    public final class AnonymousClass11 extends Lambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass11(int i, Object obj) {
            super(2);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = this.$r8$classId;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = this.this$0;
            boolean z = true;
            int i2 = 0;
            if (i == 0) {
                List list = (List) obj;
                int iIntValue = ((Number) obj2).intValue();
                list.getClass();
                MapboxNavigation mapboxNavigation = (MapboxNavigation) obj3;
                MapboxTripSession mapboxTripSession = mapboxNavigation.tripSession;
                boolean z2 = mapboxTripSession.hadOffRouteDeviation;
                if (!z2 || (z2 && mapboxTripSession.isOffRoute)) {
                    mapboxNavigation.internalSetNavigationRoutes(list, new SetRoutes$Reroute(iIntValue), null);
                    mapboxTripSession.hadOffRouteDeviation = false;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            if (i == 1) {
                accesssemanticsScrollByd4ec7I accesssemanticsscrollbyd4ec7i = (accesssemanticsScrollByd4ec7I) obj;
                accesssemanticsScrollByd4ec7I accesssemanticsscrollbyd4ec7i2 = (accesssemanticsScrollByd4ec7I) obj2;
                accesssemanticsScrollByd4ec7I accesssemanticsscrollbyd4ec7i3 = accesssemanticsScrollByd4ec7I.PostExit;
                return Boolean.valueOf(accesssemanticsscrollbyd4ec7i == accesssemanticsscrollbyd4ec7i3 && accesssemanticsscrollbyd4ec7i2 == accesssemanticsscrollbyd4ec7i3 && !((TapGestureDetectorKt) obj3).serializer.write);
            }
            if (i == 2) {
                Integer num = (Integer) obj;
                ((Number) obj2).intValue();
                TransitionValuesMaps transitionValuesMaps = (TransitionValuesMaps) ((x) obj3).read;
                ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) transitionValuesMaps.RatingCompat;
                if (num != null && ensuresubscribedtoinappmessageeventslambda7.serializer(num.intValue())) {
                    i2 = ((ensureSubscribedToInAppMessageEventslambda7) transitionValuesMaps.MediaDescriptionCompat).read;
                }
                return Integer.valueOf(i2);
            }
            if (i == 3) {
                ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
                Expected expected = (Expected) obj2;
                shortNewsContentCardView.getClass();
                expected.getClass();
                expected.fold(new ArrivalProgressObserver$$ExternalSyntheticLambda0((NavigationRoute) obj3, 8, shortNewsContentCardView), new MapboxNavigation$$ExternalSyntheticLambda4(13, shortNewsContentCardView));
                return createfromparcel;
            }
            if (i != 4) {
                ((Scope) obj).getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return (Context) obj3;
            }
            TextToSpeech textToSpeech = (TextToSpeech) obj;
            textToSpeech.getClass();
            ((Bundle) obj2).getClass();
            textToSpeech.setAudioAttributes(((VoiceInstructionsPlayerAttributes$OreoAndLaterAttributes) obj3).audioAttributes$voice_release(AudioFocusOwner.TextToSpeech));
            return createfromparcel;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.navigation.core.MapboxNavigation$13, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass13 implements RoutesObserver, r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ {
        public final /* synthetic */ E$b $tmp0;

        public AnonymousClass13(E$b e$b) {
            this.$tmp0 = e$b;
        }

        /* JADX WARN: Code duplicated, block: B:52:0x0159 A[EDGE_INSN: B:52:0x0159->B:53:0x015a BREAK  A[LOOP:4: B:41:0x010a->B:95:0x010a]] */
        @Override // com.mapbox.navigation.core.directions.session.RoutesObserver
        public final void onRoutesChanged(RoutesUpdatedResult routesUpdatedResult) {
            boolean z;
            routesUpdatedResult.getClass();
            if (routesUpdatedResult.reason.equals("ROUTES_UPDATE_REASON_REFRESH")) {
                return;
            }
            E$b e$b = this.$tmp0;
            ((FocusMeteringAction) e$b.write).RemoteActionCompatParcelizer = SystemClock.elapsedRealtime();
            JobKt.IconCompatParcelizer(JobKt.IconCompatParcelizer(((ContextScope) ((AnalyticsServiceImpl) e$b.IconCompatParcelizer).locationProvider).serializer));
            List list = routesUpdatedResult.ignoredRoutes;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((IgnoredRoute) obj).reason.equals("Alternative fork point passed")) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((IgnoredRoute) it.next()).navigationRoute);
            }
            I$b i$b = (I$b) e$b.RemoteActionCompatParcelizer;
            ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(arrayList2, routesUpdatedResult.navigationRoutes);
            MapboxHistoryRecorderWrapper mapboxHistoryRecorderWrapper = (MapboxHistoryRecorderWrapper) i$b.MediaSessionCompatResultReceiverWrapper;
            x xVar = (x) i$b.serializer;
            ContextScope contextScope = (ContextScope) i$b.PlaybackStateCompat;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (contextScope != null) {
                YieldKt.write(contextScope, (CancellationException) null);
                i$b.PlaybackStateCompat = CryptoObjectUtils.newChildScope((ContextScope) i$b.MediaDescriptionCompat);
            }
            if (arrayListIconCompatParcelizer.isEmpty()) {
                i$b.MediaSessionCompatQueueItem = null;
                LoggerProviderKt.logI("Routes are empty, nothing to refresh", "RouteRefreshController");
                xVar.onNewState(null, null);
                return;
            }
            ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayListIconCompatParcelizer, 10));
            Iterator it2 = arrayListIconCompatParcelizer.iterator();
            while (it2.hasNext()) {
                arrayList3.add(RouteRefreshValidator.validateRoute((NavigationRoute) it2.next()));
            }
            int i = 0;
            if (!arrayList3.isEmpty()) {
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    if (((getOnFillData) it3.next()) instanceof RouteRefreshValidator$RouteValidationResult$Valid) {
                        List list2 = (List) i$b.MediaSessionCompatQueueItem;
                        if (list2 == null) {
                            z = false;
                            break;
                        }
                        List list3 = list2;
                        if ((list3 instanceof Collection) && list3.isEmpty()) {
                            z = false;
                            break;
                        }
                        Iterator it4 = list3.iterator();
                        loop4: while (true) {
                            if (!it4.hasNext()) {
                                z = false;
                                break;
                            }
                            NavigationRoute navigationRoute = (NavigationRoute) it4.next();
                            if (!arrayListIconCompatParcelizer.isEmpty()) {
                                Iterator it5 = arrayListIconCompatParcelizer.iterator();
                                while (it5.hasNext()) {
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{navigationRoute.id, ((NavigationRoute) it5.next()).id}, getCieXyz.write())).booleanValue()) {
                                        z = true;
                                        break loop4;
                                    }
                                }
                            }
                        }
                        i$b.MediaSessionCompatQueueItem = arrayListIconCompatParcelizer;
                        ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(arrayListIconCompatParcelizer, 10));
                        Iterator it6 = arrayListIconCompatParcelizer.iterator();
                        while (it6.hasNext()) {
                            arrayList4.add(((NavigationRoute) it6.next()).id);
                        }
                        mapboxHistoryRecorderWrapper.getClass();
                        MapboxHistoryRecorder mapboxHistoryRecorder = mapboxHistoryRecorderWrapper.historyRecorder;
                        mapboxHistoryRecorder.pushHistory("android_route_refresh_events", "{\"type\":\"PeriodicRouteRefresh.RoutesToRefreshUpdated\",\"ids\":[" + onContentCardDismissed.IconCompatParcelizer(arrayList4, ",", null, null, ExpiringDataRemover$removeExpiringDataFromRoute$1.INSTANCE$1, 30) + "]}");
                        mapboxHistoryRecorder.pushHistory("android_route_refresh_events", "{\"type\":\"PeriodicRouteRefresh.Started\"}");
                        ((getUseEvaluationsCachefwf_client_release) i$b.RatingCompat).write = 0;
                        i$b.postAttempt(new AuthRepository$logoutUser$2(i$b, arrayListIconCompatParcelizer, shortNewsContentCardView, 7), z);
                        return;
                    }
                }
            }
            i$b.MediaSessionCompatQueueItem = null;
            ArrayList<onViewAttachedToWindowlambda0> arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(arrayList3, 10));
            for (Object obj2 : arrayList3) {
                if (i < 0) {
                    SQLite.serializer();
                    throw null;
                }
                arrayList5.add(new onViewAttachedToWindowlambda0((getOnFillData) obj2, arrayListIconCompatParcelizer.get(i)));
                i++;
            }
            ArrayList arrayList6 = new ArrayList();
            for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 : arrayList5) {
                Object obj3 = onviewattachedtowindowlambda0.serializer;
                RouteRefreshValidator$RouteValidationResult$Invalid routeRefreshValidator$RouteValidationResult$Invalid = obj3 instanceof RouteRefreshValidator$RouteValidationResult$Invalid ? (RouteRefreshValidator$RouteValidationResult$Invalid) obj3 : null;
                String str = routeRefreshValidator$RouteValidationResult$Invalid != null ? ((NavigationRoute) onviewattachedtowindowlambda0.write).id + ' ' + routeRefreshValidator$RouteValidationResult$Invalid.reason : null;
                if (str != null) {
                    arrayList6.add(str);
                }
            }
            String strConcat = "No routes which could be refreshed. ".concat(onContentCardDismissed.IconCompatParcelizer(arrayList6, ". ", null, null, null, 62));
            LoggerProviderKt.logI(strConcat, "RouteRefreshController");
            xVar.onNewState("STARTED", null);
            xVar.onNewState("FINISHED_FAILED", strConcat);
            xVar.onNewState(null, null);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof RoutesObserver) && (obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ)) {
                return getFunctionDelegate().equals(((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate());
            }
            return false;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ
        public final isInvalidIndex getFunctionDelegate() {
            return new FunctionReferenceImpl(1, 0, E$b.class, this.$tmp0, "onRoutesChanged", "onRoutesChanged$navigation_release(Lcom/mapbox/navigation/core/directions/session/RoutesUpdatedResult;)V");
        }
    }

    public final TilesConfig createTilesConfig(String str, boolean z) {
        String absolutePath;
        NavigationOptions navigationOptions = this.navigationOptions;
        Context context = navigationOptions.applicationContext;
        context.getClass();
        RoutingTilesOptions routingTilesOptions = navigationOptions.routingTilesOptions;
        routingTilesOptions.getClass();
        String absolutePath2 = new File(context.getFilesDir(), "mbx_nav/tiles").getAbsolutePath();
        absolutePath2.getClass();
        File file = new File(absolutePath2);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (file.exists()) {
            LoggerProviderKt.logI("Initial size is " + file.length() + " bytes", "RoutingTilesFiles");
            absolutePath = file.getAbsolutePath();
            absolutePath.getClass();
        } else {
            LoggerProviderKt.logE("Unable to create a file, check the RoutingTilesOptions " + file.getAbsolutePath(), "RoutingTilesFiles");
            absolutePath = "";
        }
        String str2 = absolutePath;
        TileEndpointConfiguration tileEndpointConfiguration = new TileEndpointConfiguration(routingTilesOptions.tilesBaseUri.toString(), "mapbox".concat("/driving-traffic"), str, z, "", 56);
        routingTilesOptions.getClass();
        return new TilesConfig(str2, NavigationTileStoreOwner.INSTANCE.invoke(), null, null, tileEndpointConfiguration, null);
    }

    public final int currentLegIndex() {
        RouteProgress routeProgress = this.tripSession.routeProgress;
        return routeProgress != null ? routeProgress.currentLegProgress.legIndex : this.directionsSession.initialLegIndex;
    }

    public final List getNavigationRoutes() {
        return this.directionsSession.getRoutes();
    }

    public final ArrayList getAlternativeMetadataFor(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NavigationRoute navigationRoute = (NavigationRoute) it.next();
            navigationRoute.getClass();
            MetadataApplierImpl metadataApplierImpl = this.routeAlternativesController;
            metadataApplierImpl.getClass();
            AlternativeRouteMetadata alternativeRouteMetadata = (AlternativeRouteMetadata) ((LinkedHashMap) metadataApplierImpl.MediaMetadataCompat).get(navigationRoute.id);
            if (alternativeRouteMetadata != null) {
                arrayList.add(alternativeRouteMetadata);
            }
        }
        return arrayList;
    }

    public final void registerRoutesObserver(RoutesObserver routesObserver) {
        routesObserver.getClass();
        BuildersKt.RemoteActionCompatParcelizer(this.threadController.getMainScopeAndRootJob().scope, MainDispatcherLoader.read.IconCompatParcelizer(), null, new PerseusLogger$e$1(this, routesObserver, (ShortNewsContentCardView) null, 10), 2);
    }

    public final void startTripSession() {
        MapboxNavigation$startSession$1 mapboxNavigation$startSession$1 = new MapboxNavigation$startSession$1(this, 0);
        boolean z = this.isDestroyed;
        if (!z) {
            mapboxNavigation$startSession$1.invoke();
        } else {
            if (!z) {
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("This instance of MapboxNavigation is destroyed.");
        }
    }

    public final void stopTripSession() {
        MapboxNavigation$startSession$1 mapboxNavigation$startSession$1 = new MapboxNavigation$startSession$1(this, 2);
        boolean z = this.isDestroyed;
        if (!z) {
            mapboxNavigation$startSession$1.invoke();
        } else {
            if (!z) {
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("This instance of MapboxNavigation is destroyed.");
        }
    }

    /* JADX INFO: renamed from: com.mapbox.navigation.core.MapboxNavigation$10, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass10 extends applyUnregisterDisplayedMessageResult {
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(MapboxDirectionsSession mapboxDirectionsSession) {
            super(mapboxDirectionsSession, DirectionsSessionKt.class, "routesPlusIgnored", "getRoutesPlusIgnored(Lcom/mapbox/navigation/core/directions/session/DirectionsSession;)Ljava/util/List;", 1);
            this.$r8$classId = 0;
        }

        @Override // o.registerInAppMessageManagerlambda7
        public final Object get() {
            int i = this.$r8$classId;
            if (i == 0) {
                return DirectionsSessionKt.getRoutesPlusIgnored((MapboxDirectionsSession) this.MediaMetadataCompat);
            }
            if (i == 1) {
                return ((onViewAttachedToWindow) this.MediaMetadataCompat).getValue();
            }
            if (i == 2) {
                return ((onViewAttachedToWindow) this.MediaMetadataCompat).getValue();
            }
            if (i != 3) {
                return i != 4 ? ((onViewAttachedToWindow) this.MediaMetadataCompat).getValue() : ((onViewAttachedToWindow) this.MediaMetadataCompat).getValue();
            }
            return ((onViewAttachedToWindow) this.MediaMetadataCompat).getValue();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass10(int i, int i2, Class cls, Object obj, String str, String str2) {
            super(obj, cls, str, str2, i);
            this.$r8$classId = i2;
        }
    }

    public static final void access$recreateNavigatorInstance(MapboxNavigation mapboxNavigation, boolean z, String str) {
        LoggerProviderKt.logD("recreateNavigatorInstance(). isFallback = " + z + ", tilesVersion = " + str, "MapboxNavigation");
        BuildersKt.RemoteActionCompatParcelizer(mapboxNavigation.mainJobController.scope, null, null, new RoomDatabase.AnonymousClass1(mapboxNavigation, z, str, null, 2), 3);
    }

    public final void internalSetNavigationRoutes(List list, getCutText getcuttext, MapboxNavigation$prepareNavigationForRoutesParsing$2$1$1 mapboxNavigation$prepareNavigationForRoutesParsing$2$1$1) {
        zznc zzncVar;
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
            StringBuilder sb = new StringBuilder("setting routes; reason: ");
            sb.append(FirestoreGrpc.mapToReason(getcuttext));
            sb.append("; IDs: ");
            List list2 = list;
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((NavigationRoute) it.next()).id);
            }
            sb.append(arrayList);
            LoggerProviderKt.logI(sb.toString(), "MapboxNavigation");
        }
        list.getClass();
        MapboxDirectionsSession mapboxDirectionsSession = this.directionsSession;
        mapboxDirectionsSession.getClass();
        Iterator it2 = mapboxDirectionsSession.onSetNavigationRoutesStartedObservers.iterator();
        while (it2.hasNext()) {
            ((MapboxTripSession$$ExternalSyntheticLambda3) it2.next()).f$0.isUpdatingRoute.set(true);
        }
        if ((getcuttext.equals(SetRoutes$CleanUp.INSTANCE) || (getcuttext instanceof SetRoutes$NewRoutes) || (getcuttext instanceof SetRoutes$Reroute) || (getcuttext instanceof SetRoutes$Reorder)) && (zzncVar = this.rerouteController) != null) {
            zzncVar.interrupt();
        }
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(this.threadController.getMainScopeAndRootJob().scope, MainDispatcherLoader.read.IconCompatParcelizer(), null, new MapboxNavigation$internalSetNavigationRoutes$job$1(list, getcuttext, mapboxNavigation$prepareNavigationForRoutesParsing$2$1$1, this, null), 2);
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
            LoggerProviderKt.logI("Coroutine Job created: " + r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer + "; isActive=" + r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer.I_() + "; isCompleted=" + r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer.PlaybackStateCompat() + "; isCancelled=" + r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer.MediaDescriptionCompat(), "MapboxNavigation");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object access$setRoutesToTripSession(MapboxNavigation mapboxNavigation, List list, getCutText getcuttext, ContinuationImpl continuationImpl) {
        MapboxNavigation$setRoutesToTripSession$1 mapboxNavigation$setRoutesToTripSession$1;
        if (continuationImpl instanceof MapboxNavigation$setRoutesToTripSession$1) {
            mapboxNavigation$setRoutesToTripSession$1 = (MapboxNavigation$setRoutesToTripSession$1) continuationImpl;
            int i = mapboxNavigation$setRoutesToTripSession$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mapboxNavigation$setRoutesToTripSession$1.label = i - Integer.MIN_VALUE;
            } else {
                mapboxNavigation$setRoutesToTripSession$1 = new MapboxNavigation$setRoutesToTripSession$1(mapboxNavigation, continuationImpl);
            }
        } else {
            mapboxNavigation$setRoutesToTripSession$1 = new MapboxNavigation$setRoutesToTripSession$1(mapboxNavigation, continuationImpl);
        }
        Object routes = mapboxNavigation$setRoutesToTripSession$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mapboxNavigation$setRoutesToTripSession$1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(routes);
            MapboxTripSession mapboxTripSession = mapboxNavigation.tripSession;
            mapboxNavigation$setRoutesToTripSession$1.L$0 = mapboxNavigation;
            mapboxNavigation$setRoutesToTripSession$1.label = 1;
            routes = mapboxTripSession.setRoutes(list, getcuttext, mapboxNavigation$setRoutesToTripSession$1);
            if (routes == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mapboxNavigation = mapboxNavigation$setRoutesToTripSession$1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(routes);
        }
        getScrollByOffset getscrollbyoffset = (getScrollByOffset) routes;
        if (getscrollbyoffset instanceof NativeSetRouteValue) {
            NativeSetRouteValue nativeSetRouteValue = (NativeSetRouteValue) getscrollbyoffset;
            mapboxNavigation.routeAlternativesController.processAlternativesMetadata(nativeSetRouteValue.routes, nativeSetRouteValue.nativeAlternatives);
        }
        return routes;
    }

    /* JADX WARN: Code duplicated, block: B:192:0x0953  */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda0] */
    public MapboxNavigation(NavigationOptions navigationOptions) throws Throwable {
        TileDataDomain tileDataDomain;
        SettingsProfile settingsProfile;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        NavigatorLoader$HistoryRecorderHandles navigatorLoader$HistoryRecorderHandlesCreateHistoryRecorderHandles;
        m mVar;
        TileDataDomain tileDataDomain2;
        MapboxNativeNavigatorImpl mapboxNativeNavigatorImpl;
        BlockRunner blockRunner;
        BrazeInAppMessageManagerExternalSyntheticLambda2 brazeInAppMessageManagerExternalSyntheticLambda2;
        i$d.a aVar;
        TripNotification tripNotification;
        int i;
        MapboxTripService mapboxTripService;
        DisplayCallbacksImpl displayCallbacksImpl;
        MapboxTripSession mapboxTripSession;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1;
        E$b e$b;
        AnalyticsServiceImpl analyticsServiceImpl;
        MetadataApplierImpl metadataApplierImpl;
        zznc mapboxRerouteController;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2;
        ThreadController threadController = new ThreadController();
        threadController.ioRootJob = UrlUtils.serializer();
        threadController.mainRootJob = UrlUtils.serializer();
        MapboxHistoryRecorder mapboxHistoryRecorder = new MapboxHistoryRecorder(navigationOptions);
        MapboxHistoryRecorder mapboxHistoryRecorder2 = new MapboxHistoryRecorder(navigationOptions);
        MapboxHistoryRecorder mapboxHistoryRecorder3 = new MapboxHistoryRecorder(navigationOptions);
        navigationOptions.applicationContext.getClass();
        x xVar = new x(16);
        Time$SystemClockImpl time$SystemClockImpl = Time$SystemClockImpl.INSTANCE;
        this.navigationOptions = navigationOptions;
        this.threadController = threadController;
        this.historyRecorder = mapboxHistoryRecorder;
        this.copilotHistoryRecorder = mapboxHistoryRecorder2;
        this.compositeRecorder = mapboxHistoryRecorder3;
        this.lowMemoryManager = xVar;
        this.mainJobController = threadController.getMainScopeAndRootJob();
        ShortNewsContentCardView shortNewsContentCardView = null;
        this.connectivityHandler = new ConnectivityHandler(SQLite.IconCompatParcelizer(-1, 6, (IInAppMessageViewWrapper) null));
        this.tripNotificationInterceptorOwner = new getCopyText();
        new TrafficOverrideHandler(navigationOptions.trafficOverrideOptions);
        RoutesCacheClearer routesCacheClearer = new RoutesCacheClearer();
        routesCacheClearer.currentActiveRoutes = instance_delegatelambda0.write;
        this.routesCacheClearer = routesCacheClearer;
        navigationOptions.eHorizonOptions.getClass();
        navigationOptions.eHorizonOptions.getClass();
        navigationOptions.eHorizonOptions.getClass();
        navigationOptions.eHorizonOptions.getClass();
        AlertServiceOptions alertServiceOptions = navigationOptions.eHorizonOptions.alertServiceOptions;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        AlertsServiceOptions alertsServiceOptions = new AlertsServiceOptions(bool, bool, bool2, bool2, bool2);
        navigationOptions.eHorizonOptions.getClass();
        ElectronicHorizonOptions electronicHorizonOptions = new ElectronicHorizonOptions(500.0d, (byte) 0, 50.0d, true, null, alertsServiceOptions, false);
        this.routesPreviewController = new DropShadowEffect(new g0(0), threadController.getMainScopeAndRootJob().scope);
        this.routeUpdateMutex = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
        this.routesProgressDataProvider = new RoutesProgressDataProvider();
        int i2 = 4;
        this.evDynamicDataHolder = new Parser.Pair(4);
        navigationOptions.incidentsOptions.getClass();
        PollingConfig pollingConfig = new PollingConfig(Double.valueOf(navigationOptions.navigatorPredictionMillis / 1000.0d), Double.valueOf(2.0d), Double.valueOf(1.0d));
        navigationOptions.rerouteOptions.getClass();
        RerouteStrategyForMatchRoute rerouteStrategyForMatchRoute = RerouteStrategyForMatchRoute.REROUTE_DISABLED;
        RoadObjectMatcherOptions roadObjectMatcherOptions = navigationOptions.roadObjectMatcherOptions;
        roadObjectMatcherOptions.getClass();
        int i3 = NavigatorLoader$WhenMappings.$EnumSwitchMapping$0[roadObjectMatcherOptions.matchingGraphType.ordinal()];
        if (i3 == 1) {
            tileDataDomain = TileDataDomain.NAVIGATION;
        } else if (i3 == 2) {
            tileDataDomain = TileDataDomain.NAVIGATION_HD;
        } else if (i3 == 3) {
            tileDataDomain = TileDataDomain.MAPS;
        } else if (i3 == 4) {
            tileDataDomain = TileDataDomain.SEARCH;
        } else if (i3 == 5) {
            tileDataDomain = TileDataDomain.ADAS;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            throw null;
        }
        NavigatorConfig navigatorConfig = new NavigatorConfig(null, electronicHorizonOptions, pollingConfig, null, null, bool2, rerouteStrategyForMatchRoute, new RoadObjectsMatcherOptions(null, tileDataDomain));
        this.lowMemoryObserver = new LowMemoryManager$Observer() { // from class: com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda0
            @Override // com.mapbox.navigation.core.internal.LowMemoryManager$Observer
            public final void onLowMemory() {
                DecodeUtils$stepsGeometryDecodeCache$1 decodeUtils$stepsGeometryDecodeCache$1 = DecodeUtils.completeGeometryDecodeCache;
                DecodeUtilsExKt.clearCache();
            }
        };
        this.navigationVersionSwitchObservers = new LinkedHashSet();
        this.historyRecorders = SQLite.read(mapboxHistoryRecorder, mapboxHistoryRecorder2);
        Context context = navigationOptions.applicationContext;
        context.getClass();
        this.appLifecycleMonitor = new ApplicationLifecycleMonitor((Application) context);
        PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
        if (!PerformanceTracker.getTrackingIsActive()) {
            BaseMapboxInitializer.Companion.init(MapboxNavigationSDKInitializerImpl.class);
        } else {
            PerformanceTracker.syncSectionStarted("MapboxNavigation#init-MapboxNavigationSDKInitializerImpl");
            try {
                long jWrite = BrazeInAppMessageManagerWhenMappings.write();
                BaseMapboxInitializer.Companion.init(MapboxNavigationSDKInitializerImpl.class);
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigation#init-MapboxNavigationSDKInitializerImpl", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite)));
            } catch (Throwable th) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigation#init-MapboxNavigationSDKInitializerImpl", null);
                throw th;
            }
        }
        if (!hasInstance) {
            hasInstance = true;
            DeviceProfile deviceProfile = navigationOptions.deviceProfile;
            deviceProfile.getClass();
            int i4 = NavigatorLoader$WhenMappings.$EnumSwitchMapping$1[deviceProfile.deviceType.ordinal()];
            if (i4 == 1) {
                settingsProfile = new SettingsProfile(ProfileApplication.MOBILE, ProfilePlatform.ANDROID);
            } else if (i4 == 2) {
                settingsProfile = new SettingsProfile(ProfileApplication.AUTO, ProfilePlatform.ANDROID);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                throw null;
            }
            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) "")) {
                try {
                    jSONObject = new JSONObject("");
                } catch (JSONException e) {
                    LoggerProviderKt.logE("Custom config is not valid: " + e + ", ", null);
                    jSONObject = new JSONObject();
                }
            } else {
                jSONObject = new JSONObject();
            }
            if (jSONObject.has(FWFHelper.ENDPOINT_FEATURES)) {
                jSONObject2 = jSONObject.getJSONObject(FWFHelper.ENDPOINT_FEATURES);
                jSONObject2.getClass();
            } else {
                jSONObject2 = new JSONObject();
                jSONObject.put(FWFHelper.ENDPOINT_FEATURES, jSONObject2);
            }
            jSONObject2.put("useTelemetryNavigationEvents", true);
            String string = jSONObject.toString();
            string.getClass();
            ConfigHandle configHandleBuild = ConfigFactory.build(settingsProfile, navigatorConfig, string);
            configHandleBuild.getClass();
            NavigationTileStoreOwner navigationTileStoreOwner = NavigationTileStoreOwner.INSTANCE;
            this.navigationOptions.routingTilesOptions.getClass();
            synchronized (navigationTileStoreOwner) {
                LoggerProviderKt.logD("NavigationTileStore", "No initial TileStore set. Creating default. Accessing too early?");
                TileStore tileStoreCreate = TileStore.create();
                tileStoreCreate.getClass();
                NavigationTileStoreOwner.value = tileStoreCreate;
            }
            this.navigationOptions.routingTilesOptions.getClass();
            TilesConfig tilesConfigCreateTilesConfig = createTilesConfig("", false);
            MapboxHistoryRecorder mapboxHistoryRecorder4 = this.copilotHistoryRecorder;
            MapboxHistoryRecorder mapboxHistoryRecorder5 = this.historyRecorder;
            PerformanceTracker performanceTracker2 = PerformanceTracker.INSTANCE;
            if (!PerformanceTracker.getTrackingIsActive()) {
                String strFileDirectory = mapboxHistoryRecorder5.fileDirectory();
                NavContext navContext = mapboxHistoryRecorder4.historyFiles;
                navContext.getClass();
                String absolutePath = new File(navContext.IconCompatParcelizer.getFilesDir(), "mbx_nav/copilot/history").getAbsolutePath();
                absolutePath.getClass();
                String strAbsolutePath = NavContext.absolutePath(absolutePath);
                int i5 = SdkInfoProvider$WhenMappings.$EnumSwitchMapping$0[SdkVariantKt.sdkVariant.ordinal()];
                if (i5 == 1) {
                    onviewattachedtowindowlambda2 = new onViewAttachedToWindowlambda0("mapbox-navigationCore-android", "com.mapbox.navigationCore");
                } else if (i5 == 2) {
                    onviewattachedtowindowlambda2 = new onViewAttachedToWindowlambda0("mapbox-navigationUX-android", "com.mapbox.navigationUX");
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    throw null;
                }
                navigatorLoader$HistoryRecorderHandlesCreateHistoryRecorderHandles = zzon.createHistoryRecorderHandles(configHandleBuild, strFileDirectory, strAbsolutePath, new SdkInformation((String) onviewattachedtowindowlambda2.serializer, "3.25.1", (String) onviewattachedtowindowlambda2.write));
            } else {
                PerformanceTracker.syncSectionStarted("createHistoryRecorderHandles");
                try {
                    long jWrite2 = BrazeInAppMessageManagerWhenMappings.write();
                    String strFileDirectory2 = mapboxHistoryRecorder5.fileDirectory();
                    NavContext navContext2 = mapboxHistoryRecorder4.historyFiles;
                    navContext2.getClass();
                    String absolutePath2 = new File(navContext2.IconCompatParcelizer.getFilesDir(), "mbx_nav/copilot/history").getAbsolutePath();
                    absolutePath2.getClass();
                    String strAbsolutePath2 = NavContext.absolutePath(absolutePath2);
                    int i6 = SdkInfoProvider$WhenMappings.$EnumSwitchMapping$0[SdkVariantKt.sdkVariant.ordinal()];
                    if (i6 == 1) {
                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("mapbox-navigationCore-android", "com.mapbox.navigationCore");
                    } else if (i6 == 2) {
                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("mapbox-navigationUX-android", "com.mapbox.navigationUX");
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    navigatorLoader$HistoryRecorderHandlesCreateHistoryRecorderHandles = zzon.createHistoryRecorderHandles(configHandleBuild, strFileDirectory2, strAbsolutePath2, new SdkInformation((String) onviewattachedtowindowlambda0.serializer, "3.25.1", (String) onviewattachedtowindowlambda0.write));
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("createHistoryRecorderHandles", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite2)));
                } catch (Throwable th2) {
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("createHistoryRecorderHandles", null);
                    throw th2;
                }
            }
            HistoryRecorderHandle historyRecorderHandle = navigatorLoader$HistoryRecorderHandlesCreateHistoryRecorderHandles.composite;
            if (!PerformanceTracker.getTrackingIsActive()) {
                this.navigationOptions.routingTilesOptions.getClass();
            } else {
                PerformanceTracker.syncSectionStarted("MapboxNavigation#init-createOfflineCacheHandle");
                try {
                    long jWrite3 = BrazeInAppMessageManagerWhenMappings.write();
                    this.navigationOptions.routingTilesOptions.getClass();
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigation#init-createOfflineCacheHandle", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite3)));
                } catch (Throwable th3) {
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigation#init-createOfflineCacheHandle", null);
                    throw th3;
                }
            }
            Context context2 = this.navigationOptions.applicationContext;
            ApplicationLifecycleMonitor applicationLifecycleMonitor = this.appLifecycleMonitor;
            context2.getClass();
            applicationLifecycleMonitor.getClass();
            if (!PerformanceTracker.getTrackingIsActive()) {
                Context applicationContext = context2.getApplicationContext();
                applicationContext.getClass();
                mVar = new m(applicationContext, applicationLifecycleMonitor);
            } else {
                PerformanceTracker.syncSectionStarted("createEventsMetadataInterface");
                try {
                    long jWrite4 = BrazeInAppMessageManagerWhenMappings.write();
                    Context applicationContext2 = context2.getApplicationContext();
                    applicationContext2.getClass();
                    mVar = new m(applicationContext2, applicationLifecycleMonitor);
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("createEventsMetadataInterface", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite4)));
                } catch (Throwable th4) {
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("createEventsMetadataInterface", null);
                    throw th4;
                }
            }
            m mVar2 = mVar;
            RoadObjectMatcherOptions roadObjectMatcherOptions2 = this.navigationOptions.roadObjectMatcherOptions;
            roadObjectMatcherOptions2.getClass();
            int i7 = NavigatorLoader$WhenMappings.$EnumSwitchMapping$0[roadObjectMatcherOptions2.matchingGraphType.ordinal()];
            if (i7 == 1) {
                tileDataDomain2 = TileDataDomain.NAVIGATION;
            } else if (i7 == 2) {
                tileDataDomain2 = TileDataDomain.NAVIGATION_HD;
            } else if (i7 == 3) {
                tileDataDomain2 = TileDataDomain.MAPS;
            } else if (i7 == 4) {
                tileDataDomain2 = TileDataDomain.SEARCH;
            } else if (i7 == 5) {
                tileDataDomain2 = TileDataDomain.ADAS;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                throw null;
            }
            RoadObjectMatcherConfig roadObjectMatcherConfig = new RoadObjectMatcherConfig(null, tileDataDomain2);
            if (!PerformanceTracker.getTrackingIsActive()) {
                mapboxNativeNavigatorImpl = new MapboxNativeNavigatorImpl(tilesConfigCreateTilesConfig, historyRecorderHandle, roadObjectMatcherConfig, configHandleBuild, mVar2);
            } else {
                PerformanceTracker.syncSectionStarted("createNativeNavigator");
                try {
                    long jWrite5 = BrazeInAppMessageManagerWhenMappings.write();
                    mapboxNativeNavigatorImpl = new MapboxNativeNavigatorImpl(tilesConfigCreateTilesConfig, historyRecorderHandle, roadObjectMatcherConfig, configHandleBuild, mVar2);
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("createNativeNavigator", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite5)));
                } catch (Throwable th5) {
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("createNativeNavigator", null);
                    throw th5;
                }
            }
            this._navigator = mapboxNativeNavigatorImpl;
            createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
            createinappmessageeventsubscriber.IconCompatParcelizer = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(1) { // from class: com.mapbox.navigation.core.MapboxNavigation$routeLookup$1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj) {
                    ((String) obj).getClass();
                    return null;
                }
            };
            this.navigationOptions.getClass();
            MapboxHistoryRecorderWrapper mapboxHistoryRecorderWrapper = new MapboxHistoryRecorderWrapper(this.compositeRecorder, 1);
            DefaultScheduler defaultScheduler = ThreadController.DefaultDispatcher;
            int i8 = 0;
            MapboxNavigation$parsing$1 mapboxNavigation$parsing$1 = new MapboxNavigation$parsing$1(createinappmessageeventsubscriber, i8);
            MapboxNavigation$parsing$2 mapboxNavigation$parsing$2 = new MapboxNavigation$parsing$2(this, shortNewsContentCardView, i8);
            getClearTextSubstitution getcleartextsubstitution = SDKRouteParser$Companion.f6default;
            Time$SystemClockImpl time$SystemClockImpl2 = LoggerProvider.frontend;
            defaultScheduler.getClass();
            p0 p0Var = new p0(time$SystemClockImpl2);
            OptimisedForJavaMemoryRoutesParsingQueue optimisedForJavaMemoryRoutesParsingQueue = new OptimisedForJavaMemoryRoutesParsingQueue(mapboxNavigation$parsing$2);
            ParsingEntryPoint parsingEntryPoint = new ParsingEntryPoint(new NnAndModelsParallelNavigationRoutesParser(mapboxHistoryRecorderWrapper, defaultScheduler, time$SystemClockImpl, p0Var, getcleartextsubstitution, optimisedForJavaMemoryRoutesParsingQueue, time$SystemClockImpl2), new TransitionValuesMaps(mapboxNavigation$parsing$1, defaultScheduler, time$SystemClockImpl, p0Var, optimisedForJavaMemoryRoutesParsingQueue), new IsFixableByRetry(i2));
            if (!PerformanceTracker.getTrackingIsActive()) {
                blockRunner = new BlockRunner(getNavigator().getRouter(), this.threadController, parsingEntryPoint, parsingEntryPoint);
            } else {
                PerformanceTracker.syncSectionStarted("MapboxNavigation#init-RouterWrapper");
                try {
                    long jWrite6 = BrazeInAppMessageManagerWhenMappings.write();
                    blockRunner = new BlockRunner(getNavigator().getRouter(), this.threadController, parsingEntryPoint, parsingEntryPoint);
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigation#init-RouterWrapper", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite6)));
                } catch (Throwable th6) {
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigation#init-RouterWrapper", null);
                    throw th6;
                }
            }
            this.routerWrapper = blockRunner;
            int i9 = 29;
            if (!PerformanceTracker.getTrackingIsActive()) {
                Experimental experimental = getNavigator().experimental;
                if (experimental != null) {
                    aVar = new i$d.a(i9, false);
                    aVar.read = experimental;
                } else {
                    removeNodeAtDepth.serializer("experimental");
                    throw null;
                }
            } else {
                PerformanceTracker.syncSectionStarted("MapboxNavigation#init-etcGateAPI");
                try {
                    long jWrite7 = BrazeInAppMessageManagerWhenMappings.write();
                    Experimental experimental2 = getNavigator().experimental;
                    if (experimental2 != null) {
                        i$d.a aVar2 = new i$d.a(i9, false);
                        aVar2.read = experimental2;
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigation#init-etcGateAPI", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite7)));
                        aVar = aVar2;
                    } else {
                        brazeInAppMessageManagerExternalSyntheticLambda2 = null;
                        try {
                            removeNodeAtDepth.serializer("experimental");
                            throw null;
                        } catch (Throwable th7) {
                            th = th7;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    brazeInAppMessageManagerExternalSyntheticLambda2 = null;
                }
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigation#init-etcGateAPI", brazeInAppMessageManagerExternalSyntheticLambda2);
                throw th;
            }
            this.etcGateAPI = aVar;
            this.historyRecorder.historyRecorderHandle = navigatorLoader$HistoryRecorderHandlesCreateHistoryRecorderHandles.general;
            this.copilotHistoryRecorder.historyRecorderHandle = navigatorLoader$HistoryRecorderHandlesCreateHistoryRecorderHandles.copilot;
            this.compositeRecorder.historyRecorderHandle = navigatorLoader$HistoryRecorderHandlesCreateHistoryRecorderHandles.composite;
            NavigationSession navigationSession = new NavigationSession();
            this.navigationSession = navigationSession;
            HistoryRecordingStateHandler historyRecordingStateHandler = new HistoryRecordingStateHandler();
            this.historyRecordingStateHandler = historyRecordingStateHandler;
            DeveloperMetadataAggregator developerMetadataAggregator = new DeveloperMetadataAggregator(historyRecordingStateHandler.currentState.getSessionId());
            historyRecordingStateHandler.copilotSessionObservers.add(developerMetadataAggregator);
            developerMetadataAggregator.onCopilotSessionChanged(historyRecordingStateHandler.currentState);
            this.developerMetadataAggregator = developerMetadataAggregator;
            if (!PerformanceTracker.getTrackingIsActive()) {
                this.navigationOptions.getClass();
                tripNotification = (TripNotification) MapboxModuleProvider.INSTANCE.createModule(MapboxModuleType.NavigationTripNotification, new MapboxNavigation$notification$1$1(this, 0, new AnalyticsServiceImpl(this.navigationOptions.distanceFormatterOptions, 4)));
            } else {
                PerformanceTracker.syncSectionStarted("MapboxNavigation#init-notification");
                try {
                    long jWrite8 = BrazeInAppMessageManagerWhenMappings.write();
                    this.navigationOptions.getClass();
                    TripNotification tripNotification2 = (TripNotification) MapboxModuleProvider.INSTANCE.createModule(MapboxModuleType.NavigationTripNotification, new MapboxNavigation$notification$1$1(this, 0, new AnalyticsServiceImpl(this.navigationOptions.distanceFormatterOptions, 4)));
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigation#init-notification", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite8)));
                    tripNotification = tripNotification2;
                } catch (Throwable th9) {
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigation#init-notification", null);
                    throw th9;
                }
            }
            if (tripNotification.getClass().getName().equals("com.mapbox.navigation.trip.notification.internal.MapboxTripNotification")) {
                Field declaredField = tripNotification.getClass().getDeclaredField("notificationActionButtonChannel");
                i = 1;
                declaredField.setAccessible(true);
                this.notificationChannelField = declaredField;
            } else {
                i = 1;
            }
            Context context3 = this.navigationOptions.applicationContext;
            ThreadController threadController2 = this.threadController;
            context3.getClass();
            threadController2.getClass();
            if (!PerformanceTracker.getTrackingIsActive()) {
                mapboxTripService = new MapboxTripService(context3, tripNotification, threadController2);
            } else {
                PerformanceTracker.syncSectionStarted("createTripService");
                try {
                    long jWrite9 = BrazeInAppMessageManagerWhenMappings.write();
                    mapboxTripService = new MapboxTripService(context3, tripNotification, threadController2);
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("createTripService", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite9)));
                } catch (Throwable th10) {
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("createTripService", null);
                    throw th10;
                }
            }
            MapboxTripService mapboxTripService2 = mapboxTripService;
            LocationOptions locationOptions = this.navigationOptions.locationOptions;
            locationOptions.getClass();
            if (!PerformanceTracker.getTrackingIsActive()) {
                displayCallbacksImpl = new DisplayCallbacksImpl(locationOptions);
            } else {
                PerformanceTracker.syncSectionStarted("createTripSessionLocationEngine");
                try {
                    long jWrite10 = BrazeInAppMessageManagerWhenMappings.write();
                    DisplayCallbacksImpl displayCallbacksImpl2 = new DisplayCallbacksImpl(locationOptions);
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("createTripSessionLocationEngine", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite10)));
                    displayCallbacksImpl = displayCallbacksImpl2;
                } catch (Throwable th11) {
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("createTripSessionLocationEngine", null);
                    throw th11;
                }
            }
            this.tripSessionLocationEngine = displayCallbacksImpl;
            MapboxDirectionsSession mapboxDirectionsSession = new MapboxDirectionsSession(blockRunner);
            this.directionsSession = mapboxDirectionsSession;
            mapboxDirectionsSession.onSetNavigationRoutesFinishedObservers.add(navigationSession);
            RoutesUpdatedResult routesUpdatedResult = mapboxDirectionsSession.routesUpdatedResult;
            if (routesUpdatedResult != null) {
                navigationSession.onRoutesChanged(routesUpdatedResult);
            }
            MapboxNativeNavigatorImpl navigator = getNavigator();
            ThreadController threadController3 = this.threadController;
            this.navigationOptions.rerouteOptions.getClass();
            threadController3.getClass();
            if (!PerformanceTracker.getTrackingIsActive()) {
                mapboxTripSession = new MapboxTripSession(mapboxTripService2, mapboxDirectionsSession, displayCallbacksImpl, navigator, threadController3, new DropShadowEffect(navigator, threadController3), -1);
            } else {
                PerformanceTracker.syncSectionStarted("createTripSession");
                try {
                    long jWrite11 = BrazeInAppMessageManagerWhenMappings.write();
                    mapboxTripSession = new MapboxTripSession(mapboxTripService2, mapboxDirectionsSession, displayCallbacksImpl, navigator, threadController3, new DropShadowEffect(navigator, threadController3), -1);
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("createTripSession", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite11)));
                } catch (Throwable th12) {
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("createTripSession", null);
                    throw th12;
                }
            }
            MapboxTripSession mapboxTripSession2 = mapboxTripSession;
            this.tripSession = mapboxTripSession2;
            mapboxTripSession2.registerRouteProgressObserver(this.routesProgressDataProvider);
            mapboxTripSession2.stateObservers.add(navigationSession);
            navigationSession.onSessionStateChanged(mapboxTripSession2.state);
            mapboxTripSession2.stateObservers.add(historyRecordingStateHandler);
            historyRecordingStateHandler.onSessionStateChanged(mapboxTripSession2.state);
            if (this.reachabilityObserverId == null) {
                ReachabilityInterface reachabilityInterface = ReachabilityService.reachabilityInterface;
                ConnectivityHandler connectivityHandler = this.connectivityHandler;
                connectivityHandler.getClass();
                this.reachabilityObserverId = Long.valueOf(ReachabilityService.reachabilityInterface.addListener(connectivityHandler));
            }
            createinappmessageeventsubscriber.IconCompatParcelizer = new NetworkFetcher.AnonymousClass2(1, mapboxDirectionsSession, DirectionsSessionKt.class, "findRoute", "findRoute(Lcom/mapbox/navigation/core/directions/session/DirectionsSession;Ljava/lang/String;)Lcom/mapbox/navigation/base/route/NavigationRoute;", 1, 8);
            this.navigationOptions.trafficOverrideOptions.getClass();
            ArrivalProgressObserver arrivalProgressObserver = new ArrivalProgressObserver(mapboxTripSession2);
            this.arrivalProgressObserver = arrivalProgressObserver;
            mapboxTripSession2.registerRouteProgressObserver(arrivalProgressObserver);
            n0 n0Var = new n0(0);
            int i10 = SdkInfoProvider$WhenMappings.$EnumSwitchMapping$0[SdkVariantKt.sdkVariant.ordinal()];
            if (i10 == i) {
                onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0("mapbox-navigationCore-android", "com.mapbox.navigationCore");
            } else if (i10 == 2) {
                onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0("mapbox-navigationUX-android", "com.mapbox.navigationUX");
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                throw null;
            }
            SdkInformation sdkInformation = new SdkInformation((String) onviewattachedtowindowlambda1.serializer, "3.25.1", (String) onviewattachedtowindowlambda1.write);
            if (!PerformanceTracker.getTrackingIsActive()) {
                e$b = new E$b(navigationSession, arrivalProgressObserver, mapboxTripSession2, n0Var, sdkInformation);
            } else {
                PerformanceTracker.syncSectionStarted("createBillingController");
                try {
                    long jWrite12 = BrazeInAppMessageManagerWhenMappings.write();
                    E$b e$b2 = new E$b(navigationSession, arrivalProgressObserver, mapboxTripSession2, n0Var, sdkInformation);
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("createBillingController", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite12)));
                    e$b = e$b2;
                } catch (Throwable th13) {
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("createBillingController", null);
                    throw th13;
                }
            }
            this.billingController = e$b;
            MapboxNativeNavigatorImpl navigator2 = getNavigator();
            if (!PerformanceTracker.getTrackingIsActive()) {
                analyticsServiceImpl = new AnalyticsServiceImpl(mapboxTripSession2, navigator2);
            } else {
                PerformanceTracker.syncSectionStarted("NavigationTelemetry#create");
                try {
                    long jWrite13 = BrazeInAppMessageManagerWhenMappings.write();
                    AnalyticsServiceImpl analyticsServiceImpl2 = new AnalyticsServiceImpl(mapboxTripSession2, navigator2);
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("NavigationTelemetry#create", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite13)));
                    analyticsServiceImpl = analyticsServiceImpl2;
                } catch (Throwable th14) {
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("NavigationTelemetry#create", null);
                    throw th14;
                }
            }
            this.navigationTelemetry = analyticsServiceImpl;
            n0 n0Var2 = new n0(0);
            RouteAlternativesOptions routeAlternativesOptions = this.navigationOptions.routeAlternativesOptions;
            MapboxNativeNavigatorImpl navigator3 = getNavigator();
            ThreadController threadController4 = this.threadController;
            routeAlternativesOptions.getClass();
            threadController4.getClass();
            if (!PerformanceTracker.getTrackingIsActive()) {
                metadataApplierImpl = new MetadataApplierImpl(routeAlternativesOptions, navigator3, mapboxTripSession2, threadController4, parsingEntryPoint);
            } else {
                PerformanceTracker.syncSectionStarted("RouteAlternativesControllerProvider#create");
                try {
                    long jWrite14 = BrazeInAppMessageManagerWhenMappings.write();
                    metadataApplierImpl = new MetadataApplierImpl(routeAlternativesOptions, navigator3, mapboxTripSession2, threadController4, parsingEntryPoint);
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("RouteAlternativesControllerProvider#create", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite14)));
                } catch (Throwable th15) {
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("RouteAlternativesControllerProvider#create", null);
                    throw th15;
                }
            }
            this.routeAlternativesController = metadataApplierImpl;
            metadataApplierImpl.updateNativeObserver(new LayerUtils$getLayer$source$2(metadataApplierImpl, 10, new NetworkFetcher.AnonymousClass2(1, this, MapboxNavigation.class, "updateRoutes", "updateRoutes(Lcom/mapbox/navigation/core/routealternatives/UpdateRouteSuggestion;)V", 0, 9)));
            MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.read;
            MainCoroutineDispatcher mainCoroutineDispatcherIconCompatParcelizer = mainCoroutineDispatcher.IconCompatParcelizer();
            RouteRefreshOptions routeRefreshOptions = this.navigationOptions.routeRefreshOptions;
            RoutesProgressDataProvider routesProgressDataProvider = this.routesProgressDataProvider;
            Parser.Pair pair = this.evDynamicDataHolder;
            MapboxHistoryRecorderWrapper mapboxHistoryRecorderWrapper2 = new MapboxHistoryRecorderWrapper(this.compositeRecorder, 0);
            mainCoroutineDispatcherIconCompatParcelizer.getClass();
            routeRefreshOptions.getClass();
            routesProgressDataProvider.getClass();
            pair.getClass();
            RouteRefresher routeRefresher = new RouteRefresher(new AnalyticsServiceImpl(routesProgressDataProvider), new AnalyticsServiceImpl(pair), new p0(0), mapboxDirectionsSession);
            onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
            ContextScope contextScopeRemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(Room.read(new onBackInvokedlambda0(onbackinvokedlambda0Serializer), mainCoroutineDispatcher));
            N$b n$b = new N$b();
            n$b.read = routeRefresher;
            n$b.write = contextScopeRemoteActionCompatParcelizer;
            x xVar2 = new x(mapboxHistoryRecorderWrapper2);
            Vw$Vw vw$Vw = new Vw$Vw((byte) 0, 11);
            FocusMeteringAction focusMeteringAction = new FocusMeteringAction(xVar2, vw$Vw, new IsFixableByRetry(7));
            Parser.Pair pair2 = new Parser.Pair(vw$Vw);
            p0 p0Var2 = new p0(0);
            SearchOptionsKt$validateLimit$1 searchOptionsKt$validateLimit$1 = new SearchOptionsKt$validateLimit$1(13, mapboxDirectionsSession);
            ContextScope contextScopeRemoteActionCompatParcelizer2 = YieldKt.RemoteActionCompatParcelizer(Room.read(new onBackInvokedlambda0(onbackinvokedlambda0Serializer), mainCoroutineDispatcherIconCompatParcelizer));
            routeRefreshOptions.getClass();
            Delayer delayer = new Delayer(0);
            delayer.delayRemaining = 300000L;
            getUseEvaluationsCachefwf_client_release getuseevaluationscachefwf_client_release = new getUseEvaluationsCachefwf_client_release(5);
            I$b i$b = new I$b(0);
            i$b.IconCompatParcelizer = n$b;
            i$b.read = delayer;
            i$b.serializer = xVar2;
            i$b.write = focusMeteringAction;
            i$b.RemoteActionCompatParcelizer = pair2;
            i$b.MediaDescriptionCompat = contextScopeRemoteActionCompatParcelizer2;
            i$b.RatingCompat = getuseevaluationscachefwf_client_release;
            i$b.MediaMetadataCompat = p0Var2;
            i$b.MediaBrowserCompatMediaItem = searchOptionsKt$validateLimit$1;
            i$b.MediaSessionCompatResultReceiverWrapper = mapboxHistoryRecorderWrapper2;
            i$b.PlaybackStateCompat = CryptoObjectUtils.newChildScope(contextScopeRemoteActionCompatParcelizer2);
            E$b e$b3 = new E$b(onbackinvokedlambda0Serializer, i$b, new AnalyticsServiceImpl(n$b, xVar2, YieldKt.RemoteActionCompatParcelizer(Room.read(new onBackInvokedlambda0(onbackinvokedlambda0Serializer), mainCoroutineDispatcher)), focusMeteringAction, pair2, p0Var2, searchOptionsKt$validateLimit$1), xVar2, vw$Vw, focusMeteringAction, mapboxHistoryRecorderWrapper2, 1);
            this.routeRefreshController = e$b3;
            ((CopyOnWriteArraySet) vw$Vw.serializer).add(new MapboxNavigation$$ExternalSyntheticLambda1(this));
            MapboxNativeNavigatorImpl navigator4 = getNavigator();
            if (!navigator4.warnIfShutdown("nativeRerouteEnabled")) {
                if ((navigator4.warnIfShutdown("getRerouteDetector") ? null : navigator4.getNavigator().getRerouteDetector()) != null) {
                    if ((navigator4.warnIfShutdown("getRerouteController") ? null : navigator4.getNavigator().getRerouteController()) != null) {
                        mapboxRerouteController = new NativeMapboxRerouteController(getNavigator(), new AnonymousClass10(mapboxDirectionsSession), new AnonymousClass11(0, this), this.mainJobController.scope, parsingEntryPoint);
                    } else {
                        RerouteOptions rerouteOptions = this.navigationOptions.rerouteOptions;
                        ThreadController threadController5 = this.threadController;
                        Parser.Pair pair3 = this.evDynamicDataHolder;
                        rerouteOptions.getClass();
                        threadController5.getClass();
                        pair3.getClass();
                        mapboxRerouteController = new MapboxRerouteController(mapboxDirectionsSession, mapboxTripSession2, n0Var2, rerouteOptions, threadController5, pair3);
                    }
                } else {
                    RerouteOptions rerouteOptions2 = this.navigationOptions.rerouteOptions;
                    ThreadController threadController6 = this.threadController;
                    Parser.Pair pair4 = this.evDynamicDataHolder;
                    rerouteOptions2.getClass();
                    threadController6.getClass();
                    pair4.getClass();
                    mapboxRerouteController = new MapboxRerouteController(mapboxDirectionsSession, mapboxTripSession2, n0Var2, rerouteOptions2, threadController6, pair4);
                }
            } else {
                RerouteOptions rerouteOptions3 = this.navigationOptions.rerouteOptions;
                ThreadController threadController7 = this.threadController;
                Parser.Pair pair5 = this.evDynamicDataHolder;
                rerouteOptions3.getClass();
                threadController7.getClass();
                pair5.getClass();
                mapboxRerouteController = new MapboxRerouteController(mapboxDirectionsSession, mapboxTripSession2, n0Var2, rerouteOptions3, threadController7, pair5);
            }
            this.rerouteController = mapboxRerouteController;
            int i11 = 0;
            RoutesObserver mapboxNavigation$$ExternalSyntheticLambda3 = new MapboxNavigation$$ExternalSyntheticLambda3(i11, this);
            MapboxNavigation$$ExternalSyntheticLambda2 mapboxNavigation$$ExternalSyntheticLambda2 = new MapboxNavigation$$ExternalSyntheticLambda2(this);
            MapboxNavigation$createInternalFallbackVersionsObserver$1 mapboxNavigation$createInternalFallbackVersionsObserver$1 = new MapboxNavigation$createInternalFallbackVersionsObserver$1(i11, this);
            CopyOnWriteArraySet copyOnWriteArraySet = mapboxTripSession2.fallbackVersionsObservers;
            if (copyOnWriteArraySet.isEmpty()) {
                MapboxNativeNavigatorImpl mapboxNativeNavigatorImpl2 = mapboxTripSession2.navigator;
                MapboxNavigation$createInternalFallbackVersionsObserver$1 mapboxNavigation$createInternalFallbackVersionsObserver$2 = mapboxTripSession2.nativeFallbackVersionsObserver;
                if (!mapboxNativeNavigatorImpl2.warnIfShutdown("setFallbackVersionsObserver")) {
                    mapboxNativeNavigatorImpl2.getNavigator().setFallbackVersionsObserver(mapboxNavigation$createInternalFallbackVersionsObserver$2);
                }
            }
            copyOnWriteArraySet.add(mapboxNavigation$createInternalFallbackVersionsObserver$1);
            mapboxTripSession2.offRouteObserverForReroute = mapboxNavigation$$ExternalSyntheticLambda2;
            mapboxTripSession2.rerouteInvocationHandler = new MapboxTripSession.RerouteInvocationHandler(mapboxTripSession2, mapboxRerouteController, mapboxTripSession2.repeatRerouteAfterOffRouteDelaySeconds);
            registerRoutesObserver(mapboxNavigation$$ExternalSyntheticLambda3);
            registerRoutesObserver(new AnonymousClass13(e$b3));
            RoutesCacheClearer routesCacheClearer2 = this.routesCacheClearer;
            registerRoutesObserver(routesCacheClearer2);
            routesCacheClearer2.getClass();
            DropShadowEffect dropShadowEffect = this.routesPreviewController;
            dropShadowEffect.getClass();
            ((CopyOnWriteArrayList) dropShadowEffect.MediaDescriptionCompat).add(routesCacheClearer2);
            RoutesPreviewUpdate routesPreviewUpdate = (RoutesPreviewUpdate) dropShadowEffect.serializer;
            if (routesPreviewUpdate != null) {
                routesCacheClearer2.routesPreviewUpdated(routesPreviewUpdate);
            }
            getNavigator();
            getNavigator();
            if (!PerformanceTracker.getTrackingIsActive()) {
                RoutingTilesOptions routingTilesOptions = this.navigationOptions.routingTilesOptions;
                if (getNavigator().cache != null) {
                    routingTilesOptions.getClass();
                } else {
                    removeNodeAtDepth.serializer("cache");
                    throw null;
                }
            } else {
                PerformanceTracker.syncSectionStarted("MapboxNavigation#init-tilesetDescriptorFactory");
                try {
                    long jWrite15 = BrazeInAppMessageManagerWhenMappings.write();
                    RoutingTilesOptions routingTilesOptions2 = this.navigationOptions.routingTilesOptions;
                    if (getNavigator().cache != null) {
                        routingTilesOptions2.getClass();
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigation#init-tilesetDescriptorFactory", BrazeInAppMessageManagerExternalSyntheticLambda2.IconCompatParcelizer(DefaultInAppMessageViewWrapper.serializer(jWrite15)));
                    } else {
                        removeNodeAtDepth.serializer("cache");
                        throw null;
                    }
                } catch (Throwable th16) {
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigation#init-tilesetDescriptorFactory", null);
                    throw th16;
                }
            }
            new x(getNavigator());
            Context context4 = this.navigationOptions.applicationContext;
            MapboxNativeNavigatorImpl navigator5 = getNavigator();
            Handler handler = new Handler(Looper.getMainLooper());
            context4.getClass();
            this.systemLocaleWatcher = new SystemLocaleWatcher(context4, navigator5, handler);
            RoutingTilesOptions routingTilesOptions3 = this.navigationOptions.routingTilesOptions;
            navigationTileStoreOwner.invoke();
            routingTilesOptions3.getClass();
            routingTilesOptions3.tilesBaseUri.toString().getClass();
            HttpServiceFactory.getInstance().getClass();
            DelayKt.serializer(TilesetVersionsApi$json$1.INSTANCE);
            mapboxTripSession2.registerRouteProgressObserver(new RoutesProgressDataProvider(mapboxDirectionsSession, new AnonymousClass15(this)));
            this.lowMemoryManager.addObserver(this.lowMemoryObserver);
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("A different MapboxNavigation instance already exists.\nMake sure to destroy it with #onDestroy before creating a new one.\nAlso see MapboxNavigationApp for instance management assistance.");
        throw null;
    }

    public static /* synthetic */ void setNavigationRoutes$default(MapboxNavigation mapboxNavigation, List list, MapboxNavigation$prepareNavigationForRoutesParsing$2$1$1 mapboxNavigation$prepareNavigationForRoutesParsing$2$1$1, int i) {
        if ((i & 4) != 0) {
            mapboxNavigation$prepareNavigationForRoutesParsing$2$1$1 = null;
        }
        mapboxNavigation.setNavigationRoutes(list, 0, mapboxNavigation$prepareNavigationForRoutesParsing$2$1$1);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d5  */
    public final void setNavigationRoutes(List list, int i, MapboxNavigation$prepareNavigationForRoutesParsing$2$1$1 mapboxNavigation$prepareNavigationForRoutesParsing$2$1$1) {
        getCutText setRoutes$NewRoutes;
        getCutText getcuttext;
        SessionSKUIdentifier sessionSKUIdentifier;
        int i2;
        list.getClass();
        if (!list.isEmpty()) {
            NavigationRoute navigationRoute = (NavigationRoute) onContentCardDismissed.read(list);
            E$b e$b = this.billingController;
            AnalyticsServiceImpl analyticsServiceImpl = (AnalyticsServiceImpl) e$b.MediaBrowserCompatMediaItem;
            navigationRoute.getClass();
            SessionSKUIdentifier runningOrPausedSessionSkuId = e$b.getRunningOrPausedSessionSkuId();
            if (runningOrPausedSessionSkuId == SessionSKUIdentifier.NAV3_SES_CORE_AGTRIP) {
                RouteProgress routeProgress = ((MapboxTripSession) e$b.IconCompatParcelizer).routeProgress;
                ArrayList nonServerAddedWaypointsOnRoute = routeProgress == null ? null : E$b.getNonServerAddedWaypointsOnRoute(routeProgress.navigationRoute, new ObjectList$toString$1(21, routeProgress));
                ArrayList nonServerAddedWaypointsOnRoute2 = E$b.getNonServerAddedWaypointsOnRoute(navigationRoute, new BillingController$onExternalRouteSet$newWaypoints$1(e$b, i, 0));
                if (nonServerAddedWaypointsOnRoute != null && !nonServerAddedWaypointsOnRoute.isEmpty() && !nonServerAddedWaypointsOnRoute2.isEmpty() && nonServerAddedWaypointsOnRoute.size() == nonServerAddedWaypointsOnRoute2.size()) {
                    Iterator it = nonServerAddedWaypointsOnRoute.iterator();
                    int i3 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (i3 < 0) {
                                SQLite.serializer();
                                throw null;
                            }
                            if (TuplesKt.distance((Point) next, (Point) nonServerAddedWaypointsOnRoute2.get(i3), "metres") > 100.0d) {
                                sessionSKUIdentifier = SessionSKUIdentifier.NAV3_SES_CORE_AGTRIP;
                                BillingSessionStatus sessionStatus = ((BillingService) analyticsServiceImpl.locationProvider).getSessionStatus(sessionSKUIdentifier);
                                sessionStatus.getClass();
                                if (sessionStatus == BillingSessionStatus.SESSION_PAUSED) {
                                }
                                e$b.beginBillingSession(sessionSKUIdentifier, 0L, "destination has been changed. Old waypoints: " + nonServerAddedWaypointsOnRoute + ",new waypoints: " + nonServerAddedWaypointsOnRoute2);
                                if (i2 != 0) {
                                    ((BillingService) analyticsServiceImpl.locationProvider).pauseBillingSession(sessionSKUIdentifier);
                                    if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                                        LoggerProviderKt.logI(zzdr.access$getPublicName(runningOrPausedSessionSkuId).concat(" has been paused because it used to be paused before destinations update"), "BillingExplanation");
                                    }
                                }
                            } else {
                                i3++;
                            }
                        }
                    }
                } else {
                    sessionSKUIdentifier = SessionSKUIdentifier.NAV3_SES_CORE_AGTRIP;
                    BillingSessionStatus sessionStatus2 = ((BillingService) analyticsServiceImpl.locationProvider).getSessionStatus(sessionSKUIdentifier);
                    sessionStatus2.getClass();
                    i2 = sessionStatus2 == BillingSessionStatus.SESSION_PAUSED ? 1 : 0;
                    e$b.beginBillingSession(sessionSKUIdentifier, 0L, "destination has been changed. Old waypoints: " + nonServerAddedWaypointsOnRoute + ",new waypoints: " + nonServerAddedWaypointsOnRoute2);
                    if (i2 != 0) {
                        ((BillingService) analyticsServiceImpl.locationProvider).pauseBillingSession(sessionSKUIdentifier);
                        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                            LoggerProviderKt.logI(zzdr.access$getPublicName(runningOrPausedSessionSkuId).concat(" has been paused because it used to be paused before destinations update"), "BillingExplanation");
                        }
                    }
                }
            }
        }
        if (list.isEmpty()) {
            getcuttext = SetRoutes$CleanUp.INSTANCE;
        } else {
            Object obj = onContentCardDismissed.read(list);
            MapboxDirectionsSession mapboxDirectionsSession = this.directionsSession;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, onContentCardDismissed.MediaMetadataCompat(mapboxDirectionsSession.getRoutes())}, getCieXyz.write())).booleanValue()) {
                setRoutes$NewRoutes = new SetRoutes$Alternatives(i);
            } else {
                List routes = mapboxDirectionsSession.getRoutes();
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(routes, 10));
                Iterator it2 = routes.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((NavigationRoute) it2.next()).id);
                }
                if (arrayList.contains(((NavigationRoute) onContentCardDismissed.read(list)).id)) {
                    setRoutes$NewRoutes = new SetRoutes$Reorder(i);
                } else {
                    setRoutes$NewRoutes = new SetRoutes$NewRoutes(i);
                }
            }
            getcuttext = setRoutes$NewRoutes;
        }
        internalSetNavigationRoutes(list, getcuttext, mapboxNavigation$prepareNavigationForRoutesParsing$2$1$1);
    }

    public final MapboxNativeNavigatorImpl getNavigator() {
        MapboxNativeNavigatorImpl mapboxNativeNavigatorImpl = this._navigator;
        if (mapboxNativeNavigatorImpl != null) {
            return mapboxNativeNavigatorImpl;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("MapboxNavigation is destroyed");
        return null;
    }

    public final void onDestroy$navigation_release() {
        if (this.isDestroyed) {
            return;
        }
        LoggerProviderKt.logD("onDestroy", "MapboxNavigation");
        this.lowMemoryManager.removeObserver(this.lowMemoryObserver);
        SystemLocaleWatcher systemLocaleWatcher = this.systemLocaleWatcher;
        systemLocaleWatcher.context.unregisterReceiver(systemLocaleWatcher.localeChangeReceiver);
        E$b e$b = this.billingController;
        NavigationSession navigationSession = (NavigationSession) e$b.read;
        BillingController$$ExternalSyntheticLambda1 billingController$$ExternalSyntheticLambda1 = (BillingController$$ExternalSyntheticLambda1) e$b.write;
        billingController$$ExternalSyntheticLambda1.getClass();
        navigationSession.stateObservers.remove(billingController$$ExternalSyntheticLambda1);
        ArrivalProgressObserver arrivalProgressObserver = (ArrivalProgressObserver) e$b.RemoteActionCompatParcelizer;
        BillingController$arrivalObserver$1 billingController$arrivalObserver$1 = (BillingController$arrivalObserver$1) e$b.MediaMetadataCompat;
        billingController$arrivalObserver$1.getClass();
        arrivalProgressObserver.arrivalObservers.remove(billingController$arrivalObserver$1);
        SessionSKUIdentifier runningOrPausedSessionSkuId = e$b.getRunningOrPausedSessionSkuId();
        if (runningOrPausedSessionSkuId != null) {
            ((BillingService) ((AnalyticsServiceImpl) e$b.MediaBrowserCompatMediaItem).locationProvider).stopBillingSession(runningOrPausedSessionSkuId);
            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                LoggerProviderKt.logI(zzdr.access$getPublicName(runningOrPausedSessionSkuId).concat(" has been stopped because Nav SDK is destroyed"), "BillingExplanation");
            }
        }
        BlockRunner blockRunner = this.directionsSession.router;
        LinkedHashMap linkedHashMap = (LinkedHashMap) blockRunner.write;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) blockRunner.RatingCompat;
        for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 : onMove.IconCompatParcelizer(linkedHashMap2)) {
            long jLongValue = ((Number) onviewattachedtowindowlambda0.serializer).longValue();
            OngoingRequest ongoingRequest = (OngoingRequest) onviewattachedtowindowlambda0.write;
            ongoingRequest.onCancel.invoke();
            linkedHashMap2.remove(Long.valueOf(jLongValue));
            setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = ongoingRequest.parsingJob;
            if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
                setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
            }
        }
        for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 : onMove.IconCompatParcelizer(linkedHashMap)) {
            long jLongValue2 = ((Number) onviewattachedtowindowlambda1.serializer).longValue();
            OngoingRequest ongoingRequest2 = (OngoingRequest) onviewattachedtowindowlambda1.write;
            ongoingRequest2.onCancel.invoke();
            linkedHashMap.remove(Long.valueOf(jLongValue2));
            setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda1 = ongoingRequest2.parsingJob;
            if (setallviewgroupchildrenasnonaccessibilityimportantlambda1 != null) {
                setallviewgroupchildrenasnonaccessibilityimportantlambda1.write(null);
            }
        }
        blockRunner.getRouter$navigation_release().cancelAll();
        this.directionsSession.onSetNavigationRoutesFinishedObservers.clear();
        this.tripSession.stop();
        this.tripSession.locationObservers.clear();
        this.tripSession.routeProgressObservers.clear();
        this.tripSession.offRouteObservers.clear();
        this.tripSession.stateObservers.clear();
        this.tripSession.bannerInstructionsObservers.clear();
        this.tripSession.voiceInstructionsObservers.clear();
        DropShadowEffect dropShadowEffect = this.tripSession.eHorizonSubscriptionManager;
        ((CopyOnWriteArraySet) dropShadowEffect.write).clear();
        MapboxNativeNavigatorImpl mapboxNativeNavigatorImpl = (MapboxNativeNavigatorImpl) dropShadowEffect.read;
        if (!mapboxNativeNavigatorImpl.warnIfShutdown("setElectronicHorizonObserver")) {
            mapboxNativeNavigatorImpl.getNavigator().setElectronicHorizonObserver(null);
        }
        EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1 eHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1 = (EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1) dropShadowEffect.MediaDescriptionCompat;
        eHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1.getClass();
        if (!mapboxNativeNavigatorImpl.warnIfShutdown("removeRoadObjectsStoreObserver")) {
            RoadObjectsStoreInterface roadObjectsStoreInterface = mapboxNativeNavigatorImpl.roadObjectsStore;
            if (roadObjectsStoreInterface == null) {
                removeNodeAtDepth.serializer("roadObjectsStore");
                throw null;
            }
            roadObjectsStoreInterface.removeObserver(eHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1);
        }
        MapboxTripSession mapboxTripSession = this.tripSession;
        mapboxTripSession.fallbackVersionsObservers.clear();
        MapboxNativeNavigatorImpl mapboxNativeNavigatorImpl2 = mapboxTripSession.navigator;
        if (!mapboxNativeNavigatorImpl2.warnIfShutdown("setFallbackVersionsObserver")) {
            mapboxNativeNavigatorImpl2.getNavigator().setFallbackVersionsObserver(null);
        }
        MapboxTripSession mapboxTripSession2 = this.tripSession;
        mapboxTripSession2.offRouteObserverForReroute = null;
        mapboxTripSession2.rerouteInvocationHandler = null;
        DisplayCallbacksImpl displayCallbacksImpl = this.tripSessionLocationEngine;
        displayCallbacksImpl.getClass();
        LocationServiceFactory.getOrCreate().setUserDefinedDeviceLocationProviderFactory(null);
        if (displayCallbacksImpl.MediaSessionCompatQueueItem) {
            ((HandlerThread) displayCallbacksImpl.MediaMetadataCompat).quit();
        }
        MetadataApplierImpl metadataApplierImpl = this.routeAlternativesController;
        ((RouteAlternativesControllerInterface) metadataApplierImpl.RatingCompat).removeAllObservers();
        metadataApplierImpl.MediaDescriptionCompat = null;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = (r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU) metadataApplierImpl.read;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        ((CopyOnWriteArraySet) this.navigationTelemetry.locationProvider).clear();
        zznc zzncVar = this.rerouteController;
        if (zzncVar != null) {
            zzncVar.interrupt();
        }
        MapboxNativeNavigatorImpl navigator = getNavigator();
        if (!navigator.warnIfShutdown("shutdown")) {
            if (!navigator.warnIfShutdown("reset")) {
                navigator.getNavigator().reset(null);
            }
            navigator.unregisterAllNativeNavigatorObservers();
            RoadObjectsStoreInterface roadObjectsStoreInterface2 = navigator.roadObjectsStore;
            if (roadObjectsStoreInterface2 == null) {
                removeNodeAtDepth.serializer("roadObjectsStore");
                throw null;
            }
            roadObjectsStoreInterface2.removeAllCustomRoadObjects();
            navigator.nativeNavigatorRecreationObservers.clear();
            if (!navigator.warnIfShutdown("resetAdasisMessageCallback")) {
                AdasisFacadeHandle adasisFacadeHandle = navigator.adasisFacade;
                if (adasisFacadeHandle == null) {
                    removeNodeAtDepth.serializer("adasisFacade");
                    throw null;
                }
                adasisFacadeHandle.resetAdasisMessageCallback();
            }
            navigator.isShutdown = true;
            navigator.getNavigator().shutdown();
        }
        this.navigationVersionSwitchObservers.clear();
        this.arrivalProgressObserver.arrivalObservers.clear();
        this.navigationSession.stateObservers.clear();
        this.historyRecordingStateHandler.historyRecordingStateChangeObservers.clear();
        this.historyRecordingStateHandler.copilotSessionObservers.clear();
        this.developerMetadataAggregator.observers.clear();
        E$b e$b2 = this.routeRefreshController;
        Vw$Vw vw$Vw = (Vw$Vw) e$b2.MediaBrowserCompatMediaItem;
        ((CopyOnWriteArraySet) vw$Vw.serializer).clear();
        ((CopyOnWriteArraySet) vw$Vw.IconCompatParcelizer).clear();
        ((CopyOnWriteArraySet) ((x) e$b2.MediaDescriptionCompat).RemoteActionCompatParcelizer).clear();
        ((onBackInvokedlambda0) e$b2.read).write((CancellationException) null);
        ((MapboxHistoryRecorderWrapper) e$b2.MediaMetadataCompat).historyRecorder.pushHistory("android_route_refresh_events", "{\"type\":\"Destroyed\"}");
        ((CopyOnWriteArrayList) this.routesPreviewController.MediaDescriptionCompat).clear();
        JobKt.IconCompatParcelizer((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) this.threadController.ioRootJob);
        JobKt.IconCompatParcelizer((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) this.threadController.mainRootJob);
        Long l = this.reachabilityObserverId;
        if (l != null) {
            ReachabilityService.reachabilityInterface.removeListener(l.longValue());
            this.reachabilityObserverId = null;
        }
        Iterator it = this.historyRecorders.iterator();
        while (it.hasNext()) {
            ((MapboxHistoryRecorder) it.next()).enabledObservers.clear();
        }
        DecodeUtils$stepsGeometryDecodeCache$1 decodeUtils$stepsGeometryDecodeCache$1 = DecodeUtils.completeGeometryDecodeCache;
        DecodeUtilsExKt.clearCache();
        this._navigator = null;
        this.isDestroyed = true;
        hasInstance = false;
    }

    /* JADX INFO: renamed from: com.mapbox.navigation.core.MapboxNavigation$15, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass15 extends FunctionReferenceImpl implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass15(CustomPasswordViewModel customPasswordViewModel, int i) {
            super(0, 0, CustomPasswordViewModel.class, customPasswordViewModel, "onCreatePasswordClicked", "onCreatePasswordClicked()V");
            this.$r8$classId = i;
            if (i != 10) {
            } else {
                super(0, 0, CustomPasswordViewModel.class, customPasswordViewModel, "onPasswordToggleClicked", "onPasswordToggleClicked()V");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass15() {
            super(0, 0, getLayingOutChildren.class, CrashlyticsWorkers.RemoteActionCompatParcelizer, "isBlockingThread", "isBlockingThread()Z");
            this.$r8$classId = 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass15(MapboxNavigation mapboxNavigation) {
            super(0, 0, MapboxNavigation.class, mapboxNavigation, "currentLegIndex", "currentLegIndex()I");
            this.$r8$classId = 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass15(SemanticsSortKtgeometryDepthFirstSearchisTraversalGroup1 semanticsSortKtgeometryDepthFirstSearchisTraversalGroup1) {
            super(0, 0, SemanticsSortKtgeometryDepthFirstSearchisTraversalGroup1.class, semanticsSortKtgeometryDepthFirstSearchisTraversalGroup1, "onEnableBiometricClicked", "onEnableBiometricClicked()V");
            this.$r8$classId = 8;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass15(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
            super(i, i2, cls, obj, str, str2);
            this.$r8$classId = i3;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass15(getStripNonMetricAffectingCharSpansannotations getstripnonmetricaffectingcharspansannotations, int i) {
            super(0, 0, getStripNonMetricAffectingCharSpansannotations.class, getstripnonmetricaffectingcharspansannotations, "dismiss", "dismiss()V");
            this.$r8$classId = i;
            if (i != 12) {
            } else {
                super(0, 0, getStripNonMetricAffectingCharSpansannotations.class, getstripnonmetricaffectingcharspansannotations, "onBackToBackOrdersBannerDisplayed", "onBackToBackOrdersBannerDisplayed()V");
            }
        }

        /* JADX WARN: Code duplicated, block: B:28:0x007f  */
        /* JADX WARN: Instruction removed from duplicated block: B:28:0x007f, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Object invoke() {
            boolean z;
            setMatrix setmatrix;
            int i = 2 % 2;
            int i2 = this.$r8$classId;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i3 = 6;
            int i4 = 1;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            switch (i2) {
                case 0:
                    return Integer.valueOf(((MapboxNavigation) this.MediaMetadataCompat).currentLegIndex());
                case 1:
                    return ((hashCodeimpl) this.MediaMetadataCompat).serializer();
                case 2:
                    ((getLayingOutChildren) this.MediaMetadataCompat).getClass();
                    String name = Thread.currentThread().getName();
                    name.getClass();
                    return Boolean.valueOf(hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) name, (CharSequence) "Firebase Blocking Thread #", false));
                case 3:
                    ((ThreadUtils) this.MediaMetadataCompat).getClass();
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{Looper.myLooper(), Looper.getMainLooper()}, getCieXyz.write())).booleanValue()) {
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(Thread.currentThread().getName(), "Must be called on the main thread, but was called on ");
                    return null;
                case 4:
                    AppMigrationBannerUiModelImpl appMigrationBannerUiModelImpl = (AppMigrationBannerUiModelImpl) ((SemanticsModifier) this.MediaMetadataCompat);
                    Object obj = appMigrationBannerUiModelImpl.RemoteActionCompatParcelizer.read();
                    accessgetIdjd accessgetidjd = obj instanceof accessgetIdjd ? (accessgetIdjd) obj : null;
                    if (accessgetidjd != null) {
                        String str = accessgetidjd.serializer;
                        if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                            mergedSemanticsConfiguration mergedsemanticsconfiguration = appMigrationBannerUiModelImpl.MediaMetadataCompat;
                            SemanticsListener semanticsListener = accessgetidjd.RemoteActionCompatParcelizer;
                            String str2 = appMigrationBannerUiModelImpl.IconCompatParcelizer;
                            mergedsemanticsconfiguration.getClass();
                            str2.getClass();
                            mergedsemanticsconfiguration.serializer.logEvent("garnet_banner_clicked", mergedSemanticsConfiguration.IconCompatParcelizer(semanticsListener, str2));
                            appMigrationBannerUiModelImpl.read.serializer(new nearestParentThatHasSemantics(str));
                        }
                    }
                    return createfromparcel;
                case 5:
                    ((AppMigrationUiModelImpl) ((SemanticsModifierDefaultImpls) this.MediaMetadataCompat)).IconCompatParcelizer();
                    return createfromparcel;
                case 6:
                    ((AppMigrationUiModelImpl) ((SemanticsModifierDefaultImpls) this.MediaMetadataCompat)).IconCompatParcelizer();
                    return createfromparcel;
                case 7:
                    ((AppMigrationUiModelImpl) ((SemanticsModifierDefaultImpls) this.MediaMetadataCompat)).IconCompatParcelizer();
                    return createfromparcel;
                case 8:
                    SemanticsSortKtgeometryDepthFirstSearchisTraversalGroup1 semanticsSortKtgeometryDepthFirstSearchisTraversalGroup1 = (SemanticsSortKtgeometryDepthFirstSearchisTraversalGroup1) this.MediaMetadataCompat;
                    setShowingTextSubstitution setshowingtextsubstitution = semanticsSortKtgeometryDepthFirstSearchisTraversalGroup1.serializer;
                    String type = ((setToggleableState) semanticsSortKtgeometryDepthFirstSearchisTraversalGroup1.read.MediaSessionCompatResultReceiverWrapper()).getType();
                    setshowingtextsubstitution.getClass();
                    type.getClass();
                    ff$$ExternalSyntheticOutline0.m("biometric_type", type, setshowingtextsubstitution.write, "biometrics_login_enabled");
                    semanticsSortKtgeometryDepthFirstSearchisTraversalGroup1.write.serializer(sortByGeometryGroupingslambda1.LAUNCH_ENCRYPTION_FLOW);
                    return createfromparcel;
                case 9:
                    CustomPasswordViewModel customPasswordViewModel = (CustomPasswordViewModel) this.MediaMetadataCompat;
                    String str3 = ((invalidateCallbacksFor) customPasswordViewModel.IconCompatParcelizer.read()).serializer.RemoteActionCompatParcelizer;
                    CustomPasswordLaunchData customPasswordLaunchData = customPasswordViewModel.write;
                    String str4 = customPasswordLaunchData.read;
                    if (customPasswordLaunchData.RemoteActionCompatParcelizer == insertOrUpdateTransformedNodeSubhierarchy.MAGIC_LINK) {
                        int i5 = RemoteActionCompatParcelizer + 125;
                        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(customPasswordViewModel, new SelfieFlowRepository$uploadSelfie$2(customPasswordViewModel, str3, str4, z, null, 1));
                    return createfromparcel;
                case 10:
                    ((CustomPasswordViewModel) this.MediaMetadataCompat).RemoteActionCompatParcelizer.IconCompatParcelizer.logEvent("password_visible_click", null);
                    return createfromparcel;
                case 11:
                    StaticLayoutFactory28 staticLayoutFactory28 = (StaticLayoutFactory28) ((getStripNonMetricAffectingCharSpansannotations) this.MediaMetadataCompat);
                    staticLayoutFactory28.RemoteActionCompatParcelizer(getTextBounds.IconCompatParcelizer);
                    staticLayoutFactory28.serializer(Trigger.BACK_TO_BACK_POPUP_DISMISS);
                    staticLayoutFactory28.MediaSessionCompatResultReceiverWrapper.serializer();
                    return createfromparcel;
                case 12:
                    StaticLayoutFactory28 staticLayoutFactory29 = (StaticLayoutFactory28) ((getStripNonMetricAffectingCharSpansannotations) this.MediaMetadataCompat);
                    staticLayoutFactory29.MediaSessionCompatResultReceiverWrapper.write();
                    staticLayoutFactory29.MediaSessionCompatToken.serializer();
                    return createfromparcel;
                case 13:
                    DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl = (DeliveryAcceptButtonUiModelImpl) this.MediaMetadataCompat;
                    FontWeightSaverlambda0 fontWeightSaverlambda0 = (FontWeightSaverlambda0) deliveryAcceptButtonUiModelImpl.RemoteActionCompatParcelizer.read();
                    if (fontWeightSaverlambda0 instanceof HyphensSaverlambda0) {
                        BuildersKt.RemoteActionCompatParcelizer(deliveryAcceptButtonUiModelImpl.RatingCompat, null, null, new BridgeManager$trackEvent$2((Object) deliveryAcceptButtonUiModelImpl, (Object) fontWeightSaverlambda0, (ShortNewsContentCardView) (objArr == true ? 1 : 0), i3), 3);
                    }
                    return createfromparcel;
                case 14:
                    DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl2 = (DeliveryAcceptButtonUiModelImpl) this.MediaMetadataCompat;
                    FontWeightSaverlambda0 fontWeightSaverlambda1 = (FontWeightSaverlambda0) deliveryAcceptButtonUiModelImpl2.RemoteActionCompatParcelizer.read();
                    if (fontWeightSaverlambda1 instanceof HyphensSaverlambda0) {
                        BuildersKt.RemoteActionCompatParcelizer(deliveryAcceptButtonUiModelImpl2.RatingCompat, null, null, new BridgeManager$trackEvent$2((Object) deliveryAcceptButtonUiModelImpl2, (Object) fontWeightSaverlambda1, (ShortNewsContentCardView) (objArr2 == true ? 1 : 0), i3), 3);
                    }
                    return createfromparcel;
                case 15:
                    DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl3 = (DeliveryAcceptButtonUiModelImpl) this.MediaMetadataCompat;
                    FontWeightSaverlambda0 fontWeightSaverlambda2 = (FontWeightSaverlambda0) deliveryAcceptButtonUiModelImpl3.RemoteActionCompatParcelizer.read();
                    if (fontWeightSaverlambda2 instanceof HyphensSaverlambda0) {
                        ArrayList arrayListRemoteActionCompatParcelizer = TrackingEventExtensionsKt.RemoteActionCompatParcelizer(((HyphensSaverlambda0) fontWeightSaverlambda2).read(), Trigger.SWIPE_BUTTON_FAILED_ATTEMPT);
                        DeliveryAcceptanceLogger deliveryAcceptanceLogger = deliveryAcceptButtonUiModelImpl3.MediaBrowserCompatMediaItem;
                        Iterator it = arrayListRemoteActionCompatParcelizer.iterator();
                        while (it.hasNext()) {
                            int i7 = RemoteActionCompatParcelizer + 101;
                            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                            int i8 = i7 % 2;
                            deliveryAcceptanceLogger.serializer((TrackingEvent) it.next());
                        }
                    }
                    return createfromparcel;
                case 16:
                    ((AutoAcceptPreferencesViewModel) ((resolveSpanStyleDefaults) this.MediaMetadataCompat)).write.serializer(fastMergedSHsh3o.CLOSE);
                    return createfromparcel;
                case 17:
                    measurexDpz5zYdefault measurexdpz5zydefault = (measurexDpz5zYdefault) this.MediaMetadataCompat;
                    BuildersKt.RemoteActionCompatParcelizer(measurexdpz5zydefault.write, null, null, new ClearDataUseCaseImpl$invoke$2((Object) measurexdpz5zydefault, (ShortNewsContentCardView) (objArr3 == true ? 1 : 0), 16), 3);
                    return createfromparcel;
                case 18:
                    BoringLayoutFactory boringLayoutFactory = (BoringLayoutFactory) ((getVerbatim) this.MediaMetadataCompat);
                    getQueryContext getquerycontext = boringLayoutFactory.RatingCompat;
                    BuildersKt.RemoteActionCompatParcelizer(boringLayoutFactory.serializer, null, null, new DeclineButtonUiModelImpl$1(boringLayoutFactory, objArr4 == true ? 1 : 0, i4), 3);
                    VerbatimTtsAnnotation verbatimTtsAnnotation = ((AndroidLayoutApi34ExternalSyntheticLambda0) boringLayoutFactory.MediaSessionCompatQueueItem.read()).IconCompatParcelizer;
                    if (verbatimTtsAnnotation instanceof TtsAnnotation) {
                        getquerycontext.serializer(getRangeForRectlambda0.serializer);
                        return createfromparcel;
                    }
                    if (true ^ (verbatimTtsAnnotation instanceof r8lambda8Qf6Vtl1pxlFHiMZeMUbAdi_ww)) {
                        if (verbatimTtsAnnotation == null) {
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    int i9 = RemoteActionCompatParcelizer + 9;
                    IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 == 0) {
                        getquerycontext.serializer(AndroidLayoutApi34.RemoteActionCompatParcelizer);
                        return createfromparcel;
                    }
                    getquerycontext.serializer(AndroidLayoutApi34.RemoteActionCompatParcelizer);
                    throw null;
                case 19:
                    ((BoringLayoutFactory33ExternalSyntheticApiModelOutline0) this.MediaMetadataCompat).serializer();
                    return createfromparcel;
                case 20:
                    ((BoringLayoutFactory33ExternalSyntheticApiModelOutline0) this.MediaMetadataCompat).RemoteActionCompatParcelizer();
                    return createfromparcel;
                case 21:
                    LayoutCompatBreakStrategy layoutCompatBreakStrategy = (LayoutCompatBreakStrategy) ((EarningsUiModelImpl) ((EarningsUiModel) this.MediaMetadataCompat)).ParcelableVolumeInfo.read();
                    if (layoutCompatBreakStrategy instanceof LayoutCompatJustificationMode) {
                        return createfromparcel;
                    }
                    int i10 = IconCompatParcelizer + 57;
                    RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 == 0) {
                        Object[] objArr6 = {layoutCompatBreakStrategy, LayoutCompatHyphenationFrequency.RemoteActionCompatParcelizer};
                        int i11 = 79 / 0;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr6, getCieXyz.write())).booleanValue()) {
                            return createfromparcel;
                        }
                    } else {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{layoutCompatBreakStrategy, LayoutCompatHyphenationFrequency.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                            return createfromparcel;
                        }
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                case 22:
                    EarningsUiModelImpl earningsUiModelImpl = (EarningsUiModelImpl) ((EarningsUiModel) this.MediaMetadataCompat);
                    if (earningsUiModelImpl.MediaBrowserCompatMediaItem) {
                        Application application = earningsUiModelImpl.serializer;
                        application.startActivity(q4ExternalSyntheticLambda9.write(earningsUiModelImpl.MediaSessionCompatQueueItem, application, null, false, 12));
                    } else {
                        earningsUiModelImpl.IconCompatParcelizer.IconCompatParcelizer(Boolean.TRUE);
                    }
                    return createfromparcel;
                case 23:
                    ((EarningsUiModelImpl) ((EarningsUiModel) this.MediaMetadataCompat)).IconCompatParcelizer.IconCompatParcelizer(Boolean.FALSE);
                    return createfromparcel;
                case 24:
                    ((LastStopOptionUiModelImpl) this.MediaMetadataCompat).RemoteActionCompatParcelizer.IconCompatParcelizer(Boolean.FALSE);
                    return createfromparcel;
                case 25:
                    LastStopOptionUiModelImpl lastStopOptionUiModelImpl = (LastStopOptionUiModelImpl) this.MediaMetadataCompat;
                    lastStopOptionUiModelImpl.getClass();
                    BuildersKt.RemoteActionCompatParcelizer(lastStopOptionUiModelImpl.write, null, null, new LastStopOptionUiModelImpl$trackEvent$1(lastStopOptionUiModelImpl, Trigger.LAST_STOP_EDIT_BUTTON_CLICK, null), 3);
                    lastStopOptionUiModelImpl.IconCompatParcelizer();
                    return createfromparcel;
                case 26:
                    LastStopOptionUiModelImpl lastStopOptionUiModelImpl2 = (LastStopOptionUiModelImpl) this.MediaMetadataCompat;
                    BuildersKt.RemoteActionCompatParcelizer(lastStopOptionUiModelImpl2.write, null, null, new PerseusLogger$w$1(lastStopOptionUiModelImpl2, null), 3);
                    return createfromparcel;
                case 27:
                    LastStopOptionUiModelImpl lastStopOptionUiModelImpl3 = (LastStopOptionUiModelImpl) this.MediaMetadataCompat;
                    lastStopOptionUiModelImpl3.getClass();
                    BuildersKt.RemoteActionCompatParcelizer(lastStopOptionUiModelImpl3.write, null, null, new LastStopOptionUiModelImpl$trackEvent$1(lastStopOptionUiModelImpl3, Trigger.BUTTON_CLICK, null), 3);
                    getClipBounds getclipbounds = (getClipBounds) lastStopOptionUiModelImpl3.serializer.read();
                    if (!(getclipbounds instanceof drawText)) {
                        if (getclipbounds instanceof get_nativeCanvasui_text) {
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    drawText drawtext = (drawText) getclipbounds;
                    if (drawtext.write == null || drawtext.IconCompatParcelizer == null) {
                        lastStopOptionUiModelImpl3.IconCompatParcelizer();
                        return createfromparcel;
                    }
                    lastStopOptionUiModelImpl3.RemoteActionCompatParcelizer.IconCompatParcelizer(Boolean.TRUE);
                    return createfromparcel;
                case 28:
                    LastStopSelectionBottomSheetUiModelImpl lastStopSelectionBottomSheetUiModelImpl = (LastStopSelectionBottomSheetUiModelImpl) ((LastStopSelectionBottomSheetUiModel) this.MediaMetadataCompat);
                    isOpaque isopaque = (isOpaque) lastStopSelectionBottomSheetUiModelImpl.MediaSessionCompatResultReceiverWrapper.read();
                    saveLayerAlpha savelayeralpha = isopaque != null ? isopaque.serializer : null;
                    if (savelayeralpha instanceof setMatrix) {
                        int i12 = RemoteActionCompatParcelizer + 5;
                        IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                        setmatrix = (setMatrix) savelayeralpha;
                    } else {
                        setmatrix = null;
                    }
                    String str5 = isopaque != null ? isopaque.write : null;
                    if (isopaque == null || setmatrix == null || str5 == null) {
                        Timber.RemoteActionCompatParcelizer.read("Save last stop error: Required params are empty " + setmatrix + " " + str5 + " " + isopaque, new Object[0]);
                        lastStopSelectionBottomSheetUiModelImpl.ParcelableVolumeInfo.serializer(new setBitmap(lastStopSelectionBottomSheetUiModelImpl.PlaybackStateCompatCustomAction.IconCompatParcelizer(R.string.all_error_message), ddefault.IconCompatParcelizer));
                    } else {
                        int i14 = RemoteActionCompatParcelizer + 77;
                        IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                        if (i14 % 2 != 0) {
                            str5.length();
                            (objArr5 == true ? 1 : 0).hashCode();
                            throw null;
                        }
                        if (str5.length() == 0) {
                            Timber.RemoteActionCompatParcelizer.read("Save last stop error: Required params are empty " + setmatrix + " " + str5 + " " + isopaque, new Object[0]);
                            lastStopSelectionBottomSheetUiModelImpl.ParcelableVolumeInfo.serializer(new setBitmap(lastStopSelectionBottomSheetUiModelImpl.PlaybackStateCompatCustomAction.IconCompatParcelizer(R.string.all_error_message), ddefault.IconCompatParcelizer));
                        } else {
                            BuildersKt.RemoteActionCompatParcelizer(lastStopSelectionBottomSheetUiModelImpl.serializer, null, null, new NavHostKt$NavHost$29$1(lastStopSelectionBottomSheetUiModelImpl, str5, setmatrix, isopaque, null, 21), 3);
                        }
                    }
                    return createfromparcel;
                default:
                    getCharacterRightBounds getcharacterrightbounds = (getCharacterRightBounds) ((set_nativeCanvasui_text) this.MediaMetadataCompat);
                    getcharacterrightbounds.read.RemoteActionCompatParcelizer();
                    getcharacterrightbounds.IconCompatParcelizer.serializer(restoreToCount.write);
                    return createfromparcel;
            }
        }
    }
}
