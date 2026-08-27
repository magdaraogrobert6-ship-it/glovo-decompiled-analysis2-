package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class handlePressInteraction extends ContinuationImpl {
    public cancelPendingWebViewPauselambda0 IconCompatParcelizer;
    public /* synthetic */ Object MediaSessionCompatQueueItem;
    public UpdatableAnimationState RemoteActionCompatParcelizer;
    public int read;
    public float serializer;
    public float write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaSessionCompatQueueItem = obj;
        this.read |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.access$animateWithTarget(null, 0.0f, 0.0f, null, null, null, this);
    }

    public handlePressInteraction(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
