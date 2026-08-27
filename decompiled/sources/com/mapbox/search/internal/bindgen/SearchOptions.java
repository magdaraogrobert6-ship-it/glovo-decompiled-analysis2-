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
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes3.dex */
public class SearchOptions implements Serializable {
    private final HashMap<String, String> addonAPI;
    private final List<AttributeSet> attributeSets;
    private final LonLatBBox bbox;
    private final List<String> countries;
    private final Boolean ensureResultsPerCategory;
    private final String etaType;
    private final EvSearchOptions evSearchOptions;
    private final Boolean fuzzyMatch;
    private final boolean ignoreUR;
    private final List<String> language;
    private final Integer limit;
    private final String navProfile;
    private final boolean offlineSearchPlacesOutsideBbox;
    private final Point origin;
    private final Point proximity;
    private final Integer requestDebounce;
    private final List<Point> route;
    private final String sarType;
    private final Double timeDeviation;
    private final List<QueryType> types;
    private final Double urDistanceThreshold;
    private final LonLatBBox viewport;

    public HashMap<String, String> getAddonAPI() {
        return this.addonAPI;
    }

    public List<AttributeSet> getAttributeSets() {
        return this.attributeSets;
    }

    public LonLatBBox getBbox() {
        return this.bbox;
    }

    public List<String> getCountries() {
        return this.countries;
    }

    public Boolean getEnsureResultsPerCategory() {
        return this.ensureResultsPerCategory;
    }

    public String getEtaType() {
        return this.etaType;
    }

    public EvSearchOptions getEvSearchOptions() {
        return this.evSearchOptions;
    }

    public Boolean getFuzzyMatch() {
        return this.fuzzyMatch;
    }

    public boolean getIgnoreUR() {
        return this.ignoreUR;
    }

