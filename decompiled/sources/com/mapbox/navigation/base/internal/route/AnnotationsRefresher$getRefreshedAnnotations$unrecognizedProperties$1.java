package com.mapbox.navigation.base.internal.route;

import com.deliveryhero.customerchat.CustomerChatModule$sendMessage$2;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils$getRouteLineExpression$1$1;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineColorResources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationsRefresher$getRefreshedAnnotations$unrecognizedProperties$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Object $newAnnotation;
    public final /* synthetic */ Object $oldAnnotation;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int $startingLegGeometryIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnnotationsRefresher$getRefreshedAnnotations$unrecognizedProperties$1(int i, int i2, Object obj, Object obj2) {
        super(1);
        this.$r8$classId = i2;
        this.$oldAnnotation = obj;
        this.$newAnnotation = obj2;
        this.$startingLegGeometryIndex = i;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        LegAnnotation legAnnotation;
        JsonElement unrecognizedProperty;
        int i = this.$r8$classId;
        int i2 = this.$startingLegGeometryIndex;
        Object obj2 = this.$oldAnnotation;
        Object obj3 = this.$newAnnotation;
        if (i == 0) {
            String str = (String) obj;
            LegAnnotation legAnnotation2 = (LegAnnotation) obj2;
            JsonElement unrecognizedProperty2 = legAnnotation2.getUnrecognizedProperty(str);
            if ((unrecognizedProperty2 == null || unrecognizedProperty2.isJsonArray()) && ((legAnnotation = (LegAnnotation) obj3) == null || (unrecognizedProperty = legAnnotation.getUnrecognizedProperty(str)) == null || unrecognizedProperty.isJsonArray())) {
                ArrayList arrayListMergeAnnotationProperty = AnnotationsRefresher.mergeAnnotationProperty(legAnnotation2, legAnnotation, this.$startingLegGeometryIndex, 0, 0, new CustomerChatModule$sendMessage$2(str, 3));
                if (arrayListMergeAnnotationProperty != null) {
                    JsonArray jsonArray = new JsonArray(arrayListMergeAnnotationProperty.size());
                    Iterator it = arrayListMergeAnnotationProperty.iterator();
                    while (it.hasNext()) {
                        jsonArray.add((JsonElement) it.next());
                    }
                    return jsonArray;
                }
            }
            return null;
        }
        if (i == 1) {
            RouteLineViewOptionsData routeLineViewOptionsData = (RouteLineViewOptionsData) obj;
            routeLineViewOptionsData.getClass();
            RouteLineColorResources routeLineColorResources = routeLineViewOptionsData.getRouteLineColorResources();
            MapboxRouteLineApiOptions mapboxRouteLineApiOptions = (MapboxRouteLineApiOptions) obj2;
            int inactiveRouteLegRestrictedRoadColor = mapboxRouteLineApiOptions.getStyleInactiveRouteLegsIndependently() ? routeLineColorResources.getInactiveRouteLegRestrictedRoadColor() : routeLineColorResources.getRestrictedRoadColor();
            MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
            return new StylePropertyValue(MapboxRouteLineUtils.access$getRestrictedLineExpression((List) obj3, i2, mapboxRouteLineApiOptions.getCalculateRestrictedRoadSections(), routeLineColorResources.getRestrictedRoadColor(), inactiveRouteLegRestrictedRoadColor), StylePropertyValueKind.EXPRESSION);
        }
        if (i != 2) {
            RouteLineViewOptionsData routeLineViewOptionsData2 = (RouteLineViewOptionsData) obj;
            routeLineViewOptionsData2.getClass();
            MapboxRouteLineApiOptions mapboxRouteLineApiOptions2 = (MapboxRouteLineApiOptions) obj2;
            if (mapboxRouteLineApiOptions2.getStyleInactiveRouteLegsIndependently() && mapboxRouteLineApiOptions2.getVanishingRouteLineEnabled()) {
                MapboxRouteLineUtils mapboxRouteLineUtils2 = MapboxRouteLineUtils.INSTANCE;
                List list = (List) obj3;
                int routeLineTraveledColor = routeLineViewOptionsData2.getRouteLineColorResources().getRouteLineTraveledColor();
                list.getClass();
                return MapboxRouteLineUtils.getRouteLineExpression(0.0d, list, routeLineTraveledColor, routeLineTraveledColor, 0, new MapboxRouteLineUtils$getRouteLineExpression$1$1(i2, 2));
            }
            if (mapboxRouteLineApiOptions2.getStyleInactiveRouteLegsIndependently()) {
                MapboxRouteLineUtils mapboxRouteLineUtils3 = MapboxRouteLineUtils.INSTANCE;
                return MapboxRouteLineUtils.getExpressionSubstitutingColorForInactiveLegs$ui_maps_release(0.0d, (List) obj3, routeLineViewOptionsData2.getRouteLineColorResources().getRouteLineTraveledColor(), routeLineViewOptionsData2.getRouteLineColorResources().getRouteLineTraveledColor(), 0, this.$startingLegGeometryIndex);
            }
            MapboxRouteLineUtils mapboxRouteLineUtils4 = MapboxRouteLineUtils.INSTANCE;
            return MapboxRouteLineUtils.getSingleColorExpression(routeLineViewOptionsData2.getRouteLineColorResources().getRouteLineTraveledColor());
        }
        RouteLineViewOptionsData routeLineViewOptionsData3 = (RouteLineViewOptionsData) obj;
        routeLineViewOptionsData3.getClass();
        MapboxRouteLineApiOptions mapboxRouteLineApiOptions3 = (MapboxRouteLineApiOptions) obj2;
        if (mapboxRouteLineApiOptions3.getStyleInactiveRouteLegsIndependently() && mapboxRouteLineApiOptions3.getVanishingRouteLineEnabled()) {
            MapboxRouteLineUtils mapboxRouteLineUtils5 = MapboxRouteLineUtils.INSTANCE;
            List list2 = (List) obj3;
            int routeLineTraveledCasingColor = routeLineViewOptionsData3.getRouteLineColorResources().getRouteLineTraveledCasingColor();
            list2.getClass();
            return MapboxRouteLineUtils.getRouteLineExpression(0.0d, list2, routeLineTraveledCasingColor, routeLineTraveledCasingColor, 0, new MapboxRouteLineUtils$getRouteLineExpression$1$1(i2, 2));
        }
        if (mapboxRouteLineApiOptions3.getStyleInactiveRouteLegsIndependently()) {
            MapboxRouteLineUtils mapboxRouteLineUtils6 = MapboxRouteLineUtils.INSTANCE;
            return MapboxRouteLineUtils.getExpressionSubstitutingColorForInactiveLegs$ui_maps_release(0.0d, (List) obj3, routeLineViewOptionsData3.getRouteLineColorResources().getRouteLineTraveledCasingColor(), routeLineViewOptionsData3.getRouteLineColorResources().getRouteLineTraveledCasingColor(), 0, this.$startingLegGeometryIndex);
        }
        MapboxRouteLineUtils mapboxRouteLineUtils7 = MapboxRouteLineUtils.INSTANCE;
        return MapboxRouteLineUtils.getSingleColorExpression(routeLineViewOptionsData3.getRouteLineColorResources().getRouteLineTraveledCasingColor());
    }
}
