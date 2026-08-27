package o;

import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.QrCodeScanTaskUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class notifySubscribe implements minHeightOffsets {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final ContextScope IconCompatParcelizer;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final StateFlow RatingCompat;
    public final fastFilterNotNull RemoteActionCompatParcelizer;
    public final long read;
    public final getQueryContext serializer;
    public final MutableStateFlow write;

    @Override // o.minHeightOffsets
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 81;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.MediaDescriptionCompat;
        }
        int i3 = 77 / 0;
        return this.MediaDescriptionCompat;
    }

    public notifySubscribe(fastFilterNotNull fastfilternotnull, ContextScope contextScope, String str, ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl, getQueryContext getquerycontext) {
        str.getClass();
        observeTaskByTypeAndIdUseCaseImpl.getClass();
        getquerycontext.getClass();
        this.RemoteActionCompatParcelizer = fastfilternotnull;
        this.IconCompatParcelizer = contextScope;
        this.MediaDescriptionCompat = str;
        this.serializer = getquerycontext;
        this.read = fastfilternotnull.deliveryId;
        this.MediaMetadataCompat = fastfilternotnull.action;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(AnimationSearchAnimatedContentSearch.IconCompatParcelizer);
        this.write = mutableStateFlow;
        this.RatingCompat = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new QrCodeScanTaskUiModelImpl$1(observeTaskByTypeAndIdUseCaseImpl, this, null, 11), 3);
    }
}
