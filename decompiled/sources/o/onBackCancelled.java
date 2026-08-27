package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.reactive.ReactiveSubscriber;

/* JADX INFO: loaded from: classes4.dex */
public final class onBackCancelled extends ContinuationImpl {
    public int IconCompatParcelizer;
    public final /* synthetic */ ReactiveSubscriber read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onBackCancelled(ReactiveSubscriber reactiveSubscriber, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = reactiveSubscriber;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.read.takeNextOrNull(this);
    }
}
