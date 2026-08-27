package com.huawei.location;

import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.location.lite.common.exception.LocationServiceException;
import com.huawei.location.router.BaseRouterTaskCallImpl;
import com.huawei.location.router.RouterResponse;
import com.huawei.location.router.entity.StatusInfo;
import com.huawei.location.utils.FB$yn;
import o.stringArrayResource;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseApiRequest extends BaseRouterTaskCallImpl {
    private static final String TAG = "BaseApiRequest";
    protected String apiName;
    protected FB$yn reportBuilder = new FB$yn();
    protected String errorCode = String.valueOf(0);

    public void report(LocationBaseRequest locationBaseRequest) {
        FB$yn fB$yn = this.reportBuilder;
        fB$yn.IconCompatParcelizer.setApiName(this.apiName);
        this.reportBuilder.yn(locationBaseRequest);
        this.reportBuilder.read().IconCompatParcelizer(this.errorCode);
    }

    public void onRequestFail(int i, String str) {
        onComplete(new RouterResponse("", new StatusInfo(0, i, str)));
    }

    public void checkApproximatelyPermission() throws LocationServiceException {
        if (stringArrayResource.IconCompatParcelizer()) {
            throw new LocationServiceException(LocationStatusCode.NO_PRECISE_LOCATION_PERMISSION, LocationStatusCode.getStatusCodeString(LocationStatusCode.NO_PRECISE_LOCATION_PERMISSION));
        }
    }
}
