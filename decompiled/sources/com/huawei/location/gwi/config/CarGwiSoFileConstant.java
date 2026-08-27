package com.huawei.location.gwi.config;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.location.lite.common.util.SystemPropertiesUtil;
import java.io.File;
import o.WrappedCompositionsetContent1211;
import o.onPrepareActionMode;
import o.placeAtf8xVGno;

/* JADX INFO: loaded from: classes2.dex */
public class CarGwiSoFileConstant {
    public static final String ALG_NAME = "libCarGwiVdrV5";
    public static final String CAR_GWI_FILE_NAME = "libCarGwiVdrV5.7z";
    public static final long CAR_GWI_SPECIFY_INTERVAL = 86400000;
    public static final String CPU_API_NAME;
    public static final String FILE_PATH = onPrepareActionMode.IconCompatParcelizer(placeAtf8xVGno.read());
    public static final String GWI_VDR_SO_NAME = "libCarGwiVdrV5.so";
    public static final String SERVICE_TYPE = "CarGwi";
    public static final String SO_PATH;
    public static final String SP_CAR_GWI_FILE_NAME = "sp_libCarGwiSo_filename";
    public static final String SP_CAR_GWI_LAST_SAVE_TIME = "libCarGwi_last_time";
    public static final String SP_CAR_GWI_VERSION_NUM = "libCarGwi_version_num";
    public static final String SUB_TYPE = "libCarGwiVdrV5";
    public static final String UNPRESS_FOLDER_NAME = "libCarGwiVdrV5";

    static {
        String str = "arm64-v8a";
        try {
            String str2 = SystemPropertiesUtil.get("ro.product.cpu.abi", "arm64-v8a");
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LoadSoUtil", "getCpuAbi: " + str2);
            str = str2;
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read("LoadSoUtil", "getCpuAbi error");
        }
        CPU_API_NAME = str;
        StringBuilder sb = new StringBuilder();
        sb.append(onPrepareActionMode.IconCompatParcelizer(placeAtf8xVGno.read()));
        String str3 = File.separator;
        c8$$ExternalSyntheticOutline0.m(sb, str3, "libCarGwiVdrV5", str3, str);
        SO_PATH = ff$$ExternalSyntheticOutline0.m(sb, str3, GWI_VDR_SO_NAME);
    }
}
