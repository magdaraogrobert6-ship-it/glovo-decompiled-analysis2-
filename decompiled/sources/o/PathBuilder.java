package o;

import com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class PathBuilder extends ContinuationImpl {
    public int IconCompatParcelizer;
    public final /* synthetic */ PerseusUserLocalDataStoreImpl MediaDescriptionCompat;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public long write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathBuilder(PerseusUserLocalDataStoreImpl perseusUserLocalDataStoreImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaDescriptionCompat = perseusUserLocalDataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.MediaDescriptionCompat.putSessionId(null, this);
    }
}
