package com.huawei.hms.locationSdk;

import android.app.PendingIntent;
import android.os.Parcelable;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.location.LocationSettingsResponse;
import com.huawei.hms.location.LocationSettingsResult;
import com.huawei.hms.location.LocationSettingsStates;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.hms.support.api.location.common.exception.ServiceErrorCodeAdaptor;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.utils.JsonUtil;
import o.ViewLayerCompanionOutlineProvider1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c extends b<q0, LocationSettingsResponse> {
    public c(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(q0 q0Var, ResponseErrorCode responseErrorCode, String str, ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1) {
        LocationSettingsResponse locationSettingsResponse;
        Status status;
        try {
            HMSLocationLog.i("CheckLocationSettingsTaskApiCall", ((b) this).a, "doExecute");
            if (responseErrorCode == null) {
                throw new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            }
            Status status2 = null;
            LocationSettingsStates locationSettingsStates = null;
            if (responseErrorCode.getErrorCode() == 0) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("statusCheck")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("statusCheck");
                    Parcelable parcelable = responseErrorCode.getParcelable();
                    status = new Status(jSONObject2.has(HiAnalyticsConstant.HaKey.BI_KEY_RESULT) ? jSONObject2.getInt(HiAnalyticsConstant.HaKey.BI_KEY_RESULT) : -100, jSONObject2.has("statusMessage") ? jSONObject2.getString("statusMessage") : "", (parcelable == null || !(parcelable instanceof PendingIntent)) ? null : (PendingIntent) parcelable);
                } else {
                    status = null;
                }
                if (jSONObject.has("locationSettingsStates")) {
                    locationSettingsStates = new LocationSettingsStates();
                    JsonUtil.jsonToEntity(jSONObject.getJSONObject("locationSettingsStates").toString(), locationSettingsStates);
                    locationSettingsStates.setGnssPresent(locationSettingsStates.isGpsPresent());
                    locationSettingsStates.setGnssUsable(locationSettingsStates.isGpsUsable());
                }
                LocationSettingsResult locationSettingsResult = new LocationSettingsResult();
                locationSettingsResult.setLocationSettingsStates(locationSettingsStates);
                locationSettingsResult.setStatus(status);
                locationSettingsResponse = new LocationSettingsResponse(locationSettingsResult);
                status2 = status;
            } else {
                locationSettingsResponse = null;
            }
            if (status2 == null || status2.getStatusCode() != 6) {
                ServiceErrorCodeAdaptor.getInstance().setTaskByServiceErrorCode(viewLayerCompanionOutlineProvider1, responseErrorCode, locationSettingsResponse);
            } else {
                viewLayerCompanionOutlineProvider1.read(new ResolvableApiException(status2));
            }
        } catch (Exception unused) {
            HMSLocationLog.e("CheckLocationSettingsTaskApiCall", ((b) this).a, "doExecute exception");
            viewLayerCompanionOutlineProvider1.read(new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000))));
        }
    }
}
