package com.mapbox.navigator;

import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface SetAlternativeRoutesCallback {
    void run(Expected<String, List<RouteAlternative>> expected);
}
