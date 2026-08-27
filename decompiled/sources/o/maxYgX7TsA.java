package o;

import com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class maxYgX7TsA extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ PickUpDropOffTasksUiModelV2Impl RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public maxYgX7TsA(PickUpDropOffTasksUiModelV2Impl pickUpDropOffTasksUiModelV2Impl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = pickUpDropOffTasksUiModelV2Impl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 105;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        Object objAccess$getAnalytics = PickUpDropOffTasksUiModelV2Impl.access$getAnalytics(this.RemoteActionCompatParcelizer, this);
        int i4 = serializer + 97;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objAccess$getAnalytics;
    }
}
