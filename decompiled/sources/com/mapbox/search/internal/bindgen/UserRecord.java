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

/* JADX INFO: loaded from: classes3.dex */
public class UserRecord implements Serializable {
    private final SearchAddress address;
    private final List<String> categories;
    private final Point center;
    private final ResultType fromType;
    private final String id;
    private final List<String> indexTokens;
    private final String name;

    public SearchAddress getAddress() {
        return this.address;
    }

    public List<String> getCategories() {
        return this.categories;
    }

    public Point getCenter() {
        return this.center;
    }

    public ResultType getFromType() {
        return this.fromType;
    }

    public String getId() {
        return this.id;
    }

    public List<String> getIndexTokens() {
        return this.indexTokens;
    }

    public String getName() {
        return this.name;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.id, this.name, this.center, this.address, this.categories, this.indexTokens, this.fromType);
    }

    public UserRecord(String str, String str2, Point point, SearchAddress searchAddress, List<String> list, List<String> list2) {
        this.id = str;
        this.name = str2;
        this.center = point;
        this.address = searchAddress;
        this.categories = list;
        this.indexTokens = list2;
        this.fromType = ResultType.UNKNOWN;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", name: ");
        IconCompatParcelizer.read(sb, this.name, ", center: ");
        c8$$ExternalSyntheticOutline0.m(this.center, sb, ", address: ");
        sb.append(RecordUtils.fieldToString(this.address));
        sb.append(", categories: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.categories, ", indexTokens: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.indexTokens, ", fromType: ");
        sb.append(RecordUtils.fieldToString(this.fromType));
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
        UserRecord userRecord = (UserRecord) obj;
        return Objects.equals(this.id, userRecord.id) && Objects.equals(this.name, userRecord.name) && Objects.equals(this.center, userRecord.center) && Objects.equals(this.address, userRecord.address) && Objects.equals(this.categories, userRecord.categories) && Objects.equals(this.indexTokens, userRecord.indexTokens) && Objects.equals(this.fromType, userRecord.fromType);
    }

    public UserRecord(String str, String str2, Point point, SearchAddress searchAddress, List<String> list, List<String> list2, ResultType resultType) {
        this.id = str;
        this.name = str2;
        this.center = point;
        this.address = searchAddress;
        this.categories = list;
        this.indexTokens = list2;
        this.fromType = resultType;
    }
}
