package com.huawei.location.router.interfaces;

import com.huawei.location.router.entity.IRouterResponse;

/* JADX INFO: loaded from: classes4.dex */
public interface IRouterRequest {
    IRouterResponse onExecute(String str);

    void onRequest(String str);
}
