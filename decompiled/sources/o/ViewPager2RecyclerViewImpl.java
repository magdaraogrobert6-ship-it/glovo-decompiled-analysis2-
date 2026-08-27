package o;

import com.roadrunner.localPushNotifications.smartPolling.domain.DeliveryAcceptanceLocalPushNotificationFactoryImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewPager2RecyclerViewImpl extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int read;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public getOffscreenPageLimit serializer;
    public final /* synthetic */ DeliveryAcceptanceLocalPushNotificationFactoryImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPager2RecyclerViewImpl(DeliveryAcceptanceLocalPushNotificationFactoryImpl deliveryAcceptanceLocalPushNotificationFactoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = deliveryAcceptanceLocalPushNotificationFactoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 125;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.write.invoke(null, this);
        }
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        int i3 = 60 / 0;
        return this.write.invoke(null, this);
    }
}
