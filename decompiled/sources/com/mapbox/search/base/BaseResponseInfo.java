package com.mapbox.search.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.location.resp.Vw;
import com.mapbox.search.base.result.BaseSearchResponse;
import o.IconCompatParcelizer;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseResponseInfo implements Parcelable {
    public static final Parcelable.Creator<BaseResponseInfo> CREATOR = new Vw.yn(8);
    public final BaseSearchResponse coreSearchResponse;
    public final boolean isReproducible;
    public final BaseRequestOptions requestOptions;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public final int hashCode() {
        int iHashCode = this.requestOptions.hashCode();
        BaseSearchResponse baseSearchResponse = this.coreSearchResponse;
        int iHashCode2 = baseSearchResponse == null ? 0 : baseSearchResponse.hashCode();
        boolean z = this.isReproducible;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + r2;
    }

    public BaseResponseInfo(BaseRequestOptions baseRequestOptions, BaseSearchResponse baseSearchResponse, boolean z) {
        baseRequestOptions.getClass();
        this.requestOptions = baseRequestOptions;
        this.coreSearchResponse = baseSearchResponse;
        this.isReproducible = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.requestOptions.writeToParcel(parcel, i);
        BaseSearchResponse baseSearchResponse = this.coreSearchResponse;
        if (baseSearchResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseSearchResponse.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isReproducible ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseResponseInfo)) {
            return false;
        }
        BaseResponseInfo baseResponseInfo = (BaseResponseInfo) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requestOptions, baseResponseInfo.requestOptions}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.coreSearchResponse, baseResponseInfo.coreSearchResponse}, getCieXyz.write())).booleanValue() && this.isReproducible == baseResponseInfo.isReproducible;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseResponseInfo(requestOptions=");
        sb.append(this.requestOptions);
        sb.append(", coreSearchResponse=");
        sb.append(this.coreSearchResponse);
        sb.append(", isReproducible=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.isReproducible, ')');
    }
}
