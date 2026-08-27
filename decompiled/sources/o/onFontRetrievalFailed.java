package o;

import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class onFontRetrievalFailed extends ContinuationImpl {
    private static int RatingCompat = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ DeliveryAcceptanceLogger write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onFontRetrievalFailed(DeliveryAcceptanceLogger deliveryAcceptanceLogger, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = deliveryAcceptanceLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 1;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return DeliveryAcceptanceLogger.access$getOverlayPermissionsParams(this.write, this);
        }
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        int i3 = 95 / 0;
        return DeliveryAcceptanceLogger.access$getOverlayPermissionsParams(this.write, this);
    }
}
