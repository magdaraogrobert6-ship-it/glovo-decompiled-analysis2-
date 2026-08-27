package com.huawei.hms.locationSdk;

import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.support.api.location.common.CollectionsUtil;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import com.huawei.hms.support.api.location.common.LocationRequestHelper;
import com.huawei.hms.support.log.HMSLog;
import com.incognia.internal.pNP$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import o.onCreateActionMode;

/* JADX INFO: loaded from: classes2.dex */
public class w0 extends v1 {
    private static volatile w0 c;
    private static final byte[] d = new byte[0];
    private List<LocationCallback> b = new ArrayList(10);

    @Override // com.huawei.hms.locationSdk.v1
    public void d(u1 u1Var) {
        super.d(u1Var);
        if (u1Var instanceof k1) {
            k1 k1Var = (k1) u1Var;
            int priority = k1Var.d().getPriority();
            if (priority == 200 || priority == 100 || priority == 400) {
                onCreateActionMode.write.IconCompatParcelizer(new RxWorker$1$$ExternalSyntheticLambda0(29, k1Var));
            }
        }
    }

    public boolean b(LocationCallback locationCallback) {
        HMSLocationLog.i("LocationRequestCacheManager", "", "findNoMatchCallback");
        synchronized (d) {
            if (locationCallback != null) {
                if (!CollectionsUtil.isEmpty(this.b)) {
                    for (int i = 0; i < this.b.size(); i++) {
                        LocationCallback locationCallback2 = this.b.get(i);
                        if (locationCallback2 != null && locationCallback2.equals(locationCallback)) {
                            HMSLocationLog.i("LocationRequestCacheManager", "", "find callback in removeNoMatchCallbackList, size is : " + this.b.size());
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    public boolean c(LocationCallback locationCallback) {
        HMSLocationLog.i("LocationRequestCacheManager", "", "removeNoMatchCallback");
        synchronized (d) {
            if (locationCallback != null) {
                if (!CollectionsUtil.isEmpty(this.b)) {
                    for (LocationCallback locationCallback2 : this.b) {
                        if (locationCallback2.equals(locationCallback)) {
                            this.b.remove(locationCallback2);
                            HMSLocationLog.i("LocationRequestCacheManager", "", "remove callback from noMatchCallbackList, size is : " + this.b.size());
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    public void a(LocationCallback locationCallback) {
        HMSLocationLog.i("LocationRequestCacheManager", "", "addNoMatchCallback");
        if (b(locationCallback)) {
            HMSLocationLog.i("LocationRequestCacheManager", "", "findNoMatchCallback in noMatchCallbackList, return here");
            return;
        }
        synchronized (d) {
            if (locationCallback != null) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                if (this.b.size() > 500) {
                    HMSLocationLog.e("LocationRequestCacheManager", "", "no match call back size reach max, return here");
                } else {
                    this.b.add(locationCallback);
                    HMSLocationLog.i("LocationRequestCacheManager", "", "add callback to noMatchCallbackList, size is : " + this.b.size());
                }
            }
        }
    }

    public static w0 b() {
        if (c == null) {
            synchronized (d) {
                if (c == null) {
                    c = new w0();
                }
            }
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c() {
        c0.b().j();
    }

    @Override // com.huawei.hms.locationSdk.v1
    public boolean c(u1 u1Var) {
        int priority;
        boolean zC = super.c(u1Var);
        if ((u1Var instanceof k1) && ((priority = ((k1) u1Var).d().getPriority()) == 200 || priority == 100 || priority == 400)) {
            onCreateActionMode.write.IconCompatParcelizer(new pNP$$ExternalSyntheticLambda0(6));
        }
        return zC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(k1 k1Var) {
        c0.b().a(k1Var.a(), LocationRequestHelper.getCpTid(k1Var.d()));
    }

    public void a(k1 k1Var, int i) {
        if (k1Var == null || CollectionsUtil.isEmpty(a())) {
            HMSLog.i("LocationRequestCacheManager", "updateCacheNumUpdates fail, cache or numUpdates is null");
            return;
        }
        for (int i2 = 0; i2 < a().size(); i2++) {
            k1 k1Var2 = a().get(i2) instanceof k1 ? (k1) a().get(i2) : null;
            if (k1Var2 != null && k1Var2.equals(k1Var)) {
                if (i > 0) {
                    k1Var2.d().setNumUpdates(i);
                }
                k1Var2.a(i);
            }
        }
    }
}
