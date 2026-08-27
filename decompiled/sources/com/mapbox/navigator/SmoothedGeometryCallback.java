package com.mapbox.navigator;

import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface SmoothedGeometryCallback {
    void run(Expected<SmoothedGeometryErrorType, List<SmoothedLaneGroupGeometry>> expected);
}
