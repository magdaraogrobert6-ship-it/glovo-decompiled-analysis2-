package com.huawei.hms.locationSdk;

import com.google.gson.Gson;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.location.LocationSceneResponse;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.location.enhance.LocationSceneApiResponse;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.hms.support.api.location.common.exception.ServiceErrorCodeAdaptor;
import o.IconCompatParcelizer;
import o.ViewLayerCompanionOutlineProvider1;

/* JADX INFO: loaded from: classes4.dex */
public class q1 extends b<r0, LocationSceneResponse> {
    public q1(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 9;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(r0 r0Var, ResponseErrorCode responseErrorCode, String str, ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1) {
        try {
            HMSLocationLog.i("SetLocationSceneModeTaskApiCall", ((b) this).a, "doExecute");
            if (responseErrorCode == null) {
                throw new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            }
            LocationSceneApiResponse locationSceneApiResponse = responseErrorCode.getErrorCode() == 0 ? (LocationSceneApiResponse) new Gson().fromJson(str, LocationSceneApiResponse.class) : null;
            if (locationSceneApiResponse != null) {
                ServiceErrorCodeAdaptor.getInstance().setTaskByServiceErrorCode(viewLayerCompanionOutlineProvider1, responseErrorCode, locationSceneApiResponse.getLocationSceneResponse());
            } else {
                ServiceErrorCodeAdaptor.getInstance().setTaskByServiceErrorCode(viewLayerCompanionOutlineProvider1, responseErrorCode, null);
            }
        } catch (ApiException e) {
            IconCompatParcelizer.RemoteActionCompatParcelizer(e, new StringBuilder("get last location doExecute exception:"), "SetLocationSceneModeTaskApiCall", ((b) this).a);
            viewLayerCompanionOutlineProvider1.read(e);
        } catch (Exception unused) {
            HMSLocationLog.e("SetLocationSceneModeTaskApiCall", ((b) this).a, "get last location doExecute exception");
            viewLayerCompanionOutlineProvider1.read(new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000))));
        }
    }
}
