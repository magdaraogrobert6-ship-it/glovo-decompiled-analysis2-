package com.mapbox.navigation.core.routerefresh;

import androidx.sqlite.SQLite;
import com.google.gson.GsonBuilder;
import com.huawei.hms.android.SystemUtils;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.Incident;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.roadrunner.domain.util.IsFixableByRetry;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.accessgetInstancedelegatecp;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class ExpiringDataRemover$removeExpiringDataFromRoute$directionsRouteBlock$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int $currentLegIndex;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List $routeLegs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpiringDataRemover$removeExpiringDataFromRoute$directionsRouteBlock$1(List list, int i, IsFixableByRetry isFixableByRetry) {
        super(1);
        this.$r8$classId = 0;
        this.$routeLegs = list;
        this.$currentLegIndex = i;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        LegAnnotation legAnnotationBuild;
        ArrayList arrayList;
        Date date;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i = this.$r8$classId;
        if (i != 0) {
            if (i == 1) {
                RouteLineViewOptionsData routeLineViewOptionsData = (RouteLineViewOptionsData) obj;
                routeLineViewOptionsData.getClass();
                MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
                return MapboxRouteLineUtils.getExpressionSubstitutingColorForInactiveLegs$ui_maps_release(0.0d, this.$routeLegs, 0, routeLineViewOptionsData.getRouteLineColorResources().getRouteCasingColor(), 0, this.$currentLegIndex);
            }
            if (i == 2) {
                RouteLineViewOptionsData routeLineViewOptionsData2 = (RouteLineViewOptionsData) obj;
                routeLineViewOptionsData2.getClass();
                MapboxRouteLineUtils mapboxRouteLineUtils2 = MapboxRouteLineUtils.INSTANCE;
                return MapboxRouteLineUtils.getExpressionSubstitutingColorForInactiveLegs$ui_maps_release(0.0d, this.$routeLegs, 0, routeLineViewOptionsData2.getRouteLineColorResources().getRouteDefaultColor(), 0, this.$currentLegIndex);
            }
            if (i != 3) {
                RouteLineViewOptionsData routeLineViewOptionsData3 = (RouteLineViewOptionsData) obj;
                routeLineViewOptionsData3.getClass();
                MapboxRouteLineUtils mapboxRouteLineUtils3 = MapboxRouteLineUtils.INSTANCE;
                return MapboxRouteLineUtils.getExpressionSubstitutingColorForInactiveLegs$ui_maps_release(0.0d, this.$routeLegs, 0, routeLineViewOptionsData3.getRouteLineColorResources().getRouteLineTraveledColor(), 0, this.$currentLegIndex);
            }
            RouteLineViewOptionsData routeLineViewOptionsData4 = (RouteLineViewOptionsData) obj;
            routeLineViewOptionsData4.getClass();
            MapboxRouteLineUtils mapboxRouteLineUtils4 = MapboxRouteLineUtils.INSTANCE;
            return MapboxRouteLineUtils.getExpressionSubstitutingColorForInactiveLegs$ui_maps_release(0.0d, this.$routeLegs, 0, routeLineViewOptionsData4.getRouteLineColorResources().getRouteLineTraveledCasingColor(), 0, this.$currentLegIndex);
        }
        DirectionsRoute directionsRoute = (DirectionsRoute) obj;
        directionsRoute.getClass();
        DirectionsRoute.Builder builder = directionsRoute.toBuilder();
        List list = this.$routeLegs;
        ArrayList arrayList4 = null;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
            int i2 = 0;
            for (Object obj2 : list2) {
                if (i2 < 0) {
                    SQLite.serializer();
                    throw null;
                }
                RouteLeg routeLegBuild = (RouteLeg) obj2;
                if (i2 >= this.$currentLegIndex) {
                    routeLegBuild.getClass();
                    LegAnnotation legAnnotationAnnotation = routeLegBuild.annotation();
                    RouteLeg.Builder builder2 = routeLegBuild.toBuilder();
                    if (legAnnotationAnnotation != null) {
                        LegAnnotation.Builder builder3 = legAnnotationAnnotation.toBuilder();
                        List<String> listCongestion = legAnnotationAnnotation.congestion();
                        if (listCongestion != null) {
                            List<String> list3 = listCongestion;
                            arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
                            for (String str : list3) {
                                arrayList2.add(SystemUtils.UNKNOWN);
                            }
                        } else {
                            arrayList2 = null;
                        }
                        LegAnnotation.Builder builderCongestion = builder3.congestion(arrayList2);
                        List<Integer> listCongestionNumeric = legAnnotationAnnotation.congestionNumeric();
                        if (listCongestionNumeric != null) {
                            List<Integer> list4 = listCongestionNumeric;
                            arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
                            for (Integer num : list4) {
                                arrayList3.add(null);
                            }
                        } else {
                            arrayList3 = null;
                        }
                        legAnnotationBuild = builderCongestion.congestionNumeric(arrayList3).build();
                    } else {
                        legAnnotationBuild = null;
                    }
                    RouteLeg.Builder builderAnnotation = builder2.annotation(legAnnotationBuild);
                    List<Incident> listIncidents = routeLegBuild.incidents();
                    if (listIncidents != null) {
                        arrayList = new ArrayList();
                        for (Object obj3 : listIncidents) {
                            String strEndTime = ((Incident) obj3).endTime();
                            if (strEndTime == null) {
                                date = null;
                            } else {
                                try {
                                    date = (Date) new GsonBuilder().create().getAdapter(Date.class).fromJson("\"" + strEndTime + '\"');
                                } catch (Throwable unused) {
                                    date = null;
                                }
                            }
                            if (date == null || date.compareTo(new Date()) > 0) {
                                arrayList.add(obj3);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    routeLegBuild = builderAnnotation.incidents(arrayList).build();
                    routeLegBuild.getClass();
                }
                arrayList5.add(routeLegBuild);
                i2++;
            }
            arrayList4 = arrayList5;
        }
        DirectionsRoute directionsRouteBuild = builder.legs(arrayList4).build();
        directionsRouteBuild.getClass();
        return directionsRouteBuild;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExpiringDataRemover$removeExpiringDataFromRoute$directionsRouteBlock$1(List list, int i, int i2) {
        super(1);
        this.$r8$classId = i2;
        this.$routeLegs = list;
        this.$currentLegIndex = i;
    }
}
