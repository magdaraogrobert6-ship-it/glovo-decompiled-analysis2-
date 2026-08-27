package com.mapbox.navigation.ui.maps.util;

import android.util.LruCache;
import androidx.sqlite.SQLite;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.agconnect.config.impl.m;
import com.mapbox.api.directions.v5.models.Closure;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils$extractRouteData$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class CacheResultUtils$cacheRouteTrafficResult$1 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final m handler;

    public CacheResultUtils$cacheRouteTrafficResult$1(LruCache lruCache) {
        this.handler = new m(MapboxRouteLineUtils$extractRouteData$1.INSTANCE, 12, lruCache);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        final NavigationRoute navigationRoute = (NavigationRoute) obj;
        final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2;
        navigationRoute.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        return this.handler.invoke(new CacheResultUtils$CacheResultCall(navigationRoute, r8lambdaunavo3sxub_pc9xroryotnrlvsm) { // from class: com.mapbox.navigation.ui.maps.util.CacheResultUtils$CacheResultKeyRouteTraffic
            public final NavigationRoute route;
            public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM trafficProvider;

            public final int hashCode() {
                NavigationRoute navigationRoute2 = this.route;
                int iHashCode = this.trafficProvider.hashCode() + (navigationRoute2.id.hashCode() * 31);
                List<RouteLeg> listLegs = navigationRoute2.directionsRoute.legs();
                if (listLegs != null) {
                    for (RouteLeg routeLeg : listLegs) {
                        LegAnnotation legAnnotationAnnotation = routeLeg.annotation();
                        List<String> listCongestion = legAnnotationAnnotation != null ? legAnnotationAnnotation.congestion() : null;
                        int iHashCode2 = listCongestion != null ? listCongestion.hashCode() : 0;
                        LegAnnotation legAnnotationAnnotation2 = routeLeg.annotation();
                        List<Integer> listCongestionNumeric = legAnnotationAnnotation2 != null ? legAnnotationAnnotation2.congestionNumeric() : null;
                        int iHashCode3 = listCongestionNumeric != null ? listCongestionNumeric.hashCode() : 0;
                        List<Closure> listClosures = routeLeg.closures();
                        iHashCode = (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (listClosures != null ? listClosures.hashCode() : 0);
                        MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
                        String[] roadClassArray$ui_maps_release = MapboxRouteLineUtils.getRoadClassArray$ui_maps_release(routeLeg.steps());
                        int length = roadClassArray$ui_maps_release.length;
                        for (int i = 0; i < length; i++) {
                            String str = roadClassArray$ui_maps_release[i];
                            iHashCode = (iHashCode * 31) + (str != null ? str.hashCode() : 0);
                        }
                    }
                }
                return iHashCode;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.mapbox.navigation.ui.maps.util.CacheResultUtils$CacheResultCall
            public final Object invoke(Lambda lambda) {
                return ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) lambda).invoke(this.route, this.trafficProvider);
            }

            {
                navigationRoute.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
                this.route = navigationRoute;
                this.trafficProvider = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            }

            public final String toString() {
                return "CacheResultKeyRouteTraffic(route=" + this.route + ", trafficProvider=" + this.trafficProvider + ')';
            }

            public final boolean equals(Object obj3) {
                List<Closure> listR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                RouteLeg routeLeg;
                List<RouteLeg> listLegs;
                RouteLeg routeLeg2;
                LegAnnotation legAnnotationAnnotation;
                RouteLeg routeLeg3;
                LegAnnotation legAnnotationAnnotation2;
                List<Integer> listCongestionNumeric;
                List<Integer> listCongestionNumeric2;
                RouteLeg routeLeg4;
                LegAnnotation legAnnotationAnnotation3;
                RouteLeg routeLeg5;
                LegAnnotation legAnnotationAnnotation4;
                List<String> listCongestion;
                List<String> listCongestion2;
                List<String> listAnnotationsList;
                List<String> listAnnotationsList2;
                if (this != obj3) {
                    if (CacheResultUtils$CacheResultKeyRouteTraffic.class.equals(obj3 != null ? obj3.getClass() : null)) {
                        obj3.getClass();
                        CacheResultUtils$CacheResultKeyRouteTraffic cacheResultUtils$CacheResultKeyRouteTraffic = (CacheResultUtils$CacheResultKeyRouteTraffic) obj3;
                        NavigationRoute navigationRoute2 = cacheResultUtils$CacheResultKeyRouteTraffic.route;
                        NavigationRoute navigationRoute3 = this.route;
                        String str = navigationRoute3.id;
                        DirectionsRoute directionsRoute = navigationRoute3.directionsRoute;
                        String str2 = navigationRoute2.id;
                        DirectionsRoute directionsRoute2 = navigationRoute2.directionsRoute;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, str2}, getCieXyz.write())).booleanValue()) {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trafficProvider, cacheResultUtils$CacheResultKeyRouteTraffic.trafficProvider}, getCieXyz.write())).booleanValue()) {
                                List<RouteLeg> listLegs2 = directionsRoute.legs();
                                Integer numValueOf = listLegs2 != null ? Integer.valueOf(listLegs2.size()) : null;
                                List<RouteLeg> listLegs3 = directionsRoute2.legs();
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{numValueOf, listLegs3 != null ? Integer.valueOf(listLegs3.size()) : null}, getCieXyz.write())).booleanValue()) {
                                    List<RouteLeg> listLegs4 = directionsRoute.legs();
                                    Integer numValueOf2 = listLegs4 != null ? Integer.valueOf(listLegs4.size()) : null;
                                    List<RouteLeg> listLegs5 = directionsRoute2.legs();
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{numValueOf2, listLegs5 != null ? Integer.valueOf(listLegs5.size()) : null}, getCieXyz.write())).booleanValue()) {
                                        RouteOptions routeOptions = directionsRoute.routeOptions();
                                        boolean zContains = (routeOptions == null || (listAnnotationsList2 = routeOptions.annotationsList()) == null) ? false : listAnnotationsList2.contains("congestion_numeric");
                                        RouteOptions routeOptions2 = directionsRoute2.routeOptions();
                                        boolean z = zContains == ((routeOptions2 == null || (listAnnotationsList = routeOptions2.annotationsList()) == null) ? false : listAnnotationsList.contains("congestion_numeric"));
                                        if (z) {
                                            List<Closure> listR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = instance_delegatelambda0.write;
                                            if (z && (listLegs = directionsRoute.legs()) != null) {
                                                int i = 0;
                                                for (Object obj4 : listLegs) {
                                                    if (i >= 0) {
                                                        RouteLeg routeLeg6 = (RouteLeg) obj4;
                                                        if (!zContains) {
                                                            LegAnnotation legAnnotationAnnotation5 = routeLeg6.annotation();
                                                            Integer numValueOf3 = (legAnnotationAnnotation5 == null || (listCongestion2 = legAnnotationAnnotation5.congestion()) == null) ? null : Integer.valueOf(listCongestion2.size());
                                                            List<RouteLeg> listLegs6 = directionsRoute2.legs();
                                                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{numValueOf3, (listLegs6 == null || (routeLeg5 = listLegs6.get(i)) == null || (legAnnotationAnnotation4 = routeLeg5.annotation()) == null || (listCongestion = legAnnotationAnnotation4.congestion()) == null) ? null : Integer.valueOf(listCongestion.size())}, getCieXyz.write())).booleanValue()) {
                                                                LegAnnotation legAnnotationAnnotation6 = routeLeg6.annotation();
                                                                List listCongestion3 = legAnnotationAnnotation6 != null ? legAnnotationAnnotation6.congestion() : null;
                                                                if (listCongestion3 == null) {
                                                                    listCongestion3 = listR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
                                                                }
                                                                List<RouteLeg> listLegs7 = directionsRoute2.legs();
                                                                List listCongestion4 = (listLegs7 == null || (routeLeg4 = listLegs7.get(i)) == null || (legAnnotationAnnotation3 = routeLeg4.annotation()) == null) ? null : legAnnotationAnnotation3.congestion();
                                                                if (listCongestion4 == null) {
                                                                    listCongestion4 = listR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
                                                                }
                                                                if (listCongestion3.size() == listCongestion4.size()) {
                                                                    ArrayList<onViewAttachedToWindowlambda0> arrayListRemoteActionCompatParcelizer = onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) listCongestion3, (Iterable) listCongestion4);
                                                                    if (arrayListRemoteActionCompatParcelizer.isEmpty()) {
                                                                        continue;
                                                                    } else {
                                                                        for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 : arrayListRemoteActionCompatParcelizer) {
                                                                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) onviewattachedtowindowlambda0.serializer, (String) onviewattachedtowindowlambda0.write}, getCieXyz.write())).booleanValue()) {
                                                                            }
                                                                        }
                                                                    }
                                                                    i++;
                                                                }
                                                            }
                                                        } else if (zContains) {
                                                            LegAnnotation legAnnotationAnnotation7 = routeLeg6.annotation();
                                                            Integer numValueOf4 = (legAnnotationAnnotation7 == null || (listCongestionNumeric2 = legAnnotationAnnotation7.congestionNumeric()) == null) ? null : Integer.valueOf(listCongestionNumeric2.size());
                                                            List<RouteLeg> listLegs8 = directionsRoute2.legs();
                                                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{numValueOf4, (listLegs8 == null || (routeLeg3 = listLegs8.get(i)) == null || (legAnnotationAnnotation2 = routeLeg3.annotation()) == null || (listCongestionNumeric = legAnnotationAnnotation2.congestionNumeric()) == null) ? null : Integer.valueOf(listCongestionNumeric.size())}, getCieXyz.write())).booleanValue()) {
                                                                LegAnnotation legAnnotationAnnotation8 = routeLeg6.annotation();
                                                                List listCongestionNumeric3 = legAnnotationAnnotation8 != null ? legAnnotationAnnotation8.congestionNumeric() : null;
                                                                if (listCongestionNumeric3 == null) {
                                                                    listCongestionNumeric3 = listR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
                                                                }
                                                                List<RouteLeg> listLegs9 = directionsRoute2.legs();
                                                                List listCongestionNumeric4 = (listLegs9 == null || (routeLeg2 = listLegs9.get(i)) == null || (legAnnotationAnnotation = routeLeg2.annotation()) == null) ? null : legAnnotationAnnotation.congestionNumeric();
                                                                if (listCongestionNumeric4 == null) {
                                                                    listCongestionNumeric4 = listR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
                                                                }
                                                                if (listCongestionNumeric3.size() == listCongestionNumeric4.size()) {
                                                                    ArrayList<onViewAttachedToWindowlambda0> arrayListRemoteActionCompatParcelizer2 = onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) listCongestionNumeric3, (Iterable) listCongestionNumeric4);
                                                                    if (arrayListRemoteActionCompatParcelizer2.isEmpty()) {
                                                                        continue;
                                                                    } else {
                                                                        for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 : arrayListRemoteActionCompatParcelizer2) {
                                                                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(Integer) onviewattachedtowindowlambda1.serializer, (Integer) onviewattachedtowindowlambda1.write}, getCieXyz.write())).booleanValue()) {
                                                                            }
                                                                        }
                                                                    }
                                                                    i++;
                                                                }
                                                            }
                                                        } else {
                                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                                            return false;
                                                        }
                                                    } else {
                                                        SQLite.serializer();
                                                        throw null;
                                                    }
                                                }
                                            }
                                            List<RouteLeg> listLegs10 = directionsRoute.legs();
                                            Integer numValueOf5 = listLegs10 != null ? Integer.valueOf(listLegs10.size()) : null;
                                            List<RouteLeg> listLegs11 = directionsRoute2.legs();
                                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{numValueOf5, listLegs11 != null ? Integer.valueOf(listLegs11.size()) : null}, getCieXyz.write())).booleanValue()) {
                                                List<RouteLeg> listLegs12 = directionsRoute.legs();
                                                if (listLegs12 != null) {
                                                    int i2 = 0;
                                                    for (Object obj5 : listLegs12) {
                                                        if (i2 >= 0) {
                                                            List<Closure> listClosures = ((RouteLeg) obj5).closures();
                                                            if (listClosures == null) {
                                                                listClosures = listR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
                                                            }
                                                            List<RouteLeg> listLegs13 = directionsRoute2.legs();
                                                            List<Closure> listClosures2 = (listLegs13 == null || (routeLeg = listLegs13.get(i2)) == null) ? null : routeLeg.closures();
                                                            if (listClosures2 == null) {
                                                                listClosures2 = listR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
                                                            }
                                                            if (listClosures.size() == listClosures2.size()) {
                                                                ArrayList<onViewAttachedToWindowlambda0> arrayListRemoteActionCompatParcelizer3 = onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) listClosures, (Iterable) listClosures2);
                                                                if (!arrayListRemoteActionCompatParcelizer3.isEmpty()) {
                                                                    for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2 : arrayListRemoteActionCompatParcelizer3) {
                                                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(Closure) onviewattachedtowindowlambda2.serializer, (Closure) onviewattachedtowindowlambda2.write}, getCieXyz.write())).booleanValue()) {
                                                                        }
                                                                    }
                                                                }
                                                                i2++;
                                                            }
                                                        } else {
                                                            SQLite.serializer();
                                                            throw null;
                                                        }
                                                    }
                                                }
                                                List<RouteLeg> listLegs14 = directionsRoute.legs();
                                                if (listLegs14 != null) {
                                                    List<RouteLeg> list = listLegs14;
                                                    ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                                                    for (RouteLeg routeLeg7 : list) {
                                                        MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
                                                        arrayList.add(onContentCardClicked.RatingCompat(MapboxRouteLineUtils.getRoadClassArray$ui_maps_release(routeLeg7.steps())));
                                                    }
                                                    listR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(arrayList);
                                                } else {
                                                    listR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = listR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
                                                }
                                                List<RouteLeg> listLegs15 = directionsRoute2.legs();
                                                if (listLegs15 != null) {
                                                    List<RouteLeg> list2 = listLegs15;
                                                    ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                                                    for (RouteLeg routeLeg8 : list2) {
                                                        MapboxRouteLineUtils mapboxRouteLineUtils2 = MapboxRouteLineUtils.INSTANCE;
                                                        arrayList2.add(onContentCardClicked.RatingCompat(MapboxRouteLineUtils.getRoadClassArray$ui_maps_release(routeLeg8.steps())));
                                                    }
                                                    listR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(arrayList2);
                                                }
                                                if (listR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.size() == listR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2.size()) {
                                                    ArrayList<onViewAttachedToWindowlambda0> arrayListRemoteActionCompatParcelizer4 = onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) listR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, (Iterable) listR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2);
                                                    if (!arrayListRemoteActionCompatParcelizer4.isEmpty()) {
                                                        for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda3 : arrayListRemoteActionCompatParcelizer4) {
                                                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) onviewattachedtowindowlambda3.serializer, (String) onviewattachedtowindowlambda3.write}, getCieXyz.write())).booleanValue()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return false;
                }
                return true;
            }
        });
    }
}
