package androidx.camera.core.impl;

import androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda3;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import coil3.util.UtilsKt;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.mapbox.geojson.BoundingBox;
import com.mapbox.geojson.Point;
import com.mapbox.search.base.result.BaseRawSearchResult;
import com.mapbox.search.base.result.BaseSuggestAction;
import com.mapbox.search.internal.bindgen.LonLatBBox;
import com.mapbox.search.internal.bindgen.ResultAccuracy;
import com.mapbox.search.internal.bindgen.ResultMetadata;
import com.mapbox.search.internal.bindgen.ResultType;
import com.mapbox.search.internal.bindgen.RoutablePoint;
import com.mapbox.search.internal.bindgen.SearchAddress;
import com.mapbox.search.internal.bindgen.SearchResult;
import com.mapbox.search.internal.bindgen.SuggestAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o.PreviewExternalSyntheticLambda0;
import o.PreviewFreezeAfterHighSpeedRecordingQuirk;
import o.ReportedVideoQualityNotSupportedQuirk;
import o.VideoQualityQuirk;
import o.onDrawBehind;

/* JADX INFO: loaded from: classes.dex */
public abstract class DeferrableSurfaces {
    public static onDrawBehind IconCompatParcelizer(ArrayList arrayList, PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk, ReportedVideoQualityNotSupportedQuirk reportedVideoQualityNotSupportedQuirk) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(VideoQualityQuirk.write(((PreviewExternalSyntheticLambda0) it.next()).IconCompatParcelizer()));
        }
        return UtilsKt.RemoteActionCompatParcelizer(new PreviewView$1$$ExternalSyntheticLambda2(UtilsKt.RemoteActionCompatParcelizer(new Futures$$ExternalSyntheticLambda3(VideoQualityQuirk.RemoteActionCompatParcelizer(arrayList2), reportedVideoQualityNotSupportedQuirk, DeviceOrientationRequest.OUTPUT_PERIOD_FAST, 0)), previewFreezeAfterHighSpeedRecordingQuirk, arrayList, 2));
    }

    public static final BaseRawSearchResult mapToBase(SearchResult searchResult) {
        BoundingBox boundingBox;
        BaseSuggestAction baseSuggestAction;
        String id = searchResult.getId();
        id.getClass();
        String mapboxId = searchResult.getMapboxId();
        List<ResultType> types = searchResult.getTypes();
        types.getClass();
        List<String> names = searchResult.getNames();
        names.getClass();
        String namePreferred = searchResult.getNamePreferred();
        List<String> languages = searchResult.getLanguages();
        languages.getClass();
        List<SearchAddress> addresses = searchResult.getAddresses();
        String descrAddress = searchResult.getDescrAddress();
        String matchingName = searchResult.getMatchingName();
        String fullAddress = searchResult.getFullAddress();
        Double distance = searchResult.getDistance();
        Point center = searchResult.getCenter();
        ResultAccuracy accuracy = searchResult.getAccuracy();
        List<RoutablePoint> routablePoints = searchResult.getRoutablePoints();
        LonLatBBox bbox = searchResult.getBbox();
        if (bbox != null) {
            BoundingBox boundingBoxFromPoints = BoundingBox.fromPoints(bbox.getMin(), bbox.getMax());
            boundingBoxFromPoints.getClass();
            boundingBox = boundingBoxFromPoints;
        } else {
            boundingBox = null;
        }
        List<String> categories = searchResult.getCategories();
        List<String> categoryIDs = searchResult.getCategoryIDs();
        List<String> brand = searchResult.getBrand();
        String brandID = searchResult.getBrandID();
        String icon = searchResult.getIcon();
        ResultMetadata metadata = searchResult.getMetadata();
        HashMap<String, String> externalIDs = searchResult.getExternalIDs();
        String layer = searchResult.getLayer();
        String userRecordID = searchResult.getUserRecordID();
        int userRecordPriority = searchResult.getUserRecordPriority();
        SuggestAction action = searchResult.getAction();
        if (action != null) {
            String endpoint = action.getEndpoint();
            endpoint.getClass();
            String path = action.getPath();
            path.getClass();
            baseSuggestAction = new BaseSuggestAction(endpoint, path, action.getQuery(), action.getBody(), action.getMultiRetrievable());
        } else {
            baseSuggestAction = null;
        }
        return new BaseRawSearchResult(id, mapboxId, types, names, namePreferred, languages, addresses, descrAddress, matchingName, fullAddress, distance, center, accuracy, routablePoints, boundingBox, categories, categoryIDs, brand, brandID, icon, metadata, externalIDs, layer, userRecordID, userRecordPriority, baseSuggestAction, searchResult.getServerIndex(), searchResult.getEta());
    }
}
