package com.mapbox.navigation.core;

import android.text.SpannableString;
import androidx.camera.core.LegacySessionConfig;
import androidx.compose.material.ripple.RippleHostMap;
import androidx.compose.ui.graphics.Fields;
import androidx.constraintlayout.widget.ConstraintLayout;
import bo.app.f2$$ExternalSyntheticLambda4;
import coil3.network.NetworkFetcher;
import coil3.network.NetworkHeaders$Builder;
import com.common_ui.databinding.ItemSingleChoiceBinding;
import com.common_ui.databinding.LayoutTileBinding;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksImpl;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.bindgen.Value;
import com.mapbox.common.LifecycleState;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.MemoryMonitorObserver;
import com.mapbox.common.MemoryMonitorState;
import com.mapbox.common.MemoryMonitorStatus;
import com.mapbox.common.location.GetLocationCallback;
import com.mapbox.common.location.Location;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraChangedCoalescedCallback;
import com.mapbox.maps.RenderCallback;
import com.mapbox.maps.SourceDataLoaded;
import com.mapbox.maps.SourceDataLoadedCallback;
import com.mapbox.maps.SourceDataLoadedType;
import com.mapbox.maps.extension.style.layers.LayerUtils$getLayer$source$2;
import com.mapbox.maps.extension.style.types.PromoteId;
import com.mapbox.maps.renderer.MapboxRenderer;
import com.mapbox.navigation.core.internal.LowMemoryManager$Observer;
import com.mapbox.navigation.core.reroute.RerouteResult;
import com.mapbox.navigation.core.telemetry.events.LifecycleStateProvider;
import com.mapbox.navigation.core.trip.session.MapboxTripSession;
import com.mapbox.navigation.tripdata.maneuver.model.Lane;
import com.mapbox.navigation.tripdata.maneuver.model.Maneuver;
import com.mapbox.navigation.tripdata.maneuver.model.PrimaryManeuver;
import com.mapbox.navigation.tripdata.maneuver.model.SecondaryManeuver;
import com.mapbox.navigation.tripdata.maneuver.model.StepDistance;
import com.mapbox.navigation.tripdata.maneuver.model.SubManeuver;
import com.mapbox.navigation.ui.base.formatter.ValueFormatter;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxLaneGuidanceAdapter;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxManeuverDiffCallback;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxManeuverView;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxPrimaryManeuver;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxSecondaryManeuver;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxStepDistance;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxTurnIconManeuver;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxUpcomingManeuverAdapter;
import com.mapbox.navigation.ui.maps.route.line.api.RouteRenderCallbackHolder;
import com.mapbox.navigation.ui.maps.route.line.api.SourceIdAndDataId;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigation.voice.api.PlayCallback;
import com.mapbox.navigation.voice.model.SpeechAnnouncement;
import com.mapbox.navigator.RefreshRouteResult;
import com.mapbox.navigator.RouteAlternative;
import com.mapbox.navigator.RouterDataRefCallback;
import com.mapbox.navigator.RouterOrigin;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.mapbox.search.base.location.LocationEngineAdapter;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.channels.ProducerCoroutine;
import o.EnterExitTransitionKtshrinkVertically2;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ItemTouchHelperAdapter;
import o.ShortNewsContentCardView;
import o.accessgetTextCentercp;
import o.createFromParcel;
import o.getCieXyz;
import o.getClear0nO6VwU;
import o.getLastCustomNonConfigurationInstance;
import o.getPlus0nO6VwU;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeFromGlobalEntries;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MapboxNavigation$$ExternalSyntheticLambda4 implements CameraChangedCoalescedCallback, Expected.Transformer, GetLocationCallback, RenderCallback, MemoryMonitorObserver, RouterDataRefCallback, Expected.Action, ValueFormatter, SourceDataLoadedCallback, Consumer {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MapboxNavigation$$ExternalSyntheticLambda4(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.mapbox.navigation.ui.base.formatter.ValueFormatter
    public Object format(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (SpannableString) ((AnalyticsServiceImpl) this.f$0).format(Long.valueOf(((Calendar) obj).getTimeInMillis()));
        }
        throw null;
    }

    public void onDone(SpeechAnnouncement speechAnnouncement) {
        int i = 2 % 2;
        LegacySessionConfig legacySessionConfig = (LegacySessionConfig) this.f$0;
        speechAnnouncement.getClass();
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) legacySessionConfig.RatingCompat;
        PlayCallback playCallback = (PlayCallback) concurrentLinkedQueue.poll();
        if (!(!concurrentLinkedQueue.isEmpty())) {
            int i2 = RemoteActionCompatParcelizer + 119;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            legacySessionConfig.abandonFocus(false);
        }
        if (playCallback != null) {
            int i4 = write + 99;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            playCallback.consumer.accept(playCallback.announcement);
        }
        legacySessionConfig.play();
    }

    public boolean onNewRoutes(RerouteResult rerouteResult) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 3;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        MapboxNavigation mapboxNavigation = (MapboxNavigation) this.f$0;
        MapboxTripSession mapboxTripSession = mapboxNavigation.tripSession;
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
            LoggerProviderKt.logI("Reroute on deviation: " + rerouteResult + ", tripSession.isOffRoute = " + mapboxTripSession.isOffRoute, "MapboxNavigation");
        }
        if (!mapboxTripSession.isOffRoute) {
            return false;
        }
        mapboxNavigation.internalSetNavigationRoutes(rerouteResult.routes, new SetRoutes$Reroute(rerouteResult.initialLegIndex), null);
        int i4 = RemoteActionCompatParcelizer + 1;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return true;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) throws Exception {
        int i = 2 % 2;
        int i2 = write + 53;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.$r8$classId;
        Object obj3 = this.f$0;
        switch (i3) {
            case 19:
                ((f2$$ExternalSyntheticLambda4) obj3).invoke(obj);
                return;
            case 20:
                ((NetworkFetcher.AnonymousClass2) obj3).invoke(obj);
                return;
            case 21:
                ((SessionDao_Impl$$ExternalSyntheticLambda1) obj3).invoke(obj);
                int i4 = RemoteActionCompatParcelizer + 95;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return;
            case 22:
                ((BarcodeAnalyzer$$ExternalSyntheticLambda0) obj3).invoke(obj);
                int i6 = write + 55;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return;
            case 23:
                ((getLastCustomNonConfigurationInstance) obj3).invoke(obj);
                return;
            case 24:
                ((NetworkFetcher.AnonymousClass2) obj3).invoke(obj);
                return;
            case 25:
                ((BarcodeAnalyzer$$ExternalSyntheticLambda0) obj3).invoke(obj);
                return;
            case 26:
                ((NetworkFetcher.AnonymousClass2) obj3).invoke(obj);
                return;
            case 27:
                ((removeFromGlobalEntries) obj3).invoke(obj);
                return;
            case 28:
                ((NetworkFetcher.AnonymousClass2) obj3).invoke(obj);
                return;
            default:
                ((accessgetTextCentercp) obj3).invoke(obj);
                int i8 = RemoteActionCompatParcelizer + 63;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return;
        }
    }

    @Override // com.mapbox.common.MemoryMonitorObserver
    public void onMemoryMonitorAlert(MemoryMonitorStatus memoryMonitorStatus) {
        int i = 2 % 2;
        x xVar = (x) this.f$0;
        memoryMonitorStatus.getClass();
        if (memoryMonitorStatus.getState() != MemoryMonitorState.MEMORY_THRESHOLD_REACHED) {
            int i2 = RemoteActionCompatParcelizer + 121;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (memoryMonitorStatus.getState() != MemoryMonitorState.SYSTEM_MEMORY_WARNING_RECEIVED) {
                return;
            }
        }
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
            LoggerProviderKt.logD("onMemoryMonitorAlert(" + memoryMonitorStatus + "). Notifying about low memory...", "LowMemoryManager");
        }
        Iterator it = ((CopyOnWriteArrayList) xVar.RemoteActionCompatParcelizer).iterator();
        while (it.hasNext()) {
            int i4 = RemoteActionCompatParcelizer + 125;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            ((LowMemoryManager$Observer) it.next()).onLowMemory();
        }
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = this.$r8$classId;
        Object obj2 = this.f$0;
        Object obj3 = null;
        if (i2 == 3) {
            Value value$lambda$0 = PromoteId.toValue$lambda$0((PromoteId) obj2, (String) obj);
            int i3 = write + 97;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return value$lambda$0;
            }
            obj3.hashCode();
            throw null;
        }
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        RefreshRouteResult refreshRouteResult = (RefreshRouteResult) obj;
        shortNewsContentCardView.getClass();
        refreshRouteResult.getClass();
        StringBuilder sb = new StringBuilder("Annotations updated successfully for route with ID: '");
        sb.append(refreshRouteResult.getRoute().getRouteId());
        sb.append("'. Alternatives IDs: ");
        List<RouteAlternative> alternatives = refreshRouteResult.getAlternatives();
        alternatives.getClass();
        String strIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(alternatives, null, null, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(1) { // from class: com.mapbox.navigation.navigator.internal.MapboxNativeNavigatorImpl$refreshRoute$callback$1$2$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj4) {
                return String.valueOf(((RouteAlternative) obj4).getId());
            }
        }, 31);
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strIconCompatParcelizer)) {
            int i4 = write + 57;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                obj3.hashCode();
                throw null;
            }
            strIconCompatParcelizer = "[no alternatives]";
        }
        sb.append(strIconCompatParcelizer);
        LoggerProviderKt.logD(sb.toString(), "MapboxNativeNavigatorImpl");
        shortNewsContentCardView.resumeWith(ExpectedFactory.createValue(refreshRouteResult.getAlternatives()));
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00fd  */
    @Override // com.mapbox.maps.SourceDataLoadedCallback
    public void run(SourceDataLoaded sourceDataLoaded) {
        Integer numMediaSessionCompatQueueItem;
        int i = 2 % 2;
        NetworkHeaders$Builder networkHeaders$Builder = (NetworkHeaders$Builder) this.f$0;
        sourceDataLoaded.getClass();
        String dataId = sourceDataLoaded.getDataId();
        if (dataId != null) {
            int i2 = RemoteActionCompatParcelizer + 83;
            write = i2 % Fields.SpotShadowColor;
            numMediaSessionCompatQueueItem = setCarryoverInAppMessage.MediaSessionCompatQueueItem(i2 % 2 == 0 ? 28 : 10, dataId);
        } else {
            numMediaSessionCompatQueueItem = null;
        }
        if (sourceDataLoaded.getType() == SourceDataLoadedType.METADATA && numMediaSessionCompatQueueItem != null) {
            String sourceId = sourceDataLoaded.getSourceId();
            sourceId.getClass();
            SourceIdAndDataId sourceIdAndDataId = new SourceIdAndDataId(sourceId, numMediaSessionCompatQueueItem.intValue());
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = networkHeaders$Builder.serializer;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                SourceIdAndDataId sourceIdAndDataId2 = (SourceIdAndDataId) entry.getKey();
                sourceIdAndDataId2.getClass();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{sourceIdAndDataId2.sourceId, sourceId}, getCieXyz.write())).booleanValue() && sourceIdAndDataId2.dataId < sourceIdAndDataId.dataId) {
                    int i3 = write + 111;
                    RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    RouteRenderCallbackHolder routeRenderCallbackHolder = (RouteRenderCallbackHolder) entry.getValue();
                    String str = ((SourceIdAndDataId) entry.getKey()).sourceId;
                    LinkedHashSet linkedHashSet = routeRenderCallbackHolder.successfulRouteIds;
                    LinkedHashSet linkedHashSet2 = routeRenderCallbackHolder.allRouteIds;
                    str.getClass();
                    RippleHostMap rippleHostMap = routeRenderCallbackHolder.expectedRoutes;
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) rippleHostMap.read.get(str);
                    String str2 = onviewattachedtowindowlambda0 != null ? (String) onviewattachedtowindowlambda0.write : null;
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = (onViewAttachedToWindowlambda0) rippleHostMap.RemoteActionCompatParcelizer.get(str);
                    String str3 = onviewattachedtowindowlambda1 != null ? (String) onviewattachedtowindowlambda1.write : null;
                    if (str2 != null && linkedHashSet2.contains(str2)) {
                        int i5 = RemoteActionCompatParcelizer + 75;
                        write = i5 % Fields.SpotShadowColor;
                        if (i5 % 2 == 0) {
                            int i6 = 68 / 0;
                            if (routeRenderCallbackHolder.renderedRouteIdsToNotify.contains(str2)) {
                                routeRenderCallbackHolder.renderingCancelledRouteIds.add(str2);
                                linkedHashSet.remove(str2);
                            }
                        } else if (routeRenderCallbackHolder.renderedRouteIdsToNotify.contains(str2)) {
                            routeRenderCallbackHolder.renderingCancelledRouteIds.add(str2);
                            linkedHashSet.remove(str2);
                        }
                    }
                    if (str3 != null && linkedHashSet2.contains(str3) && routeRenderCallbackHolder.clearedRouteIdsToNotify.contains(str3)) {
                        routeRenderCallbackHolder.clearingCancelledRouteIds.add(str3);
                        linkedHashSet.remove(str3);
                    }
                    arrayList.add(new LayerUtils$getLayer$source$2(networkHeaders$Builder, 16, entry));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) it.next()).invoke();
            }
            RouteRenderCallbackHolder routeRenderCallbackHolder2 = (RouteRenderCallbackHolder) linkedHashMap.get(sourceIdAndDataId);
            if (routeRenderCallbackHolder2 != null) {
                LinkedHashSet linkedHashSet3 = routeRenderCallbackHolder2.successfulRouteIds;
                LinkedHashSet linkedHashSet4 = routeRenderCallbackHolder2.allRouteIds;
                RippleHostMap rippleHostMap2 = routeRenderCallbackHolder2.expectedRoutes;
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2 = (onViewAttachedToWindowlambda0) rippleHostMap2.read.get(sourceId);
                String str4 = onviewattachedtowindowlambda2 != null ? (String) onviewattachedtowindowlambda2.write : null;
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda3 = (onViewAttachedToWindowlambda0) rippleHostMap2.RemoteActionCompatParcelizer.get(sourceId);
                String str5 = onviewattachedtowindowlambda3 != null ? (String) onviewattachedtowindowlambda3.write : null;
                if (str4 != null && linkedHashSet4.contains(str4) && routeRenderCallbackHolder2.renderedRouteIdsToNotify.contains(str4)) {
                    int i7 = write + 87;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        linkedHashSet3.add(str4);
                        routeRenderCallbackHolder2.renderingCancelledRouteIds.remove(str4);
                        int i8 = 66 / 0;
                    } else {
                        linkedHashSet3.add(str4);
                        routeRenderCallbackHolder2.renderingCancelledRouteIds.remove(str4);
                    }
                }
                if (str5 != null && linkedHashSet4.contains(str5) && routeRenderCallbackHolder2.clearedRouteIdsToNotify.contains(str5)) {
                    linkedHashSet3.add(str5);
                    routeRenderCallbackHolder2.clearingCancelledRouteIds.remove(str5);
                }
                networkHeaders$Builder.maybeFinish(routeRenderCallbackHolder2);
            }
        }
        int i9 = RemoteActionCompatParcelizer + 31;
        write = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
    }

    @Override // com.mapbox.navigator.RouterDataRefCallback
    public void run(Expected expected, RouterOrigin routerOrigin) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 19;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.f$0;
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        expected.getClass();
        routerOrigin.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(expected, routerOrigin);
        int i4 = write + 69;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r1 != 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r6.getClass();
        r6 = r6.getCameraState();
        r6.getClass();
        ((com.mapbox.maps.plugin.scalebar.ScaleBarPluginImpl) r3).invalidateScaleBar(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        com.mapbox.maps.debugoptions.DebugOptionsController.updateCameraSubscriptionIfNeeded$lambda$1((com.mapbox.maps.debugoptions.DebugOptionsController) r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r1 != 2) goto L11;
     */
    @Override // com.mapbox.maps.CameraChangedCoalescedCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run(com.mapbox.maps.CameraChangedCoalesced r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4.write
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L1b
            int r1 = r5.$r8$classId
            java.lang.Object r3 = r5.f$0
            r4 = 6
            int r4 = r4 / 0
            if (r1 == r2) goto L39
            if (r1 == r0) goto L33
            goto L23
        L1b:
            int r1 = r5.$r8$classId
            java.lang.Object r3 = r5.f$0
            if (r1 == r2) goto L39
            if (r1 == r0) goto L33
        L23:
            com.mapbox.maps.plugin.scalebar.ScaleBarPluginImpl r3 = (com.mapbox.maps.plugin.scalebar.ScaleBarPluginImpl) r3
            r6.getClass()
            com.mapbox.maps.CameraState r6 = r6.getCameraState()
            r6.getClass()
            r3.invalidateScaleBar(r6)
            return
        L33:
            com.mapbox.maps.debugoptions.DebugOptionsController r3 = (com.mapbox.maps.debugoptions.DebugOptionsController) r3
            com.mapbox.maps.debugoptions.DebugOptionsController.$r8$lambda$rAcTDbY1_djqGjFaSYKq_HJJuPM(r3, r6)
            return
        L39:
            com.mapbox.maps.plugin.MapPluginRegistry r3 = (com.mapbox.maps.plugin.MapPluginRegistry) r3
            com.mapbox.maps.MapController.$r8$lambda$7wHvPB5cAr3rmHAblexG1xXVd1o(r3, r6)
            int r6 = com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer
            int r6 = r6 + 121
            int r1 = r6 % 128
            com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4.write = r1
            int r6 = r6 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4.run(com.mapbox.maps.CameraChangedCoalesced):void");
    }

    @Override // com.mapbox.maps.RenderCallback
    public void run() {
        int i = 2 % 2;
        int i2 = write + 49;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ((MapboxRenderer) this.f$0).render();
            throw null;
        }
        ((MapboxRenderer) this.f$0).render();
        int i3 = RemoteActionCompatParcelizer + 61;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        int i = 2 % 2;
        int i2 = write + 3;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.$r8$classId;
        Object obj3 = this.f$0;
        if (i3 == 10) {
            LifecycleStateProvider.init$lambda$1$lambda$0((LifecycleStateProvider) obj3, (LifecycleState) obj);
            return;
        }
        MapboxManeuverView mapboxManeuverView = (MapboxManeuverView) obj3;
        List list = (List) obj;
        mapboxManeuverView.getClass();
        ItemSingleChoiceBinding itemSingleChoiceBinding = mapboxManeuverView.binding;
        ArrayList arrayList = mapboxManeuverView.currentlyRenderedManeuvers;
        list.getClass();
        List list2 = list;
        if (!list2.isEmpty()) {
            arrayList.clear();
            arrayList.addAll(list2);
            MapboxUpcomingManeuverAdapter mapboxUpcomingManeuverAdapter = mapboxManeuverView.upcomingManeuverAdapter;
            LinkedHashSet linkedHashSet = mapboxManeuverView.routeShields;
            if (!arrayList.isEmpty()) {
                Maneuver maneuver = (Maneuver) arrayList.get(0);
                MapboxLaneGuidanceAdapter mapboxLaneGuidanceAdapter = mapboxManeuverView.laneGuidanceAdapter;
                LayoutTileBinding layoutTileBinding = mapboxManeuverView.mainLayoutBinding;
                PrimaryManeuver primaryManeuver = maneuver.primary;
                SecondaryManeuver secondaryManeuver = maneuver.secondary;
                SubManeuver subManeuver = maneuver.sub;
                Lane lane = maneuver.laneGuidance;
                StepDistance stepDistance = maneuver.stepDistance;
                if ((secondaryManeuver != null ? secondaryManeuver.componentList : null) != null) {
                    mapboxManeuverView.updateSecondaryManeuverVisibility(0);
                    ((MapboxSecondaryManeuver) layoutTileBinding.serializer).renderManeuver(secondaryManeuver, linkedHashSet);
                } else {
                    mapboxManeuverView.updateSecondaryManeuverVisibility(8);
                }
                ((MapboxPrimaryManeuver) layoutTileBinding.read).renderManeuver(primaryManeuver, linkedHashSet);
                ((MapboxTurnIconManeuver) layoutTileBinding.RemoteActionCompatParcelizer).renderPrimaryTurnIcon(primaryManeuver);
                MapboxStepDistance mapboxStepDistance = (MapboxStepDistance) layoutTileBinding.write;
                Double d = stepDistance.distanceRemaining;
                if (d != null) {
                    mapboxStepDistance.setText(((AnalyticsServiceImpl) stepDistance.distanceFormatter).formatDistance(d.doubleValue()));
                }
                if ((subManeuver != null ? subManeuver.componentList : null) == null) {
                    int i4 = RemoteActionCompatParcelizer + 17;
                    write = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    if (lane != null) {
                        ((ConstraintLayout) itemSingleChoiceBinding.serializer).setVisibility(0);
                    } else {
                        ((ConstraintLayout) itemSingleChoiceBinding.serializer).setVisibility(8);
                    }
                } else {
                    ((ConstraintLayout) itemSingleChoiceBinding.serializer).setVisibility(0);
                }
                if ((subManeuver != null ? subManeuver.componentList : null) != null) {
                    int i6 = RemoteActionCompatParcelizer + 11;
                    write = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    mapboxManeuverView.renderSub(subManeuver, linkedHashSet);
                } else {
                    mapboxManeuverView.renderSub(null, ItemTouchHelperAdapter.serializer);
                }
                if (lane != null) {
                    ArrayList arrayList2 = lane.allLanes;
                    ArrayList arrayList3 = mapboxLaneGuidanceAdapter.laneIndicatorList;
                    if (!arrayList2.isEmpty()) {
                        arrayList3.clear();
                        arrayList3.addAll(arrayList2);
                        mapboxLaneGuidanceAdapter.notifyDataSetChanged();
                    }
                } else {
                    ArrayList arrayList4 = mapboxLaneGuidanceAdapter.laneIndicatorList;
                    if (!arrayList4.isEmpty()) {
                        int i8 = write + 113;
                        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        arrayList4.clear();
                        mapboxLaneGuidanceAdapter.notifyDataSetChanged();
                    }
                }
                mapboxUpcomingManeuverAdapter.getClass();
                linkedHashSet.getClass();
                mapboxUpcomingManeuverAdapter.routeShields.addAll(linkedHashSet);
                List listSerializer = onContentCardDismissed.serializer(arrayList, 1);
                ArrayList arrayList5 = mapboxUpcomingManeuverAdapter.upcomingManeuverList;
                EnterExitTransitionKtshrinkVertically2 enterExitTransitionKtshrinkVertically2Serializer = getClear0nO6VwU.serializer(new MapboxManeuverDiffCallback(arrayList5, listSerializer));
                arrayList5.clear();
                arrayList5.addAll(listSerializer);
                enterExitTransitionKtshrinkVertically2Serializer.read(new getPlus0nO6VwU(mapboxUpcomingManeuverAdapter));
            }
        }
    }

    @Override // com.mapbox.common.location.GetLocationCallback
    public void run(Location location) {
        int i = 2 % 2;
        int i2 = this.$r8$classId;
        Object obj = this.f$0;
        Object obj2 = null;
        if (i2 == 4) {
            InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj;
            if (location != null) {
                ((ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1).b_(location);
            }
            int i3 = write + 17;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (i2 != 12) {
            LocationEngineAdapter locationEngineAdapter = (LocationEngineAdapter) obj;
            if (location == null) {
                locationEngineAdapter.startLocationListener();
                return;
            }
            Point pointFromLngLat = Point.fromLngLat(location.getLongitude(), location.getLatitude());
            pointFromLngLat.getClass();
            locationEngineAdapter.lastLocationInfo = new LocationEngineAdapter.LocationInfo(pointFromLngLat, System.currentTimeMillis());
            int i4 = RemoteActionCompatParcelizer + 33;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DisplayCallbacksImpl displayCallbacksImpl = (DisplayCallbacksImpl) obj;
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
            LoggerProviderKt.logD("last location callback " + location, "TripSessionLocationEngine");
        }
        if (location != null) {
            displayCallbacksImpl.handleReceivedLocation(location);
        }
        int i6 = write + 63;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }
}
