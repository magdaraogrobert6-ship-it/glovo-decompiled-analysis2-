package com.incognia.internal;

import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import androidx.sqlite.SQLite;
import java.util.ArrayList;
import java.util.List;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class LQ4 {
    public static final List HQ = instance_delegatelambda0.write;
    public static final List N = SQLite.read("android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE");
    public final YZr BGx;
    public final iLf mbG;

    public final boolean BGx() {
        ArrayList arrayList;
        YZr yZr = this.BGx;
        String str = yZr.A1;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, str}, getCieXyz.write())).booleanValue() || yZr.HQ) {
            try {
                PackageInfo packageInfo = yZr.mbG.getPackageInfo(str, 6);
                ArrayList arrayList2 = new ArrayList();
                ActivityInfo[] activityInfoArr = packageInfo.activities;
                if (activityInfoArr != null) {
                    onContentCardDismissed.serializer(arrayList2, activityInfoArr);
                }
                ServiceInfo[] serviceInfoArr = packageInfo.services;
                if (serviceInfoArr != null) {
                    onContentCardDismissed.serializer(arrayList2, serviceInfoArr);
                }
                ProviderInfo[] providerInfoArr = packageInfo.providers;
                if (providerInfoArr != null) {
                    onContentCardDismissed.serializer(arrayList2, providerInfoArr);
                }
                ActivityInfo[] activityInfoArr2 = packageInfo.receivers;
                if (activityInfoArr2 != null) {
                    onContentCardDismissed.serializer(arrayList2, activityInfoArr2);
                }
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    if (((ComponentInfo) obj).enabled) {
                        arrayList3.add(obj);
                    }
                }
                arrayList = new ArrayList(accessgetInstancedelegatecp.write(arrayList3, 10));
                int size2 = arrayList3.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList3.get(i2);
                    i2++;
                    arrayList.add(((ComponentInfo) obj2).name);
                }
            } catch (Throwable unused) {
                arrayList = null;
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            return arrayList.containsAll(HQ);
        }
        return false;
    }

    public LQ4(YZr yZr, iLf ilf) {
        this.BGx = yZr;
        this.mbG = ilf;
    }
}
