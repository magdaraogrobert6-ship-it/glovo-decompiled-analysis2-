package com.mapbox.search.base.result;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.huawei.location.resp.Vw;
import com.mapbox.geojson.Point;
import com.mapbox.search.base.BaseRequestOptions;
import com.mapbox.search.base.record.BaseIndexableRecord;
import com.mapbox.search.internal.bindgen.ResultMetadata;
import com.mapbox.search.internal.bindgen.SearchAddress;
import java.util.List;
import o.getAccessibilityExtraKeysui;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseIndexableRecordSearchResultImpl extends BaseSearchResult {
    public static final Parcelable.Creator<BaseIndexableRecordSearchResultImpl> CREATOR = new Vw.yn(10);
    public final BaseSearchResult$Type$IndexableRecordSearchResult baseType;
    public final BaseRawSearchResult rawSearchResult;
    public final BaseIndexableRecord record;
    public final BaseRequestOptions requestOptions;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.mapbox.search.base.result.BaseSearchResult
    public final getAccessibilityExtraKeysui getBaseType() {
        return this.baseType;
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
    public final SearchAddress getAddress() {
        SearchAddress searchAddress;
        List list = this.rawSearchResult.addresses;
        return (list == null || (searchAddress = (SearchAddress) onContentCardDismissed.read(list)) == null) ? this.record.address : searchAddress;
    }

    @Override // com.mapbox.search.base.result.BaseSearchResult
    public final List getCategories() {
        List list = this.rawSearchResult.categories;
        return list == null ? this.record.categories : list;
    }

    @Override // com.mapbox.search.base.result.BaseSearchResult
    public final Point getCoordinate() {
        Point point = this.rawSearchResult.center;
        return point == null ? this.record.coordinate : point;
    }

    @Override // com.mapbox.search.base.result.BaseSearchResult
    public final String getDescriptionText() {
        String str = this.rawSearchResult.descriptionAddress;
        return str == null ? this.record.descriptionText : str;
    }

    @Override // com.mapbox.search.base.result.BaseSearchResult
    public final String getId() {
        BaseRawSearchResult baseRawSearchResult = this.rawSearchResult;
        String str = baseRawSearchResult.userRecordId;
        return str == null ? baseRawSearchResult.id : str;
    }

    @Override // com.mapbox.search.base.result.BaseSearchResult
    public final String getMakiIcon() {
        String str = this.rawSearchResult.icon;
        return str == null ? this.record.makiIcon : str;
    }

    @Override // com.mapbox.search.base.result.BaseSearchResult
    public final ResultMetadata getMetadata() {
        ResultMetadata resultMetadata = this.rawSearchResult.metadata;
        return resultMetadata == null ? this.record.metadata : resultMetadata;
    }

    @Override // com.mapbox.search.base.result.BaseSearchResult
    public final String getName() {
        return this.record.name;
    }

    @Override // com.mapbox.search.base.result.BaseSearchResult
    public final List getRoutablePoints() {
        List list = this.rawSearchResult.routablePoints;
        return list == null ? this.record.routablePoints : list;
    }

    @Override // com.mapbox.search.base.result.BaseSearchResult
    public final List getTypes() {
        Object[] objArr = {this.record.type};
        int iSerializer = getQueryParameterslambda2.serializer();
        return (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
    }

    public final int hashCode() {
        int iHashCode = this.record.hashCode();
        return this.requestOptions.hashCode() + ((this.rawSearchResult.hashCode() + (iHashCode * 31)) * 31);
    }

    public BaseIndexableRecordSearchResultImpl(BaseIndexableRecord baseIndexableRecord, BaseRawSearchResult baseRawSearchResult, BaseRequestOptions baseRequestOptions) {
        baseIndexableRecord.getClass();
        baseRawSearchResult.getClass();
        baseRequestOptions.getClass();
        this.record = baseIndexableRecord;
        this.rawSearchResult = baseRawSearchResult;
        this.requestOptions = baseRequestOptions;
        this.baseType = new BaseSearchResult$Type$IndexableRecordSearchResult(baseIndexableRecord);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.record.writeToParcel(parcel, i);
        this.rawSearchResult.writeToParcel(parcel, i);
        this.requestOptions.writeToParcel(parcel, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseIndexableRecordSearchResultImpl)) {
            return false;
        }
        BaseIndexableRecordSearchResultImpl baseIndexableRecordSearchResultImpl = (BaseIndexableRecordSearchResultImpl) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.record, baseIndexableRecordSearchResultImpl.record}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.rawSearchResult, baseIndexableRecordSearchResultImpl.rawSearchResult}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requestOptions, baseIndexableRecordSearchResultImpl.requestOptions}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "BaseIndexableRecordSearchResultImpl(record=" + this.record + ", rawSearchResult=" + this.rawSearchResult + ", requestOptions=" + this.requestOptions + ')';
    }
}
