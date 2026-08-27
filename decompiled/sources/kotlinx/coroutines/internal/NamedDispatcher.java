package kotlinx.coroutines.internal;

import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DefaultExecutorKt;
import o.TextAnnouncementContentCardView;
import o.isAnimatingClose;
import o.setAndStartAnimation;

/* JADX INFO: loaded from: classes4.dex */
public final class NamedDispatcher extends CoroutineDispatcher implements isAnimatingClose {
    public final String IconCompatParcelizer;
    public final CoroutineDispatcher RemoteActionCompatParcelizer;
    public final /* synthetic */ isAnimatingClose serializer;

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        this.RemoteActionCompatParcelizer.dispatch(textAnnouncementContentCardView, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        this.RemoteActionCompatParcelizer.dispatchYield(textAnnouncementContentCardView, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return this.RemoteActionCompatParcelizer.isDispatchNeeded(textAnnouncementContentCardView);
    }

    @Override // o.isAnimatingClose
    public final void serializer(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        this.serializer.serializer(j, cancellableContinuationImpl);
    }

    @Override // o.isAnimatingClose
    public final setAndStartAnimation write(long j, Runnable runnable, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return this.serializer.write(j, runnable, textAnnouncementContentCardView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NamedDispatcher(CoroutineDispatcher coroutineDispatcher, String str) {
        isAnimatingClose isanimatingclose = coroutineDispatcher instanceof isAnimatingClose ? (isAnimatingClose) coroutineDispatcher : null;
        this.serializer = isanimatingclose == null ? DefaultExecutorKt.write : isanimatingclose;
        this.RemoteActionCompatParcelizer = coroutineDispatcher;
        this.IconCompatParcelizer = str;
    }
}
