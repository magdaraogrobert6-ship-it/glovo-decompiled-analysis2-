package com.huawei.hms.locationSdk;

import android.content.Context;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.support.api.location.common.LocationClientStateManager;
import com.huawei.hms.support.log.HMSLog;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
public class e0 extends AbstractClientBuilder<q0, v0> {

    public static class a implements BaseHmsClient.ConnectionCallbacks {
        private BaseHmsClient.ConnectionCallbacks a;

        public a(BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
            this.a = connectionCallbacks;
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnected() {
            HMSLog.i("LocationClientBuilder", "onConnected, send suspended requests,reStartState:" + LocationClientStateManager.getInstance().getResendState());
            BaseHmsClient.ConnectionCallbacks connectionCallbacks = this.a;
            if (connectionCallbacks != null) {
                connectionCallbacks.onConnected();
            }
            if (LocationClientStateManager.getInstance().getResendState() == 2) {
                LocationClientStateManager.getInstance().reStartHmsLocation();
            }
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.RemoteActionCompatParcelizer(i, "onConnectionSuspended reason:", "LocationClientBuilder");
            BaseHmsClient.ConnectionCallbacks connectionCallbacks = this.a;
            if (connectionCallbacks != null) {
                connectionCallbacks.onConnectionSuspended(i);
            }
            LocationClientStateManager.getInstance().checkCanResend();
        }
    }

    @Override // com.huawei.hms.common.internal.AbstractClientBuilder
    public q0 buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new q0(context, clientSettings, onConnectionFailedListener, new a(connectionCallbacks));
    }
}
