package o;

import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$PaymentType;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.logger.QrPaymentEventLoggerImpl;
import com.roadrunner.delivery.state.Trigger;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class copya9UjIt4 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ getTopD9Ej5fMannotations read;

    public /* synthetic */ copya9UjIt4(getTopD9Ej5fMannotations gettopd9ej5fmannotations, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = gettopd9ej5fmannotations;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        ComposeAnimationState composeAnimationState;
        List list;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 75;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        List list2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        getTopD9Ej5fMannotations gettopd9ej5fmannotations = this.read;
        if (i3 == 0) {
            C0195provider c0195provider = (C0195provider) obj;
            c0195provider.getClass();
            getDisplayName getdisplayname = c0195provider.qrCode;
            if (getdisplayname != null && (composeAnimationState = getdisplayname.showQrCodeButton) != null) {
                list2 = composeAnimationState.trackingEvents;
            }
            if (list2 != null) {
                int i4 = IconCompatParcelizer + 103;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    QrPaymentEventLoggerImpl qrPaymentEventLoggerImpl = gettopd9ej5fmannotations.MediaDescriptionCompat;
                    qrPaymentEventLoggerImpl.getClass();
                    qrPaymentEventLoggerImpl.read(list2, Trigger.DELIVERIES_TASK_CLICK);
                    int i5 = 27 / 0;
                } else {
                    QrPaymentEventLoggerImpl qrPaymentEventLoggerImpl2 = gettopd9ej5fmannotations.MediaDescriptionCompat;
                    qrPaymentEventLoggerImpl2.getClass();
                    qrPaymentEventLoggerImpl2.read(list2, Trigger.DELIVERIES_TASK_CLICK);
                }
            } else {
                gettopd9ej5fmannotations.getClass();
            }
            return c0195provider;
        }
        if (i3 == 1) {
            CashPaymentTaskUiItem.ReasonItem reasonItem = (CashPaymentTaskUiItem.ReasonItem) obj;
            reasonItem.getClass();
            gettopd9ej5fmannotations.getClass();
            gettopd9ej5fmannotations.serializer(new GestureNodeKt$$ExternalSyntheticLambda0(new DpRectCompanion(reasonItem, 0), 10));
            return createFromParcel.INSTANCE;
        }
        if (i3 == 2) {
            C0195provider c0195provider2 = (C0195provider) obj;
            c0195provider2.getClass();
            ComposeAnimationState composeAnimationState2 = c0195provider2.switchToCashButton;
            List list3 = composeAnimationState2 != null ? composeAnimationState2.trackingEvents : null;
            if (list3 != null) {
                QrPaymentEventLoggerImpl qrPaymentEventLoggerImpl3 = gettopd9ej5fmannotations.MediaDescriptionCompat;
                qrPaymentEventLoggerImpl3.getClass();
                qrPaymentEventLoggerImpl3.read(list3, Trigger.BUTTON_CLICK);
            } else {
                gettopd9ej5fmannotations.getClass();
            }
            return C0195provider.read(c0195provider2, QrPaymentTaskUiItem$PaymentType.CASH, null, 1019);
        }
        if (i3 == 3) {
            CashPaymentTaskUiItem cashPaymentTaskUiItem = (CashPaymentTaskUiItem) obj;
            cashPaymentTaskUiItem.getClass();
            List list4 = cashPaymentTaskUiItem.trackingEvent;
            if (list4 != null) {
                QrPaymentEventLoggerImpl qrPaymentEventLoggerImpl4 = gettopd9ej5fmannotations.MediaDescriptionCompat;
                qrPaymentEventLoggerImpl4.getClass();
                qrPaymentEventLoggerImpl4.read(list4, Trigger.DELIVERIES_TASK_CLICK);
            } else {
                gettopd9ej5fmannotations.getClass();
            }
            return CashPaymentTaskUiItem.RemoteActionCompatParcelizer(cashPaymentTaskUiItem, null, null, null, null, null, null, null, CashPaymentTaskUiItem.UiMode.EditPayment, null, 33030143);
        }
        if (i3 != 4) {
            if (i3 != 5) {
                CashPaymentTaskUiItem cashPaymentTaskUiItem2 = (CashPaymentTaskUiItem) obj;
                cashPaymentTaskUiItem2.getClass();
                CashPaymentTaskUiItem.UiMode uiMode = CashPaymentTaskUiItem.UiMode.ViewPayment;
                Double d = cashPaymentTaskUiItem2.selectedAmount;
                return CashPaymentTaskUiItem.RemoteActionCompatParcelizer(cashPaymentTaskUiItem2, null, d, null, cashPaymentTaskUiItem2.selectedReason, null, gettopd9ej5fmannotations.RemoteActionCompatParcelizer(d), null, uiMode, null, 32878591);
            }
            CashPaymentTaskUiItem cashPaymentTaskUiItem3 = (CashPaymentTaskUiItem) obj;
            cashPaymentTaskUiItem3.getClass();
            List list5 = cashPaymentTaskUiItem3.trackingEvent;
            if (list5 != null) {
                int i6 = IconCompatParcelizer + 63;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                QrPaymentEventLoggerImpl qrPaymentEventLoggerImpl5 = gettopd9ej5fmannotations.MediaDescriptionCompat;
                qrPaymentEventLoggerImpl5.getClass();
                qrPaymentEventLoggerImpl5.read(list5, Trigger.DELIVERIES_TASK_READY);
            } else {
                gettopd9ej5fmannotations.getClass();
            }
            CashPaymentTaskUiItem.UiMode uiMode2 = CashPaymentTaskUiItem.UiMode.ViewPayment;
            Double d2 = cashPaymentTaskUiItem3.editedAmount;
            return CashPaymentTaskUiItem.RemoteActionCompatParcelizer(cashPaymentTaskUiItem3, d2, null, cashPaymentTaskUiItem3.editedReason, null, gettopd9ej5fmannotations.RemoteActionCompatParcelizer(d2), gettopd9ej5fmannotations.RemoteActionCompatParcelizer(cashPaymentTaskUiItem3.editedAmount), null, uiMode2, null, 32823295);
        }
        C0195provider c0195provider3 = (C0195provider) obj;
        c0195provider3.getClass();
        ComposeAnimationState composeAnimationState3 = c0195provider3.switchToQrCodeButton;
        if (composeAnimationState3 != null) {
            int i8 = IconCompatParcelizer + 105;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                list = composeAnimationState3.trackingEvents;
                int i9 = 59 / 0;
            } else {
                list = composeAnimationState3.trackingEvents;
            }
        } else {
            list = null;
        }
        if (list != null) {
            int i10 = write + 59;
            IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            QrPaymentEventLoggerImpl qrPaymentEventLoggerImpl6 = gettopd9ej5fmannotations.MediaDescriptionCompat;
            qrPaymentEventLoggerImpl6.getClass();
            qrPaymentEventLoggerImpl6.read(list, Trigger.BUTTON_CLICK);
        } else {
            gettopd9ej5fmannotations.getClass();
        }
        return C0195provider.read(c0195provider3, QrPaymentTaskUiItem$PaymentType.QR_CODE, null, 1019);
    }
}
