package com.huawei.location.utils;

import com.google.gson.Gson;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;
import com.huawei.hms.support.api.location.common.LocationRequestHelper;
import com.huawei.location.lite.common.agc.AGCManager;
import com.huawei.location.lite.common.report.ReportBuilder;
import com.huawei.location.lite.common.util.APKUtil;
import java.util.HashMap;
import java.util.Map;
import o.WrappedCompositionsetContent1211;
import o.onPrepareActionMode;
import o.placeAtf8xVGno;
import o.resolveResourcePath;

/* JADX INFO: loaded from: classes4.dex */
public final class FB$yn {
    public final ReportBuilder IconCompatParcelizer;

    public final void IconCompatParcelizer(LocationRequest locationRequest, boolean z) {
        HashMap map = new HashMap();
        if (locationRequest != null) {
            map.put(RemoteMessageConst.Notification.PRIORITY, Integer.valueOf(locationRequest.getPriority()));
            map.put("interval", Long.valueOf(locationRequest.getInterval()));
            map.put("fastestInterval", Long.valueOf(locationRequest.getFastestInterval()));
            map.put("expirationTime", Long.valueOf(locationRequest.getExpirationTime()));
            map.put("numUpdates", Integer.valueOf(locationRequest.getNumUpdates()));
            map.put("smallestDisplacement", Float.valueOf(locationRequest.getSmallestDisplacement()));
            map.put("needAddress", Boolean.valueOf(locationRequest.getNeedAddress()));
            map.put("maxWaitTime", Long.valueOf(locationRequest.getMaxWaitTime()));
            if (z) {
                map.put("isDuplicate", 1);
            }
            Map<String, String> extras = locationRequest.getExtras();
            if (extras != null && extras.containsKey(LocationRequestHelper.CP_TRANS_ID)) {
                map.put(LocationRequestHelper.CP_TRANS_ID, extras.get(LocationRequestHelper.CP_TRANS_ID));
            }
        }
        try {
            this.IconCompatParcelizer.setExt(new Gson().toJson(map));
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read("LocationClientReport", "GsonUtil.getInstance().toJson(map) exception");
        }
    }

    public FB$yn() {
        ReportBuilder reportBuilder = new ReportBuilder();
        this.IconCompatParcelizer = reportBuilder;
        AGCManager.read().getClass();
        reportBuilder.setAppID(AGCManager.serializer());
    }

    public final resolveResourcePath read() {
        resolveResourcePath resolveresourcepath = new resolveResourcePath(2);
        resolveresourcepath.write = this.IconCompatParcelizer;
        return resolveresourcepath;
    }

    public final void yn(LocationBaseRequest locationBaseRequest) {
        if (locationBaseRequest != null) {
            String tid = locationBaseRequest.getTid();
            ReportBuilder reportBuilder = this.IconCompatParcelizer;
            reportBuilder.setTransactionID(tid);
            reportBuilder.setLocationEnable(onPrepareActionMode.RemoteActionCompatParcelizer(placeAtf8xVGno.read()));
            reportBuilder.setPackage(locationBaseRequest.getPackageName());
            reportBuilder.setCpAppVersion(String.valueOf(APKUtil.getVersionCode(locationBaseRequest.getPackageName())));
        }
    }
}
