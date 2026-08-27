package o;

import androidx.compose.runtime.Recomposer$join$2;
import androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2;
import com.roadrunner.home.bottomsheet.config.GetBottomSheetConfigurationType;
import java.util.Set;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class performStart implements onViewStateRestored {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public static final Set read = onContentCardClicked.MediaSessionCompatQueueItem(new performDestroyView[]{performDestroyView.DF_ENABLED_WORKING, performDestroyView.TURN_BY_TURN_NAVIGATION, performDestroyView.DF_ENABLED_STACKED_DELIVERY_LIST});
    public final StateFlow IconCompatParcelizer;
    public final StateFlow RemoteActionCompatParcelizer;
    public final getContentViewGroupParentLayout serializer;
    public final MutableStateFlow write;

    static {
        int i = MediaBrowserCompatMediaItem + 11;
        MediaMetadataCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public performStart(isStateSaved isstatesaved, GetBottomSheetConfigurationType getBottomSheetConfigurationType, getNoneeUduSuo getnoneeudusuo, requestPermissions requestpermissions, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        getcontentviewgroupparentlayout.getClass();
        this.serializer = getcontentviewgroupparentlayout;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.valueOf(!getnoneeudusuo.IconCompatParcelizer()));
        this.write = mutableStateFlow;
        this.IconCompatParcelizer = mutableStateFlow;
        this.RemoteActionCompatParcelizer = FlowKt.write(FlowKt.write(new Recomposer$join$2(2, 2, null), ((requireActivity) requestpermissions).RemoteActionCompatParcelizer), getcontentviewgroupparentlayout, SharingStarted.Companion.read(2), Boolean.FALSE);
        if (getnoneeudusuo.IconCompatParcelizer()) {
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new PausingDispatcherKt$whenStateAtLeast$2(requestpermissions, isstatesaved, getBottomSheetConfigurationType, this, (ShortNewsContentCardView) null), 3);
            int i = MediaSessionCompatQueueItem + 113;
            RatingCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        int i4 = RatingCompat + 15;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
