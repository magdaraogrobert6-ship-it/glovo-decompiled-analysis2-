package com.huawei.hms.locationSdk;

import com.huawei.hms.api.Api;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.TaskApiCall;
import o.setShouldUseDispatchDrawui;

/* JADX INFO: loaded from: classes2.dex */
public interface u {
    @w
    <TResult, TClient extends AnyClient, TOption extends Api.ApiOptions> setShouldUseDispatchDrawui a(HuaweiApi<TOption> huaweiApi, TaskApiCall<TClient, TResult> taskApiCall, AbstractClientBuilder<TClient, TOption> abstractClientBuilder);
}
