package o;

import com.roadrunner.customerchat.usecase.TriggerChatAssetsDownloading;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class lerpPlatformStyle extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 0;
    private static int MediaSessionCompatToken = 1;
    public String IconCompatParcelizer;
    public List MediaBrowserCompatMediaItem;
    public /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ TriggerChatAssetsDownloading MediaMetadataCompat;
    public int RatingCompat;
    public String RemoteActionCompatParcelizer;
    public String read;
    public String serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lerpPlatformStyle(TriggerChatAssetsDownloading triggerChatAssetsDownloading, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaMetadataCompat = triggerChatAssetsDownloading;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 5;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.MediaDescriptionCompat = obj;
            this.RatingCompat |= Integer.MIN_VALUE;
            return this.MediaMetadataCompat.invoke(null, null, null, null, null, null, this);
        }
        this.MediaDescriptionCompat = obj;
        this.RatingCompat |= Integer.MIN_VALUE;
        this.MediaMetadataCompat.invoke(null, null, null, null, null, null, this);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
