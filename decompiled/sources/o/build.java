package o;

import com.deliveryhero.perseus.core.session.AppSessionManagerImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class build extends ContinuationImpl {
    public int IconCompatParcelizer;
    public /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ AppSessionManagerImpl RatingCompat;
    public setCustomInAppMessageAnimationFactorylambda0 RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public build(AppSessionManagerImpl appSessionManagerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RatingCompat = appSessionManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaDescriptionCompat = obj;
        this.read |= Integer.MIN_VALUE;
        return this.RatingCompat.getUserSessionId(this);
    }
}
