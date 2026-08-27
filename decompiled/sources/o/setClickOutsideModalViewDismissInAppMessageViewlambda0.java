package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.selects.SelectImplementation;

/* JADX INFO: loaded from: classes4.dex */
public final class setClickOutsideModalViewDismissInAppMessageViewlambda0 extends ContinuationImpl {
    public SelectImplementation IconCompatParcelizer;
    public final /* synthetic */ SelectImplementation RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setClickOutsideModalViewDismissInAppMessageViewlambda0(SelectImplementation selectImplementation, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = selectImplementation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.RemoteActionCompatParcelizer.doSelectSuspend(this);
    }
}
