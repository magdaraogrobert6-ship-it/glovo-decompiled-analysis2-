package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class setRipplePropertiesbiQXAtU extends ContinuationImpl {
    public int IconCompatParcelizer;
    public UpdatableAnimationState RemoteActionCompatParcelizer;
    public float read;
    public /* synthetic */ Object serializer;
    public cancelPendingWebViewPauselambda0 write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.access$animateDecay(null, 0.0f, null, null, null, this);
    }

    public setRipplePropertiesbiQXAtU(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
