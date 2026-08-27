package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.android.SystemUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class e {
    private static e b;
    private static Map<String, Long> c = new HashMap();
    private Context a;

    private void b(Context context) {
        String strD = o.d(context);
        q0.a(strD);
        if (!q1.b().a()) {
            v.c("hmsSdk", "userManager.isUserUnlocked() == false");
            return;
        }
        String strA = d.a(context, "global_v2", "app_ver", "");
        d.b(context, "global_v2", "app_ver", strD);
        q0.b(strA);
        if (TextUtils.isEmpty(strA)) {
            v.c("hmsSdk", "app ver is first save!");
        } else {
            if (strA.equals(strD)) {
                return;
            }
            v.c("hmsSdk", "the appVers are different!");
            a().a("", "alltype", strA);
        }
    }

    public void a(String str, String str2, String str3) {
        Context context = this.a;
        if (context == null) {
            v.e("hmsSdk", "onReport() null context or SDK was not init.");
            return;
        }
        String strB = r0.b(context);
        if (a1.e(str, str2) && !"WIFI".equals(strB)) {
            v.c("hmsSdk", "strNetworkType is :" + strB);
        } else if (SystemUtils.UNKNOWN.equals(strB) || "none".equals(strB) || "2G".equals(strB)) {
            v.e("hmsSdk", "The network is bad.");
        } else {
            b0.c().a(new v0(str, str2, str3));
        }
    }

    private static e b() {
        e eVar;
        synchronized (e.class) {
            if (b == null) {
                b = new e();
            }
            eVar = b;
        }
        return eVar;
    }

    public void a(Context context) {
        this.a = context;
        b(context);
        s.c().b().h(o.a());
    }

    public void a(String str, int i) {
        if (this.a == null) {
            v.e("hmsSdk", "onReport() null context or SDK was not init.");
        } else {
            v.a("hmsSdk", "onReport: Before calling runtaskhandler()");
            a(str, n1.a(i), q0.g());
        }
    }

    public void a(String str, int i, String str2, JSONObject jSONObject) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (2 == i) {
            jCurrentTimeMillis = n1.a("yyyy-MM-dd", jCurrentTimeMillis);
        }
        b0.c().a(new a0(str2, jSONObject, str, n1.a(i), jCurrentTimeMillis));
    }

    public void a(String str, int i, String str2, JSONObject jSONObject, long j) {
        new i1(str, n1.a(i), str2, jSONObject.toString(), j).a();
    }

    public void a(String str, String str2) {
        if (!a1.a(str, str2)) {
            v.c("hmsSdk", "auto report is closed tag:" + str);
            return;
        }
        long j = a1.j(str, str2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - j <= 30000) {
            v.f("hmsSdk", "autoReport timeout. interval < 30s ");
            return;
        }
        v.a("hmsSdk", "begin to call onReport!");
        a1.a(str, str2, jCurrentTimeMillis);
        a(str, str2, q0.g());
    }

    public static e a() {
        return b();
    }
}
