package com.mapbox.maps.plugin.locationcomponent;

import android.os.Process;
import androidx.sqlite.SQLite;
import com.braze.models.inappmessage.InAppMessageBase;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxLocationComponentException;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.Style;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.utils.ColorUtils$colorIntToRgbaExpression$1;
import com.mapbox.maps.plugin.LocationPuck3D;
import com.mapbox.maps.plugin.ModelElevationReference;
import com.mapbox.maps.plugin.ModelScaleMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o.accessgetInstancedelegatecp;
import o.onMove;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class ModelLayerRenderer implements LocationLayerRenderer {
    public static int read;
    public static int write;
    public double lastBearing;
    public Point lastLocation;
    public final LocationPuck3D locationModelLayerOptions;
    public final ModelLayerWrapper modelLayer;
    public final x source;
    public MapboxStyleManager style;

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public final void clearBitmaps() {
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public final void setAccuracyRadius(float f) {
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public final void styleAccuracy(int i, int i2) {
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public final void updatePulsingUi(int i, float f, Float f2) {
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public final void addLayers(ProtobufEncoder protobufEncoder) {
        protobufEncoder.addLayerToMap(this.modelLayer);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public final void hide() {
        ModelLayerWrapper modelLayerWrapper = this.modelLayer;
        modelLayerWrapper.getClass();
        modelLayerWrapper.updateProperty(RemoteMessageConst.Notification.VISIBILITY, new Value("none"));
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public final void setBearing(double d) {
        this.lastBearing = d;
        updateLocationOrBearing();
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public final void show() {
        ModelLayerWrapper modelLayerWrapper = this.modelLayer;
        modelLayerWrapper.getClass();
        modelLayerWrapper.updateProperty(RemoteMessageConst.Notification.VISIBILITY, new Value("visible"));
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public final void slot(String str) {
        ModelLayerWrapper modelLayerWrapper = this.modelLayer;
        modelLayerWrapper.getClass();
        if (str == null) {
            str = "";
        }
        modelLayerWrapper.updateProperty("slot", new Value(str));
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public final void styleScaling(Value value) {
        ModelLayerWrapper modelLayerWrapper = this.modelLayer;
        modelLayerWrapper.getClass();
        modelLayerWrapper.updateProperty("model-scale", value);
    }

    public final void updateLocationOrBearing() {
        String error;
        Double dValueOf = Double.valueOf(0.0d);
        Point point = this.lastLocation;
        if (point != null) {
            List list = SQLite.read(Double.valueOf(point.longitude()), Double.valueOf(point.latitude()));
            List list2 = SQLite.read(dValueOf, dValueOf, Double.valueOf(this.lastBearing));
            x xVar = this.source;
            xVar.getClass();
            List list3 = list;
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(new Value(((Number) it.next()).doubleValue()));
            }
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("position", new Value((List<Value>) arrayList));
            List list4 = list2;
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new Value(((Number) it2.next()).doubleValue()));
            }
            Value value = new Value((HashMap<String, Value>) onMove.serializer(new onViewAttachedToWindowlambda0("defaultModel", new Value((HashMap<String, Value>) onMove.serializer(onviewattachedtowindowlambda0, new onViewAttachedToWindowlambda0(InAppMessageBase.ORIENTATION, new Value((List<Value>) arrayList2)), new onViewAttachedToWindowlambda0("uri", new Value((String) xVar.read)))))));
            ((HashMap) xVar.RemoteActionCompatParcelizer).put("models", value);
            MapboxStyleManager mapboxStyleManager = (MapboxStyleManager) xVar.IconCompatParcelizer;
            if (mapboxStyleManager == null || (error = mapboxStyleManager.setStyleSourceProperty("mapbox-location-model-source", "models", value).getError()) == null) {
                return;
            }
            MapboxLogger.logE("Mbgl-ModelSourceWrapper", "Set source property \"models\" failed:\nError: " + error + "\nValue set: " + value);
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public final void updateStyle(Style style) {
        this.style = style;
        ModelLayerWrapper modelLayerWrapper = this.modelLayer;
        modelLayerWrapper.getClass();
        modelLayerWrapper.style = style;
        x xVar = this.source;
        xVar.getClass();
        xVar.IconCompatParcelizer = style;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public final void initializeComponents(MapboxStyleManager mapboxStyleManager) {
        mapboxStyleManager.getClass();
        this.style = mapboxStyleManager;
        x xVar = this.source;
        xVar.getClass();
        xVar.IconCompatParcelizer = mapboxStyleManager;
        HashMap map = (HashMap) xVar.RemoteActionCompatParcelizer;
        String error = mapboxStyleManager.addStyleSource("mapbox-location-model-source", new Value((HashMap<String, Value>) map)).getError();
        if (error == null) {
            return;
        }
        MapboxLogger.logW("Mbgl-ModelSourceWrapper", "Add source failed, " + map);
        throw new MapboxLocationComponentException("Add source failed: ".concat(error));
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public final void setLatLng(Point point) {
        point.getClass();
        this.lastLocation = point;
        updateLocationOrBearing();
    }

    public ModelLayerRenderer(LocationPuck3D locationPuck3D) {
        Value value;
        Value value2;
        Value value3;
        Value value4;
        Value value5;
        Value valueBuild;
        locationPuck3D.getClass();
        this.locationModelLayerOptions = locationPuck3D;
        List list = locationPuck3D.modelScale;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((Number) it.next()).floatValue()));
        }
        List list2 = locationPuck3D.modelRotation;
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Double.valueOf(((Number) it2.next()).floatValue()));
        }
        String str = locationPuck3D.modelRotationExpression;
        if (str != null) {
            Expected<String, Value> expectedFromJson = Value.fromJson(str);
            expectedFromJson.getClass();
            String error = expectedFromJson.getError();
            if (error == null) {
                Value value6 = expectedFromJson.getValue();
                if (value6 != null) {
                    value = value6;
                } else {
                    throw new MapboxLocationComponentException("Error in parsing expression.");
                }
            } else {
                throw new MapboxLocationComponentException(error);
            }
        } else {
            value = null;
        }
        List list3 = locationPuck3D.modelTranslation;
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Double.valueOf(((Number) it3.next()).floatValue()));
        }
        boolean z = locationPuck3D.modelCastShadows;
        boolean z2 = locationPuck3D.modelReceiveShadows;
        double d = locationPuck3D.modelOpacity;
        String str2 = locationPuck3D.modelOpacityExpression;
        if (str2 != null) {
            Expected<String, Value> expectedFromJson2 = Value.fromJson(str2);
            expectedFromJson2.getClass();
            String error2 = expectedFromJson2.getError();
            if (error2 == null) {
                Value value7 = expectedFromJson2.getValue();
                if (value7 != null) {
                    value2 = value7;
                } else {
                    throw new MapboxLocationComponentException("Error in parsing expression.");
                }
            } else {
                throw new MapboxLocationComponentException(error2);
            }
        } else {
            value2 = null;
        }
        ModelScaleMode modelScaleMode = locationPuck3D.modelScaleMode;
        double d2 = locationPuck3D.modelEmissiveStrength;
        String str3 = locationPuck3D.modelEmissiveStrengthExpression;
        if (str3 != null) {
            Expected<String, Value> expectedFromJson3 = Value.fromJson(str3);
            expectedFromJson3.getClass();
            String error3 = expectedFromJson3.getError();
            if (error3 == null) {
                Value value8 = expectedFromJson3.getValue();
                if (value8 != null) {
                    value3 = value8;
                } else {
                    throw new MapboxLocationComponentException("Error in parsing expression.");
                }
            } else {
                throw new MapboxLocationComponentException(error3);
            }
        } else {
            value3 = null;
        }
        int i = locationPuck3D.modelColor;
        String str4 = locationPuck3D.modelColorExpression;
        if (str4 != null) {
            Expected<String, Value> expectedFromJson4 = Value.fromJson(str4);
            expectedFromJson4.getClass();
            String error4 = expectedFromJson4.getError();
            if (error4 == null) {
                Value value9 = expectedFromJson4.getValue();
                if (value9 != null) {
                    value4 = value9;
                } else {
                    throw new MapboxLocationComponentException("Error in parsing expression.");
                }
            } else {
                throw new MapboxLocationComponentException(error4);
            }
        } else {
            value4 = null;
        }
        double d3 = locationPuck3D.modelColorMixIntensity;
        String str5 = locationPuck3D.modelColorMixIntensityExpression;
        if (str5 != null) {
            Expected<String, Value> expectedFromJson5 = Value.fromJson(str5);
            expectedFromJson5.getClass();
            String error5 = expectedFromJson5.getError();
            if (error5 == null) {
                Value value10 = expectedFromJson5.getValue();
                if (value10 != null) {
                    value5 = value10;
                } else {
                    throw new MapboxLocationComponentException("Error in parsing expression.");
                }
            } else {
                throw new MapboxLocationComponentException(error5);
            }
        } else {
            value5 = null;
        }
        ModelElevationReference modelElevationReference = locationPuck3D.modelElevationReference;
        modelScaleMode.getClass();
        modelElevationReference.getClass();
        ModelLayerWrapper modelLayerWrapper = new ModelLayerWrapper("mapbox-location-model-layer");
        Value value11 = new Value("mapbox-location-model-layer");
        HashMap map = modelLayerWrapper.layerProperties;
        map.put("id", value11);
        map.put("type", new Value("model"));
        map.put("source", new Value("mapbox-location-model-source"));
        map.put("model-type", new Value("location-indicator"));
        ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(new Value(((Number) it4.next()).doubleValue()));
            value4 = value4;
            modelElevationReference = modelElevationReference;
        }
        Value value12 = value4;
        ModelElevationReference modelElevationReference2 = modelElevationReference;
        map.put("model-scale", new Value((List<Value>) arrayList4));
        if (value == null) {
            ArrayList arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                arrayList5.add(new Value(((Number) it5.next()).doubleValue()));
            }
            value = new Value((List<Value>) arrayList5);
        }
        map.put("model-rotation", value);
        ArrayList arrayList6 = new ArrayList(accessgetInstancedelegatecp.write(arrayList3, 10));
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            arrayList6.add(new Value(((Number) it6.next()).doubleValue()));
        }
        map.put("model-translation", new Value((List<Value>) arrayList6));
        map.put("model-cast-shadows", new Value(z));
        map.put("model-receive-shadows", new Value(z2));
        map.put("model-opacity", value2 == null ? new Value(d) : value2);
        map.put("model-scale-mode", new Value(modelScaleMode.getValue()));
        map.put("model-scale-transition", ModelLayerWrapper.buildTransition$1());
        map.put("model-rotation-transition", ModelLayerWrapper.buildTransition$1());
        map.put("model-emissive-strength", value3 == null ? new Value(d2) : value3);
        if (value12 == null) {
            ColorUtils$colorIntToRgbaExpression$1 colorUtils$colorIntToRgbaExpression$1 = new ColorUtils$colorIntToRgbaExpression$1(((double) ((i >> 24) & 255)) / 255.0d, i);
            Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("rgba");
            colorUtils$colorIntToRgbaExpression$1.invoke(expressionBuilder);
            valueBuild = expressionBuilder.build();
        } else {
            valueBuild = value12;
        }
        map.put("model-color", valueBuild);
        map.put("model-color-mix-intensity", value5 == null ? new Value(d3) : value5);
        map.put("model-elevation-reference", new Value(modelElevationReference2.getValue()));
        this.modelLayer = modelLayerWrapper;
        LocationPuck3D locationPuck3D2 = this.locationModelLayerOptions;
        locationPuck3D2.getClass();
        String str6 = locationPuck3D2.modelUri;
        if (str6.length() != 0) {
            List list4 = locationPuck3D2.position;
            ArrayList arrayList7 = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
            Iterator it7 = list4.iterator();
            while (it7.hasNext()) {
                arrayList7.add(Double.valueOf(((Number) it7.next()).floatValue()));
            }
            List list5 = locationPuck3D2.materialOverrides;
            List list6 = locationPuck3D2.nodeOverrides;
            Double dValueOf = Double.valueOf(0.0d);
            str6.getClass();
            list5.getClass();
            list6.getClass();
            x xVar = new x(13, false);
            xVar.read = str6;
            xVar.RemoteActionCompatParcelizer = new HashMap();
            HashMap map2 = new HashMap();
            map2.put("uri", new Value(str6));
            ArrayList arrayList8 = new ArrayList(accessgetInstancedelegatecp.write(arrayList7, 10));
            Iterator it8 = arrayList7.iterator();
            while (it8.hasNext()) {
                arrayList8.add(new Value(((Number) it8.next()).doubleValue()));
            }
            map2.put("position", new Value((List<Value>) arrayList8));
            List list7 = SQLite.read(dValueOf, dValueOf, dValueOf);
            ArrayList arrayList9 = new ArrayList(accessgetInstancedelegatecp.write(list7, 10));
            Iterator it9 = list7.iterator();
            while (it9.hasNext()) {
                arrayList9.add(new Value(((Number) it9.next()).doubleValue()));
            }
            map2.put(InAppMessageBase.ORIENTATION, new Value((List<Value>) arrayList9));
            List list8 = list5;
            ArrayList arrayList10 = new ArrayList(accessgetInstancedelegatecp.write(list8, 10));
            Iterator it10 = list8.iterator();
            while (it10.hasNext()) {
                arrayList10.add(new Value((String) it10.next()));
            }
            map2.put("materialOverrides", new Value((List<Value>) arrayList10));
            List list9 = list6;
            ArrayList arrayList11 = new ArrayList(accessgetInstancedelegatecp.write(list9, 10));
            Iterator it11 = list9.iterator();
            while (it11.hasNext()) {
                arrayList11.add(new Value((String) it11.next()));
            }
            map2.put("nodeOverrides", new Value((List<Value>) arrayList11));
            HashMap map3 = new HashMap();
            map3.put("defaultModel", new Value((HashMap<String, Value>) map2));
            ((HashMap) xVar.RemoteActionCompatParcelizer).put("type", new Value("model"));
            ((HashMap) xVar.RemoteActionCompatParcelizer).put("models", new Value((HashMap<String, Value>) map3));
            this.source = xVar;
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Model Url must not be empty!");
        throw null;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public final void removeLayers() {
        MapboxStyleManager mapboxStyleManager = this.style;
        if (mapboxStyleManager != null) {
            mapboxStyleManager.removeStyleLayer(this.modelLayer.layerId);
        }
        MapboxStyleManager mapboxStyleManager2 = this.style;
        if (mapboxStyleManager2 != null) {
            this.source.getClass();
            mapboxStyleManager2.removeStyleSource("mapbox-location-model-source");
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public final boolean isRendererInitialised() {
        MapboxStyleManager mapboxStyleManager;
        MapboxStyleManager mapboxStyleManager2 = this.style;
        return mapboxStyleManager2 != null && mapboxStyleManager2.styleLayerExists("mapbox-location-model-layer") && (mapboxStyleManager = this.style) != null && mapboxStyleManager.styleSourceExists("mapbox-location-model-source");
    }

    public static int RemoteActionCompatParcelizer() {
        int i = read;
        int i2 = i % 9838641;
        read = i + 1;
        if (i2 != 0) {
            return write;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        write = elapsedCpuTime;
        return elapsedCpuTime;
    }
}
