package com.mapbox.navigation.base.internal.factory;

import com.adjust.sdk.Constants;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.android.SystemUtils;
import com.mapbox.navigation.base.trip.model.eh.EHorizonMapperKt$WhenMappings;
import com.mapbox.navigation.base.trip.model.roadobject.RoadObject;
import com.mapbox.navigation.base.trip.model.roadobject.RoadObjectMapperKt$WhenMappings;
import com.mapbox.navigation.base.trip.model.roadobject.UpcomingRoadObject;
import com.mapbox.navigation.base.trip.model.roadobject.border.CountryBorderCrossing;
import com.mapbox.navigation.base.trip.model.roadobject.border.CountryBorderCrossingAdminInfo;
import com.mapbox.navigation.base.trip.model.roadobject.border.CountryBorderCrossingInfo;
import com.mapbox.navigation.base.trip.model.roadobject.bridge.Bridge;
import com.mapbox.navigation.base.trip.model.roadobject.ic.Interchange;
import com.mapbox.navigation.base.trip.model.roadobject.incident.Incident;
import com.mapbox.navigation.base.trip.model.roadobject.jct.Junction;
import com.mapbox.navigation.base.trip.model.roadobject.merge.MergingArea;
import com.mapbox.navigation.base.trip.model.roadobject.railwaycrossing.RailwayCrossing;
import com.mapbox.navigation.base.trip.model.roadobject.railwaycrossing.RailwayCrossingInfo;
import com.mapbox.navigation.base.trip.model.roadobject.reststop.RestStop;
import com.mapbox.navigation.base.trip.model.roadobject.tollcollection.TollCollection;
import com.mapbox.navigation.base.trip.model.roadobject.tunnel.Tunnel;
import com.mapbox.navigator.AdminInfo;
import com.mapbox.navigator.Amenity;
import com.mapbox.navigator.AmenityType;
import com.mapbox.navigator.IncidentCongestion;
import com.mapbox.navigator.IncidentImpact;
import com.mapbox.navigator.IncidentInfo;
import com.mapbox.navigator.IncidentType;
import com.mapbox.navigator.LocalizedString;
import com.mapbox.navigator.MergingAreaInfo;
import com.mapbox.navigator.RoadObjectProvider;
import com.mapbox.navigator.RoadObjectType;
import com.mapbox.navigator.ServiceAreaInfo;
import com.mapbox.navigator.TollCollectionInfo;
import com.mapbox.navigator.TunnelInfo;
import com.mapbox.navigator.UpcomingRouteAlertUpdate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o.accessgetInstancedelegatecp;
import o.onMove;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RoadObjectFactory {
    public static final RoadObjectType[] SUPPORTED_ROAD_OBJECTS = {RoadObjectType.INCIDENT, RoadObjectType.TOLL_COLLECTION_POINT, RoadObjectType.BORDER_CROSSING, RoadObjectType.TUNNEL, RoadObjectType.RESTRICTED_AREA, RoadObjectType.SERVICE_AREA, RoadObjectType.BRIDGE, RoadObjectType.CUSTOM, RoadObjectType.RAILWAY_CROSSING, RoadObjectType.IC, RoadObjectType.JCT, RoadObjectType.MERGING_AREA};

    public static ArrayList getUpdatedObjectsAhead(List list, List list2) {
        list.getClass();
        List<UpcomingRouteAlertUpdate> list3 = list2;
        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(list3, 10));
        if (iRemoteActionCompatParcelizer < 16) {
            iRemoteActionCompatParcelizer = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
        for (UpcomingRouteAlertUpdate upcomingRouteAlertUpdate : list3) {
            linkedHashMap.put(upcomingRouteAlertUpdate.getId(), Double.valueOf(upcomingRouteAlertUpdate.getDistanceToStart()));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UpcomingRoadObject upcomingRoadObject = (UpcomingRoadObject) it.next();
            if (linkedHashMap.keySet().contains(upcomingRoadObject.roadObject.id)) {
                RoadObject roadObject = upcomingRoadObject.roadObject;
                arrayList.add(new UpcomingRoadObject(roadObject, (Double) linkedHashMap.get(roadObject.id)));
            }
        }
        return arrayList;
    }

    public static RoadObject buildRoadObject(com.mapbox.navigator.RoadObject roadObject) {
        String str;
        int i;
        String str2;
        int i2;
        String str3;
        String str4;
        RoadObjectProvider provider = roadObject.getProvider();
        provider.getClass();
        int i3 = EHorizonMapperKt$WhenMappings.$EnumSwitchMapping$3[provider.ordinal()];
        int i4 = 2;
        if (i3 == 1) {
            str = "MAPBOX";
        } else {
            if (i3 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            str = "CUSTOM";
        }
        switch (RoadObjectMapperKt$WhenMappings.$EnumSwitchMapping$0[roadObject.getType().ordinal()]) {
            case 1:
                String id = roadObject.getId();
                id.getClass();
                IncidentInfo incidentInfo = roadObject.getMetadata().getIncidentInfo();
                incidentInfo.getClass();
                String id2 = incidentInfo.getId();
                id2.getClass();
                IncidentType type = incidentInfo.getType();
                type.getClass();
                switch (RoadObjectMapperKt$WhenMappings.$EnumSwitchMapping$4[type.ordinal()]) {
                    case 1:
                        i = 41;
                        break;
                    case 2:
                        i = 42;
                        break;
                    case 3:
                        i = 43;
                        break;
                    case 4:
                        i = 44;
                        break;
                    case 5:
                        i = 45;
                        break;
                    case 6:
                        i = 46;
                        break;
                    case 7:
                        i = 47;
                        break;
                    case 8:
                        i = 48;
                        break;
                    case 9:
                        i = 49;
                        break;
                    case 10:
                        i = 50;
                        break;
                    case 11:
                        i = 51;
                        break;
                    case 12:
                        i = 52;
                        break;
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                }
                int i5 = i;
                IncidentImpact impact = incidentInfo.getImpact();
                impact.getClass();
                int i6 = RoadObjectMapperKt$WhenMappings.$EnumSwitchMapping$5[impact.ordinal()];
                if (i6 == 1) {
                    str2 = SystemUtils.UNKNOWN;
                } else if (i6 == 2) {
                    str2 = "critical";
                } else if (i6 == 3) {
                    str2 = "major";
                } else if (i6 == 4) {
                    str2 = "minor";
                } else {
                    if (i6 != 5) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    str2 = Constants.LOW;
                }
                String str5 = str2;
                IncidentCongestion congestion = incidentInfo.getCongestion();
                com.mapbox.navigation.base.trip.model.roadobject.incident.IncidentCongestion incidentCongestion = congestion != null ? new com.mapbox.navigation.base.trip.model.roadobject.incident.IncidentCongestion(congestion.getValue()) : null;
                boolean roadClosed = incidentInfo.getRoadClosed();
                Date creationTime = incidentInfo.getCreationTime();
                Date startTime = incidentInfo.getStartTime();
                Date endTime = incidentInfo.getEndTime();
                String description = incidentInfo.getDescription();
                String subType = incidentInfo.getSubType();
                String subTypeDescription = incidentInfo.getSubTypeDescription();
                List<Integer> alertcCodes = incidentInfo.getAlertcCodes();
                HashMap<String, Integer> trafficCodes = incidentInfo.getTrafficCodes();
                trafficCodes.getClass();
                String iso_3166_1_alpha2 = incidentInfo.getIso_3166_1_alpha2();
                String iso_3166_1_alpha3 = incidentInfo.getIso_3166_1_alpha3();
                List<String> lanesBlocked = incidentInfo.getLanesBlocked();
                lanesBlocked.getClass();
                String longDescription = incidentInfo.getLongDescription();
                String lanesClearDesc = incidentInfo.getLanesClearDesc();
                Long numLanesBlocked = incidentInfo.getNumLanesBlocked();
                List<String> affectedRoadNames = incidentInfo.getAffectedRoadNames();
                HashMap<String, List<String>> multiLingualAffectedRoadNames = incidentInfo.getMultiLingualAffectedRoadNames();
                multiLingualAffectedRoadNames.getClass();
                return new Incident(id, new com.mapbox.navigation.base.trip.model.roadobject.incident.IncidentInfo(id2, i5, str5, incidentCongestion, roadClosed, creationTime, startTime, endTime, description, subType, subTypeDescription, alertcCodes, trafficCodes, iso_3166_1_alpha2, iso_3166_1_alpha3, lanesBlocked, longDescription, lanesClearDesc, numLanesBlocked, affectedRoadNames, multiLingualAffectedRoadNames, incidentInfo.getLength()), roadObject.getLength(), str, roadObject.getIsUrban(), roadObject);
            case 2:
                String id3 = roadObject.getId();
                id3.getClass();
                TollCollectionInfo tollCollectionInfo = roadObject.getMetadata().getTollCollectionInfo();
                tollCollectionInfo.getClass();
                int i7 = RoadObjectMapperKt$WhenMappings.$EnumSwitchMapping$1[tollCollectionInfo.getType().ordinal()];
                if (i7 == 1) {
                    i2 = 1;
                } else {
                    if (i7 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    i2 = 2;
                }
                return new TollCollection(id3, i2, roadObject.getMetadata().getTollCollectionInfo().getName(), roadObject.getLength(), str, roadObject.getIsUrban(), roadObject);
            case 3:
                String id4 = roadObject.getId();
                id4.getClass();
                AdminInfo from = roadObject.getMetadata().getBorderCrossingInfo().getFrom();
                from.getClass();
                String iso_3166_1 = from.getIso_3166_1();
                iso_3166_1.getClass();
                String iso_3166_1_alpha4 = from.getIso_3166_1_alpha3();
                iso_3166_1_alpha4.getClass();
                CountryBorderCrossingAdminInfo countryBorderCrossingAdminInfo = new CountryBorderCrossingAdminInfo(iso_3166_1, iso_3166_1_alpha4);
                AdminInfo to = roadObject.getMetadata().getBorderCrossingInfo().getTo();
                to.getClass();
                String iso_3166_2 = to.getIso_3166_1();
                iso_3166_2.getClass();
                String iso_3166_1_alpha5 = to.getIso_3166_1_alpha3();
                iso_3166_1_alpha5.getClass();
                return new CountryBorderCrossing(id4, new CountryBorderCrossingInfo(countryBorderCrossingAdminInfo, new CountryBorderCrossingAdminInfo(iso_3166_2, iso_3166_1_alpha5)), roadObject.getLength(), str, roadObject.getIsUrban(), roadObject);
            case 4:
                String id5 = roadObject.getId();
                id5.getClass();
                TunnelInfo tunnelInfo = roadObject.getMetadata().getTunnelInfo();
                tunnelInfo.getClass();
                return new Tunnel(id5, new com.mapbox.navigation.base.trip.model.roadobject.tunnel.TunnelInfo(tunnelInfo.getName()), roadObject.getLength(), str, roadObject.getIsUrban(), roadObject);
            case 5:
                String id6 = roadObject.getId();
                id6.getClass();
                return new Bridge(id6, 4, roadObject.getLength(), str, roadObject.getIsUrban(), roadObject, 3);
            case 6:
                String id7 = roadObject.getId();
                id7.getClass();
                ServiceAreaInfo serviceAreaInfo = roadObject.getMetadata().getServiceAreaInfo();
                serviceAreaInfo.getClass();
                int i8 = RoadObjectMapperKt$WhenMappings.$EnumSwitchMapping$2[serviceAreaInfo.getType().ordinal()];
                if (i8 == 1) {
                    i4 = 1;
                } else if (i8 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                String name = roadObject.getMetadata().getServiceAreaInfo().getName();
                List<Amenity> amenities = roadObject.getMetadata().getServiceAreaInfo().getAmenities();
                amenities.getClass();
                List<Amenity> list = amenities;
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                for (Amenity amenity : list) {
                    AmenityType type2 = amenity.getType();
                    type2.getClass();
                    switch (RoadObjectMapperKt$WhenMappings.$EnumSwitchMapping$3[type2.ordinal()]) {
                        case 1:
                            str3 = "atm";
                            break;
                        case 2:
                            str3 = "baby_care";
                            break;
                        case 3:
                            str3 = "coffee";
                            break;
                        case 4:
                            str3 = "electric_charging_station";
                            break;
                        case 5:
                            str3 = "fax";
                            break;
                        case 6:
                            str3 = "facilities_for_disabled";
                            break;
                        case 7:
                            str3 = "gas_station";
                            break;
                        case 8:
                            str3 = "hotel";
                            break;
                        case 9:
                            str3 = "hotspring";
                            break;
                        case 10:
                            str3 = "info";
                            break;
                        case 11:
                            str3 = "post";
                            break;
                        case 12:
                            str3 = "picnic_shelter";
                            break;
                        case 13:
                            str3 = "restaurant";
                            break;
                        case 14:
                            str3 = "shop";
                            break;
                        case 15:
                            str3 = "shower";
                            break;
                        case 16:
                            str3 = "snack";
                            break;
                        case 17:
                            str3 = "telephone";
                            break;
                        case 18:
                            str3 = "toilet";
                            break;
                        case 19:
                            str3 = "undefined";
                            break;
                        default:
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                    }
                    arrayList.add(new com.mapbox.navigation.base.trip.model.roadobject.reststop.Amenity(str3, amenity.getName(), amenity.getBrand()));
                }
                return new RestStop(id7, i4, name, arrayList, roadObject.getMetadata().getServiceAreaInfo().getGuideMapUri(), roadObject.getLength(), str, roadObject.getIsUrban(), roadObject);
            case 7:
                String id8 = roadObject.getId();
                id8.getClass();
                return new Bridge(id8, 5, roadObject.getLength(), str, roadObject.getIsUrban(), roadObject, 0);
            case 8:
                String id9 = roadObject.getId();
                id9.getClass();
                return new Bridge(id9, 7, roadObject.getLength(), str, roadObject.getIsUrban(), roadObject, 2);
            case 9:
                String id10 = roadObject.getId();
                id10.getClass();
                roadObject.getMetadata().getRailwayCrossingInfo().getClass();
                return new RailwayCrossing(id10, new RailwayCrossingInfo(), roadObject.getLength(), str, roadObject.getIsUrban(), roadObject);
            case 10:
                String id11 = roadObject.getId();
                id11.getClass();
                List<LocalizedString> name2 = roadObject.getMetadata().getIcInfo().getName();
                name2.getClass();
                List<LocalizedString> list2 = name2;
                ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                for (LocalizedString localizedString : list2) {
                    localizedString.getClass();
                    String language = localizedString.getLanguage();
                    language.getClass();
                    String value = localizedString.getValue();
                    value.getClass();
                    arrayList2.add(new com.mapbox.navigation.base.trip.model.roadobject.LocalizedString(language, value));
                }
                return new Interchange(id11, arrayList2, roadObject.getLength(), str, roadObject.getIsUrban(), roadObject);
            case 11:
                String id12 = roadObject.getId();
                id12.getClass();
                List<LocalizedString> name3 = roadObject.getMetadata().getJctInfo().getName();
                name3.getClass();
                List<LocalizedString> list3 = name3;
                ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
                for (LocalizedString localizedString2 : list3) {
                    localizedString2.getClass();
                    String language2 = localizedString2.getLanguage();
                    language2.getClass();
                    String value2 = localizedString2.getValue();
                    value2.getClass();
                    arrayList3.add(new com.mapbox.navigation.base.trip.model.roadobject.LocalizedString(language2, value2));
                }
                return new Junction(id12, arrayList3, roadObject.getLength(), str, roadObject.getIsUrban(), roadObject);
            case 12:
                String id13 = roadObject.getId();
                id13.getClass();
                return new Bridge(id13, 11, roadObject.getLength(), str, roadObject.getIsUrban(), roadObject, 1);
            case 13:
                String id14 = roadObject.getId();
                id14.getClass();
                MergingAreaInfo mergingAreaInfo = roadObject.getMetadata().getMergingAreaInfo();
                mergingAreaInfo.getClass();
                int i9 = RoadObjectMapperKt$WhenMappings.$EnumSwitchMapping$6[mergingAreaInfo.getMergeType().ordinal()];
                if (i9 == 1) {
                    str4 = "from_left";
                } else if (i9 == 2) {
                    str4 = "from_right";
                } else {
                    if (i9 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    str4 = "from_both_sides";
                }
                return new MergingArea(id14, new com.mapbox.navigation.base.trip.model.roadobject.merge.MergingAreaInfo(str4), roadObject.getLength(), str, roadObject.getIsUrban(), roadObject);
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
        }
    }
}
