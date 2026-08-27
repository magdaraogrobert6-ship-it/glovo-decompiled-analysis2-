package o;

import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class k7ExternalSyntheticLambda1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int serializer;
    public final /* synthetic */ MapNavigationImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7ExternalSyntheticLambda1(MapNavigationImpl mapNavigationImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = mapNavigationImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        CoroutineSingletons coroutineSingletonsAccess$collectNavigationState = MapNavigationImpl.access$collectNavigationState(this.write, null, null, null, this);
        int i4 = read + 23;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return coroutineSingletonsAccess$collectNavigationState;
    }
}
