package o;

import com.deliveryhero.perseus.hits.PerseusWorker;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getTrimPathStart extends ContinuationImpl {
    public final /* synthetic */ PerseusWorker IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public List write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getTrimPathStart(PerseusWorker perseusWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = perseusWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return PerseusWorker.access$onSuccess(this.IconCompatParcelizer, null, null, this);
    }
}
