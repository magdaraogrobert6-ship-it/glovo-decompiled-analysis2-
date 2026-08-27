package com.huawei.hms.push;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.notification.SubscribedItem;
import com.huawei.hms.push.task.SubscribeNotificationTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.api.entity.push.SubscribeNotificationReq;
import com.huawei.hms.support.log.HMSLog;
import java.util.Iterator;
import java.util.List;
import o.ViewLayerUniqueDrawingIdApi29;
import o.getHasRetrievedMethod;
import o.setShouldUseDispatchDrawui;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public class NotificationSubscription {
    public static final int NOTIFICATION_SUBSCRIBE_REQUEST_CODE = 1001;
    private static final String d = "NotificationSubscription";
    private Activity a;
    private Context b;
    private HuaweiApi<Api.ApiOptions.NoOptions> c;

    private SubscribeNotificationReq b(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        SubscribeNotificationReq subscribeNotificationReq = new SubscribeNotificationReq();
        subscribeNotificationReq.setEntityIds(jSONArray.toString());
        subscribeNotificationReq.setToken(BaseUtils.getLocalToken(this.b, null));
        return subscribeNotificationReq;
    }

    public static NotificationSubscription getInstance(Activity activity) {
        return new NotificationSubscription(activity);
    }

    private NotificationSubscription(Activity activity) {
        Preconditions.checkNotNull(activity);
        this.b = activity.getApplicationContext();
        this.a = activity;
        HuaweiApi<Api.ApiOptions.NoOptions> huaweiApi = new HuaweiApi<>(activity, (Api<Api.ApiOptions>) new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH), (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        this.c = huaweiApi;
        huaweiApi.setKitSdkVersion(61300301);
    }

    private setShouldUseDispatchDrawui a(List<String> list) {
        String strReportEntry = PushBiUtil.reportEntry(this.b, PushNaming.SUBSCRIBE_NOTIFICATION);
        if (list == null || list.isEmpty() || list.size() > 3) {
            Context context = this.b;
            ErrorEnum errorEnum = ErrorEnum.ERROR_ARGUMENTS_INVALID;
            PushBiUtil.reportExit(context, PushNaming.SUBSCRIBE_NOTIFICATION, strReportEntry, errorEnum);
            HMSLog.e(d, "Invalid entityIds: entityId list should not be empty or more than max size");
            return a(errorEnum.toApiException());
        }
        Looper mainLooper = Looper.getMainLooper();
        Looper looperMyLooper = Looper.myLooper();
        Context context2 = this.b;
        if (mainLooper == looperMyLooper) {
            ErrorEnum errorEnum2 = ErrorEnum.ERROR_MAIN_THREAD;
            PushBiUtil.reportExit(context2, PushNaming.SUBSCRIBE_NOTIFICATION, strReportEntry, errorEnum2);
            return a(errorEnum2.toApiException());
        }
        if (!((NotificationManager) context2.getSystemService(RemoteMessageConst.NOTIFICATION)).areNotificationsEnabled()) {
            HMSLog.i(d, "App disabled notification");
            Context context3 = this.b;
            ErrorEnum errorEnum3 = ErrorEnum.ERROR_NOTIFICATION_DISABLED;
            PushBiUtil.reportExit(context3, PushNaming.SUBSCRIBE_NOTIFICATION, strReportEntry, errorEnum3);
            return a(errorEnum3.toApiException());
        }
        try {
            if (v.a(this.b) != ErrorEnum.SUCCESS) {
                return a(ErrorEnum.ERROR_NO_TOKEN.toApiException());
            }
            if (-1 != this.b.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.b.getPackageName()) && g.a(this.b) == -1) {
                HMSLog.e(d, "no network");
                return a(ErrorEnum.ERROR_NO_NETWORK.toApiException());
            }
            setShouldUseDispatchDrawui setshouldusedispatchdrawuiDoWrite = this.c.doWrite(new SubscribeNotificationTask(this.a, PushNaming.SUBSCRIBE_NOTIFICATION, b(list), strReportEntry));
            getHasRetrievedMethod.read(setshouldusedispatchdrawuiDoWrite);
            return setshouldusedispatchdrawuiDoWrite;
        } catch (Exception e) {
            if (e.getCause() instanceof ApiException) {
                ApiException apiException = (ApiException) e.getCause();
                PushBiUtil.reportExit(this.b, PushNaming.SUBSCRIBE_NOTIFICATION, strReportEntry, apiException.getStatusCode());
                return a(apiException);
            }
            Context context4 = this.b;
            ErrorEnum errorEnum4 = ErrorEnum.ERROR_INTERNAL_ERROR;
            PushBiUtil.reportExit(context4, PushNaming.SUBSCRIBE_NOTIFICATION, strReportEntry, errorEnum4);
            return a(errorEnum4.toApiException());
        }
    }

    public setShouldUseDispatchDrawui requestSubscribeNotification(List<String> list) {
        HMSLog.i(d, "invoke request subscribe notification");
        return a(list);
    }

    public static SubscribeResult getSubscribeResult(Intent intent) {
        if (intent == null) {
            return null;
        }
        try {
            String stringExtra = intent.getStringExtra("errorMsg");
            if (!TextUtils.isEmpty(stringExtra)) {
                SubscribeResult subscribeResult = new SubscribeResult();
                subscribeResult.setErrorMsg(stringExtra);
                HMSLog.e(d, "get subscribe error msg:" + stringExtra);
                return subscribeResult;
            }
            String stringExtra2 = intent.getStringExtra("subscribedItems");
            if (!TextUtils.isEmpty(stringExtra2)) {
                List<SubscribedItem> listA = b.a(stringExtra2);
                SubscribeResult subscribeResult2 = new SubscribeResult();
                subscribeResult2.setSubscribedItems(listA);
                return subscribeResult2;
            }
            return null;
        } catch (Throwable unused) {
            HMSLog.e(d, "get subscribe result occurs exception");
        }
    }

    private setShouldUseDispatchDrawui a(Exception exc) {
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        viewLayerUniqueDrawingIdApi29.serializer(exc);
        return viewLayerUniqueDrawingIdApi29;
    }
}
