package com.deliveryhero.perseus;

import androidx.annotation.Keep;
import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.perseus.data.local.db.entity.EcommerceComponent;
import com.deliveryhero.perseus.data.local.db.entity.EcommerceItem;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.IconCompatParcelizer;
import o.addPathoIyEayMdefault;
import o.getCieXyz;
import o.onMove;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class PerseusEvent {
    private List<EcommerceComponent> ecommerceComponents;
    private List<EcommerceItem> ecommerceItems;
    private final String eventAction;
    private final addPathoIyEayMdefault hitMatchId;
    private Map<String, String> params;
    private final String perseusDataSource;

    public final addPathoIyEayMdefault component1() {
        return this.hitMatchId;
    }

    public final String component2() {
        return this.eventAction;
    }

    public final String component3() {
        return this.perseusDataSource;
    }

    public final Map<String, String> component4() {
        return this.params;
    }

    public final List<EcommerceItem> component5() {
        return this.ecommerceItems;
    }

    public final List<EcommerceComponent> component6() {
        return this.ecommerceComponents;
    }

    public final List<EcommerceComponent> getEcommerceComponents() {
        return this.ecommerceComponents;
    }

    public final List<EcommerceItem> getEcommerceItems() {
        return this.ecommerceItems;
    }

    public final String getEventAction() {
        return this.eventAction;
    }

    public final addPathoIyEayMdefault getHitMatchId() {
        return this.hitMatchId;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final String getPerseusDataSource() {
        return this.perseusDataSource;
    }

    public final void setEcommerceComponents(List<EcommerceComponent> list) {
        this.ecommerceComponents = list;
    }

    public final void setEcommerceItems(List<EcommerceItem> list) {
        this.ecommerceItems = list;
    }

    public int hashCode() {
        int iRemoteActionCompatParcelizer = IconCompatParcelizer.RemoteActionCompatParcelizer(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.hitMatchId.hashCode() * 31, 31, this.eventAction), 31, this.perseusDataSource), this.params, 31);
        List<EcommerceItem> list = this.ecommerceItems;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<EcommerceComponent> list2 = this.ecommerceComponents;
        return ((iRemoteActionCompatParcelizer + iHashCode) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "PerseusEvent(hitMatchId=" + this.hitMatchId + ", eventAction=" + this.eventAction + ", perseusDataSource=" + this.perseusDataSource + ", params=" + this.params + ", ecommerceItems=" + this.ecommerceItems + ", ecommerceComponents=" + this.ecommerceComponents + ")";
    }

    public final void appending(Map<String, String> map) {
        map.getClass();
        LinkedHashMap linkedHashMapWrite = onMove.write(this.params);
        new LinkedHashMap(linkedHashMapWrite).putAll(map);
        this.params = linkedHashMapWrite;
    }

    public final PerseusEvent copy(addPathoIyEayMdefault addpathoiyeaymdefault, String str, String str2, Map<String, String> map, List<EcommerceItem> list, List<EcommerceComponent> list2) {
        addpathoiyeaymdefault.getClass();
        str.getClass();
        str2.getClass();
        map.getClass();
        return new PerseusEvent(addpathoiyeaymdefault, str, str2, map, list, list2);
    }

    public final void setParams(Map<String, String> map) {
        map.getClass();
        this.params = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PerseusEvent copy$default(PerseusEvent perseusEvent, addPathoIyEayMdefault addpathoiyeaymdefault, String str, String str2, Map map, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            addpathoiyeaymdefault = perseusEvent.hitMatchId;
        }
        if ((i & 2) != 0) {
            str = perseusEvent.eventAction;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = perseusEvent.perseusDataSource;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            map = perseusEvent.params;
        }
        Map map2 = map;
        if ((i & 16) != 0) {
            list = perseusEvent.ecommerceItems;
        }
        List list3 = list;
        if ((i & 32) != 0) {
            list2 = perseusEvent.ecommerceComponents;
        }
        return perseusEvent.copy(addpathoiyeaymdefault, str3, str4, map2, list3, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerseusEvent)) {
            return false;
        }
        PerseusEvent perseusEvent = (PerseusEvent) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hitMatchId, perseusEvent.hitMatchId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.eventAction, perseusEvent.eventAction}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.perseusDataSource, perseusEvent.perseusDataSource}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.params, perseusEvent.params}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.ecommerceItems, perseusEvent.ecommerceItems}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.ecommerceComponents, perseusEvent.ecommerceComponents}, getCieXyz.write())).booleanValue();
    }

    public /* synthetic */ PerseusEvent(addPathoIyEayMdefault addpathoiyeaymdefault, String str, String str2, Map map, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new addPathoIyEayMdefault(null) : addpathoiyeaymdefault, str, (i & 4) != 0 ? "client" : str2, map, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2);
    }

    public final void appending(String str, String str2) {
        str.getClass();
        str2.getClass();
        LinkedHashMap linkedHashMapWrite = onMove.write(this.params);
        linkedHashMapWrite.put(str, str2);
        this.params = linkedHashMapWrite;
    }

    public PerseusEvent(addPathoIyEayMdefault addpathoiyeaymdefault, String str, String str2, Map<String, String> map, List<EcommerceItem> list, List<EcommerceComponent> list2) {
        addpathoiyeaymdefault.getClass();
        str.getClass();
        str2.getClass();
        map.getClass();
        this.hitMatchId = addpathoiyeaymdefault;
        this.eventAction = str;
        this.perseusDataSource = str2;
        this.params = map;
        this.ecommerceItems = list;
        this.ecommerceComponents = list2;
    }
}
