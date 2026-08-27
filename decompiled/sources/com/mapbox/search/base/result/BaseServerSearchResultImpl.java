package com.mapbox.search.base.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.resp.Vw;
import com.mapbox.geojson.Point;
import com.mapbox.search.base.BaseRequestOptions;
import com.mapbox.search.base.logger.LogKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.getAccessibilityExtraKeysui;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseServerSearchResultImpl extends BaseSearchResult {
    public static final Parcelable.Creator<BaseServerSearchResultImpl> CREATOR = new Vw.yn(13);
    public final BaseRawSearchResult rawSearchResult;
    public final BaseRequestOptions requestOptions;
    public final ArrayList types;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.mapbox.search.base.result.BaseSearchResult
    public final BaseRawSearchResult getRawSearchResult() {
        return this.rawSearchResult;
    }

    @Override // com.mapbox.search.base.result.BaseSearchResult
    public final BaseRequestOptions getRequestOptions() {
        return this.requestOptions;
    }

    @Override // com.mapbox.search.base.result.BaseSearchResult
    public final List getTypes() {
        return this.types;
    }

    @Override // com.mapbox.search.base.result.BaseSearchResult
    public final getAccessibilityExtraKeysui getBaseType() {
        final Point coordinate = getCoordinate();
        return new getAccessibilityExtraKeysui(coordinate) { // from class: com.mapbox.search.base.result.BaseSearchResult$Type$ServerResult
            public final Point coordinate;

            public final int hashCode() {
                return this.coordinate.hashCode();
            }

            {
                this.coordinate = coordinate;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BaseSearchResult$Type$ServerResult) && this.coordinate.equals(((BaseSearchResult$Type$ServerResult) obj).coordinate);
            }

            public final String toString() {
                return "ServerResult(coordinate=" + this.coordinate + ')';
            }
        };
    }

    @Override // com.mapbox.search.base.result.BaseSearchResult
    public final Point getCoordinate() {
        Point point = this.rawSearchResult.center;
        if (point != null) {
            return point;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.types.hashCode();
        return this.requestOptions.hashCode() + ((this.rawSearchResult.hashCode() + (iHashCode * 31)) * 31);
    }

    public BaseServerSearchResultImpl(ArrayList arrayList, BaseRawSearchResult baseRawSearchResult, BaseRequestOptions baseRequestOptions) {
        baseRawSearchResult.getClass();
        baseRequestOptions.getClass();
        this.types = arrayList;
        this.rawSearchResult = baseRawSearchResult;
        this.requestOptions = baseRequestOptions;
        if (baseRawSearchResult.center == null) {
            LogKt.logw$default("Server search result must have a coordinate");
        }
        if (arrayList.isEmpty()) {
            LogKt.logw$default("Provided types should not be empty!");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseServerSearchResultImpl)) {
            return false;
        }
        BaseServerSearchResultImpl baseServerSearchResultImpl = (BaseServerSearchResultImpl) obj;
        if (!this.types.equals(baseServerSearchResultImpl.types)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.rawSearchResult, baseServerSearchResultImpl.rawSearchResult}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requestOptions, baseServerSearchResultImpl.requestOptions}, getCieXyz.write())).booleanValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        ArrayList arrayList = this.types;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeString(((BaseSearchResultType) it.next()).name());
        }
        this.rawSearchResult.writeToParcel(parcel, i);
        this.requestOptions.writeToParcel(parcel, i);
    }

    public final String toString() {
        return "BaseServerSearchResultImpl(types=" + this.types + ", rawSearchResult=" + this.rawSearchResult + ", requestOptions=" + this.requestOptions + ')';
    }
}
