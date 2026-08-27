package com.sentiance.sdk.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import o.logBaiduNotificationClicklambda1;
import o.r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI;
import o.setPushUniqueId;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x {
    public static Date IconCompatParcelizer() {
        Calendar calendar = Calendar.getInstance(Locale.US);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    public static Date a(String str) {
        try {
            if (str.endsWith("Z")) {
                str = str.substring(0, str.length() - 1).concat("+00:00");
            }
            return new Dates$IsoDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US).parse(str);
        } catch (ParseException unused) {
            return null;
        }
    }

    public static int write(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return (calendar.get(16) + calendar.get(15)) / 60000;
    }

    public static Date RemoteActionCompatParcelizer() {
        Calendar calendar = Calendar.getInstance();
        ((r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class)).getClass();
        calendar.setTimeInMillis(System.currentTimeMillis());
        return calendar.getTime();
    }

    public static String b(Date date) {
        return new Dates$IsoDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US).format(Long.valueOf(date.getTime()));
    }

    public static String c(long j) {
        return new Dates$IsoDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US).format(Long.valueOf(j));
    }

    public static String serializer(long j, String str) {
        return new SimpleDateFormat(str, Locale.US).format(new Date(j));
    }

    public static ArrayList IconCompatParcelizer(logBaiduNotificationClicklambda1 logbaidunotificationclicklambda1) {
        ArrayList arrayList = new ArrayList();
        if (logbaidunotificationclicklambda1 != null) {
            arrayList.add(logbaidunotificationclicklambda1);
        }
        return arrayList;
    }
}
