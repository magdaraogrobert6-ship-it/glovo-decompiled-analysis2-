package com.huawei.hms.common.internal;

import android.os.Parcelable;
import com.huawei.hmf.tasks.CancellationToken;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.support.log.HMSLog;
import o.ViewLayerCompanionOutlineProvider1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TaskApiCall<ClientT extends AnyClient, ResultT> {
    private final String a;
    private final String b;
    private Parcelable c;
    private String d;
    private CancellationToken e;
    private int f;

    public abstract void doExecute(ClientT clientt, ResponseErrorCode responseErrorCode, String str, ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1);

    public int getApiLevel() {
        return this.f;
    }

    @Deprecated
    public int getMinApkVersion() {
        return 30000000;
    }

    public Parcelable getParcelable() {
        return this.c;
    }

    public String getRequestJson() {
        return this.b;
    }

    public CancellationToken getToken() {
        return this.e;
    }

    public String getTransactionId() {
        return this.d;
    }

    public String getUri() {
        return this.a;
    }

    public void setApiLevel(int i) {
        this.f = i;
    }

    public void setParcelable(Parcelable parcelable) {
        this.c = parcelable;
    }

    public void setToken(CancellationToken cancellationToken) {
        this.e = cancellationToken;
    }

    public void setTransactionId(String str) {
        this.d = str;
    }

    @Deprecated
    public TaskApiCall(String str, String str2) {
        this.f = 1;
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = null;
    }

    public final void onResponse(ClientT clientt, ResponseErrorCode responseErrorCode, String str, ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1) {
        CancellationToken cancellationToken = this.e;
        if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
            HMSLog.i("TaskApiCall", "This Task has been canceled, uri:" + this.a + ", transactionId:" + this.d);
            return;
        }
        HMSLog.i("TaskApiCall", "doExecute, uri:" + this.a + ", errorCode:" + responseErrorCode.getErrorCode() + ", transactionId:" + this.d);
        doExecute(clientt, responseErrorCode, str, viewLayerCompanionOutlineProvider1);
    }

    public TaskApiCall(String str, String str2, String str3) {
        this.f = 1;
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = str3;
    }

    public TaskApiCall(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = str3;
        this.f = i;
    }
}
