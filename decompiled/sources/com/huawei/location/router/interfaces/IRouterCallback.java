package com.huawei.location.router.interfaces;

import com.huawei.location.router.RouterResponse;

/* JADX INFO: loaded from: classes4.dex */
public interface IRouterCallback {
    void doExecute(RouterResponse routerResponse);

    void onComplete(RouterResponse routerResponse);
}
