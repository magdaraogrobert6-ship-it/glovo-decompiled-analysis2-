package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;

/* JADX INFO: loaded from: classes.dex */
public final class FocusTransactionsKtgrantFocus1 extends ContinuationImpl {
    public Object IconCompatParcelizer;
    public final /* synthetic */ androidx.datastore.core.SingleProcessDataStore MediaBrowserCompatMediaItem;
    public androidx.datastore.core.SingleProcessDataStore RemoteActionCompatParcelizer;
    public int read;
    public CompletableDeferredImpl serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusTransactionsKtgrantFocus1(androidx.datastore.core.SingleProcessDataStore singleProcessDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaBrowserCompatMediaItem = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        return androidx.datastore.core.SingleProcessDataStore.access$handleUpdate(this.MediaBrowserCompatMediaItem, null, this);
    }
}
