package com.huawei.location.vdr.control;

import com.google.gson.annotations.SerializedName;
import com.huawei.location.lite.common.config.ConfigBaseResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class VDRConfig$ConfigEntity extends ConfigBaseResponse {

    @SerializedName("VDR_SWITCH")
    private boolean vdrSwitch = false;

    @SerializedName("MIN_SPEED")
    private int minSpeed = 3;

    @SerializedName("PACKAGE_LIST")
    private List<String> packageList = new ArrayList();

    @SerializedName("DEVICE_LIST")
    private List<String> deviceList = new ArrayList();

    private VDRConfig$ConfigEntity() {
    }

    public String toString() {
        return "ConfigEntity{vdrSwitch=" + this.vdrSwitch + ", PACKAGE_LIST=" + this.packageList.toString() + '}';
    }
}
