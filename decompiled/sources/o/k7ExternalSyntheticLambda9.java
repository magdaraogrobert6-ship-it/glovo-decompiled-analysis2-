package o;

import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$collectRouteProgress$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class k7ExternalSyntheticLambda9 extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public RouteProgress IconCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ MapNavigationImpl$collectRouteProgress$2 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7ExternalSyntheticLambda9(MapNavigationImpl$collectRouteProgress$2 mapNavigationImpl$collectRouteProgress$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = mapNavigationImpl$collectRouteProgress$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 87;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objEmit = this.write.emit((RouteProgress) null, (ShortNewsContentCardView) this);
        int i4 = RemoteActionCompatParcelizer + 9;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objEmit;
        }
        obj2.hashCode();
        throw null;
    }
}
