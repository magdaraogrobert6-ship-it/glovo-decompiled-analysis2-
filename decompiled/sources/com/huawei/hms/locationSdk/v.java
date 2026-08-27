package com.huawei.hms.locationSdk;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import com.huawei.location.router.RouterResponse;
import com.huawei.location.router.interfaces.IRouterCallback;
import java.util.ArrayList;
import o.ViewLayerCompanionOutlineProvider1;
import o.placeAtf8xVGno;

/* JADX INFO: loaded from: classes4.dex */
class v<TResult, TClient extends AnyClient, TOption extends Api.ApiOptions> implements IRouterCallback {
    private TaskApiCall<TClient, TResult> a;
    private ViewLayerCompanionOutlineProvider1 b;
    private AbstractClientBuilder<TClient, TOption> c;
    private String d;

    public class a implements BaseHmsClient.OnConnectionFailedListener {
        @Override // com.huawei.hms.common.internal.BaseHmsClient.OnConnectionFailedListener
        public void onConnectionFailed(ConnectionResult connectionResult) {
        }

        public a() {
        }
    }

    public class b implements BaseHmsClient.ConnectionCallbacks {
        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnected() {
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
        }

        public b() {
        }
    }

    @Override // com.huawei.location.router.interfaces.IRouterCallback
    public void doExecute(RouterResponse routerResponse) {
        a(routerResponse);
    }

    @Override // com.huawei.location.router.interfaces.IRouterCallback
    public void onComplete(RouterResponse routerResponse) {
        a(routerResponse);
    }

    private TClient b() {
        return (TClient) this.c.buildClient(placeAtf8xVGno.read(), a(), new a(), new e0.a(new b()));
    }

    public v(TaskApiCall<TClient, TResult> taskApiCall, ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1, AbstractClientBuilder<TClient, TOption> abstractClientBuilder) {
        this.a = taskApiCall;
        this.b = viewLayerCompanionOutlineProvider1;
        this.c = abstractClientBuilder;
    }

    private ClientSettings a() {
        Context context = placeAtf8xVGno.read();
        ClientSettings clientSettings = new ClientSettings(context.getPackageName(), context.getClass().getName(), new ArrayList(), Util.getAppId(placeAtf8xVGno.read()), null);
        clientSettings.setCpID(Util.getCpId(context));
        if (TextUtils.isEmpty(this.d)) {
            this.d = HMSPackageManager.getInstance(context).getHMSPackageName();
            HMSLog.i("LiteApiListener", "inner hms is empty,hms pkg name is " + this.d);
        }
        clientSettings.setInnerHmsPkg(this.d);
        return clientSettings;
    }

    private void a(RouterResponse routerResponse) {
        if (routerResponse == null || this.a == null) {
            return;
        }
        this.a.onResponse(b(), new p1(routerResponse.getStatusInfo(), routerResponse.getTransactionId()), routerResponse.getBody(), this.b);
        HMSLog.d("LiteApiListener", "doTaskExecute onResponse success");
    }
}
