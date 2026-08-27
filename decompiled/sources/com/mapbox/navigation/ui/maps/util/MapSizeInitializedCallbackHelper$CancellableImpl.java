package com.mapbox.navigation.ui.maps.util;

import com.mapbox.common.Cancelable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class MapSizeInitializedCallbackHelper$CancellableImpl implements Cancelable {
    public final AtomicBoolean isComplete = new AtomicBoolean(false);

    @Override // com.mapbox.common.Cancelable
    public final void cancel() {
        this.isComplete.set(true);
    }
}
