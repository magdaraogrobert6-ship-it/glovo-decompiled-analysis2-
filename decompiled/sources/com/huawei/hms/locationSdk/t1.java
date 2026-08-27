package com.huawei.hms.locationSdk;

import com.google.gson.Gson;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.location.RoadDataResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.hms.support.api.location.common.exception.ServiceErrorCodeAdaptor;
import o.IconCompatParcelizer;
import o.ViewLayerCompanionOutlineProvider1;

/* JADX INFO: loaded from: classes4.dex */
public class t1 extends b<r0, RoadDataResult> {
    public t1(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(r0 r0Var, ResponseErrorCode responseErrorCode, String str, ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1) {
        try {
            HMSLocationLog.i("SetRoadDataTaskApiCall", ((b) this).a, "doExecute");
            if (responseErrorCode == null) {
                throw new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            }
            int errorCode = responseErrorCode.getErrorCode();
            HMSLocationLog.i("SetRoadDataTaskApiCall", ((b) this).a, "SetRoadDataTaskApiCall message start");
            RoadDataResult roadDataResult = new RoadDataResult();
            if (errorCode == 0) {
                roadDataResult = (RoadDataResult) new Gson().fromJson(str, RoadDataResult.class);
            }
            roadDataResult.setStatus(new Status(errorCode));
            ServiceErrorCodeAdaptor.getInstance().setTaskByServiceErrorCode(viewLayerCompanionOutlineProvider1, responseErrorCode, roadDataResult);
            HMSLocationLog.d("SetRoadDataTaskApiCall", ((b) this).a, "SetRoadData message success");
        } catch (ApiException e) {
            IconCompatParcelizer.RemoteActionCompatParcelizer(e, new StringBuilder("SetRoadData doExecute exception:"), "SetRoadDataTaskApiCall", ((b) this).a);
            viewLayerCompanionOutlineProvider1.read(e);
        } catch (Exception unused) {
            HMSLocationLog.e("SetRoadDataTaskApiCall", ((b) this).a, "SetRoadData doExecute exception");
            viewLayerCompanionOutlineProvider1.read(new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000))));
        }
    }
}
