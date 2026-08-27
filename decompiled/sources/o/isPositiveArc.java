package o;

import com.deliveryhero.selfServiceChat.data.HelpcenterRemoteDataSourceImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class isPositiveArc extends ContinuationImpl {
    public String IconCompatParcelizer;
    public /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ HelpcenterRemoteDataSourceImpl MediaMetadataCompat;
    public int RatingCompat;
    public HelpcenterRemoteDataSourceImpl RemoteActionCompatParcelizer;
    public String read;
    public rebuildOutline serializer;
    public setSpotShadowColor write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isPositiveArc(HelpcenterRemoteDataSourceImpl helpcenterRemoteDataSourceImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaMetadataCompat = helpcenterRemoteDataSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaBrowserCompatMediaItem = obj;
        this.RatingCompat |= Integer.MIN_VALUE;
        return this.MediaMetadataCompat.getChatID(null, this);
    }
}
