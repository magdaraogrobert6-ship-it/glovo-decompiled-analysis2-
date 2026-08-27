package com.huawei.location;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import com.google.gson.Gson;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.entity.location.updates.RequestLocationUpdatesResponse;
import com.huawei.location.req.BackgroundReq;
import com.huawei.location.router.RouterResponse;
import com.huawei.location.router.entity.StatusInfo;
import com.huawei.location.service.BackGroundService;
import o.ResourceResolutionException;
import o.WrappedCompositionsetContent1211;
import o.placeAtf8xVGno;

/* JADX INFO: loaded from: classes4.dex */
public class EnableGroundTaskCall extends BaseApiRequest {
    private static final String TAG = "EnableGroundTaskCall";

    @Override // com.huawei.location.router.interfaces.IRouterRequest
    public void onRequest(String str) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "onRequest EnableGroundTaskCall");
        BackgroundReq backgroundReq = new BackgroundReq();
        ResourceResolutionException.IconCompatParcelizer(str, backgroundReq);
        Context context = placeAtf8xVGno.read();
        Notification notification = (Notification) getParcelable();
        Intent intent = new Intent(context, (Class<?>) BackGroundService.class);
        intent.putExtra("notificationId", backgroundReq.getNotificationId());
        intent.putExtra(RemoteMessageConst.NOTIFICATION, notification);
        context.startForegroundService(intent);
        onComplete(new RouterResponse(new Gson().toJson(new RequestLocationUpdatesResponse()), new StatusInfo(0, 0, "SUCCESS")));
    }
}
