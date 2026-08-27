package o;

import com.roadrunner.map.integration.mapbox.route.FetchMapboxRouteUseCase;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class m1ExternalSyntheticLambda16 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ FetchMapboxRouteUseCase read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1ExternalSyntheticLambda16(FetchMapboxRouteUseCase fetchMapboxRouteUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = fetchMapboxRouteUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 57;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            this.read.requestRoutes(null, null, this);
            obj2.hashCode();
            throw null;
        }
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objRequestRoutes = this.read.requestRoutes(null, null, this);
        int i3 = IconCompatParcelizer + 57;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objRequestRoutes;
    }
}
