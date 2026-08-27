package com.incognia.internal;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class N {
    public static final long N = 60000;
    public final mAX BGx;
    public final AccessibilityManager HQ;
    public final mAX mbG;

    public final List BGx() {
        List list;
        AccessibilityManager accessibilityManager;
        synchronized (this) {
            if (this.BGx.BGx() && (accessibilityManager = this.HQ) != null) {
                mAX max = this.BGx;
                List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                ArrayList arrayList = new ArrayList();
                Iterator<AccessibilityServiceInfo> it = enabledAccessibilityServiceList.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getResolveInfo().serviceInfo.packageName);
                }
                max.BGx(arrayList);
            }
            list = (List) this.BGx.N;
        }
        return list;
    }

    public final List mbG() {
        List list;
        AccessibilityManager accessibilityManager;
        synchronized (this) {
            if (this.mbG.BGx() && (accessibilityManager = this.HQ) != null) {
                mAX max = this.mbG;
                List<AccessibilityServiceInfo> installedAccessibilityServiceList = accessibilityManager.getInstalledAccessibilityServiceList();
                ArrayList arrayList = new ArrayList();
                Iterator<AccessibilityServiceInfo> it = installedAccessibilityServiceList.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getResolveInfo().serviceInfo.packageName);
                }
                max.BGx(arrayList);
            }
            list = (List) this.mbG.N;
        }
        return list;
    }

    public N(Context context, KWh kWh) {
        long j = N;
        this.BGx = new mAX(kWh, j);
        this.mbG = new mAX(kWh, j);
        this.HQ = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public final ArrayList BGx(String str) {
        ResolveInfo resolveInfo;
        ServiceInfo serviceInfo;
        if (this.HQ == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<AccessibilityServiceInfo> it = this.HQ.getInstalledAccessibilityServiceList().iterator();
        while (it.hasNext()) {
            AccessibilityServiceInfo next = it.next();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(next == null || (resolveInfo = next.getResolveInfo()) == null || (serviceInfo = resolveInfo.serviceInfo) == null) ? null : serviceInfo.packageName, str}, getCieXyz.write())).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
