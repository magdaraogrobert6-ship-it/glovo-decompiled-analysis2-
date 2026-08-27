package o;

import com.deliveryhero.perseus.hits.usecase.PerseusSendHitUseCase;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class setPathFillTypeoQ8Xj4U extends ContinuationImpl {
    public final /* synthetic */ PerseusSendHitUseCase IconCompatParcelizer;
    public /* synthetic */ Object read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setPathFillTypeoQ8Xj4U(PerseusSendHitUseCase perseusSendHitUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = perseusSendHitUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.run(null, this);
    }
}
