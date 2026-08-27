package com.mapbox.navigator;

import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes4.dex */
public interface ForceRerouteCallback {
    void run(Expected<RerouteError, RerouteInfo> expected);
}
