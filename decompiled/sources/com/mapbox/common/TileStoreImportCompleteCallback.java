package com.mapbox.common;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* JADX INFO: loaded from: classes4.dex */
@MapboxExperimental
public interface TileStoreImportCompleteCallback {
    void run(Expected<TileStoreImportError, None> expected);
}
