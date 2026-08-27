package o;

import com.roadrunner.delivery.accept.backToBackOrder.data.BackToBackOrdersDataRepositoryImpl;
import com.roadrunner.delivery.accept.glowBoxBanner.presentation.GlowBoxOverlayBannerUiModelImpl$1;
import com.roadrunner.util.sound.DefaultForegroundSoundManager;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class StaticLayoutFactoryDefault implements SpannedExtensions_androidKt {
    private static int ParcelableVolumeInfo = 1;
    private static int PlaybackStateCompatCustomAction;
    public final MutableStateFlow IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final r8lambdaKLUglSIfRlmIAl3gbMulFwcpk84 MediaDescriptionCompat;
    public final StateFlow MediaMetadataCompat;
    public final DefaultForegroundSoundManager MediaSessionCompatQueueItem;
    public final getKeyboardTap5zf0vsI RatingCompat;
    public final getContentViewGroupParentLayout RemoteActionCompatParcelizer;
    public final decode read;
    public final BackToBackOrdersDataRepositoryImpl serializer;
    public final MutableStateFlow write;

    public StaticLayoutFactoryDefault(r8lambdaKLUglSIfRlmIAl3gbMulFwcpk84 r8lambdakluglsifrlmial3gbmulfwcpk84, copyO0kMr_c copyo0kmr_c, BackToBackOrdersDataRepositoryImpl backToBackOrdersDataRepositoryImpl, decode decodeVar, DefaultForegroundSoundManager defaultForegroundSoundManager, getKeyboardTap5zf0vsI getkeyboardtap5zf0vsi, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        getcontentviewgroupparentlayout.getClass();
        this.MediaDescriptionCompat = r8lambdakluglsifrlmial3gbmulfwcpk84;
        this.serializer = backToBackOrdersDataRepositoryImpl;
        this.read = decodeVar;
        this.MediaSessionCompatQueueItem = defaultForegroundSoundManager;
        this.RatingCompat = getkeyboardtap5zf0vsi;
        this.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(extendWith.serializer);
        this.IconCompatParcelizer = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.write = mutableStateFlow2;
        this.MediaMetadataCompat = mutableStateFlow2;
        if (copyo0kmr_c.RemoteActionCompatParcelizer()) {
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new GlowBoxOverlayBannerUiModelImpl$1(this, null, 0), 3);
            int i = ParcelableVolumeInfo + 45;
            PlaybackStateCompatCustomAction = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        }
        int i3 = PlaybackStateCompatCustomAction + 49;
        ParcelableVolumeInfo = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }
}
