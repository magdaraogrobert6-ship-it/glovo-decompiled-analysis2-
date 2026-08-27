package com.huawei.hms.push;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.task.ProfileTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.ProfileReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import o.ComposeScrollCaptureCallbackscrollTracker1;
import o.ViewConfigurationDefaultImpls;
import o.ViewLayerUniqueDrawingIdApi29;
import o.onStateChanged;
import o.setShouldUseDispatchDrawui;

/* JADX INFO: loaded from: classes4.dex */
public class HmsProfile {
    public static final int CUSTOM_PROFILE = 2;
    public static final int HUAWEI_PROFILE = 1;
    private static final String c = "HmsProfile";
    private Context a;
    private HuaweiApi<Api.ApiOptions.NoOptions> b;

    private boolean b(Context context) {
        return d.b(context) >= 110001400;
    }

    public static HmsProfile getInstance(Context context) {
        return new HmsProfile(context);
    }

    public boolean isSupportProfile() {
        if (!d.d(this.a)) {
            return true;
        }
        if (d.c()) {
            HMSLog.i(c, "current EMUI version below 9.1, not support profile operation.");
            return false;
        }
        if (b(this.a)) {
            return true;
        }
        HMSLog.i(c, "current HwPushService.apk version below 11.0.1.400,please upgrade your HwPushService.apk version.");
        return false;
    }

    private HmsProfile(Context context) {
        this.a = null;
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

    public setShouldUseDispatchDrawui addProfile(String str, int i, String str2) {
        if (i != 1 && i != 2) {
            HMSLog.i(c, "add profile type undefined.");
            ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
            viewLayerUniqueDrawingIdApi29.serializer(ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException());
            return viewLayerUniqueDrawingIdApi29;
        }
        if (TextUtils.isEmpty(str2)) {
            HMSLog.i(c, "add profile params is empty.");
            ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi210 = new ViewLayerUniqueDrawingIdApi29();
            viewLayerUniqueDrawingIdApi210.serializer(ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException());
            return viewLayerUniqueDrawingIdApi210;
        }
        return a(0, str, i, str2);
    }

    public setShouldUseDispatchDrawui deleteProfile(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return a(1, str, -1, str2);
        }
        HMSLog.e(c, "del profile params is empty.");
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        viewLayerUniqueDrawingIdApi29.serializer(ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException());
        return viewLayerUniqueDrawingIdApi29;
    }

    private setShouldUseDispatchDrawui a(int i, String str, int i2, String str2) {
        if (!isSupportProfile()) {
            ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
            viewLayerUniqueDrawingIdApi29.serializer(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException());
            return viewLayerUniqueDrawingIdApi29;
        }
        if (!TextUtils.isEmpty(str)) {
            String strA = a(this.a);
            if (TextUtils.isEmpty(strA)) {
                HMSLog.i(c, "agc connect services config missing project id.");
                ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi210 = new ViewLayerUniqueDrawingIdApi29();
                viewLayerUniqueDrawingIdApi210.serializer(ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException());
                return viewLayerUniqueDrawingIdApi210;
            }
            if (str.equals(strA)) {
                str = "";
            }
        }
        ProfileReq profileReq = new ProfileReq();
        if (i == 0) {
            profileReq.setOperation(0);
            profileReq.setType(i2);
        } else {
            profileReq.setOperation(1);
        }
        String strReportEntry = PushBiUtil.reportEntry(this.a, PushNaming.PUSH_PROFILE);
        try {
            profileReq.setSubjectId(str);
            profileReq.setProfileId(ComposeScrollCaptureCallbackscrollTracker1.IconCompatParcelizer(str2));
            profileReq.setPkgName(this.a.getPackageName());
            return this.b.doWrite(new ProfileTask(PushNaming.PUSH_PROFILE, JsonUtil.createJsonString(profileReq), strReportEntry));
        } catch (Exception e) {
            if (e.getCause() instanceof ApiException) {
                ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi211 = new ViewLayerUniqueDrawingIdApi29();
                ApiException apiException = (ApiException) e.getCause();
                viewLayerUniqueDrawingIdApi211.serializer(apiException);
                PushBiUtil.reportExit(this.a, PushNaming.PUSH_PROFILE, strReportEntry, apiException.getStatusCode());
                return viewLayerUniqueDrawingIdApi211;
            }
            ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi212 = new ViewLayerUniqueDrawingIdApi29();
            Context context = this.a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            PushBiUtil.reportExit(context, PushNaming.PUSH_PROFILE, strReportEntry, errorEnum);
            viewLayerUniqueDrawingIdApi212.serializer(errorEnum.toApiException());
            return viewLayerUniqueDrawingIdApi212;
        }
    }

    public setShouldUseDispatchDrawui deleteProfile(String str) {
        return deleteProfile("", str);
    }

    public setShouldUseDispatchDrawui addProfile(int i, String str) {
        return addProfile("", i, str);
    }

    private static String a(Context context) {
        return ((ViewConfigurationDefaultImpls) onStateChanged.write(context)).serializer("client/project_id");
    }
}
