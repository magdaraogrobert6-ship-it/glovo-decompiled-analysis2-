package com.huawei.wisesecurity.ucs.credential.outer;

import android.content.Context;
import android.text.TextUtils;
import androidx.camera.video.Recorder$3;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.credential.outer.impl.QuietHACapabilityImpl;
import o.ProgressBarRangeInfo;
import o.RoleCompanion;
import o.accessgetSwitchcp;
import o.getImageo7Vup1c;
import o.getSteps;

/* JADX INFO: loaded from: classes2.dex */
public class Selector {
    private static final String GRS_FEATURE_CLASS = "com.huawei.hms.framework.network.grs.GrsClient";
    private static final String HA_FEATURE_CLASS = "com.huawei.hianalytics.process.HiAnalyticsInstance";
    private static final String NETWORK_FEATURE_CLASS = "com.huawei.hms.network.restclient.RestClient";
    private static final int NETWORK_RETRY_TIME_MAX = 5;
    private static final int NETWORK_RETRY_TIME_MIN = 1;
    private static final int NETWORK_TIME_OUT_MAX = 20000;
    private static final int NETWORK_TIME_OUT_MIN = 10000;
    private static final int SER_COUNTRY_LENGTH_MAX = 7;
    private static final int SER_COUNTRY_LENGTH_MIN = 2;
    private static final String TAG = "Selector";

    public static NetworkCapability selectNetWorkCapability(NetworkCapability networkCapability, Context context, int i, int i2) throws UcsException {
        if (networkCapability != null) {
            networkCapability.initConfig(i, i2);
            return networkCapability;
        }
        try {
            Class.forName(NETWORK_FEATURE_CLASS);
            if (i < 10000 || i > NETWORK_TIME_OUT_MAX || i2 < 1 || i2 > 5) {
                throw new UcsException(1001L, "networkTimeOut or networkRetryTime param error");
            }
            RoleCompanion roleCompanion = new RoleCompanion();
            roleCompanion.write = context;
            roleCompanion.initConfig(i, i2);
            getSteps.read(TAG, "outer Network capability is null, use inner capability", new Object[0]);
            return roleCompanion;
        } catch (ClassNotFoundException e) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("Network capability not found : ");
            sbIconCompatParcelizer.append(e.getMessage());
            throw new UcsException(1025L, sbIconCompatParcelizer.toString());
        }
    }

    public static HACapability selectHACapability(HACapability hACapability, getImageo7Vup1c getimageo7vup1c, ProgressBarRangeInfo progressBarRangeInfo) throws UcsException {
        if (hACapability != null) {
            return hACapability;
        }
        if (ProgressBarRangeInfo.REPORT_CLOSE == progressBarRangeInfo) {
            return new QuietHACapabilityImpl();
        }
        try {
            Class.forName(HA_FEATURE_CLASS);
            getSteps.read(TAG, "outer HA capability is null, use inner capability", new Object[0]);
            String strSerializer = getimageo7vup1c.serializer();
            Recorder$3 recorder$3 = new Recorder$3(1);
            recorder$3.MediaBrowserCompatMediaItem = progressBarRangeInfo;
            recorder$3.RemoteActionCompatParcelizer = strSerializer;
            return recorder$3;
        } catch (ClassNotFoundException e) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("HA capability not found : ");
            sbIconCompatParcelizer.append(e.getMessage());
            throw new UcsException(1025L, sbIconCompatParcelizer.toString());
        }
    }

    public static getImageo7Vup1c selectGrsCapability(GrsCapability grsCapability, Context context, String str) throws UcsException {
        boolean z = false;
        if (grsCapability != null) {
            i$d.a aVar = new i$d.a(24, z);
            aVar.read = grsCapability;
            return aVar;
        }
        try {
            if (!TextUtils.isEmpty(str) && (str.length() < 2 || str.length() > 7)) {
                throw new UcsException(1001L, "serCountry param error");
            }
            getSteps.read(TAG, "outer GRS capability is null, use inner capability", new Object[0]);
            i$d.a aVar2 = new i$d.a(26, z);
            GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
            grsBaseInfo.setSerCountry(str);
            aVar2.read = new GrsClient(context, grsBaseInfo);
            return aVar2;
        } catch (ClassNotFoundException e) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("GRS capability not found : ");
            sbIconCompatParcelizer.append(e.getMessage());
            throw new UcsException(1025L, sbIconCompatParcelizer.toString());
        }
    }
}
