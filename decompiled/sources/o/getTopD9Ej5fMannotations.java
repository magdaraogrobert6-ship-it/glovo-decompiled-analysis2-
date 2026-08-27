package o;

import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.logger.QrPaymentEventLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.QrCodeScanTaskUiModelImpl$1;
import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class getTopD9Ej5fMannotations implements minHeightOffsets {
    private static int ParcelableVolumeInfo = 0;
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final long MediaBrowserCompatMediaItem;
    public final QrPaymentEventLoggerImpl MediaDescriptionCompat;
    public final StateFlow MediaMetadataCompat;
    public final fastFilterNotNull MediaSessionCompatQueueItem;
    public final StateFlow MediaSessionCompatResultReceiverWrapper;
    public final String MediaSessionCompatToken;
    public final UpdateTaskUseCaseImpl PlaybackStateCompat;
    public final getTransition PlaybackStateCompatCustomAction;
    public final String RatingCompat;
    public final openSessionlambda1 RemoteActionCompatParcelizer;
    public final ContextScope read;
    public final getQueryContext serializer;
    public final MutableStateFlow write;

    @Override // o.minHeightOffsets
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 75;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ParcelableVolumeInfo = i3;
        int i4 = i2 % 2;
        String str = this.MediaSessionCompatToken;
        int i5 = i3 + 21;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 98 / 0;
        }
        return str;
    }

    public getTopD9Ej5fMannotations(fastFilterNotNull fastfilternotnull, ContextScope contextScope, String str, getQueryContext getquerycontext, ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl, openSessionlambda1 opensessionlambda1, getTransition gettransition, UpdateTaskUseCaseImpl updateTaskUseCaseImpl, QrPaymentEventLoggerImpl qrPaymentEventLoggerImpl) {
        str.getClass();
        getquerycontext.getClass();
        observeTaskByTypeAndIdUseCaseImpl.getClass();
        opensessionlambda1.getClass();
        gettransition.getClass();
        updateTaskUseCaseImpl.getClass();
        qrPaymentEventLoggerImpl.getClass();
        this.MediaSessionCompatQueueItem = fastfilternotnull;
        this.read = contextScope;
        this.MediaSessionCompatToken = str;
        this.serializer = getquerycontext;
        this.RemoteActionCompatParcelizer = opensessionlambda1;
        this.PlaybackStateCompatCustomAction = gettransition;
        this.PlaybackStateCompat = updateTaskUseCaseImpl;
        this.MediaDescriptionCompat = qrPaymentEventLoggerImpl;
        this.MediaBrowserCompatMediaItem = fastfilternotnull.deliveryId;
        this.RatingCompat = fastfilternotnull.action;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(plusCBMgk4.write);
        this.write = mutableStateFlow;
        this.MediaSessionCompatResultReceiverWrapper = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(null);
        this.IconCompatParcelizer = mutableStateFlow2;
        this.MediaMetadataCompat = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new QrCodeScanTaskUiModelImpl$1(observeTaskByTypeAndIdUseCaseImpl, this, null, 21), 3);
    }

    public final void serializer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(this.read, null, null, new ReconnectScheduler$schedule$1(this, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, 6), 3);
        int i2 = ParcelableVolumeInfo + 117;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 14 / 0;
        }
    }

    public final String RemoteActionCompatParcelizer(Double d) {
        String strSerializer;
        int i = 2 % 2;
        Object obj = null;
        if (d != null) {
            strSerializer = this.RemoteActionCompatParcelizer.serializer(d.doubleValue(), "", true);
            int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 33;
            ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            strSerializer = null;
        }
        if (strSerializer == null) {
            int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 77;
            ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return "";
            }
            obj.hashCode();
            throw null;
        }
        int i5 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 71;
        ParcelableVolumeInfo = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return strSerializer;
        }
        obj.hashCode();
        throw null;
    }
}
