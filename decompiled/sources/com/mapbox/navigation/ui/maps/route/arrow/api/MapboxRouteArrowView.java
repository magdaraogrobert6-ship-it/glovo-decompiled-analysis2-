package com.mapbox.navigation.ui.maps.route.arrow.api;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.HandlerThread;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.LoggingLevel;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.Snapshotter$$ExternalSyntheticLambda0;
import com.mapbox.maps.Style;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.generated.LineLayer;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.IconRotationAlignment;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.sources.Source;
import com.mapbox.maps.extension.style.sources.generated.GeoJsonSource;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.internal.dump.HelpDumpInterceptor$prettyString$1;
import com.mapbox.navigation.ui.maps.route.RouteLayerConstants;
import com.mapbox.navigation.ui.maps.route.arrow.model.ClearArrowsValue;
import com.mapbox.navigation.ui.maps.route.arrow.model.RouteArrowOptions;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import io.sentry.util.UrlUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import o.createFromParcel;
import o.dispatchKeyEventYhN2O0w;
import o.getCieXyz;
import o.onContentCardClicked;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import okio.Okio;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteArrowView {
    public Integer lastRenderHash;
    public boolean lastRenderSucceeded;
    public final RouteArrowOptions options;
    public boolean rebuildLayersOnFirstRender = true;
    public final LinkedHashMap currentSourceHashes = new LinkedHashMap();

    public final void render(Style style, ClearArrowsValue clearArrowsValue) {
        renderInternal(style, null, clearArrowsValue.arrowShaftFeatureCollection, clearArrowsValue.arrowHeadFeatureCollection);
    }

    public MapboxRouteArrowView(RouteArrowOptions routeArrowOptions) {
        this.options = routeArrowOptions;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:46:0x012f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0132  */
    /* JADX WARN: Code duplicated, block: B:50:0x0139  */
    /* JADX WARN: Code duplicated, block: B:51:0x0149  */
    /* JADX WARN: Code duplicated, block: B:54:0x0152  */
    /* JADX WARN: Code duplicated, block: B:55:0x0160  */
    /* JADX WARN: Code duplicated, block: B:58:0x0167  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:78:0x0218  */
    /* JADX WARN: Code duplicated, block: B:81:0x0221  */
    /* JADX WARN: Code duplicated, block: B:84:0x0296  */
    /* JADX WARN: Code duplicated, block: B:87:0x029f  */
    /* JADX WARN: Code duplicated, block: B:90:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:93:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:96:0x0337  */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x00d4, please report this as an issue */
    public final void renderInternal(Style style, List list, FeatureCollection featureCollection, FeatureCollection featureCollection2) {
        final RouteArrowOptions routeArrowOptions;
        int i;
        int i2;
        String str;
        Drawable drawable;
        Drawable drawable2;
        String str2;
        boolean zContains;
        Drawable drawable3;
        String str3;
        LineLayer lineLayer;
        SymbolLayer symbolLayer;
        LineLayer lineLayer2;
        SymbolLayer symbolLayer2;
        MapboxRouteArrowView mapboxRouteArrowView;
        boolean zUpdateSource;
        int iHash = Objects.hash(list, featureCollection, featureCollection2);
        Integer num = this.lastRenderHash;
        if (num != null && iHash == num.intValue() && this.lastRenderSucceeded) {
            return;
        }
        this.lastRenderHash = Integer.valueOf(iHash);
        if (!this.rebuildLayersOnFirstRender) {
            style.getClass();
            if (!style.styleSourceExists("mapbox-navigation-arrow-shaft-source") || !style.styleSourceExists("mapbox-navigation-arrow-head-source") || !style.styleLayerExists("mapbox-navigation-arrow-shaft-casing-layer") || !style.styleLayerExists("mapbox-navigation-arrow-head-casing-layer") || !style.styleLayerExists("mapbox-navigation-arrow-shaft-layer") || !style.styleLayerExists("mapbox-navigation-arrow-head-layer")) {
                this.rebuildLayersOnFirstRender = false;
                style.getClass();
                StyleManager styleManager = style.getStyleManager();
                styleManager.getClass();
                styleManager.removeStyleImage("mapbox-navigation-arrow-head-icon-casing").getClass();
                styleManager.removeStyleImage("mapbox-navigation-arrow-head-icon").getClass();
                styleManager.removeStyleLayer("mapbox-navigation-arrow-shaft-casing-layer").getClass();
                styleManager.removeStyleLayer("mapbox-navigation-arrow-head-casing-layer").getClass();
                styleManager.removeStyleLayer("mapbox-navigation-arrow-shaft-layer").getClass();
                styleManager.removeStyleLayer("mapbox-navigation-arrow-head-layer").getClass();
                styleManager.removeStyleSource("mapbox-navigation-arrow-shaft-source").getClass();
                styleManager.removeStyleSource("mapbox-navigation-arrow-head-source").getClass();
                routeArrowOptions = this.options;
                i = routeArrowOptions.arrowColor;
                i2 = routeArrowOptions.arrowCasingColor;
                str = routeArrowOptions.aboveLayerId;
                drawable = routeArrowOptions.arrowHeadIcon;
                drawable2 = routeArrowOptions.arrowHeadIconCasing;
                List<String> styleSlots = style.getStyleSlots();
                str2 = routeArrowOptions.slotName;
                zContains = styleSlots.contains(str2);
                if (zContains) {
                    drawable3 = drawable;
                } else {
                    drawable3 = drawable;
                    if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.WARNING)) {
                        LoggerProviderKt.logW("The " + str2 + " slot is not present in the style.", "RouteArrowUtils");
                    }
                }
                if (style.styleSourceExists("mapbox-navigation-arrow-shaft-source") || !style.styleSourceExists("mapbox-navigation-arrow-head-source") || !style.styleLayerExists("mapbox-navigation-arrow-shaft-casing-layer") || !style.styleLayerExists("mapbox-navigation-arrow-head-casing-layer") || !style.styleLayerExists("mapbox-navigation-arrow-shaft-layer") || !style.styleLayerExists("mapbox-navigation-arrow-head-layer")) {
                    HelpDumpInterceptor$prettyString$1 helpDumpInterceptor$prettyString$1 = new HelpDumpInterceptor$prettyString$1(7, routeArrowOptions);
                    Expression.InterpolatorBuilder interpolatorBuilder = new Expression.InterpolatorBuilder();
                    helpDumpInterceptor$prettyString$1.invoke(interpolatorBuilder);
                    Expression expressionBuild = interpolatorBuilder.build();
                    if (style.styleLayerExists(str)) {
                        str3 = str;
                    } else {
                        str3 = null;
                    }
                    if (!style.styleSourceExists("mapbox-navigation-arrow-shaft-source")) {
                        final int i3 = 0;
                        LazyKt__LazyJVMKt.geoJsonSource("mapbox-navigation-arrow-shaft-source", new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigation.ui.maps.route.arrow.RouteArrowUtils$initializeLayers$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final Object invoke(Object obj) {
                                int i4 = i3;
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                RouteArrowOptions routeArrowOptions2 = routeArrowOptions;
                                if (i4 != 0) {
                                    GeoJsonSource.Builder builder = (GeoJsonSource.Builder) obj;
                                    builder.getClass();
                                    builder.maxzoom(16L);
                                    builder.tolerance(routeArrowOptions2.tolerance);
                                    builder.buffer(32L);
                                    return createfromparcel;
                                }
                                GeoJsonSource.Builder builder2 = (GeoJsonSource.Builder) obj;
                                builder2.getClass();
                                builder2.maxzoom(16L);
                                builder2.tolerance(routeArrowOptions2.tolerance);
                                builder2.buffer(32L);
                                return createfromparcel;
                            }
                        }).bindTo(style);
                    }
                    if (!style.styleSourceExists("mapbox-navigation-arrow-head-source")) {
                        final int i4 = 1;
                        LazyKt__LazyJVMKt.geoJsonSource("mapbox-navigation-arrow-head-source", new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigation.ui.maps.route.arrow.RouteArrowUtils$initializeLayers$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final Object invoke(Object obj) {
                                int i5 = i4;
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                RouteArrowOptions routeArrowOptions2 = routeArrowOptions;
                                if (i5 != 0) {
                                    GeoJsonSource.Builder builder = (GeoJsonSource.Builder) obj;
                                    builder.getClass();
                                    builder.maxzoom(16L);
                                    builder.tolerance(routeArrowOptions2.tolerance);
                                    builder.buffer(32L);
                                    return createfromparcel;
                                }
                                GeoJsonSource.Builder builder2 = (GeoJsonSource.Builder) obj;
                                builder2.getClass();
                                builder2.maxzoom(16L);
                                builder2.tolerance(routeArrowOptions2.tolerance);
                                builder2.buffer(32L);
                                return createfromparcel;
                            }
                        }).bindTo(style);
                    }
                    if (style.getStyleImage("mapbox-navigation-arrow-head-icon-casing") != null) {
                        style.removeStyleImage("mapbox-navigation-arrow-head-icon-casing");
                    }
                    if (drawable2.getIntrinsicHeight() <= 0 && drawable2.getIntrinsicWidth() > 0) {
                        drawable2.mutate().setTint(i2);
                        float pixelRatio = style.getPixelRatio();
                        style.addImage("mapbox-navigation-arrow-head-icon-casing", dispatchKeyEventYhN2O0w.read(drawable2, MathKt.write(drawable2.getIntrinsicWidth() * pixelRatio), MathKt.write(drawable2.getIntrinsicHeight() * pixelRatio), Bitmap.Config.ARGB_8888));
                    }
                    if (style.getStyleImage("mapbox-navigation-arrow-head-icon") != null) {
                        style.removeStyleImage("mapbox-navigation-arrow-head-icon");
                    }
                    if (drawable3.getIntrinsicHeight() > 0 && drawable3.getIntrinsicWidth() > 0) {
                        drawable3.mutate().setTint(i);
                        float pixelRatio2 = style.getPixelRatio();
                        style.addImage("mapbox-navigation-arrow-head-icon", dispatchKeyEventYhN2O0w.read(drawable3, MathKt.write(drawable3.getIntrinsicWidth() * pixelRatio2), MathKt.write(drawable3.getIntrinsicHeight() * pixelRatio2), Bitmap.Config.ARGB_8888));
                    }
                    if (style.styleLayerExists("mapbox-navigation-arrow-shaft-casing-layer")) {
                        style.removeStyleLayer("mapbox-navigation-arrow-shaft-casing-layer");
                    }
                    lineLayer = new LineLayer("mapbox-navigation-arrow-shaft-casing-layer", "mapbox-navigation-arrow-shaft-source");
                    lineLayer.lineColor(Okio.color(i2));
                    lineLayer.lineWidth(routeArrowOptions.arrowShaftCasingScaleExpression);
                    lineLayer.lineCap();
                    lineLayer.lineJoin();
                    Visibility visibility = Visibility.VISIBLE;
                    lineLayer.setProperty$extension_style_release(new PropertyValue(RemoteMessageConst.Notification.VISIBILITY, visibility));
                    lineLayer.lineOpacity(expressionBuild);
                    lineLayer.lineEmissiveStrength();
                    if (zContains) {
                        lineLayer.slot$1(str2);
                    }
                    if (style.styleLayerExists("mapbox-navigation-arrow-head-casing-layer")) {
                        style.removeStyleLayer("mapbox-navigation-arrow-head-casing-layer");
                    }
                    symbolLayer = new SymbolLayer("mapbox-navigation-arrow-head-casing-layer", "mapbox-navigation-arrow-head-source");
                    symbolLayer.setProperty$extension_style_release(new PropertyValue("icon-image", "mapbox-navigation-arrow-head-icon-casing"));
                    Boolean bool = Boolean.TRUE;
                    symbolLayer.setProperty$extension_style_release(new PropertyValue("icon-allow-overlap", bool));
                    symbolLayer.setProperty$extension_style_release(new PropertyValue("icon-ignore-placement", bool));
                    symbolLayer.iconSize(routeArrowOptions.arrowHeadCasingScaleExpression);
                    symbolLayer.setProperty$extension_style_release(new PropertyValue("icon-offset", onContentCardClicked.RatingCompat(RouteLayerConstants.ARROW_HEAD_OFFSET)));
                    IconRotationAlignment iconRotationAlignment = IconRotationAlignment.MAP;
                    symbolLayer.setProperty$extension_style_release(new PropertyValue("icon-rotation-alignment", iconRotationAlignment));
                    Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("get");
                    expressionBuilder.literal("mapbox-navigation-arrow-bearing");
                    symbolLayer.iconRotate(expressionBuilder.build());
                    symbolLayer.setProperty$extension_style_release(new PropertyValue(RemoteMessageConst.Notification.VISIBILITY, visibility));
                    symbolLayer.iconOpacity(expressionBuild);
                    if (zContains) {
                        symbolLayer.slot$2(str2);
                    }
                    if (style.styleLayerExists("mapbox-navigation-arrow-shaft-layer")) {
                        style.removeStyleLayer("mapbox-navigation-arrow-shaft-layer");
                    }
                    lineLayer2 = new LineLayer("mapbox-navigation-arrow-shaft-layer", "mapbox-navigation-arrow-shaft-source");
                    lineLayer2.lineColor(Okio.color(i));
                    lineLayer2.lineWidth(routeArrowOptions.arrowShaftScaleExpression);
                    lineLayer2.lineCap();
                    lineLayer2.lineJoin();
                    lineLayer2.setProperty$extension_style_release(new PropertyValue(RemoteMessageConst.Notification.VISIBILITY, visibility));
                    lineLayer2.lineOpacity(expressionBuild);
                    lineLayer2.lineEmissiveStrength();
                    if (zContains) {
                        lineLayer2.slot$1(str2);
                    }
                    if (style.styleLayerExists("mapbox-navigation-arrow-head-layer")) {
                        style.removeStyleLayer("mapbox-navigation-arrow-head-layer");
                    }
                    symbolLayer2 = new SymbolLayer("mapbox-navigation-arrow-head-layer", "mapbox-navigation-arrow-head-source");
                    symbolLayer2.setProperty$extension_style_release(new PropertyValue("icon-image", "mapbox-navigation-arrow-head-icon"));
                    symbolLayer2.setProperty$extension_style_release(new PropertyValue("icon-allow-overlap", bool));
                    symbolLayer2.setProperty$extension_style_release(new PropertyValue("icon-ignore-placement", bool));
                    symbolLayer2.iconSize(routeArrowOptions.arrowHeadScaleExpression);
                    symbolLayer2.setProperty$extension_style_release(new PropertyValue("icon-offset", onContentCardClicked.RatingCompat(RouteLayerConstants.ARROW_HEAD_CASING_OFFSET)));
                    symbolLayer2.setProperty$extension_style_release(new PropertyValue("icon-rotation-alignment", iconRotationAlignment));
                    Expression.ExpressionBuilder expressionBuilder2 = new Expression.ExpressionBuilder("get");
                    expressionBuilder2.literal("mapbox-navigation-arrow-bearing");
                    symbolLayer2.iconRotate(expressionBuilder2.build());
                    symbolLayer2.setProperty$extension_style_release(new PropertyValue(RemoteMessageConst.Notification.VISIBILITY, visibility));
                    symbolLayer2.iconOpacity(expressionBuild);
                    if (zContains) {
                        symbolLayer2.slot$2(str2);
                    }
                    UrlUtils.addPersistentLayer(style, lineLayer, new LayerPosition(str3, null, null));
                    UrlUtils.addPersistentLayer(style, symbolLayer, new LayerPosition(lineLayer.layerId, null, null));
                    UrlUtils.addPersistentLayer(style, lineLayer2, new LayerPosition(symbolLayer.layerId, null, null));
                    UrlUtils.addPersistentLayer(style, symbolLayer2, new LayerPosition(lineLayer2.layerId, null, null));
                }
            }
        } else {
            this.rebuildLayersOnFirstRender = false;
            style.getClass();
            StyleManager styleManager2 = style.getStyleManager();
            styleManager2.getClass();
            styleManager2.removeStyleImage("mapbox-navigation-arrow-head-icon-casing").getClass();
            styleManager2.removeStyleImage("mapbox-navigation-arrow-head-icon").getClass();
            styleManager2.removeStyleLayer("mapbox-navigation-arrow-shaft-casing-layer").getClass();
            styleManager2.removeStyleLayer("mapbox-navigation-arrow-head-casing-layer").getClass();
            styleManager2.removeStyleLayer("mapbox-navigation-arrow-shaft-layer").getClass();
            styleManager2.removeStyleLayer("mapbox-navigation-arrow-head-layer").getClass();
            styleManager2.removeStyleSource("mapbox-navigation-arrow-shaft-source").getClass();
            styleManager2.removeStyleSource("mapbox-navigation-arrow-head-source").getClass();
            routeArrowOptions = this.options;
            i = routeArrowOptions.arrowColor;
            i2 = routeArrowOptions.arrowCasingColor;
            str = routeArrowOptions.aboveLayerId;
            drawable = routeArrowOptions.arrowHeadIcon;
            drawable2 = routeArrowOptions.arrowHeadIconCasing;
            List<String> styleSlots2 = style.getStyleSlots();
            str2 = routeArrowOptions.slotName;
            zContains = styleSlots2.contains(str2);
            if (zContains) {
                drawable3 = drawable;
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.WARNING)) {
                    LoggerProviderKt.logW("The " + str2 + " slot is not present in the style.", "RouteArrowUtils");
                }
            } else {
                drawable3 = drawable;
            }
            if (style.styleSourceExists("mapbox-navigation-arrow-shaft-source")) {
            }
            HelpDumpInterceptor$prettyString$1 helpDumpInterceptor$prettyString$2 = new HelpDumpInterceptor$prettyString$1(7, routeArrowOptions);
            Expression.InterpolatorBuilder interpolatorBuilder2 = new Expression.InterpolatorBuilder();
            helpDumpInterceptor$prettyString$2.invoke(interpolatorBuilder2);
            Expression expressionBuild2 = interpolatorBuilder2.build();
            if (style.styleLayerExists(str)) {
                str3 = str;
            } else {
                str3 = null;
            }
            if (!style.styleSourceExists("mapbox-navigation-arrow-shaft-source")) {
                final int i5 = 0;
                LazyKt__LazyJVMKt.geoJsonSource("mapbox-navigation-arrow-shaft-source", new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigation.ui.maps.route.arrow.RouteArrowUtils$initializeLayers$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        int i6 = i5;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        RouteArrowOptions routeArrowOptions2 = routeArrowOptions;
                        if (i6 != 0) {
                            GeoJsonSource.Builder builder = (GeoJsonSource.Builder) obj;
                            builder.getClass();
                            builder.maxzoom(16L);
                            builder.tolerance(routeArrowOptions2.tolerance);
                            builder.buffer(32L);
                            return createfromparcel;
                        }
                        GeoJsonSource.Builder builder2 = (GeoJsonSource.Builder) obj;
                        builder2.getClass();
                        builder2.maxzoom(16L);
                        builder2.tolerance(routeArrowOptions2.tolerance);
                        builder2.buffer(32L);
                        return createfromparcel;
                    }
                }).bindTo(style);
            }
            if (!style.styleSourceExists("mapbox-navigation-arrow-head-source")) {
                final int i6 = 1;
                LazyKt__LazyJVMKt.geoJsonSource("mapbox-navigation-arrow-head-source", new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigation.ui.maps.route.arrow.RouteArrowUtils$initializeLayers$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        int i7 = i6;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        RouteArrowOptions routeArrowOptions2 = routeArrowOptions;
                        if (i7 != 0) {
                            GeoJsonSource.Builder builder = (GeoJsonSource.Builder) obj;
                            builder.getClass();
                            builder.maxzoom(16L);
                            builder.tolerance(routeArrowOptions2.tolerance);
                            builder.buffer(32L);
                            return createfromparcel;
                        }
                        GeoJsonSource.Builder builder2 = (GeoJsonSource.Builder) obj;
                        builder2.getClass();
                        builder2.maxzoom(16L);
                        builder2.tolerance(routeArrowOptions2.tolerance);
                        builder2.buffer(32L);
                        return createfromparcel;
                    }
                }).bindTo(style);
            }
            if (style.getStyleImage("mapbox-navigation-arrow-head-icon-casing") != null) {
                style.removeStyleImage("mapbox-navigation-arrow-head-icon-casing");
            }
            if (drawable2.getIntrinsicHeight() <= 0) {
            }
            if (style.getStyleImage("mapbox-navigation-arrow-head-icon") != null) {
                style.removeStyleImage("mapbox-navigation-arrow-head-icon");
            }
            if (drawable3.getIntrinsicHeight() > 0) {
                drawable3.mutate().setTint(i);
                float pixelRatio3 = style.getPixelRatio();
                style.addImage("mapbox-navigation-arrow-head-icon", dispatchKeyEventYhN2O0w.read(drawable3, MathKt.write(drawable3.getIntrinsicWidth() * pixelRatio3), MathKt.write(drawable3.getIntrinsicHeight() * pixelRatio3), Bitmap.Config.ARGB_8888));
            }
            if (style.styleLayerExists("mapbox-navigation-arrow-shaft-casing-layer")) {
                style.removeStyleLayer("mapbox-navigation-arrow-shaft-casing-layer");
            }
            lineLayer = new LineLayer("mapbox-navigation-arrow-shaft-casing-layer", "mapbox-navigation-arrow-shaft-source");
            lineLayer.lineColor(Okio.color(i2));
            lineLayer.lineWidth(routeArrowOptions.arrowShaftCasingScaleExpression);
            lineLayer.lineCap();
            lineLayer.lineJoin();
            Visibility visibility2 = Visibility.VISIBLE;
            lineLayer.setProperty$extension_style_release(new PropertyValue(RemoteMessageConst.Notification.VISIBILITY, visibility2));
            lineLayer.lineOpacity(expressionBuild2);
            lineLayer.lineEmissiveStrength();
            if (zContains) {
                lineLayer.slot$1(str2);
            }
            if (style.styleLayerExists("mapbox-navigation-arrow-head-casing-layer")) {
                style.removeStyleLayer("mapbox-navigation-arrow-head-casing-layer");
            }
            symbolLayer = new SymbolLayer("mapbox-navigation-arrow-head-casing-layer", "mapbox-navigation-arrow-head-source");
            symbolLayer.setProperty$extension_style_release(new PropertyValue("icon-image", "mapbox-navigation-arrow-head-icon-casing"));
            Boolean bool2 = Boolean.TRUE;
            symbolLayer.setProperty$extension_style_release(new PropertyValue("icon-allow-overlap", bool2));
            symbolLayer.setProperty$extension_style_release(new PropertyValue("icon-ignore-placement", bool2));
            symbolLayer.iconSize(routeArrowOptions.arrowHeadCasingScaleExpression);
            symbolLayer.setProperty$extension_style_release(new PropertyValue("icon-offset", onContentCardClicked.RatingCompat(RouteLayerConstants.ARROW_HEAD_OFFSET)));
            IconRotationAlignment iconRotationAlignment2 = IconRotationAlignment.MAP;
            symbolLayer.setProperty$extension_style_release(new PropertyValue("icon-rotation-alignment", iconRotationAlignment2));
            Expression.ExpressionBuilder expressionBuilder3 = new Expression.ExpressionBuilder("get");
            expressionBuilder3.literal("mapbox-navigation-arrow-bearing");
            symbolLayer.iconRotate(expressionBuilder3.build());
            symbolLayer.setProperty$extension_style_release(new PropertyValue(RemoteMessageConst.Notification.VISIBILITY, visibility2));
            symbolLayer.iconOpacity(expressionBuild2);
            if (zContains) {
                symbolLayer.slot$2(str2);
            }
            if (style.styleLayerExists("mapbox-navigation-arrow-shaft-layer")) {
                style.removeStyleLayer("mapbox-navigation-arrow-shaft-layer");
            }
            lineLayer2 = new LineLayer("mapbox-navigation-arrow-shaft-layer", "mapbox-navigation-arrow-shaft-source");
            lineLayer2.lineColor(Okio.color(i));
            lineLayer2.lineWidth(routeArrowOptions.arrowShaftScaleExpression);
            lineLayer2.lineCap();
            lineLayer2.lineJoin();
            lineLayer2.setProperty$extension_style_release(new PropertyValue(RemoteMessageConst.Notification.VISIBILITY, visibility2));
            lineLayer2.lineOpacity(expressionBuild2);
            lineLayer2.lineEmissiveStrength();
            if (zContains) {
                lineLayer2.slot$1(str2);
            }
            if (style.styleLayerExists("mapbox-navigation-arrow-head-layer")) {
                style.removeStyleLayer("mapbox-navigation-arrow-head-layer");
            }
            symbolLayer2 = new SymbolLayer("mapbox-navigation-arrow-head-layer", "mapbox-navigation-arrow-head-source");
            symbolLayer2.setProperty$extension_style_release(new PropertyValue("icon-image", "mapbox-navigation-arrow-head-icon"));
            symbolLayer2.setProperty$extension_style_release(new PropertyValue("icon-allow-overlap", bool2));
            symbolLayer2.setProperty$extension_style_release(new PropertyValue("icon-ignore-placement", bool2));
            symbolLayer2.iconSize(routeArrowOptions.arrowHeadScaleExpression);
            symbolLayer2.setProperty$extension_style_release(new PropertyValue("icon-offset", onContentCardClicked.RatingCompat(RouteLayerConstants.ARROW_HEAD_CASING_OFFSET)));
            symbolLayer2.setProperty$extension_style_release(new PropertyValue("icon-rotation-alignment", iconRotationAlignment2));
            Expression.ExpressionBuilder expressionBuilder4 = new Expression.ExpressionBuilder("get");
            expressionBuilder4.literal("mapbox-navigation-arrow-bearing");
            symbolLayer2.iconRotate(expressionBuilder4.build());
            symbolLayer2.setProperty$extension_style_release(new PropertyValue(RemoteMessageConst.Notification.VISIBILITY, visibility2));
            symbolLayer2.iconOpacity(expressionBuild2);
            if (zContains) {
                symbolLayer2.slot$2(str2);
            }
            UrlUtils.addPersistentLayer(style, lineLayer, new LayerPosition(str3, null, null));
            UrlUtils.addPersistentLayer(style, symbolLayer, new LayerPosition(lineLayer.layerId, null, null));
            UrlUtils.addPersistentLayer(style, lineLayer2, new LayerPosition(symbolLayer.layerId, null, null));
            UrlUtils.addPersistentLayer(style, symbolLayer2, new LayerPosition(lineLayer2.layerId, null, null));
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) it.next();
                String str4 = (String) onviewattachedtowindowlambda0.serializer;
                Visibility visibility3 = (Visibility) onviewattachedtowindowlambda0.write;
                Layer layer = UrlUtils.getLayer(style, str4);
                if (layer != null) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{layer.getVisibility(), visibility3}, getCieXyz.write())).booleanValue()) {
                        layer.visibility(visibility3);
                    }
                }
            }
        }
        if (featureCollection != null) {
            mapboxRouteArrowView = this;
            zUpdateSource = mapboxRouteArrowView.updateSource(style, "mapbox-navigation-arrow-shaft-source", featureCollection);
        } else {
            mapboxRouteArrowView = this;
            zUpdateSource = true;
        }
        if (featureCollection2 != 0) {
            zUpdateSource = zUpdateSource && mapboxRouteArrowView.updateSource(style, "mapbox-navigation-arrow-head-source", featureCollection2);
        }
        mapboxRouteArrowView.lastRenderSucceeded = zUpdateSource;
    }

    public final boolean updateSource(Style style, String str, FeatureCollection featureCollection) {
        int iHashCode = featureCollection.hashCode();
        LinkedHashMap linkedHashMap = this.currentSourceHashes;
        Integer num = (Integer) linkedHashMap.get(str);
        if (num != null && num.intValue() == iHashCode) {
            return true;
        }
        Source source = BuildersKt.getSource(style, str);
        if (!(source instanceof GeoJsonSource)) {
            MapboxLogger.logW("StyleSourcePlugin", "Given sourceId = " + str + " is not requested type in getSourceAs.");
            source = null;
        }
        GeoJsonSource geoJsonSource = (GeoJsonSource) source;
        if (geoJsonSource != null) {
            HandlerThread handlerThread = GeoJsonSource.workerThread;
            geoJsonSource.setGeoJson(featureCollection, "");
            linkedHashMap.put(str, Integer.valueOf(iHashCode));
            return true;
        }
        if (!LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
            return false;
        }
        LoggerProviderKt.logE("Failed to update arrow source " + str + " - source not found. This may indicate an invalid rendering surface.", "MapboxRouteArrowView");
        return false;
    }

    public final void renderManeuverUpdate(Style style, Expected expected) {
        style.getClass();
        expected.onError(new Snapshotter$$ExternalSyntheticLambda0(24));
        expected.onValue(new ArrivalProgressObserver$$ExternalSyntheticLambda0(this, 9, style));
    }
}
