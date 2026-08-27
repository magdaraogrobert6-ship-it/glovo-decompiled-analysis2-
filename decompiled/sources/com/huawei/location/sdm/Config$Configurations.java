package com.huawei.location.sdm;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;
import com.huawei.location.lite.common.config.ConfigBaseResponse;
import java.util.ArrayList;
import java.util.List;
import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes2.dex */
public class Config$Configurations extends ConfigBaseResponse {

    @SerializedName("EPHEMERIS_VALID_TIME")
    private long ephemerisValidTime = 3600;

    @SerializedName("TILE_DAILY_MAX_NUM")
    private int tileDailyMaxNum = 25;

    @SerializedName("TILE_MAX_NUM")
    private int tileMaxNum = 30;

    @SerializedName("SMOOTH_COUNT_ENTER")
    private int smoothEnter = 3;

    @SerializedName("SMOOTH_COUNT_EXIT")
    private int smoothExit = 10;

    @SerializedName("AR_WALK_SPEED")
    private int arWalkSpeed = 3;

    @SerializedName("DEVICE_LIST")
    private List<String> deviceList = new ArrayList();

    public String toString() {
        StringBuilder sb = new StringBuilder("Configurations{ephemerisValidTime=");
        sb.append(this.ephemerisValidTime);
        sb.append(", tileDailyMaxNum=");
        return af$$ExternalSyntheticOutline0.m(sb, this.tileDailyMaxNum, '}');
    }

    private Config$Configurations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean valid() {
        long j = this.ephemerisValidTime;
        if (j > 7200 || j < 600) {
            WrappedCompositionsetContent1211.read();
            return false;
        }
        int i = this.tileDailyMaxNum;
        if (i <= 200 && i >= 0) {
            return true;
        }
        WrappedCompositionsetContent1211.read();
        return false;
    }
}
