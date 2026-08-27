package com.huawei.hms.push.task;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.push.SubscribeResult;
import com.huawei.hms.push.b;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.push.SubscribeNotificationReq;
import com.huawei.hms.support.api.entity.push.SubscribeNotificationResp;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import o.ViewLayerCompanionOutlineProvider1;

/* JADX INFO: loaded from: classes4.dex */
public class SubscribeNotificationTask extends TaskApiCall<PushClient, SubscribeResult> {
    private Activity a;

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 6;
    }

    public SubscribeNotificationTask(Activity activity, String str, SubscribeNotificationReq subscribeNotificationReq, String str2) {
        super(str, JsonUtil.createJsonString(subscribeNotificationReq), str2);
        this.a = activity;
    }

    private boolean a(PushClient pushClient, ResponseErrorCode responseErrorCode) {
        Parcelable parcelable = responseErrorCode.getParcelable();
        if (!(parcelable instanceof Intent)) {
            HMSLog.e("SubscribeNotificationTask", "not instance of intent");
            return false;
        }
        Intent intent = (Intent) parcelable;
        intent.putExtra("app_token", BaseUtils.getLocalToken(pushClient.getContext(), null));
        this.a.startActivityForResult(intent, 1001);
        return true;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1) {
        if (responseErrorCode.getErrorCode() != 0) {
            HMSLog.e("SubscribeNotificationTask", "Notification subscribe failed, error code: " + responseErrorCode.getErrorCode());
            a(responseErrorCode, viewLayerCompanionOutlineProvider1);
        } else {
            SubscribeNotificationResp subscribeNotificationResp = (SubscribeNotificationResp) JsonUtil.jsonToEntity(str, new SubscribeNotificationResp());
            ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(subscribeNotificationResp.getRetCode());
            if (errorEnumFromCode != ErrorEnum.SUCCESS) {
                viewLayerCompanionOutlineProvider1.read(errorEnumFromCode.toApiException());
                HMSLog.e("PushLogSC3004", "Notification Subscription failed, StatusCode:" + errorEnumFromCode.getExternalCode());
            } else if (!responseErrorCode.hasResolution()) {
                SubscribeResult subscribeResult = new SubscribeResult();
                subscribeResult.setSubscribedItems(b.a(subscribeNotificationResp.getSubscribeResults()));
                viewLayerCompanionOutlineProvider1.IconCompatParcelizer(subscribeResult);
            } else if (a(pushClient, responseErrorCode)) {
                viewLayerCompanionOutlineProvider1.IconCompatParcelizer(new SubscribeResult());
            } else {
                viewLayerCompanionOutlineProvider1.read(ErrorEnum.ERROR_PUSH_INTERNAL_ERROR.toApiException());
            }
        }
        PushBiUtil.reportExit(pushClient.getContext(), getUri(), responseErrorCode);
    }

    private void a(ResponseErrorCode responseErrorCode, ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1) {
        ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
        if (errorEnumFromCode != ErrorEnum.ERROR_UNKNOWN) {
            viewLayerCompanionOutlineProvider1.read(errorEnumFromCode.toApiException());
        } else {
            viewLayerCompanionOutlineProvider1.read(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }
}
