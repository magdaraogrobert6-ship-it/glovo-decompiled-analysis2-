package o;

import com.foodora.courier.delivery.service.DeliveryService;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class HapticFeedback extends ContinuationImpl {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ DeliveryService IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HapticFeedback(DeliveryService deliveryService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = deliveryService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 27;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return DeliveryService.access$isTokenNull(this.IconCompatParcelizer, this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        DeliveryService.access$isTokenNull(this.IconCompatParcelizer, this);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
