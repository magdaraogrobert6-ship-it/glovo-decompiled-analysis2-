package o;

import com.mapbox.maps.MapboxMap;
import com.mapbox.navigation.core.MapboxNavigation;
import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class kf extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public MapboxNavigation IconCompatParcelizer;
    public final /* synthetic */ MapNavigationImpl RatingCompat;
    public getSimplefcGXIks RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public MapboxMap write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf(MapNavigationImpl mapNavigationImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RatingCompat = mapNavigationImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 107;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.serializer |= Integer.MIN_VALUE;
            MapNavigationImpl.access$requestOrShowRoutePreview(this.RatingCompat, null, null, null, this);
            throw null;
        }
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objAccess$requestOrShowRoutePreview = MapNavigationImpl.access$requestOrShowRoutePreview(this.RatingCompat, null, null, null, this);
        int i3 = MediaDescriptionCompat + 3;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objAccess$requestOrShowRoutePreview;
    }
}
