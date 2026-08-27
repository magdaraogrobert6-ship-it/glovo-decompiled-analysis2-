package com.huawei.hms.push;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.encrypt.PushEncrypter;
import com.huawei.hms.aaid.init.AutoInitHelper;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.task.BaseVoidTask;
import com.huawei.hms.push.task.IntentCallable;
import com.huawei.hms.push.task.SendUpStreamTask;
import com.huawei.hms.push.task.SubscribeTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.EnableNotifyReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.api.entity.push.SubscribeReq;
import com.huawei.hms.support.api.entity.push.UpSendMsgReq;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.hms.utils.NetWorkUtil;
import fwfd.com.fwfsdk.util.FWFHelper;
import java.util.regex.Pattern;
import o.ViewLayerUniqueDrawingIdApi29;
import o.getHasRetrievedMethod;
import o.setShouldUseDispatchDrawui;

/* JADX INFO: loaded from: classes4.dex */
public class HmsMessaging {
    public static final String DEFAULT_TOKEN_SCOPE = "HCM";
    private static final Pattern c = Pattern.compile("[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");
    private Context a;
    private HuaweiApi<Api.ApiOptions.NoOptions> b;

    public static HmsMessaging getInstance(Context context) {
        HmsMessaging hmsMessaging;
        synchronized (HmsMessaging.class) {
            hmsMessaging = new HmsMessaging(context);
        }
        return hmsMessaging;
    }

    public boolean isAutoInitEnabled() {
        return AutoInitHelper.isAutoInitEnabled(this.a);
    }

    public void setAutoInitEnabled(boolean z) {
        AutoInitHelper.setAutoInitEnabled(this.a, z);
    }

    private HmsMessaging(Context context) {
        Preconditions.checkNotNull(context);
        this.a = context;
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.b = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.b = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.b.setKitSdkVersion(61300301);
    }

    private setShouldUseDispatchDrawui a(boolean z) {
        String strReportEntry = PushBiUtil.reportEntry(this.a, PushNaming.SET_NOTIFY_FLAG);
        if (!d.d(this.a) || d.b()) {
            HMSLog.i("HmsMessaging", "turn on/off with AIDL");
            EnableNotifyReq enableNotifyReq = new EnableNotifyReq();
            enableNotifyReq.setPackageName(this.a.getPackageName());
            enableNotifyReq.setEnable(z);
            return this.b.doWrite(new BaseVoidTask(PushNaming.SET_NOTIFY_FLAG, JsonUtil.createJsonString(enableNotifyReq), strReportEntry));
        }
        if (HwBuildEx.VERSION.EMUI_SDK_INT < 12) {
            HMSLog.e("HmsMessaging", "operation not available on Huawei device with EMUI lower than 5.1");
            ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
            ErrorEnum errorEnum = ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED;
            viewLayerUniqueDrawingIdApi29.serializer(errorEnum.toApiException());
            PushBiUtil.reportExit(this.a, PushNaming.SET_NOTIFY_FLAG, strReportEntry, errorEnum);
            return viewLayerUniqueDrawingIdApi29;
        }
        if (d.b(this.a) < 90101310) {
            HMSLog.i("HmsMessaging", "turn on/off with broadcast v1");
            Intent intentPutExtra = new Intent("com.huawei.intent.action.SELF_SHOW_FLAG").putExtra("enalbeFlag", PushEncrypter.encrypterOld(this.a, this.a.getPackageName() + "#" + z));
            intentPutExtra.setPackage(FWFHelper.fwfDeviceOS);
            return getHasRetrievedMethod.serializer(new IntentCallable(this.a, intentPutExtra, strReportEntry));
        }
        if (d.b(this.a) < 110118300) {
            HMSLog.i("HmsMessaging", "turn on/off with broadcast v2");
            new PushPreferences(this.a, "push_notify_flag").saveBoolean("notify_msg_enable", !z);
            Uri uri = Uri.parse("content://" + this.a.getPackageName() + ".huawei.push.provider/push_notify_flag.xml");
            Intent intent = new Intent("com.huawei.android.push.intent.SDK_COMMAND");
            intent.putExtra("type", "enalbeFlag");
            intent.putExtra("pkgName", this.a.getPackageName());
            intent.putExtra("url", uri);
            intent.setPackage(FWFHelper.fwfDeviceOS);
            return getHasRetrievedMethod.serializer(new IntentCallable(this.a, intent, strReportEntry));
        }
        HMSLog.i("HmsMessaging", "turn on/off with broadcast v3");
        if (TextUtils.isEmpty(BaseUtils.getLocalToken(this.a, null))) {
            ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi210 = new ViewLayerUniqueDrawingIdApi29();
            viewLayerUniqueDrawingIdApi210.serializer(ErrorEnum.ERROR_NO_TOKEN.toApiException());
            return viewLayerUniqueDrawingIdApi210;
        }
        new PushPreferences(this.a, "push_notify_flag").saveBoolean("notify_msg_enable", !z);
        Intent intent2 = new Intent("com.huawei.intent.action.SELF_SHOW_FLAG");
        intent2.putExtra("enalbeFlag", z);
        intent2.putExtra(RemoteMessageConst.DEVICE_TOKEN, BaseUtils.getLocalToken(this.a, null));
        intent2.putExtra("pkgName", this.a.getPackageName());
        intent2.putExtra(PushNotificationParserObj.PUSH_ID_KEY, this.a.getApplicationInfo().uid);
        intent2.setPackage(FWFHelper.fwfDeviceOS);
        return getHasRetrievedMethod.serializer(new IntentCallable(this.a, intent2, strReportEntry));
    }

