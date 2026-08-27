package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class RippleHostMap extends ContinuationImpl {
    public isInvalidIndex IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.foundation.gestures.UpdatableAnimationState MediaSessionCompatQueueItem;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public int serializer;
    public float write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleHostMap(androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatQueueItem = updatableAnimationState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.MediaSessionCompatQueueItem.animateToZero(null, null, this);
    }
}
