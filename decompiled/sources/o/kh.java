package o;

import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.mapbox.navigation.core.MapboxNavigation;
import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class kh extends ContinuationImpl {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public getSimplefcGXIks IconCompatParcelizer;
    public final /* synthetic */ MapNavigationImpl MediaBrowserCompatMediaItem;
    public /* synthetic */ Object RatingCompat;
    public LocationComponentPluginImpl RemoteActionCompatParcelizer;
    public MapboxNavigation read;
    public int serializer;
    public boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh(MapNavigationImpl mapNavigationImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.MediaBrowserCompatMediaItem = mapNavigationImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 67;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RatingCompat = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objRequestRoute = this.MediaBrowserCompatMediaItem.requestRoute(null, null, null, false, this);
        int i4 = MediaMetadataCompat + 55;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objRequestRoute;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
