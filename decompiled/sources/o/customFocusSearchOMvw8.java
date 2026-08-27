package o;

import androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class customFocusSearchOMvw8 extends ContinuationImpl {
    public Serializable IconCompatParcelizer;
    public Iterator MediaBrowserCompatMediaItem;
    public /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ androidx.datastore.core.SingleProcessDataStore MediaSessionCompatQueueItem;
    public int RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public androidx.datastore.core.SingleProcessDataStore serializer;
    public SingleProcessDataStore$readAndInit$api$1 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public customFocusSearchOMvw8(androidx.datastore.core.SingleProcessDataStore singleProcessDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatQueueItem = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaDescriptionCompat = obj;
        this.RatingCompat |= Integer.MIN_VALUE;
        return this.MediaSessionCompatQueueItem.readAndInit(this);
    }
}
