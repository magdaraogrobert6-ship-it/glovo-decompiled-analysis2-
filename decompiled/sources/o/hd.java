package o;

import android.content.Context;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.MapIdle;
import com.mapbox.maps.MapIdleCallback;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hd implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    public static int RemoteActionCompatParcelizer;
    private static int serializer;
    public final /* synthetic */ int read;
    public final /* synthetic */ hf write;

    public /* synthetic */ hd(hf hfVar, int i) {
        this.read = i;
        this.write = hfVar;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = serializer + 47;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = this.read;
        final hf hfVar = this.write;
        if (i3 != 0) {
            return i3 != 1 ? new MapIdleCallback() { // from class: o.hgExternalSyntheticLambda5
                private static int IconCompatParcelizer = 0;
                private static int serializer = 1;

                @Override // com.mapbox.maps.MapIdleCallback
                public final void run(MapIdle mapIdle) {
                    int i4 = 2 % 2;
                    mapIdle.getClass();
                    hf hfVar2 = hfVar;
                    MapView mapView = hfVar2.read;
                    if (mapView != null) {
                        int i5 = serializer + 121;
                        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        MapboxMap mapboxMapDeprecated = mapView.getMapboxMapDeprecated();
                        if (mapboxMapDeprecated != null) {
                            int i7 = IconCompatParcelizer + 57;
                            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i8 = i7 % 2;
                            CameraState cameraState = mapboxMapDeprecated.getCameraState();
                            if (cameraState != null) {
                                int i9 = serializer + 107;
                                IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i10 = i9 % 2;
                                Point center = cameraState.getCenter();
                                if (center != null) {
                                    hfVar2.IconCompatParcelizer.write(new f0(center.latitude(), center.longitude()));
                                }
                            }
                        }
                    }
                    int i11 = serializer + 79;
                    IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i11 % 2 != 0) {
                        throw null;
                    }
                }
            } : new hgExternalSyntheticLambda1(hfVar);
        }
        hgExternalSyntheticLambda9 hgexternalsyntheticlambda9 = new hgExternalSyntheticLambda9(hfVar);
        int i4 = MediaBrowserCompatMediaItem + 19;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return hgexternalsyntheticlambda9;
    }

    public static int RemoteActionCompatParcelizer() {
        int i = IconCompatParcelizer;
        int i2 = i % 8126317;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
        RemoteActionCompatParcelizer = i3;
        return i3;
    }
}
