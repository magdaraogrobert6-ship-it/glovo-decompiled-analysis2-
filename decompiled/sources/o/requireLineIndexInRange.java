package o;

import com.roadrunner.customerchat.selfservice.domain.usecase.GetChatAssetDownloadAction;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class requireLineIndexInRange extends ContinuationImpl {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ GetChatAssetDownloadAction MediaBrowserCompatMediaItem;
    public /* synthetic */ Object MediaDescriptionCompat;
    public String RemoteActionCompatParcelizer;
    public String read;
    public String serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public requireLineIndexInRange(GetChatAssetDownloadAction getChatAssetDownloadAction, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaBrowserCompatMediaItem = getChatAssetDownloadAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 21;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaDescriptionCompat = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objInvoke = this.MediaBrowserCompatMediaItem.invoke(null, null, null, null, this);
        int i4 = MediaMetadataCompat + 39;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objInvoke;
        }
        throw null;
    }
}
