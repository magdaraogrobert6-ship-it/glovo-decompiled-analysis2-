package kotlinx.coroutines;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getClosingAnimation;
import o.getOpeningAnimation;

/* JADX INFO: loaded from: classes4.dex */
public final class CompletableDeferredImpl extends JobSupport implements getOpeningAnimation {
    public final boolean IconCompatParcelizer(Throwable th) {
        return MediaSessionCompatQueueItem(new getClosingAnimation(th, false));
    }

    @Override // o.getOpeningAnimation
    public final Object await(ContinuationImpl continuationImpl) {
        Object objAwaitInternal = awaitInternal(continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objAwaitInternal;
    }

    public CompletableDeferredImpl(boolean z) {
        super(z);
    }
}
