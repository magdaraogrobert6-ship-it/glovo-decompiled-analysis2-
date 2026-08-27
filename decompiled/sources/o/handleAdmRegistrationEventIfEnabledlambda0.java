package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.quota.BandwidthQuotaMonitor;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "BandwidthQuotaStore")
public class handleAdmRegistrationEventIfEnabledlambda0 implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final com.sentiance.sdk.util.c IconCompatParcelizer;
    private final ConcurrentHashMap read = new ConcurrentHashMap();

    private void RemoteActionCompatParcelizer() {
        synchronized (this) {
            for (BandwidthQuotaMonitor.NetworkType networkType : BandwidthQuotaMonitor.NetworkType.values()) {
                this.read.put(networkType.name(), read(networkType));
            }
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        synchronized (this) {
            this.IconCompatParcelizer.read();
            this.read.clear();
            RemoteActionCompatParcelizer();
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    public final long serializer(BandwidthQuotaMonitor.NetworkType networkType) {
        long jLongValue;
        synchronized (this) {
            Iterator<Long> it = IconCompatParcelizer(networkType).values().iterator();
            jLongValue = 0;
            while (it.hasNext()) {
                jLongValue += it.next().longValue();
            }
        }
        return jLongValue;
    }

    public final void serializer(Map<Date, Long> map, BandwidthQuotaMonitor.NetworkType networkType) {
        synchronized (this) {
            HashMap mapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(map);
            this.read.put(networkType.name(), mapRemoteActionCompatParcelizer);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : mapRemoteActionCompatParcelizer.entrySet()) {
                arrayList.add(com.sentiance.sdk.util.x.serializer(((Date) entry.getKey()).getTime(), "yyyy-MM-dd") + ',' + entry.getValue());
            }
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(networkType.name(), r8lambda5tLpxyx6nsiTnLY5GKIpCwhnz8M.RemoteActionCompatParcelizer(arrayList, ";"));
        }
    }

    private HashMap read(BandwidthQuotaMonitor.NetworkType networkType) {
        Date date;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        String strWrite = this.IconCompatParcelizer.write(networkType.name(), (String) null);
        if (strWrite != null) {
            for (String str : strWrite.split(";")) {
                String[] strArrSplit = str.split(",");
                if (strArrSplit.length >= 2) {
                    try {
                        date = new SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US).parse(strArrSplit[0]);
                    } catch (java.text.ParseException unused) {
                        date = null;
                    }
                    try {
                        long j = Long.parseLong(strArrSplit[1]);
                        if (date != null) {
                            concurrentHashMap.put(date, Long.valueOf(j));
                        }
                    } catch (NumberFormatException unused2) {
                    }
                }
            }
        }
        return RemoteActionCompatParcelizer(concurrentHashMap);
    }

    public handleAdmRegistrationEventIfEnabledlambda0(com.sentiance.sdk.util.c cVar) {
        this.IconCompatParcelizer = cVar;
        RemoteActionCompatParcelizer();
    }

    private Map<Date, Long> IconCompatParcelizer(BandwidthQuotaMonitor.NetworkType networkType) {
        Map<Date, Long> map;
        synchronized (this) {
            map = (Map) this.read.get(networkType.name());
        }
        return map;
    }

    public final void serializer(long j, BandwidthQuotaMonitor.NetworkType networkType) {
        synchronized (this) {
            Map<Date, Long> mapIconCompatParcelizer = IconCompatParcelizer(networkType);
            Date dateIconCompatParcelizer = com.sentiance.sdk.util.x.IconCompatParcelizer();
            Long l = mapIconCompatParcelizer.get(dateIconCompatParcelizer);
            mapIconCompatParcelizer.put(dateIconCompatParcelizer, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            serializer(mapIconCompatParcelizer, networkType);
        }
    }

    private static HashMap RemoteActionCompatParcelizer(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Date date = (Date) entry.getKey();
            Calendar calendar = Calendar.getInstance(java.util.Locale.US);
            calendar.setTime(date);
            calendar.add(5, 30);
            if (calendar.getTime().after(com.sentiance.sdk.util.x.IconCompatParcelizer())) {
                map2.put((Date) entry.getKey(), (Long) entry.getValue());
            }
        }
        return map2;
    }
}
