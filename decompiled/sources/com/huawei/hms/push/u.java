package com.huawei.hms.push;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes4.dex */
public class u {
    private static final String[] c = {"url", "app", "cosa", "rp"};
    private Context a;
    private o b;

    public u(Context context, o oVar) {
        this.a = context;
        this.b = oVar;
    }

    private void a() {
        try {
            HMSLog.i("PushSelfShowLog", "enter launchApp, appPackageName =" + this.b.c());
            if (e.c(this.a, this.b.c())) {
                b();
            }
        } catch (Exception e) {
            HMSLog.e("PushSelfShowLog", "launchApp error:" + e.toString());
        }
    }

    public void c() {
        o oVar;
        HMSLog.d("PushSelfShowLog", "enter launchNotify()");
        if (this.a != null && (oVar = this.b) != null) {
            if ("app".equals(oVar.h())) {
                a();
                return;
            }
            if ("cosa".equals(this.b.h())) {
                b();
                return;
            }
            boolean zEquals = "rp".equals(this.b.h());
            o oVar2 = this.b;
            if (zEquals) {
                HMSLog.w("PushSelfShowLog", oVar2.h() + " not support rich message.");
                return;
            }
            boolean zEquals2 = "url".equals(oVar2.h());
            o oVar3 = this.b;
            if (zEquals2) {
                HMSLog.w("PushSelfShowLog", oVar3.h() + " not support URL.");
                return;
            }
            HMSLog.d("PushSelfShowLog", oVar3.h() + " is not exist in hShowType");
            return;
        }
        HMSLog.d("PushSelfShowLog", "launchNotify  context or msg is null");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00c2 A[PHI: r2 r4
  0x00c2: PHI (r2v21 android.content.Intent) = (r2v15 android.content.Intent), (r2v23 android.content.Intent) binds: [B:10:0x0085, B:17:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00c2: PHI (r4v4 boolean) = (r4v2 boolean), (r4v0 boolean) binds: [B:10:0x0085, B:17:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    private void b() {
        Intent uri;
        HMSLog.i("PushSelfShowLog", "run into launchCosaApp");
        try {
            HMSLog.i("PushSelfShowLog", "enter launchExistApp cosa, appPackageName =" + this.b.c() + ",and msg.intentUri is " + this.b.m());
            Intent intentB = e.b(this.a, this.b.c());
            String strM = this.b.m();
            o oVar = this.b;
            boolean zBooleanValue = false;
            if (strM != null) {
                try {
                    uri = Intent.parseUri(oVar.m(), 0);
                    uri.setSelector(null);
                    if (uri.getClipData() == null) {
                        uri.setClipData(ClipData.newPlainText("avoid intent add read permission flags", "avoid"));
                    }
                    HMSLog.i("PushSelfShowLog", "Intent.parseUri(msg.intentUri, 0), action:" + uri.getAction());
                    zBooleanValue = e.a(this.a, this.b.c(), uri).booleanValue();
                    if (zBooleanValue) {
                        intentB = uri;
                    }
                } catch (Exception e) {
                    HMSLog.w("PushSelfShowLog", "intentUri error." + e.toString());
                }
            } else if (oVar.a() != null) {
                uri = new Intent(this.b.a());
                if (e.a(this.a, this.b.c(), uri).booleanValue()) {
                    intentB = uri;
                }
            }
            if (intentB == null) {
                HMSLog.i("PushSelfShowLog", "launchCosaApp,intent == null");
                return;
            }
            intentB.setPackage(this.b.c());
            if (zBooleanValue) {
                intentB.addFlags(268435456);
            } else {
                intentB.setFlags(805437440);
            }
            this.a.startActivity(intentB);
        } catch (Exception e2) {
            HMSLog.e("PushSelfShowLog", "launch Cosa App exception." + e2.toString());
        }
    }

    public static boolean a(String str) {
        for (String str2 : c) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
