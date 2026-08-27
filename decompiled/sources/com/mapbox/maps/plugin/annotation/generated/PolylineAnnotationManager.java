package com.mapbox.maps.plugin.annotation.generated;

import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.generated.LineLayer;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.mapbox.maps.plugin.annotation.AnnotationConfig;
import com.mapbox.maps.plugin.annotation.AnnotationManagerImpl;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class PolylineAnnotationManager extends AnnotationManagerImpl {
    public static final AtomicLong ID_GENERATOR = new AtomicLong(0);

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.annotation.generated.PolylineAnnotationManager$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1(2, LineLayer.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;)V", 0);

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            str.getClass();
            str2.getClass();
            return new LineLayer(str, str2);
        }

        public AnonymousClass1(int i, Class cls, String str, String str2, int i2) {
            super(i, cls, str, str2, i2);
        }
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManagerImpl
    public final String getAnnotationIdKey() {
        return "PolylineAnnotation";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolylineAnnotationManager(MapDelegateProviderImpl mapDelegateProviderImpl, AnnotationConfig annotationConfig) {
        super(mapDelegateProviderImpl, annotationConfig, ID_GENERATOR.incrementAndGet(), "polylineAnnotation", AnonymousClass1.INSTANCE);
        mapDelegateProviderImpl.getClass();
        LinkedHashMap linkedHashMap = this.dataDrivenPropertyUsageMap;
        Boolean bool = Boolean.FALSE;
        linkedHashMap.put("line-elevation-ground-scale", bool);
        this.dataDrivenPropertyUsageMap.put("line-join", bool);
        this.dataDrivenPropertyUsageMap.put("line-sort-key", bool);
        this.dataDrivenPropertyUsageMap.put("line-z-offset", bool);
        this.dataDrivenPropertyUsageMap.put("line-blur", bool);
        this.dataDrivenPropertyUsageMap.put("line-border-color", bool);
        this.dataDrivenPropertyUsageMap.put("line-border-width", bool);
        this.dataDrivenPropertyUsageMap.put("line-color", bool);
        this.dataDrivenPropertyUsageMap.put("line-emissive-strength", bool);
        this.dataDrivenPropertyUsageMap.put("line-gap-width", bool);
        this.dataDrivenPropertyUsageMap.put("line-offset", bool);
        this.dataDrivenPropertyUsageMap.put("line-opacity", bool);
        this.dataDrivenPropertyUsageMap.put("line-pattern", bool);
        this.dataDrivenPropertyUsageMap.put("line-width", bool);
        this.dataDrivenPropertyUsageMap.put("line-border-color-use-theme", bool);
        this.dataDrivenPropertyUsageMap.put("line-color-use-theme", bool);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.mapbox.maps.plugin.annotation.AnnotationManagerImpl
    public final void setDataDrivenPropertyIsUsed(String str) {
        int iHashCode = str.hashCode();
        Layer layer = this.dragLayer;
        Layer layer2 = this.layer;
        switch (iHashCode) {
            case -2043443136:
                if (str.equals("line-color-use-theme")) {
                    LineLayer lineLayer = (LineLayer) layer2;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-color-use-theme", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-color-use-theme")}[0], lineLayer), lineLayer);
                    LineLayer lineLayer2 = (LineLayer) layer;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-color-use-theme", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-color-use-theme")}[0], lineLayer2), lineLayer2);
                    break;
                }
                break;
            case -1842775392:
                if (str.equals("line-blur")) {
                    LineLayer lineLayer3 = (LineLayer) layer2;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-blur", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-blur")}[0], lineLayer3), lineLayer3);
                    LineLayer lineLayer4 = (LineLayer) layer;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-blur", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-blur")}[0], lineLayer4), lineLayer4);
                    break;
                }
                break;
            case -1842534557:
                if (str.equals("line-join")) {
                    LineLayer lineLayer5 = (LineLayer) layer2;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-join", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-join")}[0], lineLayer5), lineLayer5);
                    LineLayer lineLayer6 = (LineLayer) layer;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-join", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-join")}[0], lineLayer6), lineLayer6);
                    break;
                }
                break;
            case -1788506263:
                if (str.equals("line-sort-key")) {
                    LineLayer lineLayer7 = (LineLayer) layer2;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-sort-key", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-sort-key")}[0], lineLayer7), lineLayer7);
                    LineLayer lineLayer8 = (LineLayer) layer;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-sort-key", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-sort-key")}[0], lineLayer8), lineLayer8);
                    break;
                }
                break;
            case -1763440266:
                if (str.equals("line-gap-width")) {
                    LineLayer lineLayer9 = (LineLayer) layer2;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-gap-width", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-gap-width")}[0], lineLayer9), lineLayer9);
                    LineLayer lineLayer10 = (LineLayer) layer;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-gap-width", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-gap-width")}[0], lineLayer10), lineLayer10);
                    break;
                }
                break;
            case -1290458038:
                if (str.equals("line-color")) {
                    Expression[] expressionArr = {new Expression("line-color")};
                    Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("get");
                    expressionBuilder.addArgument(expressionArr[0]);
                    ((LineLayer) layer2).lineColor(expressionBuilder.build());
                    Expression[] expressionArr2 = {new Expression("line-color")};
                    Expression.ExpressionBuilder expressionBuilder2 = new Expression.ExpressionBuilder("get");
                    expressionBuilder2.addArgument(expressionArr2[0]);
                    ((LineLayer) layer).lineColor(expressionBuilder2.build());
                    break;
                }
                break;
            case -1272173907:
                if (str.equals("line-width")) {
                    Expression[] expressionArr3 = {new Expression("line-width")};
                    Expression.ExpressionBuilder expressionBuilder3 = new Expression.ExpressionBuilder("get");
                    expressionBuilder3.addArgument(expressionArr3[0]);
                    ((LineLayer) layer2).lineWidth(expressionBuilder3.build());
                    Expression[] expressionArr4 = {new Expression("line-width")};
                    Expression.ExpressionBuilder expressionBuilder4 = new Expression.ExpressionBuilder("get");
                    expressionBuilder4.addArgument(expressionArr4[0]);
                    ((LineLayer) layer).lineWidth(expressionBuilder4.build());
                    break;
                }
                break;
            case -1101375694:
                if (str.equals("line-opacity")) {
                    Expression[] expressionArr5 = {new Expression("line-opacity")};
                    Expression.ExpressionBuilder expressionBuilder5 = new Expression.ExpressionBuilder("get");
                    expressionBuilder5.addArgument(expressionArr5[0]);
                    ((LineLayer) layer2).lineOpacity(expressionBuilder5.build());
                    Expression[] expressionArr6 = {new Expression("line-opacity")};
                    Expression.ExpressionBuilder expressionBuilder6 = new Expression.ExpressionBuilder("get");
                    expressionBuilder6.addArgument(expressionArr6[0]);
                    ((LineLayer) layer).lineOpacity(expressionBuilder6.build());
                    break;
                }
                break;
            case -1016547585:
                if (str.equals("line-z-offset")) {
                    LineLayer lineLayer11 = (LineLayer) layer2;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-z-offset", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-z-offset")}[0], lineLayer11), lineLayer11);
                    LineLayer lineLayer12 = (LineLayer) layer;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-z-offset", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-z-offset")}[0], lineLayer12), lineLayer12);
                    break;
                }
                break;
            case -1014430580:
                if (str.equals("line-offset")) {
                    LineLayer lineLayer13 = (LineLayer) layer2;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-offset", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-offset")}[0], lineLayer13), lineLayer13);
                    LineLayer lineLayer14 = (LineLayer) layer;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-offset", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-offset")}[0], lineLayer14), lineLayer14);
                    break;
                }
                break;
            case -625259849:
                if (str.equals("line-pattern")) {
                    LineLayer lineLayer15 = (LineLayer) layer2;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-pattern", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-pattern")}[0], lineLayer15), lineLayer15);
                    LineLayer lineLayer16 = (LineLayer) layer;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-pattern", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-pattern")}[0], lineLayer16), lineLayer16);
                    break;
                }
                break;
            case -99485459:
                if (str.equals("line-elevation-ground-scale")) {
                    LineLayer lineLayer17 = (LineLayer) layer2;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-elevation-ground-scale", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-elevation-ground-scale")}[0], lineLayer17), lineLayer17);
                    LineLayer lineLayer18 = (LineLayer) layer;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-elevation-ground-scale", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-elevation-ground-scale")}[0], lineLayer18), lineLayer18);
                    break;
                }
                break;
            case 507029854:
                if (str.equals("line-emissive-strength")) {
                    LineLayer lineLayer19 = (LineLayer) layer2;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-emissive-strength", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-emissive-strength")}[0], lineLayer19), lineLayer19);
                    LineLayer lineLayer20 = (LineLayer) layer;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-emissive-strength", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-emissive-strength")}[0], lineLayer20), lineLayer20);
                    break;
                }
                break;
            case 1136060347:
                if (str.equals("line-border-color")) {
                    LineLayer lineLayer21 = (LineLayer) layer2;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-border-color", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-border-color")}[0], lineLayer21), lineLayer21);
                    LineLayer lineLayer22 = (LineLayer) layer;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-border-color", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-border-color")}[0], lineLayer22), lineLayer22);
                    break;
                }
                break;
            case 1154344478:
                if (str.equals("line-border-width")) {
                    LineLayer lineLayer23 = (LineLayer) layer2;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-border-width", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-border-width")}[0], lineLayer23), lineLayer23);
                    LineLayer lineLayer24 = (LineLayer) layer;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-border-width", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-border-width")}[0], lineLayer24), lineLayer24);
                    break;
                }
                break;
            case 1226467953:
                if (str.equals("line-border-color-use-theme")) {
                    LineLayer lineLayer25 = (LineLayer) layer2;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-border-color-use-theme", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-border-color-use-theme")}[0], lineLayer25), lineLayer25);
                    LineLayer lineLayer26 = (LineLayer) layer;
                    SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-border-color-use-theme", MediaSessionCompatQueueItem.IconCompatParcelizer(new Expression.ExpressionBuilder("get"), new Expression[]{new Expression("line-border-color-use-theme")}[0], lineLayer26), lineLayer26);
                    break;
                }
                break;
        }
    }
}
