package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ImmutableListSubList extends ContinuationImpl {
    public Object[] IconCompatParcelizer;
    public /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ androidx.compose.foundation.relocation.BringIntoViewRequesterImpl MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public androidx.compose.ui.geometry.Rect read;
    public int serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImmutableListSubList(androidx.compose.foundation.relocation.BringIntoViewRequesterImpl bringIntoViewRequesterImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatQueueItem = bringIntoViewRequesterImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaBrowserCompatMediaItem = obj;
        this.write |= Integer.MIN_VALUE;
        return this.MediaSessionCompatQueueItem.bringIntoView(null, this);
    }
}