    public setShouldUseDispatchDrawui subscribe(String str) {
        HMSLog.i("HmsMessaging", "invoke subscribe");
        return a(str, "Sub");
    }

    public setShouldUseDispatchDrawui unsubscribe(String str) {
        HMSLog.i("HmsMessaging", "invoke unsubscribe");
        return a(str, "UnSub");
    }

    public void send(RemoteMessage remoteMessage) {
        if (ProxyCenter.getProxy() == null) {
            HMSLog.i("HmsMessaging", "send upstream message");
            a(remoteMessage);
        } else {
            HMSLog.e("HmsMessaging", "Operation(send) unsupported");
            IBraze$$ExternalSyntheticBUOutline0.m("Operation(send) unsupported");
        }
    }

    public setShouldUseDispatchDrawui turnOffPush() {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i("HmsMessaging", "turn off for proxy");
            return ProxyCenter.getProxy().turnOff(this.a, null);
        }
        HMSLog.i("HmsMessaging", "invoke turnOffPush");
        return a(false);
    }

    public setShouldUseDispatchDrawui turnOnPush() {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i("HmsMessaging", "turn on for proxy");
            return ProxyCenter.getProxy().turnOn(this.a, null);
        }
        HMSLog.i("HmsMessaging", "invoke turnOnPush");
        return a(true);
    }

    private void a(RemoteMessage remoteMessage) {
        String strReportEntry = PushBiUtil.reportEntry(this.a, PushNaming.UPSEND_MSG);
        ErrorEnum errorEnumA = v.a(this.a);
        if (errorEnumA == ErrorEnum.SUCCESS) {
            if (!TextUtils.isEmpty(remoteMessage.getTo())) {
                if (!TextUtils.isEmpty(remoteMessage.getMessageId())) {
                    if (!TextUtils.isEmpty(remoteMessage.getData())) {
                        UpSendMsgReq upSendMsgReq = new UpSendMsgReq();
                        upSendMsgReq.setPackageName(this.a.getPackageName());
                        upSendMsgReq.setMessageId(remoteMessage.getMessageId());
                        upSendMsgReq.setTo(remoteMessage.getTo());
                        upSendMsgReq.setData(remoteMessage.getData());
                        upSendMsgReq.setMessageType(remoteMessage.getMessageType());
                        upSendMsgReq.setTtl(remoteMessage.getTtl());
                        upSendMsgReq.setCollapseKey(remoteMessage.getCollapseKey());
                        upSendMsgReq.setSendMode(remoteMessage.getSendMode());
                        upSendMsgReq.setReceiptMode(remoteMessage.getReceiptMode());
                        if (d.b()) {
                            this.b.doWrite(new BaseVoidTask(PushNaming.UPSEND_MSG, JsonUtil.createJsonString(upSendMsgReq), strReportEntry));
                            return;
                        } else {
                            a(upSendMsgReq, strReportEntry);
                            return;
                        }
                    }
                    HMSLog.e("HmsMessaging", "Mandatory parameter 'data' missing");
                    PushBiUtil.reportExit(this.a, PushNaming.UPSEND_MSG, strReportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Mandatory parameter 'data' missing");
                    return;
                }
                HMSLog.e("HmsMessaging", "Mandatory parameter 'message_id' missing");
                PushBiUtil.reportExit(this.a, PushNaming.UPSEND_MSG, strReportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Mandatory parameter 'message_id' missing");
                return;
            }
            HMSLog.e("HmsMessaging", "Mandatory parameter 'to' missing");
            PushBiUtil.reportExit(this.a, PushNaming.UPSEND_MSG, strReportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Mandatory parameter 'to' missing");
            return;
        }
        HMSLog.e("HmsMessaging", "Message sent failed:" + errorEnumA.getExternalCode() + ':' + errorEnumA.getMessage());
        PushBiUtil.reportExit(this.a, PushNaming.UPSEND_MSG, strReportEntry, errorEnumA);
        IBraze$$ExternalSyntheticBUOutline0.m(errorEnumA.getMessage());
    }

    private setShouldUseDispatchDrawui a(String str, String str2) {
        String strReportEntry = PushBiUtil.reportEntry(this.a, PushNaming.SUBSCRIBE);
        if (str != null && c.matcher(str).matches()) {
            if (ProxyCenter.getProxy() != null) {
                HMSLog.i("HmsMessaging", "use proxy subscribe.");
                return TextUtils.equals(str2, "Sub") ? ProxyCenter.getProxy().subscribe(this.a, str, strReportEntry) : ProxyCenter.getProxy().unsubscribe(this.a, str, strReportEntry);
            }
            try {
                ErrorEnum errorEnumA = v.a(this.a);
                if (errorEnumA == ErrorEnum.SUCCESS) {
                    if (NetWorkUtil.getNetworkType(this.a) != 0) {
                        SubscribeReq subscribeReq = new SubscribeReq(this.a, str2, str);
                        subscribeReq.setToken(BaseUtils.getLocalToken(this.a, null));
                        boolean zB = d.b();
                        HuaweiApi<Api.ApiOptions.NoOptions> huaweiApi = this.b;
                        if (zB) {
                            return huaweiApi.doWrite(new BaseVoidTask(PushNaming.SUBSCRIBE, JsonUtil.createJsonString(subscribeReq), strReportEntry));
                        }
                        return huaweiApi.doWrite(new SubscribeTask(PushNaming.SUBSCRIBE, JsonUtil.createJsonString(subscribeReq), strReportEntry));
                    }
                    HMSLog.e("HmsMessaging", "no network");
                    throw ErrorEnum.ERROR_NO_NETWORK.toApiException();
                }
                throw errorEnumA.toApiException();
            } catch (ApiException e) {
                ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
                viewLayerUniqueDrawingIdApi29.serializer(e);
                PushBiUtil.reportExit(this.a, PushNaming.SUBSCRIBE, strReportEntry, e.getStatusCode());
                return viewLayerUniqueDrawingIdApi29;
            } catch (Exception unused) {
                ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi210 = new ViewLayerUniqueDrawingIdApi29();
                ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
                viewLayerUniqueDrawingIdApi210.serializer(errorEnum.toApiException());
                PushBiUtil.reportExit(this.a, PushNaming.SUBSCRIBE, strReportEntry, errorEnum);
                return viewLayerUniqueDrawingIdApi210;
            }
        }
        PushBiUtil.reportExit(this.a, PushNaming.SUBSCRIBE, strReportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
        HMSLog.e("HmsMessaging", "Invalid topic: topic should match the format:[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid topic: topic should match the format:[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");
        return null;
    }

    private void a(UpSendMsgReq upSendMsgReq, String str) {
        upSendMsgReq.setToken(BaseUtils.getLocalToken(this.a, null));
        try {
            this.b.doWrite(new SendUpStreamTask(PushNaming.UPSEND_MSG, JsonUtil.createJsonString(upSendMsgReq), str, upSendMsgReq.getPackageName(), upSendMsgReq.getMessageId()));
        } catch (Exception e) {
            if (e.getCause() instanceof ApiException) {
                PushBiUtil.reportExit(this.a, PushNaming.UPSEND_MSG, str, ((ApiException) e.getCause()).getStatusCode());
            } else {
                PushBiUtil.reportExit(this.a, PushNaming.UPSEND_MSG, str, ErrorEnum.ERROR_INTERNAL_ERROR);
            }
        }
    }
}
