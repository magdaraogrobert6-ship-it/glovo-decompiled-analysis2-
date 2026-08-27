package com.mapbox.search.internal.bindgen;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class SearchResult implements Serializable {
    private final ResultAccuracy accuracy;
    private final SuggestAction action;
    private final List<SearchAddress> addresses;
    private final LonLatBBox bbox;
    private final List<String> brand;
    private final String brandID;
    private final List<String> categories;
    private final List<String> categoryIDs;
    private final Point center;
    private final String descrAddress;
    private final Double distance;
    private final Double eta;
    private final HashMap<String, String> externalIDs;
    private final String fullAddress;
    private final String icon;
    private final String id;
    private final List<String> languages;
    private final String layer;
    private final String mapboxId;
    private final String matchingName;
    private final ResultMetadata metadata;
    private final String namePreferred;
    private final List<String> names;
    private final List<RoutablePoint> routablePoints;
    private final Integer serverIndex;
    private final List<ResultType> types;
    private final String userRecordID;
    private final int userRecordPriority;

    public ResultAccuracy getAccuracy() {
        return this.accuracy;
    }

    public SuggestAction getAction() {
        return this.action;
    }

    public List<SearchAddress> getAddresses() {
        return this.addresses;
    }

    public LonLatBBox getBbox() {
        return this.bbox;
    }

    public List<String> getBrand() {
        return this.brand;
    }

    public String getBrandID() {
        return this.brandID;
    }

    public List<String> getCategories() {
        return this.categories;
    }

    public List<String> getCategoryIDs() {
        return this.categoryIDs;
    }

    public Point getCenter() {
        return this.center;
    }

    public String getDescrAddress() {
        return this.descrAddress;
    }

    public Double getDistance() {
        return this.distance;
    }

    public Double getEta() {
        return this.eta;
    }

    public HashMap<String, String> getExternalIDs() {
        return this.externalIDs;
    }

    public String getFullAddress() {
        return this.fullAddress;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.id;
    }

    public List<String> getLanguages() {
        return this.languages;
    }

    public String getLayer() {
        return this.layer;
    }

    public String getMapboxId() {
        return this.mapboxId;
    }

    public String getMatchingName() {
        return this.matchingName;
    }

    public ResultMetadata getMetadata() {
        return this.metadata;
    }

    public String getNamePreferred() {
        return this.namePreferred;
    }

    public List<String> getNames() {
        return this.names;
    }

    public List<RoutablePoint> getRoutablePoints() {
        return this.routablePoints;
    }

    public Integer getServerIndex() {
        return this.serverIndex;
    }

    public List<ResultType> getTypes() {
        return this.types;
    }

    public String getUserRecordID() {
        return this.userRecordID;
    }

    public int getUserRecordPriority() {
        return this.userRecordPriority;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        String str = this.id;
        String str2 = this.mapboxId;
        List<ResultType> list = this.types;
        List<String> list2 = this.names;
        String str3 = this.namePreferred;
        List<String> list3 = this.languages;
        List<SearchAddress> list4 = this.addresses;
        String str4 = this.descrAddress;
        String str5 = this.matchingName;
        String str6 = this.fullAddress;
        Double d = this.distance;
        Double d2 = this.eta;
        Point point = this.center;
        ResultAccuracy resultAccuracy = this.accuracy;
        List<RoutablePoint> list5 = this.routablePoints;
        List<String> list6 = this.categories;
        List<String> list7 = this.categoryIDs;
        List<String> list8 = this.brand;
        String str7 = this.brandID;
        String str8 = this.icon;
        ResultMetadata resultMetadata = this.metadata;
        HashMap<String, String> map = this.externalIDs;
        String str9 = this.layer;
        String str10 = this.userRecordID;
        int i = this.userRecordPriority;
        return Objects.hash(str, str2, list, list2, str3, list3, list4, str4, str5, str6, d, d2, point, resultAccuracy, list5, list6, list7, list8, str7, str8, resultMetadata, map, str9, str10, Integer.valueOf(i), this.action, this.serverIndex, this.bbox);
    }

    public SearchResult(String str, String str2, List<ResultType> list, List<String> list2, String str3, List<String> list3, List<SearchAddress> list4, String str4, String str5, String str6, Double d, Double d2, Point point, ResultAccuracy resultAccuracy, List<RoutablePoint> list5, List<String> list6, List<String> list7, List<String> list8, String str7, String str8, ResultMetadata resultMetadata, HashMap<String, String> map, String str9, String str10, int i, SuggestAction suggestAction, Integer num, LonLatBBox lonLatBBox) {
        this.id = str;
        this.mapboxId = str2;
        this.types = list;
        this.names = list2;
        this.namePreferred = str3;
        this.languages = list3;
        this.addresses = list4;
        this.descrAddress = str4;
        this.matchingName = str5;
        this.fullAddress = str6;
        this.distance = d;
        this.eta = d2;
        this.center = point;
        this.accuracy = resultAccuracy;
        this.routablePoints = list5;
        this.categories = list6;
        this.categoryIDs = list7;
        this.brand = list8;
        this.brandID = str7;
        this.icon = str8;
        this.metadata = resultMetadata;
        this.externalIDs = map;
        this.layer = str9;
        this.userRecordID = str10;
        this.userRecordPriority = i;
        this.action = suggestAction;
        this.serverIndex = num;
        this.bbox = lonLatBBox;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", mapboxId: ");
        IconCompatParcelizer.read(sb, this.mapboxId, ", types: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.types, ", names: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.names, ", namePreferred: ");
        IconCompatParcelizer.read(sb, this.namePreferred, ", languages: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.languages, ", addresses: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.addresses, ", descrAddress: ");
        IconCompatParcelizer.read(sb, this.descrAddress, ", matchingName: ");
        IconCompatParcelizer.read(sb, this.matchingName, ", fullAddress: ");
        IconCompatParcelizer.read(sb, this.fullAddress, ", distance: ");
        af$$ExternalSyntheticOutline1.m(this.distance, sb, ", eta: ");
        af$$ExternalSyntheticOutline1.m(this.eta, sb, ", center: ");
        c8$$ExternalSyntheticOutline0.m(this.center, sb, ", accuracy: ");
        sb.append(RecordUtils.fieldToString(this.accuracy));
        sb.append(", routablePoints: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.routablePoints, ", categories: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.categories, ", categoryIDs: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.categoryIDs, ", brand: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.brand, ", brandID: ");
        IconCompatParcelizer.read(sb, this.brandID, ", icon: ");
        IconCompatParcelizer.read(sb, this.icon, ", metadata: ");
        sb.append(RecordUtils.fieldToString(this.metadata));
        sb.append(", externalIDs: ");
        sb.append(RecordUtils.fieldToString(this.externalIDs));
        sb.append(", layer: ");
        IconCompatParcelizer.read(sb, this.layer, ", userRecordID: ");
        IconCompatParcelizer.read(sb, this.userRecordID, ", userRecordPriority: ");
        IconCompatParcelizer.write(this.userRecordPriority, ", action: ", sb);
        sb.append(RecordUtils.fieldToString(this.action));
        sb.append(", serverIndex: ");
        SweepGradientShader9KIMszodefault.read(this.serverIndex, ", bbox: ", sb);
        sb.append(RecordUtils.fieldToString(this.bbox));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchResult searchResult = (SearchResult) obj;
        return Objects.equals(this.id, searchResult.id) && Objects.equals(this.mapboxId, searchResult.mapboxId) && Objects.equals(this.types, searchResult.types) && Objects.equals(this.names, searchResult.names) && Objects.equals(this.namePreferred, searchResult.namePreferred) && Objects.equals(this.languages, searchResult.languages) && Objects.equals(this.addresses, searchResult.addresses) && Objects.equals(this.descrAddress, searchResult.descrAddress) && Objects.equals(this.matchingName, searchResult.matchingName) && Objects.equals(this.fullAddress, searchResult.fullAddress) && Objects.equals(this.distance, searchResult.distance) && Objects.equals(this.eta, searchResult.eta) && Objects.equals(this.center, searchResult.center) && Objects.equals(this.accuracy, searchResult.accuracy) && Objects.equals(this.routablePoints, searchResult.routablePoints) && Objects.equals(this.categories, searchResult.categories) && Objects.equals(this.categoryIDs, searchResult.categoryIDs) && Objects.equals(this.brand, searchResult.brand) && Objects.equals(this.brandID, searchResult.brandID) && Objects.equals(this.icon, searchResult.icon) && Objects.equals(this.metadata, searchResult.metadata) && Objects.equals(this.externalIDs, searchResult.externalIDs) && Objects.equals(this.layer, searchResult.layer) && Objects.equals(this.userRecordID, searchResult.userRecordID) && this.userRecordPriority == searchResult.userRecordPriority && Objects.equals(this.action, searchResult.action) && Objects.equals(this.serverIndex, searchResult.serverIndex) && Objects.equals(this.bbox, searchResult.bbox);
    }
}
