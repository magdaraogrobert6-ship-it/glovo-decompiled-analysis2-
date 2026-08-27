package com.huawei.hms.ads.identifier;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    private static final Uri a = new Uri.Builder().scheme(RemoteMessageConst.Notification.CONTENT).authority("com.huawei.hwid.pps.apiprovider").path("/oaid_scp/get").build();
    private static final Uri b = new Uri.Builder().scheme(RemoteMessageConst.Notification.CONTENT).authority("com.huawei.hwid.pps.apiprovider").path("/oaid/query").build();
    private static final Uri c = new Uri.Builder().scheme(RemoteMessageConst.Notification.CONTENT).authority("com.huawei.hwid.pps.apiprovider").path("/oaid/sync").build();

    public static AdvertisingIdClient.Info a(final Context context) {
        if (!a(context, a)) {
            return null;
        }
        String string = Settings.Global.getString(context.getContentResolver(), "pps_oaid_c");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        final h.a aVarA = h.a.a(context);
        String strA = aVarA.a();
        if (TextUtils.isEmpty(strA)) {
            j.a.execute(new Runnable() { // from class: com.huawei.hms.ads.identifier.c.1
                @Override // java.lang.Runnable
                public void run() {
                    if (aVarA.f() || !aVarA.c()) {
                        aVarA.b();
                        aVarA.a(c.g(context));
                    }
                }
            });
            if (!aVarA.f()) {
                return new AdvertisingIdClient.Info("00000000-0000-0000-0000-000000000000", true);
            }
            aVarA.e();
            return null;
        }
        String strA2 = h.a(string, strA);
        if (!TextUtils.isEmpty(strA2)) {
            return new AdvertisingIdClient.Info(strA2, "00000000-0000-0000-0000-000000000000".equalsIgnoreCase(strA2));
        }
        j.a.execute(new Runnable() { // from class: com.huawei.hms.ads.identifier.c.2
            @Override // java.lang.Runnable
            public void run() {
                aVarA.a(c.g(context));
            }
        });
        return null;
    }

    public static void b(Context context) {
        if (e(context)) {
            Cursor cursorQuery = null;
            try {
                cursorQuery = context.getContentResolver().query(c, null, null, new String[]{context.getApplicationContext().getPackageName(), String.valueOf(30484300)}, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("sync_result"));
                    j.a(cursorQuery);
                    return;
                }
                j.a(cursorQuery);
            } catch (Throwable th) {
                try {
                    Log.w("InfoProviderUtil", "sync sdk version ex: ".concat(th.getClass().getSimpleName()));
                } finally {
                    j.a(cursorQuery);
                }
            }
        }
    }

    public static AdvertisingIdClient.Info c(Context context) {
        if (!d(context)) {
            return new AdvertisingIdClient.Info("00000000-0000-0000-0000-000000000000", true);
        }
        try {
            Cursor cursorQuery = context.getContentResolver().query(b, null, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("oaid");
                int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("limit_track");
                String string = cursorQuery.getString(columnIndexOrThrow);
                AdvertisingIdClient.Info info = new AdvertisingIdClient.Info(string, "00000000-0000-0000-0000-000000000000".equalsIgnoreCase(string) ? true : Boolean.valueOf(cursorQuery.getString(columnIndexOrThrow2)).booleanValue());
                j.a(cursorQuery);
                return info;
            }
            AdvertisingIdClient.Info info2 = new AdvertisingIdClient.Info("00000000-0000-0000-0000-000000000000", true);
            j.a(cursorQuery);
            return info2;
        } catch (Throwable th) {
            try {
                Log.w("InfoProviderUtil", "query oaid via provider ex: ".concat(th.getClass().getSimpleName()));
                return new AdvertisingIdClient.Info("00000000-0000-0000-0000-000000000000", true);
            } finally {
                j.a((Closeable) null);
            }
        }
    }

    public static boolean d(Context context) {
        return a(context, b);
    }

    public static boolean e(Context context) {
        return a(context, c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(Context context) {
        if (context == null) {
            return "";
        }
        try {
            Uri uri = a;
            if (!a(context, uri)) {
                Log.w("InfoProviderUtil", "uri is invalid");
                j.a((Closeable) null);
                return "";
            }
            Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("op_wk");
                int columnIndex = cursorQuery.getColumnIndex("exem_cnt");
                String string = cursorQuery.getString(columnIndexOrThrow);
                if (columnIndex >= 0) {
                    int i = cursorQuery.getInt(columnIndex);
                    h.a aVarA = h.a.a(context);
                    aVarA.a(i);
                    if (!TextUtils.isEmpty(string)) {
                        aVarA.d();
                    }
                }
                j.a(cursorQuery);
                return string;
            }
            j.a(cursorQuery);
            return "";
        } catch (Throwable th) {
            try {
                Log.w("InfoProviderUtil", "get remote key ex: ".concat(th.getClass().getSimpleName()));
                return "";
            } finally {
                j.a((Closeable) null);
            }
        }
    }

    public static void a(final Context context, final e eVar) {
        if (context == null) {
            return;
        }
        final h.a aVarA = h.a.a(context);
        if (TextUtils.isEmpty(aVarA.a())) {
            j.a.execute(new Runnable() { // from class: com.huawei.hms.ads.identifier.c.3
                @Override // java.lang.Runnable
                public void run() {
                    String strG = c.g(context);
                    TextUtils.isEmpty(strG);
                    aVarA.a(strG);
                    e eVar2 = eVar;
                    if (eVar2 != null) {
                        eVar2.a();
                    }
                }
            });
        } else if (eVar != null) {
            eVar.a();
        }
    }

    private static boolean a(Context context, Uri uri) {
        Integer numB;
        if (context == null || uri == null || (numB = j.b(context)) == null || 30462100 > numB.intValue()) {
            return false;
        }
        return j.a(context, uri);
    }
}
