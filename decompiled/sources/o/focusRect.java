package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class focusRect extends ContinuationImpl {
    public Object IconCompatParcelizer;
    public final /* synthetic */ androidx.datastore.core.SingleProcessDataStore MediaBrowserCompatMediaItem;
    public androidx.datastore.core.SingleProcessDataStore RemoteActionCompatParcelizer;
    public Object read;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public focusRect(androidx.datastore.core.SingleProcessDataStore singleProcessDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaBrowserCompatMediaItem = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.MediaBrowserCompatMediaItem.transformAndWrite(null, null, this);
    }
}
