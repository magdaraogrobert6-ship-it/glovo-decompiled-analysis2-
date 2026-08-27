package com.mapbox.maps.viewannotation;

import android.view.View;
import com.mapbox.geojson.Point;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.ViewAnnotationAnchorConfig;

/* JADX INFO: loaded from: classes2.dex */
public interface OnViewAnnotationUpdatedListener {
    void onViewAnnotationAnchorCoordinateUpdated(View view, Point point);

    void onViewAnnotationAnchorUpdated(View view, ViewAnnotationAnchorConfig viewAnnotationAnchorConfig);

    void onViewAnnotationPositionUpdated(View view, ScreenCoordinate screenCoordinate, double d, double d2);

    void onViewAnnotationVisibilityUpdated(View view, boolean z);

    public static final class DefaultImpls {
        public static void onViewAnnotationVisibilityUpdated(OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener, View view, boolean z) {
            view.getClass();
        }

        public static void onViewAnnotationAnchorCoordinateUpdated(OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener, View view, Point point) {
            view.getClass();
            point.getClass();
        }

        public static void onViewAnnotationAnchorUpdated(OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener, View view, ViewAnnotationAnchorConfig viewAnnotationAnchorConfig) {
            view.getClass();
            viewAnnotationAnchorConfig.getClass();
        }

        public static void onViewAnnotationPositionUpdated(OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener, View view, ScreenCoordinate screenCoordinate, double d, double d2) {
            view.getClass();
            screenCoordinate.getClass();
        }
    }
}
