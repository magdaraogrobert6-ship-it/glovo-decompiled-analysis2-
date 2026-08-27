package com.mapbox.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.search.base.result.BaseSearchResponse;
import o.IconCompatParcelizer;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class ResponseInfo implements Parcelable {
    public static final Parcelable.Creator<ResponseInfo> CREATOR = new EtaType.Creator(2);
    public final BaseSearchResponse coreSearchResponse;
    public final boolean isReproducible;
    public final RequestOptions requestOptions;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int iHashCode = this.requestOptions.hashCode();
        BaseSearchResponse baseSearchResponse = this.coreSearchResponse;
        return Boolean.hashCode(this.isReproducible) + (((iHashCode * 31) + (baseSearchResponse != null ? baseSearchResponse.hashCode() : 0)) * 31);
    }

    public ResponseInfo(RequestOptions requestOptions, BaseSearchResponse baseSearchResponse, boolean z) {
        requestOptions.getClass();
        this.requestOptions = requestOptions;
        this.coreSearchResponse = baseSearchResponse;
        this.isReproducible = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.requestOptions.writeToParcel(parcel, i);
        parcel.writeParcelable(this.coreSearchResponse, i);
        parcel.writeInt(this.isReproducible ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResponseInfo(requestOptions=");
        RequestOptions requestOptions = this.requestOptions;
        sb.append(requestOptions);
        sb.append(", responseUuid=");
        sb.append(requestOptions.requestContext.responseUuid);
        sb.append(", coreSearchResponse=");
        sb.append(this.coreSearchResponse);
        sb.append(", isReproducible=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.isReproducible, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ResponseInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ResponseInfo responseInfo = (ResponseInfo) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requestOptions, responseInfo.requestOptions}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.coreSearchResponse, responseInfo.coreSearchResponse}, getCieXyz.write())).booleanValue() && this.isReproducible == responseInfo.isReproducible;
    }
}