    public List<String> getLanguage() {
        return this.language;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getNavProfile() {
        return this.navProfile;
    }

    public boolean getOfflineSearchPlacesOutsideBbox() {
        return this.offlineSearchPlacesOutsideBbox;
    }

    public Point getOrigin() {
        return this.origin;
    }

    public Point getProximity() {
        return this.proximity;
    }

    public Integer getRequestDebounce() {
        return this.requestDebounce;
    }

    public List<Point> getRoute() {
        return this.route;
    }

    public String getSarType() {
        return this.sarType;
    }

    public Double getTimeDeviation() {
        return this.timeDeviation;
    }

    public List<QueryType> getTypes() {
        return this.types;
    }

    public Double getUrDistanceThreshold() {
        return this.urDistanceThreshold;
    }

    public LonLatBBox getViewport() {
        return this.viewport;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        Point point = this.proximity;
        Point point2 = this.origin;
        String str = this.navProfile;
        String str2 = this.etaType;
        LonLatBBox lonLatBBox = this.bbox;
        LonLatBBox lonLatBBox2 = this.viewport;
        List<String> list = this.countries;
        Boolean bool = this.fuzzyMatch;
        List<String> list2 = this.language;
        Integer num = this.limit;
        List<QueryType> list3 = this.types;
        boolean z = this.ignoreUR;
        Double d = this.urDistanceThreshold;
        Integer num2 = this.requestDebounce;
        List<Point> list4 = this.route;
        String str3 = this.sarType;
        Double d2 = this.timeDeviation;
        HashMap<String, String> map = this.addonAPI;
        boolean z2 = this.offlineSearchPlacesOutsideBbox;
        return Objects.hash(point, point2, str, str2, lonLatBBox, lonLatBBox2, list, bool, list2, num, list3, Boolean.valueOf(z), d, num2, list4, str3, d2, map, Boolean.valueOf(z2), this.ensureResultsPerCategory, this.attributeSets, this.evSearchOptions);
    }

    public SearchOptions(Point point, Point point2, String str, String str2, LonLatBBox lonLatBBox, LonLatBBox lonLatBBox2, List<String> list, Boolean bool, List<String> list2, Integer num, List<QueryType> list3, boolean z, Double d, Integer num2, List<Point> list4, String str3, Double d2, HashMap<String, String> map, boolean z2, Boolean bool2, List<AttributeSet> list5, EvSearchOptions evSearchOptions) {
        this.proximity = point;
        this.origin = point2;
        this.navProfile = str;
        this.etaType = str2;
        this.bbox = lonLatBBox;
        this.viewport = lonLatBBox2;
        this.countries = list;
        this.fuzzyMatch = bool;
        this.language = list2;
        this.limit = num;
        this.types = list3;
        this.ignoreUR = z;
        this.urDistanceThreshold = d;
        this.requestDebounce = num2;
        this.route = list4;
        this.sarType = str3;
        this.timeDeviation = d2;
        this.addonAPI = map;
        this.offlineSearchPlacesOutsideBbox = z2;
        this.ensureResultsPerCategory = bool2;
        this.attributeSets = list5;
        this.evSearchOptions = evSearchOptions;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[proximity: ");
        c8$$ExternalSyntheticOutline0.m(this.proximity, sb, ", origin: ");
        c8$$ExternalSyntheticOutline0.m(this.origin, sb, ", navProfile: ");
        IconCompatParcelizer.read(sb, this.navProfile, ", etaType: ");
        IconCompatParcelizer.read(sb, this.etaType, ", bbox: ");
        sb.append(RecordUtils.fieldToString(this.bbox));
        sb.append(", viewport: ");
        sb.append(RecordUtils.fieldToString(this.viewport));
        sb.append(", countries: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.countries, ", fuzzyMatch: ");
        getBitmapFromCache.write(sb, ", language: ", this.fuzzyMatch);
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.language, ", limit: ");
        SweepGradientShader9KIMszodefault.read(this.limit, ", types: ", sb);
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.types, ", ignoreUR: ");
        MediaSessionCompatQueueItem.write(sb, this.ignoreUR, ", urDistanceThreshold: ");
        af$$ExternalSyntheticOutline1.m(this.urDistanceThreshold, sb, ", requestDebounce: ");
        SweepGradientShader9KIMszodefault.read(this.requestDebounce, ", route: ", sb);
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.route, ", sarType: ");
        IconCompatParcelizer.read(sb, this.sarType, ", timeDeviation: ");
        af$$ExternalSyntheticOutline1.m(this.timeDeviation, sb, ", addonAPI: ");
        sb.append(RecordUtils.fieldToString(this.addonAPI));
        sb.append(", offlineSearchPlacesOutsideBbox: ");
        MediaSessionCompatQueueItem.write(sb, this.offlineSearchPlacesOutsideBbox, ", ensureResultsPerCategory: ");
        getBitmapFromCache.write(sb, ", attributeSets: ", this.ensureResultsPerCategory);
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.attributeSets, ", evSearchOptions: ");
        sb.append(RecordUtils.fieldToString(this.evSearchOptions));
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
        SearchOptions searchOptions = (SearchOptions) obj;
        return Objects.equals(this.proximity, searchOptions.proximity) && Objects.equals(this.origin, searchOptions.origin) && Objects.equals(this.navProfile, searchOptions.navProfile) && Objects.equals(this.etaType, searchOptions.etaType) && Objects.equals(this.bbox, searchOptions.bbox) && Objects.equals(this.viewport, searchOptions.viewport) && Objects.equals(this.countries, searchOptions.countries) && Objects.equals(this.fuzzyMatch, searchOptions.fuzzyMatch) && Objects.equals(this.language, searchOptions.language) && Objects.equals(this.limit, searchOptions.limit) && Objects.equals(this.types, searchOptions.types) && this.ignoreUR == searchOptions.ignoreUR && Objects.equals(this.urDistanceThreshold, searchOptions.urDistanceThreshold) && Objects.equals(this.requestDebounce, searchOptions.requestDebounce) && Objects.equals(this.route, searchOptions.route) && Objects.equals(this.sarType, searchOptions.sarType) && Objects.equals(this.timeDeviation, searchOptions.timeDeviation) && Objects.equals(this.addonAPI, searchOptions.addonAPI) && this.offlineSearchPlacesOutsideBbox == searchOptions.offlineSearchPlacesOutsideBbox && Objects.equals(this.ensureResultsPerCategory, searchOptions.ensureResultsPerCategory) && Objects.equals(this.attributeSets, searchOptions.attributeSets) && Objects.equals(this.evSearchOptions, searchOptions.evSearchOptions);
    }

    public SearchOptions(Point point, Point point2, String str, String str2, LonLatBBox lonLatBBox, LonLatBBox lonLatBBox2, List<String> list, Boolean bool, List<String> list2, Integer num, List<QueryType> list3, Double d, Integer num2, List<Point> list4, String str3, Double d2, HashMap<String, String> map, Boolean bool2, List<AttributeSet> list5, EvSearchOptions evSearchOptions) {
        this.proximity = point;
        this.origin = point2;
        this.navProfile = str;
        this.etaType = str2;
        this.bbox = lonLatBBox;
        this.viewport = lonLatBBox2;
        this.countries = list;
        this.fuzzyMatch = bool;
        this.language = list2;
        this.limit = num;
        this.types = list3;
        this.urDistanceThreshold = d;
        this.requestDebounce = num2;
        this.route = list4;
        this.sarType = str3;
        this.timeDeviation = d2;
        this.addonAPI = map;
        this.ensureResultsPerCategory = bool2;
        this.attributeSets = list5;
        this.evSearchOptions = evSearchOptions;
        this.ignoreUR = false;
        this.offlineSearchPlacesOutsideBbox = false;
    }
}
