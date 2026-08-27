package com.mapbox.navigator;

import com.mapbox.geojson.Point;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public interface IMUService {
    int registerAltimeterUpdateCallback(AltimeterUpdateCallback altimeterUpdateCallback);

    int registerCompassUpdateCallback(CompassUpdateCallback compassUpdateCallback);

    int registerIMUUpdateCallback(IMUUpdateCallback iMUUpdateCallback);

    void unregisterCallback(int i);

    void update(Point point, Float f);
}
