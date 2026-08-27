package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.presentation.CardCashPaymentTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class accesssetApiAvailablecp implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ CardCashPaymentTaskUiModelImpl read;

    public /* synthetic */ accesssetApiAvailablecp(CardCashPaymentTaskUiModelImpl cardCashPaymentTaskUiModelImpl, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = cardCashPaymentTaskUiModelImpl;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        CardCashPaymentTaskUiModelImpl cardCashPaymentTaskUiModelImpl = this.read;
        if (i2 == 0) {
            getEnterjXw82LU getenterjxw82lu = (getEnterjXw82LU) obj;
            getenterjxw82lu.getClass();
            CashPaymentTaskUiItem cashPaymentTaskUiItem = getenterjxw82lu.cashItem;
            if (cashPaymentTaskUiItem == null) {
                return null;
            }
            CashPaymentTaskUiItem.UiMode uiMode = CashPaymentTaskUiItem.UiMode.ViewPayment;
            Double d = cashPaymentTaskUiItem.editedAmount;
            return getEnterjXw82LU.write(getenterjxw82lu, null, CashPaymentTaskUiItem.RemoteActionCompatParcelizer(cashPaymentTaskUiItem, d, null, cashPaymentTaskUiItem.editedReason, null, cardCashPaymentTaskUiModelImpl.read(d), cardCashPaymentTaskUiModelImpl.read(cashPaymentTaskUiItem.editedAmount), null, uiMode, null, 32823295), null, null, 8063);
        }
        int i3 = 1;
        if (i2 == 1) {
            CashPaymentTaskUiItem.ReasonItem reasonItem = (CashPaymentTaskUiItem.ReasonItem) obj;
            reasonItem.getClass();
            cardCashPaymentTaskUiModelImpl.getClass();
            cardCashPaymentTaskUiModelImpl.serializer(new DpRectCompanion(reasonItem, i3));
            return createfromparcel;
        }
        if (i2 == 2) {
            getEnterjXw82LU getenterjxw82lu2 = (getEnterjXw82LU) obj;
            getenterjxw82lu2.getClass();
            CashPaymentTaskUiItem cashPaymentTaskUiItem2 = getenterjxw82lu2.cashItem;
            if (cashPaymentTaskUiItem2 == null) {
                return null;
            }
            CashPaymentTaskUiItem.UiMode uiMode2 = CashPaymentTaskUiItem.UiMode.ViewPayment;
            Double d2 = cashPaymentTaskUiItem2.selectedAmount;
            return getEnterjXw82LU.write(getenterjxw82lu2, null, CashPaymentTaskUiItem.RemoteActionCompatParcelizer(cashPaymentTaskUiItem2, null, d2, null, cashPaymentTaskUiItem2.selectedReason, null, cardCashPaymentTaskUiModelImpl.read(d2), null, uiMode2, null, 32878591), null, null, 8063);
        }
        Throwable th = (Throwable) obj;
        getQueryContext getquerycontext = cardCashPaymentTaskUiModelImpl.serializer;
        if (th instanceof addSubLayer) {
            for (obtainAndroidOutline obtainandroidoutline : ((addSubLayer) th).messages) {
                int i4 = write + 9;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                if (obtainandroidoutline instanceof drawWithChildTracking) {
                    drawWithChildTracking drawwithchildtracking = (drawWithChildTracking) obtainandroidoutline;
                    getquerycontext.serializer(new r8lambdaJFC6KizVRu8aAN8nSi1WfC3QwoQ(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(drawwithchildtracking.title, drawwithchildtracking.description)));
                } else {
                    if (!(obtainandroidoutline instanceof resolveOutlinePosition)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    getquerycontext.serializer(new r8lambdaJFC6KizVRu8aAN8nSi1WfC3QwoQ(((resolveOutlinePosition) obtainandroidoutline).title));
                }
            }
        } else if (th instanceof toDebugStringlambda3) {
            getquerycontext.serializer(new r8lambdaJFC6KizVRu8aAN8nSi1WfC3QwoQ(cardCashPaymentTaskUiModelImpl.PlaybackStateCompatCustomAction.IconCompatParcelizer(com.logistics.rider.glovo.R.string.confirmation_screen_get_deeplink_error_message)));
        } else {
            getquerycontext.serializer(new r8lambdaJFC6KizVRu8aAN8nSi1WfC3QwoQ(cardCashPaymentTaskUiModelImpl.MediaSessionCompatQueueItem.write(th)));
        }
        filterTree filtertree = cardCashPaymentTaskUiModelImpl.MediaSessionCompatResultReceiverWrapper;
        getPositionannotations getpositionannotations = cardCashPaymentTaskUiModelImpl.read;
        String str = filtertree.write;
        if (str == null) {
            return createfromparcel;
        }
        filtertree.serializer(str, "getDeeplinkFailed", filterTree.serializer(getpositionannotations));
        int i6 = IconCompatParcelizer + 27;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
