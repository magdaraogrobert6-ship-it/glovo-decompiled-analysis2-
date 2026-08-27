package com.mapbox.common;

import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes4.dex */
public interface AmbientCacheClearingCallback {
    void run(Expected<CacheClearingError, Long> expected);
}
