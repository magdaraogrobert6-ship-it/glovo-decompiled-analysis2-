package o;

import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class lerp81ZRxRo extends androidx.lifecycle.ViewModel {
    private static int ParcelableVolumeInfo = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final isAdapterPositionOnScreen IconCompatParcelizer;
    public final getBitmapui_graphics MediaBrowserCompatMediaItem;
    public final StateFlow MediaDescriptionCompat;
    public final StateFlow MediaMetadataCompat;
    public final ObserveTaskByTypeAndIdUseCaseImpl MediaSessionCompatQueueItem;
    public final UpdateTaskUseCaseImpl MediaSessionCompatResultReceiverWrapper;
    public final getKeyboardTap5zf0vsI PlaybackStateCompat;
    public final getQueryContext RatingCompat;
    public final com.huawei.wisesecurity.ucs_credential.p0 RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final MutableStateFlow serializer;
    public final remBjo55l4 write;

    public lerp81ZRxRo(getBitmapui_graphics getbitmapui_graphics, getQueryContext getquerycontext, ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl, com.huawei.wisesecurity.ucs_credential.p0 p0Var, UpdateTaskUseCaseImpl updateTaskUseCaseImpl, getKeyboardTap5zf0vsI getkeyboardtap5zf0vsi, remBjo55l4 rembjo55l4) {
        getbitmapui_graphics.getClass();
        getquerycontext.getClass();
        observeTaskByTypeAndIdUseCaseImpl.getClass();
        p0Var.getClass();
        updateTaskUseCaseImpl.getClass();
        getkeyboardtap5zf0vsi.getClass();
        rembjo55l4.getClass();
        this.MediaBrowserCompatMediaItem = getbitmapui_graphics;
        this.RatingCompat = getquerycontext;
        this.MediaSessionCompatQueueItem = observeTaskByTypeAndIdUseCaseImpl;
        this.RemoteActionCompatParcelizer = p0Var;
        this.MediaSessionCompatResultReceiverWrapper = updateTaskUseCaseImpl;
        this.PlaybackStateCompat = getkeyboardtap5zf0vsi;
        this.write = rembjo55l4;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(getZeroMYxV2XQ.write);
        this.serializer = mutableStateFlow;
        this.MediaMetadataCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(divBjo55l4.RemoteActionCompatParcelizer);
        this.read = mutableStateFlow2;
        this.MediaDescriptionCompat = mutableStateFlow2;
        this.IconCompatParcelizer = new isAdapterPositionOnScreen(new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(15, this));
    }

    public final PreviewContainer write() {
        copyiSbpLlY copyisbplly;
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 61;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object obj = this.serializer.read();
        if (!(obj instanceof copyiSbpLlY)) {
            copyisbplly = null;
        } else {
            copyisbplly = (copyiSbpLlY) obj;
            int i4 = ParcelableVolumeInfo + 49;
            PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 3 / 2;
            }
        }
        if (copyisbplly != null) {
            return copyisbplly.RemoteActionCompatParcelizer;
        }
        return null;
    }
}
