package com.incognia.internal;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Process;
import java.util.ArrayList;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class C {
    public final Context BGx;
    public final B60 mbG;

    public C(Context context, B60 b60) {
        this.BGx = context;
        this.mbG = b60;
    }

    public final String BGx(ArrayList arrayList) {
        Object obj;
        int i = 0;
        if (!XUh.BGx(XUh.BGx, 31, 0, 2)) {
            return null;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.BGx.getSystemService("appops");
        int size = arrayList.size();
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            dCe dce = (dCe) obj;
            Integer num = dce.j;
            String str = dce.q;
            if (num != null && str != null && appOpsManager.checkOpNoThrow("android:mock_location", num.intValue(), str) == 0) {
                break;
            }
        }
        dCe dce2 = (dCe) obj;
        if (dce2 != null) {
            return dce2.q;
        }
        return null;
    }

    public final boolean BGx() {
        if (XUh.BGx(XUh.BGx, 23, 0, 2)) {
            return ((AppOpsManager) this.BGx.getSystemService("appops")).checkOpNoThrow("android:mock_location", Process.myUid(), this.BGx.getPackageName()) == 0;
        }
        return !((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG.mbG("mock_location"), "0"}, getCieXyz.write())).booleanValue();
    }
}
