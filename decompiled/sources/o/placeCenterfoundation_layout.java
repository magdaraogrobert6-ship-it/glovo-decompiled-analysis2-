package o;

import androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class placeCenterfoundation_layout {
    public static final Object RemoteActionCompatParcelizer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ContinuationImpl continuationImpl) {
        androidx.compose.ui.platform.InfiniteAnimationPolicy infiniteAnimationPolicy = (androidx.compose.ui.platform.InfiniteAnimationPolicy) continuationImpl.getContext().get(androidx.compose.ui.platform.InfiniteAnimationPolicy.Key);
        return infiniteAnimationPolicy == null ? TextStreamsKt.read(continuationImpl.getContext()).withFrameNanos(r8lambdaunavo3sxub_pc9xroryotnrlvsm, continuationImpl) : infiniteAnimationPolicy.onInfiniteOperation(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(0, null, r8lambdaunavo3sxub_pc9xroryotnrlvsm), continuationImpl);
    }
}
