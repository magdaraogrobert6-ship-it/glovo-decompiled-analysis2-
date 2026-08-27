package com.huawei.location.activity;

import com.huawei.location.lite.common.report.ReportBuilder;
import com.huawei.location.router.BaseRouterTaskCallImpl;
import com.huawei.location.util.yn$yn;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseApiTaskCall extends BaseRouterTaskCallImpl {
    public int errorCode;
    public String errorReason;
    public yn$yn reportBuilder;

    public BaseApiTaskCall() {
        yn$yn yn_yn = new yn$yn();
        yn_yn.read = new ReportBuilder();
        this.reportBuilder = yn_yn;
        this.errorCode = 0;
        this.errorReason = "";
    }
}
