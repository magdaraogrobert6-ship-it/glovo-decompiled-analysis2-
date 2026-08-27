package com.huawei.hms.locationSdk;

import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import com.huawei.hms.support.api.location.common.LocationRequestHelper;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.hms.support.api.location.common.exception.ServiceErrorCodeAdaptor;
import com.huawei.location.lite.common.util.ReflectionUtils;
import com.huawei.location.mdc.AdsLocationManager;
import com.huawei.location.vdr.VdrManager;
import o.ViewLayerCompanionOutlineProvider1;

/* JADX INFO: loaded from: classes2.dex */
public class a1 extends b<q0, Void> {
    private k1 d;

    public a1(String str, String str2, String str3, k1 k1Var, String str4) {
        super(str, str2, str3, str4);
        this.d = k1Var;
        if (ReflectionUtils.getClass("com.huawei.location.vdr.VdrManager") != null) {
            VdrManager.getInstance().unRegisterVdrLocationLis(this.d.h());
        }
        if (LocationRequestHelper.isNeedMdcLocation()) {
            AdsLocationManager.getInstance().removeLocationUpdates(this.d.h());
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(q0 q0Var, ResponseErrorCode responseErrorCode, String str, ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1) {
        try {
            HMSLocationLog.i("RemoveLocationUpdatesTaskApiCall", ((b) this).a, "doExecute");
            if (responseErrorCode == null) {
                throw new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            }
            if (responseErrorCode.getErrorCode() == 0 || responseErrorCode.getErrorCode() == 10104) {
                w0.b().c(this.d);
            }
            ServiceErrorCodeAdaptor.getInstance().setTaskByServiceErrorCode(viewLayerCompanionOutlineProvider1, responseErrorCode, null);
        } catch (Exception unused) {
            HMSLocationLog.e("RemoveLocationUpdatesTaskApiCall", ((b) this).a, "doExecute exception");
            viewLayerCompanionOutlineProvider1.read(new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000))));
        }
    }
}
