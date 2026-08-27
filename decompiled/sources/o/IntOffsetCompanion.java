package o;

import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.QrCodeScanTaskUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class IntOffsetCompanion implements minHeightOffsets {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public final long IconCompatParcelizer;
    public final String MediaDescriptionCompat;
    public final String MediaSessionCompatQueueItem;
    public final remBjo55l4 RatingCompat;
    public final fastFilterNotNull RemoteActionCompatParcelizer;
    public final getQueryContext read;
    public final ContextScope serializer;
    public final MutableStateFlow write;

    @Override // o.minHeightOffsets
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 71;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        String str = this.MediaSessionCompatQueueItem;
        int i5 = i3 + 95;
        MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public IntOffsetCompanion(fastFilterNotNull fastfilternotnull, ContextScope contextScope, String str, remBjo55l4 rembjo55l4, ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl, getQueryContext getquerycontext) {
        str.getClass();
        rembjo55l4.getClass();
        observeTaskByTypeAndIdUseCaseImpl.getClass();
        getquerycontext.getClass();
        this.RemoteActionCompatParcelizer = fastfilternotnull;
        this.serializer = contextScope;
        this.MediaSessionCompatQueueItem = str;
        this.RatingCompat = rembjo55l4;
        this.read = getquerycontext;
        this.IconCompatParcelizer = fastfilternotnull.deliveryId;
        this.MediaDescriptionCompat = fastfilternotnull.action;
        this.write = StateFlowKt.read(getZeroMYxV2XQ.write);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new QrCodeScanTaskUiModelImpl$1(observeTaskByTypeAndIdUseCaseImpl, this, null, 0), 3);
    }
}
