package com.huawei.hms.ads.identifier;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class d extends BroadcastReceiver {
    private static volatile d a;

    public static void b(Context context) {
        try {
            if (a != null) {
                context.unregisterReceiver(a);
                a = null;
            }
        } catch (Throwable unused) {
            Log.w("OaidChangedReceiver", "unregisterReceiver exception");
        }
    }

    @SuppressLint
    public static void a(Context context) {
        if (context == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.opendevice.open.action.REAL_OAID_RESET");
        if (a == null) {
            a = new d();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(a, intentFilter, "com.huawei.permission.app.DOWNLOAD", null, 2);
        } else {
            context.registerReceiver(a, intentFilter, "com.huawei.permission.app.DOWNLOAD", null);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (context == null || intent == null || !"com.huawei.opendevice.open.action.REAL_OAID_RESET".equals(intent.getAction())) {
            return;
        }
        j.a.execute(new Runnable() { // from class: com.huawei.hms.ads.identifier.d.1
            @Override // java.lang.Runnable
            public void run() {
                final Context context2 = AdsIdentifierSdk.getContext();
                if (context2 == null) {
                    Log.w("OaidChangedReceiver", "context is null");
                } else {
                    c.a(context2, new e() { // from class: com.huawei.hms.ads.identifier.d.1.1
                        @Override // com.huawei.hms.ads.identifier.e
                        public void a() {
                            try {
                                Intent intent2 = new Intent("com.huawei.opendevice.open.action.OAID_RESET");
                                intent2.setPackage(f.a(context2));
                                context2.sendBroadcast(intent2, "com.huawei.hms.permission.signatureOrSystem");
                            } catch (Throwable unused) {
                                Log.w("OaidChangedReceiver", "send broCast fail");
                            }
                        }
                    });
                }
            }
        });
    }
}
