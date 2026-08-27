package com.huawei.hms.locationSdk;

import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.hms.support.api.location.common.exception.ServiceErrorCodeAdaptor;
import o.ViewLayerCompanionOutlineProvider1;

/* JADX INFO: loaded from: classes2.dex */
public class g1 extends b<p0, Void> {
    private e1 d;

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 4;
    }

    public g1(String str, String str2, e1 e1Var) {
        super(str, str2, e1Var.a());
        this.d = e1Var;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(p0 p0Var, ResponseErrorCode responseErrorCode, String str, ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1) {
        try {
            HMSLocationLog.i("RequestActivityUpdatesTaskApiCall", ((b) this).a, "request activity doExecute");
            if (responseErrorCode == null) {
                throw new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            }
            if (responseErrorCode.getErrorCode() == 0) {
                f1.b().a(this.d);
            }
            ServiceErrorCodeAdaptor.getInstance().setTaskByServiceErrorCode(viewLayerCompanionOutlineProvider1, responseErrorCode, null);
        } catch (Exception unused) {
            HMSLocationLog.e("RequestActivityUpdatesTaskApiCall", ((b) this).a, "request activity doExecute exception");
            viewLayerCompanionOutlineProvider1.read(new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000))));
        }
    }
}
