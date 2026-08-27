package com.mapbox.search.internal.bindgen;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class ReverseGeoOptions implements Serializable {
    private final List<String> countries;
    private final List<String> language;
    private final Integer limit;
    private final Point point;
    private final ReverseMode reverseMode;
    private final List<QueryType> types;

    public List<String> getCountries() {
        return this.countries;
    }

    public List<String> getLanguage() {
        return this.language;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public Point getPoint() {
        return this.point;
    }

    public ReverseMode getReverseMode() {
        return this.reverseMode;
    }

    public List<QueryType> getTypes() {
        return this.types;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.point, this.reverseMode, this.countries, this.language, this.limit, this.types);
    }

    public ReverseGeoOptions(Point point, ReverseMode reverseMode, List<String> list, List<String> list2, Integer num, List<QueryType> list3) {
        this.point = point;
        this.reverseMode = reverseMode;
        this.countries = list;
        this.language = list2;
        this.limit = num;
        this.types = list3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[point: ");
        c8$$ExternalSyntheticOutline0.m(this.point, sb, ", reverseMode: ");
        sb.append(RecordUtils.fieldToString(this.reverseMode));
        sb.append(", countries: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.countries, ", language: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.language, ", limit: ");
        SweepGradientShader9KIMszodefault.read(this.limit, ", types: ", sb);
        return MediaSessionCompatQueueItem.read(this.types, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReverseGeoOptions reverseGeoOptions = (ReverseGeoOptions) obj;
        return Objects.equals(this.point, reverseGeoOptions.point) && Objects.equals(this.reverseMode, reverseGeoOptions.reverseMode) && Objects.equals(this.countries, reverseGeoOptions.countries) && Objects.equals(this.language, reverseGeoOptions.language) && Objects.equals(this.limit, reverseGeoOptions.limit) && Objects.equals(this.types, reverseGeoOptions.types);
    }
}
