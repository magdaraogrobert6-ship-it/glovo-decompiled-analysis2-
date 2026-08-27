package com.huawei.hms.locationSdk;

import com.google.gson.Gson;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.location.offlinelocation.OfflineLocationResponse;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.hms.support.api.location.common.exception.ServiceErrorCodeAdaptor;
import o.IconCompatParcelizer;
import o.ViewLayerCompanionOutlineProvider1;

/* JADX INFO: loaded from: classes4.dex */
public class n extends b<q0, OfflineLocationResponse> {
    public n(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 7;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(q0 q0Var, ResponseErrorCode responseErrorCode, String str, ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1) {
        try {
            HMSLocationLog.i("GetOfflineLocationTaskApiCall", ((b) this).a, "doExecute");
            if (responseErrorCode == null) {
                throw new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            }
            ServiceErrorCodeAdaptor.getInstance().setTaskByServiceErrorCode(viewLayerCompanionOutlineProvider1, responseErrorCode, responseErrorCode.getErrorCode() == 0 ? (OfflineLocationResponse) new Gson().fromJson(str, OfflineLocationResponse.class) : null);
        } catch (ApiException e) {
            IconCompatParcelizer.RemoteActionCompatParcelizer(e, new StringBuilder("get last location doExecute exception:"), "GetOfflineLocationTaskApiCall", ((b) this).a);
            viewLayerCompanionOutlineProvider1.read(e);
        } catch (Exception unused) {
            HMSLocationLog.e("GetOfflineLocationTaskApiCall", ((b) this).a, "get last location doExecute exception");
            viewLayerCompanionOutlineProvider1.read(new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000))));
        }
    }
}
