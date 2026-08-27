package com.huawei.location.activity;

import android.app.PendingIntent;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hms.location.ActivityConversionInfo;
import com.huawei.hms.location.api.request.RequestActivityConversionReq;
import com.huawei.hms.location.api.response.RequestActivityConversionResp;
import com.huawei.hms.location.entity.activity.ActivityTransition;
import com.huawei.hms.location.entity.activity.ActivityTransitionRequest;
import com.huawei.location.base.activity.constant.ActivityErrorCode;
import com.huawei.location.base.activity.constant.ActivityRecognitionConstants;
import com.huawei.location.base.activity.entity.ClientInfo;
import com.huawei.location.lite.common.exception.LocationServiceException;
import com.huawei.location.lite.common.util.APKUtil;
import com.huawei.location.router.RouterResponse;
import com.huawei.location.router.entity.StatusInfo;
import java.util.ArrayList;
import java.util.List;
import o.MenuItemOption;
import o.WindowRecomposerFactoryCompanion;
import o.WrappedCompositionsetContent1211;
import o.createRecomposer;
import o.r8lambdaFWAPLXs0qWMqekhMr83xkKattCY;
import o.setOnAutofillRequested;
import o.setOnViewCreatedCallback;

/* JADX INFO: loaded from: classes4.dex */
public class RequestActivityConversionUpdatesTaskCall extends BaseApiTaskCall {
    private static final String KEY_RESPONSE = "KEY_RESPONSE";
    private static final String KEY_RESPONSE_RESULT = "com.huawei.hms.location.internal.EXTRA_ACTIVITY_CONVERSION_RESULT";
    private static final String TAG = "RequestActivityConversionUpdatesAPI";
    private r8lambdaFWAPLXs0qWMqekhMr83xkKattCY callBackInfo;
    private ClientInfo clientInfo;
    private String moduleName;
    private PendingIntent pendingIntent;
    private RequestActivityConversionReq requestActivityConversionReq = null;

    /* JADX INFO: Access modifiers changed from: private */
    public String getTAG() {
        return TAG;
    }

    private List<ActivityTransition> getTransitionLists() {
        List<ActivityConversionInfo> activityConversions = this.requestActivityConversionReq.getActivityConversions();
        ArrayList arrayList = new ArrayList();
        for (ActivityConversionInfo activityConversionInfo : activityConversions) {
            ActivityTransition activityTransition = new ActivityTransition();
            activityTransition.setActivityType(activityConversionInfo.getActivityType() - 100);
            activityTransition.setTransitionType(activityConversionInfo.getConversionType());
            arrayList.add(activityTransition);
        }
        return arrayList;
    }

    private boolean checkRequest(RequestActivityConversionReq requestActivityConversionReq) {
        RouterResponse routerResponse;
        if (requestActivityConversionReq.getPackageName().isEmpty()) {
            WrappedCompositionsetContent1211.read(TAG, "packageName is invalid");
            routerResponse = new RouterResponse(new Gson().toJson(new RequestActivityConversionResp()), new StatusInfo(0, 10101, ActivityErrorCode.getErrorCodeMessage(10101)));
        } else if (requestActivityConversionReq.getLocTransactionId().isEmpty()) {
            WrappedCompositionsetContent1211.read(TAG, "tid is invalid");
            routerResponse = new RouterResponse(new Gson().toJson(new RequestActivityConversionResp()), new StatusInfo(0, 10101, ActivityErrorCode.getErrorCodeMessage(10101)));
        } else {
            if (!requestActivityConversionReq.getModuleName().isEmpty()) {
                return true;
            }
            WrappedCompositionsetContent1211.read(TAG, "ModuleName is invalid");
            routerResponse = new RouterResponse(new Gson().toJson(new RequestActivityConversionResp()), new StatusInfo(0, 10101, ActivityErrorCode.getErrorCodeMessage(10101)));
        }
        onComplete(routerResponse);
        return false;
    }

