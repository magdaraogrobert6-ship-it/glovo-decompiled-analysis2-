package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.keystore.aes.AesGcmKS;
import o.accessminIntrinsicHeightjd;

/* JADX INFO: loaded from: classes2.dex */
public class o0 {
    private static o0 c;
    private String a;
    private String b;

    private boolean f() {
        return true;
    }

    private String e() {
        if (TextUtils.isEmpty(this.b)) {
            this.b = new x().a();
        }
        return this.b;
    }

    private static void g() {
        synchronized (o0.class) {
            if (c == null) {
                c = new o0();
            }
        }
    }

    private boolean c(String str) {
        v.c("hmsSdk", "refresh sp aes key");
        if (TextUtils.isEmpty(str)) {
            v.c("hmsSdk", "refreshLocalKey(): encrypted key is empty");
            return false;
        }
        d.b(q0.i(), "Privacy_MY", "PrivacyData", str);
        d.b(q0.i(), "Privacy_MY", "flashKeyTime", System.currentTimeMillis());
        return true;
    }

    public static o0 d() {
        if (c == null) {
            g();
        }
        return c;
    }

    private String a(String str) {
        String str2 = f() ? AesGcmKS.read("analytics_keystore", str) : "";
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        v.c("hmsSdk", "deCrypt work key first");
        String strA = n.a(str, e());
        if (!TextUtils.isEmpty(strA)) {
            if (f()) {
                c(b(strA));
                x.c();
            }
            return strA;
        }
        String str3 = accessminIntrinsicHeightjd.read(16);
        c(b(str3));
        if (f()) {
            x.c();
        }
        return str3;
    }

    private String b(String str) {
        return f() ? AesGcmKS.serializer("analytics_keystore", str) : n.b(str, e());
    }

    public void b() {
        String str = accessminIntrinsicHeightjd.read(16);
        if (c(b(str))) {
            this.a = str;
        }
    }

    private String c() {
        String strA = d.a(q0.i(), "Privacy_MY", "PrivacyData", "");
        if (!TextUtils.isEmpty(strA)) {
            return a(strA);
        }
        String str = accessminIntrinsicHeightjd.read(16);
        c(b(str));
        return str;
    }

    public String a() {
        if (TextUtils.isEmpty(this.a)) {
            this.a = c();
        }
        return this.a;
    }
}
