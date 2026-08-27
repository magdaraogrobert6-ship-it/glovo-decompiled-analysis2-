package com.huawei.hms.support.api.location.common.exception;

import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import o.ViewLayerCompanionOutlineProvider1;

/* JADX INFO: loaded from: classes2.dex */
public class ServiceErrorCodeAdaptor<TResult> {
    private static final byte[] SYNC_LOCK = new byte[0];
    private static final String TAG = "ServiceErrorCodeAdaptor";
    private static volatile ServiceErrorCodeAdaptor instance;

    public static ServiceErrorCodeAdaptor getInstance() {
        if (instance == null) {
            synchronized (SYNC_LOCK) {
                if (instance == null) {
                    instance = new ServiceErrorCodeAdaptor();
                }
            }
        }
        return instance;
    }

    public void setTaskByServiceErrorCode(ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1, ResponseErrorCode responseErrorCode, TResult tresult) throws Exception {
        int i = 10000;
        if (viewLayerCompanionOutlineProvider1 != null && responseErrorCode != null) {
            int errorCode = responseErrorCode.getErrorCode();
            String errorReason = responseErrorCode.getErrorReason();
            HMSLog.i(TAG, "set task by error code:" + responseErrorCode.getErrorCode() + ",reason:" + responseErrorCode.getErrorReason());
            if (responseErrorCode.getErrorCode() < 10000 || responseErrorCode.getErrorCode() > 10099) {
                i = errorCode;
            } else {
                errorReason = LocationStatusCode.getStatusCodeString(10000);
            }
            if (i == 0) {
                viewLayerCompanionOutlineProvider1.IconCompatParcelizer(tresult);
                return;
            } else if (responseErrorCode.hasResolution()) {
                viewLayerCompanionOutlineProvider1.read(new ResolvableApiException(responseErrorCode));
                return;
            } else {
                viewLayerCompanionOutlineProvider1.read(new ApiException(new Status(i, errorReason)));
                return;
            }
        }
        throw new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
    }
}
