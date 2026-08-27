package com.deliveryhero.customerchat.analytics.model;

import androidx.compose.ui.text.android.LayoutCompat;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.getDensityDpi;
import o.getImageLoaderCacheSize;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@getImageLoaderCacheSize(write = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING)
public final class Order {
    private final Map<String, String> details;
    private final String id;

    public final String component1() {
        return this.id;
    }

    public final Map<String, String> component2() {
        return this.details;
    }

    public final Map<String, String> getDetails() {
        return this.details;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode();
        Map<String, String> map = this.details;
        return (iHashCode * 31) + (map == null ? 0 : map.hashCode());
    }

    public Order(@getDensityDpi(serializer = "id") String str, @getDensityDpi(serializer = "details") Map<String, String> map) {
        str.getClass();
        this.id = str;
        this.details = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Order copy$default(Order order, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = order.id;
        }
        if ((i & 2) != 0) {
            map = order.details;
        }
        return order.copy(str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Order)) {
            return false;
        }
        Order order = (Order) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, order.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.details, order.details}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Order(id=");
        sb.append(this.id);
        sb.append(", details=");
        return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(sb, (Map) this.details, ')');
    }

    public final Order copy(@getDensityDpi(serializer = "id") String str, @getDensityDpi(serializer = "details") Map<String, String> map) {
        str.getClass();
        return new Order(str, map);
    }

    public /* synthetic */ Order(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : map);
    }
}
