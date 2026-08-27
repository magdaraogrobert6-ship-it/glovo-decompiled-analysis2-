package o;

import com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class pathR_LF3I extends ContinuationImpl {
    public int IconCompatParcelizer;
    public final /* synthetic */ PerseusUserLocalDataStoreImpl MediaBrowserCompatMediaItem;
    public int MediaMetadataCompat;
    public /* synthetic */ Object MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public String read;
    public long serializer;
    public long write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pathR_LF3I(PerseusUserLocalDataStoreImpl perseusUserLocalDataStoreImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaBrowserCompatMediaItem = perseusUserLocalDataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaSessionCompatQueueItem = obj;
        this.MediaMetadataCompat |= Integer.MIN_VALUE;
        return this.MediaBrowserCompatMediaItem.getSessionId(this);
    }
}
