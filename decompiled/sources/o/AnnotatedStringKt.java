package o;

import com.roadrunner.customerchat.selfservice.data.remote.HelpCenterRemoteDataSourceImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class AnnotatedStringKt extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public String IconCompatParcelizer;
    public final /* synthetic */ HelpCenterRemoteDataSourceImpl MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public /* synthetic */ Object MediaSessionCompatQueueItem;
    public collectRangeTransitions RemoteActionCompatParcelizer;
    public String read;
    public String serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotatedStringKt(HelpCenterRemoteDataSourceImpl helpCenterRemoteDataSourceImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaBrowserCompatMediaItem = helpCenterRemoteDataSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 111;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.MediaSessionCompatQueueItem = obj;
            this.MediaDescriptionCompat |= Integer.MIN_VALUE;
            return this.MediaBrowserCompatMediaItem.sendMessage(null, null, this);
        }
        this.MediaSessionCompatQueueItem = obj;
        this.MediaDescriptionCompat |= Integer.MIN_VALUE;
        this.MediaBrowserCompatMediaItem.sendMessage(null, null, this);
        throw null;
    }
}
