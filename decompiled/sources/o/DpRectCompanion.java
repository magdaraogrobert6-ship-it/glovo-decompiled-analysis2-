package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$PaymentStatus;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$PaymentType;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DpRectCompanion implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ CashPaymentTaskUiItem.ReasonItem RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ DpRectCompanion(CashPaymentTaskUiItem.ReasonItem reasonItem, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = reasonItem;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        CallGroup callGroup;
        CardCashPaymentTaskUiItem$PaymentStatus cardCashPaymentTaskUiItem$PaymentStatus;
        CashPaymentTaskUiItem cashPaymentTaskUiItemRemoteActionCompatParcelizer;
        CardCashPaymentTaskUiItem$PaymentType cardCashPaymentTaskUiItem$PaymentType;
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 25;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this.read == 0) {
            CashPaymentTaskUiItem cashPaymentTaskUiItem = (CashPaymentTaskUiItem) obj;
            cashPaymentTaskUiItem.getClass();
            return CashPaymentTaskUiItem.RemoteActionCompatParcelizer(cashPaymentTaskUiItem, null, null, null, this.RemoteActionCompatParcelizer, null, null, null, null, null, 33538047);
        }
        getEnterjXw82LU getenterjxw82lu = (getEnterjXw82LU) obj;
        getenterjxw82lu.getClass();
        CashPaymentTaskUiItem cashPaymentTaskUiItem2 = getenterjxw82lu.cashItem;
        if (cashPaymentTaskUiItem2 == null) {
            return null;
        }
        int i5 = serializer + 45;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            callGroup = null;
            cardCashPaymentTaskUiItem$PaymentStatus = null;
            cashPaymentTaskUiItemRemoteActionCompatParcelizer = CashPaymentTaskUiItem.RemoteActionCompatParcelizer(cashPaymentTaskUiItem2, null, null, null, this.RemoteActionCompatParcelizer, null, null, null, null, null, 33538047);
            cardCashPaymentTaskUiItem$PaymentType = null;
            i = 29863;
        } else {
            callGroup = null;
            cardCashPaymentTaskUiItem$PaymentStatus = null;
            cashPaymentTaskUiItemRemoteActionCompatParcelizer = CashPaymentTaskUiItem.RemoteActionCompatParcelizer(cashPaymentTaskUiItem2, null, null, null, this.RemoteActionCompatParcelizer, null, null, null, null, null, 33538047);
            cardCashPaymentTaskUiItem$PaymentType = null;
            i = 8063;
        }
        return getEnterjXw82LU.write(getenterjxw82lu, cardCashPaymentTaskUiItem$PaymentType, cashPaymentTaskUiItemRemoteActionCompatParcelizer, callGroup, cardCashPaymentTaskUiItem$PaymentStatus, i);
    }
}
