package com.huawei.location.activity;

import android.app.PendingIntent;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hms.location.api.request.BaseLocationReq;
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

/* JADX INFO: loaded from: classes4.dex */
public class RemoveActivityIdentificationUpdatesTaskCall extends BaseApiTaskCall {
    private static final String TAG = "RemoveActivityIdentificationUpdatesAPI";

    private boolean checkRequest(BaseLocationReq baseLocationReq) {
        if (!baseLocationReq.getLocTransactionId().isEmpty() && !baseLocationReq.getPackageName().isEmpty()) {
            return true;
        }
        WrappedCompositionsetContent1211.read(TAG, "tid or packageName is invalid");
        onComplete(new RouterResponse(new Gson().toJson(new RequestActivityIdentificationResp()), new StatusInfo(0, 10101, ActivityErrorCode.getErrorCodeMessage(10101))));
        return false;
    }

    private PendingIntent getPendingIntent() {
        Parcelable parcelable = getParcelable();
        if (parcelable instanceof PendingIntent) {
            return (PendingIntent) parcelable;
        }
        return null;
    }

    @Override // com.huawei.location.router.interfaces.IRouterRequest
    public void onRequest(String str) {
        LocationServiceException e;
        WindowRecomposerFactoryCompanion windowRecomposerFactoryCompanionRemoteActionCompatParcelizer;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "onRequest start");
        this.reportBuilder.RemoteActionCompatParcelizer("AR_removeActivityState");
        BaseLocationReq baseLocationReq = null;
        try {
            MenuItemOption.IconCompatParcelizer(str);
            BaseLocationReq baseLocationReq2 = (BaseLocationReq) new Gson().fromJson(str, BaseLocationReq.class);
            try {
                if (!checkRequest(baseLocationReq2)) {
                    this.reportBuilder.yn(baseLocationReq2);
                    this.reportBuilder.serializer().IconCompatParcelizer(String.valueOf(this.errorCode));
                    return;
                }
                String locTransactionId = baseLocationReq2.getLocTransactionId();
                String packageName = baseLocationReq2.getPackageName();
                ClientInfo clientInfo = new ClientInfo(packageName, APKUtil.getUidByPackageName(packageName), 0, locTransactionId);
                PendingIntent pendingIntent = getPendingIntent();
                if (pendingIntent != null) {
                    windowRecomposerFactoryCompanionRemoteActionCompatParcelizer = createRecomposer.write().RemoteActionCompatParcelizer(pendingIntent);
                    if (windowRecomposerFactoryCompanionRemoteActionCompatParcelizer == null) {
                        throw new LocationServiceException(ActivityErrorCode.NO_MATCHED_INTENT, "NO_MATCHED_INTENT");
                    }
                } else {
                    windowRecomposerFactoryCompanionRemoteActionCompatParcelizer = createRecomposer.write().read(getRouterCallback());
                }
                WindowRecomposerFactoryCompanionExternalSyntheticLambda0 windowRecomposerFactoryCompanionExternalSyntheticLambda0 = new WindowRecomposerFactoryCompanionExternalSyntheticLambda0();
                if (windowRecomposerFactoryCompanionRemoteActionCompatParcelizer instanceof WindowRecomposerFactoryCompanionExternalSyntheticLambda0) {
                    windowRecomposerFactoryCompanionExternalSyntheticLambda0 = (WindowRecomposerFactoryCompanionExternalSyntheticLambda0) windowRecomposerFactoryCompanionRemoteActionCompatParcelizer;
                }
                MenuItemOption.IconCompatParcelizer(windowRecomposerFactoryCompanionExternalSyntheticLambda0.RemoteActionCompatParcelizer);
                setOnAutofillRequested.read().RemoteActionCompatParcelizer(windowRecomposerFactoryCompanionExternalSyntheticLambda0.RemoteActionCompatParcelizer, clientInfo);
                createRecomposer.write().RemoteActionCompatParcelizer(windowRecomposerFactoryCompanionExternalSyntheticLambda0);
                this.errorReason = "removeActivityIdentificationUpdates success";
                this.reportBuilder.yn(baseLocationReq2);
                this.reportBuilder.serializer().IconCompatParcelizer(String.valueOf(this.errorCode));
                doExecute(new RouterResponse(new Gson().toJson(new RequestActivityIdentificationResp()), new StatusInfo(0, this.errorCode, this.errorReason)));
            } catch (JsonSyntaxException unused) {
                baseLocationReq = baseLocationReq2;
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "removeActivityIdentificationUpdatesTaskCall json parse failed");
                this.errorCode = 10000;
                this.errorReason = "onRequest removeActivityIdentificationUpdates exception";
                baseLocationReq2 = baseLocationReq;
            } catch (LocationServiceException e2) {
                e = e2;
                baseLocationReq = baseLocationReq2;
                this.errorCode = e.read;
                this.errorReason = "onRequest removeActivityIdentificationUpdates LocationServiceException:" + e.getMessage();
                baseLocationReq2 = baseLocationReq;
            } catch (Exception unused2) {
                baseLocationReq = baseLocationReq2;
                this.errorCode = 10000;
                this.errorReason = "onRequest removeActivityIdentificationUpdates exception";
                baseLocationReq2 = baseLocationReq;
            }
        } catch (JsonSyntaxException unused3) {
        } catch (LocationServiceException e3) {
            e = e3;
        } catch (Exception unused4) {
        }
    }
}
