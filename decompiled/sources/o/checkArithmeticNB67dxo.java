package o;

import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.QrCodeScanTaskUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class checkArithmeticNB67dxo implements minHeightOffsets {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final long IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final StateFlow MediaMetadataCompat;
    public final UpdateTaskUseCaseImpl MediaSessionCompatQueueItem;
    public final ContextScope RemoteActionCompatParcelizer;
    public final String read;
    public final MutableStateFlow serializer;
    public final fastFilterNotNull write;

    @Override // o.minHeightOffsets
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 93;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.MediaBrowserCompatMediaItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public checkArithmeticNB67dxo(fastFilterNotNull fastfilternotnull, ContextScope contextScope, String str, ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl, UpdateTaskUseCaseImpl updateTaskUseCaseImpl) {
        str.getClass();
        this.write = fastfilternotnull;
        this.RemoteActionCompatParcelizer = contextScope;
        this.MediaBrowserCompatMediaItem = str;
        this.MediaSessionCompatQueueItem = updateTaskUseCaseImpl;
        this.IconCompatParcelizer = fastfilternotnull.deliveryId;
        this.read = fastfilternotnull.action;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(TextUnitKt.read);
        this.serializer = mutableStateFlow;
        this.MediaMetadataCompat = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new QrCodeScanTaskUiModelImpl$1(observeTaskByTypeAndIdUseCaseImpl, this, null, 29), 3);
    }
}
