package o;

import com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl$observeDeliveryStateV3$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidFontLoader extends ContinuationImpl {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public FlowCollector IconCompatParcelizer;
    public /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ ChatDeliveryRepositoryImpl$observeDeliveryStateV3$$inlined$map$1.AnonymousClass2 MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public AndroidPopup_androidKtPopup21invokeinlinedonDispose1 read;
    public int serializer;
    public AndroidUiFrameClock write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFontLoader(ChatDeliveryRepositoryImpl$observeDeliveryStateV3$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.MediaSessionCompatQueueItem = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objEmit;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 95;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.MediaMetadataCompat = obj;
            this.serializer |= Integer.MIN_VALUE;
            objEmit = this.MediaSessionCompatQueueItem.emit(null, this);
            int i3 = 64 / 0;
        } else {
            this.MediaMetadataCompat = obj;
            this.serializer |= Integer.MIN_VALUE;
            objEmit = this.MediaSessionCompatQueueItem.emit(null, this);
        }
        int i4 = RatingCompat + 105;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }
}
