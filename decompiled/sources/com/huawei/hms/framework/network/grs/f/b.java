package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.AssetsUtil;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    private static final Map<String, b> b = new ConcurrentHashMap(16);
    private static final Object c = new Object();
    private a a;

    public Set<String> b() {
        return this.a.c();
    }

    public b(Context context, boolean z) throws Throwable {
        a(context, z);
        b.put(context.getPackageName(), this);
    }

    private void a(Context context, boolean z) throws Throwable {
        String[] strArrSplit;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = com.huawei.hms.framework.network.grs.h.c.a("grs_route_config_files_list.txt", context);
        Logger.i("LocalManagerProxy", "initLocalManager configFileListContent TimeCost:%d  Content:%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), strA);
        if (TextUtils.isEmpty(strA)) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            strArrSplit = AssetsUtil.list(context, GrsApp.getInstance().getBrand(""));
            Logger.i("LocalManagerProxy", "list by AssetsManager, timeCost:" + (System.currentTimeMillis() - jCurrentTimeMillis2));
        } else {
            strArrSplit = strA.split("#");
        }
        List<String> arrayList = strArrSplit == null ? new ArrayList<>() : Arrays.asList(strArrSplit);
        String appConfigName = GrsApp.getInstance().getAppConfigName();
        Logger.i("LocalManagerProxy", "appConfigName is: " + appConfigName);
        this.a = new d(false, z);
        if (arrayList.contains("grs_app_global_route_config.json") || !TextUtils.isEmpty(appConfigName)) {
            this.a = new d(context, appConfigName, z);
        }
        if (!this.a.d() && arrayList.contains("grs_sdk_global_route_config.json")) {
            this.a = new c(context, z);
        }
        this.a.a(context, arrayList);
        StringBuilder sb = new StringBuilder("on initLocalManager finish, check appGrs: ");
        sb.append(this.a.a == null);
        Logger.i("LocalManagerProxy", sb.toString());
    }

    public b() {
        this.a = new d(true, true);
    }

    public com.huawei.hms.framework.network.grs.local.model.a a() {
        return this.a.b();
    }

    public String a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z) {
        String strA;
        synchronized (c) {
            strA = this.a.a(context, aVar, grsBaseInfo, str, str2, z);
        }
        return strA;
    }

    public Map<String, String> a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, boolean z) {
        Map<String, String> mapA;
        synchronized (c) {
            mapA = this.a.a(context, aVar, grsBaseInfo, str, z);
        }
        return mapA;
    }

    public static b a(String str) {
        return b.get(str);
    }

    public void a(String str, com.huawei.hms.framework.network.grs.e.c cVar) {
        String str2;
        try {
            cVar.b(str + "#localConfig", this.a.a().toString());
        } catch (JSONException unused) {
            str2 = "save local config encounter JSONException.";
            Logger.w("LocalManagerProxy", str2);
        } catch (Throwable th) {
            str2 = "save local config encounter Throwable:" + StringUtils.anonymizeMessage(th.getMessage());
            Logger.w("LocalManagerProxy", str2);
        }
    }

    public boolean a(Context context, String str) {
        boolean zD = this.a.d(str);
        b.put(context.getPackageName(), this);
        return zD;
    }
}
