package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class checkForContentCapturePropertyChanges extends ContinuationImpl {
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.runtime.PausableMonotonicFrameClock read;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public checkForContentCapturePropertyChanges(androidx.compose.runtime.PausableMonotonicFrameClock pausableMonotonicFrameClock, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = pausableMonotonicFrameClock;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.read.withFrameNanos(null, this);
    }
}
