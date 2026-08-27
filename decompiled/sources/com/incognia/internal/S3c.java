package com.incognia.internal;

import android.os.SystemClock;
import androidx.sqlite.SQLite;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o.getQueryParameterslambda2;
import o.onViewDetachedFromWindowlambda1;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class S3c {
    public final String BGx;
    public final KWh HQ;
    public final ghL N;
    public final V9 mbG;

    public S3c(String str, V9 v9, KWh kWh) {
        ghL ghl = new ghL(str);
        this.BGx = str;
        this.mbG = v9;
        this.HQ = kWh;
        this.N = ghl;
    }

    public final boolean BGx() {
        Long l;
        ghL ghl = this.N;
        ghl.getClass();
        Long lN = Ay.BGx.N(ghl.BGx);
        this.HQ.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (lN != null && jElapsedRealtime >= lN.longValue()) {
            long jLongValue = lN.longValue();
            d9 d9VarBGx = this.mbG.BGx(this.BGx);
            if (jElapsedRealtime - jLongValue < ((d9VarBGx == null || (l = d9VarBGx.BGx) == null) ? CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL : l.longValue())) {
                return false;
            }
        }
        return true;
    }

    public final boolean mbG(List list) throws JSONException {
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MLu mLu = (MLu) it.next();
            onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = MLu.BGx;
            d9 d9VarBGx = this.mbG.BGx(this.BGx);
            List list2 = null;
            ArrayList arrayList = d9VarBGx != null ? d9VarBGx.N : null;
            if (arrayList != null) {
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    try {
                        arrayList2.add(tn.BGx((String) obj));
                    } catch (Throwable unused) {
                    }
                }
                list2 = arrayList2;
            }
            if (list2 == null) {
                list2 = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{xY.mbG}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
            }
            if (list2.contains(mLu)) {
                return true;
            }
        }
        return false;
    }

    public final boolean BGx(List list) throws JSONException {
        Boolean bool;
        Boolean bool2;
        d9 d9VarBGx = this.mbG.BGx(this.BGx);
        if (d9VarBGx != null && (bool2 = d9VarBGx.HQ) != null && !bool2.booleanValue()) {
            return false;
        }
        d9 d9VarBGx2 = this.mbG.BGx(this.BGx);
        return !(d9VarBGx2 == null || (bool = d9VarBGx2.mbG) == null || !bool.booleanValue()) || BGx() || mbG(list);
    }
}
