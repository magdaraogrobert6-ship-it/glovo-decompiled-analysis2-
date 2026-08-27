package o;

import com.deliveryhero.perseus.hits.usecase.PerseusSaveHitUseCase;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class setPathData extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ PerseusSaveHitUseCase read;
    public Map write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setPathData(PerseusSaveHitUseCase perseusSaveHitUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = perseusSaveHitUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.read.runWithImmediateDispatch(null, null, null, this);
    }
}
