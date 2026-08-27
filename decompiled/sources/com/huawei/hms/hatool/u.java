package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import com.huawei.riemann.location.common.utils.Constant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class u {
    private List<b1> a;
    private String b;
    private String c;
    private String d;

    public u(List<b1> list, String str, String str2, String str3) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    private void a(List<b1> list, String str, String str2) {
        if (!list.isEmpty()) {
            int size = list.size() / Constant.ERROR_UNKNOWN;
            for (int i = 0; i < size + 1; i++) {
                int i2 = i * Constant.ERROR_UNKNOWN;
                List<b1> listSubList = list.subList(i2, Math.min(list.size(), i2 + Constant.ERROR_UNKNOWN));
                String strReplace = UUID.randomUUID().toString().replace("-", "");
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jB = a1.b(str2, str);
                ArrayList arrayList = new ArrayList();
                for (b1 b1Var : listSubList) {
                    if (!c0.a(b1Var.b(), jCurrentTimeMillis, CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL * jB)) {
                        arrayList.add(b1Var);
                    }
                }
                if (arrayList.size() > 0) {
                    new l0(str2, str, this.d, arrayList, strReplace).a();
                } else {
                    v.e("hmsSdk", "No data to report handler");
                }
            }
        }
    }

    public void a() {
        if (!"_default_config_tag".equals(this.c)) {
            a(this.a, this.c, this.b);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (b1 b1Var : this.a) {
            String strC = b1Var.c();
            if (TextUtils.isEmpty(strC) || "oper".equals(strC)) {
                arrayList4.add(b1Var);
            } else if ("maint".equals(strC)) {
                arrayList.add(b1Var);
            } else if ("preins".equals(strC)) {
                arrayList2.add(b1Var);
            } else if ("diffprivacy".equals(strC)) {
                arrayList3.add(b1Var);
            }
        }
        a(arrayList4, "oper", "_default_config_tag");
        a(arrayList, "maint", "_default_config_tag");
        a(arrayList2, "preins", "_default_config_tag");
        a(arrayList3, "diffprivacy", "_default_config_tag");
    }
}
