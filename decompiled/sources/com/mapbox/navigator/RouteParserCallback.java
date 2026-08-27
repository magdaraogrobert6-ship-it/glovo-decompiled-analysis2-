package com.mapbox.navigator;

import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface RouteParserCallback {
    void run(Expected<String, List<RouteInterface>> expected);
}
