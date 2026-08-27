package com.huawei.location.lite.common.report;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.location.lite.common.agc.AGCManager;
import com.huawei.location.lite.common.util.APKUtil;
import com.huawei.location.lite.common.util.NetworkUtil;
import java.util.LinkedHashMap;
import o.PrimaryTextActionModeCallback;
import o.WrappedCompositionsetContent1211;
import o.addMenuItemui;
import o.onActionItemClicked;
import o.placeAtf8xVGno;
import o.setCollectionItemInfo;

/* JADX INFO: loaded from: classes2.dex */
public class ReportBuilder {
    protected static final String CLOUD_FENCE_TYPE = "3";
    protected static final String CP_SDK_TYPE = "1";
    protected static final String FULL_SDK_TYPE = "4";
    protected static final String OPEN_SDK_TYPE = "2";
    private static final String ROM_CN_HW = "1003";
    private static final String ROM_G_ABROAD = "1002";
    private static final String ROM_HW_PAD = "1100";
    private static final String ROM_HW_WATCH = "1200";
    private static final String ROM_NOG_ABROAD = "1001";
    private static final String ROM_NO_HW = "2001";
    private long callTime;
    private String eventId;
    protected LinkedHashMap<String, String> linkedHashMap = new setCollectionItemInfo();

    public LinkedHashMap<String, String> build() {
        return this.linkedHashMap;
    }

    public String getEventId() {
        return this.eventId;
    }

    public final ReportBuilder setBrand() {
        String str;
        LinkedHashMap<String, String> linkedHashMap = this.linkedHashMap;
        String[] strArr = onActionItemClicked.RemoteActionCompatParcelizer;
        synchronized (onActionItemClicked.class) {
            if (TextUtils.isEmpty(onActionItemClicked.read)) {
                onActionItemClicked.read = Build.BRAND;
            }
            str = onActionItemClicked.read;
        }
        linkedHashMap.put("brand", str);
        return this;
    }

    public final ReportBuilder setExtParam(String str, String str2) {
        this.linkedHashMap.put(str, str2);
        return this;
    }

    public final ReportBuilder setLocationEnable(boolean z) {
        if (!z) {
            this.linkedHashMap.put("locEnable", "false");
        }
        return this;
    }

    public final ReportBuilder setManufacturer() {
        String str;
        LinkedHashMap<String, String> linkedHashMap = this.linkedHashMap;
        String[] strArr = onActionItemClicked.RemoteActionCompatParcelizer;
        synchronized (onActionItemClicked.class) {
            if (TextUtils.isEmpty(onActionItemClicked.MediaSessionCompatQueueItem)) {
                onActionItemClicked.MediaSessionCompatQueueItem = Build.MANUFACTURER;
            }
            str = onActionItemClicked.MediaSessionCompatQueueItem;
        }
        linkedHashMap.put("pub_mfc", str);
        return this;
    }

    public final ReportBuilder setApiName(String str) {
        this.linkedHashMap.put("apiName", str);
        this.eventId = str;
        return this;
    }

