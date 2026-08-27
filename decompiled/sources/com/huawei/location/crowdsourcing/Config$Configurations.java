package com.huawei.location.crowdsourcing;

import android.text.TextUtils;
import bo.app.af$$ExternalSyntheticOutline0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.gson.annotations.SerializedName;
import com.huawei.location.lite.common.config.ConfigBaseResponse;
import java.util.ArrayList;
import java.util.List;
import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes4.dex */
class Config$Configurations extends ConfigBaseResponse {

    @SerializedName("GEO_LOCATION_COLLECT_TYPE")
    private int collectType = -1;

    @SerializedName("LOCATION_COLLECT_INTERVAL")
    private long collectInterval = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;

    @SerializedName("LOCATION_DISTANCE_INTERVAL")
    private int collectDistance = 5;

    @SerializedName("LOCATION_UPLOAD_TIME")
    private long uploadInterval = 1800;

    @SerializedName("LOCATION_UPLOAD_NUM")
    private int uploadNumThreshold = 5;

    @SerializedName("WIFI_COLLECT_MAX_NUM")
    private int wifiDailyLimit = 1000;

    @SerializedName("WIFI_AP_COLLCT_MAX_NUM")
    private int wifiApNumLimit = 200;

    @SerializedName("WIFI_SCANRESULT_VALID_INTERVAL")
    private long wifiValidInterval = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;

    @SerializedName("CELL_COLLECT_MAX_NUM")
    private int cellDailyLimit = 1000;

    @SerializedName("CELL_COLLECT_INTERVAL")
    private long cellCollectInterval = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;

    @SerializedName("CELL_SCANRESULT_VALID_INTERVAL")
    private long cellValidInterval = DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;

    @SerializedName("LOCAL_RECORD_FILE_MAX_SIZE")
    private int cacheSizeLimit = 50;

    @SerializedName("LOG_SERVER_KEY")
    private String logServerKey = "";

    @SerializedName("MCC_EXCLUDE_LIST")
    private List<String> excludeMccList = new ArrayList();

    @SerializedName("UPLOAD_PUBLIC_KEY")
    private String uploadPublicKey = "";

    private Config$Configurations() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Configurations{collectType=");
        sb.append(this.collectType);
        sb.append(", collectInterval=");
        sb.append(this.collectInterval);
        sb.append(", collectDistance=");
        sb.append(this.collectDistance);
        sb.append(", uploadInterval=");
        sb.append(this.uploadInterval);
        sb.append(", uploadNumThreshold=");
        sb.append(this.uploadNumThreshold);
        sb.append(", wifiDailyLimit=");
        sb.append(this.wifiDailyLimit);
        sb.append(", wifiApNumLimit=");
        sb.append(this.wifiApNumLimit);
        sb.append(", wifiValidInterval=");
        sb.append(this.wifiValidInterval);
        sb.append(", cellDailyLimit=");
        sb.append(this.cellDailyLimit);
        sb.append(", cellCollectInterval=");
        sb.append(this.cellCollectInterval);
        sb.append(", cellValidInterval=");
        sb.append(this.cellValidInterval);
        sb.append(", cacheSizeLimit=");
        return af$$ExternalSyntheticOutline0.m(sb, this.cacheSizeLimit, '}');
    }

    private boolean checkWifiCell() {
        if (this.wifiDailyLimit < 0) {
            WrappedCompositionsetContent1211.read();
            return false;
        }
        if (this.wifiApNumLimit < 0) {
            WrappedCompositionsetContent1211.read();
            return false;
        }
        if (this.wifiValidInterval < 0) {
            WrappedCompositionsetContent1211.read();
            return false;
        }
        if (this.cellDailyLimit < 0) {
            WrappedCompositionsetContent1211.read();
            return false;
        }
        if (this.cellCollectInterval < 0) {
            WrappedCompositionsetContent1211.read();
            return false;
        }
        if (this.cellValidInterval >= 0) {
            return true;
        }
        WrappedCompositionsetContent1211.read();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean valid() {
        int i = this.collectType;
        if (i < -1 || i > 2) {
            WrappedCompositionsetContent1211.read();
            return false;
        }
        if (this.collectInterval < 0 || this.collectDistance < 0) {
            WrappedCompositionsetContent1211.read();
            return false;
        }
        if (this.uploadInterval < 0 || this.uploadNumThreshold < 0) {
            WrappedCompositionsetContent1211.read();
            return false;
        }
        if (!checkWifiCell()) {
            return false;
        }
        if (this.cacheSizeLimit < 0) {
            WrappedCompositionsetContent1211.read();
            return false;
        }
        if (this.logServerKey.isEmpty()) {
            WrappedCompositionsetContent1211.read();
            return false;
        }
        if (!TextUtils.isEmpty(this.uploadPublicKey)) {
            return true;
        }
        WrappedCompositionsetContent1211.read();
        return false;
    }
}
