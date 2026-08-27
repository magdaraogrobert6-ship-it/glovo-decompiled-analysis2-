package com.mapbox.search;

import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.geojson.BoundingBox;
import com.mapbox.geojson.Point;
import com.mapbox.maps.interactions.standard.generated.StandardPoi;
import com.mapbox.search.base.AssertionsKt;
import com.mapbox.search.base.BaseRequestOptions;
import com.mapbox.search.base.result.SearchRequestContext;
import com.mapbox.search.common.IsoCountryCode;
import com.mapbox.search.common.IsoLanguageCode;
import com.mapbox.search.common.NavigationProfile;
import com.mapbox.search.internal.bindgen.LonLatBBox;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.accessgetInstancedelegatecp;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RequestOptionsKt {
    public static final RequestOptions mapToPlatform(BaseRequestOptions baseRequestOptions) {
        BoundingBox boundingBox;
        ArrayList arrayList;
        ArrayList arrayList2;
        Integer num;
        ArrayList arrayList3;
        SearchNavigationOptions searchNavigationOptions;
        RouteOptions routeOptions;
        String str;
        baseRequestOptions.getClass();
        com.mapbox.search.internal.bindgen.RequestOptions requestOptions = baseRequestOptions.core;
        String query = requestOptions.getQuery();
        String endpoint = requestOptions.getEndpoint();
        com.mapbox.search.internal.bindgen.SearchOptions options = requestOptions.getOptions();
        options.getClass();
        Point proximity = options.getProximity();
        LonLatBBox bbox = options.getBbox();
        if (bbox != null) {
            BoundingBox boundingBoxFromPoints = BoundingBox.fromPoints(bbox.getMin(), bbox.getMax());
            boundingBoxFromPoints.getClass();
            boundingBox = boundingBoxFromPoints;
        } else {
            boundingBox = null;
        }
        List<String> countries = options.getCountries();
        if (countries != null) {
            List<String> list = countries;
            arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            for (String str2 : list) {
                str2.getClass();
                arrayList.add(new IsoCountryCode(str2));
            }
        } else {
            arrayList = null;
        }
        Boolean fuzzyMatch = options.getFuzzyMatch();
        List<String> language = options.getLanguage();
        if (language != null) {
            List<String> list2 = language;
            arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
            for (String str3 : list2) {
                str3.getClass();
                arrayList2.add(new IsoLanguageCode(str3));
            }
        } else {
            arrayList2 = null;
        }
        Integer limit = options.getLimit();
        if (limit == null || limit.intValue() > 0) {
            num = limit;
        } else {
            AssertionsKt.assertDebug(false, new SearchOptionsKt$validateLimit$1(0, limit));
            num = null;
        }
        List<com.mapbox.search.internal.bindgen.QueryType> types = options.getTypes();
        if (types != null) {
            List<com.mapbox.search.internal.bindgen.QueryType> list3 = types;
            ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
            for (com.mapbox.search.internal.bindgen.QueryType queryType : list3) {
                queryType.getClass();
                switch (QueryTypeKt$WhenMappings.$EnumSwitchMapping$1[queryType.ordinal()]) {
                    case 1:
                        str = PushNotificationParserObj.COUNTRY_KEY;
                        break;
                    case 2:
                        str = "region";
                        break;
                    case 3:
                        str = "postcode";
                        break;
                    case 4:
                        str = "district";
                        break;
                    case 5:
                        str = "place";
                        break;
                    case 6:
                        str = "locality";
                        break;
                    case 7:
                        str = "neighborhood";
                        break;
                    case 8:
                        str = "street";
                        break;
                    case 9:
                        str = "address";
                        break;
                    case 10:
                        str = StandardPoi.FEATURESET_ID;
                        break;
                    case 11:
                        str = "category";
                        break;
                    case 12:
                        str = "brand";
                        break;
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                }
                arrayList4.add(str);
            }
            arrayList3 = arrayList4;
        } else {
            arrayList3 = null;
        }
        Integer requestDebounce = options.getRequestDebounce();
        Point origin = options.getOrigin();
        String navProfile = options.getNavProfile();
        if (navProfile != null) {
            NavigationProfile navigationProfile = new NavigationProfile(navProfile);
            String etaType = options.getEtaType();
            searchNavigationOptions = new SearchNavigationOptions(navigationProfile, etaType != null ? new EtaType(etaType) : null);
        } else {
            searchNavigationOptions = null;
        }
        if (options.getRoute() == null || options.getTimeDeviation() == null) {
            endpoint = endpoint;
            routeOptions = null;
        } else {
            List<Point> route = options.getRoute();
            route.getClass();
            Double timeDeviation = options.getTimeDeviation();
            timeDeviation.getClass();
            double dDoubleValue = timeDeviation.doubleValue();
            String sarType = options.getSarType();
            RouteOptions.Deviation.SarType sarType2 = sarType != null ? new RouteOptions.Deviation.SarType(sarType) : null;
            routeOptions = new RouteOptions(route, Math.floor(dDoubleValue) == dDoubleValue ? new RouteOptions.Deviation.Time((long) dDoubleValue, TimeUnit.MINUTES, sarType2) : new RouteOptions.Deviation.Time((long) (dDoubleValue * 6.0E10d), TimeUnit.NANOSECONDS, sarType2));
        }
        SearchOptions searchOptions = new SearchOptions(proximity, boundingBox, arrayList, fuzzyMatch, arrayList2, num, null, arrayList3, requestDebounce, origin, searchNavigationOptions, routeOptions, options.getAddonAPI(), options.getIgnoreUR(), options.getUrDistanceThreshold());
        boolean proximityRewritten = requestOptions.getProximityRewritten();
        boolean originRewritten = requestOptions.getOriginRewritten();
        String sessionID = requestOptions.getSessionID();
        SearchRequestContext searchRequestContext = baseRequestOptions.requestContext;
        query.getClass();
        endpoint.getClass();
        sessionID.getClass();
        return new RequestOptions(query, searchOptions, proximityRewritten, originRewritten, endpoint, sessionID, searchRequestContext);
    }
}
