package o;

import com.roadrunner.customerchat.selfservice.data.remote.HelpCenterRemoteDataSourceImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaOVpCj1XGg7qPbIdHqXDx49YcM1E extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public collectRangeTransitions IconCompatParcelizer;
    public /* synthetic */ Object MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public final /* synthetic */ HelpCenterRemoteDataSourceImpl RatingCompat;
    public String RemoteActionCompatParcelizer;
    public String read;
    public String serializer;
    public removeScheduledCallback write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaOVpCj1XGg7qPbIdHqXDx49YcM1E(HelpCenterRemoteDataSourceImpl helpCenterRemoteDataSourceImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RatingCompat = helpCenterRemoteDataSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 91;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.MediaMetadataCompat = obj;
            this.MediaSessionCompatQueueItem |= Integer.MIN_VALUE;
            this.RatingCompat.getChatId(null, this);
            obj2.hashCode();
            throw null;
        }
        this.MediaMetadataCompat = obj;
        this.MediaSessionCompatQueueItem |= Integer.MIN_VALUE;
        Object chatId = this.RatingCompat.getChatId(null, this);
        int i3 = MediaDescriptionCompat + 59;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 77 / 0;
        }
        return chatId;
    }
}
