package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class cornerPathEffect extends ContinuationImpl {
    public final /* synthetic */ coil3.compose.ConstraintsSizeResolver IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int serializer;
    public createInAppMessageEventSubscriber write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cornerPathEffect(coil3.compose.ConstraintsSizeResolver constraintsSizeResolver, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = constraintsSizeResolver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.size(this);
    }
}
