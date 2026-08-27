package com.deliveryhero.customerchat.analytics.model;

import androidx.compose.ui.text.android.LayoutCompat;
import bo.app.af$$ExternalSyntheticOutline0;
import java.util.Map;
import o.getCieXyz;
import o.getDensityDpi;
import o.getImageLoaderCacheSize;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@getImageLoaderCacheSize(write = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING)
public final class Event {
    private final Map<String, String> details;
    private final String id;
    private final String name;

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final Map<String, String> component3() {
        return this.details;
    }

    public final Map<String, String> getDetails() {
        return this.details;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.name);
        Map<String, String> map = this.details;
        return iM + (map == null ? 0 : map.hashCode());
    }

    public Event(@getDensityDpi(serializer = "id") String str, @getDensityDpi(serializer = "name") String str2, @getDensityDpi(serializer = "details") Map<String, String> map) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.name = str2;
        this.details = map;
    }

    public final Event copy(@getDensityDpi(serializer = "id") String str, @getDensityDpi(serializer = "name") String str2, @getDensityDpi(serializer = "details") Map<String, String> map) {
        str.getClass();
        str2.getClass();
        return new Event(str, str2, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Event copy$default(Event event, String str, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = event.id;
        }
        if ((i & 2) != 0) {
            str2 = event.name;
        }
        if ((i & 4) != 0) {
            map = event.details;
        }
        return event.copy(str, str2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, event.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, event.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.details, event.details}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Event(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", details=");
        return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(sb, (Map) this.details, ')');
    }
}
