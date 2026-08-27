package kotlinx.coroutines;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.TextAnnouncementContentCardView;
import o.createCloseInAppMessageClickListenerlambda0;
import o.getOpeningAnimation;

/* JADX INFO: loaded from: classes4.dex */
public class DeferredCoroutine extends createCloseInAppMessageClickListenerlambda0 implements getOpeningAnimation {
    @Override // o.getOpeningAnimation
    public final Object await(ContinuationImpl continuationImpl) {
        Object objAwaitInternal = awaitInternal(continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objAwaitInternal;
    }

    public DeferredCoroutine(TextAnnouncementContentCardView textAnnouncementContentCardView, boolean z, boolean z2) {
        super(textAnnouncementContentCardView, z, z2);
    }
}
