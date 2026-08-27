package com.mapbox.maps.viewannotation;

import android.view.View;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.mapbox.maps.AnnotatedLayerFeature;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxDelicateApi;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.ViewAnnotationOptions;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setImageLevel;

/* JADX INFO: loaded from: classes2.dex */
public interface ViewAnnotationManager {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final ViewAnnotationUpdateMode DEFAULT_UPDATE_MODE = ViewAnnotationUpdateMode.MAP_SYNCHRONIZED;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void addOnViewAnnotationUpdatedListener(OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener);

    View addViewAnnotation(int i, ViewAnnotationOptions viewAnnotationOptions);

    void addViewAnnotation(int i, ViewAnnotationOptions viewAnnotationOptions, setImageLevel setimagelevel, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm);

    void addViewAnnotation(View view, ViewAnnotationOptions viewAnnotationOptions);

    @MapboxDelicateApi
    CameraOptions cameraForAnnotations(List<? extends View> list, EdgeInsets edgeInsets, Double d, Double d2);

    void cameraForAnnotations(List<? extends View> list, EdgeInsets edgeInsets, Double d, Double d2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm);

    Map<View, ViewAnnotationOptions> getAnnotations();

    View getViewAnnotation(AnnotatedLayerFeature annotatedLayerFeature);

    HashSet<String> getViewAnnotationAvoidLayers();

    ViewAnnotationOptions getViewAnnotationOptions(View view);

    ViewAnnotationOptions getViewAnnotationOptions(AnnotatedLayerFeature annotatedLayerFeature);

    ViewAnnotationUpdateMode getViewAnnotationUpdateMode();

    void removeAllViewAnnotations();

    void removeOnViewAnnotationUpdatedListener(OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener);

    boolean removeViewAnnotation(View view);

    void setViewAnnotationAvoidLayers(HashSet<String> hashSet);

    void setViewAnnotationUpdateMode(ViewAnnotationUpdateMode viewAnnotationUpdateMode);

    boolean updateViewAnnotation(View view, ViewAnnotationOptions viewAnnotationOptions);

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        @MapboxExperimental
        public static /* synthetic */ void getViewAnnotationAvoidLayers$annotations() {
        }

        public static /* synthetic */ CameraOptions cameraForAnnotations$default(ViewAnnotationManager viewAnnotationManager, List list, EdgeInsets edgeInsets, Double d, Double d2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    edgeInsets = null;
                }
                if ((i & 4) != 0) {
                    d = null;
                }
                if ((i & 8) != 0) {
                    d2 = null;
                }
                return viewAnnotationManager.cameraForAnnotations(list, edgeInsets, d, d2);
            }
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: cameraForAnnotations");
            return null;
        }

        public static /* synthetic */ void cameraForAnnotations$default(ViewAnnotationManager viewAnnotationManager, List list, EdgeInsets edgeInsets, Double d, Double d2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
            if (obj == null) {
                viewAnnotationManager.cameraForAnnotations(list, (i & 2) != 0 ? null : edgeInsets, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : d2, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            } else {
                IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: cameraForAnnotations");
            }
        }
    }
}
