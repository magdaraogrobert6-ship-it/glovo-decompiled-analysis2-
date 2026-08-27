package io.sentry;

import androidx.room.Room;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.QueriedRenderedFeature;
import com.mapbox.maps.Style;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.navigation.ui.maps.building.model.MapboxBuildingHighlightOptions;
import com.mapbox.navigation.ui.maps.building.view.BuildingView;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.instance_delegatelambda0;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryAttributes implements BuildingView {
    public final ConcurrentHashMap IconCompatParcelizer;

    public Map RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // com.mapbox.navigation.ui.maps.building.view.BuildingView
    public void removeBuildingHighlight(Style style, MapboxBuildingHighlightOptions mapboxBuildingHighlightOptions) {
        updateBuildingLayer$1(style, instance_delegatelambda0.write, mapboxBuildingHighlightOptions);
    }

    @Override // com.mapbox.navigation.ui.maps.building.view.BuildingView
    public void highlightBuilding(Style style, List list, MapboxBuildingHighlightOptions mapboxBuildingHighlightOptions) {
        list.getClass();
        updateBuildingLayer$1(style, list, mapboxBuildingHighlightOptions);
    }

    public void updateBuildingLayer$1(Style style, List list, MapboxBuildingHighlightOptions mapboxBuildingHighlightOptions) {
        FillExtrusionLayer fillExtrusionLayer;
        Value value;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            fillExtrusionLayer = null;
            if (!it.hasNext()) {
                break;
            }
            String strId = ((QueriedRenderedFeature) it.next()).getQueriedFeature().getFeature().id();
            Long lValueOf = strId != null ? Long.valueOf(Long.parseLong(strId)) : null;
            if (lValueOf != null) {
                arrayList.add(lValueOf);
            }
        }
        Expression[] expressionArr = {new Expression.ExpressionBuilder("id").build(), Room.literal(arrayList)};
        Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("in");
        for (int i = 0; i < 2; i++) {
            expressionBuilder.addArgument(expressionArr[i]);
        }
        Expression expressionBuild = expressionBuilder.build();
        boolean zStyleLayerExists = style.styleLayerExists("mapbox-building-highlight-layer");
        ConcurrentHashMap concurrentHashMap = this.IconCompatParcelizer;
        if (zStyleLayerExists) {
            Layer layer = UrlUtils.getLayer(style, "mapbox-building-highlight-layer");
            if (!(layer instanceof FillExtrusionLayer)) {
                layer = null;
            }
            FillExtrusionLayer fillExtrusionLayer2 = (FillExtrusionLayer) layer;
            if (fillExtrusionLayer2 == null) {
                MapboxLogger.logW("Mbgl-LayerUtils", "Given layerId = mapbox-building-highlight-layer is not requested type in Layer");
                fillExtrusionLayer2 = null;
            }
            if (fillExtrusionLayer2 != null) {
                fillExtrusionLayer2.filter$1(expressionBuild);
            }
            Expression expression = (Expression) concurrentHashMap.get(style);
            if (expression != null) {
                Layer layer2 = UrlUtils.getLayer(style, "building-extrusion");
                if (!(layer2 instanceof FillExtrusionLayer)) {
                    layer2 = null;
                }
                FillExtrusionLayer fillExtrusionLayer3 = (FillExtrusionLayer) layer2;
                if (fillExtrusionLayer3 == null) {
                    MapboxLogger.logW("Mbgl-LayerUtils", "Given layerId = building-extrusion is not requested type in Layer");
                } else {
                    fillExtrusionLayer = fillExtrusionLayer3;
                }
                if (fillExtrusionLayer != null) {
                    Expression[] expressionArr2 = {expressionBuild};
                    Expression.ExpressionBuilder expressionBuilder2 = new Expression.ExpressionBuilder("!");
                    expressionBuilder2.addArgument(expressionArr2[0]);
                    fillExtrusionLayer.filter$1(Okio.all(expressionBuilder2.build(), expression));
                    return;
                }
                return;
            }
            return;
        }
        Layer layer3 = UrlUtils.getLayer(style, "building-extrusion");
        if (!(layer3 instanceof FillExtrusionLayer)) {
            layer3 = null;
        }
        FillExtrusionLayer fillExtrusionLayer4 = (FillExtrusionLayer) layer3;
        if (fillExtrusionLayer4 == null) {
            MapboxLogger.logW("Mbgl-LayerUtils", "Given layerId = building-extrusion is not requested type in Layer");
            fillExtrusionLayer4 = null;
        }
        if (fillExtrusionLayer4 == null || (value = style.getStyleLayerProperties("building-extrusion").getValue()) == null) {
            return;
        }
        Expression expression2 = (Expression) Layer.access$getPropertyValueWithType(fillExtrusionLayer4, "filter", Expression.class);
        String str = (String) Layer.access$getPropertyValueWithType(fillExtrusionLayer4, "source-layer", String.class);
        if (str == null) {
            return;
        }
        FillExtrusionLayer fillExtrusionLayer5 = new FillExtrusionLayer("mapbox-building-highlight-layer", fillExtrusionLayer4.sourceId);
        fillExtrusionLayer5.setProperty$extension_style_release(new PropertyValue("source-layer", str));
        UrlUtils.addPersistentLayer(style, fillExtrusionLayer5, new LayerPosition("building-extrusion", null, null));
        style.setStyleLayerProperties("mapbox-building-highlight-layer", value);
        fillExtrusionLayer5.filter$1(expressionBuild);
        fillExtrusionLayer5.fillExtrusionColor(mapboxBuildingHighlightOptions.fillExtrusionColor);
        fillExtrusionLayer5.setProperty$extension_style_release(new PropertyValue("fill-extrusion-opacity", Double.valueOf(0.6d)));
        if (expression2 != null) {
            concurrentHashMap.put(style, expression2);
            Expression[] expressionArr3 = {expressionBuild};
            Expression.ExpressionBuilder expressionBuilder3 = new Expression.ExpressionBuilder("!");
            expressionBuilder3.addArgument(expressionArr3[0]);
            fillExtrusionLayer4.filter$1(Okio.all(expressionBuilder3.build(), expression2));
        }
    }

    public SentryAttributes() {
        this.IconCompatParcelizer = new ConcurrentHashMap();
    }

    public SentryAttributes(ConcurrentHashMap concurrentHashMap) {
        this.IconCompatParcelizer = concurrentHashMap;
    }
}
