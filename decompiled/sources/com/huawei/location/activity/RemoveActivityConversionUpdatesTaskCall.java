package com.huawei.location.activity;

import android.app.PendingIntent;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hms.location.api.request.RemoveActivityConversionReq;
import com.huawei.hms.location.api.response.RequestActivityConversionResp;
import com.huawei.location.base.activity.constant.ActivityErrorCode;
import com.huawei.location.base.activity.constant.ActivityRecognitionConstants;
import com.huawei.location.base.activity.entity.ClientInfo;
import com.huawei.location.lite.common.exception.LocationServiceException;
import com.huawei.location.lite.common.util.APKUtil;
import com.huawei.location.router.RouterResponse;
import com.huawei.location.router.entity.StatusInfo;
import o.MenuItemOption;
import o.WindowRecomposerFactoryCompanion;
import o.WrappedCompositionsetContent1211;
import o.createRecomposer;
import o.r8lambdaFWAPLXs0qWMqekhMr83xkKattCY;
import o.setOnAutofillRequested;

/* JADX INFO: loaded from: classes4.dex */
public class RemoveActivityConversionUpdatesTaskCall extends BaseApiTaskCall {
    private static final String TAG = "RemoveActivityConversionUpdatesAPI";

    private WindowRecomposerFactoryCompanion getBaseCallbackMapping(PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            return createRecomposer.read().read(getRouterCallback());
        }
        WindowRecomposerFactoryCompanion windowRecomposerFactoryCompanionRemoteActionCompatParcelizer = createRecomposer.read().RemoteActionCompatParcelizer(pendingIntent);
        if (windowRecomposerFactoryCompanionRemoteActionCompatParcelizer != null) {
            return windowRecomposerFactoryCompanionRemoteActionCompatParcelizer;
        }
        throw new LocationServiceException(ActivityErrorCode.NO_MATCHED_INTENT, "NO_MATCHED_INTENT");
    }

    private boolean checkRequest(RemoveActivityConversionReq removeActivityConversionReq) {
        if (removeActivityConversionReq != null && removeActivityConversionReq.getPackageName() != null && removeActivityConversionReq.getLocTransactionId() != null) {
            if (!removeActivityConversionReq.getPackageName().isEmpty() && !removeActivityConversionReq.getLocTransactionId().isEmpty()) {
                return true;
            }
            dealRequest();
            return false;
        }
        dealRequest();
        return false;
    }

    private void dealRequest() {
        onComplete(new RouterResponse(new Gson().toJson(new RequestActivityConversionResp()), new StatusInfo(0, 10101, ActivityErrorCode.getErrorCodeMessage(10101))));
        this.errorCode = 10101;
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
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "onRequest start");
        this.reportBuilder.RemoteActionCompatParcelizer("AR_removeActivityTransition");
        RemoveActivityConversionReq removeActivityConversionReq = null;
        try {
            MenuItemOption.IconCompatParcelizer(str);
            RemoveActivityConversionReq removeActivityConversionReq2 = (RemoveActivityConversionReq) new Gson().fromJson(str, RemoveActivityConversionReq.class);
            try {
                if (!checkRequest(removeActivityConversionReq2)) {
                    this.reportBuilder.yn(removeActivityConversionReq2);
                    this.reportBuilder.serializer().IconCompatParcelizer(String.valueOf(this.errorCode));
                    return;
                }
                removeActivityConversionReq2.setModuleName(ActivityRecognitionConstants.LOCATION_MODULE);
                String locTransactionId = removeActivityConversionReq2.getLocTransactionId();
                String packageName = removeActivityConversionReq2.getPackageName();
                ClientInfo clientInfo = new ClientInfo(packageName, APKUtil.getUidByPackageName(packageName), 0, locTransactionId);
                WindowRecomposerFactoryCompanion baseCallbackMapping = getBaseCallbackMapping(getPendingIntent());
                r8lambdaFWAPLXs0qWMqekhMr83xkKattCY r8lambdafwaplxs0qwmqekhmr83xkkattcy = new r8lambdaFWAPLXs0qWMqekhMr83xkKattCY();
                if (baseCallbackMapping instanceof r8lambdaFWAPLXs0qWMqekhMr83xkKattCY) {
                    r8lambdafwaplxs0qwmqekhmr83xkkattcy = (r8lambdaFWAPLXs0qWMqekhMr83xkKattCY) baseCallbackMapping;
                }
                MenuItemOption.IconCompatParcelizer(r8lambdafwaplxs0qwmqekhmr83xkkattcy.IconCompatParcelizer);
                removeActivityConversionReq2.getModuleName();
                setOnAutofillRequested.read().write(r8lambdafwaplxs0qwmqekhmr83xkkattcy.IconCompatParcelizer, clientInfo);
                createRecomposer.read().RemoteActionCompatParcelizer(r8lambdafwaplxs0qwmqekhmr83xkkattcy);
                this.errorReason = "removeActivityConversionUpdates success";
                this.reportBuilder.yn(removeActivityConversionReq2);
                this.reportBuilder.serializer().IconCompatParcelizer(String.valueOf(this.errorCode));
                doExecute(new RouterResponse(new Gson().toJson(new RequestActivityConversionResp()), new StatusInfo(0, this.errorCode, this.errorReason)));
            } catch (JsonSyntaxException unused) {
                removeActivityConversionReq = removeActivityConversionReq2;
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "removeActivityConversionUpdatesTaskCall json parse failed");
                this.errorCode = 10000;
                this.errorReason = "onRequest removeActivityConversionUpdates exception";
                removeActivityConversionReq2 = removeActivityConversionReq;
            } catch (LocationServiceException e2) {
                e = e2;
                removeActivityConversionReq = removeActivityConversionReq2;
                this.errorCode = e.read;
                this.errorReason = "onRequest removeActivityConversionUpdates LocationServiceException:" + e.getMessage();
                removeActivityConversionReq2 = removeActivityConversionReq;
            } catch (Exception unused2) {
                removeActivityConversionReq = removeActivityConversionReq2;
                this.errorCode = 10000;
                this.errorReason = "onRequest removeActivityConversionUpdates exception";
                removeActivityConversionReq2 = removeActivityConversionReq;
            }
        } catch (JsonSyntaxException unused3) {
        } catch (LocationServiceException e3) {
            e = e3;
        } catch (Exception unused4) {
        }
    }
}
