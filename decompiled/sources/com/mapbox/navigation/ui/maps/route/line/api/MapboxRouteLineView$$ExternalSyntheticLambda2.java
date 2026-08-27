package com.mapbox.navigation.ui.maps.route.line.api;

import androidx.lifecycle.BlockRunner;
import androidx.sqlite.SQLite;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.network.NetworkHeaders$Builder;
import com.mapbox.bindgen.Expected;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.maps.Style;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils;
import com.mapbox.navigation.ui.maps.route.callout.api.RouteCalloutUiStateData;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineClearValue;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineFeatureId;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineSourceKey;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineUpdateValue;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import o.ItemTouchHelperAdapter;
import o.createFromParcel;
import o.getCieXyz;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MapboxRouteLineView$$ExternalSyntheticLambda2 implements Expected.Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MapboxRouteLineView f$0;
    public final /* synthetic */ Style f$1;

    public /* synthetic */ MapboxRouteLineView$$ExternalSyntheticLambda2(MapboxRouteLineView mapboxRouteLineView, Style style, int i) {
        this.$r8$classId = i;
        this.f$0 = mapboxRouteLineView;
        this.f$1 = style;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:24:0x0078  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:43:0x010e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0114  */
    /* JADX WARN: Code duplicated, block: B:47:0x0122  */
    /* JADX WARN: Code duplicated, block: B:52:0x0144  */
    /* JADX WARN: Code duplicated, block: B:55:0x016e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0171  */
    /* JADX WARN: Code duplicated, block: B:58:0x0174  */
    /* JADX WARN: Code duplicated, block: B:61:0x0184  */
    /* JADX WARN: Code duplicated, block: B:62:0x0193  */
    /* JADX WARN: Code duplicated, block: B:63:0x0196  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b8 A[LOOP:2: B:68:0x01b2->B:70:0x01b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x01de  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    @Override // com.mapbox.bindgen.Expected.Action
    public final void run(Object obj) {
        RouteLineSourceKey routeLineSourceKey;
        String str;
        final String str2;
        ArrayList arrayList;
        Iterator it;
        int i;
        Iterator it2;
        Iterator it3;
        RouteCalloutUiStateData routeCalloutUiStateDataAccess$toRouteCalloutUiState;
        BlockRunner blockRunner;
        Object next;
        final String str3;
        LinkedHashMap linkedHashMap;
        Iterator it4;
        int i2;
        NetworkHeaders$Builder networkHeaders$Builder;
        final int iIncrementDataId;
        List<Feature> listFeatures;
        String strId;
        final String str4;
        RouteLineFeatureId routeLineFeatureId;
        String str5;
        Feature feature;
        String str6;
        final int iIncrementDataId2;
        List<Feature> listFeatures2;
        String strId2;
        RouteLineFeatureId routeLineFeatureId2;
        String str7;
        Feature feature2;
        if (this.$r8$classId == 0) {
            RouteLineUpdateValue routeLineUpdateValue = (RouteLineUpdateValue) obj;
            routeLineUpdateValue.getClass();
            MapboxRouteLineView mapboxRouteLineView = this.f$0;
            mapboxRouteLineView.scope.launchWithMutex(new MapboxRouteLineView$renderRouteLineUpdateInternal$1$1(routeLineUpdateValue, mapboxRouteLineView, this.f$1, mapboxRouteLineView.optionsHolder, null));
            return;
        }
        final RouteLineClearValue routeLineClearValue = (RouteLineClearValue) obj;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        final MapboxRouteLineView mapboxRouteLineView2 = this.f$0;
        final Style style = this.f$1;
        Object objM4792access$getSourceKeyForPrimaryRouteIoAF18A = MapboxRouteLineView.m4792access$getSourceKeyForPrimaryRouteIoAF18A(mapboxRouteLineView2, style);
        LinkedHashMap linkedHashMap4 = mapboxRouteLineView2.sourceToFeatureMap;
        NetworkHeaders$Builder networkHeaders$Builder2 = mapboxRouteLineView2.dataIdHolder;
        Throwable thSerializer = onItemDismiss.serializer(objM4792access$getSourceKeyForPrimaryRouteIoAF18A);
        if (thSerializer == null) {
            String str8 = ((RouteLineSourceKey) objM4792access$getSourceKeyForPrimaryRouteIoAF18A).sourceId;
            routeLineSourceKey = str8 != null ? new RouteLineSourceKey(str8) : null;
            if (routeLineSourceKey != null) {
                str = routeLineSourceKey.sourceId;
            } else {
                str = null;
            }
            if (str != null) {
                iIncrementDataId2 = networkHeaders$Builder2.incrementDataId(str);
                listFeatures2 = routeLineClearValue.getPrimaryRouteSource$ui_maps_release().features();
                if (listFeatures2 != null || (feature2 = (Feature) onContentCardDismissed.MediaMetadataCompat((List) listFeatures2)) == null) {
                    strId2 = null;
                } else {
                    strId2 = feature2.id();
                }
                routeLineFeatureId2 = (RouteLineFeatureId) linkedHashMap4.get(new RouteLineSourceKey(str));
                if (routeLineFeatureId2 != null) {
                    str7 = routeLineFeatureId2.featureId;
                } else {
                    str7 = null;
                }
                if (str7 != null) {
                    linkedHashMap3.put(str, new onViewAttachedToWindowlambda0(Integer.valueOf(iIncrementDataId2), str7));
                }
                if (strId2 != null) {
                    linkedHashMap2.put(str, new onViewAttachedToWindowlambda0(Integer.valueOf(iIncrementDataId2), strId2));
                }
                final String str9 = str;
                final String str10 = strId2;
                str2 = str;
                arrayList2.add(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$renderClearRouteLineValueInternal$1$1$primarySourceKey$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        MapboxRouteLineView.updateSource(style, str9, routeLineClearValue.getPrimaryRouteSource$ui_maps_release(), Integer.valueOf(iIncrementDataId2));
                        mapboxRouteLineView2.sourceToFeatureMap.put(new RouteLineSourceKey(str2), new RouteLineFeatureId(str10));
                        return createFromParcel.INSTANCE;
                    }
                });
            } else {
                str2 = null;
            }
            Set setKeySet = MapboxRouteLineUtils.sourceLayerMap.keySet();
            arrayList = new ArrayList();
            for (Object obj2 : setKeySet) {
                str6 = ((RouteLineSourceKey) obj2).sourceId;
                if (str2 == null) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str6, str2}, getCieXyz.write())).booleanValue()) {
                    }
                }
                arrayList.add(obj2);
            }
            it = arrayList.iterator();
            i = 0;
            while (it.hasNext()) {
                next = it.next();
                if (i >= 0) {
                    SQLite.serializer();
                    throw null;
                }
                str3 = ((RouteLineSourceKey) next).sourceId;
                if (i < routeLineClearValue.getAlternativeRoutesSources$ui_maps_release().size()) {
                    iIncrementDataId = networkHeaders$Builder2.incrementDataId(str3);
                    listFeatures = routeLineClearValue.getAlternativeRoutesSources$ui_maps_release().get(i).features();
                    if (listFeatures != null || (feature = (Feature) onContentCardDismissed.MediaMetadataCompat((List) listFeatures)) == null) {
                        strId = null;
                    } else {
                        strId = feature.id();
                    }
                    it4 = it;
                    str4 = strId;
                    final int i3 = i;
                    networkHeaders$Builder = networkHeaders$Builder2;
                    i2 = i;
                    arrayList2.add(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$renderClearRouteLineValueInternal$1$1$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            FeatureCollection featureCollection = routeLineClearValue.getAlternativeRoutesSources$ui_maps_release().get(i3);
                            int i4 = iIncrementDataId;
                            Style style2 = style;
                            String str11 = str3;
                            MapboxRouteLineView.updateSource(style2, str11, featureCollection, Integer.valueOf(i4));
                            mapboxRouteLineView2.sourceToFeatureMap.put(new RouteLineSourceKey(str11), new RouteLineFeatureId(str4));
                            return createFromParcel.INSTANCE;
                        }
                    });
                    routeLineFeatureId = (RouteLineFeatureId) linkedHashMap4.get(new RouteLineSourceKey(str3));
                    if (routeLineFeatureId != null) {
                        str5 = routeLineFeatureId.featureId;
                    } else {
                        str5 = null;
                    }
                    if (str5 != null) {
                        linkedHashMap3.put(str3, new onViewAttachedToWindowlambda0(Integer.valueOf(iIncrementDataId), str5));
                    }
                    if (str4 != null) {
                        linkedHashMap = linkedHashMap2;
                        linkedHashMap.put(str3, new onViewAttachedToWindowlambda0(Integer.valueOf(iIncrementDataId), str4));
                    } else {
                        linkedHashMap = linkedHashMap2;
                    }
                } else {
                    linkedHashMap = linkedHashMap2;
                    it4 = it;
                    i2 = i;
                    networkHeaders$Builder = networkHeaders$Builder2;
                }
                i = i2 + 1;
                linkedHashMap2 = linkedHashMap;
                it = it4;
                networkHeaders$Builder2 = networkHeaders$Builder;
            }
            it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) it2.next()).invoke();
            }
            MapboxRouteLineView.updateSource(style, "mapbox-navigation-waypoint-source", routeLineClearValue.getWaypointsSource$ui_maps_release(), null);
            mapboxRouteLineView2.primaryRouteLineLayerGroup = ItemTouchHelperAdapter.serializer;
            mapboxRouteLineView2.getCurrentlyAttachedRoutesToLayers();
            it3 = mapboxRouteLineView2.routesAttachedToLayersObservers.iterator();
            if (!it3.hasNext()) {
                throw ff$$ExternalSyntheticOutline0.m(it3);
            }
            routeCalloutUiStateDataAccess$toRouteCalloutUiState = MapboxRouteLineView.access$toRouteCalloutUiState(mapboxRouteLineView2, routeLineClearValue.getCallouts$ui_maps_release());
            mapboxRouteLineView2.lastRouteCalloutData = routeCalloutUiStateDataAccess$toRouteCalloutUiState;
            blockRunner = mapboxRouteLineView2.routeCalloutView;
            if (blockRunner != null) {
                blockRunner.renderCallouts(routeCalloutUiStateDataAccess$toRouteCalloutUiState);
            }
        }
        LoggerProviderKt.logE("MbxRouteLineView", thSerializer.getMessage());
        if (routeLineSourceKey != null) {
            str = routeLineSourceKey.sourceId;
        } else {
            str = null;
        }
        if (str != null) {
            iIncrementDataId2 = networkHeaders$Builder2.incrementDataId(str);
            listFeatures2 = routeLineClearValue.getPrimaryRouteSource$ui_maps_release().features();
            if (listFeatures2 != null) {
                strId2 = null;
            } else {
                strId2 = null;
            }
            routeLineFeatureId2 = (RouteLineFeatureId) linkedHashMap4.get(new RouteLineSourceKey(str));
            if (routeLineFeatureId2 != null) {
                str7 = routeLineFeatureId2.featureId;
            } else {
                str7 = null;
            }
            if (str7 != null) {
                linkedHashMap3.put(str, new onViewAttachedToWindowlambda0(Integer.valueOf(iIncrementDataId2), str7));
            }
            if (strId2 != null) {
                linkedHashMap2.put(str, new onViewAttachedToWindowlambda0(Integer.valueOf(iIncrementDataId2), strId2));
            }
            final String str11 = str;
            final String str12 = strId2;
            str2 = str;
            arrayList2.add(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$renderClearRouteLineValueInternal$1$1$primarySourceKey$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    MapboxRouteLineView.updateSource(style, str11, routeLineClearValue.getPrimaryRouteSource$ui_maps_release(), Integer.valueOf(iIncrementDataId2));
                    mapboxRouteLineView2.sourceToFeatureMap.put(new RouteLineSourceKey(str2), new RouteLineFeatureId(str12));
                    return createFromParcel.INSTANCE;
                }
            });
        } else {
            str2 = null;
        }
        Set setKeySet2 = MapboxRouteLineUtils.sourceLayerMap.keySet();
        arrayList = new ArrayList();
        while (r0.hasNext()) {
            str6 = ((RouteLineSourceKey) obj2).sourceId;
            if (str2 == null) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str6, str2}, getCieXyz.write())).booleanValue()) {
                }
            }
            arrayList.add(obj2);
        }
        it = arrayList.iterator();
        i = 0;
        while (it.hasNext()) {
            next = it.next();
            if (i >= 0) {
                SQLite.serializer();
                throw null;
            }
            str3 = ((RouteLineSourceKey) next).sourceId;
            if (i < routeLineClearValue.getAlternativeRoutesSources$ui_maps_release().size()) {
                iIncrementDataId = networkHeaders$Builder2.incrementDataId(str3);
                listFeatures = routeLineClearValue.getAlternativeRoutesSources$ui_maps_release().get(i).features();
                if (listFeatures != null) {
                    strId = null;
                } else {
                    strId = null;
                }
                it4 = it;
                str4 = strId;
                final int i4 = i;
                networkHeaders$Builder = networkHeaders$Builder2;
                i2 = i;
                arrayList2.add(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$renderClearRouteLineValueInternal$1$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        FeatureCollection featureCollection = routeLineClearValue.getAlternativeRoutesSources$ui_maps_release().get(i4);
                        int i5 = iIncrementDataId;
                        Style style2 = style;
                        String str13 = str3;
                        MapboxRouteLineView.updateSource(style2, str13, featureCollection, Integer.valueOf(i5));
                        mapboxRouteLineView2.sourceToFeatureMap.put(new RouteLineSourceKey(str13), new RouteLineFeatureId(str4));
                        return createFromParcel.INSTANCE;
                    }
                });
                routeLineFeatureId = (RouteLineFeatureId) linkedHashMap4.get(new RouteLineSourceKey(str3));
                if (routeLineFeatureId != null) {
                    str5 = routeLineFeatureId.featureId;
                } else {
                    str5 = null;
                }
                if (str5 != null) {
                    linkedHashMap3.put(str3, new onViewAttachedToWindowlambda0(Integer.valueOf(iIncrementDataId), str5));
                }
                if (str4 != null) {
                    linkedHashMap = linkedHashMap2;
                    linkedHashMap.put(str3, new onViewAttachedToWindowlambda0(Integer.valueOf(iIncrementDataId), str4));
                } else {
                    linkedHashMap = linkedHashMap2;
                }
            } else {
                linkedHashMap = linkedHashMap2;
                it4 = it;
                i2 = i;
                networkHeaders$Builder = networkHeaders$Builder2;
            }
            i = i2 + 1;
            linkedHashMap2 = linkedHashMap;
            it = it4;
            networkHeaders$Builder2 = networkHeaders$Builder;
        }
        it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) it2.next()).invoke();
        }
        MapboxRouteLineView.updateSource(style, "mapbox-navigation-waypoint-source", routeLineClearValue.getWaypointsSource$ui_maps_release(), null);
        mapboxRouteLineView2.primaryRouteLineLayerGroup = ItemTouchHelperAdapter.serializer;
        mapboxRouteLineView2.getCurrentlyAttachedRoutesToLayers();
        it3 = mapboxRouteLineView2.routesAttachedToLayersObservers.iterator();
        if (!it3.hasNext()) {
            throw ff$$ExternalSyntheticOutline0.m(it3);
        }
        routeCalloutUiStateDataAccess$toRouteCalloutUiState = MapboxRouteLineView.access$toRouteCalloutUiState(mapboxRouteLineView2, routeLineClearValue.getCallouts$ui_maps_release());
        mapboxRouteLineView2.lastRouteCalloutData = routeCalloutUiStateDataAccess$toRouteCalloutUiState;
        blockRunner = mapboxRouteLineView2.routeCalloutView;
        if (blockRunner != null) {
            blockRunner.renderCallouts(routeCalloutUiStateDataAccess$toRouteCalloutUiState);
        }
    }
}
