package com.huawei.location.util;

import com.huawei.hms.location.api.request.BaseLocationReq;
import com.huawei.location.lite.common.report.ReportBuilder;
import com.huawei.location.lite.common.util.APKUtil;
import o.resolveResourcePath;

/* JADX INFO: loaded from: classes5.dex */
public final class yn$yn {
    public ReportBuilder read;

    public final void yn(BaseLocationReq baseLocationReq) {
        ReportBuilder reportBuilder = this.read;
        if (baseLocationReq != null) {
            reportBuilder.setTransactionID(baseLocationReq.getLocTransactionId());
            reportBuilder.setPackage(baseLocationReq.getPackageName());
            reportBuilder.setCpAppVersion(String.valueOf(APKUtil.getVersionCode(baseLocationReq.getPackageName())));
        }
    }

    public final void RemoteActionCompatParcelizer(String str) {
        this.read.setApiName(str);
    }

    public final resolveResourcePath serializer() {
        ReportBuilder reportBuilder = this.read;
        resolveResourcePath resolveresourcepath = new resolveResourcePath(0);
        resolveresourcepath.write = reportBuilder;
        return resolveresourcepath;
    }
}
