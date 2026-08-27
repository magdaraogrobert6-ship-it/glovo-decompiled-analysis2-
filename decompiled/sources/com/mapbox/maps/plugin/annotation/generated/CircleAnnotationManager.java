package com.mapbox.maps.plugin.annotation.generated;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.generated.CircleLayer;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.mapbox.maps.plugin.annotation.AnnotationConfig;
import com.mapbox.maps.plugin.annotation.AnnotationManagerImpl;
import com.mapbox.maps.plugin.annotation.ClusterAnnotationManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class CircleAnnotationManager extends AnnotationManagerImpl implements ClusterAnnotationManager {
    public static final AtomicLong ID_GENERATOR = new AtomicLong(0);
    public final ArrayList clusterClickListeners;
    public final ArrayList clusterLongClickListeners;

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.annotation.generated.CircleAnnotationManager$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1(2, CircleLayer.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;)V", 0);

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            str.getClass();
            str2.getClass();
            return new CircleLayer(str, str2);
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
        return "CircleAnnotation";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleAnnotationManager(MapDelegateProviderImpl mapDelegateProviderImpl, AnnotationConfig annotationConfig) {
        super(mapDelegateProviderImpl, annotationConfig, ID_GENERATOR.incrementAndGet(), "circleAnnotation", AnonymousClass1.INSTANCE);
        mapDelegateProviderImpl.getClass();
        this.clusterClickListeners = new ArrayList();
        this.clusterLongClickListeners = new ArrayList();
        LinkedHashMap linkedHashMap = this.dataDrivenPropertyUsageMap;
        Boolean bool = Boolean.FALSE;
        linkedHashMap.put("circle-sort-key", bool);
        this.dataDrivenPropertyUsageMap.put("circle-blur", bool);
        this.dataDrivenPropertyUsageMap.put("circle-color", bool);
        this.dataDrivenPropertyUsageMap.put("circle-opacity", bool);
        this.dataDrivenPropertyUsageMap.put("circle-radius", bool);
        this.dataDrivenPropertyUsageMap.put("circle-stroke-color", bool);
        this.dataDrivenPropertyUsageMap.put("circle-stroke-opacity", bool);
        this.dataDrivenPropertyUsageMap.put("circle-stroke-width", bool);
        this.dataDrivenPropertyUsageMap.put("circle-color-use-theme", bool);
        this.dataDrivenPropertyUsageMap.put("circle-stroke-color-use-theme", bool);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.mapbox.maps.plugin.annotation.AnnotationManagerImpl
    public final void setDataDrivenPropertyIsUsed(String str) {
        int iHashCode = str.hashCode();
        Layer layer = this.dragLayer;
        Layer layer2 = this.layer;
        switch (iHashCode) {
            case -1290287090:
                if (str.equals("circle-opacity")) {
                    CircleLayer circleLayer = (CircleLayer) layer2;
                    m1$$ExternalSyntheticOutline0.m("circle-opacity", af$$ExternalSyntheticOutline1.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("circle-opacity")}[0], circleLayer), circleLayer);
                    CircleLayer circleLayer2 = (CircleLayer) layer;
                    m1$$ExternalSyntheticOutline0.m("circle-opacity", af$$ExternalSyntheticOutline1.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("circle-opacity")}[0], circleLayer2), circleLayer2);
                    break;
                }
                break;
            case -939323345:
                if (str.equals("circle-radius")) {
                    CircleLayer circleLayer3 = (CircleLayer) layer2;
                    m1$$ExternalSyntheticOutline0.m("circle-radius", af$$ExternalSyntheticOutline1.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("circle-radius")}[0], circleLayer3), circleLayer3);
                    CircleLayer circleLayer4 = (CircleLayer) layer;
                    m1$$ExternalSyntheticOutline0.m("circle-radius", af$$ExternalSyntheticOutline1.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("circle-radius")}[0], circleLayer4), circleLayer4);
                    break;
                }
                break;
            case -917480164:
                if (str.equals("circle-color-use-theme")) {
                    CircleLayer circleLayer5 = (CircleLayer) layer2;
                    m1$$ExternalSyntheticOutline0.m("circle-color-use-theme", af$$ExternalSyntheticOutline1.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("circle-color-use-theme")}[0], circleLayer5), circleLayer5);
                    CircleLayer circleLayer6 = (CircleLayer) layer;
                    m1$$ExternalSyntheticOutline0.m("circle-color-use-theme", af$$ExternalSyntheticOutline1.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("circle-color-use-theme")}[0], circleLayer6), circleLayer6);
                    break;
                }
                break;
            case -735768543:
                if (str.equals("circle-stroke-color-use-theme")) {
                    CircleLayer circleLayer7 = (CircleLayer) layer2;
                    m1$$ExternalSyntheticOutline0.m("circle-stroke-color-use-theme", af$$ExternalSyntheticOutline1.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("circle-stroke-color-use-theme")}[0], circleLayer7), circleLayer7);
                    CircleLayer circleLayer8 = (CircleLayer) layer;
                    m1$$ExternalSyntheticOutline0.m("circle-stroke-color-use-theme", af$$ExternalSyntheticOutline1.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("circle-stroke-color-use-theme")}[0], circleLayer8), circleLayer8);
                    break;
                }
                break;
            case -585897621:
                if (str.equals("circle-stroke-color")) {
                    CircleLayer circleLayer9 = (CircleLayer) layer2;
                    m1$$ExternalSyntheticOutline0.m("circle-stroke-color", af$$ExternalSyntheticOutline1.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("circle-stroke-color")}[0], circleLayer9), circleLayer9);
                    CircleLayer circleLayer10 = (CircleLayer) layer;
                    m1$$ExternalSyntheticOutline0.m("circle-stroke-color", af$$ExternalSyntheticOutline1.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("circle-stroke-color")}[0], circleLayer10), circleLayer10);
                    break;
                }
                break;
            case -567613490:
                if (str.equals("circle-stroke-width")) {
                    CircleLayer circleLayer11 = (CircleLayer) layer2;
                    m1$$ExternalSyntheticOutline0.m("circle-stroke-width", af$$ExternalSyntheticOutline1.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("circle-stroke-width")}[0], circleLayer11), circleLayer11);
                    CircleLayer circleLayer12 = (CircleLayer) layer;
                    m1$$ExternalSyntheticOutline0.m("circle-stroke-width", af$$ExternalSyntheticOutline1.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("circle-stroke-width")}[0], circleLayer12), circleLayer12);
                    break;
                }
                break;
            case -113174716:
                if (str.equals("circle-blur")) {
                    CircleLayer circleLayer13 = (CircleLayer) layer2;
                    m1$$ExternalSyntheticOutline0.m("circle-blur", af$$ExternalSyntheticOutline1.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("circle-blur")}[0], circleLayer13), circleLayer13);
                    CircleLayer circleLayer14 = (CircleLayer) layer;
                    m1$$ExternalSyntheticOutline0.m("circle-blur", af$$ExternalSyntheticOutline1.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("circle-blur")}[0], circleLayer14), circleLayer14);
                    break;
                }
                break;
            case 787555366:
                if (str.equals("circle-color")) {
                    CircleLayer circleLayer15 = (CircleLayer) layer2;
                    m1$$ExternalSyntheticOutline0.m("circle-color", af$$ExternalSyntheticOutline1.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("circle-color")}[0], circleLayer15), circleLayer15);
                    CircleLayer circleLayer16 = (CircleLayer) layer;
                    m1$$ExternalSyntheticOutline0.m("circle-color", af$$ExternalSyntheticOutline1.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("circle-color")}[0], circleLayer16), circleLayer16);
                    break;
                }
                break;
            case 945175053:
                if (str.equals("circle-sort-key")) {
                    CircleLayer circleLayer17 = (CircleLayer) layer2;
                    m1$$ExternalSyntheticOutline0.m("circle-sort-key", af$$ExternalSyntheticOutline1.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("circle-sort-key")}[0], circleLayer17), circleLayer17);
                    CircleLayer circleLayer18 = (CircleLayer) layer;
                    m1$$ExternalSyntheticOutline0.m("circle-sort-key", af$$ExternalSyntheticOutline1.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("circle-sort-key")}[0], circleLayer18), circleLayer18);
                    break;
                }
                break;
            case 1671319571:
                if (str.equals("circle-stroke-opacity")) {
                    CircleLayer circleLayer19 = (CircleLayer) layer2;
                    m1$$ExternalSyntheticOutline0.m("circle-stroke-opacity", af$$ExternalSyntheticOutline1.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("circle-stroke-opacity")}[0], circleLayer19), circleLayer19);
                    CircleLayer circleLayer20 = (CircleLayer) layer;
                    m1$$ExternalSyntheticOutline0.m("circle-stroke-opacity", af$$ExternalSyntheticOutline1.m(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("circle-stroke-opacity")}[0], circleLayer20), circleLayer20);
                    break;
                }
                break;
        }
    }
}
