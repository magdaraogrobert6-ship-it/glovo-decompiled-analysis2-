package o;

import com.mapbox.navigation.core.directions.session.RoutesUpdatedResult;
import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$collectRouteProgress$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class kg extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int serializer;
    public RoutesUpdatedResult IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ MapNavigationImpl$collectRouteProgress$2 read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg(MapNavigationImpl$collectRouteProgress$2 mapNavigationImpl$collectRouteProgress$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = mapNavigationImpl$collectRouteProgress$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 97;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objEmit = this.read.emit((RoutesUpdatedResult) null, (ShortNewsContentCardView) this);
        int i4 = MediaDescriptionCompat + 107;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objEmit;
        }
        throw null;
    }
}
