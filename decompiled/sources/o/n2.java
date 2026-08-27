package o;

import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.roadrunner.map.integration.mapbox.tripprogress.TripProgressApi;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class n2 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public RouteProgress read;
    public int serializer;
    public final /* synthetic */ TripProgressApi write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(TripProgressApi tripProgressApi, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = tripProgressApi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 93;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objOnRouteProgress$mapbox = this.write.onRouteProgress$mapbox(null, this);
        int i4 = MediaSessionCompatQueueItem + 15;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objOnRouteProgress$mapbox;
    }
}
