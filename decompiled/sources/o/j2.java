package o;

import com.mapbox.geojson.Point;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j2 {
    private static int RemoteActionCompatParcelizer = 0;
    public static final List read = androidx.sqlite.SQLite.read(Point.fromLngLat(-180.0d, 90.0d), Point.fromLngLat(-180.0d, -90.0d), Point.fromLngLat(180.0d, -90.0d), Point.fromLngLat(180.0d, 90.0d), Point.fromLngLat(-180.0d, 90.0d));
    private static int write = 1;

    static {
        int i = RemoteActionCompatParcelizer + 123;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
