package o;

import com.deliveryhero.perseus.core.session.AppSessionManagerImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class clearGroup extends ContinuationImpl {
    public long IconCompatParcelizer;
    public /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ AppSessionManagerImpl MediaMetadataCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public setCustomInAppMessageAnimationFactorylambda0 serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clearGroup(AppSessionManagerImpl appSessionManagerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaMetadataCompat = appSessionManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaDescriptionCompat = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.MediaMetadataCompat.getAndIncrementSessionOffset(this);
    }
}
