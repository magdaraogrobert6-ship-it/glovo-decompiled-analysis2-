package com.huawei.hms.framework.network.grs.g.i;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.g.j.d;
import com.huawei.hms.framework.network.grs.h.c;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    private static final String a = "a";
    private static d b;
    private static final Object c = new Object();

    public static d a(Context context) {
        ArrayList arrayList;
        synchronized (c) {
            if (b != null) {
                Logger.i(a, "getGrsServerBean pkg:%s, GrsServerBean exists.", context == null ? "" : context.getPackageName());
                return b;
            }
            if (context == null) {
                Logger.i(a, "getGrsServerBean context is invalid.");
            } else {
                String str = a;
                Logger.i(str, "getGrsServerBean parse ServerConfig");
                String strA = c.a(GrsApp.getInstance().getBrand("/") + "grs_sdk_server_config.json", context);
                StringBuilder sb = new StringBuilder("getGrsServerBean got Content:");
                sb.append(StringUtils.anonymizeMessage(strA));
                Logger.i(str, sb.toString());
                if (!TextUtils.isEmpty(strA)) {
                    try {
                        JSONObject jSONObject = new JSONObject(strA).getJSONObject("grs_server");
                        JSONArray jSONArray = jSONObject.getJSONArray("grs_base_url");
                        if (jSONArray == null || jSONArray.length() <= 0) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList();
                            for (int i = 0; i < jSONArray.length(); i++) {
                                arrayList.add(jSONArray.get(i).toString());
                            }
                        }
                        String str2 = a;
                        Logger.i(str2, "getGrsServerBean create GrsServerBean");
                        d dVar = new d();
                        b = dVar;
                        dVar.a(arrayList);
                        b.a(jSONObject.getString("grs_query_endpoint_2.0"));
                        b.a(jSONObject.getInt("grs_query_timeout"));
                        Logger.i(str2, "getGrsServerBean end, package:%s", context.getPackageName());
                    } catch (JSONException e) {
                        Logger.w(a, "getGrsServerBean catch JSONException: %s   ___ package:%s ____ content:%s", StringUtils.anonymizeMessage(e.getMessage()), context.getPackageName(), StringUtils.anonymizeMessage(strA));
                        b = null;
                    }
                    return b;
                }
            }
            return null;
        }
    }
}
