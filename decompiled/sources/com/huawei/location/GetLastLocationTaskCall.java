package com.huawei.location;

import android.location.Location;
import com.google.gson.Gson;
import com.huawei.hms.support.api.entity.location.lastlocation.GetLastLocationRequest;
import com.huawei.hms.support.api.entity.location.lastlocation.GetLastLocationResponse;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.location.lite.common.exception.LocationServiceException;
import com.huawei.location.router.RouterResponse;
import com.huawei.location.router.entity.StatusInfo;
import com.huawei.location.utils.FB$yn;
import o.ResourceResolutionException;
import o.WrappedCompositionsetContent1211;
import o.getOnSelectAllRequested;
import o.placeAtf8xVGno;
import o.stringArrayResource;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class GetLastLocationTaskCall extends BaseApiRequest {
    private static final String TAG = "GetLastLocationApi";

    private String buildRpt(GetLastLocationRequest getLastLocationRequest) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "buildRpt:" + new Gson().toJson(getLastLocationRequest));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("needAddress", getLastLocationRequest.getNeedAddress());
            return jSONObject.toString();
        } catch (JSONException unused) {
            WrappedCompositionsetContent1211.read(TAG, "buildRpt failed by exception");
            return "";
        }
    }

    @Override // com.huawei.location.router.interfaces.IRouterRequest
    public void onRequest(String str) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "onRequest GetLastLocationTaskCall");
        GetLastLocationRequest getLastLocationRequest = new GetLastLocationRequest(placeAtf8xVGno.read());
        this.apiName = "Location_getLocation";
        try {
            checkApproximatelyPermission();
            getOnSelectAllRequested.write().getClass();
            Location location = getOnSelectAllRequested.read();
            StatusInfo statusInfo = new StatusInfo(0, 0, "");
            GetLastLocationResponse getLastLocationResponse = new GetLastLocationResponse();
            ResourceResolutionException.IconCompatParcelizer(str, getLastLocationRequest);
            getLastLocationResponse.setLocation(location);
            doExecute(new RouterResponse(stringArrayResource.RemoteActionCompatParcelizer(getLastLocationResponse), statusInfo));
            FB$yn fB$yn = this.reportBuilder;
            fB$yn.IconCompatParcelizer.setExt(buildRpt(getLastLocationRequest));
        } catch (LocationServiceException e) {
            this.errorCode = String.valueOf(e.read);
            onRequestFail(e.read, e.getMessage());
        } catch (Exception unused) {
            this.errorCode = String.valueOf(10000);
            onRequestFail(10000, LocationStatusCode.getStatusCodeString(10000));
        }
        report(getLastLocationRequest);
    }
}
