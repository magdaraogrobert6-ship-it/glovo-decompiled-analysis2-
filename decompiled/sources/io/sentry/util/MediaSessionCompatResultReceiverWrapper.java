package io.sentry.util;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o.getBrazeActionVersionAndJsonlambda1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MediaSessionCompatResultReceiverWrapper {
    public static final ConcurrentHashMap RemoteActionCompatParcelizer = new ConcurrentHashMap();

    public static boolean IconCompatParcelizer(String str, List list) {
        if (str == null || list == null || list.isEmpty()) {
            return false;
        }
        ConcurrentHashMap concurrentHashMap = RemoteActionCompatParcelizer;
        if (concurrentHashMap.containsKey(str)) {
            return ((Boolean) concurrentHashMap.get(str)).booleanValue();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((getBrazeActionVersionAndJsonlambda1) it.next()).IconCompatParcelizer().equalsIgnoreCase(str)) {
                concurrentHashMap.put(str, Boolean.TRUE);
                return true;
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                if (((getBrazeActionVersionAndJsonlambda1) it2.next()).RemoteActionCompatParcelizer(str)) {
                    concurrentHashMap.put(str, Boolean.TRUE);
                    return true;
                }
                continue;
            } catch (Throwable unused) {
            }
        }
        concurrentHashMap.put(str, Boolean.FALSE);
        return false;
    }
}
