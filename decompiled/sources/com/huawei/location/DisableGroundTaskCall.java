package com.huawei.location;

import android.content.Context;
import android.content.Intent;
import com.google.gson.Gson;
import com.huawei.hms.support.api.entity.location.updates.RequestLocationUpdatesResponse;
import com.huawei.location.router.RouterResponse;
import com.huawei.location.router.entity.StatusInfo;
import com.huawei.location.service.BackGroundService;
import o.WrappedCompositionsetContent1211;
import o.placeAtf8xVGno;

/* JADX INFO: loaded from: classes4.dex */
public class DisableGroundTaskCall extends BaseApiRequest {
    private static final String TAG = "DisableGroundTaskCall";

    @Override // com.huawei.location.router.interfaces.IRouterRequest
    public void onRequest(String str) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "onRequest DisableGroundTaskCall");
        Context context = placeAtf8xVGno.read();
        context.stopService(new Intent(context, (Class<?>) BackGroundService.class));
        onComplete(new RouterResponse(new Gson().toJson(new RequestLocationUpdatesResponse()), new StatusInfo(0, 0, "SUCCESS")));
    }
}
