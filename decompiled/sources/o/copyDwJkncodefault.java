package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$PaymentStatus;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.logger.QrPaymentEventLoggerImpl;
import com.roadrunner.delivery.state.Trigger;
import java.util.List;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes3.dex */
public final class copyDwJkncodefault implements FlowCollector {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ getTopD9Ej5fMannotations RemoteActionCompatParcelizer;

    public /* synthetic */ copyDwJkncodefault(getTopD9Ej5fMannotations gettopd9ej5fmannotations, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = gettopd9ej5fmannotations;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043 A[PHI: r2
  0x0043: PHI (r2v14 o.provider) = (r2v13 o.provider), (r2v16 o.provider) binds: [B:17:0x0041, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        getYD9Ej5fM getyd9ej5fm;
        List list;
        C0195provider c0195provider;
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getTopD9Ej5fMannotations gettopd9ej5fmannotations = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            C0195provider c0195provider2 = (C0195provider) obj;
            MutableStateFlow mutableStateFlow = gettopd9ej5fmannotations.write;
            if (c0195provider2 == null) {
                mutableStateFlow.IconCompatParcelizer(plusCBMgk4.write);
            } else {
                mutableStateFlow.IconCompatParcelizer(new getYD9Ej5fM(c0195provider2));
                MutableStateFlow mutableStateFlow2 = gettopd9ej5fmannotations.IconCompatParcelizer;
                Wallpaper wallpaper = c0195provider2.status;
                mutableStateFlow2.IconCompatParcelizer(wallpaper != null ? wallpaper.value : null);
            }
            return createfromparcel;
        }
        QrPaymentTaskUiItem$PaymentStatus qrPaymentTaskUiItem$PaymentStatus = (QrPaymentTaskUiItem$PaymentStatus) obj;
        if (qrPaymentTaskUiItem$PaymentStatus == null) {
            return createfromparcel;
        }
        QrPaymentEventLoggerImpl qrPaymentEventLoggerImpl = gettopd9ej5fmannotations.MediaDescriptionCompat;
        Object obj2 = gettopd9ej5fmannotations.MediaSessionCompatResultReceiverWrapper.read();
        if (obj2 instanceof getYD9Ej5fM) {
            getyd9ej5fm = (getYD9Ej5fM) obj2;
        } else {
            int i3 = serializer + 107;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            getyd9ej5fm = null;
        }
        if (getyd9ej5fm != null) {
            int i5 = serializer + 51;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                c0195provider = getyd9ej5fm.IconCompatParcelizer;
                int i6 = 60 / 0;
                if (c0195provider != null) {
                    list = c0195provider.trackingEvents;
                } else {
                    int i7 = write + 23;
                    serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    list = null;
                }
            } else {
                c0195provider = getyd9ej5fm.IconCompatParcelizer;
                if (c0195provider != null) {
                    list = c0195provider.trackingEvents;
                } else {
                    int i9 = write + 23;
                    serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    list = null;
                }
            }
        } else {
            int i11 = write + 23;
            serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            list = null;
        }
        int i13 = copyDwJknco.write[qrPaymentTaskUiItem$PaymentStatus.ordinal()];
        if (i13 == 1) {
            if (list == null) {
                return createfromparcel;
            }
            int i14 = write + 83;
            serializer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
            qrPaymentEventLoggerImpl.getClass();
            qrPaymentEventLoggerImpl.read(list, Trigger.DELIVERIES_TASK_SUCCESS);
            return createfromparcel;
        }
        if (i13 != 2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        int i16 = serializer;
        int i17 = i16 + 113;
        write = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i18 = i17 % 2;
        if (list == null) {
            return createfromparcel;
        }
        int i19 = i16 + 111;
        write = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i20 = i19 % 2;
        qrPaymentEventLoggerImpl.getClass();
        qrPaymentEventLoggerImpl.read(list, Trigger.DELIVERIES_TASK_ERROR);
        return createfromparcel;
    }
}
