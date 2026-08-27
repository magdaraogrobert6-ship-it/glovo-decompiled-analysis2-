package o;

import com.deliveryhero.selfServiceChat.data.HelpcenterRemoteDataSourceImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getY1 extends ContinuationImpl {
    public String IconCompatParcelizer;
    public /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ HelpcenterRemoteDataSourceImpl RatingCompat;
    public int RemoteActionCompatParcelizer;
    public String read;
    public HelpcenterRemoteDataSourceImpl serializer;
    public LayerSnapshot_androidKt write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getY1(HelpcenterRemoteDataSourceImpl helpcenterRemoteDataSourceImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RatingCompat = helpcenterRemoteDataSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaBrowserCompatMediaItem = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.RatingCompat.sendMessage(null, this);
    }
}
