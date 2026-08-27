package o;

import com.deliveryhero.perseus.hits.PerseusWorkFinishedCallback;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getTrimPathEnd extends ContinuationImpl {
    public PerseusWorkFinishedCallback IconCompatParcelizer;
    public final /* synthetic */ PerseusWorkFinishedCallback RatingCompat;
    public int RemoteActionCompatParcelizer;
    public Object read;
    public List serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getTrimPathEnd(PerseusWorkFinishedCallback perseusWorkFinishedCallback, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RatingCompat = perseusWorkFinishedCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.RatingCompat.onWorkFinished(null, null, this);
    }
}
