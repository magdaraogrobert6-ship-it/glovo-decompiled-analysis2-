package o;

import androidx.datastore.core.SimpleActor$offer$2;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.customerchat.selfservice.domain.usecase.GetChatAssetDownloadConfig;
import com.roadrunner.customerchat.usecase.TriggerChatAssetsDownloading;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getTextAlignbuA522U implements androidx.lifecycle.DefaultLifecycleObserver {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final GetChatAssetDownloadConfig IconCompatParcelizer;
    public final InitializeAppStartupItemsImpl MediaBrowserCompatMediaItem;
    public final getTextIndent MediaDescriptionCompat;
    public final TriggerChatAssetsDownloading MediaMetadataCompat;
    public final setMaxElementsWrap RemoteActionCompatParcelizer;
    public final accessisSetgyyYBs read;
    public final InitializeAppStartupItemsImpl serializer;
    public final isOpenInternalroom_runtime write;

    public getTextAlignbuA522U(InitializeAppStartupItemsImpl initializeAppStartupItemsImpl, isOpenInternalroom_runtime isopeninternalroom_runtime, getTextIndent gettextindent, accessisSetgyyYBs accessissetgyyybs, GetChatAssetDownloadConfig getChatAssetDownloadConfig, TriggerChatAssetsDownloading triggerChatAssetsDownloading, setMaxElementsWrap setmaxelementswrap, InitializeAppStartupItemsImpl initializeAppStartupItemsImpl2) {
        initializeAppStartupItemsImpl.getClass();
        isopeninternalroom_runtime.getClass();
        gettextindent.getClass();
        accessissetgyyybs.getClass();
        getChatAssetDownloadConfig.getClass();
        triggerChatAssetsDownloading.getClass();
        setmaxelementswrap.getClass();
        initializeAppStartupItemsImpl2.getClass();
        this.MediaBrowserCompatMediaItem = initializeAppStartupItemsImpl;
        this.write = isopeninternalroom_runtime;
        this.MediaDescriptionCompat = gettextindent;
        this.read = accessissetgyyybs;
        this.IconCompatParcelizer = getChatAssetDownloadConfig;
        this.MediaMetadataCompat = triggerChatAssetsDownloading;
        this.RemoteActionCompatParcelizer = setmaxelementswrap;
        this.serializer = initializeAppStartupItemsImpl2;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        accessisrendernodecompatiblecp.getClass();
        super.onCreate(accessisrendernodecompatiblecp);
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new SimpleActor$offer$2(accessisrendernodecompatiblecp, this, (ShortNewsContentCardView) null, 27), 3);
        int i2 = RatingCompat + 75;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
