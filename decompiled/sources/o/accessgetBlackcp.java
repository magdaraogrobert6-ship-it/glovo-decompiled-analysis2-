package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetBlackcp extends ContinuationImpl {
    public int IconCompatParcelizer;
    public /* synthetic */ Object MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker MediaSessionCompatQueueItem;
    public String[] RatingCompat;
    public clipRectN_I0legdefault RemoteActionCompatParcelizer;
    public String read;
    public int serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetBlackcp(androidx.room.TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatQueueItem = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaBrowserCompatMediaItem = obj;
        this.MediaDescriptionCompat |= Integer.MIN_VALUE;
        return androidx.room.TriggerBasedInvalidationTracker.access$startTrackingTable(this.MediaSessionCompatQueueItem, null, 0, this);
    }
}
