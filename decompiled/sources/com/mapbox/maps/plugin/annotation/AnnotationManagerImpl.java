package com.mapbox.maps.plugin.annotation;

import android.graphics.Bitmap;
import android.os.HandlerThread;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.android.gestures.AndroidGesturesManager;
import com.mapbox.android.gestures.MoveGestureDetector;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Point;
import com.mapbox.maps.ClickInteraction;
import com.mapbox.maps.ExtensionUtils;
import com.mapbox.maps.Image;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.LongClickInteraction;
import com.mapbox.maps.MapController;
import com.mapbox.maps.MapInteraction;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxStyleException;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.generated.CircleLayer;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.sources.generated.GeoJsonSource;
import com.mapbox.maps.extension.style.utils.ColorUtils$colorIntToRgbaExpression$1;
import com.mapbox.maps.extension.style.utils.TypeUtils;
import com.mapbox.maps.plugin.InvalidPluginConfigurationException;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotation;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationManager;
import com.mapbox.maps.plugin.gestures.GesturesPlugin;
import com.mapbox.maps.plugin.gestures.GesturesPluginImpl;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;
import okio.Okio;
import org.koin.android.ext.koin.KoinExtKt$androidContext$1$1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AnnotationManagerImpl {
    public static final Expression DEFAULT_TEXT_FIELD;
    public final LinkedHashMap annotationMap;
    public final ArrayList associatedLayers;
    public final ArrayList associatedSources;
    public final ArrayList clickListeners;
    public final JsonObject dataDrivenPropertyDefaultValues;
    public final LinkedHashMap dataDrivenPropertyUsageMap;
    public final MapDelegateProviderImpl delegateProvider;
    public final LinkedHashMap dragAnnotationMap;
    public final Layer dragLayer;
    public final ArrayList dragListeners;
    public final GeoJsonSource dragSource;
    public PointAnnotation draggingAnnotation;
    public final ArrayList interactionListener;
    public final LinkedHashSet interactionsCancelableSet;
    public final Layer layer;
    public final ArrayList longClickListeners;
    public final MapboxMap mapInteractionDelegate;
    public final MoveGestureDetector mapMoveDetector;
    public final GeoJsonSource source;
    public final zzbv styleImages;

    public abstract String getAnnotationIdKey();

    public abstract void setDataDrivenPropertyIsUsed(String str);

    public static void addIconToStyle(MapboxStyleManager mapboxStyleManager, Collection collection) {
        String iconImageInternal$plugin_annotation_release;
        Bitmap bitmap;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            PointAnnotation pointAnnotation = (PointAnnotation) it.next();
            if (!(pointAnnotation instanceof PointAnnotation)) {
                pointAnnotation = null;
            }
            if (pointAnnotation != null && (iconImageInternal$plugin_annotation_release = pointAnnotation.getIconImageInternal$plugin_annotation_release()) != null && setCarryoverInAppMessage.RemoteActionCompatParcelizer(iconImageInternal$plugin_annotation_release, "icon_default_name_", false) && !mapboxStyleManager.hasStyleImage(iconImageInternal$plugin_annotation_release) && (bitmap = pointAnnotation.iconImageBitmap) != null) {
                Image mapboxImage = ExtensionUtils.toMapboxImage(bitmap);
                mapboxImage.getClass();
                float pixelRatio = mapboxStyleManager.getPixelRatio();
                instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
                Expected<String, None> expectedAddStyleImage = mapboxStyleManager.addStyleImage(iconImageInternal$plugin_annotation_release, pixelRatio, mapboxImage, false, instance_delegatelambda0Var, instance_delegatelambda0Var, null);
                if (expectedAddStyleImage == null) {
                    throw new MapboxStyleException("Plugin is not added to Style yet.");
                }
                String error = expectedAddStyleImage.getError();
                if (error != null) {
                    throw new MapboxStyleException(error);
                }
            }
        }
    }

    public final void deleteAll() {
        LinkedHashMap linkedHashMap = this.annotationMap;
        if (!linkedHashMap.isEmpty()) {
            linkedHashMap.clear();
            updateSource();
        }
        LinkedHashMap linkedHashMap2 = this.dragAnnotationMap;
        if (!linkedHashMap2.isEmpty()) {
            linkedHashMap2.clear();
            MapboxMap mapboxMap = (MapboxMap) this.delegateProvider.mapStyleManagerDelegate;
            GeoJsonSource geoJsonSource = this.dragSource;
            if (mapboxMap.styleSourceExists(geoJsonSource.sourceId) && mapboxMap.styleLayerExists(this.dragLayer.getLayerId())) {
                Collection collectionValues = linkedHashMap2.values();
                collectionValues.getClass();
                addIconToStyle(mapboxMap, collectionValues);
                Collection collectionValues2 = linkedHashMap2.values();
                collectionValues2.getClass();
                FeatureCollection featureCollectionFromFeatures = FeatureCollection.fromFeatures(convertAnnotationsToFeatures(collectionValues2));
                featureCollectionFromFeatures.getClass();
                HandlerThread handlerThread = GeoJsonSource.workerThread;
                geoJsonSource.setGeoJson(featureCollectionFromFeatures, "");
            } else {
                MapboxLogger.logW("AnnotationManagerImpl", "Can't update dragSource: drag source or layer has not been added to style.");
            }
        }
        this.styleImages.clear();
    }

    public final void enableDataDrivenProperty(String str) {
        LinkedHashMap linkedHashMap = this.dataDrivenPropertyUsageMap;
        Object[] objArr = {linkedHashMap.get(str), Boolean.FALSE};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            linkedHashMap.put(str, Boolean.TRUE);
            setDataDrivenPropertyIsUsed(str);
        }
    }

    public final void updateSource() {
        MapboxMap mapboxMap = (MapboxMap) this.delegateProvider.mapStyleManagerDelegate;
        GeoJsonSource geoJsonSource = this.source;
        if (!mapboxMap.styleSourceExists(geoJsonSource.sourceId) || !mapboxMap.styleLayerExists(this.layer.getLayerId())) {
            MapboxLogger.logW("AnnotationManagerImpl", "Can't update source: source or layer has not been added to style.");
            return;
        }
        LinkedHashMap linkedHashMap = this.annotationMap;
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        addIconToStyle(mapboxMap, collectionValues);
        Collection collectionValues2 = linkedHashMap.values();
        collectionValues2.getClass();
        FeatureCollection featureCollectionFromFeatures = FeatureCollection.fromFeatures(convertAnnotationsToFeatures(collectionValues2));
        featureCollectionFromFeatures.getClass();
        HandlerThread handlerThread = GeoJsonSource.workerThread;
        geoJsonSource.setGeoJson(featureCollectionFromFeatures, "");
    }

    public final void setLayerProperty(String str, Value value) {
        value.getClass();
        try {
            MapboxMap mapboxMap = (MapboxMap) this.delegateProvider.mapStyleManagerDelegate;
            mapboxMap.setStyleLayerProperty(this.layer.getLayerId(), str, value);
            mapboxMap.setStyleLayerProperty(this.dragLayer.getLayerId(), str, value);
        } catch (IllegalArgumentException e) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Incorrect property value for ", str, ": ");
            sbM.append(e.getMessage());
            throw new IllegalArgumentException(sbM.toString(), e.getCause());
        }
    }

    static {
        Expression[] expressionArr = {new Expression("point_count")};
        Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("get");
        expressionBuilder.addArgument(expressionArr[0]);
        DEFAULT_TEXT_FIELD = expressionBuilder.build();
    }

    public final void stopDragging() {
        if (this.draggingAnnotation != null) {
            Iterator it = this.dragListeners.iterator();
            if (it.hasNext()) {
                m1$$ExternalSyntheticOutline0.m(it.next());
                throw null;
            }
            this.draggingAnnotation = null;
        }
    }

    public final ArrayList convertAnnotationsToFeatures(Collection collection) {
        Collection<PointAnnotation> collection2 = collection;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(collection2, 10));
        for (PointAnnotation pointAnnotation : collection2) {
            PointAnnotationManager pointAnnotationManager = pointAnnotation.annotationManager;
            JsonObject jsonObject = pointAnnotation.jsonObject;
            if (jsonObject.get("icon-anchor") != null) {
                pointAnnotationManager.enableDataDrivenProperty("icon-anchor");
            }
            if (jsonObject.get("icon-image") != null) {
                pointAnnotationManager.enableDataDrivenProperty("icon-image");
            }
            if (jsonObject.get("icon-offset") != null) {
                pointAnnotationManager.enableDataDrivenProperty("icon-offset");
            }
            if (jsonObject.get("icon-rotate") != null) {
                pointAnnotationManager.enableDataDrivenProperty("icon-rotate");
            }
            if (jsonObject.get("icon-size") != null) {
                pointAnnotationManager.enableDataDrivenProperty("icon-size");
            }
            if (jsonObject.get("icon-text-fit") != null) {
                pointAnnotationManager.enableDataDrivenProperty("icon-text-fit");
            }
            if (jsonObject.get("icon-text-fit-padding") != null) {
                pointAnnotationManager.enableDataDrivenProperty("icon-text-fit-padding");
            }
            if (jsonObject.get("symbol-sort-key") != null) {
                pointAnnotationManager.enableDataDrivenProperty("symbol-sort-key");
            }
            if (jsonObject.get("text-anchor") != null) {
                pointAnnotationManager.enableDataDrivenProperty("text-anchor");
            }
            if (jsonObject.get("text-field") != null) {
                pointAnnotationManager.enableDataDrivenProperty("text-field");
            }
            if (jsonObject.get("text-justify") != null) {
                pointAnnotationManager.enableDataDrivenProperty("text-justify");
            }
            if (jsonObject.get("text-letter-spacing") != null) {
                pointAnnotationManager.enableDataDrivenProperty("text-letter-spacing");
            }
            if (jsonObject.get("text-line-height") != null) {
                pointAnnotationManager.enableDataDrivenProperty("text-line-height");
            }
            if (jsonObject.get("text-max-width") != null) {
                pointAnnotationManager.enableDataDrivenProperty("text-max-width");
            }
            if (jsonObject.get("text-offset") != null) {
                pointAnnotationManager.enableDataDrivenProperty("text-offset");
            }
            if (jsonObject.get("text-radial-offset") != null) {
                pointAnnotationManager.enableDataDrivenProperty("text-radial-offset");
            }
            if (jsonObject.get("text-rotate") != null) {
                pointAnnotationManager.enableDataDrivenProperty("text-rotate");
            }
            if (jsonObject.get("text-size") != null) {
                pointAnnotationManager.enableDataDrivenProperty("text-size");
            }
            if (jsonObject.get("text-transform") != null) {
                pointAnnotationManager.enableDataDrivenProperty("text-transform");
            }
            if (jsonObject.get("icon-color") != null) {
                pointAnnotationManager.enableDataDrivenProperty("icon-color");
            }
            if (jsonObject.get("icon-emissive-strength") != null) {
                pointAnnotationManager.enableDataDrivenProperty("icon-emissive-strength");
            }
            if (jsonObject.get("icon-halo-blur") != null) {
                pointAnnotationManager.enableDataDrivenProperty("icon-halo-blur");
            }
            if (jsonObject.get("icon-halo-color") != null) {
                pointAnnotationManager.enableDataDrivenProperty("icon-halo-color");
            }
            if (jsonObject.get("icon-halo-width") != null) {
                pointAnnotationManager.enableDataDrivenProperty("icon-halo-width");
            }
            if (jsonObject.get("icon-occlusion-opacity") != null) {
                pointAnnotationManager.enableDataDrivenProperty("icon-occlusion-opacity");
            }
            if (jsonObject.get("icon-opacity") != null) {
                pointAnnotationManager.enableDataDrivenProperty("icon-opacity");
            }
            if (jsonObject.get("symbol-z-offset") != null) {
                pointAnnotationManager.enableDataDrivenProperty("symbol-z-offset");
            }
            if (jsonObject.get("text-color") != null) {
                pointAnnotationManager.enableDataDrivenProperty("text-color");
            }
            if (jsonObject.get("text-emissive-strength") != null) {
                pointAnnotationManager.enableDataDrivenProperty("text-emissive-strength");
            }
            if (jsonObject.get("text-halo-blur") != null) {
                pointAnnotationManager.enableDataDrivenProperty("text-halo-blur");
            }
            if (jsonObject.get("text-halo-color") != null) {
                pointAnnotationManager.enableDataDrivenProperty("text-halo-color");
            }
            if (jsonObject.get("text-halo-width") != null) {
                pointAnnotationManager.enableDataDrivenProperty("text-halo-width");
            }
            if (jsonObject.get("text-occlusion-opacity") != null) {
                pointAnnotationManager.enableDataDrivenProperty("text-occlusion-opacity");
            }
            if (jsonObject.get("text-opacity") != null) {
                pointAnnotationManager.enableDataDrivenProperty("text-opacity");
            }
            if (jsonObject.get("icon-color-use-theme") != null) {
                pointAnnotationManager.enableDataDrivenProperty("icon-color-use-theme");
            }
            if (jsonObject.get("icon-halo-color-use-theme") != null) {
                pointAnnotationManager.enableDataDrivenProperty("icon-halo-color-use-theme");
            }
            if (jsonObject.get("text-color-use-theme") != null) {
                pointAnnotationManager.enableDataDrivenProperty("text-color-use-theme");
            }
            if (jsonObject.get("text-halo-color-use-theme") != null) {
                pointAnnotationManager.enableDataDrivenProperty("text-halo-color-use-theme");
            }
            Point point = pointAnnotation.geometry;
            JsonObject jsonObjectDeepCopy = pointAnnotation.jsonObject.deepCopy();
            jsonObjectDeepCopy.getClass();
            Set<Map.Entry<String, JsonElement>> setEntrySet = this.dataDrivenPropertyDefaultValues.entrySet();
            setEntrySet.getClass();
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!jsonObjectDeepCopy.has((String) entry.getKey())) {
                    jsonObjectDeepCopy.add((String) entry.getKey(), (JsonElement) entry.getValue());
                }
            }
            arrayList.add(Feature.fromGeometry(point, jsonObjectDeepCopy, pointAnnotation.id));
        }
        return arrayList;
    }

    public AnnotationManagerImpl(MapDelegateProviderImpl mapDelegateProviderImpl, AnnotationConfig annotationConfig, long j, String str, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) throws InvalidPluginConfigurationException {
        mapDelegateProviderImpl.getClass();
        this.delegateProvider = mapDelegateProviderImpl;
        this.dataDrivenPropertyUsageMap = new LinkedHashMap();
        this.mapInteractionDelegate = (MapboxMap) mapDelegateProviderImpl.mapInteractionDelegate;
        this.annotationMap = new LinkedHashMap();
        this.dragAnnotationMap = new LinkedHashMap();
        this.styleImages = new zzbv(this);
        this.dataDrivenPropertyDefaultValues = new JsonObject();
        this.interactionsCancelableSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        this.associatedLayers = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.associatedSources = arrayList2;
        GesturesPlugin gesturesPlugin = (GesturesPlugin) ((MapController) mapDelegateProviderImpl.mapPluginProviderDelegate).getPlugin("MAPBOX_GESTURES_PLUGIN_ID");
        if (gesturesPlugin != null) {
            AndroidGesturesManager androidGesturesManager = ((GesturesPluginImpl) gesturesPlugin).gesturesManager;
            if (androidGesturesManager != null) {
                this.mapMoveDetector = androidGesturesManager.moveGestureDetector;
                this.dragListeners = new ArrayList();
                this.clickListeners = new ArrayList();
                this.longClickListeners = new ArrayList();
                this.interactionListener = new ArrayList();
                final AnnotationSourceOptions annotationSourceOptions = annotationConfig.annotationSourceOptions;
                MapboxMap mapboxMap = (MapboxMap) mapDelegateProviderImpl.mapStyleManagerDelegate;
                Object obj = annotationConfig.layerId;
                String str2 = "mapbox-android-" + str + "-source-" + j;
                final int i = 0;
                GeoJsonSource geoJsonSource = LazyKt__LazyJVMKt.geoJsonSource(str2, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$createSource$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj2) {
                        int i2 = i;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        AnnotationSourceOptions annotationSourceOptions2 = annotationSourceOptions;
                        if (i2 == 0) {
                            GeoJsonSource.Builder builder = (GeoJsonSource.Builder) obj2;
                            builder.getClass();
                            HashMap map = builder.properties;
                            if (annotationSourceOptions2 != null) {
                                ClusterOptions clusterOptions = annotationSourceOptions2.clusterOptions;
                                boolean z = clusterOptions.cluster;
                                TypeUtils typeUtils = TypeUtils.INSTANCE;
                                map.put("cluster", new PropertyValue("cluster", typeUtils.wrapToValue(Boolean.valueOf(z))));
                                map.put("clusterMaxZoom", new PropertyValue("clusterMaxZoom", typeUtils.wrapToValue(Long.valueOf(clusterOptions.clusterMaxZoom))));
                                map.put("clusterMinPoints", new PropertyValue("clusterMinPoints", typeUtils.wrapToValue(Long.valueOf(clusterOptions.clusterMinPoints))));
                                map.put("clusterRadius", new PropertyValue("clusterRadius", typeUtils.wrapToValue(Long.valueOf(clusterOptions.clusterRadius))));
                            }
                            return createfromparcel;
                        }
                        SymbolLayer symbolLayer = (SymbolLayer) obj2;
                        symbolLayer.getClass();
                        ClusterOptions clusterOptions2 = annotationSourceOptions2.clusterOptions;
                        Expression expression = AnnotationManagerImpl.DEFAULT_TEXT_FIELD;
                        expression.getClass();
                        symbolLayer.setProperty$extension_style_release(new PropertyValue("text-field", expression));
                        symbolLayer.setProperty$extension_style_release(new PropertyValue("text-size", Double.valueOf(clusterOptions2.textSize)));
                        int i3 = clusterOptions2.textColor;
                        ColorUtils$colorIntToRgbaExpression$1 colorUtils$colorIntToRgbaExpression$1 = new ColorUtils$colorIntToRgbaExpression$1(((double) ((i3 >> 24) & 255)) / 255.0d, i3);
                        Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("rgba");
                        colorUtils$colorIntToRgbaExpression$1.invoke(expressionBuilder);
                        symbolLayer.setProperty$extension_style_release(new PropertyValue("text-color", expressionBuilder.build()));
                        Boolean bool = Boolean.TRUE;
                        symbolLayer.setProperty$extension_style_release(new PropertyValue("text-ignore-placement", bool));
                        symbolLayer.setProperty$extension_style_release(new PropertyValue("text-allow-overlap", bool));
                        return createfromparcel;
                    }
                });
                String str3 = geoJsonSource.sourceId;
                this.source = geoJsonSource;
                Layer layer = (Layer) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj, str2);
                this.layer = layer;
                String str4 = "mapbox-android-" + str + "-dragsource-" + j;
                final int i2 = 1;
                GeoJsonSource geoJsonSource2 = LazyKt__LazyJVMKt.geoJsonSource(str4, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(i2) { // from class: com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$createDragSource$1
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj2) {
                        ((GeoJsonSource.Builder) obj2).getClass();
                        return createFromParcel.INSTANCE;
                    }
                });
                String str5 = geoJsonSource2.sourceId;
                this.dragSource = geoJsonSource2;
                Layer layer2 = (Layer) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke("mapbox-android-" + str + "-draglayer-" + j, str4);
                this.dragLayer = layer2;
                if (!mapboxMap.styleSourceExists(str3)) {
                    geoJsonSource.bindTo(mapboxMap);
                    arrayList2.add(str3);
                }
                if (!mapboxMap.styleLayerExists(layer.getLayerId())) {
                    UrlUtils.addPersistentLayer(mapboxMap, layer, null);
                    arrayList.add(layer.getLayerId());
                }
                if (!mapboxMap.styleSourceExists(str5)) {
                    geoJsonSource2.bindTo(mapboxMap);
                    arrayList2.add(str5);
                }
                if (!mapboxMap.styleLayerExists(layer2.getLayerId())) {
                    UrlUtils.addPersistentLayer(mapboxMap, layer2, new LayerPosition(layer.getLayerId(), null, null));
                    arrayList.add(layer2.getLayerId());
                }
                if (((layer instanceof SymbolLayer) || (layer instanceof CircleLayer)) && annotationSourceOptions != null) {
                    final List list = annotationSourceOptions.clusterOptions.colorLevels;
                    final int i3 = 0;
                    for (Object obj2 : list) {
                        if (i3 >= 0) {
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$createClusterLevelLayer$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                public final Object invoke(Object obj3) {
                                    Expression expressionAll;
                                    CircleLayer circleLayer = (CircleLayer) obj3;
                                    circleLayer.getClass();
                                    List list2 = list;
                                    int i4 = i3;
                                    circleLayer.circleColor(((Number) ((onViewAttachedToWindowlambda0) list2.get(i4)).write).intValue());
                                    circleLayer.setProperty$extension_style_release(new PropertyValue("circle-radius", Double.valueOf(annotationSourceOptions.clusterOptions.circleRadius)));
                                    Expression[] expressionArr = {new Expression("point_count")};
                                    Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("get");
                                    int i5 = 0;
                                    expressionBuilder.addArgument(expressionArr[0]);
                                    Expression[] expressionArr2 = {expressionBuilder.build()};
                                    Expression.ExpressionBuilder expressionBuilder2 = new Expression.ExpressionBuilder("to-number");
                                    expressionBuilder2.addArgument(expressionArr2[0]);
                                    Expression expressionBuild = expressionBuilder2.build();
                                    if (i4 == 0) {
                                        Expression[] expressionArr3 = {new Expression("point_count")};
                                        Expression.ExpressionBuilder expressionBuilder3 = new Expression.ExpressionBuilder("has");
                                        expressionBuilder3.addArgument(expressionArr3[0]);
                                        Expression expressionBuild2 = expressionBuilder3.build();
                                        Expression[] expressionArr4 = {expressionBuild, new Expression(((Number) ((onViewAttachedToWindowlambda0) list2.get(i4)).serializer).intValue())};
                                        Expression.ExpressionBuilder expressionBuilder4 = new Expression.ExpressionBuilder(">=");
                                        while (i5 < 2) {
                                            expressionBuilder4.addArgument(expressionArr4[i5]);
                                            i5++;
                                        }
                                        expressionAll = Okio.all(expressionBuild2, expressionBuilder4.build());
                                    } else {
                                        Expression[] expressionArr5 = {new Expression("point_count")};
                                        Expression.ExpressionBuilder expressionBuilder5 = new Expression.ExpressionBuilder("has");
                                        expressionBuilder5.addArgument(expressionArr5[0]);
                                        Expression expressionBuild3 = expressionBuilder5.build();
                                        Expression[] expressionArr6 = {expressionBuild, new Expression(((Number) ((onViewAttachedToWindowlambda0) list2.get(i4)).serializer).intValue())};
                                        Expression.ExpressionBuilder expressionBuilder6 = new Expression.ExpressionBuilder(">");
                                        for (int i6 = 0; i6 < 2; i6++) {
                                            expressionBuilder6.addArgument(expressionArr6[i6]);
                                        }
                                        Expression expressionBuild4 = expressionBuilder6.build();
                                        Expression[] expressionArr7 = {expressionBuild, new Expression(((Number) ((onViewAttachedToWindowlambda0) list2.get(i4 - 1)).serializer).intValue())};
                                        Expression.ExpressionBuilder expressionBuilder7 = new Expression.ExpressionBuilder("<");
                                        while (i5 < 2) {
                                            expressionBuilder7.addArgument(expressionArr7[i5]);
                                            i5++;
                                        }
                                        expressionAll = Okio.all(expressionBuild3, expressionBuild4, expressionBuilder7.build());
                                    }
                                    m1$$ExternalSyntheticOutline0.m("filter", expressionAll, circleLayer);
                                    return createFromParcel.INSTANCE;
                                }
                            };
                            str3.getClass();
                            CircleLayer circleLayer = new CircleLayer("mapbox-android-" + str + "-cluster-circle-layer-" + i3 + '-' + j, str3);
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(circleLayer);
                            String str6 = circleLayer.layerId;
                            if (!mapboxMap.styleLayerExists(str6)) {
                                UrlUtils.addPersistentLayer(mapboxMap, circleLayer, new LayerPosition((String) onContentCardDismissed.MediaBrowserCompatMediaItem((List) arrayList), null, null));
                                arrayList.add(str6);
                                LinkedHashSet linkedHashSet = this.interactionsCancelableSet;
                                MapboxMap mapboxMap2 = this.mapInteractionDelegate;
                                ClickInteraction.Companion companion = ClickInteraction.Companion;
                                KoinExtKt$androidContext$1$1 koinExtKt$androidContext$1$1 = new KoinExtKt$androidContext$1$1(1, this);
                                String str7 = circleLayer.layerId;
                                linkedHashSet.add(mapboxMap2.addInteraction(ClickInteraction.Companion.layer$default(companion, str7, null, null, koinExtKt$androidContext$1$1, 6, null)));
                                linkedHashSet.add(mapboxMap2.addInteraction(LongClickInteraction.Companion.layer$default(LongClickInteraction.Companion, str7, null, null, new KoinExtKt$androidContext$1$1(2, this), 6, null)));
                            }
                            i3++;
                            list = list;
                        } else {
                            SQLite.serializer();
                            throw null;
                        }
                    }
                    final int i4 = 1;
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.maps.plugin.annotation.AnnotationManagerImpl$createSource$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final Object invoke(Object obj3) {
                            int i5 = i4;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            AnnotationSourceOptions annotationSourceOptions2 = annotationSourceOptions;
                            if (i5 == 0) {
                                GeoJsonSource.Builder builder = (GeoJsonSource.Builder) obj3;
                                builder.getClass();
                                HashMap map = builder.properties;
                                if (annotationSourceOptions2 != null) {
                                    ClusterOptions clusterOptions = annotationSourceOptions2.clusterOptions;
                                    boolean z = clusterOptions.cluster;
                                    TypeUtils typeUtils = TypeUtils.INSTANCE;
                                    map.put("cluster", new PropertyValue("cluster", typeUtils.wrapToValue(Boolean.valueOf(z))));
                                    map.put("clusterMaxZoom", new PropertyValue("clusterMaxZoom", typeUtils.wrapToValue(Long.valueOf(clusterOptions.clusterMaxZoom))));
                                    map.put("clusterMinPoints", new PropertyValue("clusterMinPoints", typeUtils.wrapToValue(Long.valueOf(clusterOptions.clusterMinPoints))));
                                    map.put("clusterRadius", new PropertyValue("clusterRadius", typeUtils.wrapToValue(Long.valueOf(clusterOptions.clusterRadius))));
                                }
                                return createfromparcel;
                            }
                            SymbolLayer symbolLayer = (SymbolLayer) obj3;
                            symbolLayer.getClass();
                            ClusterOptions clusterOptions2 = annotationSourceOptions2.clusterOptions;
                            Expression expression = AnnotationManagerImpl.DEFAULT_TEXT_FIELD;
                            expression.getClass();
                            symbolLayer.setProperty$extension_style_release(new PropertyValue("text-field", expression));
                            symbolLayer.setProperty$extension_style_release(new PropertyValue("text-size", Double.valueOf(clusterOptions2.textSize)));
                            int i6 = clusterOptions2.textColor;
                            ColorUtils$colorIntToRgbaExpression$1 colorUtils$colorIntToRgbaExpression$1 = new ColorUtils$colorIntToRgbaExpression$1(((double) ((i6 >> 24) & 255)) / 255.0d, i6);
                            Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("rgba");
                            colorUtils$colorIntToRgbaExpression$1.invoke(expressionBuilder);
                            symbolLayer.setProperty$extension_style_release(new PropertyValue("text-color", expressionBuilder.build()));
                            Boolean bool = Boolean.TRUE;
                            symbolLayer.setProperty$extension_style_release(new PropertyValue("text-ignore-placement", bool));
                            symbolLayer.setProperty$extension_style_release(new PropertyValue("text-allow-overlap", bool));
                            return createfromparcel;
                        }
                    };
                    str3.getClass();
                    SymbolLayer symbolLayer = new SymbolLayer("mapbox-android-" + str + "-cluster-text-layer-" + j, str3);
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(symbolLayer);
                    String str8 = symbolLayer.layerId;
                    if (!mapboxMap.styleLayerExists(str8)) {
                        UrlUtils.addPersistentLayer(mapboxMap, symbolLayer, new LayerPosition((String) onContentCardDismissed.MediaBrowserCompatMediaItem((List) arrayList), null, null));
                        arrayList.add(str8);
                    }
                }
                updateSource();
                KoinExtKt$androidContext$1$1 koinExtKt$androidContext$1$2 = new KoinExtKt$androidContext$1$1(3, this);
                LinkedHashSet linkedHashSet2 = this.interactionsCancelableSet;
                MapboxMap mapboxMap3 = this.mapInteractionDelegate;
                Layer layer3 = this.layer;
                String layerId = layer3.getLayerId();
                LinkedHashMap linkedHashMap = this.annotationMap;
                linkedHashSet2.add(mapboxMap3.addInteraction((MapInteraction) koinExtKt$androidContext$1$2.invoke(layerId, linkedHashMap)));
                Layer layer4 = this.dragLayer;
                String layerId2 = layer4.getLayerId();
                LinkedHashMap linkedHashMap2 = this.dragAnnotationMap;
                linkedHashSet2.add(mapboxMap3.addInteraction((MapInteraction) koinExtKt$androidContext$1$2.invoke(layerId2, linkedHashMap2)));
                KoinExtKt$androidContext$1$1 koinExtKt$androidContext$1$3 = new KoinExtKt$androidContext$1$1(5, this);
                linkedHashSet2.add(mapboxMap3.addInteraction((MapInteraction) koinExtKt$androidContext$1$3.invoke(layer3.getLayerId(), linkedHashMap)));
                linkedHashSet2.add(mapboxMap3.addInteraction((MapInteraction) koinExtKt$androidContext$1$3.invoke(layer4.getLayerId(), linkedHashMap2)));
                KoinExtKt$androidContext$1$1 koinExtKt$androidContext$1$4 = new KoinExtKt$androidContext$1$1(4, this);
                linkedHashSet2.add(mapboxMap3.addInteraction((MapInteraction) koinExtKt$androidContext$1$4.invoke(layer3.getLayerId(), linkedHashMap)));
                linkedHashSet2.add(mapboxMap3.addInteraction((MapInteraction) koinExtKt$androidContext$1$4.invoke(layer4.getLayerId(), linkedHashMap2)));
                return;
            }
            removeNodeAtDepth.serializer("gesturesManager");
            throw null;
        }
        throw new InvalidPluginConfigurationException();
    }
}
