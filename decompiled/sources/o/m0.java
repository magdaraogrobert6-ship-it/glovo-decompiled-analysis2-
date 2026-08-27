package o;

import com.mapbox.navigation.core.MapboxNavigation;
import com.roadrunner.map.integration.mapbox.route.FetchMapboxRouteUseCase;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ FetchMapboxRouteUseCase IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public MapboxNavigation read;
    public getSimplefcGXIks serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(FetchMapboxRouteUseCase fetchMapboxRouteUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = fetchMapboxRouteUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 125;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            this.IconCompatParcelizer.invoke(null, null, this);
            obj2.hashCode();
            throw null;
        }
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objInvoke = this.IconCompatParcelizer.invoke(null, null, this);
        int i3 = RatingCompat + 85;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objInvoke;
    }
}
