package o;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.logger.QrPaymentEventLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.navigation.QrPaymentScreenArgs;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.getHeightD9Ej5fM;

/* JADX INFO: loaded from: classes3.dex */
public final class getHeightD9Ej5fM extends androidx.lifecycle.ViewModel {
    private static int MediaSessionCompatToken = 0;
    private static int PlaybackStateCompat = 1;
    public final isAdapterPositionOnScreen IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final ObserveTaskByTypeAndIdUseCaseImpl MediaDescriptionCompat;
    public final getQueryContext MediaMetadataCompat;
    public final QrPaymentEventLoggerImpl MediaSessionCompatQueueItem;
    public final isAdapterPositionOnScreen MediaSessionCompatResultReceiverWrapper;
    public final StateFlow ParcelableVolumeInfo;
    public final getBitmapui_graphics PlaybackStateCompatCustomAction;
    public final getLeftD9Ej5fM RatingCompat;
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen read;
    public final MutableStateFlow serializer;
    public final MutableStateFlow write;

    public getHeightD9Ej5fM(getBitmapui_graphics getbitmapui_graphics, getQueryContext getquerycontext, ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl, QrPaymentEventLoggerImpl qrPaymentEventLoggerImpl, getLeftD9Ej5fM getleftd9ej5fm) {
        getbitmapui_graphics.getClass();
        getquerycontext.getClass();
        observeTaskByTypeAndIdUseCaseImpl.getClass();
        qrPaymentEventLoggerImpl.getClass();
        getleftd9ej5fm.getClass();
        this.PlaybackStateCompatCustomAction = getbitmapui_graphics;
        this.MediaMetadataCompat = getquerycontext;
        this.MediaDescriptionCompat = observeTaskByTypeAndIdUseCaseImpl;
        this.MediaSessionCompatQueueItem = qrPaymentEventLoggerImpl;
        this.RatingCompat = getleftd9ej5fm;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(plusCBMgk4.write);
        this.write = mutableStateFlow;
        this.ParcelableVolumeInfo = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(copytPigGR8default.RemoteActionCompatParcelizer);
        this.serializer = mutableStateFlow2;
        this.MediaBrowserCompatMediaItem = mutableStateFlow2;
        final int i = 0;
        this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.screen.QrPaymentScreenViewModel$$ExternalSyntheticLambda0
            private static int IconCompatParcelizer = 0;
            private static int write = 1;
            public final /* synthetic */ getHeightD9Ej5fM read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IconCompatParcelizer + 123;
                write = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                int i5 = i;
                getHeightD9Ej5fM getheightd9ej5fm = this.read;
                if (i5 != 0) {
                    if (i5 != 1) {
                        return i5 != 2 ? ((QrPaymentScreenArgs) getheightd9ej5fm.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).RemoteActionCompatParcelizer : ((QrPaymentScreenArgs) getheightd9ej5fm.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).IconCompatParcelizer;
                    }
                    return Long.valueOf(((QrPaymentScreenArgs) getheightd9ej5fm.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).serializer);
                }
                Object objWrite = getheightd9ej5fm.PlaybackStateCompatCustomAction.write("args_qr_payment_screen");
                if (objWrite == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("qr payment screen args should never be null");
                    return null;
                }
                int i6 = IconCompatParcelizer + 65;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return (QrPaymentScreenArgs) objWrite;
            }
        });
        final int i2 = 1;
        this.read = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.screen.QrPaymentScreenViewModel$$ExternalSyntheticLambda0
            private static int IconCompatParcelizer = 0;
            private static int write = 1;
            public final /* synthetic */ getHeightD9Ej5fM read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = IconCompatParcelizer + 123;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = i2;
                getHeightD9Ej5fM getheightd9ej5fm = this.read;
                if (i6 != 0) {
                    if (i6 != 1) {
                        return i6 != 2 ? ((QrPaymentScreenArgs) getheightd9ej5fm.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).RemoteActionCompatParcelizer : ((QrPaymentScreenArgs) getheightd9ej5fm.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).IconCompatParcelizer;
                    }
                    return Long.valueOf(((QrPaymentScreenArgs) getheightd9ej5fm.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).serializer);
                }
                Object objWrite = getheightd9ej5fm.PlaybackStateCompatCustomAction.write("args_qr_payment_screen");
                if (objWrite == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("qr payment screen args should never be null");
                    return null;
                }
                int i7 = IconCompatParcelizer + 65;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return (QrPaymentScreenArgs) objWrite;
            }
        });
        final int i3 = 2;
        this.IconCompatParcelizer = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.screen.QrPaymentScreenViewModel$$ExternalSyntheticLambda0
            private static int IconCompatParcelizer = 0;
            private static int write = 1;
            public final /* synthetic */ getHeightD9Ej5fM read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i4 = 2 % 2;
                int i5 = IconCompatParcelizer + 123;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                int i7 = i3;
                getHeightD9Ej5fM getheightd9ej5fm = this.read;
                if (i7 != 0) {
                    if (i7 != 1) {
                        return i7 != 2 ? ((QrPaymentScreenArgs) getheightd9ej5fm.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).RemoteActionCompatParcelizer : ((QrPaymentScreenArgs) getheightd9ej5fm.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).IconCompatParcelizer;
                    }
                    return Long.valueOf(((QrPaymentScreenArgs) getheightd9ej5fm.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).serializer);
                }
                Object objWrite = getheightd9ej5fm.PlaybackStateCompatCustomAction.write("args_qr_payment_screen");
                if (objWrite == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("qr payment screen args should never be null");
                    return null;
                }
                int i8 = IconCompatParcelizer + 65;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return (QrPaymentScreenArgs) objWrite;
            }
        });
        final int i4 = 3;
        this.MediaSessionCompatResultReceiverWrapper = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.screen.QrPaymentScreenViewModel$$ExternalSyntheticLambda0
            private static int IconCompatParcelizer = 0;
            private static int write = 1;
            public final /* synthetic */ getHeightD9Ej5fM read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i5 = 2 % 2;
                int i6 = IconCompatParcelizer + 123;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                int i8 = i4;
                getHeightD9Ej5fM getheightd9ej5fm = this.read;
                if (i8 != 0) {
                    if (i8 != 1) {
                        return i8 != 2 ? ((QrPaymentScreenArgs) getheightd9ej5fm.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).RemoteActionCompatParcelizer : ((QrPaymentScreenArgs) getheightd9ej5fm.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).IconCompatParcelizer;
                    }
                    return Long.valueOf(((QrPaymentScreenArgs) getheightd9ej5fm.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).serializer);
                }
                Object objWrite = getheightd9ej5fm.PlaybackStateCompatCustomAction.write("args_qr_payment_screen");
                if (objWrite == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("qr payment screen args should never be null");
                    return null;
                }
                int i9 = IconCompatParcelizer + 65;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return (QrPaymentScreenArgs) objWrite;
            }
        });
    }

    public final void write() {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new SwitcherUiModelImpl$1(this, (ShortNewsContentCardView) null, 24), 3);
        int i2 = PlaybackStateCompat + 25;
        MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 0 / 0;
        }
    }
}