    private void getCallback() {
        WindowRecomposerFactoryCompanion windowRecomposerFactoryCompanionRemoteActionCompatParcelizer = this.pendingIntent != null ? createRecomposer.read().RemoteActionCompatParcelizer(this.pendingIntent) : createRecomposer.write().read(getRouterCallback());
        if (windowRecomposerFactoryCompanionRemoteActionCompatParcelizer instanceof r8lambdaFWAPLXs0qWMqekhMr83xkKattCY) {
            this.callBackInfo = (r8lambdaFWAPLXs0qWMqekhMr83xkKattCY) windowRecomposerFactoryCompanionRemoteActionCompatParcelizer;
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
    public void removeActivityConversionUpdates() {
        int i;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "removeActivityConversionUpdates start");
        if (this.callBackInfo != null) {
            try {
                setOnAutofillRequested.read().write(this.callBackInfo.IconCompatParcelizer, this.clientInfo);
                createRecomposer.read().RemoteActionCompatParcelizer(this.callBackInfo);
            } catch (LocationServiceException e) {
                int i2 = e.read;
                this.errorReason = "removeActivityConversionUpdates in request api LocationServiceException:" + e.getMessage();
                i = i2;
            } catch (Exception unused) {
                this.errorReason = "removeActivityConversionUpdates in request api exception";
                i = 10000;
            }
        }
        i = 0;
        this.reportBuilder.yn(this.requestActivityConversionReq);
        this.reportBuilder.RemoteActionCompatParcelizer("AR_removeActivityTransition");
        this.reportBuilder.serializer().write(String.valueOf(i));
    }

    private void saveCallbackInfo() {
        if (this.callBackInfo == null) {
            r8lambdaFWAPLXs0qWMqekhMr83xkKattCY r8lambdafwaplxs0qwmqekhmr83xkkattcy = new r8lambdaFWAPLXs0qWMqekhMr83xkKattCY();
            this.callBackInfo = r8lambdafwaplxs0qwmqekhmr83xkkattcy;
            r8lambdafwaplxs0qwmqekhmr83xkkattcy.IconCompatParcelizer = new setOnViewCreatedCallback(this);
            r8lambdafwaplxs0qwmqekhmr83xkkattcy.write = this.pendingIntent;
            r8lambdafwaplxs0qwmqekhmr83xkkattcy.serializer = getRouterCallback();
            createRecomposer.read().IconCompatParcelizer(this.callBackInfo);
        }
    }

    @Override // com.huawei.location.router.interfaces.IRouterRequest
    public void onRequest(String str) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "onRequest start");
        this.reportBuilder.RemoteActionCompatParcelizer("AR_requestActivityTransition");
        try {
            MenuItemOption.IconCompatParcelizer(str);
            RequestActivityConversionReq requestActivityConversionReq = (RequestActivityConversionReq) new Gson().fromJson(str, RequestActivityConversionReq.class);
            this.requestActivityConversionReq = requestActivityConversionReq;
            if (requestActivityConversionReq.getModuleName() == null || this.requestActivityConversionReq.getModuleName().isEmpty()) {
                this.requestActivityConversionReq.setModuleName(ActivityRecognitionConstants.LOCATION_MODULE);
            }
            if (!checkRequest(this.requestActivityConversionReq)) {
                this.reportBuilder.yn(this.requestActivityConversionReq);
                this.reportBuilder.serializer().IconCompatParcelizer(String.valueOf(this.errorCode));
                return;
            }
            String locTransactionId = this.requestActivityConversionReq.getLocTransactionId();
            String packageName = this.requestActivityConversionReq.getPackageName();
            this.clientInfo = new ClientInfo(packageName, APKUtil.getUidByPackageName(packageName), 0, locTransactionId);
            this.pendingIntent = getPendingIntent();
            getCallback();
            saveCallbackInfo();
            List<ActivityTransition> transitionLists = getTransitionLists();
            ActivityTransitionRequest activityTransitionRequest = new ActivityTransitionRequest();
            activityTransitionRequest.setTransitions(transitionLists);
            this.moduleName = this.requestActivityConversionReq.getModuleName();
            setOnAutofillRequested.read().read(activityTransitionRequest, this.callBackInfo.IconCompatParcelizer, this.clientInfo);
            this.errorReason = "requestActivityConversionUpdates success";
            if (this.errorCode != 0 || this.callBackInfo.write != null) {
                doExecute(new RouterResponse(new Gson().toJson(new RequestActivityConversionResp()), new StatusInfo(0, this.errorCode, this.errorReason)));
            }
            this.reportBuilder.yn(this.requestActivityConversionReq);
            this.reportBuilder.serializer().IconCompatParcelizer(String.valueOf(this.errorCode));
        } catch (JsonSyntaxException unused) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "requestActivityConversionUpdatesTaskCall json parse failed");
            this.errorCode = 10000;
            this.errorReason = "onRequest requestActivityConversionUpdates exception";
        } catch (LocationServiceException e) {
            this.errorCode = e.read;
            this.errorReason = "onRequest requestActivityConversionUpdates LocationServiceException:" + e.getMessage();
        } catch (Exception unused2) {
            this.errorCode = 10000;
            this.errorReason = "onRequest requestActivityConversionUpdates exception";
        }
    }
}
