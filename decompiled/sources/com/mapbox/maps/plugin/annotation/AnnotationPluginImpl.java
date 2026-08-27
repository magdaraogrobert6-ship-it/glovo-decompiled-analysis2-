package com.mapbox.maps.plugin.annotation;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.MapSizePlugin;
import com.mapbox.maps.plugin.MapStyleObserverPlugin;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationPluginImpl implements MapPlugin, MapSizePlugin, MapStyleObserverPlugin {
    public MapDelegateProviderImpl delegateProvider;
    public int height;
    public final ArrayList managerList = new ArrayList();
    public int width;

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void initialize() {
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void onDelegateProvider(MapDelegateProviderImpl mapDelegateProviderImpl) {
        this.delegateProvider = mapDelegateProviderImpl;
    }

    @Override // com.mapbox.maps.plugin.MapStyleObserverPlugin
    public final void onStyleChanged(Style style) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void cleanup() {
        ArrayList arrayList = this.managerList;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnnotationManagerImpl annotationManagerImpl = (AnnotationManagerImpl) ((WeakReference) it.next()).get();
            if (annotationManagerImpl != 0) {
                MapboxMap mapboxMap = (MapboxMap) annotationManagerImpl.delegateProvider.mapStyleManagerDelegate;
                for (String str : annotationManagerImpl.associatedLayers) {
                    if (mapboxMap.styleLayerExists(str)) {
                        mapboxMap.removeStyleLayer(str);
                    }
                }
                for (String str2 : annotationManagerImpl.associatedSources) {
                    if (mapboxMap.styleSourceExists(str2)) {
                        mapboxMap.removeStyleSource(str2);
                    }
                }
                annotationManagerImpl.styleImages.clear();
                LinkedHashSet linkedHashSet = annotationManagerImpl.interactionsCancelableSet;
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    ((Cancelable) it2.next()).cancel();
                }
                linkedHashSet.clear();
                annotationManagerImpl.annotationMap.clear();
                annotationManagerImpl.dragAnnotationMap.clear();
                annotationManagerImpl.dragListeners.clear();
                annotationManagerImpl.clickListeners.clear();
                annotationManagerImpl.longClickListeners.clear();
                annotationManagerImpl.interactionListener.clear();
                if (annotationManagerImpl instanceof ClusterAnnotationManager) {
                    ClusterAnnotationManager clusterAnnotationManager = (ClusterAnnotationManager) annotationManagerImpl;
                    clusterAnnotationManager.getClusterClickListeners().clear();
                    clusterAnnotationManager.getClusterLongClickListeners().clear();
                }
            }
        }
        arrayList.clear();
    }

    @Override // com.mapbox.maps.plugin.MapSizePlugin
    public final void onSizeChanged(int i, int i2) {
        this.width = i;
        this.height = i2;
        Iterator it = this.managerList.iterator();
        while (it.hasNext()) {
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotationType.values().length];
            try {
                iArr[AnnotationType.PolygonAnnotation.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotationType.CircleAnnotation.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotationType.PolylineAnnotation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnnotationType.PointAnnotation.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
