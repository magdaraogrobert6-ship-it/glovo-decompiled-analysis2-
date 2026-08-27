package com.mapbox.maps.viewannotation;

import androidx.sqlite.SQLite;
import com.mapbox.geojson.Geometry;
import com.mapbox.maps.AnnotatedFeature;
import com.mapbox.maps.AnnotatedLayerFeature;
import com.mapbox.maps.ViewAnnotationAnchorConfig;
import com.mapbox.maps.ViewAnnotationOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.createFromParcel;
import o.getQueryParameterslambda2;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewAnnotationOptionsKtxKt {
    public static final ViewAnnotationOptions.Builder annotatedLayerFeature(ViewAnnotationOptions.Builder builder, String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        builder.getClass();
        str.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        AnnotatedLayerFeature.Builder builderLayerId = new AnnotatedLayerFeature.Builder().layerId(str);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builderLayerId);
        ViewAnnotationOptions.Builder builderAnnotatedFeature = builder.annotatedFeature(AnnotatedFeature.valueOf(builderLayerId.build()));
        builderAnnotatedFeature.getClass();
        return builderAnnotatedFeature;
    }

    public static final ViewAnnotationOptions.Builder annotationAnchor(ViewAnnotationOptions.Builder builder, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        builder.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        ViewAnnotationAnchorConfig.Builder builder2 = new ViewAnnotationAnchorConfig.Builder();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder2);
        Object[] objArr = {builder2.build()};
        int iSerializer = getQueryParameterslambda2.serializer();
        ViewAnnotationOptions.Builder builderVariableAnchors = builder.variableAnchors((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer));
        builderVariableAnchors.getClass();
        return builderVariableAnchors;
    }

    public static final ViewAnnotationOptions.Builder annotationAnchors(ViewAnnotationOptions.Builder builder, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM... r8lambdaunavo3sxub_pc9xroryotnrlvsmArr) {
        builder.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsmArr.getClass();
        ArrayList arrayList = new ArrayList(r8lambdaunavo3sxub_pc9xroryotnrlvsmArr.length);
        for (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm : r8lambdaunavo3sxub_pc9xroryotnrlvsmArr) {
            ViewAnnotationAnchorConfig.Builder builder2 = new ViewAnnotationAnchorConfig.Builder();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder2);
            arrayList.add(builder2.build());
        }
        Object[] array = arrayList.toArray(new ViewAnnotationAnchorConfig[0]);
        array.getClass();
        ViewAnnotationAnchorConfig[] viewAnnotationAnchorConfigArr = (ViewAnnotationAnchorConfig[]) array;
        ViewAnnotationOptions.Builder builderVariableAnchors = builder.variableAnchors(SQLite.read(Arrays.copyOf(viewAnnotationAnchorConfigArr, viewAnnotationAnchorConfigArr.length)));
        builderVariableAnchors.getClass();
        return builderVariableAnchors;
    }

    public static final ViewAnnotationOptions.Builder geometry(ViewAnnotationOptions.Builder builder, Geometry geometry) {
        builder.getClass();
        geometry.getClass();
        ViewAnnotationOptions.Builder builderAnnotatedFeature = builder.annotatedFeature(AnnotatedFeature.valueOf(geometry));
        builderAnnotatedFeature.getClass();
        return builderAnnotatedFeature;
    }

    public static /* synthetic */ ViewAnnotationOptions.Builder annotatedLayerFeature$default(ViewAnnotationOptions.Builder builder, String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.maps.viewannotation.ViewAnnotationOptionsKtxKt.annotatedLayerFeature.1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnnotatedLayerFeature.Builder) obj2);
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(AnnotatedLayerFeature.Builder builder2) {
                    builder2.getClass();
                }
            };
        }
        builder.getClass();
        str.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        AnnotatedLayerFeature.Builder builderLayerId = new AnnotatedLayerFeature.Builder().layerId(str);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builderLayerId);
        ViewAnnotationOptions.Builder builderAnnotatedFeature = builder.annotatedFeature(AnnotatedFeature.valueOf(builderLayerId.build()));
        builderAnnotatedFeature.getClass();
        return builderAnnotatedFeature;
    }

    public static final ViewAnnotationOptions viewAnnotationOptions(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        ViewAnnotationOptions.Builder builder = new ViewAnnotationOptions.Builder();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        ViewAnnotationOptions viewAnnotationOptionsBuild = builder.build();
        viewAnnotationOptionsBuild.getClass();
        return viewAnnotationOptionsBuild;
    }
}
