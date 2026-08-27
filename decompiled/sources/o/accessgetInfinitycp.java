package o;

import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.logger.MultipleCodeScanEventLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.QrCodeScanTaskUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetInfinitycp implements minHeightOffsets {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final long IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final MultipleCodeScanEventLoggerImpl MediaMetadataCompat;
    public final StateFlow MediaSessionCompatQueueItem;
    public final fastFilterNotNull RemoteActionCompatParcelizer;
    public final getQueryContext read;
    public final String serializer;
    public final MutableStateFlow write;

    @Override // o.minHeightOffsets
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 105;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.MediaBrowserCompatMediaItem;
        int i4 = i2 + 67;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public accessgetInfinitycp(fastFilterNotNull fastfilternotnull, ContextScope contextScope, String str, ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl, getQueryContext getquerycontext, MultipleCodeScanEventLoggerImpl multipleCodeScanEventLoggerImpl) {
        str.getClass();
        observeTaskByTypeAndIdUseCaseImpl.getClass();
        getquerycontext.getClass();
        multipleCodeScanEventLoggerImpl.getClass();
        this.RemoteActionCompatParcelizer = fastfilternotnull;
        this.MediaBrowserCompatMediaItem = str;
        this.read = getquerycontext;
        this.MediaMetadataCompat = multipleCodeScanEventLoggerImpl;
        this.IconCompatParcelizer = fastfilternotnull.deliveryId;
        this.serializer = fastfilternotnull.action;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(widthMask.IconCompatParcelizer);
        this.write = mutableStateFlow;
        this.MediaSessionCompatQueueItem = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new QrCodeScanTaskUiModelImpl$1(observeTaskByTypeAndIdUseCaseImpl, this, null, 18), 3);
    }
}
