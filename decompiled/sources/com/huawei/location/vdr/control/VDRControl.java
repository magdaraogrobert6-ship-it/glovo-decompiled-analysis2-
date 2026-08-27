package com.huawei.location.vdr.control;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.location.lite.common.util.SystemPropertiesUtil;
import java.util.Iterator;
import o.ComposeScrollCaptureCallbackScrollCaptureSessionListener;
import o.WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2onStateChanged1;
import o.WrappedCompositionsetContent1211;
import o.onSessionEnded;
import o.vectorResource;

/* JADX INFO: loaded from: classes2.dex */
public class VDRControl {
    private static final String TAG = "VDRControl";
    private static final String VDR_ENABLE = "1";
    public static final String VDR_GNSS_OPTION = "vdrEnable";
    private vectorResource config;

    public boolean isVdrRequest(String str) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "isVdrRequest:" + str);
        return TextUtils.equals(VDR_ENABLE, str);
    }

    public VDRControl() {
        vectorResource vectorresource = new vectorResource();
        this.config = vectorresource;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("VDRConfig", "init vdr config");
        vectorresource.RemoteActionCompatParcelizer = (VDRConfig$ConfigEntity) WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2onStateChanged1.serializer.serializer(VDRConfig$ConfigEntity.class, "vdr");
    }

    public boolean isSupport(String str) {
        if (this.config == null) {
            this.config = new vectorResource();
        }
        vectorResource vectorresource = this.config;
        if (vectorresource.RemoteActionCompatParcelizer == null) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("VDRConfig", "init vdr config");
            vectorresource.RemoteActionCompatParcelizer = (VDRConfig$ConfigEntity) WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2onStateChanged1.serializer.serializer(VDRConfig$ConfigEntity.class, "vdr");
            StringBuilder sb = new StringBuilder("get config failed, configEntity is Empty, get again not null:");
            sb.append(vectorresource.RemoteActionCompatParcelizer != null);
            WrappedCompositionsetContent1211.write("VDRConfig", sb.toString());
        }
        if (vectorresource.RemoteActionCompatParcelizer != null) {
            Iterator it = this.config.RemoteActionCompatParcelizer.packageList.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(str)) {
                    vectorResource vectorresource2 = this.config;
                    String str2 = (String) onSessionEnded.serializer.get(SystemPropertiesUtil.serializer());
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    String str3 = (String) ComposeScrollCaptureCallbackScrollCaptureSessionListener.serializer.get(Integer.valueOf(Build.VERSION.SDK_INT));
                    vectorresource2.getClass();
                    String str4 = str2 + BundleUtil.UNDERLINE_TAG + str3;
                    Iterator it2 = vectorresource2.RemoteActionCompatParcelizer.deviceList.iterator();
                    while (it2.hasNext()) {
                        if (((String) it2.next()).equals(str4)) {
                            return true;
                        }
                    }
                    WrappedCompositionsetContent1211.write("VDRConfig", "checkDevice not support :".concat(str4));
                    return false;
                }
            }
            WrappedCompositionsetContent1211.write("VDRConfig", "checkPackage not support:" + str);
        }
        return false;
    }

    public boolean isSpeedSupport(int i) {
        vectorResource vectorresource = this.config;
        if (vectorresource == null) {
            return false;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("VDRConfig", "checkSpeed :" + i);
        return i > vectorresource.RemoteActionCompatParcelizer.minSpeed;
    }
}
