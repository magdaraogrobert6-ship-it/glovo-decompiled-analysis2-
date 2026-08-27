package com.huawei.hms.locationSdk;

import android.content.Context;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;

/* JADX INFO: loaded from: classes2.dex */
public class a0 extends AbstractClientBuilder<p0, v0> {
    @Override // com.huawei.hms.common.internal.AbstractClientBuilder
    public p0 buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new p0(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
