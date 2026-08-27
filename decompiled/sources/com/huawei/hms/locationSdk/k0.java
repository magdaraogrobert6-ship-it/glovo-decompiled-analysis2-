package com.huawei.hms.locationSdk;

import android.content.Context;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;

/* JADX INFO: loaded from: classes4.dex */
public class k0 extends AbstractClientBuilder<s0, v0> {
    @Override // com.huawei.hms.common.internal.AbstractClientBuilder
    public s0 buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new s0(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
