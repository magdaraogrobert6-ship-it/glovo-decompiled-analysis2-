package o;

import com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class toCurrentTargetPair7IW2chM extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ DeliveryTasksStateDataStore serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toCurrentTargetPair7IW2chM(DeliveryTasksStateDataStore deliveryTasksStateDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = deliveryTasksStateDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objClear = this.serializer.clear(this);
        int i4 = IconCompatParcelizer + 113;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objClear;
    }
}
