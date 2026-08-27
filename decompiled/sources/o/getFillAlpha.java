package o;

import com.deliveryhero.perseus.di.HitsModule;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getFillAlpha extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ HitsModule RemoteActionCompatParcelizer;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getFillAlpha(HitsModule hitsModule, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = hitsModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.RemoteActionCompatParcelizer.perseusSendHitUseCase(this);
    }
}
