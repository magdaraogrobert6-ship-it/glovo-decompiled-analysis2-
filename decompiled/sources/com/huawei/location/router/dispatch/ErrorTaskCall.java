package com.huawei.location.router.dispatch;

import com.huawei.location.router.BaseRouterTaskCallImpl;
import com.huawei.location.router.RouterResponse;
import com.huawei.location.router.entity.StatusInfo;
import o.WindowRecomposer_androidKtgetAnimationScaleFlowFor11contentObserver1;
import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes4.dex */
class ErrorTaskCall extends BaseRouterTaskCallImpl {
    @Override // com.huawei.location.router.interfaces.IRouterRequest
    public void onRequest(String str) {
    }

    public void onComplete(int i, String str) {
        WrappedCompositionsetContent1211.read("ErrorRequestApi", "handlerNoApiTask");
        onComplete(new RouterResponse("", new StatusInfo(0, i, str)));
    }

    public void onComplete(int i) {
        onComplete(i, WindowRecomposer_androidKtgetAnimationScaleFlowFor11contentObserver1.serializer(i));
    }
}
