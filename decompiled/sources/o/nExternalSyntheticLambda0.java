package o;

import com.roadrunner.map.integration.mapbox.route.preview.SecondaryRouteApi;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class nExternalSyntheticLambda0 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ SecondaryRouteApi read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nExternalSyntheticLambda0(SecondaryRouteApi secondaryRouteApi, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = secondaryRouteApi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 13;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objAccess$requestSecondaryRoute = SecondaryRouteApi.access$requestSecondaryRoute(this.read, null, null, this);
        int i4 = serializer + 35;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return objAccess$requestSecondaryRoute;
    }
}
