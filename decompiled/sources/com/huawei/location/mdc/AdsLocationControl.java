package com.huawei.location.mdc;

import o.WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2onStateChanged1;

/* JADX INFO: loaded from: classes2.dex */
public class AdsLocationControl {
    private static final String CONFIG_ITEM_NAME = "gwi";

    public static boolean isMdcControlEnable() {
        AdsLocationConfig adsLocationConfig = (AdsLocationConfig) WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2onStateChanged1.serializer.serializer(AdsLocationConfig.class, CONFIG_ITEM_NAME);
        if (adsLocationConfig != null) {
            return adsLocationConfig.isMdcEnable();
        }
        return true;
    }
}
