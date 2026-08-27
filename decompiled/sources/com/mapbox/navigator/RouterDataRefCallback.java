package com.mapbox.navigator;

import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface RouterDataRefCallback {
    void run(Expected<List<RouterError>, DataRef> expected, RouterOrigin routerOrigin);
}
