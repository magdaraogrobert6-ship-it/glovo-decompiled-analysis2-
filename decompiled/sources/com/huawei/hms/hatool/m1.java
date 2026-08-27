package com.huawei.hms.hatool;

import o.accessminIntrinsicHeightjd;

/* JADX INFO: loaded from: classes2.dex */
public class m1 {
    private static m1 b = new m1();
    private a a = new a();

    public class a {
        String a;
        String b;
        long c = 0;

        public a() {
        }

        public void a(long j) {
            m1.this.a.c = j;
        }

        public void b(String str) {
            m1.this.a.a = str;
        }

        public void a(String str) {
            m1.this.a.b = str;
        }
    }

    public static m1 d() {
        return b;
    }

    public long b() {
        return this.a.c;
    }

    public String c() {
        return this.a.a;
    }

    public void a(String str, String str2) {
        long jB = b();
        String strC = w0.c(str, str2);
        if (strC == null || strC.isEmpty()) {
            v.e("WorkKeyHandler", "get rsa pubkey config error");
            return;
        }
        if (jB == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str3 = accessminIntrinsicHeightjd.read(16);
            String strA = h0.a(strC, str3);
            this.a.a(jCurrentTimeMillis);
            this.a.b(str3);
            this.a.a(strA);
            return;
        }
        if (System.currentTimeMillis() - jB > 43200000) {
            String str4 = accessminIntrinsicHeightjd.read(16);
            String strA2 = h0.a(strC, str4);
            this.a.a(jB);
            this.a.b(str4);
            this.a.a(strA2);
        }
    }

    public String a() {
        return this.a.b;
    }
}
