package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class OffsetKt extends ContinuationImpl {
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public /* synthetic */ Object RatingCompat;
    public createInAppMessageEventSubscriber RemoteActionCompatParcelizer;
    public onPan read;
    public int serializer;
    public UpdatableAnimationState write;

    public OffsetKt(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RatingCompat = obj;
        this.serializer |= Integer.MIN_VALUE;
        return androidx.compose.animation.core.SuspendAnimationKt.animate(null, null, 0L, null, this);
    }
}
