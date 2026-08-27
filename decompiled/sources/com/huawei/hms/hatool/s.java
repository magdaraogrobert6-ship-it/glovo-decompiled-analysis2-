package com.huawei.hms.hatool;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class s {
    static Map<String, l1> b = new HashMap();
    private static s c;
    private g1 a = new g1();

    public g1 b() {
        return this.a;
    }

    private static void d() {
        synchronized (s.class) {
            if (c == null) {
                c = new s();
            }
        }
    }

    public l1 a(String str) {
        return b.get(str);
    }

    public static s c() {
        if (c == null) {
            d();
        }
        return c;
    }

    private s() {
    }

    public Set<String> a() {
        return b.keySet();
    }

    public void a(String str, l1 l1Var) {
        b.put(str, l1Var);
    }
}
