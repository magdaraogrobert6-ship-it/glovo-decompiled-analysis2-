package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetBluecp extends ContinuationImpl {
    public String[] IconCompatParcelizer;
    public final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker MediaBrowserCompatMediaItem;
    public /* synthetic */ Object MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public int RemoteActionCompatParcelizer;
    public clipRectN_I0legdefault read;
    public String serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetBluecp(androidx.room.TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaBrowserCompatMediaItem = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaDescriptionCompat = obj;
        this.MediaMetadataCompat |= Integer.MIN_VALUE;
        return androidx.room.TriggerBasedInvalidationTracker.access$stopTrackingTable(this.MediaBrowserCompatMediaItem, null, 0, this);
    }
}
