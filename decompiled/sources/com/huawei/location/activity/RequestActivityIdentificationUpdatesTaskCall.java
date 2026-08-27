package com.huawei.location.activity;

import android.app.PendingIntent;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hms.location.api.request.RequestActivityIdentificationReq;
import com.huawei.hms.location.api.response.RequestActivityIdentificationResp;
import com.huawei.location.base.activity.constant.ActivityErrorCode;
import com.huawei.location.base.activity.entity.ClientInfo;
import com.huawei.location.lite.common.exception.LocationServiceException;
import com.huawei.location.lite.common.util.APKUtil;
import com.huawei.location.router.RouterResponse;
import com.huawei.location.router.entity.StatusInfo;
import o.MenuItemOption;
import o.WindowRecomposerFactoryCompanion;
import o.WindowRecomposerFactoryCompanionExternalSyntheticLambda0;
import o.WrappedCompositionsetContent1211;
import o.createRecomposer;
import o.setOnAutofillRequested;
import o.setOnViewCreatedCallback;

/* JADX INFO: loaded from: classes4.dex */
public class RequestActivityIdentificationUpdatesTaskCall extends BaseApiTaskCall {
    private static final String KEY_RESPONSE = "KEY_RESPONSE";
    private static final String KEY_RESPONSE_RESULT = "com.huawei.hms.location.internal.EXTRA_ACTIVITY_RESULT";
    private static final String TAG = "RequestActivityIdentificationUpdatesAPI";
    private WindowRecomposerFactoryCompanionExternalSyntheticLambda0 callBackInfo;
    private ClientInfo clientInfo;
    private PendingIntent pendingIntent;
    private RequestActivityIdentificationReq requestActivityIdentificationReq = null;

    /* JADX INFO: Access modifiers changed from: private */
    public String getTAG() {
        return TAG;
    }

    private boolean checkRequest(RequestActivityIdentificationReq requestActivityIdentificationReq) {
        RouterResponse routerResponse;
        if (requestActivityIdentificationReq.getPackageName().isEmpty()) {
            WrappedCompositionsetContent1211.read(TAG, "packageName is invalid");
            routerResponse = new RouterResponse(new Gson().toJson(new RequestActivityIdentificationResp()), new StatusInfo(0, 10101, ActivityErrorCode.getErrorCodeMessage(10101)));
        } else {
            if (!requestActivityIdentificationReq.getLocTransactionId().isEmpty()) {
                return true;
            }
            WrappedCompositionsetContent1211.read(TAG, "tid is invalid");
            routerResponse = new RouterResponse(new Gson().toJson(new RequestActivityIdentificationResp()), new StatusInfo(0, 10101, ActivityErrorCode.getErrorCodeMessage(10101)));
        }
        onComplete(routerResponse);
        return false;
    }

    private void getCallback() {
        WindowRecomposerFactoryCompanion windowRecomposerFactoryCompanionRemoteActionCompatParcelizer = this.pendingIntent != null ? createRecomposer.write().RemoteActionCompatParcelizer(this.pendingIntent) : createRecomposer.write().read(getRouterCallback());
        if (windowRecomposerFactoryCompanionRemoteActionCompatParcelizer instanceof WindowRecomposerFactoryCompanionExternalSyntheticLambda0) {
            this.callBackInfo = (WindowRecomposerFactoryCompanionExternalSyntheticLambda0) windowRecomposerFactoryCompanionRemoteActionCompatParcelizer;
        }
    }

    private PendingIntent getPendingIntent() {
        Parcelable parcelable = getParcelable();
        if (parcelable instanceof PendingIntent) {
            this.pendingIntent = (PendingIntent) parcelable;
        }
        return this.pendingIntent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeActivityIdentificationUpdates() {
        int i;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "removeActivityIdentificationUpdates start");
        if (this.callBackInfo != null) {
            try {
                setOnAutofillRequested.read().RemoteActionCompatParcelizer(this.callBackInfo.RemoteActionCompatParcelizer, this.clientInfo);
                createRecomposer.write().RemoteActionCompatParcelizer(this.callBackInfo);
            } catch (LocationServiceException e) {
                int i2 = e.read;
                this.errorReason = "removeActivityUpdates in request api LocationServiceException:" + e.getMessage();
                i = i2;
            } catch (Exception unused) {
                this.errorReason = "removeActivityUpdates in request api exception";
                i = 10000;
            }
        }
        i = 0;
        this.reportBuilder.yn(this.requestActivityIdentificationReq);
        this.reportBuilder.RemoteActionCompatParcelizer("AR_removeActivityState");
        this.reportBuilder.serializer().write(String.valueOf(i));
    }

