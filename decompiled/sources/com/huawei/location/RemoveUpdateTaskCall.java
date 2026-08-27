package com.huawei.location;

import com.google.gson.Gson;
import com.huawei.hms.support.api.entity.location.updates.RequestLocationUpdatesResponse;
import com.huawei.location.lite.common.exception.LocationServiceException;
import com.huawei.location.req.RemoveLocationUpdatesReq;
import com.huawei.location.router.RouterResponse;
import com.huawei.location.router.entity.StatusInfo;
import o.ResourceResolutionException;
import o.WrappedCompositionsetContent1211;
import o.getOnSelectAllRequested;

/* JADX INFO: loaded from: classes4.dex */
public class RemoveUpdateTaskCall extends BaseApiRequest {
    private static final String TAG = "RemoveLocationUpdateApi";

    @Override // com.huawei.location.router.interfaces.IRouterRequest
    public void onRequest(String str) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "onRequest start");
        RemoveLocationUpdatesReq removeLocationUpdatesReq = new RemoveLocationUpdatesReq();
        ResourceResolutionException.IconCompatParcelizer(str, removeLocationUpdatesReq);
        this.reportBuilder.IconCompatParcelizer.setApiName("Location_removeLocationUpdates");
        this.reportBuilder.yn(removeLocationUpdatesReq);
        try {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "onRequest start:" + removeLocationUpdatesReq.getUuid());
            getOnSelectAllRequested.write().serializer(removeLocationUpdatesReq.getUuid());
            this.reportBuilder.read().IconCompatParcelizer("0");
            onComplete(new RouterResponse(new Gson().toJson(new RequestLocationUpdatesResponse()), new StatusInfo(0, 0, "SUCCESS")));
        } catch (LocationServiceException e) {
            this.reportBuilder.read().IconCompatParcelizer(e.read + "");
            onComplete(new RouterResponse(new Gson().toJson(new RequestLocationUpdatesResponse()), new StatusInfo(0, e.read, e.getMessage())));
        }
    }
}
