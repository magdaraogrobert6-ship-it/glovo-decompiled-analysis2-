package com.mapbox.search.base.result;

import android.os.Parcelable;
import com.mapbox.geojson.Point;
import com.mapbox.search.base.BaseRequestOptions;
import com.mapbox.search.internal.bindgen.ResultMetadata;
import com.mapbox.search.internal.bindgen.SearchAddress;
import java.util.List;
import o.getAccessibilityExtraKeysui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseSearchResult implements Parcelable {
    public abstract getAccessibilityExtraKeysui getBaseType();

    public abstract Point getCoordinate();

    public abstract BaseRawSearchResult getRawSearchResult();

    public abstract BaseRequestOptions getRequestOptions();

    public abstract List getTypes();

    public SearchAddress getAddress() {
        List list = getRawSearchResult().addresses;
        if (list != null) {
            return (SearchAddress) list.get(0);
        }
        return null;
    }

    public List getCategories() {
        return getRawSearchResult().categories;
    }

    public String getDescriptionText() {
        return getRawSearchResult().descriptionAddress;
    }

    public String getId() {
        return getRawSearchResult().id;
    }

    public String getMakiIcon() {
        return getRawSearchResult().icon;
    }

    public ResultMetadata getMetadata() {
        return getRawSearchResult().metadata;
    }

    public String getName() {
        return (String) getRawSearchResult().names.get(0);
    }

    public List getRoutablePoints() {
        return getRawSearchResult().routablePoints;
    }
}
