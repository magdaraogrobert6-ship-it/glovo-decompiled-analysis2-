package com.huawei.hms.locationSdk;

import android.os.Looper;
import android.text.TextUtils;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.location.HWLocation;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class u0 {
    private HWLocation b;
    private int d;
    private boolean e;
    private final AtomicBoolean a = new AtomicBoolean(false);
    private List<String> c = new ArrayList();

    private String c(HWLocation hWLocation) {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(hWLocation.getTime());
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(hWLocation.getBearing());
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(hWLocation.getSpeed());
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(hWLocation.getAccuracy());
        Map<String, Object> extraInfo = hWLocation.getExtraInfo();
        if (extraInfo == null) {
            return sb.toString();
        }
        int iA = a("loc_arStatus", extraInfo);
        if (iA != -1) {
            c8$$ExternalSyntheticOutline0.m(iA, a("loc_arAcc", extraInfo), BundleUtil.UNDERLINE_TAG, BundleUtil.UNDERLINE_TAG, sb);
        }
        hWLocation.setExtraInfo(extraInfo);
        return sb.toString();
    }

    public String a() {
        if (!this.a.get() || this.c.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.c.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        this.c.clear();
        return sb.toString();
    }

    public void b(HWLocation hWLocation) {
        synchronized (this) {
            if (!this.a.get()) {
                HMSLocationLog.w("LocationInfoCollector", "", "onLocationChange is not start");
                return;
            }
            if (hWLocation == null) {
                HMSLocationLog.e("LocationInfoCollector", "", "HWLocation is null");
                return;
            }
            if (a(hWLocation)) {
                this.b = hWLocation;
                String strC = c(hWLocation);
                if (this.e) {
                    HMSLocationLog.i("LocationInfoCollector", "", "onLocationChange:" + strC);
                } else {
                    HMSLocationLog.i("LocationInfoCollector", "", "onLocationChange");
                }
                int size = this.c.size();
                int i = this.d;
                if (size == i) {
                    this.c.remove(i - 1);
                }
                this.c.add(strC);
            }
        }
    }

    private int a(String str, Map<String, Object> map) {
        Object objRemove = map.remove(str);
        if (objRemove != null && (objRemove instanceof Integer)) {
            return ((Integer) objRemove).intValue();
        }
        return -1;
    }

    private boolean a(HWLocation hWLocation) {
        if (hWLocation == null) {
            return false;
        }
        try {
            HWLocation hWLocation2 = this.b;
            if (hWLocation2 == null) {
                return true;
            }
            return (!TextUtils.equals(hWLocation2.getProvider(), "gps") && TextUtils.equals(hWLocation.getProvider(), "gps")) || hWLocation.getTime() - this.b.getTime() >= 500;
        } catch (Exception unused) {
            HMSLocationLog.e("LocationInfoCollector", "", "needCache error");
            return false;
        }
    }

    public boolean a(int i, Looper looper, boolean z) {
        synchronized (this) {
            if (this.a.get()) {
                return true;
            }
            this.e = z;
            HMSLocationLog.i("LocationInfoCollector", "", "start");
            this.a.set(true);
            this.d = i;
            return true;
        }
    }

    public void b() {
        synchronized (this) {
            HMSLocationLog.i("LocationInfoCollector", "", "stop");
            this.c.clear();
            this.b = null;
            this.a.set(false);
        }
    }
}
