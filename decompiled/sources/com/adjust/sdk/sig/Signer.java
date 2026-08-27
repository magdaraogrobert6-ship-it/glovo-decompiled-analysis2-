package com.adjust.sdk.sig;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.adjust.sdk.AdjustConfig;
import com.braze.Constants;
import com.deliveryhero.fwf_cache.UtilKt;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Signer {
    public boolean a = false;
    public d b;
    public a c;
    public c d;

    public final void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.b = new d();
            this.d = new c(Build.VERSION.SDK_INT);
            this.c = new NativeLibHelper();
            this.a = true;
        }
    }

    public void onResume() {
        synchronized (this) {
            a();
            d dVar = this.b;
            a aVar = this.c;
            dVar.getClass();
            if (!d.a) {
                ((NativeLibHelper) aVar).a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x017e A[Catch: all -> 0x0194, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:10:0x001b, B:12:0x0032, B:13:0x003e, B:15:0x006a, B:17:0x0077, B:19:0x007f, B:21:0x0087, B:23:0x008f, B:26:0x0099, B:27:0x0154, B:28:0x015c, B:30:0x017e, B:31:0x018b), top: B:37:0x0001 }] */
    public void sign(Context context, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        synchronized (this) {
            a();
            d dVar = this.b;
            c cVar = this.d;
            a aVar = this.c;
            dVar.getClass();
            if (map == null || map.isEmpty() || map2 == null || map3 == null) {
                Log.e("SignerInstance", "sign: One or more parameters are null");
            } else {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
                boolean zEquals = AdjustConfig.ENVIRONMENT_SANDBOX.equals(map.get(UtilKt.ENVIRONMENT_KEY));
                if (zEquals) {
                    simpleDateFormat.format(new Date(System.currentTimeMillis()));
                }
                HashMap map4 = new HashMap();
                d.a(map.keySet(), map, map4);
                String str = map2.get("activity_kind");
                String str2 = map2.get("client_sdk");
                if ("b".equals(map2.get(Constants.BRAZE_PUSH_CONTENT_KEY))) {
                    d.a(map.keySet(), map, map3);
                    d.a(new HashSet(Arrays.asList("network_payload", "endpoint")), map2, map3);
                    if (zEquals) {
                        simpleDateFormat.format(new Date(System.currentTimeMillis()));
                    }
                } else {
                    d.a(context, cVar, aVar, map4, str, str2);
                    if (map4.containsKey("signature") && map4.containsKey("adj_signing_id") && map4.containsKey("headers_id") && map4.containsKey("algorithm") && map4.containsKey("native_version")) {
                        String str3 = (String) map4.get("adj_signing_id");
                        String str4 = (String) map4.get("headers_id");
                        String str5 = (String) map4.get("signature");
                        String str6 = (String) map4.get("algorithm");
                        String str7 = "algorithm=\"" + str6 + "\"";
                        map3.put("authorization", "Signature " + ("signature=\"" + str5 + "\"") + "," + ("adj_signing_id=\"" + str3 + "\"") + "," + str7 + "," + ("headers_id=\"" + str4 + "\"") + "," + ("native_version=\"" + ((String) map4.get("native_version")) + "\""));
                        d.a(map.keySet(), map, map3);
                        d.a(new HashSet(Arrays.asList("network_payload", "endpoint")), map2, map3);
                        if (zEquals) {
                            simpleDateFormat.format(new Date(System.currentTimeMillis()));
                        }
                    } else {
                        Log.e("SignerInstance", "sign: Signature generation failed. Exiting...");
                    }
                }
            }
        }
    }

    public static String getVersion() {
        return "3.67.0";
    }

    public void sign(Context context, Map<String, String> map, String str, String str2) {
        synchronized (this) {
            a();
            d dVar = this.b;
            c cVar = this.d;
            a aVar = this.c;
            dVar.getClass();
            d.a(context, cVar, aVar, map, str, str2);
        }
    }
}
