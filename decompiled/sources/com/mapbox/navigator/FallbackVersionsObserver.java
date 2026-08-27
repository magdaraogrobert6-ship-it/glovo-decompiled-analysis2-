package com.mapbox.navigator;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface FallbackVersionsObserver {
    void onCanReturnToLatest(String str);

    void onFallbackVersionsFound(List<String> list);
}
