package o;

import coil3.Extras$Key;
import com.deliveryhero.perseus.core.session.AppSessionManagerImpl;
import com.deliveryhero.perseus.core.session.ClientIdProviderImpl;
import com.deliveryhero.perseus.data.local.db.entity.HitEventFactory;
import com.deliveryhero.perseus.di.DataModule;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class PathComponent extends ContinuationImpl {
    public AppSessionManagerImpl IconCompatParcelizer;
    public /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ DataModule MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public Extras$Key read;
    public ClientIdProviderImpl serializer;
    public HitEventFactory write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathComponent(DataModule dataModule, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatQueueItem = dataModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaBrowserCompatMediaItem = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.MediaSessionCompatQueueItem.perseusHitsRepository(this);
    }
}
