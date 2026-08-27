package o;

import com.roadrunner.localPushNotifications.smartPolling.domain.DeliveryAcceptanceLocalPushNotificationFactoryImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewPager2LinearLayoutManagerImpl extends ContinuationImpl {
    private static int serializer = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ DeliveryAcceptanceLocalPushNotificationFactoryImpl read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPager2LinearLayoutManagerImpl(DeliveryAcceptanceLocalPushNotificationFactoryImpl deliveryAcceptanceLocalPushNotificationFactoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = deliveryAcceptanceLocalPushNotificationFactoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 19;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return this.read.autoAcceptDelivery(null, null, this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        this.read.autoAcceptDelivery(null, null, this);
        obj2.hashCode();
        throw null;
    }
}
