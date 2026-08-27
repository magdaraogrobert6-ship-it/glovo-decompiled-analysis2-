package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.UUID;
import o.ComposeScrollCaptureCallbackscrollTracker1;

/* JADX INFO: loaded from: classes2.dex */
public class j {
    private static j b;
    private Context a;

    public static class a extends e0 {
        String a;
        String b;

        @Override // com.huawei.hms.hatool.e0
        public String a() {
            return z.d(this.a, this.b);
        }

        @Override // com.huawei.hms.hatool.e0
        public String b() {
            return z.g(this.a, this.b);
        }

        @Override // com.huawei.hms.hatool.e0
        public String c() {
            return z.j(this.a, this.b);
        }

        @Override // com.huawei.hms.hatool.e0
        public int d() {
            return (z.k(this.a, this.b) ? 4 : 0) | (z.e(this.a, this.b) ? 2 : 0) | (z.h(this.a, this.b) ? 1 : 0);
        }

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.huawei.hms.hatool.e0
        public String a(String str) {
            return ComposeScrollCaptureCallbackscrollTracker1.IconCompatParcelizer(str);
        }
    }

    public String d(String str, String str2) {
        return f1.b(str, str2);
    }

    public String f(String str, String str2) {
        return f1.a(str, str2);
    }

    public String a(boolean z) {
        if (!z) {
            return "";
        }
        String strE = q0.e();
        if (TextUtils.isEmpty(strE)) {
            strE = d.a(this.a, "global_v2", "uuid", "");
            if (TextUtils.isEmpty(strE)) {
                strE = UUID.randomUUID().toString().replace("-", "");
                d.b(this.a, "global_v2", "uuid", strE);
            }
            q0.h(strE);
        }
        return strE;
    }

    public String b(String str, String str2) {
        return i0.b(this.a, str, str2);
    }

    public i c(String str, String str2) {
        return new a(str, str2).a(this.a);
    }

    public Pair<String, String> e(String str, String str2) {
        if (!z.f(str, str2)) {
            return new Pair<>("", "");
        }
        String strP = s.c().b().p();
        String strQ = s.c().b().q();
        if (!TextUtils.isEmpty(strP) && !TextUtils.isEmpty(strQ)) {
            return new Pair<>(strP, strQ);
        }
        Pair<String, String> pairE = x0.e(this.a);
        s.c().b().k((String) pairE.first);
        s.c().b().l((String) pairE.second);
        return pairE;
    }

    public String a(String str, String str2) {
        return i0.a(this.a, str, str2);
    }

    public static j a() {
        j jVar;
        synchronized (j.class) {
            if (b == null) {
                b = new j();
            }
            jVar = b;
        }
        return jVar;
    }

    public void a(Context context) {
        if (this.a == null) {
            this.a = context;
        }
    }
}
