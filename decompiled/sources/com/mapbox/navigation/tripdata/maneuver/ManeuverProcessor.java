package com.mapbox.navigation.tripdata.maneuver;

import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import com.mapbox.api.directions.v5.models.BannerComponents;
import com.mapbox.api.directions.v5.models.BannerInstructions;
import com.mapbox.api.directions.v5.models.BannerText;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.IntersectionLaneAccess;
import com.mapbox.api.directions.v5.models.IntersectionLanes;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.StepIntersection;
import com.mapbox.geojson.Point;
import com.mapbox.navigation.base.formatter.DistanceFormatter;
import com.mapbox.navigation.tripdata.maneuver.model.Component;
import com.mapbox.navigation.tripdata.maneuver.model.DelimiterComponentNode;
import com.mapbox.navigation.tripdata.maneuver.model.ExitComponentNode;
import com.mapbox.navigation.tripdata.maneuver.model.ExitNumberComponentNode;
import com.mapbox.navigation.tripdata.maneuver.model.Lane;
import com.mapbox.navigation.tripdata.maneuver.model.LaneIndicator;
import com.mapbox.navigation.tripdata.maneuver.model.LegIndexToManeuvers;
import com.mapbox.navigation.tripdata.maneuver.model.Maneuver;
import com.mapbox.navigation.tripdata.maneuver.model.PrimaryManeuver;
import com.mapbox.navigation.tripdata.maneuver.model.RoadShieldComponentNode;
import com.mapbox.navigation.tripdata.maneuver.model.SecondaryManeuver;
import com.mapbox.navigation.tripdata.maneuver.model.StepDistance;
import com.mapbox.navigation.tripdata.maneuver.model.StepIndexToManeuvers;
import com.mapbox.navigation.tripdata.maneuver.model.SubManeuver;
import com.mapbox.navigation.tripdata.maneuver.model.TextComponentNode;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.createFromParcel;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ManeuverProcessor {
    public static final ManeuverProcessor INSTANCE = new ManeuverProcessor();

    /* JADX WARN: Code duplicated, block: B:81:0x01bf  */
    public static void createAllManeuversForRoute(DirectionsRoute directionsRoute, ManeuverState maneuverState, DistanceFormatter distanceFormatter) {
        createFromParcel createfromparcel;
        Iterator it;
        Boolean boolValueOf;
        List<LegStep> list;
        Boolean boolValueOf2;
        PrimaryManeuver primaryManeuver;
        SecondaryManeuver secondaryManeuver;
        SubManeuver subManeuver;
        List<LegStep> list2;
        Lane lane;
        List<RouteLeg> listLegs = directionsRoute.legs();
        if (listLegs != null) {
            Iterator it2 = listLegs.iterator();
            int i = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                if (i < 0) {
                    SQLite.serializer();
                    throw null;
                }
                RouteLeg routeLeg = (RouteLeg) next;
                List<LegStep> listSteps = routeLeg != null ? routeLeg.steps() : null;
                if (listSteps != null) {
                    ArrayList arrayList = new ArrayList();
                    int i2 = 1;
                    int size = listSteps.size() - 1;
                    if (size >= 0) {
                        int i3 = 0;
                        while (true) {
                            List<StepIntersection> listIntersections = i3 == listSteps.size() - i2 ? listSteps.get(i3).intersections() : listSteps.get(i3 + 1).intersections();
                            List<BannerInstructions> listBannerInstructions = listSteps.get(i3).bannerInstructions();
                            if (listBannerInstructions == null || listIntersections == null) {
                                it = it2;
                                list = listSteps;
                                boolValueOf2 = null;
                            } else {
                                Point pointLocation = ((StepIntersection) onContentCardDismissed.read((List) listIntersections)).location();
                                pointLocation.getClass();
                                List<IntersectionLanes> listLanes = ((StepIntersection) onContentCardDismissed.read((List) listIntersections)).lanes();
                                ArrayList arrayList2 = new ArrayList();
                                String strDrivingSide = listSteps.get(i3).drivingSide();
                                strDrivingSide.getClass();
                                Iterator it3 = listBannerInstructions.iterator();
                                while (it3.hasNext()) {
                                    BannerInstructions bannerInstructions = (BannerInstructions) it3.next();
                                    bannerInstructions.getClass();
                                    BannerText bannerTextPrimary = bannerInstructions.primary();
                                    bannerTextPrimary.getClass();
                                    List<BannerComponents> listComponents = bannerTextPrimary.components();
                                    List<BannerComponents> list3 = listComponents;
                                    int i4 = (list3 == null || list3.isEmpty()) ? i2 : 0;
                                    instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
                                    if ((i4 ^ 1) == i2) {
                                        String strM = d$$ExternalSyntheticOutline0.m();
                                        String strText = bannerTextPrimary.text();
                                        strText.getClass();
                                        String strType = bannerTextPrimary.type();
                                        Double dDegrees = bannerTextPrimary.degrees();
                                        String strModifier = bannerTextPrimary.modifier();
                                        String strDrivingSide2 = bannerTextPrimary.drivingSide();
                                        primaryManeuver = new PrimaryManeuver(strM, strText, strType, dDegrees, strModifier, strDrivingSide2 == null ? strDrivingSide : strDrivingSide2, createComponents(listComponents));
                                    } else {
                                        primaryManeuver = new PrimaryManeuver(d$$ExternalSyntheticOutline0.m(), "", null, null, null, null, instance_delegatelambda0Var);
                                    }
                                    PrimaryManeuver primaryManeuver2 = primaryManeuver;
                                    BannerText bannerTextSecondary = bannerInstructions.secondary();
                                    List<BannerComponents> listComponents2 = bannerTextSecondary != null ? bannerTextSecondary.components() : null;
                                    List<BannerComponents> list4 = listComponents2;
                                    if ((((list4 == null || list4.isEmpty()) ? i2 : 0) ^ 1) == i2) {
                                        String strM2 = d$$ExternalSyntheticOutline0.m();
                                        String strText2 = bannerTextSecondary.text();
                                        strText2.getClass();
                                        String strType2 = bannerTextSecondary.type();
                                        Double dDegrees2 = bannerTextSecondary.degrees();
                                        String strModifier2 = bannerTextSecondary.modifier();
                                        String strDrivingSide3 = bannerTextSecondary.drivingSide();
                                        secondaryManeuver = new SecondaryManeuver(strM2, strText2, strType2, dDegrees2, strModifier2, strDrivingSide3 == null ? strDrivingSide : strDrivingSide3, createComponents(listComponents2));
                                    } else {
                                        secondaryManeuver = null;
                                    }
                                    BannerText bannerTextSub = bannerInstructions.sub();
                                    if (bannerTextSub == null || bannerTextSub.type() == null) {
                                        it2 = it2;
                                        subManeuver = null;
                                    } else {
                                        String strText3 = bannerTextSub.text();
                                        strText3.getClass();
                                        if (strText3.length() > 0) {
                                            List<BannerComponents> listComponents3 = bannerTextSub.components();
                                            List<BannerComponents> list5 = listComponents3;
                                            if ((((list5 == null || list5.isEmpty()) ? i2 : 0) ^ 1) == i2) {
                                                String strM3 = d$$ExternalSyntheticOutline0.m();
                                                String strText4 = bannerTextSub.text();
                                                strText4.getClass();
                                                String strType3 = bannerTextSub.type();
                                                Double dDegrees3 = bannerTextSub.degrees();
                                                String strModifier3 = bannerTextSub.modifier();
                                                String strDrivingSide4 = bannerTextSub.drivingSide();
                                                subManeuver = new SubManeuver(strM3, strText4, strType3, dDegrees3, strModifier3, strDrivingSide4 == null ? strDrivingSide : strDrivingSide4, createComponents(listComponents3));
                                            }
                                        } else {
                                            it2 = it2;
                                        }
                                        subManeuver = null;
                                    }
                                    if (listLanes != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (IntersectionLanes intersectionLanes : listLanes) {
                                            List<String> listIndications = intersectionLanes.indications();
                                            List<LegStep> list6 = listSteps;
                                            boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{intersectionLanes.active(), Boolean.TRUE}, getCieXyz.write())).booleanValue();
                                            String strModifier4 = (zBooleanValue && intersectionLanes.validIndication() == null) ? bannerInstructions.primary().modifier() : intersectionLanes.validIndication();
                                            IntersectionLaneAccess intersectionLaneAccessAccess = intersectionLanes.access();
                                            List<String> listDesignated = intersectionLaneAccessAccess != null ? intersectionLaneAccessAccess.designated() : null;
                                            List<String> list7 = listDesignated == null ? instance_delegatelambda0Var : listDesignated;
                                            List<String> list8 = listIndications;
                                            if (list8 != null && !list8.isEmpty()) {
                                                listIndications.getClass();
                                                arrayList3.add(new LaneIndicator(zBooleanValue, strDrivingSide, listIndications, strModifier4, list7));
                                            }
                                            listSteps = list6;
                                        }
                                        list2 = listSteps;
                                        lane = new Lane(arrayList3);
                                    } else {
                                        list2 = listSteps;
                                        lane = null;
                                    }
                                    List<IntersectionLanes> list9 = listLanes;
                                    ArrayList arrayList4 = arrayList2;
                                    arrayList4.add(new Maneuver(primaryManeuver2, new StepDistance(distanceFormatter, bannerInstructions.distanceAlongGeometry(), null), secondaryManeuver, subManeuver, lane, pointLocation));
                                    it3 = it3;
                                    arrayList2 = arrayList4;
                                    listLanes = list9;
                                    it2 = it2;
                                    listSteps = list2;
                                    i2 = 1;
                                }
                                it = it2;
                                list = listSteps;
                                boolValueOf2 = Boolean.valueOf(arrayList.add(new StepIndexToManeuvers(i3, arrayList2)));
                            }
                            if (boolValueOf2 == null) {
                                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("LegStep should have valid banner instructions");
                                return;
                            } else {
                                if (i3 == size) {
                                    break;
                                }
                                i3++;
                                it2 = it;
                                listSteps = list;
                                i2 = 1;
                            }
                        }
                    } else {
                        it = it2;
                    }
                    boolValueOf = Boolean.valueOf(maneuverState.allManeuvers.add(new LegIndexToManeuvers(i, arrayList)));
                } else {
                    it = it2;
                    boolValueOf = null;
                }
                if (boolValueOf == null) {
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("RouteLeg should have valid steps");
                    return;
                } else {
                    i++;
                    it2 = it;
                }
            }
            createfromparcel = createFromParcel.INSTANCE;
        } else {
            createfromparcel = null;
        }
        if (createfromparcel == null) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Route should have valid legs");
        } else if (maneuverState.allManeuvers.isEmpty()) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Maneuver list could not be created");
        }
    }

    public static ArrayList createComponents(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BannerComponents bannerComponents = (BannerComponents) it.next();
            Object[] objArr = {bannerComponents.type(), "exit"};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                String strText = bannerComponents.text();
                strText.getClass();
                arrayList.add(new Component("exit", new ExitComponentNode(strText)));
            } else {
                Object[] objArr2 = {bannerComponents.type(), "exit-number"};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    String strText2 = bannerComponents.text();
                    strText2.getClass();
                    arrayList.add(new Component("exit-number", new ExitNumberComponentNode(strText2)));
                } else {
                    Object[] objArr3 = {bannerComponents.type(), "text"};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                        String strText3 = bannerComponents.text();
                        strText3.getClass();
                        arrayList.add(new Component("text", new TextComponentNode(strText3, bannerComponents.abbreviation(), bannerComponents.abbreviationPriority())));
                    } else {
                        Object[] objArr4 = {bannerComponents.type(), "delimiter"};
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                            String strText4 = bannerComponents.text();
                            strText4.getClass();
                            arrayList.add(new Component("delimiter", new DelimiterComponentNode(strText4)));
                        } else {
                            Object[] objArr5 = {bannerComponents.type(), "icon"};
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
                                String strText5 = bannerComponents.text();
                                strText5.getClass();
                                arrayList.add(new Component("icon", new RoadShieldComponentNode(strText5, bannerComponents.imageBaseUrl(), bannerComponents.mapboxShield())));
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static void updateDistanceRemainingForCurrentManeuver(StepIndexToManeuvers stepIndexToManeuvers, int i, double d) {
        ArrayList arrayList = stepIndexToManeuvers.maneuverList;
        Maneuver maneuver = (Maneuver) arrayList.get(i);
        StepDistance stepDistance = maneuver.stepDistance;
        arrayList.set(i, new Maneuver(maneuver.primary, new StepDistance(stepDistance.distanceFormatter, stepDistance.totalDistance, Double.valueOf(d)), maneuver.secondary, maneuver.sub, maneuver.laneGuidance, maneuver.maneuverPoint));
    }
}
