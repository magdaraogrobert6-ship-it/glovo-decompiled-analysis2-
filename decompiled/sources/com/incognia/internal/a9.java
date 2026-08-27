package com.incognia.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.adjust.sdk.Constants;
import java.io.File;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o.hideCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class a9 {
    public final Context BGx;
    public final SharedPreferences HQ;
    public final String mbG;

    public static ConcurrentHashMap BGx(String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = hideCurrentlyDisplayingInAppMessage.serializer(str, new String[]{";"}, 6).iterator();
        while (it.hasNext()) {
            List listSerializer = hideCurrentlyDisplayingInAppMessage.serializer((String) it.next(), new String[]{":"}, 6);
            try {
                if (listSerializer.size() == 2) {
                    String str2 = (String) listSerializer.get(0);
                    String str3 = (String) listSerializer.get(1);
                    if (str3.length() < 2 || str3.charAt(0) != '\"') {
                        concurrentHashMap.put(URLDecoder.decode(str2, Constants.ENCODING), URLDecoder.decode(str3, Constants.ENCODING));
                    } else {
                        concurrentHashMap.put(URLDecoder.decode(str2, Constants.ENCODING), URLDecoder.decode(str3.substring(1, str3.length() - 1), Constants.ENCODING));
                    }
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        return concurrentHashMap;
    }

    public a9(Context context, String str) {
        this.BGx = context;
        this.mbG = str;
        this.HQ = context.getSharedPreferences(str, 0);
    }

    public final String mbG(String str, String str2) {
        try {
            return (String) BGx(str, str2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void BGx() {
        this.HQ.edit().clear().commit();
        String parent = this.BGx.getFilesDir().getParent();
        String strConcat = parent != null ? parent.concat(String.format("/shared_prefs/%s.xml", Arrays.copyOf(new Object[]{this.mbG}, 1))) : null;
        if (strConcat != null) {
            File file = new File(strConcat);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    public final Object BGx(String str, String str2) {
        ConcurrentHashMap concurrentHashMapBGx;
        try {
            String string = this.HQ.getString(str, null);
            if (string != null) {
                ConcurrentHashMap concurrentHashMapBGx2 = BGx(string);
                if (concurrentHashMapBGx2 != null) {
                    String str3 = (String) concurrentHashMapBGx2.get("encoding_type");
                    String str4 = (String) concurrentHashMapBGx2.get("object");
                    if (str3 == null || str4 == null) {
                        concurrentHashMapBGx = null;
                    } else {
                        int i = Integer.parseInt(str3);
                        if (i == 0) {
                            concurrentHashMapBGx = BGx(str4);
                        } else if (i != 1) {
                            concurrentHashMapBGx = null;
                        } else {
                            concurrentHashMapBGx = BGx(dDH.HQ(str4));
                        }
                    }
                } else {
                    concurrentHashMapBGx = null;
                }
                if (concurrentHashMapBGx != null) {
                    return concurrentHashMapBGx.get(str2);
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
