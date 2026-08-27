package o;

import com.mapbox.navigation.core.trip.session.LocationMatcherResult;
import com.roadrunner.map.integration.mapbox.speedlimit.SpeedLimitApi;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class nExternalSyntheticLambda6 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer;
    public /* synthetic */ Object IconCompatParcelizer;
    public int read;
    public final /* synthetic */ SpeedLimitApi serializer;
    public LocationMatcherResult write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nExternalSyntheticLambda6(SpeedLimitApi speedLimitApi, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = speedLimitApi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 107;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objOnLocationMatcherResult$mapbox = this.serializer.onLocationMatcherResult$mapbox(null, this);
        int i4 = MediaBrowserCompatMediaItem + 49;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objOnLocationMatcherResult$mapbox;
    }
}
