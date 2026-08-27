package o;

import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.roadrunner.map.integration.mapbox.maneuver.ManeuverApi;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class k4 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public /* synthetic */ Object IconCompatParcelizer;
    public RouteProgress RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ ManeuverApi serializer;
    public ManeuverApi write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(ManeuverApi maneuverApi, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = maneuverApi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 115;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objOnRouteProgress$mapbox = this.serializer.onRouteProgress$mapbox(null, this);
        int i4 = MediaBrowserCompatMediaItem + 15;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objOnRouteProgress$mapbox;
    }
}
