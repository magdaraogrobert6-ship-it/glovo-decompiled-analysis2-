package o;

import com.google.firebase.Timestamp;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetYellowcp extends ContinuationImpl {
    public Object IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ androidx.room.coroutines.ConnectionPoolImpl MediaSessionCompatQueueItem;
    public Timestamp.Companion RatingCompat;
    public createInAppMessageEventSubscriber RemoteActionCompatParcelizer;
    public Object read;
    public TextAnnouncementContentCardView serializer;
    public createInAppMessageEventSubscriber write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetYellowcp(androidx.room.coroutines.ConnectionPoolImpl connectionPoolImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.MediaSessionCompatQueueItem = connectionPoolImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaMetadataCompat = obj;
        this.MediaBrowserCompatMediaItem |= Integer.MIN_VALUE;
        return this.MediaSessionCompatQueueItem.useConnection(false, null, this);
    }
}
