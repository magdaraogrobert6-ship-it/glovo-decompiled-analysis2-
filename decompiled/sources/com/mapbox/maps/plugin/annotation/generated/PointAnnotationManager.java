package com.mapbox.maps.plugin.annotation.generated;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayer;
import com.mapbox.maps.extension.style.utils.TypeUtils;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.mapbox.maps.plugin.annotation.AnnotationConfig;
import com.mapbox.maps.plugin.annotation.AnnotationManagerImpl;
import com.mapbox.maps.plugin.annotation.ClusterAnnotationManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public final class PointAnnotationManager extends AnnotationManagerImpl implements ClusterAnnotationManager {
    public static final AtomicLong ID_GENERATOR = new AtomicLong(0);
    public final ArrayList clusterClickListeners;
    public final ArrayList clusterLongClickListeners;

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.annotation.generated.PointAnnotationManager$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1(2, SymbolLayer.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;)V", 0);

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            str.getClass();
            str2.getClass();
            return new SymbolLayer(str, str2);
        }

        public AnonymousClass1(int i, Class cls, String str, String str2, int i2) {
            super(i, cls, str, str2, i2);
        }
    }

    @Override // com.mapbox.maps.plugin.annotation.ClusterAnnotationManager
    public final ArrayList getClusterClickListeners() {
        return this.clusterClickListeners;
    }

    @Override // com.mapbox.maps.plugin.annotation.ClusterAnnotationManager
    public final ArrayList getClusterLongClickListeners() {
        return this.clusterLongClickListeners;
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManagerImpl
    public final String getAnnotationIdKey() {
        return "PointAnnotation";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointAnnotationManager(MapDelegateProviderImpl mapDelegateProviderImpl, AnnotationConfig annotationConfig) {
        super(mapDelegateProviderImpl, annotationConfig, ID_GENERATOR.incrementAndGet(), "pointAnnotation", AnonymousClass1.INSTANCE);
        mapDelegateProviderImpl.getClass();
        this.clusterClickListeners = new ArrayList();
        this.clusterLongClickListeners = new ArrayList();
        LinkedHashMap linkedHashMap = this.dataDrivenPropertyUsageMap;
        Boolean bool = Boolean.FALSE;
        linkedHashMap.put("icon-anchor", bool);
        this.dataDrivenPropertyUsageMap.put("icon-image", bool);
        this.dataDrivenPropertyUsageMap.put("icon-offset", bool);
        this.dataDrivenPropertyUsageMap.put("icon-rotate", bool);
        this.dataDrivenPropertyUsageMap.put("icon-size", bool);
        this.dataDrivenPropertyUsageMap.put("icon-text-fit", bool);
        this.dataDrivenPropertyUsageMap.put("icon-text-fit-padding", bool);
        this.dataDrivenPropertyUsageMap.put("symbol-sort-key", bool);
        this.dataDrivenPropertyUsageMap.put("text-anchor", bool);
        this.dataDrivenPropertyUsageMap.put("text-field", bool);
        this.dataDrivenPropertyUsageMap.put("text-justify", bool);
        this.dataDrivenPropertyUsageMap.put("text-letter-spacing", bool);
        this.dataDrivenPropertyUsageMap.put("text-line-height", bool);
        this.dataDrivenPropertyUsageMap.put("text-max-width", bool);
        this.dataDrivenPropertyUsageMap.put("text-offset", bool);
        this.dataDrivenPropertyUsageMap.put("text-radial-offset", bool);
        this.dataDrivenPropertyUsageMap.put("text-rotate", bool);
        this.dataDrivenPropertyUsageMap.put("text-size", bool);
        this.dataDrivenPropertyUsageMap.put("text-transform", bool);
        this.dataDrivenPropertyUsageMap.put("icon-color", bool);
        this.dataDrivenPropertyUsageMap.put("icon-emissive-strength", bool);
        this.dataDrivenPropertyUsageMap.put("icon-halo-blur", bool);
        this.dataDrivenPropertyUsageMap.put("icon-halo-color", bool);
        this.dataDrivenPropertyUsageMap.put("icon-halo-width", bool);
        this.dataDrivenPropertyUsageMap.put("icon-occlusion-opacity", bool);
        this.dataDrivenPropertyUsageMap.put("icon-opacity", bool);
        this.dataDrivenPropertyUsageMap.put("symbol-z-offset", bool);
        this.dataDrivenPropertyUsageMap.put("text-color", bool);
        this.dataDrivenPropertyUsageMap.put("text-emissive-strength", bool);
        this.dataDrivenPropertyUsageMap.put("text-halo-blur", bool);
        this.dataDrivenPropertyUsageMap.put("text-halo-color", bool);
        this.dataDrivenPropertyUsageMap.put("text-halo-width", bool);
        this.dataDrivenPropertyUsageMap.put("text-occlusion-opacity", bool);
        this.dataDrivenPropertyUsageMap.put("text-opacity", bool);
        this.dataDrivenPropertyUsageMap.put("icon-color-use-theme", bool);
        this.dataDrivenPropertyUsageMap.put("icon-halo-color-use-theme", bool);
        this.dataDrivenPropertyUsageMap.put("text-color-use-theme", bool);
        this.dataDrivenPropertyUsageMap.put("text-halo-color-use-theme", bool);
        Boolean bool2 = Boolean.TRUE;
        TypeUtils typeUtils = TypeUtils.INSTANCE;
        setLayerProperty("icon-allow-overlap", typeUtils.wrapToValue(bool2));
        setLayerProperty("text-allow-overlap", typeUtils.wrapToValue(bool2));
        setLayerProperty("icon-ignore-placement", typeUtils.wrapToValue(bool2));
        setLayerProperty("text-ignore-placement", typeUtils.wrapToValue(bool2));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.mapbox.maps.plugin.annotation.AnnotationManagerImpl
    public final void setDataDrivenPropertyIsUsed(String str) {
        int iHashCode = str.hashCode();
        Layer layer = this.dragLayer;
        Layer layer2 = this.layer;
        switch (iHashCode) {
            case -2146810373:
                if (str.equals("text-rotate")) {
                    SymbolLayer symbolLayer = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-rotate", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-rotate")}[0], symbolLayer), symbolLayer);
                    SymbolLayer symbolLayer2 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-rotate", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-rotate")}[0], symbolLayer2), symbolLayer2);
                    break;
                }
                break;
            case -2041493401:
                if (str.equals("icon-offset")) {
                    SymbolLayer symbolLayer3 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-offset", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-offset")}[0], symbolLayer3), symbolLayer3);
                    SymbolLayer symbolLayer4 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-offset", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-offset")}[0], symbolLayer4), symbolLayer4);
                    break;
                }
                break;
            case -1946894033:
                if (str.equals("icon-rotate")) {
                    Expression[] expressionArr = {new Expression("icon-rotate")};
                    Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("get");
                    expressionBuilder.addArgument(expressionArr[0]);
                    ((SymbolLayer) layer2).iconRotate(expressionBuilder.build());
                    Expression[] expressionArr2 = {new Expression("icon-rotate")};
                    Expression.ExpressionBuilder expressionBuilder2 = new Expression.ExpressionBuilder("get");
                    expressionBuilder2.addArgument(expressionArr2[0]);
                    ((SymbolLayer) layer).iconRotate(expressionBuilder2.build());
                    break;
                }
                break;
            case -1747293499:
                if (str.equals("icon-color-use-theme")) {
                    SymbolLayer symbolLayer5 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-color-use-theme", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-color-use-theme")}[0], symbolLayer5), symbolLayer5);
                    SymbolLayer symbolLayer6 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-color-use-theme", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-color-use-theme")}[0], symbolLayer6), symbolLayer6);
                    break;
                }
                break;
            case -1717422239:
                if (str.equals("text-radial-offset")) {
                    SymbolLayer symbolLayer7 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-radial-offset", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-radial-offset")}[0], symbolLayer7), symbolLayer7);
                    SymbolLayer symbolLayer8 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-radial-offset", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-radial-offset")}[0], symbolLayer8), symbolLayer8);
                    break;
                }
                break;
            case -1708933018:
                if (str.equals("icon-halo-color")) {
                    SymbolLayer symbolLayer9 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-halo-color", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-halo-color")}[0], symbolLayer9), symbolLayer9);
                    SymbolLayer symbolLayer10 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-halo-color", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-halo-color")}[0], symbolLayer10), symbolLayer10);
                    break;
                }
                break;
            case -1690648887:
                if (str.equals("icon-halo-width")) {
                    SymbolLayer symbolLayer11 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-halo-width", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-halo-width")}[0], symbolLayer11), symbolLayer11);
                    SymbolLayer symbolLayer12 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-halo-width", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-halo-width")}[0], symbolLayer12), symbolLayer12);
                    break;
                }
                break;
            case -1628743893:
                if (str.equals("text-occlusion-opacity")) {
                    SymbolLayer symbolLayer13 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-occlusion-opacity", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-occlusion-opacity")}[0], symbolLayer13), symbolLayer13);
                    SymbolLayer symbolLayer14 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-occlusion-opacity", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-occlusion-opacity")}[0], symbolLayer14), symbolLayer14);
                    break;
                }
                break;
            case -1600683761:
                if (str.equals("icon-color")) {
                    SymbolLayer symbolLayer15 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-color", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-color")}[0], symbolLayer15), symbolLayer15);
                    SymbolLayer symbolLayer16 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-color", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-color")}[0], symbolLayer16), symbolLayer16);
                    break;
                }
                break;
            case -1595213049:
                if (str.equals("icon-image")) {
                    SymbolLayer symbolLayer17 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-image", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-image")}[0], symbolLayer17), symbolLayer17);
                    SymbolLayer symbolLayer18 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-image", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-image")}[0], symbolLayer18), symbolLayer18);
                    break;
                }
                break;
            case -1436636971:
                if (str.equals("icon-size")) {
                    Expression[] expressionArr3 = {new Expression("icon-size")};
                    Expression.ExpressionBuilder expressionBuilder3 = new Expression.ExpressionBuilder("get");
                    expressionBuilder3.addArgument(expressionArr3[0]);
                    ((SymbolLayer) layer2).iconSize(expressionBuilder3.build());
                    Expression[] expressionArr4 = {new Expression("icon-size")};
                    Expression.ExpressionBuilder expressionBuilder4 = new Expression.ExpressionBuilder("get");
                    expressionBuilder4.addArgument(expressionArr4[0]);
                    ((SymbolLayer) layer).iconSize(expressionBuilder4.build());
                    break;
                }
                break;
            case -1362940800:
                if (str.equals("text-line-height")) {
                    SymbolLayer symbolLayer19 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-line-height", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-line-height")}[0], symbolLayer19), symbolLayer19);
                    SymbolLayer symbolLayer20 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-line-height", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-line-height")}[0], symbolLayer20), symbolLayer20);
                    break;
                }
                break;
            case -1336352187:
                if (str.equals("symbol-sort-key")) {
                    SymbolLayer symbolLayer21 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("symbol-sort-key", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("symbol-sort-key")}[0], symbolLayer21), symbolLayer21);
                    SymbolLayer symbolLayer22 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("symbol-sort-key", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("symbol-sort-key")}[0], symbolLayer22), symbolLayer22);
                    break;
                }
                break;
            case -1262567732:
                if (str.equals("text-transform")) {
                    SymbolLayer symbolLayer23 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-transform", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-transform")}[0], symbolLayer23), symbolLayer23);
                    SymbolLayer symbolLayer24 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-transform", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-transform")}[0], symbolLayer24), symbolLayer24);
                    break;
                }
                break;
            case -1083772767:
                if (str.equals("text-size")) {
                    SymbolLayer symbolLayer25 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-size", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-size")}[0], symbolLayer25), symbolLayer25);
                    SymbolLayer symbolLayer26 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-size", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-size")}[0], symbolLayer26), symbolLayer26);
                    break;
                }
                break;
            case -951348361:
                if (str.equals("icon-occlusion-opacity")) {
                    SymbolLayer symbolLayer27 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-occlusion-opacity", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-occlusion-opacity")}[0], symbolLayer27), symbolLayer27);
                    SymbolLayer symbolLayer28 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-occlusion-opacity", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-occlusion-opacity")}[0], symbolLayer28), symbolLayer28);
                    break;
                }
                break;
            case -888013006:
                if (str.equals("text-halo-color")) {
                    SymbolLayer symbolLayer29 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-halo-color", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-halo-color")}[0], symbolLayer29), symbolLayer29);
                    SymbolLayer symbolLayer30 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-halo-color", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-halo-color")}[0], symbolLayer30), symbolLayer30);
                    break;
                }
                break;
            case -886443260:
                if (str.equals("icon-halo-blur")) {
                    SymbolLayer symbolLayer31 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-halo-blur", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-halo-blur")}[0], symbolLayer31), symbolLayer31);
                    SymbolLayer symbolLayer32 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-halo-blur", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-halo-blur")}[0], symbolLayer32), symbolLayer32);
                    break;
                }
                break;
            case -869728875:
                if (str.equals("text-halo-width")) {
                    SymbolLayer symbolLayer33 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-halo-width", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-halo-width")}[0], symbolLayer33), symbolLayer33);
                    SymbolLayer symbolLayer34 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-halo-width", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-halo-width")}[0], symbolLayer34), symbolLayer34);
                    break;
                }
                break;
            case -564393509:
                if (str.equals("symbol-z-offset")) {
                    SymbolLayer symbolLayer35 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("symbol-z-offset", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("symbol-z-offset")}[0], symbolLayer35), symbolLayer35);
                    SymbolLayer symbolLayer36 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("symbol-z-offset", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("symbol-z-offset")}[0], symbolLayer36), symbolLayer36);
                    break;
                }
                break;
            case -483024021:
                if (str.equals("text-opacity")) {
                    SymbolLayer symbolLayer37 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-opacity", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-opacity")}[0], symbolLayer37), symbolLayer37);
                    SymbolLayer symbolLayer38 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-opacity", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-opacity")}[0], symbolLayer38), symbolLayer38);
                    break;
                }
                break;
            case -465299984:
                if (str.equals("text-justify")) {
                    SymbolLayer symbolLayer39 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-justify", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-justify")}[0], symbolLayer39), symbolLayer39);
                    SymbolLayer symbolLayer40 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-justify", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-justify")}[0], symbolLayer40), symbolLayer40);
                    break;
                }
                break;
            case -199448228:
                if (str.equals("icon-halo-color-use-theme")) {
                    SymbolLayer symbolLayer41 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-halo-color-use-theme", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-halo-color-use-theme")}[0], symbolLayer41), symbolLayer41);
                    SymbolLayer symbolLayer42 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-halo-color-use-theme", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-halo-color-use-theme")}[0], symbolLayer42), symbolLayer42);
                    break;
                }
                break;
            case -197162119:
                if (str.equals("text-color-use-theme")) {
                    SymbolLayer symbolLayer43 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-color-use-theme", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-color-use-theme")}[0], symbolLayer43), symbolLayer43);
                    SymbolLayer symbolLayer44 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-color-use-theme", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-color-use-theme")}[0], symbolLayer44), symbolLayer44);
                    break;
                }
                break;
            case 317300605:
                if (str.equals("text-max-width")) {
                    SymbolLayer symbolLayer45 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-max-width", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-max-width")}[0], symbolLayer45), symbolLayer45);
                    SymbolLayer symbolLayer46 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-max-width", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-max-width")}[0], symbolLayer46), symbolLayer46);
                    break;
                }
                break;
            case 428355132:
                if (str.equals("text-letter-spacing")) {
                    SymbolLayer symbolLayer47 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-letter-spacing", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-letter-spacing")}[0], symbolLayer47), symbolLayer47);
                    SymbolLayer symbolLayer48 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-letter-spacing", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-letter-spacing")}[0], symbolLayer48), symbolLayer48);
                    break;
                }
                break;
            case 525511352:
                if (str.equals("text-halo-blur")) {
                    SymbolLayer symbolLayer49 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-halo-blur", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-halo-blur")}[0], symbolLayer49), symbolLayer49);
                    SymbolLayer symbolLayer50 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-halo-blur", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-halo-blur")}[0], symbolLayer50), symbolLayer50);
                    break;
                }
                break;
            case 676079173:
                if (str.equals("icon-text-fit")) {
                    SymbolLayer symbolLayer51 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-text-fit", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-text-fit")}[0], symbolLayer51), symbolLayer51);
                    SymbolLayer symbolLayer52 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-text-fit", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-text-fit")}[0], symbolLayer52), symbolLayer52);
                    break;
                }
                break;
            case 748171971:
                if (str.equals("text-color")) {
                    SymbolLayer symbolLayer53 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-color", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-color")}[0], symbolLayer53), symbolLayer53);
                    SymbolLayer symbolLayer54 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-color", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-color")}[0], symbolLayer54), symbolLayer54);
                    break;
                }
                break;
            case 750756954:
                if (str.equals("text-field")) {
                    SymbolLayer symbolLayer55 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-field", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-field")}[0], symbolLayer55), symbolLayer55);
                    SymbolLayer symbolLayer56 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-field", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-field")}[0], symbolLayer56), symbolLayer56);
                    break;
                }
                break;
            case 961593943:
                if (str.equals("text-emissive-strength")) {
                    SymbolLayer symbolLayer57 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-emissive-strength", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-emissive-strength")}[0], symbolLayer57), symbolLayer57);
                    SymbolLayer symbolLayer58 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-emissive-strength", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-emissive-strength")}[0], symbolLayer58), symbolLayer58);
                    break;
                }
                break;
            case 1304244361:
                if (str.equals("icon-text-fit-padding")) {
                    SymbolLayer symbolLayer59 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-text-fit-padding", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-text-fit-padding")}[0], symbolLayer59), symbolLayer59);
                    SymbolLayer symbolLayer60 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-text-fit-padding", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-text-fit-padding")}[0], symbolLayer60), symbolLayer60);
                    break;
                }
                break;
            case 1419415223:
                if (str.equals("icon-opacity")) {
                    Expression[] expressionArr5 = {new Expression("icon-opacity")};
                    Expression.ExpressionBuilder expressionBuilder5 = new Expression.ExpressionBuilder("get");
                    expressionBuilder5.addArgument(expressionArr5[0]);
                    ((SymbolLayer) layer2).iconOpacity(expressionBuilder5.build());
                    Expression[] expressionArr6 = {new Expression("icon-opacity")};
                    Expression.ExpressionBuilder expressionBuilder6 = new Expression.ExpressionBuilder("get");
                    expressionBuilder6.addArgument(expressionArr6[0]);
                    ((SymbolLayer) layer).iconOpacity(expressionBuilder6.build());
                    break;
                }
                break;
            case 1561581864:
                if (str.equals("text-halo-color-use-theme")) {
                    SymbolLayer symbolLayer61 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-halo-color-use-theme", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-halo-color-use-theme")}[0], symbolLayer61), symbolLayer61);
                    SymbolLayer symbolLayer62 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-halo-color-use-theme", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-halo-color-use-theme")}[0], symbolLayer62), symbolLayer62);
                    break;
                }
                break;
            case 1638989475:
                if (str.equals("icon-emissive-strength")) {
                    SymbolLayer symbolLayer63 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-emissive-strength", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-emissive-strength")}[0], symbolLayer63), symbolLayer63);
                    SymbolLayer symbolLayer64 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-emissive-strength", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-emissive-strength")}[0], symbolLayer64), symbolLayer64);
                    break;
                }
                break;
            case 1660037973:
                if (str.equals("text-anchor")) {
                    SymbolLayer symbolLayer65 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-anchor", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-anchor")}[0], symbolLayer65), symbolLayer65);
                    SymbolLayer symbolLayer66 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-anchor", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-anchor")}[0], symbolLayer66), symbolLayer66);
                    break;
                }
                break;
            case 1859954313:
                if (str.equals("icon-anchor")) {
                    SymbolLayer symbolLayer67 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-anchor", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-anchor")}[0], symbolLayer67), symbolLayer67);
                    SymbolLayer symbolLayer68 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-anchor", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("icon-anchor")}[0], symbolLayer68), symbolLayer68);
                    break;
                }
                break;
            case 2053557555:
                if (str.equals("text-offset")) {
                    SymbolLayer symbolLayer69 = (SymbolLayer) layer2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-offset", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-offset")}[0], symbolLayer69), symbolLayer69);
                    SymbolLayer symbolLayer70 = (SymbolLayer) layer;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("text-offset", c8$$ExternalSyntheticOutline0.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("text-offset")}[0], symbolLayer70), symbolLayer70);
                    break;
                }
                break;
        }
    }
}
