package o;

import com.roadrunner.delivery.accept.acceptbutton.presentation.DeliveryAcceptButtonUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class TextDirectionSaverlambda1 extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public int IconCompatParcelizer;
    public final /* synthetic */ DeliveryAcceptButtonUiModelImpl RemoteActionCompatParcelizer;
    public Throwable read;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextDirectionSaverlambda1(DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = deliveryAcceptButtonUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 105;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.write = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            DeliveryAcceptButtonUiModelImpl.access$acceptDelivery(this.RemoteActionCompatParcelizer, null, this);
            obj2.hashCode();
            throw null;
        }
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objAccess$acceptDelivery = DeliveryAcceptButtonUiModelImpl.access$acceptDelivery(this.RemoteActionCompatParcelizer, null, this);
        int i3 = MediaDescriptionCompat + 75;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return objAccess$acceptDelivery;
        }
        throw null;
    }
}
