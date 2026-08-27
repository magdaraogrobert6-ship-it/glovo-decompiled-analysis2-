package io.sentry.config;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class write implements IconCompatParcelizer {
    public final ArrayList RemoteActionCompatParcelizer;

    @Override // io.sentry.config.IconCompatParcelizer
    public final String RemoteActionCompatParcelizer(String str) {
        Iterator it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            String strRemoteActionCompatParcelizer = ((IconCompatParcelizer) it.next()).RemoteActionCompatParcelizer(str);
            if (strRemoteActionCompatParcelizer != null) {
                return strRemoteActionCompatParcelizer;
            }
        }
        return null;
    }

    @Override // io.sentry.config.IconCompatParcelizer
    public final Map RemoteActionCompatParcelizer() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(((IconCompatParcelizer) it.next()).RemoteActionCompatParcelizer());
        }
        return concurrentHashMap;
    }

    public write(ArrayList arrayList) {
        this.RemoteActionCompatParcelizer = arrayList;
    }
}
