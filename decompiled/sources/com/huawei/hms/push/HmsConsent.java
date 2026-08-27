package com.huawei.hms.push;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.task.ConsentTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.EnableConsentReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.utils.JsonUtil;
import o.ViewLayerCompanionOutlineProvider1;
import o.setShouldUseDispatchDrawui;

/* JADX INFO: loaded from: classes4.dex */
public class HmsConsent {
    private HuaweiApi<Api.ApiOptions.NoOptions> a;
    private Context b;

    public setShouldUseDispatchDrawui consentOff() {
        return a(false);
    }

    public setShouldUseDispatchDrawui consentOn() {
        return a(true);
    }

    public static HmsConsent getInstance(Context context) {
        return new HmsConsent(context);
    }

    private HmsConsent(Context context) {
        Preconditions.checkNotNull(context);
        this.b = context;
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.a = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.a = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.a.setKitSdkVersion(61300301);
    }

    private setShouldUseDispatchDrawui a(boolean z) {
        ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1;
        int externalCode;
        String strReportEntry = PushBiUtil.reportEntry(this.b, PushNaming.PUSH_CONSENT);
        try {
            if (!d.d(this.b)) {
                throw ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException();
            }
            EnableConsentReq enableConsentReq = new EnableConsentReq();
            enableConsentReq.setPackageName(this.b.getPackageName());
            enableConsentReq.setEnable(z);
            return this.a.doWrite(new ConsentTask(PushNaming.PUSH_CONSENT, JsonUtil.createJsonString(enableConsentReq), strReportEntry));
        } catch (ApiException e) {
            ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider2 = new ViewLayerCompanionOutlineProvider1();
            viewLayerCompanionOutlineProvider2.read(e);
            externalCode = e.getStatusCode();
            viewLayerCompanionOutlineProvider1 = viewLayerCompanionOutlineProvider2;
            PushBiUtil.reportExit(this.b, PushNaming.PUSH_CONSENT, strReportEntry, externalCode);
            return viewLayerCompanionOutlineProvider1.RemoteActionCompatParcelizer;
        } catch (Exception unused) {
            viewLayerCompanionOutlineProvider1 = new ViewLayerCompanionOutlineProvider1();
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            viewLayerCompanionOutlineProvider1.read(errorEnum.toApiException());
            externalCode = errorEnum.getExternalCode();
            PushBiUtil.reportExit(this.b, PushNaming.PUSH_CONSENT, strReportEntry, externalCode);
            return viewLayerCompanionOutlineProvider1.RemoteActionCompatParcelizer;
        }
    }
}
