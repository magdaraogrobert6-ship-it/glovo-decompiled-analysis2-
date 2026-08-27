package o;

import android.net.Uri;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class GraphicsLayertoImageBitmap1 extends ContinuationImpl {
    public com.deliveryhero.chatui.data.datasource.ImageCacheResolverImpl IconCompatParcelizer;
    public final /* synthetic */ com.deliveryhero.chatui.data.datasource.ImageCacheResolverImpl MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public String read;
    public /* synthetic */ Object serializer;
    public Uri write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphicsLayertoImageBitmap1(com.deliveryhero.chatui.data.datasource.ImageCacheResolverImpl imageCacheResolverImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatQueueItem = imageCacheResolverImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.MediaSessionCompatQueueItem.cacheImageFile(null, null, this);
    }
}
