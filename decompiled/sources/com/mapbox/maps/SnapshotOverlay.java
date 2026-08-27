package com.mapbox.maps;

import android.graphics.Canvas;
import com.mapbox.geojson.Point;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SnapshotOverlay {
    public abstract Point coordinate(ScreenCoordinate screenCoordinate);

    public abstract List<String> getAttributions();

    public abstract Canvas getCanvas();

    public abstract ScreenCoordinate screenCoordinate(Point point);
}
