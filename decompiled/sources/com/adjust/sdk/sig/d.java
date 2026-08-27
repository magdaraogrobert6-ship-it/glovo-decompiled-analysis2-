package com.adjust.sdk.sig;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.adjust.sdk.AdjustConfig;
import com.deliveryhero.fwf_cache.UtilKt;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.UnrecoverableKeyException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public static boolean a = false;

    public static void a(Context context, c cVar, a aVar, Map map, String str, String str2) throws Exception {
        byte[] bArrA;
        if (a) {
            Log.e("SignerInstance", "sign: library received error. It has locked down");
            return;
        }
        if (map == null || map.isEmpty() || str == null || str2 == null) {
            Log.e("SignerInstance", "sign: One or more parameters are null");
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
        boolean zEquals = AdjustConfig.ENVIRONMENT_SANDBOX.equals(map.get(UtilKt.ENVIRONMENT_KEY));
        if (zEquals) {
            simpleDateFormat.format(new Date(System.currentTimeMillis()));
        }
        map.put("activity_kind", str);
        map.put("client_sdk", str2);
        int i = 2;
        while (true) {
            bArrA = null;
            if (i <= 0) {
                break;
            }
            try {
                cVar.a(context);
                bArrA = cVar.a(context, map.toString().getBytes(StandardCharsets.UTF_8));
                break;
            } catch (b e) {
                Log.e("SignerInstance", "sign: Api is less than JellyBean-4-18");
                a = true;
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e;
            } catch (InvalidKeyException e2) {
                e = e2;
            } catch (UnrecoverableKeyException e3) {
                e = e3;
            } catch (Exception e4) {
                Log.e("SignerInstance", "sign: Received an Exception: " + e4.getMessage(), e4);
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e4;
            }
            Log.e("SignerInstance", "sign: Received a retriable exception: " + e.getMessage(), e);
            Log.e("SignerInstance", "sign: Attempting retry #" + i);
            i += -1;
            cVar.getClass();
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            keyStore.deleteEntry("key2");
            context.getSharedPreferences("adjust_keys", 0).edit().remove("encrypted_key").apply();
        }
        if (i == 0) {
            a = true;
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        if (zEquals) {
            simpleDateFormat.format(new Date(System.currentTimeMillis()));
        }
        byte[] bArrA2 = ((NativeLibHelper) aVar).a(context, map, bArrA, cVar.a);
        if (zEquals) {
            simpleDateFormat.format(new Date(System.currentTimeMillis()));
        }
        if (bArrA2 == null) {
            Log.e("SignerInstance", "sign: Returned an null signature. Exiting...");
            map.remove("activity_kind");
            map.remove("client_sdk");
        } else {
            map.put("signature", Base64.encodeToString(bArrA2, 2));
            map.remove("activity_kind");
            map.remove("client_sdk");
            if (zEquals) {
                simpleDateFormat.format(new Date(System.currentTimeMillis()));
            }
        }
    }

    public static void a(Set set, Map map, Map map2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (map.containsKey(str)) {
                map2.put(str, (String) map.get(str));
            }
        }
    }
}
