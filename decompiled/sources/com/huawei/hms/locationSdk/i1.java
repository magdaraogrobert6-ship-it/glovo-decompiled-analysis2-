package com.huawei.hms.locationSdk;

import android.os.Looper;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.api.location.common.HMSLocationLog;

/* JADX INFO: loaded from: classes2.dex */
public class i1 extends l1 {
    public i1(String str, String str2, String str3, k1 k1Var, Looper looper, String str4) throws ApiException {
        super(str, str2, str3, k1Var, looper, str4);
    }

    @Override // com.huawei.hms.locationSdk.l1, com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 40003318;
    }

    @Override // com.huawei.hms.locationSdk.l1
    public String a() {
        return "RequestLocationExUpdatesTaskApiCall";
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        LocationRequest locationRequestD = ((l1) this).d.d();
        if (locationRequestD == null) {
            HMSLocationLog.e(a(), ((b) this).a, "locationRequest is null");
            return super.getApiLevel();
        }
        int priority = locationRequestD.getPriority();
        if (priority == 300) {
            return 5;
        }
        if (priority == 400) {
            return 8;
        }
        if (priority == 301) {
            return 9;
        }
        return super.getApiLevel();
    }
}
