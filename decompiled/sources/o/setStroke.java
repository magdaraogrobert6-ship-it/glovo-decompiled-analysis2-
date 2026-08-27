package o;

import com.deliveryhero.perseus.hits.usecase.RunTelemetryUseCase;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class setStroke extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ RunTelemetryUseCase read;
    public long serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setStroke(RunTelemetryUseCase runTelemetryUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = runTelemetryUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.read.run(this);
    }
}
