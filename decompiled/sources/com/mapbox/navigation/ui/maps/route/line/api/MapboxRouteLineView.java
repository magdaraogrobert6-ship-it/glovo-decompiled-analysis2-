package com.mapbox.navigation.ui.maps.route.line.api;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.ui.graphics.Fields;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl$applyTo$1;
import androidx.lifecycle.BlockRunner;
import androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1;
import androidx.room.Room;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import coil3.disk.DiskLruCache$launchCleanup$1;
import coil3.network.NetworkHeaders$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.common.LoggingLevel;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Point;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.Style;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.ViewAnnotationAnchorConfig;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.generated.LineLayer;
import com.mapbox.maps.extension.style.layers.generated.SkyLayer;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.IconAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.IconPitchAlignment;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.sources.Source;
import com.mapbox.maps.extension.style.sources.generated.GeoJsonSource;
import com.mapbox.maps.viewannotation.OnViewAnnotationUpdatedListener;
import com.mapbox.maps.viewannotation.ViewAnnotationManager;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.ui.maps.internal.extensions.MapboxStyleEx;
import com.mapbox.navigation.ui.maps.internal.route.callout.model.RouteCalloutData;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils$initializeLayers$77;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.mapbox.navigation.ui.maps.route.callout.api.RouteCalloutUiState;
import com.mapbox.navigation.ui.maps.route.callout.api.RouteCalloutUiStateData;
import com.mapbox.navigation.ui.maps.route.callout.model.RouteCallout;
import com.mapbox.navigation.ui.maps.route.line.RouteLineHistoryRecordingPusherProvider;
import com.mapbox.navigation.ui.maps.route.line.RouteLineHistoryRecordingViewSender;
import com.mapbox.navigation.ui.maps.route.line.RouteLineHistoryRecordingViewSender$sendRenderRouteDrawDataEvent$1$1;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineViewOptions;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineColorResources;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineFeatureId;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineScaleExpressions;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineSourceKey;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineTrimOffset;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.twofa.presentation.TwoFaViewModel$onPinChanged$1;
import com.sentiance.core.model.events.H$b;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerWhenMappings;
import o.DefaultInAppMessageViewWrapper;
import o.IconCompatParcelizer;
import o.ItemTouchHelperAdapter;
import o.ShortNewsContentCardView;
import o.SweepGradientShader9KIMszodefault;
import o.createFromParcel;
import o.dispatchKeyEventYhN2O0w;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.isItemDismissable;
import o.m2;
import o.onBackInvokedlambda0;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineView {
    public final Set blurLayerIds;
    public final ContextScope calculationScope;
    public final Set casingLayerIds;
    public final NetworkHeaders$Builder dataIdHolder;
    public RouteCalloutUiStateData lastRouteCalloutData;
    public final Set mainLayerIds;
    public final Set maskingRouteLineLayerGroup;
    public final OptionsHolder optionsHolder;
    public Set primaryRouteLineLayerGroup;
    public boolean rebuildLayersOnFirstRender;
    public final Set restrictedLayerIds;
    public BlockRunner routeCalloutView;
    public final CopyOnWriteArrayList routesAttachedToLayersObservers;
    public final NetworkHeaders$Builder routesExpector;
    public final H$b scope;
    public final RouteLineHistoryRecordingViewSender sender;
    public final LinkedHashMap sourceToFeatureMap;
    public final Set trafficLayerIds;
    public final Set trailCasingLayerIds;
    public final Set trailLayerIds;

    public final class OptionsHolder {
        public final RouteLineViewOptionsData data;
        public final MapboxRouteLineViewOptions options;

        public final int hashCode() {
            return this.options.hashCode();
        }

        public OptionsHolder(MapboxRouteLineViewOptions mapboxRouteLineViewOptions) {
            mapboxRouteLineViewOptions.getClass();
            this.options = mapboxRouteLineViewOptions;
            this.data = new RouteLineViewOptionsData(mapboxRouteLineViewOptions.routeLineColorResources, mapboxRouteLineViewOptions.scaleExpressions, mapboxRouteLineViewOptions.restrictedRoadDashArray, mapboxRouteLineViewOptions.restrictedRoadOpacity, mapboxRouteLineViewOptions.restrictedRoadLineWidth, false, mapboxRouteLineViewOptions.softGradientTransition, mapboxRouteLineViewOptions.originIconId, mapboxRouteLineViewOptions.destinationIconId, mapboxRouteLineViewOptions.waypointLayerIconOffset, mapboxRouteLineViewOptions.waypointLayerIconAnchor, mapboxRouteLineViewOptions.iconPitchAlignment, false, mapboxRouteLineViewOptions.routeLineBelowLayerId, mapboxRouteLineViewOptions.tolerance, false, 0.0d, mapboxRouteLineViewOptions.slotName, null, mapboxRouteLineViewOptions.routeLineBlurWidth, false, false, mapboxRouteLineViewOptions.routeLineBlurOpacity);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OptionsHolder)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.options, ((OptionsHolder) obj).options}, getCieXyz.write())).booleanValue();
        }

        public final String toString() {
            return "OptionsHolder(options=" + this.options + ')';
        }
    }

    /* JADX INFO: renamed from: com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$getGradientUpdateCommands$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public MapboxRouteLineView L$0;
        public Style L$1;
        public RouteLineViewOptionsData L$2;
        public Collection L$3;
        public Iterator L$4;
        public Collection L$5;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MapboxRouteLineView.this.getGradientUpdateCommands(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$getGradientUpdateCommands$5, reason: invalid class name */
    public final class AnonymousClass5 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass5(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MapboxRouteLineView.m4791access$getGradientUpdateCommandsNaG1Z1Q(MapboxRouteLineView.this, null, null, null, null, null, this);
        }
    }

    public static final ArrayList access$getMaskingLayerMoveCommands(MapboxRouteLineView mapboxRouteLineView, final Style style) {
        ArrayList arrayList = new ArrayList();
        final int i = 0;
        arrayList.add(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$getMaskingLayerMoveCommands$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = i;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                Style style2 = style;
                if (i2 == 0) {
                    style2.moveStyleLayer("mapbox-masking-layer-trailCasing", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i2 == 1) {
                    style2.moveStyleLayer("mapbox-masking-layer-trail", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i2 == 2) {
                    style2.moveStyleLayer("mapbox-masking-layer-casing", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i2 == 3) {
                    style2.moveStyleLayer("mapbox-masking-layer-main", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i2 != 4) {
                    style2.moveStyleLayer("mapbox-masking-layer-restricted", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                style2.moveStyleLayer("mapbox-masking-layer-traffic", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                return createfromparcel;
            }
        });
        final int i2 = 1;
        arrayList.add(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$getMaskingLayerMoveCommands$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = i2;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                Style style2 = style;
                if (i3 == 0) {
                    style2.moveStyleLayer("mapbox-masking-layer-trailCasing", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i3 == 1) {
                    style2.moveStyleLayer("mapbox-masking-layer-trail", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i3 == 2) {
                    style2.moveStyleLayer("mapbox-masking-layer-casing", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i3 == 3) {
                    style2.moveStyleLayer("mapbox-masking-layer-main", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i3 != 4) {
                    style2.moveStyleLayer("mapbox-masking-layer-restricted", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                style2.moveStyleLayer("mapbox-masking-layer-traffic", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                return createfromparcel;
            }
        });
        final int i3 = 2;
        arrayList.add(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$getMaskingLayerMoveCommands$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i4 = i3;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                Style style2 = style;
                if (i4 == 0) {
                    style2.moveStyleLayer("mapbox-masking-layer-trailCasing", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i4 == 1) {
                    style2.moveStyleLayer("mapbox-masking-layer-trail", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i4 == 2) {
                    style2.moveStyleLayer("mapbox-masking-layer-casing", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i4 == 3) {
                    style2.moveStyleLayer("mapbox-masking-layer-main", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i4 != 4) {
                    style2.moveStyleLayer("mapbox-masking-layer-restricted", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                style2.moveStyleLayer("mapbox-masking-layer-traffic", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                return createfromparcel;
            }
        });
        final int i4 = 3;
        arrayList.add(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$getMaskingLayerMoveCommands$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i5 = i4;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                Style style2 = style;
                if (i5 == 0) {
                    style2.moveStyleLayer("mapbox-masking-layer-trailCasing", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i5 == 1) {
                    style2.moveStyleLayer("mapbox-masking-layer-trail", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i5 == 2) {
                    style2.moveStyleLayer("mapbox-masking-layer-casing", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i5 == 3) {
                    style2.moveStyleLayer("mapbox-masking-layer-main", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i5 != 4) {
                    style2.moveStyleLayer("mapbox-masking-layer-restricted", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                style2.moveStyleLayer("mapbox-masking-layer-traffic", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                return createfromparcel;
            }
        });
        final int i5 = 4;
        arrayList.add(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$getMaskingLayerMoveCommands$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i6 = i5;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                Style style2 = style;
                if (i6 == 0) {
                    style2.moveStyleLayer("mapbox-masking-layer-trailCasing", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i6 == 1) {
                    style2.moveStyleLayer("mapbox-masking-layer-trail", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i6 == 2) {
                    style2.moveStyleLayer("mapbox-masking-layer-casing", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i6 == 3) {
                    style2.moveStyleLayer("mapbox-masking-layer-main", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i6 != 4) {
                    style2.moveStyleLayer("mapbox-masking-layer-restricted", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                style2.moveStyleLayer("mapbox-masking-layer-traffic", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                return createfromparcel;
            }
        });
        final int i6 = 5;
        arrayList.add(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$getMaskingLayerMoveCommands$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i7 = i6;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                Style style2 = style;
                if (i7 == 0) {
                    style2.moveStyleLayer("mapbox-masking-layer-trailCasing", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i7 == 1) {
                    style2.moveStyleLayer("mapbox-masking-layer-trail", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i7 == 2) {
                    style2.moveStyleLayer("mapbox-masking-layer-casing", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i7 == 3) {
                    style2.moveStyleLayer("mapbox-masking-layer-main", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                if (i7 != 4) {
                    style2.moveStyleLayer("mapbox-masking-layer-restricted", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    return createfromparcel;
                }
                style2.moveStyleLayer("mapbox-masking-layer-traffic", new LayerPosition(null, "mapbox-top-level-route-layer", null));
                return createfromparcel;
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: access$getSourceKeyForPrimaryRoute-IoAF18A, reason: not valid java name */
    public static final Object m4792access$getSourceKeyForPrimaryRouteIoAF18A(MapboxRouteLineView mapboxRouteLineView, Style style) {
        String str;
        try {
            MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
            String topRouteLineRelatedLayerId$ui_maps_release = MapboxRouteLineUtils.getTopRouteLineRelatedLayerId$ui_maps_release(style);
            if (topRouteLineRelatedLayerId$ui_maps_release == null) {
                throw new NoSuchElementException();
            }
            if (MapboxRouteLineUtils.layerGroup1SourceLayerIds.contains(topRouteLineRelatedLayerId$ui_maps_release)) {
                str = MapboxRouteLineUtils.layerGroup1SourceKey;
            } else if (MapboxRouteLineUtils.layerGroup2SourceLayerIds.contains(topRouteLineRelatedLayerId$ui_maps_release)) {
                str = MapboxRouteLineUtils.layerGroup2SourceKey;
            } else {
                if (!MapboxRouteLineUtils.layerGroup3SourceLayerIds.contains(topRouteLineRelatedLayerId$ui_maps_release)) {
                    throw new NoSuchElementException();
                }
                str = MapboxRouteLineUtils.layerGroup3SourceKey;
            }
            return new RouteLineSourceKey(str);
        } catch (Throwable th) {
            return new isItemDismissable(th);
        }
    }

    public static final RouteCalloutUiStateData access$toRouteCalloutUiState(MapboxRouteLineView mapboxRouteLineView, RouteCalloutData routeCalloutData) {
        RouteCalloutUiState routeCalloutUiState;
        List<RouteCallout> list = routeCalloutData.callouts;
        ArrayList arrayList = new ArrayList();
        for (RouteCallout routeCallout : list) {
            String str = (String) mapboxRouteLineView.getCurrentlyAttachedRoutesToLayers().get(routeCallout.route.id);
            if (str == null) {
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.WARNING)) {
                    LoggerProviderKt.logW("Layer for route [" + routeCallout.route.id + "] not found.", "MbxRouteLineView");
                }
                routeCalloutUiState = null;
            } else {
                routeCalloutUiState = new RouteCalloutUiState(routeCallout, str);
            }
            if (routeCalloutUiState != null) {
                arrayList.add(routeCalloutUiState);
            }
        }
        return new RouteCalloutUiStateData(arrayList);
    }

    public final LinkedHashMap getCurrentlyAttachedRoutesToLayers() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.sourceToFeatureMap.entrySet()) {
            String str = ((RouteLineSourceKey) entry.getKey()).sourceId;
            String str2 = ((RouteLineFeatureId) entry.getValue()).featureId;
            if (str2 != null) {
                Set set = (Set) MapboxRouteLineUtils.sourceLayerMap.get(new RouteLineSourceKey(str));
                String str3 = set != null ? (String) onContentCardDismissed.serializer((Iterable) onContentCardDismissed.read(set, this.mainLayerIds)) : null;
                if (str3 != null) {
                    linkedHashMap.put(str2, str3);
                }
            }
        }
        return linkedHashMap;
    }

    public final ConstraintSetForInlineDsl$applyTo$1 createTrimOffsetCommand(RouteLineDynamicData routeLineDynamicData, String str, Style style) {
        RouteLineTrimOffset routeLineTrimOffset;
        Expression expressionLiteral = null;
        Double dValueOf = (routeLineDynamicData == null || (routeLineTrimOffset = routeLineDynamicData.trimOffset) == null) ? null : Double.valueOf(routeLineTrimOffset.offset);
        if (routeLineDynamicData != null && dValueOf != null) {
            expressionLiteral = Room.literal(SQLite.read(Double.valueOf(1.0d - dValueOf.doubleValue()), Double.valueOf(1.0d)));
        }
        return new ConstraintSetForInlineDsl$applyTo$1(this, str, expressionLiteral, style);
    }

    public final void renderRouteLineUpdate(Style style, Expected expected) {
        expected.getClass();
        PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
        if (!PerformanceTracker.getTrackingIsActive()) {
            renderRouteLineUpdateInternal(style, expected);
            return;
        }
        PerformanceTracker.syncSectionStarted("MapboxRouteLineView#renderRouteLineUpdate");
        try {
            long jWrite = BrazeInAppMessageManagerWhenMappings.write();
            renderRouteLineUpdateInternal(style, expected);
            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxRouteLineView#renderRouteLineUpdate", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite)));
        } catch (Throwable th) {
            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxRouteLineView#renderRouteLineUpdate", null);
            throw th;
        }
    }

    public final void setCalloutAdapter(ViewAnnotationManager viewAnnotationManager, m2 m2Var) {
        viewAnnotationManager.getClass();
        BlockRunner blockRunner = this.routeCalloutView;
        if (blockRunner != null) {
            blockRunner.release();
        }
        viewAnnotationManager.getClass();
        final BlockRunner blockRunner2 = new BlockRunner();
        blockRunner2.read = viewAnnotationManager;
        blockRunner2.serializer = m2Var;
        OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener = new OnViewAnnotationUpdatedListener() { // from class: com.mapbox.navigation.ui.maps.internal.route.callout.api.MapboxRouteCalloutsView$onViewAnnotationUpdatedListener$1
            private static int IconCompatParcelizer = 0;
            private static int read = 1;

            @Override // com.mapbox.maps.viewannotation.OnViewAnnotationUpdatedListener
            public final void onViewAnnotationAnchorCoordinateUpdated(View view, Point point) {
                int i = 2 % 2;
                int i2 = read + 41;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                OnViewAnnotationUpdatedListener.DefaultImpls.onViewAnnotationAnchorCoordinateUpdated(this, view, point);
                int i4 = IconCompatParcelizer + 111;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }

            @Override // com.mapbox.maps.viewannotation.OnViewAnnotationUpdatedListener
            public final void onViewAnnotationPositionUpdated(View view, ScreenCoordinate screenCoordinate, double d, double d2) {
                int i = 2 % 2;
                int i2 = read + 95;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                OnViewAnnotationUpdatedListener.DefaultImpls.onViewAnnotationPositionUpdated(this, view, screenCoordinate, d, d2);
                int i4 = IconCompatParcelizer + 77;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }

            @Override // com.mapbox.maps.viewannotation.OnViewAnnotationUpdatedListener
            public final void onViewAnnotationVisibilityUpdated(View view, boolean z) {
                int i = 2 % 2;
                int i2 = IconCompatParcelizer + 125;
                read = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    OnViewAnnotationUpdatedListener.DefaultImpls.onViewAnnotationVisibilityUpdated(this, view, z);
                    int i3 = 69 / 0;
                } else {
                    OnViewAnnotationUpdatedListener.DefaultImpls.onViewAnnotationVisibilityUpdated(this, view, z);
                }
                int i4 = read + 17;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }

            @Override // com.mapbox.maps.viewannotation.OnViewAnnotationUpdatedListener
            public final void onViewAnnotationAnchorUpdated(View view, ViewAnnotationAnchorConfig viewAnnotationAnchorConfig) {
                int i = 2 % 2;
                int i2 = IconCompatParcelizer + 31;
                read = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                view.getClass();
                viewAnnotationAnchorConfig.getClass();
                m2 m2Var2 = (m2) blockRunner2.serializer;
                Context context = m2Var2.read;
                Object tag = view.getTag();
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{tag, 0}, getCieXyz.write())).booleanValue())) {
                    int i4 = read + 113;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        view.setBackground(m2Var2.read(viewAnnotationAnchorConfig, context.getColor(R.color.primary_light_01)));
                        return;
                    } else {
                        view.setBackground(m2Var2.read(viewAnnotationAnchorConfig, context.getColor(R.color.primary_light_01)));
                        int i5 = 57 / 0;
                        return;
                    }
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{tag, 1}, getCieXyz.write())).booleanValue()) {
                    view.setBackground(m2Var2.read(viewAnnotationAnchorConfig, context.getColor(R.color.primary_light_02)));
                }
                int i6 = read + 121;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        };
        blockRunner2.write = onViewAnnotationUpdatedListener;
        SearchOptionsKt$validateLimit$1 searchOptionsKt$validateLimit$1 = new SearchOptionsKt$validateLimit$1(16, blockRunner2);
        blockRunner2.RemoteActionCompatParcelizer = searchOptionsKt$validateLimit$1;
        blockRunner2.IconCompatParcelizer = new LinkedHashSet();
        viewAnnotationManager.addOnViewAnnotationUpdatedListener(onViewAnnotationUpdatedListener);
        CopyOnWriteArraySet copyOnWriteArraySet = m2Var.observers;
        if (!copyOnWriteArraySet.contains(searchOptionsKt$validateLimit$1)) {
            copyOnWriteArraySet.add(searchOptionsKt$validateLimit$1);
        }
        this.routeCalloutView = blockRunner2;
        RouteCalloutUiStateData routeCalloutUiStateData = this.lastRouteCalloutData;
        if (routeCalloutUiStateData != null) {
            blockRunner2.renderCallouts(routeCalloutUiStateData);
        }
    }

    public final void cancel() {
        BlockRunner blockRunner = this.routeCalloutView;
        if (blockRunner != null) {
            blockRunner.release();
        }
        this.routeCalloutView = null;
        RouteLineHistoryRecordingViewSender routeLineHistoryRecordingViewSender = this.sender;
        routeLineHistoryRecordingViewSender.getClass();
        RouteLineHistoryRecordingPusherProvider.instance.pushEventIfEnabled(new DiskLruCache$launchCleanup$1(routeLineHistoryRecordingViewSender, null, 8));
        JobKt.serializer(((ContextScope) this.scope.serializer).serializer);
        JobKt.serializer(this.calculationScope.serializer);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x011f  */
    /* JADX WARN: Code duplicated, block: B:54:0x014f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0150  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0150 -> B:56:0x0154). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object getGradientUpdateCommands(com.mapbox.maps.Style r19, java.util.Set r20, com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData r21, com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView.getGradientUpdateCommands(com.mapbox.maps.Style, java.util.Set, com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData, com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void renderRouteLineUpdateInternal(Style style, Expected expected) {
        String styleId = MapboxStyleEx.getStyleId(style);
        RouteLineHistoryRecordingViewSender routeLineHistoryRecordingViewSender = this.sender;
        routeLineHistoryRecordingViewSender.getClass();
        expected.getClass();
        RouteLineViewOptionsData routeLineViewOptionsData = routeLineHistoryRecordingViewSender.options;
        if (expected.isValue()) {
            RouteLineHistoryRecordingPusherProvider.instance.pushEventIfEnabled(new RouteLineHistoryRecordingViewSender$sendRenderRouteDrawDataEvent$1$1(routeLineHistoryRecordingViewSender, styleId, expected, routeLineViewOptionsData, null, 1));
        }
        expected.onValue(new MapboxRouteLineView$$ExternalSyntheticLambda2(this, style, 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object access$addLaunched(MapboxRouteLineView mapboxRouteLineView, List list, TwoFaViewModel$onPinChanged$1 twoFaViewModel$onPinChanged$1, ContinuationImpl continuationImpl) {
        MapboxRouteLineView$addLaunched$1 mapboxRouteLineView$addLaunched$1;
        if (continuationImpl instanceof MapboxRouteLineView$addLaunched$1) {
            mapboxRouteLineView$addLaunched$1 = (MapboxRouteLineView$addLaunched$1) continuationImpl;
            int i = mapboxRouteLineView$addLaunched$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mapboxRouteLineView$addLaunched$1.label = i - Integer.MIN_VALUE;
            } else {
                mapboxRouteLineView$addLaunched$1 = new MapboxRouteLineView$addLaunched$1(mapboxRouteLineView, continuationImpl);
            }
        } else {
            mapboxRouteLineView$addLaunched$1 = new MapboxRouteLineView$addLaunched$1(mapboxRouteLineView, continuationImpl);
        }
        Object objCoroutineScope = mapboxRouteLineView$addLaunched$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mapboxRouteLineView$addLaunched$1.label;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i3 = 1;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objCoroutineScope);
            LocalAuthDataSource.AnonymousClass2 anonymousClass2 = new LocalAuthDataSource.AnonymousClass2(twoFaViewModel$onPinChanged$1, shortNewsContentCardView, i3);
            mapboxRouteLineView$addLaunched$1.L$0 = list;
            mapboxRouteLineView$addLaunched$1.label = 1;
            objCoroutineScope = YieldKt.coroutineScope(anonymousClass2, mapboxRouteLineView$addLaunched$1);
            if (objCoroutineScope == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = mapboxRouteLineView$addLaunched$1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(objCoroutineScope);
        }
        list.add(objCoroutineScope);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: access$getGradientUpdateCommands-NaG1Z1Q, reason: not valid java name */
    public static final Object m4791access$getGradientUpdateCommandsNaG1Z1Q(MapboxRouteLineView mapboxRouteLineView, Style style, String str, RouteLineDynamicData routeLineDynamicData, Map map, RouteLineViewOptionsData routeLineViewOptionsData, ContinuationImpl continuationImpl) {
        AnonymousClass5 anonymousClass5;
        if (continuationImpl instanceof AnonymousClass5) {
            anonymousClass5 = (AnonymousClass5) continuationImpl;
            int i = anonymousClass5.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass5.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass5 = mapboxRouteLineView.new AnonymousClass5(continuationImpl);
            }
        } else {
            anonymousClass5 = mapboxRouteLineView.new AnonymousClass5(continuationImpl);
        }
        AnonymousClass5 anonymousClass6 = anonymousClass5;
        Object gradientUpdateCommands = anonymousClass6.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass6.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(gradientUpdateCommands);
            Set set = (Set) map.get(str != null ? new RouteLineSourceKey(str) : null);
            if (set != null) {
                anonymousClass6.label = 1;
                gradientUpdateCommands = mapboxRouteLineView.getGradientUpdateCommands(style, set, routeLineDynamicData, routeLineViewOptionsData, anonymousClass6);
                if (gradientUpdateCommands == obj) {
                    return obj;
                }
            }
            return instance_delegatelambda0.write;
        }
        if (i2 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(gradientUpdateCommands);
        List list = (List) gradientUpdateCommands;
        if (list != null) {
            return list;
        }
        return instance_delegatelambda0.write;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MapboxRouteLineView(MapboxRouteLineViewOptions mapboxRouteLineViewOptions) {
        mapboxRouteLineViewOptions.getClass();
        NetworkHeaders$Builder networkHeaders$Builder = new NetworkHeaders$Builder(4);
        NetworkHeaders$Builder networkHeaders$Builder2 = new NetworkHeaders$Builder(3);
        RouteLineHistoryRecordingViewSender routeLineHistoryRecordingViewSender = new RouteLineHistoryRecordingViewSender(1);
        this.routesExpector = networkHeaders$Builder;
        this.dataIdHolder = networkHeaders$Builder2;
        this.sender = routeLineHistoryRecordingViewSender;
        OptionsHolder optionsHolder = new OptionsHolder(mapboxRouteLineViewOptions);
        this.optionsHolder = optionsHolder;
        this.rebuildLayersOnFirstRender = true;
        this.primaryRouteLineLayerGroup = ItemTouchHelperAdapter.serializer;
        this.trailCasingLayerIds = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{"mapbox-layerGroup-1-trailCasing", "mapbox-layerGroup-2-trailCasing", "mapbox-layerGroup-3-trailCasing", "mapbox-masking-layer-trailCasing"});
        this.trailLayerIds = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{"mapbox-layerGroup-1-trail", "mapbox-layerGroup-2-trail", "mapbox-layerGroup-3-trail", "mapbox-masking-layer-trail"});
        this.casingLayerIds = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{"mapbox-layerGroup-1-casing", "mapbox-layerGroup-2-casing", "mapbox-layerGroup-3-casing", "mapbox-masking-layer-casing"});
        this.mainLayerIds = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{"mapbox-layerGroup-1-main", "mapbox-layerGroup-2-main", "mapbox-layerGroup-3-main", "mapbox-masking-layer-main"});
        this.trafficLayerIds = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{"mapbox-layerGroup-1-traffic", "mapbox-layerGroup-2-traffic", "mapbox-layerGroup-3-traffic", "mapbox-masking-layer-traffic"});
        this.restrictedLayerIds = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{"mapbox-layerGroup-1-restricted", "mapbox-layerGroup-2-restricted", "mapbox-layerGroup-3-restricted", "mapbox-masking-layer-restricted"});
        this.maskingRouteLineLayerGroup = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{"mapbox-masking-layer-main", "mapbox-masking-layer-casing", "mapbox-masking-layer-trail", "mapbox-masking-layer-traffic", "mapbox-masking-layer-trailCasing", "mapbox-masking-layer-restricted"});
        this.blurLayerIds = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{"mapbox-layerGroup-1-blur", "mapbox-layerGroup-2-blur", "mapbox-layerGroup-3-blur"});
        this.sourceToFeatureMap = onMove.IconCompatParcelizer(new onViewAttachedToWindowlambda0(new RouteLineSourceKey(MapboxRouteLineUtils.layerGroup1SourceKey), new RouteLineFeatureId(null)), new onViewAttachedToWindowlambda0(new RouteLineSourceKey(MapboxRouteLineUtils.layerGroup2SourceKey), new RouteLineFeatureId(0 == true ? 1 : 0)), new onViewAttachedToWindowlambda0(new RouteLineSourceKey(MapboxRouteLineUtils.layerGroup3SourceKey), new RouteLineFeatureId(0 == true ? 1 : 0)));
        onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        this.scope = new H$b(YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0Serializer, MainDispatcherLoader.read.IconCompatParcelizer())));
        this.calculationScope = YieldKt.RemoteActionCompatParcelizer(Room.read(UrlUtils.serializer(), prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer));
        this.routesAttachedToLayersObservers = new CopyOnWriteArrayList();
        RouteLineViewOptionsData routeLineViewOptionsData = optionsHolder.data;
        routeLineViewOptionsData.getClass();
        RouteLineHistoryRecordingPusherProvider.instance.pushEventOrAddToQueue(new FlowLiveDataConversions$asFlow$1$1((Object) routeLineHistoryRecordingViewSender, (Object) routeLineViewOptionsData, (ShortNewsContentCardView) (0 == true ? 1 : 0), 26));
        routeLineHistoryRecordingViewSender.options = routeLineViewOptionsData;
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
            LoggerProviderKt.logI("init routeLineViewOptions: " + mapboxRouteLineViewOptions, "MbxRouteLineView");
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0405  */
    /* JADX WARN: Code duplicated, block: B:102:0x0425  */
    /* JADX WARN: Code duplicated, block: B:105:0x042e  */
    /* JADX WARN: Code duplicated, block: B:107:0x044e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0459  */
    /* JADX WARN: Code duplicated, block: B:112:0x0479  */
    /* JADX WARN: Code duplicated, block: B:115:0x0482  */
    /* JADX WARN: Code duplicated, block: B:117:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:120:0x04af  */
    /* JADX WARN: Code duplicated, block: B:122:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:125:0x04da  */
    /* JADX WARN: Code duplicated, block: B:127:0x051a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0525  */
    /* JADX WARN: Code duplicated, block: B:132:0x0545  */
    /* JADX WARN: Code duplicated, block: B:135:0x0550  */
    /* JADX WARN: Code duplicated, block: B:137:0x0570  */
    /* JADX WARN: Code duplicated, block: B:140:0x057b  */
    /* JADX WARN: Code duplicated, block: B:142:0x059b  */
    /* JADX WARN: Code duplicated, block: B:145:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:147:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:150:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:152:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:155:0x0600  */
    /* JADX WARN: Code duplicated, block: B:157:0x0640  */
    /* JADX WARN: Code duplicated, block: B:160:0x064b  */
    /* JADX WARN: Code duplicated, block: B:162:0x066b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0676  */
    /* JADX WARN: Code duplicated, block: B:167:0x0696  */
    /* JADX WARN: Code duplicated, block: B:170:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:172:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:175:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:177:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:180:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:182:0x0717  */
    /* JADX WARN: Code duplicated, block: B:185:0x0722  */
    /* JADX WARN: Code duplicated, block: B:187:0x0742  */
    /* JADX WARN: Code duplicated, block: B:190:0x074d  */
    /* JADX WARN: Code duplicated, block: B:192:0x076f  */
    /* JADX WARN: Code duplicated, block: B:195:0x077a  */
    /* JADX WARN: Code duplicated, block: B:197:0x079c  */
    /* JADX WARN: Code duplicated, block: B:200:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:202:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:206:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:207:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:210:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:213:0x080f  */
    /* JADX WARN: Code duplicated, block: B:215:0x0893  */
    /* JADX WARN: Code duplicated, block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0315  */
    /* JADX WARN: Code duplicated, block: B:77:0x0329  */
    /* JADX WARN: Code duplicated, block: B:78:0x0339  */
    /* JADX WARN: Code duplicated, block: B:80:0x0347  */
    /* JADX WARN: Code duplicated, block: B:83:0x0359  */
    /* JADX WARN: Code duplicated, block: B:85:0x037c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0380  */
    /* JADX WARN: Code duplicated, block: B:89:0x038a  */
    /* JADX WARN: Code duplicated, block: B:91:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:92:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:95:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:97:0x03fa  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [android.graphics.Bitmap$Config, java.lang.Integer, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v12 */
    public static final void access$rebuildSourcesAndLayersIfNeeded(MapboxRouteLineView mapboxRouteLineView, Style style, MapboxRouteLineViewOptions mapboxRouteLineViewOptions) {
        String str;
        RouteLineScaleExpressions routeLineScaleExpressions;
        Style style2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        RouteLineScaleExpressions routeLineScaleExpressions2;
        Style style3;
        Double d;
        String str7;
        String str8;
        ?? r5;
        String str9;
        String str10;
        MapboxRouteLineViewOptions mapboxRouteLineViewOptions2;
        SymbolLayer symbolLayer;
        SkyLayer skyLayer;
        LineLayer lineLayerIconCompatParcelizer;
        LineLayer lineLayerIconCompatParcelizer2;
        LineLayer lineLayerIconCompatParcelizer3;
        LineLayer lineLayerIconCompatParcelizer4;
        LineLayer lineLayerIconCompatParcelizer5;
        LineLayer lineLayerIconCompatParcelizer6;
        LineLayer lineLayerIconCompatParcelizer7;
        LineLayer lineLayerIconCompatParcelizer8;
        LineLayer lineLayer;
        LineLayer lineLayerIconCompatParcelizer9;
        LineLayer lineLayerIconCompatParcelizer10;
        LineLayer lineLayerIconCompatParcelizer11;
        LineLayer lineLayerIconCompatParcelizer12;
        LineLayer lineLayerIconCompatParcelizer13;
        LineLayer lineLayer2;
        LineLayer lineLayerIconCompatParcelizer14;
        LineLayer lineLayerIconCompatParcelizer15;
        LineLayer lineLayerIconCompatParcelizer16;
        LineLayer lineLayerIconCompatParcelizer17;
        LineLayer lineLayerIconCompatParcelizer18;
        LineLayer lineLayer3;
        LineLayer lineLayerIconCompatParcelizer19;
        LineLayer lineLayerIconCompatParcelizer20;
        SkyLayer skyLayer2;
        Double dValueOf = Double.valueOf(0.0d);
        String str11 = "mapbox-masking-layer-casing";
        String str12 = "mapbox-masking-layer-trail";
        String str13 = "mapbox-masking-layer-trailCasing";
        String str14 = "mapbox-layerGroup-3-traffic";
        if (!mapboxRouteLineView.rebuildLayersOnFirstRender) {
            MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
            mapboxRouteLineViewOptions.getClass();
            if (style.styleSourceExists("mapbox-layerGroup:1:Source") && style.styleSourceExists("mapbox-layerGroup:2:Source") && style.styleSourceExists("mapbox-layerGroup:3:Source") && style.styleLayerExists("mapbox-top-level-route-layer") && style.styleLayerExists("mapbox-bottom-level-route-layer") && style.styleLayerExists("mapbox-layerGroup-1-trailCasing") && style.styleLayerExists("mapbox-layerGroup-1-trail") && style.styleLayerExists("mapbox-layerGroup-1-casing") && style.styleLayerExists("mapbox-layerGroup-1-main") && style.styleLayerExists("mapbox-layerGroup-1-traffic") && style.styleLayerExists("mapbox-layerGroup-2-trailCasing") && style.styleLayerExists("mapbox-layerGroup-2-trail") && style.styleLayerExists("mapbox-layerGroup-2-casing") && style.styleLayerExists("mapbox-layerGroup-2-main") && style.styleLayerExists("mapbox-layerGroup-2-traffic") && style.styleLayerExists("mapbox-layerGroup-3-trailCasing") && style.styleLayerExists("mapbox-layerGroup-3-trail") && style.styleLayerExists("mapbox-layerGroup-3-casing") && style.styleLayerExists("mapbox-layerGroup-3-main")) {
                if (!style.styleLayerExists(str14)) {
                    str14 = str14;
                } else if (!style.styleLayerExists(str13)) {
                    str14 = str14;
                    str13 = str13;
                } else if (!style.styleLayerExists(str12)) {
                    str14 = str14;
                    str13 = str13;
                    str12 = str12;
                } else if (!style.styleLayerExists(str11)) {
                    str14 = str14;
                    str13 = str13;
                    str12 = str12;
                    str11 = str11;
                } else if (style.styleLayerExists("mapbox-masking-layer-main") && style.styleLayerExists("mapbox-masking-layer-traffic")) {
                    str14 = str14;
                    str13 = str13;
                    str12 = str12;
                    str11 = str11;
                    return;
                }
            }
        }
        str14 = str14;
        str13 = str13;
        str12 = str12;
        str11 = str11;
        str14 = str14;
        str13 = str13;
        str12 = str12;
        str11 = str11;
        String str15 = str13;
        mapboxRouteLineView.rebuildLayersOnFirstRender = false;
        MapboxRouteLineUtils mapboxRouteLineUtils2 = MapboxRouteLineUtils.INSTANCE;
        StyleManager styleManager = style.getStyleManager();
        styleManager.getClass();
        styleManager.removeStyleLayer("mapbox-top-level-route-layer").getClass();
        styleManager.removeStyleLayer("mapbox-bottom-level-route-layer").getClass();
        styleManager.removeStyleLayer("mapbox-layerGroup-1-trailCasing").getClass();
        styleManager.removeStyleLayer("mapbox-layerGroup-1-trail").getClass();
        styleManager.removeStyleLayer("mapbox-layerGroup-1-casing").getClass();
        styleManager.removeStyleLayer("mapbox-layerGroup-1-main").getClass();
        styleManager.removeStyleLayer("mapbox-layerGroup-1-traffic").getClass();
        styleManager.removeStyleLayer("mapbox-layerGroup-1-restricted").getClass();
        styleManager.removeStyleLayer("mapbox-layerGroup-2-trailCasing").getClass();
        styleManager.removeStyleLayer("mapbox-layerGroup-2-trail").getClass();
        styleManager.removeStyleLayer("mapbox-layerGroup-2-casing").getClass();
        styleManager.removeStyleLayer("mapbox-layerGroup-2-main").getClass();
        styleManager.removeStyleLayer("mapbox-layerGroup-2-traffic").getClass();
        styleManager.removeStyleLayer("mapbox-layerGroup-2-restricted").getClass();
        styleManager.removeStyleLayer("mapbox-layerGroup-3-trailCasing").getClass();
        styleManager.removeStyleLayer("mapbox-layerGroup-3-trail").getClass();
        styleManager.removeStyleLayer("mapbox-layerGroup-3-casing").getClass();
        styleManager.removeStyleLayer("mapbox-layerGroup-3-main").getClass();
        String str16 = str14;
        styleManager.removeStyleLayer(str16).getClass();
        styleManager.removeStyleLayer("mapbox-layerGroup-3-restricted").getClass();
        styleManager.removeStyleLayer(str15).getClass();
        String str17 = str12;
        styleManager.removeStyleLayer(str17).getClass();
        String str18 = str11;
        styleManager.removeStyleLayer(str18).getClass();
        styleManager.removeStyleLayer("mapbox-masking-layer-main").getClass();
        styleManager.removeStyleLayer("mapbox-masking-layer-traffic").getClass();
        styleManager.removeStyleLayer("mapbox-masking-layer-restricted").getClass();
        styleManager.removeStyleLayer("mapbox-navigation-waypoint-layer").getClass();
        styleManager.removeStyleLayer("mapbox-layerGroup-1-blur").getClass();
        styleManager.removeStyleLayer("mapbox-layerGroup-2-blur").getClass();
        styleManager.removeStyleLayer("mapbox-layerGroup-3-blur").getClass();
        styleManager.removeStyleImage("originMarker").getClass();
        styleManager.removeStyleImage("destinationMarker").getClass();
        mapboxRouteLineViewOptions.getClass();
        String str19 = mapboxRouteLineViewOptions.slotName;
        double d2 = mapboxRouteLineViewOptions.routeLineBlurWidth;
        double d3 = mapboxRouteLineViewOptions.routeLineBlurOpacity;
        RouteLineColorResources routeLineColorResources = mapboxRouteLineViewOptions.routeLineColorResources;
        RouteLineScaleExpressions routeLineScaleExpressions3 = mapboxRouteLineViewOptions.scaleExpressions;
        boolean zContains = style.getStyleSlots().contains(str19);
        if (zContains) {
            str = str18;
        } else {
            str = str18;
            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                LoggerProviderKt.logE("The " + str19 + " slot is not present in the style.", "MapboxRouteLineUtils");
            }
        }
        String str20 = mapboxRouteLineViewOptions.routeLineBelowLayerId;
        if (str20 != null) {
            routeLineScaleExpressions = routeLineScaleExpressions3;
            style2 = style;
            boolean zStyleLayerExists = style2.styleLayerExists(str20);
            str2 = "mapbox-layerGroup-1-trailCasing";
            if (!zStyleLayerExists) {
                if (!zStyleLayerExists) {
                    LoggerProviderKt.logE("Layer " + str20 + " not found. Route line related layers will be placed at top of the map stack.", "MapboxRouteLineUtils");
                    str3 = null;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
            }
            new Expression(mapboxRouteLineViewOptions.restrictedRoadOpacity);
            str4 = str;
            str5 = str2;
            str6 = str3;
            routeLineScaleExpressions2 = routeLineScaleExpressions;
            style3 = style2;
            MapboxRouteLineUtils.addNewOrReuseSource(style, "mapbox-navigation-waypoint-source", mapboxRouteLineViewOptions.tolerance, false, false);
            MapboxRouteLineUtils.addNewOrReuseSource(style, "mapbox-layerGroup:1:Source", mapboxRouteLineViewOptions.tolerance, true, false);
            MapboxRouteLineUtils.addNewOrReuseSource(style, "mapbox-layerGroup:2:Source", mapboxRouteLineViewOptions.tolerance, true, false);
            MapboxRouteLineUtils.addNewOrReuseSource(style, "mapbox-layerGroup:3:Source", mapboxRouteLineViewOptions.tolerance, true, false);
            if (style3.styleLayerExists("mapbox-bottom-level-route-layer")) {
                d = dValueOf;
                str7 = str19;
                str8 = str6;
                r5 = 0;
            } else {
                skyLayer2 = new SkyLayer("mapbox-bottom-level-route-layer", 1);
                d = dValueOf;
                skyLayer2.setProperty$extension_style_release(new PropertyValue("background-opacity", d));
                if (zContains) {
                    str19.getClass();
                    str7 = str19;
                    skyLayer2.setProperty$extension_style_release(new PropertyValue("slot", str7));
                } else {
                    str7 = str19;
                }
                str8 = str6;
                r5 = 0;
                UrlUtils.addPersistentLayer(style3, skyLayer2, new LayerPosition(null, str8, null));
            }
            if (style3.styleLayerExists("mapbox-layerGroup-3-trailCasing")) {
                str9 = str8;
            } else {
                lineLayerIconCompatParcelizer20 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-3-trailCasing", "mapbox-layerGroup:3:Source");
                lineLayerIconCompatParcelizer20.lineWidth(routeLineScaleExpressions2.getRouteCasingLineScaleExpression());
                lineLayerIconCompatParcelizer20.lineEmissiveStrength();
                lineLayerIconCompatParcelizer20.lineColor(-7829368);
                IconCompatParcelizer.write(r5, str8, r5, style3, lineLayerIconCompatParcelizer20);
                str9 = str8;
                style3.setStyleLayerProperty(lineLayerIconCompatParcelizer20.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayerIconCompatParcelizer20.slot$1(str7);
                }
            }
            if (style3.styleLayerExists("mapbox-layerGroup-3-trail")) {
                str10 = str9;
            } else {
                lineLayerIconCompatParcelizer19 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-3-trail", "mapbox-layerGroup:3:Source");
                lineLayerIconCompatParcelizer19.lineWidth(routeLineScaleExpressions2.getRouteLineScaleExpression());
                lineLayerIconCompatParcelizer19.lineEmissiveStrength();
                lineLayerIconCompatParcelizer19.lineColor(-7829368);
                str10 = str9;
                IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer19);
                style3.setStyleLayerProperty(lineLayerIconCompatParcelizer19.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayerIconCompatParcelizer19.slot$1(str7);
                }
            }
            if (!style3.styleLayerExists("mapbox-layerGroup-3-blur")) {
                lineLayer3 = new LineLayer("mapbox-layerGroup-3-blur", "mapbox-layerGroup:3:Source");
                lineLayer3.setProperty$extension_style_release(new PropertyValue("line-opacity", Double.valueOf(d3)));
                lineLayer3.lineBlur(d2);
                lineLayer3.lineCap();
                lineLayer3.lineJoin();
                lineLayer3.lineWidth(routeLineScaleExpressions2.getRouteBlurScaleExpression());
                lineLayer3.lineEmissiveStrength();
                lineLayer3.lineColor(routeLineColorResources.getBlurColor());
                UrlUtils.addPersistentLayer(style3, lineLayer3, new LayerPosition(r5, str10, r5));
                style3.setStyleLayerProperty(lineLayer3.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayer3.slot$1(str7);
                }
            }
            if (!style3.styleLayerExists("mapbox-layerGroup-3-casing")) {
                lineLayerIconCompatParcelizer18 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-3-casing", "mapbox-layerGroup:3:Source");
                lineLayerIconCompatParcelizer18.lineWidth(routeLineScaleExpressions2.getRouteCasingLineScaleExpression());
                lineLayerIconCompatParcelizer18.lineEmissiveStrength();
                lineLayerIconCompatParcelizer18.lineColor(-7829368);
                IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer18);
                style3.setStyleLayerProperty(lineLayerIconCompatParcelizer18.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayerIconCompatParcelizer18.slot$1(str7);
                }
            }
            if (!style3.styleLayerExists("mapbox-layerGroup-3-main")) {
                lineLayerIconCompatParcelizer17 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-3-main", "mapbox-layerGroup:3:Source");
                lineLayerIconCompatParcelizer17.lineWidth(routeLineScaleExpressions2.getRouteLineScaleExpression());
                lineLayerIconCompatParcelizer17.lineEmissiveStrength();
                lineLayerIconCompatParcelizer17.lineColor(-7829368);
                IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer17);
                style3.setStyleLayerProperty(lineLayerIconCompatParcelizer17.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayerIconCompatParcelizer17.slot$1(str7);
                }
            }
            if (!style3.styleLayerExists(str16)) {
                lineLayerIconCompatParcelizer16 = SweepGradientShader9KIMszodefault.IconCompatParcelizer(str16, "mapbox-layerGroup:3:Source");
                lineLayerIconCompatParcelizer16.lineWidth(routeLineScaleExpressions2.getRouteTrafficLineScaleExpression());
                lineLayerIconCompatParcelizer16.lineEmissiveStrength();
                lineLayerIconCompatParcelizer16.lineColor(-7829368);
                IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer16);
                style3.setStyleLayerProperty(lineLayerIconCompatParcelizer16.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayerIconCompatParcelizer16.slot$1(str7);
                }
            }
            if (!style3.styleLayerExists("mapbox-layerGroup-2-trailCasing")) {
                lineLayerIconCompatParcelizer15 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-2-trailCasing", "mapbox-layerGroup:2:Source");
                lineLayerIconCompatParcelizer15.lineWidth(routeLineScaleExpressions2.getRouteCasingLineScaleExpression());
                lineLayerIconCompatParcelizer15.lineEmissiveStrength();
                lineLayerIconCompatParcelizer15.lineColor(-7829368);
                IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer15);
                style3.setStyleLayerProperty(lineLayerIconCompatParcelizer15.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayerIconCompatParcelizer15.slot$1(str7);
                }
            }
            if (!style3.styleLayerExists("mapbox-layerGroup-2-trail")) {
                lineLayerIconCompatParcelizer14 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-2-trail", "mapbox-layerGroup:2:Source");
                lineLayerIconCompatParcelizer14.lineWidth(routeLineScaleExpressions2.getRouteLineScaleExpression());
                lineLayerIconCompatParcelizer14.lineEmissiveStrength();
                lineLayerIconCompatParcelizer14.lineColor(-7829368);
                IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer14);
                style3.setStyleLayerProperty(lineLayerIconCompatParcelizer14.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayerIconCompatParcelizer14.slot$1(str7);
                }
            }
            if (!style3.styleLayerExists("mapbox-layerGroup-2-blur")) {
                lineLayer2 = new LineLayer("mapbox-layerGroup-2-blur", "mapbox-layerGroup:2:Source");
                lineLayer2.setProperty$extension_style_release(new PropertyValue("line-opacity", Double.valueOf(d3)));
                lineLayer2.lineBlur(d2);
                lineLayer2.lineCap();
                lineLayer2.lineJoin();
                lineLayer2.lineWidth(routeLineScaleExpressions2.getRouteBlurScaleExpression());
                lineLayer2.lineEmissiveStrength();
                lineLayer2.lineColor(routeLineColorResources.getBlurColor());
                UrlUtils.addPersistentLayer(style3, lineLayer2, new LayerPosition(r5, str10, r5));
                style3.setStyleLayerProperty(lineLayer2.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayer2.slot$1(str7);
                }
            }
            if (!style3.styleLayerExists("mapbox-layerGroup-2-casing")) {
                lineLayerIconCompatParcelizer13 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-2-casing", "mapbox-layerGroup:2:Source");
                lineLayerIconCompatParcelizer13.lineWidth(routeLineScaleExpressions2.getRouteCasingLineScaleExpression());
                lineLayerIconCompatParcelizer13.lineEmissiveStrength();
                lineLayerIconCompatParcelizer13.lineColor(-7829368);
                IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer13);
                style3.setStyleLayerProperty(lineLayerIconCompatParcelizer13.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayerIconCompatParcelizer13.slot$1(str7);
                }
            }
            if (!style3.styleLayerExists("mapbox-layerGroup-2-main")) {
                lineLayerIconCompatParcelizer12 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-2-main", "mapbox-layerGroup:2:Source");
                lineLayerIconCompatParcelizer12.lineWidth(routeLineScaleExpressions2.getRouteLineScaleExpression());
                lineLayerIconCompatParcelizer12.lineEmissiveStrength();
                lineLayerIconCompatParcelizer12.lineColor(-7829368);
                IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer12);
                style3.setStyleLayerProperty(lineLayerIconCompatParcelizer12.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayerIconCompatParcelizer12.slot$1(str7);
                }
            }
            if (!style3.styleLayerExists("mapbox-layerGroup-2-traffic")) {
                lineLayerIconCompatParcelizer11 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-2-traffic", "mapbox-layerGroup:2:Source");
                lineLayerIconCompatParcelizer11.lineWidth(routeLineScaleExpressions2.getRouteTrafficLineScaleExpression());
                lineLayerIconCompatParcelizer11.lineEmissiveStrength();
                lineLayerIconCompatParcelizer11.lineColor(-7829368);
                IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer11);
                style3.setStyleLayerProperty(lineLayerIconCompatParcelizer11.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayerIconCompatParcelizer11.slot$1(str7);
                }
            }
            if (!style3.styleLayerExists(str5)) {
                lineLayerIconCompatParcelizer10 = SweepGradientShader9KIMszodefault.IconCompatParcelizer(str5, "mapbox-layerGroup:1:Source");
                lineLayerIconCompatParcelizer10.lineWidth(routeLineScaleExpressions2.getRouteCasingLineScaleExpression());
                lineLayerIconCompatParcelizer10.lineEmissiveStrength();
                lineLayerIconCompatParcelizer10.lineColor(-7829368);
                IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer10);
                style3.setStyleLayerProperty(lineLayerIconCompatParcelizer10.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayerIconCompatParcelizer10.slot$1(str7);
                }
            }
            if (!style3.styleLayerExists("mapbox-layerGroup-1-trail")) {
                lineLayerIconCompatParcelizer9 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-1-trail", "mapbox-layerGroup:1:Source");
                lineLayerIconCompatParcelizer9.lineWidth(routeLineScaleExpressions2.getRouteLineScaleExpression());
                lineLayerIconCompatParcelizer9.lineEmissiveStrength();
                lineLayerIconCompatParcelizer9.lineColor(-7829368);
                IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer9);
                style3.setStyleLayerProperty(lineLayerIconCompatParcelizer9.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayerIconCompatParcelizer9.slot$1(str7);
                }
            }
            if (!style3.styleLayerExists("mapbox-layerGroup-1-blur")) {
                lineLayer = new LineLayer("mapbox-layerGroup-1-blur", "mapbox-layerGroup:1:Source");
                lineLayer.setProperty$extension_style_release(new PropertyValue("line-opacity", Double.valueOf(d3)));
                lineLayer.lineBlur(d2);
                lineLayer.lineCap();
                lineLayer.lineJoin();
                lineLayer.lineWidth(routeLineScaleExpressions2.getRouteBlurScaleExpression());
                lineLayer.lineEmissiveStrength();
                lineLayer.lineColor(routeLineColorResources.getBlurColor());
                UrlUtils.addPersistentLayer(style3, lineLayer, new LayerPosition(r5, str10, r5));
                style3.setStyleLayerProperty(lineLayer.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayer.slot$1(str7);
                }
            }
            if (!style3.styleLayerExists("mapbox-layerGroup-1-casing")) {
                lineLayerIconCompatParcelizer8 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-1-casing", "mapbox-layerGroup:1:Source");
                lineLayerIconCompatParcelizer8.lineWidth(routeLineScaleExpressions2.getRouteCasingLineScaleExpression());
                lineLayerIconCompatParcelizer8.lineEmissiveStrength();
                lineLayerIconCompatParcelizer8.lineColor(-7829368);
                IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer8);
                style3.setStyleLayerProperty(lineLayerIconCompatParcelizer8.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayerIconCompatParcelizer8.slot$1(str7);
                }
            }
            if (!style3.styleLayerExists("mapbox-layerGroup-1-main")) {
                lineLayerIconCompatParcelizer7 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-1-main", "mapbox-layerGroup:1:Source");
                lineLayerIconCompatParcelizer7.lineWidth(routeLineScaleExpressions2.getRouteLineScaleExpression());
                lineLayerIconCompatParcelizer7.lineEmissiveStrength();
                lineLayerIconCompatParcelizer7.lineColor(-7829368);
                IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer7);
                style3.setStyleLayerProperty(lineLayerIconCompatParcelizer7.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayerIconCompatParcelizer7.slot$1(str7);
                }
            }
            if (!style3.styleLayerExists("mapbox-layerGroup-1-traffic")) {
                lineLayerIconCompatParcelizer6 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-1-traffic", "mapbox-layerGroup:1:Source");
                lineLayerIconCompatParcelizer6.lineWidth(routeLineScaleExpressions2.getRouteTrafficLineScaleExpression());
                lineLayerIconCompatParcelizer6.lineEmissiveStrength();
                lineLayerIconCompatParcelizer6.lineColor(-7829368);
                IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer6);
                style3.setStyleLayerProperty(lineLayerIconCompatParcelizer6.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayerIconCompatParcelizer6.slot$1(str7);
                }
            }
            if (!style3.styleLayerExists(str15)) {
                lineLayerIconCompatParcelizer5 = SweepGradientShader9KIMszodefault.IconCompatParcelizer(str15, "mapbox-layerGroup:1:Source");
                lineLayerIconCompatParcelizer5.lineWidth(routeLineScaleExpressions2.getRouteCasingLineScaleExpression());
                lineLayerIconCompatParcelizer5.lineEmissiveStrength();
                lineLayerIconCompatParcelizer5.lineColor(-7829368);
                IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer5);
                style3.setStyleLayerProperty(lineLayerIconCompatParcelizer5.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayerIconCompatParcelizer5.slot$1(str7);
                }
            }
            if (!style3.styleLayerExists(str17)) {
                lineLayerIconCompatParcelizer4 = SweepGradientShader9KIMszodefault.IconCompatParcelizer(str17, "mapbox-layerGroup:1:Source");
                lineLayerIconCompatParcelizer4.lineWidth(routeLineScaleExpressions2.getRouteLineScaleExpression());
                lineLayerIconCompatParcelizer4.lineEmissiveStrength();
                lineLayerIconCompatParcelizer4.lineColor(-7829368);
                IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer4);
                style3.setStyleLayerProperty(lineLayerIconCompatParcelizer4.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayerIconCompatParcelizer4.slot$1(str7);
                }
            }
            if (!style3.styleLayerExists(str4)) {
                lineLayerIconCompatParcelizer3 = SweepGradientShader9KIMszodefault.IconCompatParcelizer(str4, "mapbox-layerGroup:1:Source");
                lineLayerIconCompatParcelizer3.lineWidth(routeLineScaleExpressions2.getRouteCasingLineScaleExpression());
                lineLayerIconCompatParcelizer3.lineEmissiveStrength();
                lineLayerIconCompatParcelizer3.lineColor(-7829368);
                IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer3);
                style3.setStyleLayerProperty(lineLayerIconCompatParcelizer3.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayerIconCompatParcelizer3.slot$1(str7);
                }
            }
            if (!style3.styleLayerExists("mapbox-masking-layer-main")) {
                lineLayerIconCompatParcelizer2 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-masking-layer-main", "mapbox-layerGroup:1:Source");
                lineLayerIconCompatParcelizer2.lineWidth(routeLineScaleExpressions2.getRouteLineScaleExpression());
                lineLayerIconCompatParcelizer2.lineEmissiveStrength();
                lineLayerIconCompatParcelizer2.lineColor(-7829368);
                IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer2);
                style3.setStyleLayerProperty(lineLayerIconCompatParcelizer2.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayerIconCompatParcelizer2.slot$1(str7);
                }
            }
            if (!style3.styleLayerExists("mapbox-masking-layer-traffic")) {
                lineLayerIconCompatParcelizer = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-masking-layer-traffic", "mapbox-layerGroup:1:Source");
                lineLayerIconCompatParcelizer.lineWidth(routeLineScaleExpressions2.getRouteTrafficLineScaleExpression());
                lineLayerIconCompatParcelizer.lineEmissiveStrength();
                lineLayerIconCompatParcelizer.lineColor(-7829368);
                IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer);
                style3.setStyleLayerProperty(lineLayerIconCompatParcelizer.layerId, "line-depth-occlusion-factor", new Value(0.0d));
                if (zContains) {
                    lineLayerIconCompatParcelizer.slot$1(str7);
                }
            }
            if (!style3.styleLayerExists("mapbox-top-level-route-layer")) {
                skyLayer = new SkyLayer("mapbox-top-level-route-layer", 1);
                skyLayer.setProperty$extension_style_release(new PropertyValue("background-opacity", d));
                if (zContains) {
                    str7.getClass();
                    skyLayer.setProperty$extension_style_release(new PropertyValue("slot", str7));
                }
                UrlUtils.addPersistentLayer(style3, skyLayer, new LayerPosition(r5, str10, r5));
            }
            if (style3.hasStyleImage("originMarker")) {
                mapboxRouteLineViewOptions2 = mapboxRouteLineViewOptions;
            } else {
                mapboxRouteLineViewOptions2 = mapboxRouteLineViewOptions;
                Drawable drawable = mapboxRouteLineViewOptions2.originWaypointIcon;
                style3.addImage("originMarker", dispatchKeyEventYhN2O0w.read(drawable, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), r5));
            }
            if (!style3.hasStyleImage("destinationMarker")) {
                Drawable drawable2 = mapboxRouteLineViewOptions2.destinationWaypointIcon;
                style3.addImage("destinationMarker", dispatchKeyEventYhN2O0w.read(drawable2, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight(), r5));
            }
            if (style3.styleLayerExists("mapbox-navigation-waypoint-layer")) {
            }
            symbolLayer = new SymbolLayer("mapbox-navigation-waypoint-layer", "mapbox-navigation-waypoint-source");
            List list = mapboxRouteLineViewOptions2.waypointLayerIconOffset;
            list.getClass();
            symbolLayer.setProperty$extension_style_release(new PropertyValue("icon-offset", list));
            IconAnchor iconAnchor = mapboxRouteLineViewOptions2.waypointLayerIconAnchor;
            iconAnchor.getClass();
            symbolLayer.setProperty$extension_style_release(new PropertyValue("icon-anchor", iconAnchor));
            Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("match");
            Expression.ExpressionBuilder expressionBuilder2 = new Expression.ExpressionBuilder("to-string");
            Expression.ExpressionBuilder expressionBuilder3 = new Expression.ExpressionBuilder("get");
            expressionBuilder3.literal("wayPoint");
            expressionBuilder2.arguments.add(expressionBuilder3.build());
            expressionBuilder.arguments.add(expressionBuilder2.build());
            expressionBuilder.literal("origin");
            expressionBuilder.literal("originMarker");
            expressionBuilder.literal("destination");
            expressionBuilder.literal("destinationMarker");
            expressionBuilder.literal("originMarker");
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-image", expressionBuilder.build(), symbolLayer);
            MapboxRouteLineUtils$initializeLayers$77 mapboxRouteLineUtils$initializeLayers$77 = MapboxRouteLineUtils$initializeLayers$77.INSTANCE;
            Expression.InterpolatorBuilder interpolatorBuilder = new Expression.InterpolatorBuilder();
            mapboxRouteLineUtils$initializeLayers$77.invoke(interpolatorBuilder);
            symbolLayer.iconSize(interpolatorBuilder.build());
            if (zContains) {
                symbolLayer.slot$2(str7);
            }
            IconPitchAlignment iconPitchAlignment = mapboxRouteLineViewOptions2.iconPitchAlignment;
            iconPitchAlignment.getClass();
            symbolLayer.setProperty$extension_style_release(new PropertyValue("icon-pitch-alignment", iconPitchAlignment));
            Boolean bool = Boolean.TRUE;
            symbolLayer.setProperty$extension_style_release(new PropertyValue("icon-allow-overlap", bool));
            symbolLayer.setProperty$extension_style_release(new PropertyValue("icon-ignore-placement", bool));
            symbolLayer.setProperty$extension_style_release(new PropertyValue("icon-keep-upright", bool));
            UrlUtils.addPersistentLayer(style3, symbolLayer, new LayerPosition(r5, str10, r5));
        }
        str2 = "mapbox-layerGroup-1-trailCasing";
        routeLineScaleExpressions = routeLineScaleExpressions3;
        style2 = style;
        str3 = str20;
        new Expression(mapboxRouteLineViewOptions.restrictedRoadOpacity);
        str4 = str;
        str5 = str2;
        str6 = str3;
        routeLineScaleExpressions2 = routeLineScaleExpressions;
        style3 = style2;
        MapboxRouteLineUtils.addNewOrReuseSource(style, "mapbox-navigation-waypoint-source", mapboxRouteLineViewOptions.tolerance, false, false);
        MapboxRouteLineUtils.addNewOrReuseSource(style, "mapbox-layerGroup:1:Source", mapboxRouteLineViewOptions.tolerance, true, false);
        MapboxRouteLineUtils.addNewOrReuseSource(style, "mapbox-layerGroup:2:Source", mapboxRouteLineViewOptions.tolerance, true, false);
        MapboxRouteLineUtils.addNewOrReuseSource(style, "mapbox-layerGroup:3:Source", mapboxRouteLineViewOptions.tolerance, true, false);
        if (style3.styleLayerExists("mapbox-bottom-level-route-layer")) {
            skyLayer2 = new SkyLayer("mapbox-bottom-level-route-layer", 1);
            d = dValueOf;
            skyLayer2.setProperty$extension_style_release(new PropertyValue("background-opacity", d));
            if (zContains) {
                str19.getClass();
                str7 = str19;
                skyLayer2.setProperty$extension_style_release(new PropertyValue("slot", str7));
            } else {
                str7 = str19;
            }
            str8 = str6;
            r5 = 0;
            UrlUtils.addPersistentLayer(style3, skyLayer2, new LayerPosition(null, str8, null));
        } else {
            d = dValueOf;
            str7 = str19;
            str8 = str6;
            r5 = 0;
        }
        if (style3.styleLayerExists("mapbox-layerGroup-3-trailCasing")) {
            lineLayerIconCompatParcelizer20 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-3-trailCasing", "mapbox-layerGroup:3:Source");
            lineLayerIconCompatParcelizer20.lineWidth(routeLineScaleExpressions2.getRouteCasingLineScaleExpression());
            lineLayerIconCompatParcelizer20.lineEmissiveStrength();
            lineLayerIconCompatParcelizer20.lineColor(-7829368);
            IconCompatParcelizer.write(r5, str8, r5, style3, lineLayerIconCompatParcelizer20);
            str9 = str8;
            style3.setStyleLayerProperty(lineLayerIconCompatParcelizer20.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayerIconCompatParcelizer20.slot$1(str7);
            }
        } else {
            str9 = str8;
        }
        if (style3.styleLayerExists("mapbox-layerGroup-3-trail")) {
            lineLayerIconCompatParcelizer19 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-3-trail", "mapbox-layerGroup:3:Source");
            lineLayerIconCompatParcelizer19.lineWidth(routeLineScaleExpressions2.getRouteLineScaleExpression());
            lineLayerIconCompatParcelizer19.lineEmissiveStrength();
            lineLayerIconCompatParcelizer19.lineColor(-7829368);
            str10 = str9;
            IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer19);
            style3.setStyleLayerProperty(lineLayerIconCompatParcelizer19.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayerIconCompatParcelizer19.slot$1(str7);
            }
        } else {
            str10 = str9;
        }
        if (!style3.styleLayerExists("mapbox-layerGroup-3-blur")) {
            lineLayer3 = new LineLayer("mapbox-layerGroup-3-blur", "mapbox-layerGroup:3:Source");
            lineLayer3.setProperty$extension_style_release(new PropertyValue("line-opacity", Double.valueOf(d3)));
            lineLayer3.lineBlur(d2);
            lineLayer3.lineCap();
            lineLayer3.lineJoin();
            lineLayer3.lineWidth(routeLineScaleExpressions2.getRouteBlurScaleExpression());
            lineLayer3.lineEmissiveStrength();
            lineLayer3.lineColor(routeLineColorResources.getBlurColor());
            UrlUtils.addPersistentLayer(style3, lineLayer3, new LayerPosition(r5, str10, r5));
            style3.setStyleLayerProperty(lineLayer3.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayer3.slot$1(str7);
            }
        }
        if (!style3.styleLayerExists("mapbox-layerGroup-3-casing")) {
            lineLayerIconCompatParcelizer18 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-3-casing", "mapbox-layerGroup:3:Source");
            lineLayerIconCompatParcelizer18.lineWidth(routeLineScaleExpressions2.getRouteCasingLineScaleExpression());
            lineLayerIconCompatParcelizer18.lineEmissiveStrength();
            lineLayerIconCompatParcelizer18.lineColor(-7829368);
            IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer18);
            style3.setStyleLayerProperty(lineLayerIconCompatParcelizer18.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayerIconCompatParcelizer18.slot$1(str7);
            }
        }
        if (!style3.styleLayerExists("mapbox-layerGroup-3-main")) {
            lineLayerIconCompatParcelizer17 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-3-main", "mapbox-layerGroup:3:Source");
            lineLayerIconCompatParcelizer17.lineWidth(routeLineScaleExpressions2.getRouteLineScaleExpression());
            lineLayerIconCompatParcelizer17.lineEmissiveStrength();
            lineLayerIconCompatParcelizer17.lineColor(-7829368);
            IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer17);
            style3.setStyleLayerProperty(lineLayerIconCompatParcelizer17.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayerIconCompatParcelizer17.slot$1(str7);
            }
        }
        if (!style3.styleLayerExists(str16)) {
            lineLayerIconCompatParcelizer16 = SweepGradientShader9KIMszodefault.IconCompatParcelizer(str16, "mapbox-layerGroup:3:Source");
            lineLayerIconCompatParcelizer16.lineWidth(routeLineScaleExpressions2.getRouteTrafficLineScaleExpression());
            lineLayerIconCompatParcelizer16.lineEmissiveStrength();
            lineLayerIconCompatParcelizer16.lineColor(-7829368);
            IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer16);
            style3.setStyleLayerProperty(lineLayerIconCompatParcelizer16.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayerIconCompatParcelizer16.slot$1(str7);
            }
        }
        if (!style3.styleLayerExists("mapbox-layerGroup-2-trailCasing")) {
            lineLayerIconCompatParcelizer15 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-2-trailCasing", "mapbox-layerGroup:2:Source");
            lineLayerIconCompatParcelizer15.lineWidth(routeLineScaleExpressions2.getRouteCasingLineScaleExpression());
            lineLayerIconCompatParcelizer15.lineEmissiveStrength();
            lineLayerIconCompatParcelizer15.lineColor(-7829368);
            IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer15);
            style3.setStyleLayerProperty(lineLayerIconCompatParcelizer15.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayerIconCompatParcelizer15.slot$1(str7);
            }
        }
        if (!style3.styleLayerExists("mapbox-layerGroup-2-trail")) {
            lineLayerIconCompatParcelizer14 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-2-trail", "mapbox-layerGroup:2:Source");
            lineLayerIconCompatParcelizer14.lineWidth(routeLineScaleExpressions2.getRouteLineScaleExpression());
            lineLayerIconCompatParcelizer14.lineEmissiveStrength();
            lineLayerIconCompatParcelizer14.lineColor(-7829368);
            IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer14);
            style3.setStyleLayerProperty(lineLayerIconCompatParcelizer14.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayerIconCompatParcelizer14.slot$1(str7);
            }
        }
        if (!style3.styleLayerExists("mapbox-layerGroup-2-blur")) {
            lineLayer2 = new LineLayer("mapbox-layerGroup-2-blur", "mapbox-layerGroup:2:Source");
            lineLayer2.setProperty$extension_style_release(new PropertyValue("line-opacity", Double.valueOf(d3)));
            lineLayer2.lineBlur(d2);
            lineLayer2.lineCap();
            lineLayer2.lineJoin();
            lineLayer2.lineWidth(routeLineScaleExpressions2.getRouteBlurScaleExpression());
            lineLayer2.lineEmissiveStrength();
            lineLayer2.lineColor(routeLineColorResources.getBlurColor());
            UrlUtils.addPersistentLayer(style3, lineLayer2, new LayerPosition(r5, str10, r5));
            style3.setStyleLayerProperty(lineLayer2.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayer2.slot$1(str7);
            }
        }
        if (!style3.styleLayerExists("mapbox-layerGroup-2-casing")) {
            lineLayerIconCompatParcelizer13 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-2-casing", "mapbox-layerGroup:2:Source");
            lineLayerIconCompatParcelizer13.lineWidth(routeLineScaleExpressions2.getRouteCasingLineScaleExpression());
            lineLayerIconCompatParcelizer13.lineEmissiveStrength();
            lineLayerIconCompatParcelizer13.lineColor(-7829368);
            IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer13);
            style3.setStyleLayerProperty(lineLayerIconCompatParcelizer13.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayerIconCompatParcelizer13.slot$1(str7);
            }
        }
        if (!style3.styleLayerExists("mapbox-layerGroup-2-main")) {
            lineLayerIconCompatParcelizer12 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-2-main", "mapbox-layerGroup:2:Source");
            lineLayerIconCompatParcelizer12.lineWidth(routeLineScaleExpressions2.getRouteLineScaleExpression());
            lineLayerIconCompatParcelizer12.lineEmissiveStrength();
            lineLayerIconCompatParcelizer12.lineColor(-7829368);
            IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer12);
            style3.setStyleLayerProperty(lineLayerIconCompatParcelizer12.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayerIconCompatParcelizer12.slot$1(str7);
            }
        }
        if (!style3.styleLayerExists("mapbox-layerGroup-2-traffic")) {
            lineLayerIconCompatParcelizer11 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-2-traffic", "mapbox-layerGroup:2:Source");
            lineLayerIconCompatParcelizer11.lineWidth(routeLineScaleExpressions2.getRouteTrafficLineScaleExpression());
            lineLayerIconCompatParcelizer11.lineEmissiveStrength();
            lineLayerIconCompatParcelizer11.lineColor(-7829368);
            IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer11);
            style3.setStyleLayerProperty(lineLayerIconCompatParcelizer11.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayerIconCompatParcelizer11.slot$1(str7);
            }
        }
        if (!style3.styleLayerExists(str5)) {
            lineLayerIconCompatParcelizer10 = SweepGradientShader9KIMszodefault.IconCompatParcelizer(str5, "mapbox-layerGroup:1:Source");
            lineLayerIconCompatParcelizer10.lineWidth(routeLineScaleExpressions2.getRouteCasingLineScaleExpression());
            lineLayerIconCompatParcelizer10.lineEmissiveStrength();
            lineLayerIconCompatParcelizer10.lineColor(-7829368);
            IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer10);
            style3.setStyleLayerProperty(lineLayerIconCompatParcelizer10.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayerIconCompatParcelizer10.slot$1(str7);
            }
        }
        if (!style3.styleLayerExists("mapbox-layerGroup-1-trail")) {
            lineLayerIconCompatParcelizer9 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-1-trail", "mapbox-layerGroup:1:Source");
            lineLayerIconCompatParcelizer9.lineWidth(routeLineScaleExpressions2.getRouteLineScaleExpression());
            lineLayerIconCompatParcelizer9.lineEmissiveStrength();
            lineLayerIconCompatParcelizer9.lineColor(-7829368);
            IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer9);
            style3.setStyleLayerProperty(lineLayerIconCompatParcelizer9.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayerIconCompatParcelizer9.slot$1(str7);
            }
        }
        if (!style3.styleLayerExists("mapbox-layerGroup-1-blur")) {
            lineLayer = new LineLayer("mapbox-layerGroup-1-blur", "mapbox-layerGroup:1:Source");
            lineLayer.setProperty$extension_style_release(new PropertyValue("line-opacity", Double.valueOf(d3)));
            lineLayer.lineBlur(d2);
            lineLayer.lineCap();
            lineLayer.lineJoin();
            lineLayer.lineWidth(routeLineScaleExpressions2.getRouteBlurScaleExpression());
            lineLayer.lineEmissiveStrength();
            lineLayer.lineColor(routeLineColorResources.getBlurColor());
            UrlUtils.addPersistentLayer(style3, lineLayer, new LayerPosition(r5, str10, r5));
            style3.setStyleLayerProperty(lineLayer.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayer.slot$1(str7);
            }
        }
        if (!style3.styleLayerExists("mapbox-layerGroup-1-casing")) {
            lineLayerIconCompatParcelizer8 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-1-casing", "mapbox-layerGroup:1:Source");
            lineLayerIconCompatParcelizer8.lineWidth(routeLineScaleExpressions2.getRouteCasingLineScaleExpression());
            lineLayerIconCompatParcelizer8.lineEmissiveStrength();
            lineLayerIconCompatParcelizer8.lineColor(-7829368);
            IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer8);
            style3.setStyleLayerProperty(lineLayerIconCompatParcelizer8.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayerIconCompatParcelizer8.slot$1(str7);
            }
        }
        if (!style3.styleLayerExists("mapbox-layerGroup-1-main")) {
            lineLayerIconCompatParcelizer7 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-1-main", "mapbox-layerGroup:1:Source");
            lineLayerIconCompatParcelizer7.lineWidth(routeLineScaleExpressions2.getRouteLineScaleExpression());
            lineLayerIconCompatParcelizer7.lineEmissiveStrength();
            lineLayerIconCompatParcelizer7.lineColor(-7829368);
            IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer7);
            style3.setStyleLayerProperty(lineLayerIconCompatParcelizer7.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayerIconCompatParcelizer7.slot$1(str7);
            }
        }
        if (!style3.styleLayerExists("mapbox-layerGroup-1-traffic")) {
            lineLayerIconCompatParcelizer6 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-layerGroup-1-traffic", "mapbox-layerGroup:1:Source");
            lineLayerIconCompatParcelizer6.lineWidth(routeLineScaleExpressions2.getRouteTrafficLineScaleExpression());
            lineLayerIconCompatParcelizer6.lineEmissiveStrength();
            lineLayerIconCompatParcelizer6.lineColor(-7829368);
            IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer6);
            style3.setStyleLayerProperty(lineLayerIconCompatParcelizer6.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayerIconCompatParcelizer6.slot$1(str7);
            }
        }
        if (!style3.styleLayerExists(str15)) {
            lineLayerIconCompatParcelizer5 = SweepGradientShader9KIMszodefault.IconCompatParcelizer(str15, "mapbox-layerGroup:1:Source");
            lineLayerIconCompatParcelizer5.lineWidth(routeLineScaleExpressions2.getRouteCasingLineScaleExpression());
            lineLayerIconCompatParcelizer5.lineEmissiveStrength();
            lineLayerIconCompatParcelizer5.lineColor(-7829368);
            IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer5);
            style3.setStyleLayerProperty(lineLayerIconCompatParcelizer5.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayerIconCompatParcelizer5.slot$1(str7);
            }
        }
        if (!style3.styleLayerExists(str17)) {
            lineLayerIconCompatParcelizer4 = SweepGradientShader9KIMszodefault.IconCompatParcelizer(str17, "mapbox-layerGroup:1:Source");
            lineLayerIconCompatParcelizer4.lineWidth(routeLineScaleExpressions2.getRouteLineScaleExpression());
            lineLayerIconCompatParcelizer4.lineEmissiveStrength();
            lineLayerIconCompatParcelizer4.lineColor(-7829368);
            IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer4);
            style3.setStyleLayerProperty(lineLayerIconCompatParcelizer4.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayerIconCompatParcelizer4.slot$1(str7);
            }
        }
        if (!style3.styleLayerExists(str4)) {
            lineLayerIconCompatParcelizer3 = SweepGradientShader9KIMszodefault.IconCompatParcelizer(str4, "mapbox-layerGroup:1:Source");
            lineLayerIconCompatParcelizer3.lineWidth(routeLineScaleExpressions2.getRouteCasingLineScaleExpression());
            lineLayerIconCompatParcelizer3.lineEmissiveStrength();
            lineLayerIconCompatParcelizer3.lineColor(-7829368);
            IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer3);
            style3.setStyleLayerProperty(lineLayerIconCompatParcelizer3.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayerIconCompatParcelizer3.slot$1(str7);
            }
        }
        if (!style3.styleLayerExists("mapbox-masking-layer-main")) {
            lineLayerIconCompatParcelizer2 = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-masking-layer-main", "mapbox-layerGroup:1:Source");
            lineLayerIconCompatParcelizer2.lineWidth(routeLineScaleExpressions2.getRouteLineScaleExpression());
            lineLayerIconCompatParcelizer2.lineEmissiveStrength();
            lineLayerIconCompatParcelizer2.lineColor(-7829368);
            IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer2);
            style3.setStyleLayerProperty(lineLayerIconCompatParcelizer2.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayerIconCompatParcelizer2.slot$1(str7);
            }
        }
        if (!style3.styleLayerExists("mapbox-masking-layer-traffic")) {
            lineLayerIconCompatParcelizer = SweepGradientShader9KIMszodefault.IconCompatParcelizer("mapbox-masking-layer-traffic", "mapbox-layerGroup:1:Source");
            lineLayerIconCompatParcelizer.lineWidth(routeLineScaleExpressions2.getRouteTrafficLineScaleExpression());
            lineLayerIconCompatParcelizer.lineEmissiveStrength();
            lineLayerIconCompatParcelizer.lineColor(-7829368);
            IconCompatParcelizer.write(r5, str10, r5, style3, lineLayerIconCompatParcelizer);
            style3.setStyleLayerProperty(lineLayerIconCompatParcelizer.layerId, "line-depth-occlusion-factor", new Value(0.0d));
            if (zContains) {
                lineLayerIconCompatParcelizer.slot$1(str7);
            }
        }
        if (!style3.styleLayerExists("mapbox-top-level-route-layer")) {
            skyLayer = new SkyLayer("mapbox-top-level-route-layer", 1);
            skyLayer.setProperty$extension_style_release(new PropertyValue("background-opacity", d));
            if (zContains) {
                str7.getClass();
                skyLayer.setProperty$extension_style_release(new PropertyValue("slot", str7));
            }
            UrlUtils.addPersistentLayer(style3, skyLayer, new LayerPosition(r5, str10, r5));
        }
        if (style3.hasStyleImage("originMarker")) {
            mapboxRouteLineViewOptions2 = mapboxRouteLineViewOptions;
            Drawable drawable3 = mapboxRouteLineViewOptions2.originWaypointIcon;
            style3.addImage("originMarker", dispatchKeyEventYhN2O0w.read(drawable3, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight(), r5));
        } else {
            mapboxRouteLineViewOptions2 = mapboxRouteLineViewOptions;
        }
        if (!style3.hasStyleImage("destinationMarker")) {
            Drawable drawable4 = mapboxRouteLineViewOptions2.destinationWaypointIcon;
            style3.addImage("destinationMarker", dispatchKeyEventYhN2O0w.read(drawable4, drawable4.getIntrinsicWidth(), drawable4.getIntrinsicHeight(), r5));
        }
        if (style3.styleLayerExists("mapbox-navigation-waypoint-layer")) {
            symbolLayer = new SymbolLayer("mapbox-navigation-waypoint-layer", "mapbox-navigation-waypoint-source");
            List list2 = mapboxRouteLineViewOptions2.waypointLayerIconOffset;
            list2.getClass();
            symbolLayer.setProperty$extension_style_release(new PropertyValue("icon-offset", list2));
            IconAnchor iconAnchor2 = mapboxRouteLineViewOptions2.waypointLayerIconAnchor;
            iconAnchor2.getClass();
            symbolLayer.setProperty$extension_style_release(new PropertyValue("icon-anchor", iconAnchor2));
            Expression.ExpressionBuilder expressionBuilder4 = new Expression.ExpressionBuilder("match");
            Expression.ExpressionBuilder expressionBuilder5 = new Expression.ExpressionBuilder("to-string");
            Expression.ExpressionBuilder expressionBuilder6 = new Expression.ExpressionBuilder("get");
            expressionBuilder6.literal("wayPoint");
            expressionBuilder5.arguments.add(expressionBuilder6.build());
            expressionBuilder4.arguments.add(expressionBuilder5.build());
            expressionBuilder4.literal("origin");
            expressionBuilder4.literal("originMarker");
            expressionBuilder4.literal("destination");
            expressionBuilder4.literal("destinationMarker");
            expressionBuilder4.literal("originMarker");
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-image", expressionBuilder4.build(), symbolLayer);
            MapboxRouteLineUtils$initializeLayers$77 mapboxRouteLineUtils$initializeLayers$78 = MapboxRouteLineUtils$initializeLayers$77.INSTANCE;
            Expression.InterpolatorBuilder interpolatorBuilder2 = new Expression.InterpolatorBuilder();
            mapboxRouteLineUtils$initializeLayers$78.invoke(interpolatorBuilder2);
            symbolLayer.iconSize(interpolatorBuilder2.build());
            if (zContains) {
                symbolLayer.slot$2(str7);
            }
            IconPitchAlignment iconPitchAlignment2 = mapboxRouteLineViewOptions2.iconPitchAlignment;
            iconPitchAlignment2.getClass();
            symbolLayer.setProperty$extension_style_release(new PropertyValue("icon-pitch-alignment", iconPitchAlignment2));
            Boolean bool2 = Boolean.TRUE;
            symbolLayer.setProperty$extension_style_release(new PropertyValue("icon-allow-overlap", bool2));
            symbolLayer.setProperty$extension_style_release(new PropertyValue("icon-ignore-placement", bool2));
            symbolLayer.setProperty$extension_style_release(new PropertyValue("icon-keep-upright", bool2));
            UrlUtils.addPersistentLayer(style3, symbolLayer, new LayerPosition(r5, str10, r5));
        }
    }

    public static void adjustLayerVisibility(Style style, String str, Visibility visibility) {
        Layer layer;
        if (!style.styleLayerExists(str) || (layer = UrlUtils.getLayer(style, str)) == null) {
            return;
        }
        layer.visibility(visibility);
    }

    public static void updateSource(Style style, String str, FeatureCollection featureCollection, Integer num) {
        Source source = BuildersKt.getSource(style, str);
        if (source != null) {
            String strValueOf = num != null ? String.valueOf(num.intValue()) : null;
            if (strValueOf == null) {
                strValueOf = "";
            }
            featureCollection.getClass();
            ((GeoJsonSource) source).setGeoJson(featureCollection, strValueOf);
        }
    }

    public static final TwoFaViewModel$onPinChanged$1 access$getGenerateCommand(MapboxRouteLineView mapboxRouteLineView, RouteLineValueCommandHolder routeLineValueCommandHolder, Style style, String str, RouteLineViewOptionsData routeLineViewOptionsData) {
        mapboxRouteLineView.getClass();
        return new TwoFaViewModel$onPinChanged$1(routeLineValueCommandHolder, mapboxRouteLineView, routeLineViewOptionsData, style, str, (ShortNewsContentCardView) null);
    }
}
