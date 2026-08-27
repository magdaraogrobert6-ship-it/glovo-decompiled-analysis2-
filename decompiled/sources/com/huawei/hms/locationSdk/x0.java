package com.huawei.hms.locationSdk;

import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.hms.support.api.location.common.exception.ServiceErrorCodeAdaptor;
import o.ViewLayerCompanionOutlineProvider1;

/* JADX INFO: loaded from: classes2.dex */
public class x0 extends b<p0, Void> {
    private b1 d;

    public x0(String str, String str2, b1 b1Var) {
        super(str, str2, b1Var.a());
        this.d = b1Var;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(p0 p0Var, ResponseErrorCode responseErrorCode, String str, ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1) {
        try {
            if (responseErrorCode != null) {
                if (responseErrorCode.getErrorCode() == 0) {
                    c1.b().c(this.d);
                }
                HMSLocationLog.i("RemoveActivityTransitionUpdatesTaskApiCall", ((b) this).a, "doExecute");
                ServiceErrorCodeAdaptor.getInstance().setTaskByServiceErrorCode(viewLayerCompanionOutlineProvider1, responseErrorCode, null);
                return;
            }
            throw new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
        } catch (Exception unused) {
            HMSLocationLog.e("RemoveActivityTransitionUpdatesTaskApiCall", ((b) this).a, "doExecute exception");
            viewLayerCompanionOutlineProvider1.read(new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000))));
        }
    }
}