    @Override // com.huawei.location.router.interfaces.IRouterRequest
    public void onRequest(String str) {
        String str2;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "onRequest start");
        this.reportBuilder.RemoteActionCompatParcelizer("AR_requestActivityState");
        try {
            MenuItemOption.IconCompatParcelizer(str);
            RequestActivityIdentificationReq requestActivityIdentificationReq = (RequestActivityIdentificationReq) new Gson().fromJson(str, RequestActivityIdentificationReq.class);
            this.requestActivityIdentificationReq = requestActivityIdentificationReq;
            if (!checkRequest(requestActivityIdentificationReq)) {
                this.reportBuilder.yn(this.requestActivityIdentificationReq);
                this.reportBuilder.serializer().IconCompatParcelizer(String.valueOf(this.errorCode));
                return;
            }
            String locTransactionId = this.requestActivityIdentificationReq.getLocTransactionId();
            String packageName = this.requestActivityIdentificationReq.getPackageName();
            this.clientInfo = new ClientInfo(packageName, APKUtil.getUidByPackageName(packageName), 0, locTransactionId);
            long detectionIntervalMillis = this.requestActivityIdentificationReq.getDetectionIntervalMillis();
            if (detectionIntervalMillis <= 0) {
                detectionIntervalMillis = 30000;
            }
            this.pendingIntent = getPendingIntent();
            getCallback();
            saveCallbackInfo();
            setOnAutofillRequested.read().read(detectionIntervalMillis, this.callBackInfo.RemoteActionCompatParcelizer, this.clientInfo);
            this.errorReason = "requestActivityIdentificationUpdates success";
            if (this.errorCode != 0 || this.callBackInfo.write != null) {
                doExecute(new RouterResponse(new Gson().toJson(new RequestActivityIdentificationResp()), new StatusInfo(0, this.errorCode, this.errorReason)));
            }
            this.reportBuilder.yn(this.requestActivityIdentificationReq);
            this.reportBuilder.serializer().IconCompatParcelizer(String.valueOf(this.errorCode));
        } catch (JsonSyntaxException unused) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "requestActivityIdentificationUpdatesTaskCall json parse failed");
            this.errorCode = 10000;
            str2 = "onRequest requestActivityIdentificationUpdates json parse exception";
            this.errorReason = str2;
        } catch (LocationServiceException e) {
            this.errorCode = e.read;
            str2 = "onRequest requestActivityIdentificationUpdates LocationServiceException:" + e.getMessage();
            this.errorReason = str2;
        } catch (Exception unused2) {
            this.errorCode = 10000;
            str2 = "onRequest requestActivityIdentificationUpdates exception";
            this.errorReason = str2;
        }
    }

    private void saveCallbackInfo() {
        if (this.callBackInfo == null) {
            WindowRecomposerFactoryCompanionExternalSyntheticLambda0 windowRecomposerFactoryCompanionExternalSyntheticLambda0 = new WindowRecomposerFactoryCompanionExternalSyntheticLambda0();
            this.callBackInfo = windowRecomposerFactoryCompanionExternalSyntheticLambda0;
            windowRecomposerFactoryCompanionExternalSyntheticLambda0.RemoteActionCompatParcelizer = new setOnViewCreatedCallback(this);
            windowRecomposerFactoryCompanionExternalSyntheticLambda0.write = this.pendingIntent;
            windowRecomposerFactoryCompanionExternalSyntheticLambda0.serializer = getRouterCallback();
            createRecomposer.write().IconCompatParcelizer(this.callBackInfo);
        }
    }
}
