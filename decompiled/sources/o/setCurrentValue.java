package o;

import com.roadrunner.delivery.pickupdropoff.tasks.data.DeliveryTasksStateDataStore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setCurrentValue extends ContinuationImpl {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ DeliveryTasksStateDataStore IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setCurrentValue(DeliveryTasksStateDataStore deliveryTasksStateDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = deliveryTasksStateDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 43;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objDelete = this.IconCompatParcelizer.delete(null, this);
        int i4 = serializer + 55;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objDelete;
        }
        obj2.hashCode();
        throw null;
    }
}
