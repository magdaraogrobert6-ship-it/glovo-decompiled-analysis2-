package com.mapbox.search.internal.bindgen;

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
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public class BrandSearchOptions implements Serializable {
    private final HashMap<String, String> addonAPI;
    private final LonLatBBox bbox;
    private final List<String> countries;
    private final List<String> language;
    private final Integer limit;
    private final Point proximity;
    private final String query;
    private final Boolean showClosedPois;

    public HashMap<String, String> getAddonAPI() {
        return this.addonAPI;
    }

    public LonLatBBox getBbox() {
        return this.bbox;
    }

    public List<String> getCountries() {
        return this.countries;
    }

    public List<String> getLanguage() {
        return this.language;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public Point getProximity() {
        return this.proximity;
    }

    public String getQuery() {
        return this.query;
    }

    public Boolean getShowClosedPois() {
        return this.showClosedPois;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.query, this.language, this.limit, this.proximity, this.countries, this.bbox, this.showClosedPois, this.addonAPI);
    }

    public BrandSearchOptions(String str, List<String> list, Integer num, Point point, List<String> list2, LonLatBBox lonLatBBox, Boolean bool, HashMap<String, String> map) {
        this.query = str;
        this.language = list;
        this.limit = num;
        this.proximity = point;
        this.countries = list2;
        this.bbox = lonLatBBox;
        this.showClosedPois = bool;
        this.addonAPI = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[query: ");
        IconCompatParcelizer.read(sb, this.query, ", language: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.language, ", limit: ");
        SweepGradientShader9KIMszodefault.read(this.limit, ", proximity: ", sb);
        c8$$ExternalSyntheticOutline0.m(this.proximity, sb, ", countries: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.countries, ", bbox: ");
        sb.append(RecordUtils.fieldToString(this.bbox));
        sb.append(", showClosedPois: ");
        getBitmapFromCache.write(sb, ", addonAPI: ", this.showClosedPois);
        sb.append(RecordUtils.fieldToString(this.addonAPI));
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
        BrandSearchOptions brandSearchOptions = (BrandSearchOptions) obj;
        return Objects.equals(this.query, brandSearchOptions.query) && Objects.equals(this.language, brandSearchOptions.language) && Objects.equals(this.limit, brandSearchOptions.limit) && Objects.equals(this.proximity, brandSearchOptions.proximity) && Objects.equals(this.countries, brandSearchOptions.countries) && Objects.equals(this.bbox, brandSearchOptions.bbox) && Objects.equals(this.showClosedPois, brandSearchOptions.showClosedPois) && Objects.equals(this.addonAPI, brandSearchOptions.addonAPI);
    }
}
