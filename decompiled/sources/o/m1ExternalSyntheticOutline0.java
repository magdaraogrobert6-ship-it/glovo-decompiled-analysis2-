package o;

import com.mapbox.maps.Style;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.roadrunner.map.integration.mapbox.route.RouteArrowApi;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class m1ExternalSyntheticOutline0 extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public int IconCompatParcelizer;
    public final /* synthetic */ RouteArrowApi MediaDescriptionCompat;
    public RouteProgress RemoteActionCompatParcelizer;
    public RouteArrowApi read;
    public Style serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1ExternalSyntheticOutline0(RouteArrowApi routeArrowApi, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaDescriptionCompat = routeArrowApi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 73;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objOnRouteProgress$mapbox = this.MediaDescriptionCompat.onRouteProgress$mapbox(null, null, this);
        int i4 = MediaMetadataCompat + 15;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objOnRouteProgress$mapbox;
        }
        obj2.hashCode();
        throw null;
    }
}
