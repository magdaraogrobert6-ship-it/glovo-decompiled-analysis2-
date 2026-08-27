package io.sentry.util;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicIntegerArray;
import o.BaseBrazeActionStep;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public abstract class write {
    public static final Charset serializer = Charset.forName(Constants.ENCODING);

    public static HashMap serializer(Calendar calendar) {
        HashMap map = new HashMap();
        map.put("year", Integer.valueOf(calendar.get(1)));
        map.put("month", Integer.valueOf(calendar.get(2)));
        map.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
        map.put("hourOfDay", Integer.valueOf(calendar.get(11)));
        map.put("minute", Integer.valueOf(calendar.get(12)));
        map.put("second", Integer.valueOf(calendar.get(13)));
        return map;
    }

    public static long write(BaseBrazeActionStep baseBrazeActionStep, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, RequestPushPermissionStep requestPushPermissionStep) {
        try {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
            baseBrazeActionStep.serializer(iconCompatParcelizer, requestPushPermissionStep);
            return iconCompatParcelizer.read;
        } catch (Throwable th) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Could not calculate size of serializable", th);
            return 0L;
        }
    }

    public static ArrayList write(AtomicIntegerArray atomicIntegerArray) {
        int length = atomicIntegerArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(Integer.valueOf(atomicIntegerArray.get(i)));
        }
        return arrayList;
    }
}
