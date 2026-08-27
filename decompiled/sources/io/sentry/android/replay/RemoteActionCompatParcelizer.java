package io.sentry.android.replay;

import java.util.LinkedHashMap;
import java.util.Map;
import o.getIntentArrayWithConfiguredBackStacklambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class RemoteActionCompatParcelizer extends LinkedHashMap {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return super.size() > 32;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof getIntentArrayWithConfiguredBackStacklambda1) ? obj2 : (io.sentry.util.network.RemoteActionCompatParcelizer) super.getOrDefault((getIntentArrayWithConfiguredBackStacklambda1) obj, (io.sentry.util.network.RemoteActionCompatParcelizer) obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof getIntentArrayWithConfiguredBackStacklambda1) {
            return super.containsKey((getIntentArrayWithConfiguredBackStacklambda1) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof io.sentry.util.network.RemoteActionCompatParcelizer) {
            return super.containsValue((io.sentry.util.network.RemoteActionCompatParcelizer) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof getIntentArrayWithConfiguredBackStacklambda1) {
            return (io.sentry.util.network.RemoteActionCompatParcelizer) super.get((getIntentArrayWithConfiguredBackStacklambda1) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof getIntentArrayWithConfiguredBackStacklambda1) && (obj2 instanceof io.sentry.util.network.RemoteActionCompatParcelizer)) {
            return super.remove((getIntentArrayWithConfiguredBackStacklambda1) obj, (io.sentry.util.network.RemoteActionCompatParcelizer) obj2);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof getIntentArrayWithConfiguredBackStacklambda1) {
            return (io.sentry.util.network.RemoteActionCompatParcelizer) super.remove((getIntentArrayWithConfiguredBackStacklambda1) obj);
        }
        return null;
    }
}
