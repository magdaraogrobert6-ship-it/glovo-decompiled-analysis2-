package o;

import com.roadrunner.delivery.accept.bottomsheet.overlay.presentation.OverlayFooterUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class drawTextLVfH_YU implements offsetPositionRecordsForRemove {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final StateFlow IconCompatParcelizer;
    public final StateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final accessgetStripNonMetricAffectingCharSpansp serializer;
    public final MutableStateFlow write;

    @Override // o.offsetPositionRecordsForRemove
    public final StateFlow serializer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 123;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 101;
        MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return stateFlow;
        }
        throw null;
    }

    public drawTextLVfH_YU(getContentViewGroupParentLayout getcontentviewgroupparentlayout, fastMapTo fastmapto) {
        getcontentviewgroupparentlayout.getClass();
        this.serializer = fastmapto.read(getcontentviewgroupparentlayout, true);
        MutableStateFlow mutableStateFlow = StateFlowKt.read(instance_delegatelambda0.write);
        this.read = mutableStateFlow;
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        ShortNewsContentCardView shortNewsContentCardView = null;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(null);
        this.write = mutableStateFlow2;
        this.IconCompatParcelizer = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new OverlayFooterUiModelImpl$1(this, shortNewsContentCardView, 0), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new OverlayFooterUiModelImpl$1(this, shortNewsContentCardView, 1), 3);
    }
}
