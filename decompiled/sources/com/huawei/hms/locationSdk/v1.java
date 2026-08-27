package com.huawei.hms.locationSdk;

import com.huawei.hms.locationSdk.u1;
import com.huawei.hms.support.api.location.common.CollectionsUtil;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class v1<T extends u1> {
    private List<T> a = new ArrayList(10);

    public void a(T t) {
        if (t == null) {
            return;
        }
        if (this.a == null) {
            this.a = new ArrayList();
        }
        HMSLocationLog.i("TidCacheManager", t.a(), "list to add size is:" + this.a.size());
        if (b(t) != null) {
            HMSLocationLog.i("TidCacheManager", t.a(), "this request is included");
        } else {
            HMSLocationLog.i("TidCacheManager", t.a(), "add request");
            this.a.add(t);
        }
    }

    public T b(T t) {
        if (t == null || CollectionsUtil.isEmpty(this.a)) {
            return null;
        }
        HMSLocationLog.i("TidCacheManager", t.a(), "list to find size is:" + this.a.size());
        for (int i = 0; i < this.a.size(); i++) {
            T t2 = this.a.get(i);
            if (t2 != null && t2.equals(t)) {
                HMSLocationLog.i("TidCacheManager", t.a(), "find tid in list, tid:" + t2.a());
                return t2;
            }
        }
        return null;
    }

    public boolean c(T t) {
        if (t == null || CollectionsUtil.isEmpty(this.a)) {
            return false;
        }
        for (T t2 : this.a) {
            if (t2.equals(t)) {
                HMSLocationLog.i("TidCacheManager", t.a(), "remove request from list");
                this.a.remove(t2);
                return true;
            }
        }
        return false;
    }

    public void d(T t) {
        if (t == null) {
            return;
        }
        if (this.a.isEmpty()) {
            HMSLocationLog.i("TidCacheManager", t.a(), "replaceRequestCache add Request");
            this.a.add(t);
            return;
        }
        HMSLocationLog.i("TidCacheManager", t.a(), "list to replace size is:" + this.a.size());
        int i = 0;
        while (true) {
            int size = this.a.size();
            List<T> list = this.a;
            if (i < size) {
                T t2 = list.get(i);
                if (t2 != null && t2.equals(t)) {
                    HMSLocationLog.i("TidCacheManager", t.a(), "replace old tid is " + t2.a() + ". new tid is " + t.a());
                    this.a.set(i, t);
                    return;
                }
                i++;
            } else {
                list.add(t);
                HMSLocationLog.i("TidCacheManager", t.a(), "replaceRequestCache add Request.");
                return;
            }
        }
    }

    public List<T> a() {
        return this.a;
    }
}
