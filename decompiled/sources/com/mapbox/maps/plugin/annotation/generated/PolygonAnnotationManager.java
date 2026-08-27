package com.mapbox.maps.plugin.annotation.generated;

import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.generated.FillLayer;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.mapbox.maps.plugin.annotation.AnnotationConfig;
import com.mapbox.maps.plugin.annotation.AnnotationManagerImpl;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.IconCompatParcelizer;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class PolygonAnnotationManager extends AnnotationManagerImpl {
    public static final AtomicLong ID_GENERATOR = new AtomicLong(0);

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.annotation.generated.PolygonAnnotationManager$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1(2, FillLayer.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;)V", 0);

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            str.getClass();
            str2.getClass();
            return new FillLayer(str, str2);
        }

        public AnonymousClass1(int i, Class cls, String str, String str2, int i2) {
            super(i, cls, str, str2, i2);
        }
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManagerImpl
    public final String getAnnotationIdKey() {
        return "PolygonAnnotation";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolygonAnnotationManager(MapDelegateProviderImpl mapDelegateProviderImpl, AnnotationConfig annotationConfig) {
        super(mapDelegateProviderImpl, annotationConfig, ID_GENERATOR.incrementAndGet(), "polygonAnnotation", AnonymousClass1.INSTANCE);
        mapDelegateProviderImpl.getClass();
        LinkedHashMap linkedHashMap = this.dataDrivenPropertyUsageMap;
        Boolean bool = Boolean.FALSE;
        linkedHashMap.put("fill-construct-bridge-guard-rail", bool);
        this.dataDrivenPropertyUsageMap.put("fill-sort-key", bool);
        this.dataDrivenPropertyUsageMap.put("fill-bridge-guard-rail-color", bool);
        this.dataDrivenPropertyUsageMap.put("fill-color", bool);
        this.dataDrivenPropertyUsageMap.put("fill-opacity", bool);
        this.dataDrivenPropertyUsageMap.put("fill-outline-color", bool);
        this.dataDrivenPropertyUsageMap.put("fill-pattern", bool);
        this.dataDrivenPropertyUsageMap.put("fill-tunnel-structure-color", bool);
        this.dataDrivenPropertyUsageMap.put("fill-z-offset", bool);
        this.dataDrivenPropertyUsageMap.put("fill-bridge-guard-rail-color-use-theme", bool);
        this.dataDrivenPropertyUsageMap.put("fill-color-use-theme", bool);
        this.dataDrivenPropertyUsageMap.put("fill-outline-color-use-theme", bool);
        this.dataDrivenPropertyUsageMap.put("fill-tunnel-structure-color-use-theme", bool);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.mapbox.maps.plugin.annotation.AnnotationManagerImpl
    public final void setDataDrivenPropertyIsUsed(String str) {
        int iHashCode = str.hashCode();
        Layer layer = this.dragLayer;
        Layer layer2 = this.layer;
        switch (iHashCode) {
            case -2104747334:
                if (str.equals("fill-sort-key")) {
                    FillLayer fillLayer = (FillLayer) layer2;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-sort-key", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-sort-key")}[0], fillLayer), fillLayer);
                    FillLayer fillLayer2 = (FillLayer) layer;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-sort-key", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-sort-key")}[0], fillLayer2), fillLayer2);
                    break;
                }
                break;
            case -1679439207:
                if (str.equals("fill-color")) {
                    FillLayer fillLayer3 = (FillLayer) layer2;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-color", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-color")}[0], fillLayer3), fillLayer3);
                    FillLayer fillLayer4 = (FillLayer) layer;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-color", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-color")}[0], fillLayer4), fillLayer4);
                    break;
                }
                break;
            case -1341964098:
                if (str.equals("fill-construct-bridge-guard-rail")) {
                    FillLayer fillLayer5 = (FillLayer) layer2;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-construct-bridge-guard-rail", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-construct-bridge-guard-rail")}[0], fillLayer5), fillLayer5);
                    FillLayer fillLayer6 = (FillLayer) layer;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-construct-bridge-guard-rail", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-construct-bridge-guard-rail")}[0], fillLayer6), fillLayer6);
                    break;
                }
                break;
            case -1332788656:
                if (str.equals("fill-z-offset")) {
                    FillLayer fillLayer7 = (FillLayer) layer2;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-z-offset", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-z-offset")}[0], fillLayer7), fillLayer7);
                    FillLayer fillLayer8 = (FillLayer) layer;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-z-offset", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-z-offset")}[0], fillLayer8), fillLayer8);
                    break;
                }
                break;
            case -1250124351:
                if (str.equals("fill-opacity")) {
                    FillLayer fillLayer9 = (FillLayer) layer2;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-opacity", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-opacity")}[0], fillLayer9), fillLayer9);
                    FillLayer fillLayer10 = (FillLayer) layer;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-opacity", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-opacity")}[0], fillLayer10), fillLayer10);
                    break;
                }
                break;
            case -1206458112:
                if (str.equals("fill-bridge-guard-rail-color-use-theme")) {
                    FillLayer fillLayer11 = (FillLayer) layer2;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-bridge-guard-rail-color-use-theme", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-bridge-guard-rail-color-use-theme")}[0], fillLayer11), fillLayer11);
                    FillLayer fillLayer12 = (FillLayer) layer;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-bridge-guard-rail-color-use-theme", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-bridge-guard-rail-color-use-theme")}[0], fillLayer12), fillLayer12);
                    break;
                }
                break;
            case -1093239542:
                if (str.equals("fill-bridge-guard-rail-color")) {
                    FillLayer fillLayer13 = (FillLayer) layer2;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-bridge-guard-rail-color", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-bridge-guard-rail-color")}[0], fillLayer13), fillLayer13);
                    FillLayer fillLayer14 = (FillLayer) layer;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-bridge-guard-rail-color", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-bridge-guard-rail-color")}[0], fillLayer14), fillLayer14);
                    break;
                }
                break;
            case -1008087089:
                if (str.equals("fill-color-use-theme")) {
                    FillLayer fillLayer15 = (FillLayer) layer2;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-color-use-theme", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-color-use-theme")}[0], fillLayer15), fillLayer15);
                    FillLayer fillLayer16 = (FillLayer) layer;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-color-use-theme", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-color-use-theme")}[0], fillLayer16), fillLayer16);
                    break;
                }
                break;
            case -774008506:
                if (str.equals("fill-pattern")) {
                    FillLayer fillLayer17 = (FillLayer) layer2;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-pattern", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-pattern")}[0], fillLayer17), fillLayer17);
                    FillLayer fillLayer18 = (FillLayer) layer;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-pattern", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-pattern")}[0], fillLayer18), fillLayer18);
                    break;
                }
                break;
            case 293483940:
                if (str.equals("fill-tunnel-structure-color-use-theme")) {
                    FillLayer fillLayer19 = (FillLayer) layer2;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-tunnel-structure-color-use-theme", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-tunnel-structure-color-use-theme")}[0], fillLayer19), fillLayer19);
                    FillLayer fillLayer20 = (FillLayer) layer;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-tunnel-structure-color-use-theme", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-tunnel-structure-color-use-theme")}[0], fillLayer20), fillLayer20);
                    break;
                }
                break;
            case 805371460:
                if (str.equals("fill-outline-color-use-theme")) {
                    FillLayer fillLayer21 = (FillLayer) layer2;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-outline-color-use-theme", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-outline-color-use-theme")}[0], fillLayer21), fillLayer21);
                    FillLayer fillLayer22 = (FillLayer) layer;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-outline-color-use-theme", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-outline-color-use-theme")}[0], fillLayer22), fillLayer22);
                    break;
                }
                break;
            case 1201248078:
                if (str.equals("fill-outline-color")) {
                    FillLayer fillLayer23 = (FillLayer) layer2;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-outline-color", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-outline-color")}[0], fillLayer23), fillLayer23);
                    FillLayer fillLayer24 = (FillLayer) layer;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-outline-color", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-outline-color")}[0], fillLayer24), fillLayer24);
                    break;
                }
                break;
            case 2121434798:
                if (str.equals("fill-tunnel-structure-color")) {
                    FillLayer fillLayer25 = (FillLayer) layer2;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-tunnel-structure-color", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-tunnel-structure-color")}[0], fillLayer25), fillLayer25);
                    FillLayer fillLayer26 = (FillLayer) layer;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer("fill-tunnel-structure-color", IconCompatParcelizer.RemoteActionCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("fill-tunnel-structure-color")}[0], fillLayer26), fillLayer26);
                    break;
                }
                break;
        }
    }
}
