package o;

import com.mapbox.maps.MapboxMap;
import com.roadrunner.map.integration.mapbox.route.RouteArrowApi;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class m4 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public final /* synthetic */ RouteArrowApi IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public RouteArrowApi read;
    public MapboxMap serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(RouteArrowApi routeArrowApi, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = routeArrowApi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 107;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objOnRoutesUpdatedResult$mapbox = this.IconCompatParcelizer.onRoutesUpdatedResult$mapbox(null, null, this);
        int i4 = MediaBrowserCompatMediaItem + 89;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return objOnRoutesUpdatedResult$mapbox;
    }
}
