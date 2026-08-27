package o;

import androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class FocusTraversalKt extends ContinuationImpl {
    public androidx.datastore.core.SingleProcessDataStore IconCompatParcelizer;
    public /* synthetic */ Object MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public final /* synthetic */ SingleProcessDataStore$readAndInit$api$1 RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public createInAppMessageEventSubscriber read;
    public Object serializer;
    public Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusTraversalKt(SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RatingCompat = singleProcessDataStore$readAndInit$api$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaMetadataCompat = obj;
        this.MediaSessionCompatQueueItem |= Integer.MIN_VALUE;
        return this.RatingCompat.updateData(null, this);
    }
}
