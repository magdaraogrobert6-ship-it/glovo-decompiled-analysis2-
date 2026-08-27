package com.mapbox.maps.debugoptions;

import com.mapbox.maps.MapDebugOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes4.dex */
public final class MapViewDebugOptionsKt {
    public static final Set<MapDebugOptions> getNativeDebugOptions(Set<MapViewDebugOptions> set) {
        MapDebugOptions mapDebugOptionsValueOf;
        set.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            try {
                mapDebugOptionsValueOf = MapDebugOptions.valueOf(((MapViewDebugOptions) it.next()).getName$maps_sdk_release());
            } catch (Exception unused) {
                mapDebugOptionsValueOf = null;
            }
            if (mapDebugOptionsValueOf != null) {
                arrayList.add(mapDebugOptionsValueOf);
            }
        }
        return onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList);
    }
}
