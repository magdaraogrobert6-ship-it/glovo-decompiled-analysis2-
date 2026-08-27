package o;

import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptMessageUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetWordcp extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public final /* synthetic */ DeliveryAutoAcceptMessageUiModelImpl read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetWordcp(DeliveryAutoAcceptMessageUiModelImpl deliveryAutoAcceptMessageUiModelImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = deliveryAutoAcceptMessageUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 119;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            DeliveryAutoAcceptMessageUiModelImpl.access$getEarningsFromAutoAcceptedOrder(this.read, null, this);
            obj2.hashCode();
            throw null;
        }
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objAccess$getEarningsFromAutoAcceptedOrder = DeliveryAutoAcceptMessageUiModelImpl.access$getEarningsFromAutoAcceptedOrder(this.read, null, this);
        int i3 = MediaSessionCompatQueueItem + 87;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objAccess$getEarningsFromAutoAcceptedOrder;
    }
}
