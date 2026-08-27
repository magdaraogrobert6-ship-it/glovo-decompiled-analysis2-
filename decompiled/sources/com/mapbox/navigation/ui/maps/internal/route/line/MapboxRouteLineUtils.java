package com.mapbox.navigation.ui.maps.internal.route.line;

import android.util.LruCache;
import androidx.collection.ObjectList$toString$1;
import androidx.sqlite.SQLite;
import com.adjust.sdk.Constants;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.MapboxStreetsV8;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.api.directions.v5.models.StepIntersection;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleException;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.Style;
import com.mapbox.maps.StyleObjectInfo;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.sources.Source;
import com.mapbox.maps.extension.style.sources.generated.GeoJsonSource;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.navigation.base.internal.route.AnnotationsRefresher$getRefreshedAnnotations$unrecognizedProperties$1;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.MapboxNavigation$notification$1$1;
import com.mapbox.navigation.core.accounts.BillingController$onExternalRouteSet$newWaypoints$1;
import com.mapbox.navigation.ui.maps.route.line.api.HeavyRouteLineValueProvider;
import com.mapbox.navigation.ui.maps.route.line.api.LineGradientCommandApplier;
import com.mapbox.navigation.ui.maps.route.line.api.RouteLineValueCommandHolder;
import com.mapbox.navigation.ui.maps.route.line.model.ExpressionOffsetData;
import com.mapbox.navigation.ui.maps.route.line.model.ExtractedRouteData;
import com.mapbox.navigation.ui.maps.route.line.model.ExtractedRouteRestrictionData;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineExpressionData;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineScaleValue;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineSourceKey;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineTrimOffset;
import com.mapbox.navigation.ui.maps.route.line.model.SegmentColorType;
import com.mapbox.navigation.ui.maps.util.CacheResultUtils$cacheResult$1;
import com.mapbox.navigation.ui.maps.util.CacheResultUtils$cacheRouteTrafficResult$1;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.BuildersKt;
import o.BaseContentCardView;
import o.ItemTouchHelperAdapter;
import o.accessgetInstancedelegatecp;
import o.bindViewHolderlambda0;
import o.createFromParcel;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.instance_delegatelambda0;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import okio.Okio;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineUtils {
    public static final MapboxRouteLineUtils INSTANCE = new MapboxRouteLineUtils();
    public static final CacheResultUtils$cacheRouteTrafficResult$1 extractRouteData;
    public static final isAdapterPositionOnScreen extractRouteDataCache$delegate;
    public static final MapboxRouteLineUtils$extractRouteData$1 extractRouteDataWithTrafficAndRoadClassDeDuped;
    public static final MapboxRouteLineUtils$extractRouteData$1 generateRouteFeatureData;
    public static final MapboxRouteLineUtils$initializeLayers$77 getRouteLegTrafficCongestionProvider;
    public static final CacheResultUtils$cacheResult$1 getRouteLegTrafficNumericCongestionProvider;
    public static final isAdapterPositionOnScreen granularDistancesCache$delegate;
    public static final CacheResultUtils$cacheResult$1 granularDistancesProvider;
    public static final String layerGroup1SourceKey;
    public static final Set layerGroup1SourceLayerIds;
    public static final String layerGroup2SourceKey;
    public static final Set layerGroup2SourceLayerIds;
    public static final String layerGroup3SourceKey;
    public static final Set layerGroup3SourceLayerIds;
    public static final Set maskingLayerIds;
    public static final Map sourceLayerMap;

    static {
        isAdapterPositionOnScreen isadapterpositiononscreen = new isAdapterPositionOnScreen(MapboxRouteLineUtils$extractRouteDataCache$2.INSTANCE);
        extractRouteDataCache$delegate = isadapterpositiononscreen;
        isAdapterPositionOnScreen isadapterpositiononscreen2 = new isAdapterPositionOnScreen(MapboxRouteLineUtils$extractRouteDataCache$2.INSTANCE$1);
        granularDistancesCache$delegate = isadapterpositiononscreen2;
        layerGroup1SourceKey = "mapbox-layerGroup:1:Source";
        layerGroup2SourceKey = "mapbox-layerGroup:2:Source";
        layerGroup3SourceKey = "mapbox-layerGroup:3:Source";
        Set setMediaSessionCompatQueueItem = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{"mapbox-layerGroup-1-trailCasing", "mapbox-layerGroup-1-trail", "mapbox-layerGroup-1-blur", "mapbox-layerGroup-1-casing", "mapbox-layerGroup-1-main", "mapbox-layerGroup-1-traffic", "mapbox-layerGroup-1-restricted"});
        layerGroup1SourceLayerIds = setMediaSessionCompatQueueItem;
        Set setMediaSessionCompatQueueItem2 = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{"mapbox-layerGroup-2-trailCasing", "mapbox-layerGroup-2-trail", "mapbox-layerGroup-2-blur", "mapbox-layerGroup-2-casing", "mapbox-layerGroup-2-main", "mapbox-layerGroup-2-traffic", "mapbox-layerGroup-2-restricted"});
        layerGroup2SourceLayerIds = setMediaSessionCompatQueueItem2;
        Set setMediaSessionCompatQueueItem3 = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{"mapbox-layerGroup-3-trailCasing", "mapbox-layerGroup-3-trail", "mapbox-layerGroup-3-blur", "mapbox-layerGroup-3-casing", "mapbox-layerGroup-3-main", "mapbox-layerGroup-3-traffic", "mapbox-layerGroup-3-restricted"});
        layerGroup3SourceLayerIds = setMediaSessionCompatQueueItem3;
        maskingLayerIds = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{"mapbox-masking-layer-trailCasing", "mapbox-masking-layer-trail", "mapbox-masking-layer-casing", "mapbox-masking-layer-main", "mapbox-masking-layer-traffic", "mapbox-masking-layer-restricted"});
        sourceLayerMap = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0(new RouteLineSourceKey("mapbox-layerGroup:1:Source"), setMediaSessionCompatQueueItem), new onViewAttachedToWindowlambda0(new RouteLineSourceKey("mapbox-layerGroup:2:Source"), setMediaSessionCompatQueueItem2), new onViewAttachedToWindowlambda0(new RouteLineSourceKey("mapbox-layerGroup:3:Source"), setMediaSessionCompatQueueItem3));
        extractRouteDataWithTrafficAndRoadClassDeDuped = MapboxRouteLineUtils$extractRouteData$1.INSTANCE$1;
        LruCache lruCache = (LruCache) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
        lruCache.getClass();
        extractRouteData = new CacheResultUtils$cacheRouteTrafficResult$1(lruCache);
        getRouteLegTrafficNumericCongestionProvider = new CacheResultUtils$cacheResult$1();
        getRouteLegTrafficCongestionProvider = MapboxRouteLineUtils$initializeLayers$77.INSTANCE$1;
        LruCache lruCache2 = (LruCache) isadapterpositiononscreen2.MediaSessionCompatResultReceiverWrapper();
        lruCache2.getClass();
        granularDistancesProvider = new CacheResultUtils$cacheResult$1(lruCache2);
        generateRouteFeatureData = MapboxRouteLineUtils$extractRouteData$1.INSTANCE$2;
    }

    public static String[] getRoadClassArray$ui_maps_release(List list) {
        List<StepIntersection> listPlaybackStateCompat;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List<StepIntersection> listIntersections = ((LegStep) it.next()).intersections();
                if (listIntersections != null) {
                    arrayList.add(listIntersections);
                }
            }
            ArrayList arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                if (((StepIntersection) obj).geometryIndex() != null) {
                    arrayList2.add(obj);
                }
            }
            listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(arrayList2);
        } else {
            listPlaybackStateCompat = instance_delegatelambda0.write;
        }
        boolean zIsEmpty = listPlaybackStateCompat.isEmpty();
        if (!(!zIsEmpty)) {
            if (zIsEmpty) {
                return new String[0];
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        Integer numGeometryIndex = ((StepIntersection) onContentCardDismissed.MediaDescriptionCompat(listPlaybackStateCompat)).geometryIndex();
        numGeometryIndex.getClass();
        int iIntValue = numGeometryIndex.intValue() + 1;
        String[] strArr = new String[iIntValue];
        for (StepIntersection stepIntersection : listPlaybackStateCompat) {
            MapboxStreetsV8 mapboxStreetsV8 = stepIntersection.mapboxStreetsV8();
            String strRoadClass = mapboxStreetsV8 != null ? mapboxStreetsV8.roadClass() : null;
            if (strRoadClass == null) {
                strRoadClass = "intersection_without_class_fallback";
            }
            Integer numGeometryIndex2 = stepIntersection.geometryIndex();
            numGeometryIndex2.getClass();
            if (numGeometryIndex2.intValue() < iIntValue) {
                Integer numGeometryIndex3 = stepIntersection.geometryIndex();
                numGeometryIndex3.getClass();
                strArr[numGeometryIndex3.intValue()] = strRoadClass;
            } else {
                LoggerProviderKt.logE("Geometry index for step intersection unexpected or incorrect. There is a risk of incorrect road class styling applied to the route line.", "MapboxRouteLineUtils");
            }
        }
        return strArr;
    }

    public static StylePropertyValue getSingleColorExpression(int i) {
        return new StylePropertyValue(Okio.color(i), StylePropertyValueKind.EXPRESSION);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    public static final Expression access$getRestrictedLineExpression(List list, int i, boolean z, int i2, int i3) {
        int i4;
        int i5 = 0;
        if (z) {
            list.getClass();
            Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("step");
            expressionBuilder.lineProgress();
            bindViewHolderlambda0 filteredReversedRouteLineExpressionData$ui_maps_release = getFilteredReversedRouteLineExpressionData$ui_maps_release(0.0d, list, new MapboxRouteLineUtils$extractRouteDataCache$2(i5, 2));
            Iterator it = filteredReversedRouteLineExpressionData$ui_maps_release.iterator();
            int i6 = Integer.MAX_VALUE;
            int i7 = 0;
            while (true) {
                ListIterator listIterator = ((BaseContentCardView) it).write;
                if (listIterator.hasPrevious()) {
                    Object objPrevious = listIterator.previous();
                    if (i7 >= 0) {
                        ExtractedRouteRestrictionData extractedRouteRestrictionData = (ExtractedRouteRestrictionData) objPrevious;
                        int i8 = 1;
                        if (i7 == filteredReversedRouteLineExpressionData$ui_maps_release.IconCompatParcelizer() - 1) {
                            i4 = 0;
                        } else if (i >= 0 && extractedRouteRestrictionData.legIndex != i) {
                            if (extractedRouteRestrictionData.isInRestrictedSection) {
                                i4 = i3;
                            } else {
                                i4 = 0;
                            }
                        } else if (extractedRouteRestrictionData.isInRestrictedSection) {
                            i4 = i2;
                        } else {
                            i4 = 0;
                        }
                        if (i7 == 0) {
                            expressionBuilder.color(i4);
                            new MapboxRouteLineUtils$getRouteLineExpression$1$1(i4, 3).invoke(expressionBuilder);
                        } else {
                            if (i4 != i6) {
                                new BillingController$onExternalRouteSet$newWaypoints$1(extractedRouteRestrictionData, i4, i8).invoke(expressionBuilder);
                            }
                            i7++;
                        }
                        i6 = i4;
                        i7++;
                    } else {
                        SQLite.serializer();
                        throw null;
                    }
                } else {
                    return expressionBuilder.build();
                }
            }
        } else {
            return Okio.color(0);
        }
    }

    public static double calculateDistance$ui_maps_release(Point point, Point point2) {
        point.getClass();
        point2.getClass();
        double[] dArr = {((point.longitude() / 360.0d) + 0.5d) - ((point2.longitude() / 360.0d) + 0.5d), projectY(point.latitude()) - projectY(point2.latitude())};
        double d = dArr[0];
        double d2 = dArr[1];
        return Math.sqrt((d2 * d2) + (d * d));
    }

    public static List calculateRouteLineSegments(NavigationRoute navigationRoute, List list, boolean z, MapboxRouteLineApiOptions mapboxRouteLineApiOptions) {
        List<String> listAnnotationsList;
        navigationRoute.getClass();
        list.getClass();
        mapboxRouteLineApiOptions.getClass();
        RouteOptions routeOptions = navigationRoute.directionsRoute.routeOptions();
        List list2 = (List) extractRouteDataWithTrafficAndRoadClassDeDuped.invoke(navigationRoute, (routeOptions == null || (listAnnotationsList = routeOptions.annotationsList()) == null || !listAnnotationsList.contains("congestion_numeric")) ? getRouteLegTrafficCongestionProvider : (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) getRouteLegTrafficNumericCongestionProvider.invoke(mapboxRouteLineApiOptions));
        boolean zIsEmpty = list2.isEmpty();
        if (zIsEmpty) {
            if (zIsEmpty) {
                return (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{new RouteLineExpressionData(0.0d, "", getRouteColorTypeForCongestion("", z), 0)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list2) {
            if (i < 0) {
                SQLite.serializer();
                throw null;
            }
            ExtractedRouteData extractedRouteData = (ExtractedRouteData) obj;
            String str = (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{extractedRouteData.trafficCongestionIdentifier, SystemUtils.UNKNOWN}, getCieXyz.write())).booleanValue() && onContentCardDismissed.write(list, extractedRouteData.roadClass)) ? Constants.LOW : extractedRouteData.trafficCongestionIdentifier;
            SegmentColorType routeColorTypeForCongestion = getRouteColorTypeForCongestion(str, z);
            if (i == 0 || extractedRouteData.isLegOrigin) {
                arrayList.add(new RouteLineExpressionData(extractedRouteData.offset, str, routeColorTypeForCongestion, extractedRouteData.legIndex));
            } else if (routeColorTypeForCongestion != ((RouteLineExpressionData) onContentCardDismissed.MediaDescriptionCompat((List) arrayList)).segmentColorType) {
                arrayList.add(new RouteLineExpressionData(extractedRouteData.offset, str, routeColorTypeForCongestion, extractedRouteData.legIndex));
            }
            i++;
        }
        return arrayList;
    }

    public static Set getLayerIdsForPrimaryRoute$ui_maps_release(Style style, Map map) {
        Set set;
        map.getClass();
        String topRouteLineRelatedLayerId$ui_maps_release = getTopRouteLineRelatedLayerId$ui_maps_release(style);
        ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
        if (topRouteLineRelatedLayerId$ui_maps_release != null) {
            if (layerGroup1SourceLayerIds.contains(topRouteLineRelatedLayerId$ui_maps_release)) {
                set = (Set) map.get(new RouteLineSourceKey(layerGroup1SourceKey));
            } else if (layerGroup2SourceLayerIds.contains(topRouteLineRelatedLayerId$ui_maps_release)) {
                set = (Set) map.get(new RouteLineSourceKey(layerGroup2SourceKey));
            } else {
                set = layerGroup3SourceLayerIds.contains(topRouteLineRelatedLayerId$ui_maps_release) ? (Set) map.get(new RouteLineSourceKey(layerGroup3SourceKey)) : itemTouchHelperAdapter;
            }
            if (set != null) {
                return set;
            }
        }
        return itemTouchHelperAdapter;
    }

    public static RouteLineDynamicData getPrimaryRouteLineDynamicData$ui_maps_release(final MapboxRouteLineApiOptions mapboxRouteLineApiOptions, final List list, List list2, double d, final double d2, final int i) {
        mapboxRouteLineApiOptions.getClass();
        list.getClass();
        list2.getClass();
        final MapboxRouteLineUtils$getPrimaryRouteLineDynamicData$trafficExpressionProvider$1 mapboxRouteLineUtils$getPrimaryRouteLineDynamicData$trafficExpressionProvider$1 = new MapboxRouteLineUtils$getPrimaryRouteLineDynamicData$trafficExpressionProvider$1(list, d2, d);
        int i2 = 0;
        RouteLineValueCommandHolder routeLineValueCommandHolder = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new ObjectList$toString$1(25, mapboxRouteLineUtils$getPrimaryRouteLineDynamicData$trafficExpressionProvider$1), i2), new LineGradientCommandApplier(i2));
        final int i3 = 0;
        int i4 = 1;
        RouteLineValueCommandHolder routeLineValueCommandHolder2 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils$getPrimaryRouteLineDynamicData$primaryRouteBaseExpressionCommandHolder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i5 = i3;
                MapboxRouteLineApiOptions mapboxRouteLineApiOptions2 = mapboxRouteLineApiOptions;
                if (i5 != 0) {
                    RouteLineViewOptionsData routeLineViewOptionsData = (RouteLineViewOptionsData) obj;
                    routeLineViewOptionsData.getClass();
                    if (!mapboxRouteLineApiOptions2.getStyleInactiveRouteLegsIndependently()) {
                        MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
                        return MapboxRouteLineUtils.getSingleColorExpression(routeLineViewOptionsData.getRouteLineColorResources().getRouteCasingColor());
                    }
                    MapboxRouteLineUtils mapboxRouteLineUtils2 = MapboxRouteLineUtils.INSTANCE;
                    return MapboxRouteLineUtils.getExpressionSubstitutingColorForInactiveLegs$ui_maps_release(d2, list, routeLineViewOptionsData.getRouteLineColorResources().getRouteLineTraveledCasingColor(), routeLineViewOptionsData.getRouteLineColorResources().getRouteCasingColor(), routeLineViewOptionsData.getRouteLineColorResources().getInactiveRouteLegCasingColor(), i);
                }
                RouteLineViewOptionsData routeLineViewOptionsData2 = (RouteLineViewOptionsData) obj;
                routeLineViewOptionsData2.getClass();
                if (!mapboxRouteLineApiOptions2.getStyleInactiveRouteLegsIndependently()) {
                    MapboxRouteLineUtils mapboxRouteLineUtils3 = MapboxRouteLineUtils.INSTANCE;
                    return MapboxRouteLineUtils.getSingleColorExpression(routeLineViewOptionsData2.getRouteLineColorResources().getRouteDefaultColor());
                }
                MapboxRouteLineUtils mapboxRouteLineUtils4 = MapboxRouteLineUtils.INSTANCE;
                return MapboxRouteLineUtils.getExpressionSubstitutingColorForInactiveLegs$ui_maps_release(d2, list, routeLineViewOptionsData2.getRouteLineColorResources().getRouteLineTraveledColor(), routeLineViewOptionsData2.getRouteLineColorResources().getRouteDefaultColor(), routeLineViewOptionsData2.getRouteLineColorResources().getInActiveRouteLegsColor(), i);
            }
        }, i4), new LineGradientCommandApplier(i2));
        final int i5 = 1;
        RouteLineValueCommandHolder routeLineValueCommandHolder3 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils$getPrimaryRouteLineDynamicData$primaryRouteBaseExpressionCommandHolder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i6 = i5;
                MapboxRouteLineApiOptions mapboxRouteLineApiOptions2 = mapboxRouteLineApiOptions;
                if (i6 != 0) {
                    RouteLineViewOptionsData routeLineViewOptionsData = (RouteLineViewOptionsData) obj;
                    routeLineViewOptionsData.getClass();
                    if (!mapboxRouteLineApiOptions2.getStyleInactiveRouteLegsIndependently()) {
                        MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
                        return MapboxRouteLineUtils.getSingleColorExpression(routeLineViewOptionsData.getRouteLineColorResources().getRouteCasingColor());
                    }
                    MapboxRouteLineUtils mapboxRouteLineUtils2 = MapboxRouteLineUtils.INSTANCE;
                    return MapboxRouteLineUtils.getExpressionSubstitutingColorForInactiveLegs$ui_maps_release(d2, list, routeLineViewOptionsData.getRouteLineColorResources().getRouteLineTraveledCasingColor(), routeLineViewOptionsData.getRouteLineColorResources().getRouteCasingColor(), routeLineViewOptionsData.getRouteLineColorResources().getInactiveRouteLegCasingColor(), i);
                }
                RouteLineViewOptionsData routeLineViewOptionsData2 = (RouteLineViewOptionsData) obj;
                routeLineViewOptionsData2.getClass();
                if (!mapboxRouteLineApiOptions2.getStyleInactiveRouteLegsIndependently()) {
                    MapboxRouteLineUtils mapboxRouteLineUtils3 = MapboxRouteLineUtils.INSTANCE;
                    return MapboxRouteLineUtils.getSingleColorExpression(routeLineViewOptionsData2.getRouteLineColorResources().getRouteDefaultColor());
                }
                MapboxRouteLineUtils mapboxRouteLineUtils4 = MapboxRouteLineUtils.INSTANCE;
                return MapboxRouteLineUtils.getExpressionSubstitutingColorForInactiveLegs$ui_maps_release(d2, list, routeLineViewOptionsData2.getRouteLineColorResources().getRouteLineTraveledColor(), routeLineViewOptionsData2.getRouteLineColorResources().getRouteDefaultColor(), routeLineViewOptionsData2.getRouteLineColorResources().getInActiveRouteLegsColor(), i);
            }
        }, i4), new LineGradientCommandApplier(i2));
        RouteLineValueCommandHolder routeLineValueCommandHolder4 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new AnnotationsRefresher$getRefreshedAnnotations$unrecognizedProperties$1(i, 3, mapboxRouteLineApiOptions, list), i4), new LineGradientCommandApplier(i2));
        RouteLineValueCommandHolder routeLineValueCommandHolder5 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new AnnotationsRefresher$getRefreshedAnnotations$unrecognizedProperties$1(i, 2, mapboxRouteLineApiOptions, list), i4), new LineGradientCommandApplier(i2));
        return new RouteLineDynamicData(routeLineValueCommandHolder2, routeLineValueCommandHolder3, routeLineValueCommandHolder, new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new AnnotationsRefresher$getRefreshedAnnotations$unrecognizedProperties$1(i, i4, mapboxRouteLineApiOptions, list2), i2), new LineGradientCommandApplier(i2)), new RouteLineTrimOffset(d2), routeLineValueCommandHolder4, routeLineValueCommandHolder5, new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils$getPrimaryRouteLineDynamicData$blurLineHolder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                RouteLineViewOptionsData routeLineViewOptionsData = (RouteLineViewOptionsData) obj;
                routeLineViewOptionsData.getClass();
                if (!routeLineViewOptionsData.getRouteLineBlurEnabled()) {
                    MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
                    return MapboxRouteLineUtils.getSingleColorExpression(0);
                }
                if (routeLineViewOptionsData.getApplyTrafficColorsToRouteLineBlur()) {
                    return (StylePropertyValue) mapboxRouteLineUtils$getPrimaryRouteLineDynamicData$trafficExpressionProvider$1.invoke(routeLineViewOptionsData);
                }
                if (!mapboxRouteLineApiOptions.getStyleInactiveRouteLegsIndependently()) {
                    MapboxRouteLineUtils mapboxRouteLineUtils2 = MapboxRouteLineUtils.INSTANCE;
                    return MapboxRouteLineUtils.getSingleColorExpression(routeLineViewOptionsData.getRouteLineColorResources().getBlurColor());
                }
                MapboxRouteLineUtils mapboxRouteLineUtils3 = MapboxRouteLineUtils.INSTANCE;
                return MapboxRouteLineUtils.getExpressionSubstitutingColorForInactiveLegs$ui_maps_release(d2, list, routeLineViewOptionsData.getRouteLineColorResources().getBlurColor(), routeLineViewOptionsData.getRouteLineColorResources().getBlurColor(), 0, i);
            }
        }, i2), new LineGradientCommandApplier(i2)));
    }

    public static String getTopRouteLineRelatedLayerId$ui_maps_release(Style style) {
        Object isitemdismissable;
        Object next;
        try {
            List<StyleObjectInfo> styleLayers = style.getStyleLayers();
            List<StyleObjectInfo> listSubList = styleLayers.subList(styleLayers.indexOf(new StyleObjectInfo("mapbox-bottom-level-route-layer", "background")), styleLayers.indexOf(new StyleObjectInfo("mapbox-top-level-route-layer", "background")));
            ArrayList arrayList = new ArrayList();
            for (Object obj : listSubList) {
                if (!maskingLayerIds.contains(((StyleObjectInfo) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
            int i = 0;
            for (Object obj2 : arrayList) {
                if (i < 0) {
                    SQLite.serializer();
                    throw null;
                }
                arrayList2.add(new onViewAttachedToWindowlambda0(Integer.valueOf(i), ((StyleObjectInfo) obj2).getId()));
                i++;
            }
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((onViewAttachedToWindowlambda0) next).serializer).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((onViewAttachedToWindowlambda0) next2).serializer).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) next;
            isitemdismissable = onviewattachedtowindowlambda0 != null ? (String) onviewattachedtowindowlambda0.write : null;
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        return (String) (isitemdismissable instanceof isItemDismissable ? null : isitemdismissable);
    }

    public static Expression getTrafficLineExpression$ui_maps_release(RouteLineViewOptionsData routeLineViewOptionsData, final double d, final SegmentColorType segmentColorType, List list, double d2) throws InterruptedException, IOException {
        routeLineViewOptionsData.getClass();
        segmentColorType.getClass();
        list.getClass();
        final int i = 1;
        final int i2 = 0;
        if (routeLineViewOptionsData.getDisplaySoftGradientForTraffic()) {
            double softGradientTransition = routeLineViewOptionsData.getSoftGradientTransition() / d2;
            Expression.InterpolatorBuilder interpolatorBuilder = new Expression.InterpolatorBuilder("interpolate");
            interpolatorBuilder.linear();
            interpolatorBuilder.lineProgress();
            bindViewHolderlambda0 filteredReversedRouteLineExpressionData$ui_maps_release = getFilteredReversedRouteLineExpressionData$ui_maps_release(d, list, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils$getTrafficLineExpression$data$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    if (i != 0) {
                        return new RouteLineExpressionData(d, "", segmentColorType, 0);
                    }
                    return new RouteLineExpressionData(d, "", segmentColorType, 0);
                }
            });
            int iIconCompatParcelizer = filteredReversedRouteLineExpressionData$ui_maps_release.IconCompatParcelizer();
            int i3 = 0;
            while (i2 < iIconCompatParcelizer) {
                RouteLineExpressionData routeLineExpressionData = (RouteLineExpressionData) filteredReversedRouteLineExpressionData$ui_maps_release.get(i2);
                if (i2 == 0) {
                    new MapboxNavigation$notification$1$1(routeLineExpressionData, 5, routeLineViewOptionsData).invoke(interpolatorBuilder);
                } else {
                    int color = routeLineExpressionData.segmentColorType.getColor(routeLineViewOptionsData);
                    final int color2 = ((RouteLineExpressionData) filteredReversedRouteLineExpressionData$ui_maps_release.get(i3)).segmentColorType.getColor(routeLineViewOptionsData);
                    if (color2 != color || i2 == filteredReversedRouteLineExpressionData$ui_maps_release.IconCompatParcelizer() - 1) {
                        if (((RouteLineExpressionData) filteredReversedRouteLineExpressionData$ui_maps_release.get(i3)).offset > 0.0d) {
                            final double d3 = ((RouteLineExpressionData) filteredReversedRouteLineExpressionData$ui_maps_release.get(i3)).offset + softGradientTransition;
                            double d4 = routeLineExpressionData.offset;
                            if (d3 >= d4) {
                                d3 = d4 - 1.0E-11d;
                            }
                            new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils$getTrafficLineExpressionSoftGradient$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                public final Object invoke(Object obj) {
                                    Expression.ExpressionBuilder expressionBuilder = (Expression.ExpressionBuilder) obj;
                                    expressionBuilder.getClass();
                                    expressionBuilder.literal(d3);
                                    expressionBuilder.color(color2);
                                    return createFromParcel.INSTANCE;
                                }
                            }.invoke(interpolatorBuilder);
                        }
                        new MapboxRouteLineUtils$getRouteLineExpression$1$2(routeLineExpressionData, color2, 2).invoke(interpolatorBuilder);
                        i3 = i2;
                    }
                }
                i2++;
            }
            return interpolatorBuilder.build();
        }
        Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("step");
        expressionBuilder.lineProgress();
        bindViewHolderlambda0 filteredReversedRouteLineExpressionData$ui_maps_release2 = getFilteredReversedRouteLineExpressionData$ui_maps_release(d, list, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils$getTrafficLineExpression$data$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                if (i2 != 0) {
                    return new RouteLineExpressionData(d, "", segmentColorType, 0);
                }
                return new RouteLineExpressionData(d, "", segmentColorType, 0);
            }
        });
        Iterator it = filteredReversedRouteLineExpressionData$ui_maps_release2.iterator();
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        while (true) {
            ListIterator listIterator = ((BaseContentCardView) it).write;
            if (!listIterator.hasPrevious()) {
                return expressionBuilder.build();
            }
            Object objPrevious = listIterator.previous();
            if (i5 < 0) {
                SQLite.serializer();
                throw null;
            }
            RouteLineExpressionData routeLineExpressionData2 = (RouteLineExpressionData) objPrevious;
            int color3 = i5 == filteredReversedRouteLineExpressionData$ui_maps_release2.IconCompatParcelizer() - 1 ? 0 : routeLineExpressionData2.segmentColorType.getColor(routeLineViewOptionsData);
            if (i5 == 0) {
                expressionBuilder.color(color3);
                new MapboxRouteLineUtils$getRouteLineExpression$1$1(color3, 4).invoke(expressionBuilder);
            } else {
                if (routeLineExpressionData2.offset < 1.0d && color3 != i4) {
                    new MapboxRouteLineUtils$getRouteLineExpression$1$2(routeLineExpressionData2, color3, i).invoke(expressionBuilder);
                }
                i5++;
            }
            i4 = color3;
            i5++;
        }
    }

    public static Expression buildScalingExpression$ui_maps_release(List list) {
        Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("interpolate");
        Expression.ExpressionBuilder expressionBuilder2 = new Expression.ExpressionBuilder("exponential");
        expressionBuilder2.literal(1.5d);
        expressionBuilder.arguments.add(expressionBuilder2.build());
        expressionBuilder.zoom();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            new MapboxRouteLineUtils$buildScalingExpression$2$1((RouteLineScaleValue) it.next(), 0).invoke(expressionBuilder);
        }
        return expressionBuilder.build();
    }

    public static bindViewHolderlambda0 getFilteredReversedRouteLineExpressionData$ui_maps_release(double d, List list, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        Collection collectionIconCompatParcelizer;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                boolean zIsEmpty = arrayList.isEmpty();
                if (zIsEmpty) {
                    boolean zIsEmpty2 = list.isEmpty();
                    if (zIsEmpty2) {
                        collectionIconCompatParcelizer = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                    } else {
                        if (zIsEmpty2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        collectionIconCompatParcelizer = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{((ExpressionOffsetData) onContentCardDismissed.MediaDescriptionCompat(list)).copyWithNewOffset(d)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                    }
                } else {
                    if (zIsEmpty) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    int iIndexOf = list.indexOf(onContentCardDismissed.read((List) arrayList));
                    collectionIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(arrayList, (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{(iIndexOf == 0 ? (ExpressionOffsetData) list.get(iIndexOf) : (ExpressionOffsetData) list.get(iIndexOf - 1)).copyWithNewOffset(d)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()));
                }
                bindViewHolderlambda0 bindviewholderlambda0 = new bindViewHolderlambda0(new ArrayList(collectionIconCompatParcelizer));
                double d2 = ((ExpressionOffsetData) onContentCardDismissed.MediaDescriptionCompat((List) bindviewholderlambda0)).offset;
                int iIconCompatParcelizer = bindviewholderlambda0.IconCompatParcelizer();
                while (true) {
                    iIconCompatParcelizer--;
                    if (iIconCompatParcelizer <= 0) {
                        break;
                    }
                    bindviewholderlambda0.set(iIconCompatParcelizer, ((ExpressionOffsetData) bindviewholderlambda0.get(iIconCompatParcelizer)).copyWithNewOffset(1.0d - ((ExpressionOffsetData) bindviewholderlambda0.get(iIconCompatParcelizer - 1)).offset));
                }
                ExpressionOffsetData expressionOffsetData = (ExpressionOffsetData) onContentCardDismissed.read(1, bindviewholderlambda0);
                if (removeNodeAtDepth.read(expressionOffsetData != null ? Double.valueOf(expressionOffsetData.offset) : null, 0.0d)) {
                    bindviewholderlambda0.IconCompatParcelizer(0);
                } else {
                    bindviewholderlambda0.set(0, ((ExpressionOffsetData) bindviewholderlambda0.get(0)).copyWithNewOffset(0.0d));
                }
                bindviewholderlambda0.add(((ExpressionOffsetData) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).copyWithNewOffset(1.0d - d2));
                return bindviewholderlambda0;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                SQLite.serializer();
                throw null;
            }
            double d3 = ((ExpressionOffsetData) next).offset;
            if (d3 > d) {
                ExpressionOffsetData expressionOffsetData2 = (ExpressionOffsetData) onContentCardDismissed.read(i2, list);
                Double dValueOf = expressionOffsetData2 != null ? Double.valueOf(expressionOffsetData2.offset) : null;
                if (dValueOf == null || d3 != dValueOf.doubleValue()) {
                    arrayList.add(next);
                }
            }
            i = i2;
        }
    }

    public static StylePropertyValue getRouteLineExpression(final double d, List list, int i, int i2, int i3, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i4;
        Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("step");
        expressionBuilder.lineProgress();
        bindViewHolderlambda0 filteredReversedRouteLineExpressionData$ui_maps_release = getFilteredReversedRouteLineExpressionData$ui_maps_release(d, list, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils$getRouteLineExpression$data$1
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                return new RouteLineExpressionData(d, "", SegmentColorType.PRIMARY_DEFAULT, 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        Iterator it = filteredReversedRouteLineExpressionData$ui_maps_release.iterator();
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            ListIterator listIterator = ((BaseContentCardView) it).write;
            if (listIterator.hasPrevious()) {
                Object objPrevious = listIterator.previous();
                if (i7 >= 0) {
                    RouteLineExpressionData routeLineExpressionData = (RouteLineExpressionData) objPrevious;
                    if (routeLineExpressionData.offset < 1.0d) {
                        if (i7 == filteredReversedRouteLineExpressionData$ui_maps_release.IconCompatParcelizer() - 1) {
                            i4 = i;
                        } else {
                            i4 = ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Integer.valueOf(routeLineExpressionData.legIndex))).booleanValue() ? i3 : i2;
                        }
                        if (i7 == 0) {
                            expressionBuilder.color(i4);
                            new MapboxRouteLineUtils$getRouteLineExpression$1$1(i4, i6).invoke(expressionBuilder);
                        } else if (i4 != i5) {
                            new MapboxRouteLineUtils$getRouteLineExpression$1$2(routeLineExpressionData, i4, i6).invoke(expressionBuilder);
                        }
                        i5 = i4;
                    }
                    i7++;
                } else {
                    SQLite.serializer();
                    throw null;
                }
            } else {
                return new StylePropertyValue(expressionBuilder.build(), StylePropertyValueKind.EXPRESSION);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x017a  */
    public static void addNewOrReuseSource(Style style, String str, double d, boolean z, boolean z2) {
        GeoJsonSource geoJsonSource;
        String str2;
        Object objUnwrap = null;
        if (style.styleSourceExists(str)) {
            Source source = BuildersKt.getSource(style, str);
            if (!(source instanceof GeoJsonSource)) {
                MapboxLogger.logW("StyleSourcePlugin", "Given sourceId = " + str + " is not requested type in getSourceAs.");
                source = null;
            }
            geoJsonSource = (GeoJsonSource) source;
        } else {
            geoJsonSource = null;
        }
        HashMap mapSerializer = onMove.serializer(new onViewAttachedToWindowlambda0("type", new Value("geojson")), new onViewAttachedToWindowlambda0("sharedCache", new Value(z2)), new onViewAttachedToWindowlambda0("maxzoom", new Value(16L)), new onViewAttachedToWindowlambda0("lineMetrics", new Value(z)), new onViewAttachedToWindowlambda0("tolerance", new Value(d)), new onViewAttachedToWindowlambda0("buffer", new Value(32L)));
        if (geoJsonSource != null) {
            if (mapSerializer.isEmpty()) {
                return;
            }
            for (Map.Entry entry : mapSerializer.entrySet()) {
                Value value = style.getStyleSourceProperty(str, (String) entry.getKey()).getValue();
                value.getClass();
                Object contents = value.getContents();
                Value value2 = (Value) entry.getValue();
                Object contents2 = value2.getContents();
                if ((contents instanceof Double) && (contents2 instanceof Double)) {
                    if (Math.abs(((Number) contents).doubleValue() - ((Number) contents2).doubleValue()) < 1.0E-6d) {
                    }
                } else if ((contents instanceof Float) && (contents2 instanceof Float)) {
                    if (Math.abs(((Number) contents).floatValue() - ((Number) contents2).floatValue()) < 1.0E-6f) {
                    }
                } else if (!value.equals(value2)) {
                }
            }
            return;
        }
        if (geoJsonSource != null) {
            style.removeStyleSource(geoJsonSource.sourceId);
        }
        if (geoJsonSource != null) {
            String str3 = geoJsonSource.sourceId;
            MapboxStyleManager mapboxStyleManager = geoJsonSource.delegate;
            if (mapboxStyleManager == null) {
                throw new MapboxStyleException("Couldn't get data: source is not added to style yet.");
            }
            try {
                objUnwrap = TypeUtilsKt.unwrap(mapboxStyleManager.getStyleSourceProperty(str3, RemoteMessageConst.DATA), String.class);
            } catch (RuntimeException e) {
                MapboxLogger.logW("Mbgl-Source", "Get source property data failed: " + e.getMessage());
                MapboxLogger.logW("Mbgl-Source", "Value returned: " + mapboxStyleManager.getStyleSourceProperty(str3, RemoteMessageConst.DATA).getValue().toJson());
            }
            str2 = (String) objUnwrap;
            if (str2 == null) {
                str2 = "";
            }
        } else {
            str2 = "";
        }
        mapSerializer.put(RemoteMessageConst.DATA, new Value(str2));
        style.addStyleSource(str, new Value((HashMap<String, Value>) mapSerializer));
    }

    public static StylePropertyValue getExpressionSubstitutingColorForInactiveLegs$ui_maps_release(double d, List list, int i, int i2, int i3, int i4) {
        list.getClass();
        return getRouteLineExpression(d, list, i, i2, i3, new MapboxRouteLineUtils$getRouteLineExpression$1$1(i4, 1));
    }

    public static StylePropertyValue getRouteLineExpression$ui_maps_release(double d, int i) {
        Expression expressionColor;
        if (d > 0.0d) {
            Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("step");
            expressionBuilder.lineProgress();
            expressionBuilder.color(i);
            new MapboxRouteLineUtils$getRouteLineExpression$expression$1(d, 0).invoke(expressionBuilder);
            expressionColor = expressionBuilder.build();
        } else {
            expressionColor = Okio.color(i);
        }
        return new StylePropertyValue(expressionColor, StylePropertyValueKind.EXPRESSION);
    }

    public static double projectY(double d) {
        double dSin = Math.sin((d * 3.141592653589793d) / 180.0d);
        double dLog = 0.5d - ((Math.log((dSin + 1.0d) / (1.0d - dSin)) * 0.25d) / 3.141592653589793d);
        if (dLog < 0.0d) {
            return 0.0d;
        }
        if (dLog > 1.0d) {
            return 1.1d;
        }
        return dLog;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static SegmentColorType getRouteColorTypeForCongestion(String str, boolean z) {
        str.getClass();
        if (z) {
            switch (str.hashCode()) {
                case -1357520532:
                    if (str.equals("closed")) {
                        return SegmentColorType.PRIMARY_CLOSURE;
                    }
                    break;
                case -1297282981:
                    if (str.equals("restricted")) {
                        return SegmentColorType.PRIMARY_RESTRICTED;
                    }
                    break;
                case -905723276:
                    if (str.equals("severe")) {
                        return SegmentColorType.PRIMARY_SEVERE_CONGESTION;
                    }
                    break;
                case -618857213:
                    if (str.equals("moderate")) {
                        return SegmentColorType.PRIMARY_MODERATE_CONGESTION;
                    }
                    break;
                case -284840886:
                    if (str.equals(SystemUtils.UNKNOWN)) {
                        return SegmentColorType.PRIMARY_UNKNOWN_CONGESTION;
                    }
                    break;
                case 107348:
                    if (str.equals(Constants.LOW)) {
                        return SegmentColorType.PRIMARY_LOW_CONGESTION;
                    }
                    break;
                case 99152071:
                    if (str.equals("heavy")) {
                        return SegmentColorType.PRIMARY_HEAVY_CONGESTION;
                    }
                    break;
            }
            return SegmentColorType.PRIMARY_DEFAULT;
        }
        if (z) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        switch (str.hashCode()) {
            case -1357520532:
                if (str.equals("closed")) {
                    return SegmentColorType.ALTERNATIVE_CLOSURE;
                }
                break;
            case -1297282981:
                if (str.equals("restricted")) {
                    return SegmentColorType.ALTERNATIVE_RESTRICTED;
                }
                break;
            case -905723276:
                if (str.equals("severe")) {
                    return SegmentColorType.ALTERNATIVE_SEVERE_CONGESTION;
                }
                break;
            case -618857213:
                if (str.equals("moderate")) {
                    return SegmentColorType.ALTERNATIVE_MODERATE_CONGESTION;
                }
                break;
            case -284840886:
                if (str.equals(SystemUtils.UNKNOWN)) {
                    return SegmentColorType.ALTERNATIVE_UNKNOWN_CONGESTION;
                }
                break;
            case 107348:
                if (str.equals(Constants.LOW)) {
                    return SegmentColorType.ALTERNATIVE_LOW_CONGESTION;
                }
                break;
            case 99152071:
                if (str.equals("heavy")) {
                    return SegmentColorType.ALTERNATIVE_HEAVY_CONGESTION;
                }
                break;
        }
        return SegmentColorType.ALTERNATIVE_DEFAULT;
    }

    public static Expression getTrafficLineExpression$ui_maps_release(NavigationRoute navigationRoute, MapboxRouteLineApiOptions mapboxRouteLineApiOptions, RouteLineViewOptionsData routeLineViewOptionsData, CopyOnWriteArrayList copyOnWriteArrayList, double d, SegmentColorType segmentColorType) {
        navigationRoute.getClass();
        mapboxRouteLineApiOptions.getClass();
        routeLineViewOptionsData.getClass();
        copyOnWriteArrayList.getClass();
        segmentColorType.getClass();
        List listCalculateRouteLineSegments = calculateRouteLineSegments(navigationRoute, copyOnWriteArrayList, false, mapboxRouteLineApiOptions);
        Double dDistance = navigationRoute.directionsRoute.distance();
        dDistance.getClass();
        return getTrafficLineExpression$ui_maps_release(routeLineViewOptionsData, d, segmentColorType, listCalculateRouteLineSegments, dDistance.doubleValue());
    }
}
