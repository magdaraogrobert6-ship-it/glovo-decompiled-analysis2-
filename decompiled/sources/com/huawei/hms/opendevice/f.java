package com.huawei.hms.opendevice;

import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.DeleteTokenReq;
import com.huawei.hms.aaid.entity.DeleteTokenResp;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import o.ViewLayerCompanionOutlineProvider1;

/* JADX INFO: loaded from: classes2.dex */
public class f extends TaskApiCall<PushClient, Void> {
    private DeleteTokenReq a;

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return this.a.isMultiSender() ? 50004300 : 30000000;
    }

    public f(String str, DeleteTokenReq deleteTokenReq, String str2) {
        super(str, JsonUtil.createJsonString(deleteTokenReq), str2);
        this.a = deleteTokenReq;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1) {
        if (responseErrorCode.getErrorCode() != 0) {
            HMSLog.e(HmsInstanceId.TAG, "DeleteTokenTask failed, ErrorCode: " + responseErrorCode.getErrorCode());
            viewLayerCompanionOutlineProvider1.read(ErrorEnum.fromCode(responseErrorCode.getErrorCode()).toApiException());
            return;
        }
        ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(((DeleteTokenResp) JsonUtil.jsonToEntity(str, new DeleteTokenResp())).getRetCode());
        if (errorEnumFromCode != ErrorEnum.SUCCESS) {
            viewLayerCompanionOutlineProvider1.read(errorEnumFromCode.toApiException());
        } else {
            viewLayerCompanionOutlineProvider1.IconCompatParcelizer(null);
            h.a(pushClient.getContext(), getUri(), responseErrorCode);
        }
    }
}
