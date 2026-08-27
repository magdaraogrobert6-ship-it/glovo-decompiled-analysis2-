package com.huawei.hms.aaid;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.DeleteTokenReq;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.opendevice.a;
import com.huawei.hms.opendevice.b;
import com.huawei.hms.opendevice.e;
import com.huawei.hms.opendevice.f;
import com.huawei.hms.opendevice.g;
import com.huawei.hms.opendevice.h;
import com.huawei.hms.opendevice.i;
import com.huawei.hms.opendevice.l;
import com.huawei.hms.support.log.HMSLog;
import o.ViewLayerUniqueDrawingIdApi29;
import o.getHasRetrievedMethod;
import o.setShouldUseDispatchDrawui;

/* JADX INFO: loaded from: classes2.dex */
public class HmsInstanceId {
    public static final String TAG = "HmsInstanceId";
    private Context a;
    private PushPreferences b;
    private HuaweiApi<Api.ApiOptions.NoOptions> c;

    public void deleteAAID() throws ApiException {
        b();
        try {
            if (this.b.containsKey("aaid")) {
                this.b.removeKey("aaid");
                this.b.removeKey("creationTime");
                if (b.d(this.a)) {
                    if (ProxyCenter.getProxy() != null) {
                        HMSLog.i(TAG, "use proxy delete all token after delete AaId.");
                        ProxyCenter.getProxy().deleteAllToken(this.a);
                        return;
                    }
                    DeleteTokenReq deleteTokenReqA = b.a(this.a);
                    deleteTokenReqA.setDeleteType(1);
                    deleteTokenReqA.setMultiSender(false);
                    a(deleteTokenReqA, 1);
                    BaseUtils.deleteAllTokenCache(this.a);
                }
            }
        } catch (ApiException e) {
            throw e;
        } catch (Exception unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public setShouldUseDispatchDrawui getAAID() {
        try {
            return getHasRetrievedMethod.serializer(new a(this.a.getApplicationContext()));
        } catch (Exception unused) {
            ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
            viewLayerUniqueDrawingIdApi29.serializer(ErrorEnum.ERROR_INTERNAL_ERROR.toApiException());
            return viewLayerUniqueDrawingIdApi29;
        }
    }

    public long getCreationTime() {
        try {
            if (!this.b.containsKey("creationTime")) {
                getAAID();
            }
            return this.b.getLong("creationTime");
        } catch (Exception unused) {
            return 0L;
        }
    }

    public String getId() {
        return b.b(this.a);
    }

    private HmsInstanceId(Context context) {
        this.a = context.getApplicationContext();
        this.b = new PushPreferences(context, "aaid");
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.c = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.c = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.c.setKitSdkVersion(61300301);
    }

    public static HmsInstanceId getInstance(Context context) {
        Preconditions.checkNotNull(context);
        l.c(context);
        return new HmsInstanceId(context);
    }

    public void deleteToken(String str) throws ApiException {
        b();
        a();
        if (TextUtils.isEmpty(str)) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        String strC = b.c(this.a);
        if (TextUtils.isEmpty(strC)) {
            throw ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException();
        }
        if (str.equals(strC)) {
            deleteToken(null, null);
            return;
        }
        DeleteTokenReq deleteTokenReqA = b.a(this.a, str);
        deleteTokenReqA.setMultiSender(true);
        a(deleteTokenReqA, 2);
    }

    public String getToken(String str) throws ApiException {
        b();
        a();
        if (TextUtils.isEmpty(str)) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        String strC = b.c(this.a);
        if (TextUtils.isEmpty(strC)) {
            throw ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException();
        }
        if (str.equals(strC)) {
            return getToken(null, null);
        }
        TokenReq tokenReqB = b.b(this.a, str);
        tokenReqB.setAaid(getId());
        tokenReqB.setMultiSender(true);
        return a(tokenReqB, 2);
    }

    private void a(DeleteTokenReq deleteTokenReq, int i) throws ApiException {
        String subjectId = deleteTokenReq.getSubjectId();
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i(TAG, "use proxy delete token");
            ProxyCenter.getProxy().deleteToken(this.a, subjectId, null);
            return;
        }
        String strA = h.a(this.a, "push.deletetoken");
        try {
            String strB = i.a(this.a).b(subjectId);
            if (deleteTokenReq.isMultiSender() && (TextUtils.isEmpty(strB) || strB.equals(i.a(this.a).b(null)))) {
                i.a(this.a).removeKey(subjectId);
                HMSLog.i(TAG, "The local subject token is null");
                return;
            }
            deleteTokenReq.setToken(strB);
            f fVar = new f("push.deletetoken", deleteTokenReq, strA);
            fVar.setApiLevel(i);
            getHasRetrievedMethod.read(this.c.doWrite(fVar));
            i.a(this.a).c(subjectId);
        } catch (Exception e) {
            if (e.getCause() instanceof ApiException) {
                ApiException apiException = (ApiException) e.getCause();
                h.a(this.a, "push.deletetoken", strA, apiException.getStatusCode());
                throw apiException;
            }
            Context context = this.a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            h.a(context, "push.deletetoken", strA, errorEnum);
            throw errorEnum.toApiException();
        }
    }

    private void b() throws ApiException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw ErrorEnum.ERROR_MAIN_THREAD.toApiException();
        }
    }

    public void deleteToken(String str, String str2) throws ApiException {
        b();
        a();
        DeleteTokenReq deleteTokenReqA = b.a(this.a, str, str2);
        deleteTokenReqA.setMultiSender(false);
        a(deleteTokenReqA, 1);
    }

    public String getToken(String str, String str2) throws ApiException {
        b();
        a();
        TokenReq tokenReqB = b.b(this.a, null, str2);
        tokenReqB.setAaid(getId());
        tokenReqB.setMultiSender(false);
        i.a(this.a).saveString(this.a.getPackageName(), "1");
        return a(tokenReqB, 1);
    }

    @Deprecated
    public String getToken() {
        try {
            return getToken(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    private String a(TokenReq tokenReq, int i) throws ApiException {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i(TAG, "use proxy get token, please check HmsMessageService.onNewToken receive result.");
            ProxyCenter.getProxy().getToken(this.a, tokenReq.getSubjectId(), null);
            return null;
        }
        a(tokenReq.getSubjectId());
        String strA = h.a(this.a, "push.gettoken");
        try {
            HMSLog.d(TAG, "getToken req :" + tokenReq.toString());
            g gVar = new g("push.gettoken", tokenReq, this.a, strA);
            gVar.setApiLevel(i);
            return ((TokenResult) getHasRetrievedMethod.read(this.c.doWrite(gVar))).getToken();
        } catch (Exception e) {
            if (e.getCause() instanceof ApiException) {
                ApiException apiException = (ApiException) e.getCause();
                h.a(this.a, "push.gettoken", strA, apiException.getStatusCode());
                throw apiException;
            }
            Context context = this.a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            h.a(context, "push.gettoken", strA, errorEnum);
            throw errorEnum.toApiException();
        }
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean zE = e.e(this.a);
        Context context = this.a;
        if (zE) {
            String string = i.a(context).getString("subjectId");
            if (TextUtils.isEmpty(string)) {
                i.a(this.a).saveString("subjectId", str);
                return;
            }
            if (string.contains(str)) {
                return;
            }
            i.a(this.a).saveString("subjectId", string + "," + str);
            return;
        }
        i.a(context).removeKey("subjectId");
    }

    private void a() throws ApiException {
        if (BaseUtils.getProxyInit(this.a) && ProxyCenter.getProxy() == null && !BaseUtils.isMainProc(this.a)) {
            HMSLog.e(TAG, "Operations in child processes are not supported.");
            throw ErrorEnum.ERROR_OPER_IN_CHILD_PROCESS.toApiException();
        }
    }
}
