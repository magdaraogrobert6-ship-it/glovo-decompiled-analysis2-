package com.mapbox.search.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.location.resp.Vw;
import com.mapbox.search.base.result.SearchRequestContext;
import com.mapbox.search.internal.bindgen.RequestOptions;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseRequestOptions implements Parcelable {
    public static final Parcelable.Creator<BaseRequestOptions> CREATOR = new Vw.yn(7);
    public final RequestOptions core;
    public final SearchRequestContext requestContext;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return this.requestContext.hashCode() + (this.core.hashCode() * 31);
    }

    public BaseRequestOptions(RequestOptions requestOptions, SearchRequestContext searchRequestContext) {
        requestOptions.getClass();
        searchRequestContext.getClass();
        this.core = requestOptions;
        this.requestContext = searchRequestContext;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.core);
        this.requestContext.writeToParcel(parcel, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseRequestOptions)) {
            return false;
        }
        BaseRequestOptions baseRequestOptions = (BaseRequestOptions) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.core, baseRequestOptions.core}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requestContext, baseRequestOptions.requestContext}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "BaseRequestOptions(core=" + this.core + ", requestContext=" + this.requestContext + ')';
    }
}
