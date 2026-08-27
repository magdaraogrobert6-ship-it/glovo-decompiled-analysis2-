package com.huawei.hms.locationSdk;

import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.hms.support.api.location.common.exception.ServiceErrorCodeAdaptor;
import o.IconCompatParcelizer;
import o.ViewLayerCompanionOutlineProvider1;

/* JADX INFO: loaded from: classes4.dex */
public class z0 extends b<t0, Void> {
    public z0(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(t0 t0Var, ResponseErrorCode responseErrorCode, String str, ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1) {
        try {
            HMSLocationLog.i("RemoveGeofencesTaskApiCall", ((b) this).a, "remove geofences doExecute");
            if (responseErrorCode == null) {
                throw new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            }
            ServiceErrorCodeAdaptor.getInstance().setTaskByServiceErrorCode(viewLayerCompanionOutlineProvider1, responseErrorCode, null);
        } catch (ApiException e) {
            IconCompatParcelizer.RemoteActionCompatParcelizer(e, new StringBuilder("remove geofences doExecute exception:"), "RemoveGeofencesTaskApiCall", ((b) this).a);
            viewLayerCompanionOutlineProvider1.read(e);
        } catch (Exception unused) {
            HMSLocationLog.e("RemoveGeofencesTaskApiCall", ((b) this).a, "remove geofences doExecute exception");
            viewLayerCompanionOutlineProvider1.read(new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000))));
        }
    }
}
