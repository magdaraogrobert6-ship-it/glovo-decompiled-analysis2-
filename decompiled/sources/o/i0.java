package o;

import com.huawei.location.Vw$Vw;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda2;
import com.sentiance.core.model.events.H$b;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public Vw$Vw IconCompatParcelizer;
    public final transferSessionPackageI MediaDescriptionCompat;
    public final getLooseusljTpc MediaSessionCompatQueueItem;
    public final i3 RemoteActionCompatParcelizer;
    public i1 read;
    public boolean serializer;
    public H$b write;

    public i0(transferSessionPackageI transfersessionpackagei, getLooseusljTpc getlooseusljtpc, i3 i3Var) {
        this.MediaDescriptionCompat = transfersessionpackagei;
        this.MediaSessionCompatQueueItem = getlooseusljtpc;
        this.RemoteActionCompatParcelizer = i3Var;
    }

    public final void RemoteActionCompatParcelizer(MapboxMap mapboxMap) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 71;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            mapboxMap.getClass();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        mapboxMap.getClass();
        if (this.serializer) {
            mapboxMap.getStyle(new MapboxMap$$ExternalSyntheticLambda2(3, this));
            return;
        }
        int i3 = RatingCompat + 91;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public final void RemoteActionCompatParcelizer(accessgetGocp accessgetgocp) {
        H$b h$b;
        int i = 2 % 2;
        int i2 = RatingCompat + 65;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accessgetgocp.getClass();
        if (!this.serializer && (h$b = this.write) != null) {
            int i4 = MediaBrowserCompatMediaItem + 117;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Point pointFromLngLat = Point.fromLngLat(accessgetgocp.IconCompatParcelizer, accessgetgocp.serializer);
            pointFromLngLat.getClass();
            i1 i1Var = this.read;
            if (i1Var != null) {
                h$b.queryBuildingToHighlight(pointFromLngLat, i1Var);
            }
        }
        int i6 = MediaBrowserCompatMediaItem + 85;
        RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
