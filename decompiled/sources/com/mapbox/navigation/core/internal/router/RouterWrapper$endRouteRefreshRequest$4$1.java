package com.mapbox.navigation.core.internal.router;

import androidx.lifecycle.BlockRunner;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import coil3.network.okhttp.internal.CallsKt$await$2$2;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_common.zzlk;
import com.google.android.gms.internal.mlkit_vision_face.zzky;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.huawei.location.lite.common.util.SystemPropertiesUtil;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directions.v5.models.Closure;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.DirectionsWaypoint;
import com.mapbox.api.directions.v5.models.Incident;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.Notification;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directionsrefresh.v1.DirectionsRefreshAdapterFactory;
import com.mapbox.api.directionsrefresh.v1.models.AutoValue_DirectionsRefreshResponse;
import com.mapbox.api.directionsrefresh.v1.models.AutoValue_DirectionsRouteRefresh;
import com.mapbox.api.directionsrefresh.v1.models.AutoValue_RouteLegRefresh;
import com.mapbox.bindgen.DataRef;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.base.internal.CongestionNumericOverride;
import com.mapbox.navigation.base.internal.RouteRefreshRequestData;
import com.mapbox.navigation.base.internal.route.AnnotationsRefresher;
import com.mapbox.navigation.base.internal.route.AnnotationsRefresher$getRefreshedAnnotations$unrecognizedProperties$1;
import com.mapbox.navigation.base.internal.route.ClosuresRefresher;
import com.mapbox.navigation.base.internal.route.IncidentsRefresher;
import com.mapbox.navigation.base.internal.route.operations.JavaRouteOperationsKt;
import com.mapbox.navigation.base.internal.route.operations.OptionallyRefreshedData;
import com.mapbox.navigation.base.internal.route.operations.RouteUpdate;
import com.mapbox.navigation.base.internal.route.parsing.models.DirectionsParsedRouteData;
import com.mapbox.navigation.base.internal.route.parsing.models.directions.DirectionsRouteModelParsingResult;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.route.RouteRefreshMetadata;
import com.mapbox.navigation.base.utils.DecodeUtils;
import com.mapbox.navigation.core.routerefresh.RouteRefresher$RouteRefreshResult$Success;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigation.utils.internal.ThreadController;
import com.mapbox.navigator.RouteRefreshOptions;
import com.sentiance.okio.c$b;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ItemTouchHelperAdapter;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.ensureSubscribedToInAppMessageEvents;
import o.getContentViewGroupParentLayout;
import o.instance_delegatelambda0;
import o.isItemDismissable;
import o.onAnimationEndlambda1;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes2.dex */
public final class RouterWrapper$endRouteRefreshRequest$4$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ x $callback;
    public final /* synthetic */ DataRef $dataRef;
    public final /* synthetic */ Long $id;
    public final /* synthetic */ RouteRefreshOptions $refreshOptions;
    public final /* synthetic */ long $responseTimeElapsedSeconds;
    public final /* synthetic */ NavigationRoute $route;
    public final /* synthetic */ RouteRefreshRequestData $routeRefreshRequestData;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ BlockRunner this$0;

    /* JADX INFO: renamed from: com.mapbox.navigation.core.internal.router.RouterWrapper$endRouteRefreshRequest$4$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public final /* synthetic */ DataRef $dataRef;
        public final /* synthetic */ RouteRefreshOptions $refreshOptions;
        public final /* synthetic */ long $responseTimeElapsedSeconds;
        public final /* synthetic */ NavigationRoute $route;
        public final /* synthetic */ RouteRefreshRequestData $routeRefreshRequestData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NavigationRoute navigationRoute, DataRef dataRef, RouteRefreshOptions routeRefreshOptions, RouteRefreshRequestData routeRefreshRequestData, long j, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$route = navigationRoute;
            this.$dataRef = dataRef;
            this.$refreshOptions = routeRefreshOptions;
            this.$routeRefreshRequestData = routeRefreshRequestData;
            this.$responseTimeElapsedSeconds = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            return new AnonymousClass2(this.$route, this.$dataRef, this.$refreshOptions, this.$routeRefreshRequestData, this.$responseTimeElapsedSeconds, shortNewsContentCardView);
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0261  */
        /* JADX WARN: Code duplicated, block: B:109:0x0274  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object isitemdismissable;
            NavigationRoute navigationRoute;
            int i;
            ArrayList arrayList;
            String str;
            DirectionsParsedRouteData directionsParsedRouteData;
            Integer num;
            CongestionNumericOverride congestionNumericOverride;
            DirectionsRoute directionsRoute;
            List list;
            ArrayList arrayList2;
            Integer num2;
            Map<String, JsonElement> unrecognizedJsonProperties;
            JsonElement jsonElement;
            JsonObject asJsonObject;
            JsonElement jsonElement2;
            LegAnnotation legAnnotation;
            int size;
            Integer numValueOf;
            Integer numValueOf2;
            LegAnnotation legAnnotationBuild;
            int i2;
            List list2;
            List list3;
            List list4;
            ArrayList arrayListFilterNotificationsByGeometryRange;
            Double dDuration;
            String str2;
            DirectionsRoute directionsRoute2;
            RouteLeg routeLegBuild;
            List<Double> listDuration;
            List<Double> listDuration2;
            JsonElement jsonElement3;
            JsonObject jsonObject;
            DirectionsWaypoint directionsWaypointFromJson;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            DataRef dataRef = this.$dataRef;
            dataRef.getClass();
            int legIndex = this.$refreshOptions.getLegIndex();
            RouteRefreshRequestData routeRefreshRequestData = this.$routeRefreshRequestData;
            Integer num3 = routeRefreshRequestData.legGeometryIndex;
            int iIntValue = num3 != null ? num3.intValue() : 0;
            HashMap map = routeRefreshRequestData.experimentalProperties;
            NavigationRoute navigationRoute2 = this.$route;
            navigationRoute2.getClass();
            x xVar = navigationRoute2.operations;
            String str3 = (String) xVar.IconCompatParcelizer;
            CongestionNumericOverride congestionNumericOverride2 = (CongestionNumericOverride) xVar.RemoteActionCompatParcelizer;
            DirectionsParsedRouteData directionsParsedRouteData2 = (DirectionsParsedRouteData) xVar.read;
            List list5 = directionsParsedRouteData2.routesWaypoint;
            DirectionsRoute directionsRoute3 = directionsParsedRouteData2.route;
            dataRef.getClass();
            int i3 = JavaRouteOperationsKt.$r8$clinit;
            try {
                ByteBuffer buffer = dataRef.getBuffer();
                buffer.getClass();
                InputStreamReader inputStreamReader = new InputStreamReader(new c$b(buffer), ensureSubscribedToInAppMessageEvents.write);
                try {
                    isitemdismissable = ((AutoValue_DirectionsRefreshResponse) new GsonBuilder().registerTypeAdapterFactory(DirectionsRefreshAdapterFactory.create()).registerTypeAdapterFactory(DirectionsAdapterFactory.create()).create().fromJson((Reader) inputStreamReader, AutoValue_DirectionsRefreshResponse.class)).route;
                    inputStreamReader.close();
                    if (isitemdismissable == null) {
                        throw new IllegalStateException("no route refresh returned");
                    }
                    boolean z = isitemdismissable instanceof isItemDismissable;
                    String str4 = "JAVA-ROUTES-OPERATIONS";
                    if (!z) {
                        LoggerProviderKt.logD("Parsed route refresh response for route(" + str3 + ')', "JAVA-ROUTES-OPERATIONS");
                    }
                    if (onItemDismiss.serializer(isitemdismissable) != null) {
                        LoggerProviderKt.logD("Failed to parse route refresh response for route(" + str3 + ')', "JAVA-ROUTES-OPERATIONS");
                    }
                    if (z) {
                        map = map;
                        navigationRoute = navigationRoute2;
                    } else {
                        AutoValue_DirectionsRouteRefresh autoValue_DirectionsRouteRefresh = (AutoValue_DirectionsRouteRefresh) isitemdismissable;
                        Map map2 = autoValue_DirectionsRouteRefresh.unrecognized;
                        HashMap mapFromSerializableProperties = zzky.fromSerializableProperties(map2);
                        JsonElement jsonElement4 = mapFromSerializableProperties != null ? (JsonElement) mapFromSerializableProperties.get("waypoints") : null;
                        if (jsonElement4 == null || !jsonElement4.isJsonArray()) {
                            i = iIntValue;
                            arrayList = null;
                        } else {
                            JsonArray asJsonArray = jsonElement4.getAsJsonArray();
                            asJsonArray.getClass();
                            arrayList = new ArrayList(accessgetInstancedelegatecp.write(asJsonArray, 10));
                            for (JsonElement jsonElement5 : asJsonArray) {
                                jsonElement5.getClass();
                                if (jsonElement5.isJsonObject()) {
                                    jsonObject = jsonElement5.getAsJsonObject();
                                    jsonObject.getClass();
                                } else {
                                    jsonObject = new JsonObject();
                                }
                                if (jsonObject.size() != 0) {
                                    try {
                                        directionsWaypointFromJson = DirectionsWaypoint.fromJson(jsonElement5.toString());
                                        iIntValue = iIntValue;
                                    } catch (Throwable th) {
                                        LoggerProviderKt.logE("Error while parsing waypoints: " + th.getLocalizedMessage(), null);
                                        directionsWaypointFromJson = null;
                                    }
                                    arrayList.add(directionsWaypointFromJson);
                                    iIntValue = iIntValue;
                                }
                                directionsWaypointFromJson = null;
                                arrayList.add(directionsWaypointFromJson);
                                iIntValue = iIntValue;
                            }
                            i = iIntValue;
                        }
                        HashMap mapFromSerializableProperties2 = zzky.fromSerializableProperties(map2);
                        String str5 = "refresh_ttl";
                        Integer numValueOf3 = (mapFromSerializableProperties2 == null || (jsonElement3 = (JsonElement) mapFromSerializableProperties2.get("refresh_ttl")) == null) ? null : Integer.valueOf(jsonElement3.getAsInt());
                        List<RouteLeg> listLegs = directionsRoute3.legs();
                        double asDouble = 0.0d;
                        if (listLegs != null) {
                            List<RouteLeg> list6 = listLegs;
                            ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list6, 10));
                            Iterator it = list6.iterator();
                            int i4 = 0;
                            while (it.hasNext()) {
                                Object next = it.next();
                                if (i4 < 0) {
                                    SQLite.serializer();
                                    throw null;
                                }
                                RouteLeg routeLeg = (RouteLeg) next;
                                if (i4 < legIndex) {
                                    legIndex = legIndex;
                                    str5 = str5;
                                    autoValue_DirectionsRouteRefresh = autoValue_DirectionsRouteRefresh;
                                    navigationRoute2 = navigationRoute2;
                                    numValueOf3 = numValueOf3;
                                    congestionNumericOverride2 = congestionNumericOverride2;
                                    list5 = list5;
                                    directionsRoute2 = directionsRoute3;
                                    arrayList = arrayList;
                                    str2 = str4;
                                    routeLegBuild = routeLeg;
                                    i2 = i4;
                                } else {
                                    List list7 = autoValue_DirectionsRouteRefresh.legs;
                                    if (list7 != null) {
                                        List list8 = list7;
                                        ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(list8, 10));
                                        Iterator it2 = list8.iterator();
                                        while (it2.hasNext()) {
                                            arrayList4.add(((AutoValue_RouteLegRefresh) it2.next()).annotation);
                                        }
                                        legAnnotation = (LegAnnotation) onContentCardDismissed.read(i4, arrayList4);
                                    } else {
                                        legAnnotation = null;
                                    }
                                    int i5 = i4 == legIndex ? i : 0;
                                    try {
                                        size = (SystemPropertiesUtil.size(legAnnotation) + i5) - 1;
                                    } catch (IllegalArgumentException e) {
                                        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                                            String message = e.getMessage();
                                            if (message == null) {
                                                message = "Unknown error";
                                            }
                                            LoggerProviderKt.logE(message, str4);
                                        }
                                        size = i5;
                                    }
                                    LegAnnotation legAnnotationAnnotation = routeLeg.annotation();
                                    if (congestionNumericOverride2 == null) {
                                        numValueOf = null;
                                    } else {
                                        CongestionNumericOverride congestionNumericOverride3 = congestionNumericOverride2.legIndex == i4 ? congestionNumericOverride2 : null;
                                        if (congestionNumericOverride3 != null) {
                                            numValueOf = Integer.valueOf(congestionNumericOverride3.startIndex);
                                        } else {
                                            numValueOf = null;
                                        }
                                    }
                                    if (congestionNumericOverride2 == null) {
                                        numValueOf2 = null;
                                    } else {
                                        CongestionNumericOverride congestionNumericOverride4 = congestionNumericOverride2.legIndex == i4 ? congestionNumericOverride2 : null;
                                        if (congestionNumericOverride4 != null) {
                                            numValueOf2 = Integer.valueOf(congestionNumericOverride4.length);
                                        } else {
                                            numValueOf2 = null;
                                        }
                                    }
                                    if (legAnnotationAnnotation == null) {
                                        legAnnotationBuild = null;
                                    } else {
                                        LegAnnotation legAnnotation2 = legAnnotation;
                                        int i6 = i5;
                                        ArrayList arrayListMergeAnnotationProperty = AnnotationsRefresher.mergeAnnotationProperty(legAnnotationAnnotation, legAnnotation2, i6, numValueOf2 != null ? numValueOf2.intValue() : 0, numValueOf != null ? numValueOf.intValue() : 0, ClosuresRefresher.AnonymousClass1.INSTANCE$2);
                                        ArrayList arrayListMergeAnnotationProperty2 = AnnotationsRefresher.mergeAnnotationProperty(legAnnotationAnnotation, legAnnotation2, i6, 0, 0, ClosuresRefresher.AnonymousClass1.INSTANCE$1);
                                        ArrayList arrayListMergeAnnotationProperty3 = AnnotationsRefresher.mergeAnnotationProperty(legAnnotationAnnotation, legAnnotation2, i6, 0, 0, ClosuresRefresher.AnonymousClass1.INSTANCE$4);
                                        ArrayList arrayListMergeAnnotationProperty4 = AnnotationsRefresher.mergeAnnotationProperty(legAnnotationAnnotation, legAnnotation2, i6, 0, 0, ClosuresRefresher.AnonymousClass1.INSTANCE$5);
                                        ArrayList arrayListMergeAnnotationProperty5 = AnnotationsRefresher.mergeAnnotationProperty(legAnnotationAnnotation, legAnnotation2, i6, 0, 0, ClosuresRefresher.AnonymousClass1.INSTANCE$8);
                                        ArrayList arrayListMergeAnnotationProperty6 = AnnotationsRefresher.mergeAnnotationProperty(legAnnotationAnnotation, legAnnotation2, i6, 0, 0, ClosuresRefresher.AnonymousClass1.INSTANCE$7);
                                        ArrayList arrayListMergeAnnotationProperty7 = AnnotationsRefresher.mergeAnnotationProperty(legAnnotationAnnotation, legAnnotation2, i6, 0, 0, ClosuresRefresher.AnonymousClass1.INSTANCE$6);
                                        ArrayList arrayListMergeAnnotationProperty8 = AnnotationsRefresher.mergeAnnotationProperty(legAnnotationAnnotation, legAnnotation2, i6, 0, 0, ClosuresRefresher.AnonymousClass1.INSTANCE$3);
                                        Set<String> unrecognizedPropertiesNames = legAnnotationAnnotation.getUnrecognizedPropertiesNames();
                                        unrecognizedPropertiesNames.getClass();
                                        Set<String> set = unrecognizedPropertiesNames;
                                        Set<String> unrecognizedPropertiesNames2 = legAnnotation != null ? legAnnotation.getUnrecognizedPropertiesNames() : null;
                                        Set setSerializer = onContentCardDismissed.serializer(set, unrecognizedPropertiesNames2 == null ? ItemTouchHelperAdapter.serializer : unrecognizedPropertiesNames2);
                                        AnnotationsRefresher$getRefreshedAnnotations$unrecognizedProperties$1 annotationsRefresher$getRefreshedAnnotations$unrecognizedProperties$1 = new AnnotationsRefresher$getRefreshedAnnotations$unrecognizedProperties$1(i5, 0, legAnnotationAnnotation, legAnnotation);
                                        HashMap map3 = new HashMap();
                                        for (Object obj2 : setSerializer) {
                                            Object objInvoke = annotationsRefresher$getRefreshedAnnotations$unrecognizedProperties$1.invoke(obj2);
                                            if (objInvoke != null) {
                                                map3.put(obj2, objInvoke);
                                            }
                                        }
                                        if (map3.isEmpty()) {
                                            map3 = null;
                                        }
                                        legAnnotationBuild = LegAnnotation.builder().unrecognizedJsonProperties(map3).congestion(arrayListMergeAnnotationProperty2).congestionNumeric(arrayListMergeAnnotationProperty).maxspeed(arrayListMergeAnnotationProperty6).distance(arrayListMergeAnnotationProperty3).duration(arrayListMergeAnnotationProperty4).speed(arrayListMergeAnnotationProperty5).freeflowSpeed(arrayListMergeAnnotationProperty7).currentSpeed(arrayListMergeAnnotationProperty8).build();
                                    }
                                    IncidentsRefresher incidentsRefresher = IncidentsRefresher.INSTANCE;
                                    List<Incident> listIncidents = routeLeg.incidents();
                                    if (list7 != null) {
                                        List list9 = list7;
                                        ArrayList arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(list9, 10));
                                        Iterator it3 = list9.iterator();
                                        while (it3.hasNext()) {
                                            arrayList5.add(((AutoValue_RouteLegRefresh) it3.next()).incidents);
                                        }
                                        i2 = i4;
                                        list2 = (List) onContentCardDismissed.read(i2, arrayList5);
                                    } else {
                                        i2 = i4;
                                        list2 = null;
                                    }
                                    ArrayList refreshedRoadObjects = incidentsRefresher.getRefreshedRoadObjects(i5, size, listIncidents, list2);
                                    ClosuresRefresher closuresRefresher = ClosuresRefresher.INSTANCE;
                                    List<Closure> listClosures = routeLeg.closures();
                                    if (list7 != null) {
                                        List list10 = list7;
                                        ArrayList arrayList6 = new ArrayList(accessgetInstancedelegatecp.write(list10, 10));
                                        Iterator it4 = list10.iterator();
                                        while (it4.hasNext()) {
                                            arrayList6.add(((AutoValue_RouteLegRefresh) it4.next()).closures);
                                        }
                                        list3 = (List) onContentCardDismissed.read(i2, arrayList6);
                                    } else {
                                        list3 = null;
                                    }
                                    ArrayList refreshedRoadObjects2 = closuresRefresher.getRefreshedRoadObjects(i5, size, listClosures, list3);
                                    List<Notification> listNotifications = routeLeg.notifications();
                                    if (list7 != null) {
                                        List list11 = list7;
                                        ArrayList arrayList7 = new ArrayList(accessgetInstancedelegatecp.write(list11, 10));
                                        Iterator it5 = list11.iterator();
                                        while (it5.hasNext()) {
                                            arrayList7.add(((AutoValue_RouteLegRefresh) it5.next()).notifications);
                                        }
                                        list4 = (List) onContentCardDismissed.read(i2, arrayList7);
                                    } else {
                                        list4 = null;
                                    }
                                    if (listNotifications == null && list4 == null) {
                                        arrayListFilterNotificationsByGeometryRange = null;
                                    } else if (listNotifications == null) {
                                        if (list4 == null) {
                                            list4 = instance_delegatelambda0.write;
                                        }
                                        arrayListFilterNotificationsByGeometryRange = zzlk.adjustNotificationIndices(i5, list4);
                                    } else {
                                        arrayListFilterNotificationsByGeometryRange = list4 == null ? zzlk.filterNotificationsByGeometryRange(listNotifications, i5, size) : onContentCardDismissed.IconCompatParcelizer(zzlk.adjustNotificationIndices(i5, list4), zzlk.filterNotificationsByGeometryRange(listNotifications, i5, size));
                                    }
                                    if (arrayListFilterNotificationsByGeometryRange == null || arrayListFilterNotificationsByGeometryRange.isEmpty()) {
                                        arrayListFilterNotificationsByGeometryRange = null;
                                    }
                                    RouteLeg.Builder builder = routeLeg.toBuilder();
                                    if (legAnnotationBuild == null || (listDuration2 = legAnnotationBuild.duration()) == null) {
                                        dDuration = routeLeg.duration();
                                    } else {
                                        double dDoubleValue = 0.0d;
                                        for (Double d : listDuration2) {
                                            d.getClass();
                                            dDoubleValue += d.doubleValue();
                                        }
                                        dDuration = Double.valueOf(dDoubleValue);
                                    }
                                    RouteLeg.Builder builderNotifications = builder.duration(dDuration).annotation(legAnnotationBuild).incidents(refreshedRoadObjects).closures(refreshedRoadObjects2).notifications(arrayListFilterNotificationsByGeometryRange);
                                    List<LegStep> listSteps = routeLeg.steps();
                                    if (listSteps == null) {
                                        str2 = str4;
                                        directionsRoute2 = directionsRoute3;
                                        listSteps = null;
                                    } else if (legAnnotationBuild == null || (listDuration = legAnnotationBuild.duration()) == null) {
                                        str2 = str4;
                                        directionsRoute2 = directionsRoute3;
                                    } else {
                                        ArrayList arrayList8 = new ArrayList();
                                        Iterator it6 = listSteps.iterator();
                                        int i7 = 0;
                                        int i8 = 0;
                                        while (true) {
                                            if (!it6.hasNext()) {
                                                str2 = str4;
                                                directionsRoute2 = directionsRoute3;
                                                listSteps = arrayList8;
                                                break;
                                            }
                                            Object next2 = it6.next();
                                            if (i7 < 0) {
                                                SQLite.serializer();
                                                throw null;
                                            }
                                            LegStep legStep = (LegStep) next2;
                                            directionsRoute2 = directionsRoute3;
                                            int size2 = DecodeUtils.stepGeometryToPoints(directionsRoute2, legStep).size();
                                            if (size2 < 2) {
                                                str2 = str4;
                                                LoggerProviderKt.logE("step at " + i7 + " has less than 2 points, unable to update duration", str2);
                                                break;
                                            }
                                            int i9 = size2 - 1;
                                            LegStep legStepBuild = legStep.toBuilder().duration(onContentCardDismissed.MediaSessionCompatToken(onContentCardDismissed.read(onContentCardDismissed.serializer(listDuration, i8), i9))).build();
                                            legStepBuild.getClass();
                                            arrayList8.add(legStepBuild);
                                            i8 += i9;
                                            i7++;
                                            directionsRoute3 = directionsRoute2;
                                        }
                                    }
                                    routeLegBuild = builderNotifications.steps(listSteps).build();
                                }
                                arrayList3.add(routeLegBuild);
                                i4 = i2 + 1;
                                directionsRoute3 = directionsRoute2;
                                str4 = str2;
                                it = it;
                                autoValue_DirectionsRouteRefresh = autoValue_DirectionsRouteRefresh;
                                navigationRoute2 = navigationRoute2;
                                legIndex = legIndex;
                                directionsParsedRouteData2 = directionsParsedRouteData2;
                                congestionNumericOverride2 = congestionNumericOverride2;
                                str5 = str5;
                                numValueOf3 = numValueOf3;
                                list5 = list5;
                                arrayList = arrayList;
                                arrayList3 = arrayList3;
                            }
                            str = str5;
                            navigationRoute = navigationRoute2;
                            directionsParsedRouteData = directionsParsedRouteData2;
                            num = numValueOf3;
                            congestionNumericOverride = congestionNumericOverride2;
                            List list12 = list5;
                            directionsRoute = directionsRoute3;
                            arrayList2 = arrayList3;
                            list = list12;
                        } else {
                            str = "refresh_ttl";
                            navigationRoute = navigationRoute2;
                            directionsParsedRouteData = directionsParsedRouteData2;
                            num = numValueOf3;
                            congestionNumericOverride = congestionNumericOverride2;
                            directionsRoute = directionsRoute3;
                            list = list5;
                            arrayList2 = null;
                        }
                        List<DirectionsWaypoint> listAccess$buildNewWaypoints = JavaRouteOperationsKt.access$buildNewWaypoints(arrayList, list);
                        DirectionsRoute.Builder builderWaypoints = directionsRoute.toBuilder().legs(arrayList2).waypoints(JavaRouteOperationsKt.access$buildNewWaypoints(arrayList, directionsRoute.waypoints()));
                        builderWaypoints.getClass();
                        if (arrayList2 != null) {
                            Iterator<RouteLeg> it7 = arrayList2.iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    if (listAccess$buildNewWaypoints != null) {
                                        for (DirectionsWaypoint directionsWaypoint : listAccess$buildNewWaypoints) {
                                            if (directionsWaypoint != null && (unrecognizedJsonProperties = directionsWaypoint.getUnrecognizedJsonProperties()) != null && (jsonElement = unrecognizedJsonProperties.get("metadata")) != null && (asJsonObject = jsonElement.getAsJsonObject()) != null && (jsonElement2 = asJsonObject.get("charge_time")) != null) {
                                                asDouble = jsonElement2.getAsDouble() + asDouble;
                                            }
                                        }
                                    }
                                    builderWaypoints.duration(Double.valueOf(asDouble));
                                    break;
                                }
                                Double dDuration2 = it7.next().duration();
                                if (dDuration2 == null) {
                                    break;
                                }
                                asDouble = dDuration2.doubleValue() + asDouble;
                            }
                        }
                        Map<String, JsonElement> unrecognizedJsonProperties2 = directionsRoute.getUnrecognizedJsonProperties();
                        if (num == null) {
                            if (unrecognizedJsonProperties2 != null && !unrecognizedJsonProperties2.isEmpty()) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap(unrecognizedJsonProperties2);
                                linkedHashMap.remove(str);
                                DirectionsRoute.Builder builderUnrecognizedJsonProperties = builderWaypoints.unrecognizedJsonProperties(linkedHashMap);
                                builderUnrecognizedJsonProperties.getClass();
                                builderWaypoints = builderUnrecognizedJsonProperties;
                            }
                            num2 = num;
                        } else {
                            String str6 = str;
                            if (unrecognizedJsonProperties2 == null) {
                                unrecognizedJsonProperties2 = SimpleItemTouchHelperCallback.serializer;
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(unrecognizedJsonProperties2);
                            num2 = num;
                            linkedHashMap2.put(str6, new JsonPrimitive(num2));
                            DirectionsRoute.Builder builderUnrecognizedJsonProperties2 = builderWaypoints.unrecognizedJsonProperties(linkedHashMap2);
                            builderUnrecognizedJsonProperties2.getClass();
                            builderWaypoints = builderUnrecognizedJsonProperties2;
                        }
                        DirectionsRoute directionsRouteBuild = builderWaypoints.build();
                        directionsRouteBuild.getClass();
                        List listAccess$buildNewWaypoints2 = JavaRouteOperationsKt.access$buildNewWaypoints(arrayList, list);
                        OptionallyRefreshedData updated = num2 != null ? new OptionallyRefreshedData.Updated(Long.valueOf(((long) num2.intValue()) + this.$responseTimeElapsedSeconds)) : new OptionallyRefreshedData.NoUpdates();
                        DirectionsParsedRouteData directionsParsedRouteDataCopy$default = DirectionsParsedRouteData.copy$default(directionsParsedRouteData, directionsRouteBuild, listAccess$buildNewWaypoints2);
                        isitemdismissable = new RouteUpdate(new DirectionsRouteModelParsingResult(directionsParsedRouteDataCopy$default, new x(directionsParsedRouteDataCopy$default, congestionNumericOverride)), new RouteRefreshMetadata(null, true), updated, new OptionallyRefreshedData.NoUpdates());
                    }
                    if (!(isitemdismissable instanceof isItemDismissable)) {
                        isitemdismissable = navigationRoute.refresh((RouteUpdate) isitemdismissable, map);
                    }
                    return new onItemDismiss(isitemdismissable);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{inputStreamReader, th2}, sourceInformationContextOfdefault.read());
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                isitemdismissable = new isItemDismissable(th4);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterWrapper$endRouteRefreshRequest$4$1(Long l, BlockRunner blockRunner, NavigationRoute navigationRoute, DataRef dataRef, RouteRefreshOptions routeRefreshOptions, RouteRefreshRequestData routeRefreshRequestData, long j, x xVar, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.$id = l;
        this.this$0 = blockRunner;
        this.$route = navigationRoute;
        this.$dataRef = dataRef;
        this.$refreshOptions = routeRefreshOptions;
        this.$routeRefreshRequestData = routeRefreshRequestData;
        this.$responseTimeElapsedSeconds = j;
        this.$callback = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        RouterWrapper$endRouteRefreshRequest$4$1 routerWrapper$endRouteRefreshRequest$4$1 = new RouterWrapper$endRouteRefreshRequest$4$1(this.$id, this.this$0, this.$route, this.$dataRef, this.$refreshOptions, this.$routeRefreshRequestData, this.$responseTimeElapsedSeconds, this.$callback, shortNewsContentCardView);
        routerWrapper$endRouteRefreshRequest$4$1.L$0 = obj;
        return routerWrapper$endRouteRefreshRequest$4$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((RouterWrapper$endRouteRefreshRequest$4$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.this$0.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.L$0;
            Long l = this.$id;
            if (l != null) {
                if (linkedHashMap.get(l) == null) {
                    if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                        LoggerProviderKt.logI("Refresh request " + l + " has already been processed", null);
                    }
                    return createfromparcel;
                }
                OngoingRequest ongoingRequest = (OngoingRequest) linkedHashMap.get(l);
                if (ongoingRequest != null) {
                    ongoingRequest.parsingJob = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) getcontentviewgroupparentlayout.getCoroutineContext().get(onAnimationEndlambda1.RemoteActionCompatParcelizer);
                }
            }
            DefaultScheduler defaultScheduler = ThreadController.DefaultDispatcher;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$route, this.$dataRef, this.$refreshOptions, this.$routeRefreshRequestData, this.$responseTimeElapsedSeconds, null);
            this.label = 1;
            obj = BuildersKt.withContext(defaultScheduler, anonymousClass2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
        Throwable thSerializer = onItemDismiss.serializer(obj2);
        x xVar = this.$callback;
        DataRef dataRef = this.$dataRef;
        if (thSerializer != null) {
            xVar.onFailure(new NavigationRouterRefreshError("failed for response: " + dataRef, thSerializer, null, 12));
            return createfromparcel;
        }
        NavigationRoute navigationRoute = (NavigationRoute) obj2;
        dataRef.getClass();
        navigationRoute.getClass();
        dataRef.getClass();
        Long l2 = (Long) xVar.read;
        if (l2 == null || ((LinkedHashMap) ((BlockRunner) xVar.IconCompatParcelizer).write).remove(l2) != null) {
            ((CallsKt$await$2$2) xVar.RemoteActionCompatParcelizer).serializer.resumeWith(new RouteRefresher$RouteRefreshResult$Success(navigationRoute, dataRef));
        }
        return createfromparcel;
    }
}
