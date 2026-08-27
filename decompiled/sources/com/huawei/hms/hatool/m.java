package com.huawei.hms.hatool;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class m {
    private static m b;
    private static final Object c = new Object();
    private Context a;

    private m() {
    }

    private static void b() {
        synchronized (m.class) {
            if (b == null) {
                b = new m();
            }
        }
    }

    public void a(Context context) {
        synchronized (c) {
            if (this.a != null) {
                v.f("hmsSdk", "DataManager already initialized.");
                return;
            }
            this.a = context;
            s.c().b().a(this.a);
            s.c().b().j(context.getPackageName());
            j.a().a(context);
        }
    }

    public static m a() {
        if (b == null) {
            b();
        }
        return b;
    }

    public void a(String str) {
        v.a("hmsSdk", "HiAnalyticsDataManager.setAppid(String appid) is execute.");
        Context context = this.a;
        if (context == null) {
            v.e("hmsSdk", "sdk is not init");
        } else {
            s.c().b().i(e1.a("appID", str, "[a-zA-Z0-9_][a-zA-Z0-9. _-]{0,255}", context.getPackageName()));
        }
    }
}
