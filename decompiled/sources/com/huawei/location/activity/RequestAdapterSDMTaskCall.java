package com.huawei.location.activity;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hms.location.api.request.BaseLocationReq;
import com.huawei.location.router.entity.IRouterResponse;
import o.WrappedCompositionsetContent1211;
import o.setRect;

/* JADX INFO: loaded from: classes4.dex */
public class RequestAdapterSDMTaskCall extends BaseApiTaskCall {
    private static final String TAG = "RequestAdapterSDMAPI";

    @Override // com.huawei.location.router.BaseRouterTaskCallImpl, com.huawei.location.router.interfaces.IRouterRequest
    public IRouterResponse onExecute(String str) {
        BaseLocationReq baseLocationReq;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "onExecute start");
        try {
            baseLocationReq = (BaseLocationReq) new Gson().fromJson(str, BaseLocationReq.class);
        } catch (JsonSyntaxException unused) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "removeActivityIdentificationUpdatesTaskCall json parse failed");
            this.errorCode = 10000;
            this.errorReason = "onRequest RequestAdapterSDMTaskCall exception";
            baseLocationReq = null;
        }
        this.reportBuilder.RemoteActionCompatParcelizer("AR_requestAdapterSDM");
        if (setRect.IconCompatParcelizer == null) {
            synchronized (setRect.RemoteActionCompatParcelizer) {
                if (setRect.IconCompatParcelizer == null) {
                    setRect setrect = new setRect();
                    setrect.read = RiemannSoftArService.getInstance();
                    setRect.IconCompatParcelizer = setrect;
                }
            }
        }
        setRect setrect2 = setRect.IconCompatParcelizer;
        this.reportBuilder.yn(baseLocationReq);
        this.reportBuilder.serializer().IconCompatParcelizer(String.valueOf(this.errorCode));
        return setrect2;
    }

    @Override // com.huawei.location.router.interfaces.IRouterRequest
    public void onRequest(String str) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "onRequest start");
    }
}
