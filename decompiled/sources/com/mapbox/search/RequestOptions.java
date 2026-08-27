package com.mapbox.search;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.mapbox.search.base.result.SearchRequestContext;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class RequestOptions implements Parcelable {
    public static final Parcelable.Creator<RequestOptions> CREATOR = new EtaType.Creator(1);
    public final String endpoint;
    public final SearchOptions options;
    public final boolean originRewritten;
    public final boolean proximityRewritten;
    public final String query;
    public final SearchRequestContext requestContext;
    public final String sessionID;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int iHashCode = this.query.hashCode();
        return this.requestContext.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((this.options.hashCode() + (iHashCode * 31)) * 31, 31, this.proximityRewritten), 31, this.originRewritten), 31, this.endpoint), 31, this.sessionID);
    }

    public RequestOptions(String str, SearchOptions searchOptions, boolean z, boolean z2, String str2, String str3, SearchRequestContext searchRequestContext) {
        str.getClass();
        searchOptions.getClass();
        str2.getClass();
        str3.getClass();
        searchRequestContext.getClass();
        this.query = str;
        this.options = searchOptions;
        this.proximityRewritten = z;
        this.originRewritten = z2;
        this.endpoint = str2;
        this.sessionID = str3;
        this.requestContext = searchRequestContext;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.query);
        this.options.writeToParcel(parcel, i);
        parcel.writeInt(this.proximityRewritten ? 1 : 0);
        parcel.writeInt(this.originRewritten ? 1 : 0);
        parcel.writeString(this.endpoint);
        parcel.writeString(this.sessionID);
        parcel.writeParcelable(this.requestContext, i);
    }

    public final String toString() {
        return "RequestOptions(query='" + this.query + "', options=" + this.options + ", proximityRewritten=" + this.proximityRewritten + ", originRewritten=" + this.originRewritten + ", endpoint='" + this.endpoint + "', sessionID='" + this.sessionID + "', requestContext=" + this.requestContext + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RequestOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RequestOptions requestOptions = (RequestOptions) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.query, requestOptions.query}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.options, requestOptions.options}, getCieXyz.write())).booleanValue() || this.proximityRewritten != requestOptions.proximityRewritten || this.originRewritten != requestOptions.originRewritten) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.endpoint, requestOptions.endpoint}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sessionID, requestOptions.sessionID}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requestContext, requestOptions.requestContext}, getCieXyz.write())).booleanValue();
    }
}
