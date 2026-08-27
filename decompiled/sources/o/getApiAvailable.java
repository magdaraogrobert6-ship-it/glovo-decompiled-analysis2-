package o;

import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.presentation.CardCashPaymentTaskUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getApiAvailable extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ CardCashPaymentTaskUiModelImpl IconCompatParcelizer;
    public SessionDao_Impl$$ExternalSyntheticLambda1 RemoteActionCompatParcelizer;
    public accesssetApiAvailablecp read;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getApiAvailable(CardCashPaymentTaskUiModelImpl cardCashPaymentTaskUiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = cardCashPaymentTaskUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 57;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objAccess$callDeeplinkEndpoint = CardCashPaymentTaskUiModelImpl.access$callDeeplinkEndpoint(this.IconCompatParcelizer, null, null, this);
        int i4 = MediaMetadataCompat + 29;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objAccess$callDeeplinkEndpoint;
    }
}
