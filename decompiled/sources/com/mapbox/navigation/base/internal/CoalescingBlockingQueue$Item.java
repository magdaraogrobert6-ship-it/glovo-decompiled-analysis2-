package com.mapbox.navigation.base.internal;

import com.mapbox.maps.extension.style.layers.LayerUtils$getLayer$source$2;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineApi$updateWithRouteProgress$1;

/* JADX INFO: loaded from: classes2.dex */
public final class CoalescingBlockingQueue$Item {
    public final MapboxRouteLineApi$updateWithRouteProgress$1 block;
    public final LayerUtils$getLayer$source$2 cancellation;

    public final int hashCode() {
        return this.cancellation.hashCode() + (this.block.hashCode() * 31);
    }

    public CoalescingBlockingQueue$Item(MapboxRouteLineApi$updateWithRouteProgress$1 mapboxRouteLineApi$updateWithRouteProgress$1, LayerUtils$getLayer$source$2 layerUtils$getLayer$source$2) {
        this.block = mapboxRouteLineApi$updateWithRouteProgress$1;
        this.cancellation = layerUtils$getLayer$source$2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoalescingBlockingQueue$Item)) {
            return false;
        }
        CoalescingBlockingQueue$Item coalescingBlockingQueue$Item = (CoalescingBlockingQueue$Item) obj;
        return this.block == coalescingBlockingQueue$Item.block && this.cancellation == coalescingBlockingQueue$Item.cancellation;
    }

    public final String toString() {
        return "Item(block=" + this.block + ", cancellation=" + this.cancellation + ')';
    }
}
