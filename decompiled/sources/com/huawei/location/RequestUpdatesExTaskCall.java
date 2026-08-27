package com.huawei.location;

import com.huawei.hmf.tasks.a.i$d;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.api.entity.location.updates.RequestLocationUpdatesRequest;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.location.lite.common.exception.LocationServiceException;
import com.huawei.location.router.RouterResponse;
import com.huawei.location.router.entity.StatusInfo;
import o.ResourceResolutionException;
import o.WindowRecomposerFactory;
import o.WrappedCompositionsetContent1211;
import o.createAndInstallWindowRecomposerui;
import o.getGlobalKeyboardModifiersui;
import o.getOnSelectAllRequested;

/* JADX INFO: loaded from: classes4.dex */
public class RequestUpdatesExTaskCall extends BaseApiRequest {
    private static final String TAG = "RequestLocationUpdatesExAPI";
    private createAndInstallWindowRecomposerui hwLocationCallback = new i$d.a(11, this);

    private boolean checkNeedOffLineLocation(LocationRequest locationRequest) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "checkNeedOffLineLocation Ex");
        if (!agcFail()) {
            return true;
        }
        if (locationRequest.getPriority() != 100 && locationRequest.getPriority() != 200) {
            RouterResponse routerResponse = new RouterResponse("", new StatusInfo(0, LocationStatusCode.AGC_CHECK_FAIL, LocationStatusCode.getStatusCodeString(LocationStatusCode.AGC_CHECK_FAIL)));
            if (getRouterCallback() != null) {
                getRouterCallback().onComplete(routerResponse);
            }
            return false;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "agc fail ,but use offLine Ex");
        return true;
    }

    @Override // com.huawei.location.router.interfaces.IRouterRequest
    public void onRequest(String str) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "RequestLocationUpdatesExAPI begin");
        RequestLocationUpdatesRequest requestLocationUpdatesRequest = new RequestLocationUpdatesRequest();
        this.apiName = "Location_requestLocationUpdatesEx";
        try {
            ResourceResolutionException.IconCompatParcelizer(str, requestLocationUpdatesRequest);
            checkRequest(requestLocationUpdatesRequest);
            checkApproximatelyPermission();
            if (!checkNeedOffLineLocation(requestLocationUpdatesRequest.getLocationRequest())) {
                return;
            }
            boolean z = WindowRecomposerFactory.read().read(requestLocationUpdatesRequest.getUuid());
            requestLocationUpdatesRequest.setResendFromHMS(isResendFromHMS());
            getOnSelectAllRequested.write().serializer(new getGlobalKeyboardModifiersui(requestLocationUpdatesRequest), this.hwLocationCallback);
            this.reportBuilder.IconCompatParcelizer.setWLANScan();
            this.reportBuilder.IconCompatParcelizer(requestLocationUpdatesRequest.getLocationRequest(), z);
        } catch (LocationServiceException e) {
            this.errorCode = String.valueOf(e.read);
            onRequestFail(e.read, e.getMessage());
        } catch (Exception unused) {
            this.errorCode = String.valueOf(10000);
            onRequestFail(10000, LocationStatusCode.getStatusCodeString(10000));
        }
        report(requestLocationUpdatesRequest);
    }

    private void checkRequest(RequestLocationUpdatesRequest requestLocationUpdatesRequest) {
        if (requestLocationUpdatesRequest.getLocationRequest() == null) {
            WrappedCompositionsetContent1211.read(TAG, "locationRequest is invalid");
            throw new LocationServiceException(10000, LocationStatusCode.getStatusCodeString(10000));
        }
        int priority = requestLocationUpdatesRequest.getLocationRequest().getPriority();
        if (priority != 200 && priority != 100 && priority != 102 && priority != 104 && priority != 300 && priority != 105 && priority != 400) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "request is invalid");
            throw new LocationServiceException(10101, LocationStatusCode.getStatusCodeString(10101));
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "onRequest，tid is " + requestLocationUpdatesRequest.getTid() + ", packageName is " + requestLocationUpdatesRequest.getPackageName() + ", uuid is " + requestLocationUpdatesRequest.getUuid() + ", locationRequest is " + requestLocationUpdatesRequest.getLocationRequest().getPriority());
    }
}
