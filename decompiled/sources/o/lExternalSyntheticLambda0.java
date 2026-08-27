package o;

import com.mapbox.navigation.core.trip.session.LocationMatcherResult;
import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class lExternalSyntheticLambda0 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int write;
    public final /* synthetic */ MapNavigationImpl IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public LocationMatcherResult serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lExternalSyntheticLambda0(MapNavigationImpl mapNavigationImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = mapNavigationImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 41;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objAccess$updatePuckPosition = MapNavigationImpl.access$updatePuckPosition(this.IconCompatParcelizer, null, this);
        int i4 = write + 69;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objAccess$updatePuckPosition;
        }
        throw null;
    }
}
