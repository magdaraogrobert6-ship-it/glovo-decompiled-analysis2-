package com.huawei.hms.push.ups;

import android.content.Context;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.HmsMessaging;
import com.huawei.hms.push.d;
import com.huawei.hms.push.ups.entity.CodeResult;
import com.huawei.hms.push.ups.entity.TokenResult;
import com.huawei.hms.push.ups.entity.UPSRegisterCallBack;
import com.huawei.hms.push.ups.entity.UPSTurnCallBack;
import com.huawei.hms.push.ups.entity.UPSUnRegisterCallBack;
import com.huawei.hms.support.log.HMSLog;
import o.ViewLayerUniqueDrawingIdApi29;
import o.accessgetViewRootjd;
import o.getCameraDistancePx;
import o.getShouldUseDispatchDraw;
import o.resetClipBounds;
import o.setShouldUseDispatchDrawui;

/* JADX INFO: loaded from: classes4.dex */
public final class UPSService {
    private UPSService() {
    }

    public static void registerToken(Context context, String str, String str2, String str3, UPSRegisterCallBack uPSRegisterCallBack) {
        HMSLog.i("UPSService", "invoke registerToken");
        Preconditions.checkNotNull(uPSRegisterCallBack);
        if (!d.b()) {
            uPSRegisterCallBack.onResult(new TokenResult(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.getExternalCode()));
            return;
        }
        try {
            uPSRegisterCallBack.onResult(new TokenResult(HmsInstanceId.getInstance(context).getToken(str, null)));
        } catch (ApiException e) {
            uPSRegisterCallBack.onResult(new TokenResult(e.getStatusCode(), e.getMessage()));
        }
    }

    public static void turnOffPush(Context context, final UPSTurnCallBack uPSTurnCallBack) {
        HMSLog.i("UPSService", "invoke turnOffPush");
        Preconditions.checkNotNull(uPSTurnCallBack);
        if (!d.b()) {
            uPSTurnCallBack.onResult(new TokenResult(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.getExternalCode()));
            return;
        }
        setShouldUseDispatchDrawui setshouldusedispatchdrawuiTurnOffPush = HmsMessaging.getInstance(context).turnOffPush();
        getCameraDistancePx getcameradistancepx = new getCameraDistancePx() { // from class: com.huawei.hms.push.ups.UPSService.2
            @Override // o.getCameraDistancePx
            public void onComplete(setShouldUseDispatchDrawui setshouldusedispatchdrawui) {
                if (setshouldusedispatchdrawui.serializer()) {
                    uPSTurnCallBack.onResult(new CodeResult());
                } else {
                    ApiException apiException = (ApiException) setshouldusedispatchdrawui.read();
                    uPSTurnCallBack.onResult(new CodeResult(apiException.getStatusCode(), apiException.getMessage()));
                }
            }
        };
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = (ViewLayerUniqueDrawingIdApi29) setshouldusedispatchdrawuiTurnOffPush;
        viewLayerUniqueDrawingIdApi29.getClass();
        viewLayerUniqueDrawingIdApi29.read((resetClipBounds) new accessgetViewRootjd(getShouldUseDispatchDraw.write.read, getcameradistancepx));
    }

    public static void turnOnPush(Context context, final UPSTurnCallBack uPSTurnCallBack) {
        HMSLog.i("UPSService", "invoke turnOnPush");
        Preconditions.checkNotNull(uPSTurnCallBack);
        if (!d.b()) {
            uPSTurnCallBack.onResult(new TokenResult(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.getExternalCode()));
            return;
        }
        setShouldUseDispatchDrawui setshouldusedispatchdrawuiTurnOnPush = HmsMessaging.getInstance(context).turnOnPush();
        getCameraDistancePx getcameradistancepx = new getCameraDistancePx() { // from class: com.huawei.hms.push.ups.UPSService.1
            @Override // o.getCameraDistancePx
            public void onComplete(setShouldUseDispatchDrawui setshouldusedispatchdrawui) {
                if (setshouldusedispatchdrawui.serializer()) {
                    uPSTurnCallBack.onResult(new CodeResult());
                } else {
                    ApiException apiException = (ApiException) setshouldusedispatchdrawui.read();
                    uPSTurnCallBack.onResult(new CodeResult(apiException.getStatusCode(), apiException.getMessage()));
                }
            }
        };
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = (ViewLayerUniqueDrawingIdApi29) setshouldusedispatchdrawuiTurnOnPush;
        viewLayerUniqueDrawingIdApi29.getClass();
        viewLayerUniqueDrawingIdApi29.read((resetClipBounds) new accessgetViewRootjd(getShouldUseDispatchDraw.write.read, getcameradistancepx));
    }

    public static void unRegisterToken(Context context, UPSUnRegisterCallBack uPSUnRegisterCallBack) {
        HMSLog.i("UPSService", "invoke unRegisterToken");
        Preconditions.checkNotNull(uPSUnRegisterCallBack);
        if (!d.b()) {
            uPSUnRegisterCallBack.onResult(new TokenResult(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.getExternalCode()));
            return;
        }
        try {
            HmsInstanceId.getInstance(context).deleteToken(null, null);
            uPSUnRegisterCallBack.onResult(new TokenResult());
        } catch (ApiException e) {
            uPSUnRegisterCallBack.onResult(new TokenResult(e.getStatusCode(), e.getMessage()));
        }
    }
}
