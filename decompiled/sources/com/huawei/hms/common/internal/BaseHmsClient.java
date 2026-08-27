package com.huawei.hms.common.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.adapter.BinderAdapter;
import com.huawei.hms.adapter.InnerBinderAdapter;
import com.huawei.hms.adapter.OuterBinderAdapter;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.FailedBinderCallBack;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.api.IPCTransport;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.support.api.client.AidlApiClient;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.Util;
import java.sql.Timestamp;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseHmsClient implements AidlApiClient {
    protected static final int TIMEOUT_DISCONNECTED = 6;
    private static final Object i = new Object();
    private static final AtomicInteger j = new AtomicInteger(1);
    private static final AtomicInteger k = new AtomicInteger(1);
    private static BinderAdapter l;
    private static BinderAdapter m;
    private final Context a;
    private String b;
    private final ClientSettings c;
    private volatile IAIDLInvoke d;
    private final ConnectionCallbacks e;
    private final OnConnectionFailedListener f;
    private Handler g = null;
    private HuaweiApi.RequestHandler h;
    protected String sessionId;

    public interface ConnectionCallbacks {
        public static final int CAUSE_API_CLIENT_EXPIRED = 3;
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected();

        void onConnectionSuspended(int i);
    }

    public interface OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public void connect(int i2) {
        a(i2, false);
    }

    public final void connectionConnected() {
        b(3);
        RequestManager.getHandler().sendEmptyMessage(RequestManager.NOTIFY_CONNECT_SUCCESS);
        ConnectionCallbacks connectionCallbacks = this.e;
        if (connectionCallbacks == null || (connectionCallbacks instanceof HuaweiApi.RequestHandler)) {
            return;
        }
        connectionCallbacks.onConnected();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getAppID() {
        return this.b;
    }

    public ClientSettings getClientSettings() {
        return this.c;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public Context getContext() {
        return this.a;
    }

    @Deprecated
    public int getMinApkVersion() {
        return 30000000;
    }

    public int getRequestHmsVersionCode() {
        return getMinApkVersion();
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public IAIDLInvoke getService() {
        return this.d;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getSessionId() {
        return this.sessionId;
    }

    public void onConnecting() {
        connectionConnected();
    }

    public final void setInternalRequest(HuaweiApi.RequestHandler requestHandler) {
        this.h = requestHandler;
    }

    public void setService(IAIDLInvoke iAIDLInvoke) {
        this.d = iAIDLInvoke;
    }

    public static final class ConnectionResultWrapper {
        private HuaweiApi.RequestHandler a;
        private ConnectionResult b;

        public ConnectionResult getConnectionResult() {
            return this.b;
        }

        public HuaweiApi.RequestHandler getRequest() {
            return this.a;
        }

        public ConnectionResultWrapper(HuaweiApi.RequestHandler requestHandler, ConnectionResult connectionResult) {
            this.a = requestHandler;
            this.b = connectionResult;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        return HMSPackageManager.getInstance(this.a).getHMSPackageStatesForMultiService() == PackageManagerHelper.PackageStates.ENABLED;
    }

    private BinderAdapter.BinderCallBack d() {
        return new BinderAdapter.BinderCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.1
            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onNullBinding(ComponentName componentName) {
                BaseHmsClient.this.b(1);
                BaseHmsClient.this.a(10);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onTimedDisconnected() {
                BaseHmsClient.this.b(6);
                if (BaseHmsClient.this.e == null || (BaseHmsClient.this.e instanceof HuaweiApi.RequestHandler)) {
                    return;
                }
                BaseHmsClient.this.e.onConnectionSuspended(1);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                HMSLog.i("BaseHmsClient", "Enter onServiceConnected.");
                BaseHmsClient.this.connectedInternal(iBinder);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onServiceDisconnected(ComponentName componentName) {
                HMSLog.i("BaseHmsClient", "Enter onServiceDisconnected.");
                BaseHmsClient.this.b(1);
                RequestManager.getHandler().sendEmptyMessage(RequestManager.NOTIFY_CONNECT_SUSPENDED);
                if (BaseHmsClient.this.e == null || (BaseHmsClient.this.e instanceof HuaweiApi.RequestHandler)) {
                    return;
                }
                BaseHmsClient.this.e.onConnectionSuspended(1);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onBinderFailed(int i2, Intent intent) {
                if (intent == null) {
                    HMSLog.i("BaseHmsClient", "onBinderFailed: intent is null!");
                    BaseHmsClient.this.a(new ConnectionResult(10, (PendingIntent) null));
                    BaseHmsClient.this.d = null;
                    return;
                }
                Activity activeActivity = Util.getActiveActivity(BaseHmsClient.this.getClientSettings().getCpActivity(), BaseHmsClient.this.getContext());
                if (activeActivity != null) {
                    HMSLog.i("BaseHmsClient", "onBinderFailed: SDK try to resolve and reConnect!");
                    long time = new Timestamp(System.currentTimeMillis()).getTime();
                    FailedBinderCallBack.getInstance().setCallBack(Long.valueOf(time), new FailedBinderCallBack.BinderCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.1.1
                        @Override // com.huawei.hms.api.FailedBinderCallBack.BinderCallBack
                        public void binderCallBack(int i3) {
                            if (i3 != 0) {
                                BaseHmsClient.this.a(new ConnectionResult(10, (PendingIntent) null));
                                BaseHmsClient.this.d = null;
                            }
                        }
                    });
                    intent.putExtra(FailedBinderCallBack.CALLER_ID, time);
                    activeActivity.startActivity(intent);
                    return;
                }
                HMSLog.i("BaseHmsClient", "onBinderFailed: return pendingIntent to kit and cp");
                BaseHmsClient.this.a(new ConnectionResult(10, PendingIntent.getActivity(BaseHmsClient.this.a, 11, intent, 67108864)));
                BaseHmsClient.this.d = null;
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onBinderFailed(int i2) {
                onBinderFailed(i2, null);
            }
        };
    }

    private void f() {
        if (this.c.isUseInnerHms()) {
            BinderAdapter binderAdapter = m;
            if (binderAdapter != null) {
                binderAdapter.unBind();
                return;
            }
            return;
        }
        BinderAdapter binderAdapter2 = l;
        if (binderAdapter2 != null) {
            binderAdapter2.unBind();
        }
    }

    public void disconnect() {
        int i2 = (this.c.isUseInnerHms() ? k : j).get();
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.RemoteActionCompatParcelizer(i2, "Enter disconnect, Connection Status: ", "BaseHmsClient");
        if (i2 == 3) {
            f();
            b(1);
        } else {
            if (i2 != 5) {
                return;
            }
            b();
            b(1);
        }
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public List<String> getApiNameList() {
        return this.c.getApiName();
    }

    public int getConnectionStatus() {
        return (this.c.isUseInnerHms() ? k : j).get();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getCpID() {
        return this.c.getCpID();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getPackageName() {
        return this.c.getClientPackageName();
    }

    public String getServiceAction() {
        HMSPackageManager hMSPackageManager = HMSPackageManager.getInstance(this.a);
        return this.c.isUseInnerHms() ? hMSPackageManager.getInnerServiceAction() : hMSPackageManager.getServiceAction();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public SubAppInfo getSubAppInfo() {
        return this.c.getSubAppID();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getTransportName() {
        return IPCTransport.class.getName();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public boolean isConnected() {
        if (this.c.isUseInnerHms()) {
            return k.get() == 3;
        }
        return j.get() == 3;
    }

    public boolean isConnecting() {
        return (this.c.isUseInnerHms() ? k : j).get() == 5;
    }

    public BaseHmsClient(Context context, ClientSettings clientSettings, OnConnectionFailedListener onConnectionFailedListener, ConnectionCallbacks connectionCallbacks) {
        this.a = context;
        this.c = clientSettings;
        if (clientSettings != null) {
            this.b = clientSettings.getAppID();
        }
        this.f = onConnectionFailedListener;
        this.e = connectionCallbacks;
    }

    private void a(int i2, boolean z) {
        AtomicInteger atomicInteger;
        HMSLog.i("BaseHmsClient", "====== HMSSDK version: 61300303 ======");
        if (this.c.isUseInnerHms()) {
            atomicInteger = k;
        } else {
            atomicInteger = j;
        }
        int i3 = atomicInteger.get();
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.RemoteActionCompatParcelizer(i3, "Enter connect, Connection Status: ", "BaseHmsClient");
        if (z || !(i3 == 3 || i3 == 5)) {
            if (getMinApkVersion() > i2) {
                i2 = getMinApkVersion();
            }
            StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i2, "connect minVersion:", " packageName:");
            sbM.append(this.c.getInnerHmsPkg());
            HMSLog.i("BaseHmsClient", sbM.toString());
            if (this.a.getPackageName().equals(this.c.getInnerHmsPkg())) {
                HMSLog.i("BaseHmsClient", "service packageName is same, bind core service return");
                a();
                return;
            }
            if (Util.isAvailableLibExist(this.a)) {
                AvailableAdapter availableAdapter = new AvailableAdapter(i2);
                int iIsHuaweiMobileServicesAvailable = availableAdapter.isHuaweiMobileServicesAvailable(this.a);
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.RemoteActionCompatParcelizer(iIsHuaweiMobileServicesAvailable, "check available result: ", "BaseHmsClient");
                if (iIsHuaweiMobileServicesAvailable == 0) {
                    a();
                    return;
                }
                if (availableAdapter.isUserResolvableError(iIsHuaweiMobileServicesAvailable)) {
                    HMSLog.i("BaseHmsClient", "bindCoreService3.0 fail, start resolution now.");
                    b(availableAdapter, iIsHuaweiMobileServicesAvailable);
                    return;
                } else {
                    if (availableAdapter.isUserNoticeError(iIsHuaweiMobileServicesAvailable)) {
                        HMSLog.i("BaseHmsClient", "bindCoreService3.0 fail, start notice now.");
                        a(availableAdapter, iIsHuaweiMobileServicesAvailable);
                        return;
                    }
                    HMSLog.i("BaseHmsClient", "bindCoreService3.0 fail: " + iIsHuaweiMobileServicesAvailable + " is not resolvable.");
                    a(iIsHuaweiMobileServicesAvailable);
                    return;
                }
            }
            int iIsHuaweiMobileServicesAvailable2 = HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(this.a, i2);
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.RemoteActionCompatParcelizer(iIsHuaweiMobileServicesAvailable2, "HuaweiApiAvailability check available result: ", "BaseHmsClient");
            if (iIsHuaweiMobileServicesAvailable2 == 0) {
                a();
            } else {
                a(iIsHuaweiMobileServicesAvailable2);
            }
        }
    }

    private void b(AvailableAdapter availableAdapter, int i2) {
        HMSLog.i("BaseHmsClient", "enter HmsCore resolution");
        if (!getClientSettings().isHasActivity()) {
            a(new ConnectionResult(26, HuaweiApiAvailability.getInstance().getErrPendingIntent(this.a, i2, 0)));
            return;
        }
        Activity activeActivity = Util.getActiveActivity(getClientSettings().getCpActivity(), getContext());
        if (activeActivity != null) {
            availableAdapter.startResolution(activeActivity, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.3
                @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                public void onComplete(int i3) {
                    if (i3 == 0 && BaseHmsClient.this.c()) {
                        BaseHmsClient.this.a();
                    } else {
                        BaseHmsClient.this.a(i3);
                    }
                }
            });
        } else {
            a(26);
        }
    }

    private void e() {
        HMSLog.w("BaseHmsClient", "Failed to get service as interface, trying to unbind.");
        if (this.c.isUseInnerHms()) {
            BinderAdapter binderAdapter = m;
            if (binderAdapter == null) {
                HMSLog.w("BaseHmsClient", "mInnerBinderAdapter is null.");
                return;
            }
            binderAdapter.unBind();
        } else {
            BinderAdapter binderAdapter2 = l;
            if (binderAdapter2 == null) {
                HMSLog.w("BaseHmsClient", "mOuterBinderAdapter is null.");
                return;
            }
            binderAdapter2.unBind();
        }
        b(1);
        a(10);
    }

    public void connectedInternal(IBinder iBinder) {
        this.d = IAIDLInvoke.Stub.asInterface(iBinder);
        if (this.d != null) {
            onConnecting();
        } else {
            HMSLog.e("BaseHmsClient", "mService is null, try to unBind.");
            e();
        }
    }

    public BinderAdapter getAdapter() {
        HMSLog.i("BaseHmsClient", "getAdapter:isInner:" + this.c.isUseInnerHms() + ", mInnerBinderAdapter:" + m + ", mOuterBinderAdapter:" + l);
        if (this.c.isUseInnerHms()) {
            return m;
        }
        return l;
    }

    public void connect(int i2, boolean z) {
        a(i2, z);
    }

    public final void checkConnected() {
        if (isConnected()) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Not connected. Call connect() and wait for onConnected() to be called.");
    }

    public void b(int i2) {
        if (this.c.isUseInnerHms()) {
            k.set(i2);
        } else {
            j.set(i2);
        }
    }

    private void b() {
        synchronized (i) {
            Handler handler = this.g;
            if (handler != null) {
                handler.removeMessages(2);
                this.g = null;
            }
        }
    }

    public void a() {
        String innerHmsPkg = this.c.getInnerHmsPkg();
        String serviceAction = getServiceAction();
        HMSLog.i("BaseHmsClient", "enter bindCoreService, packageName is " + innerHmsPkg + ", serviceAction is " + serviceAction);
        a(innerHmsPkg, serviceAction);
    }

    private void a(String str, String str2) {
        boolean zIsUseInnerHms = this.c.isUseInnerHms();
        Context context = this.a;
        if (zIsUseInnerHms) {
            m = InnerBinderAdapter.getInstance(context, str2, str);
            if (isConnected()) {
                HMSLog.i("BaseHmsClient", "The binder is already connected.");
                getAdapter().updateDelayTask();
                connectedInternal(getAdapter().getServiceBinder());
                return;
            } else {
                b(5);
                m.binder(d());
                return;
            }
        }
        l = OuterBinderAdapter.getInstance(context, str2, str);
        if (isConnected()) {
            HMSLog.i("BaseHmsClient", "The binder is already connected.");
            getAdapter().updateDelayTask();
            connectedInternal(getAdapter().getServiceBinder());
        } else {
            b(5);
            l.binder(d());
        }
    }

    private void a(AvailableAdapter availableAdapter, int i2) {
        HMSLog.i("BaseHmsClient", "enter notice");
        if (!getClientSettings().isHasActivity()) {
            if (i2 == 29) {
                i2 = 9;
            }
            a(new ConnectionResult(26, HuaweiApiAvailability.getInstance().getErrPendingIntent(this.a, i2, 0)));
        } else {
            Activity activeActivity = Util.getActiveActivity(getClientSettings().getCpActivity(), getContext());
            if (activeActivity != null) {
                availableAdapter.startNotice(activeActivity, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.2
                    @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                    public void onComplete(int i3) {
                        BaseHmsClient.this.a(i3);
                    }
                });
            } else {
                a(26);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2) {
        HMSLog.i("BaseHmsClient", "notifyFailed result: " + i2);
        Message message = new Message();
        message.what = RequestManager.NOTIFY_CONNECT_FAILED;
        message.obj = new ConnectionResultWrapper(this.h, new ConnectionResult(i2));
        RequestManager.getHandler().sendMessage(message);
        OnConnectionFailedListener onConnectionFailedListener = this.f;
        if (onConnectionFailedListener == null || (onConnectionFailedListener instanceof HuaweiApi.RequestHandler)) {
            return;
        }
        onConnectionFailedListener.onConnectionFailed(new ConnectionResult(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ConnectionResult connectionResult) {
        HMSLog.i("BaseHmsClient", "notifyFailed result: " + connectionResult.getErrorCode());
        Message message = new Message();
        message.what = RequestManager.NOTIFY_CONNECT_FAILED;
        HuaweiApi.RequestHandler requestHandler = this.h;
        this.h = null;
        message.obj = new ConnectionResultWrapper(requestHandler, connectionResult);
        RequestManager.getHandler().sendMessage(message);
        OnConnectionFailedListener onConnectionFailedListener = this.f;
        if (onConnectionFailedListener == null || (onConnectionFailedListener instanceof HuaweiApi.RequestHandler)) {
            return;
        }
        onConnectionFailedListener.onConnectionFailed(connectionResult);
    }
}
