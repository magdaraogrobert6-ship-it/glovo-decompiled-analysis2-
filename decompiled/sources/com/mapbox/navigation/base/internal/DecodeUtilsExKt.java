package com.mapbox.navigation.base.internal;

import com.mapbox.navigation.base.utils.DecodeUtils;
import com.mapbox.navigation.base.utils.DecodeUtils$stepsGeometryDecodeCache$1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DecodeUtilsExKt {
    public static final void clearCache() {
        DecodeUtils$stepsGeometryDecodeCache$1 decodeUtils$stepsGeometryDecodeCache$1 = DecodeUtils.completeGeometryDecodeCache;
        DecodeUtils$stepsGeometryDecodeCache$1 decodeUtils$stepsGeometryDecodeCache$2 = DecodeUtils.stepsGeometryDecodeCache;
        synchronized (decodeUtils$stepsGeometryDecodeCache$2) {
            DecodeUtils.cachedRoutes.IconCompatParcelizer.clear();
            decodeUtils$stepsGeometryDecodeCache$2.trimToSize(-1);
        }
        DecodeUtils.completeGeometryDecodeCache.trimToSize(-1);
    }
}
