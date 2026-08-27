package com.braze.support;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import o.onContentCardDismissed;
import o.onMove;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.resumeWebviewIfNecessaryandroid_sdk_ui_release;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final String a = BrazeLogger.INSTANCE.getBrazeLogTag("HttpUtils");
    public static final SimpleDateFormat b = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);

    public static final String b(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Could not parse http-date value: ", str);
    }

    public static final LinkedHashMap a(Map map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((String) entry.getKey()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            key.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = ((String) key).toLowerCase(locale);
            lowerCase.getClass();
            linkedHashMap2.put(lowerCase, entry2.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry3.getKey(), onContentCardDismissed.IconCompatParcelizer((Iterable) entry3.getValue(), null, null, null, null, 63));
        }
        return linkedHashMap3;
    }

    public static final Long a(String str) {
        try {
            Double dMediaMetadataCompat = resumeWebviewIfNecessaryandroid_sdk_ui_release.MediaMetadataCompat(str);
            if (dMediaMetadataCompat != null) {
                return Long.valueOf((long) (dMediaMetadataCompat.doubleValue() * 1000.0d));
            }
            Date date = b.parse(str);
            if (date != null) {
                return Long.valueOf(date.getTime() - DateTimeUtils.nowInMilliseconds());
            }
            return null;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(str, 29), 8, (Object) null);
            return null;
        }
    }
}
