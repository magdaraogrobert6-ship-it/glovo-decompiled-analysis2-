package com.mapbox.navigation.base.internal.route.parsing;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.DataRef;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ResponseToParse {
    public final DataRef responseBody;
    public final String responseOriginAPI;
    public final String routeRequest;
    public final String routerOrigin;

    public final int hashCode() {
        return this.responseOriginAPI.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.responseBody.hashCode() * 31, 31, this.routeRequest), 31, this.routerOrigin);
    }

    public ResponseToParse(DataRef dataRef, String str, String str2, String str3) {
        dataRef.getClass();
        str.getClass();
        this.responseBody = dataRef;
        this.routeRequest = str;
        this.routerOrigin = str2;
        this.responseOriginAPI = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseToParse)) {
            return false;
        }
        ResponseToParse responseToParse = (ResponseToParse) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.responseBody, responseToParse.responseBody}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeRequest, responseToParse.routeRequest}, getCieXyz.write())).booleanValue() && this.routerOrigin.equals(responseToParse.routerOrigin) && this.responseOriginAPI.equals(responseToParse.responseOriginAPI);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResponseToParse(responseBody=");
        sb.append(this.responseBody);
        sb.append(", routeRequest=");
        sb.append(this.routeRequest);
        sb.append(", routerOrigin=");
        sb.append(this.routerOrigin);
        sb.append(", responseOriginAPI=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.responseOriginAPI, ')');
    }
}