    public final ReportBuilder setAppID(String str) {
        this.linkedHashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, str);
        return this;
    }

    public final ReportBuilder setCallTime() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.linkedHashMap.put("callTime", String.valueOf(jCurrentTimeMillis));
        this.callTime = jCurrentTimeMillis;
        return this;
    }

    public final ReportBuilder setCostTime() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.callTime;
        if (jCurrentTimeMillis <= 0) {
            jCurrentTimeMillis = 0;
        }
        this.linkedHashMap.put(WiseOpenHianalyticsData.UNION_COSTTIME, String.valueOf(jCurrentTimeMillis));
        return this;
    }

    public final ReportBuilder setCpAppVersion(String str) {
        this.linkedHashMap.put(WiseOpenHianalyticsData.UNION_APP_VERSION, str);
        return this;
    }

    public final ReportBuilder setErrorCode(String str) {
        this.linkedHashMap.put("errorCode", str);
        return this;
    }

    public final ReportBuilder setErrorMessage(String str) {
        this.linkedHashMap.put("errorMessage", str);
        return this;
    }

    public final ReportBuilder setExt(String str) {
        this.linkedHashMap.put("ext", str);
        return this;
    }

    public final ReportBuilder setLBSVersionCode(long j) {
        this.linkedHashMap.put("lbs_version", j + "");
        return this;
    }

    public final ReportBuilder setLocationSdkType(String str) {
        this.linkedHashMap.put("lcSdkType", str);
        return this;
    }

    public final ReportBuilder setMCC(String str) {
        this.linkedHashMap.put("MCC", str);
        return this;
    }

    public final ReportBuilder setModuleName(String str) {
        this.linkedHashMap.put("module", str);
        return this;
    }

    public final ReportBuilder setNetworkType(String str) {
        this.linkedHashMap.put("networkType", str);
        return this;
    }

    public final ReportBuilder setOperator(String str) {
        this.linkedHashMap.put("operator", str);
        return this;
    }

    public final ReportBuilder setPackage(String str) {
        this.linkedHashMap.put("package", str);
        return this;
    }

    public final ReportBuilder setRequestUrl(String str) {
        this.linkedHashMap.put("requestUrl", str);
        return this;
    }

    public final ReportBuilder setResult(String str) {
        this.linkedHashMap.put("result", str);
        return this;
    }

    public final ReportBuilder setRomType(String str) {
        this.linkedHashMap.put("rom_type", str);
        return this;
    }

    public final ReportBuilder setService(String str) {
        this.linkedHashMap.put("service", str);
        return this;
    }

    public final ReportBuilder setSrc(String str) {
        this.linkedHashMap.put("src", str);
        return this;
    }

    public final ReportBuilder setTag(String str) {
        this.linkedHashMap.put(RemoteMessageConst.Notification.TAG, str);
        return this;
    }

    public final ReportBuilder setTransactionID(String str) {
        this.linkedHashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, str);
        return this;
    }

    public final ReportBuilder setVersion(String str) {
        this.linkedHashMap.put("version", str);
        return this;
    }

    public final ReportBuilder setWLANScan() {
        if (!addMenuItemui.read(placeAtf8xVGno.read())) {
            this.linkedHashMap.put("WLANScan", "false");
        }
        return this;
    }

    public final ReportBuilder setWifiEnable() {
        try {
            Object systemService = placeAtf8xVGno.read().getApplicationContext().getSystemService("wifi");
            if (!(systemService instanceof WifiManager) || !((WifiManager) systemService).isWifiEnabled()) {
                this.linkedHashMap.put("wifiEnable", "false");
            }
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read("TelephonyUtil", "checkWifiIsEnable exception");
        }
        return this;
    }

    public ReportBuilder() {
        boolean zHasCapability;
        NetworkCapabilities networkCapabilities;
        setBrand();
        setManufacturer();
        setCallTime();
        setWifiEnable();
        setService("hwLocation");
        int iWrite = NetworkUtil.write(placeAtf8xVGno.read());
        setNetworkType(iWrite != 1 ? iWrite != 2 ? iWrite != 3 ? iWrite != 4 ? iWrite != 5 ? "" : "5G" : "4G" : "3G" : "2G" : "wifi");
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) NetworkUtil.read(placeAtf8xVGno.read(), "connectivity");
            zHasCapability = (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) == null) ? false : networkCapabilities.hasCapability(16);
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read("NetworkUtil", "isNetValida exception");
        }
        setNetworkValid(zHasCapability);
        setMCC(addMenuItemui.read());
        setLocationSdkType("4");
        setLBSVersionCode(APKUtil.getVersionCode("com.huawei.lbs"));
        setRomType(getRomType());
        setPackage(placeAtf8xVGno.read().getPackageName());
        setVersion(String.valueOf(21600302));
        if (Integer.parseInt("100") == 100) {
            AGCManager.read().getClass();
            setAppID(AGCManager.serializer());
        }
    }

    public String getMcc() {
        LinkedHashMap<String, String> linkedHashMap = this.linkedHashMap;
        return linkedHashMap == null ? "" : linkedHashMap.get("MCC");
    }

    public final String getRomType() {
        if (!PrimaryTextActionModeCallback.write()) {
            return ROM_NO_HW;
        }
        if (onActionItemClicked.write(placeAtf8xVGno.read()) == 1) {
            return ROM_HW_PAD;
        }
        if (onActionItemClicked.write(placeAtf8xVGno.read()) == 2 && PrimaryTextActionModeCallback.write()) {
            return ROM_HW_WATCH;
        }
        if (PrimaryTextActionModeCallback.read()) {
            return ROM_CN_HW;
        }
        return PrimaryTextActionModeCallback.RemoteActionCompatParcelizer() ? ROM_G_ABROAD : ROM_NOG_ABROAD;
    }

    public ReportBuilder setNetworkValid(boolean z) {
        this.linkedHashMap.put("netWorkValid", "" + z);
        return this;
    }
}
