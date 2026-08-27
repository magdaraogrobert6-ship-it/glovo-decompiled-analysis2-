package o;

import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes5.dex */
public final class isActivitySet extends MainCoroutineDispatcher implements isAnimatingClose {
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer;
    public final setCustomControlInAppMessageManagerListener serializer = new setCustomControlInAppMessageManagerListener();

    public final CoroutineDispatcher read() {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) this.serializer.IconCompatParcelizer();
        return coroutineDispatcher == null ? (CoroutineDispatcher) this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper() : coroutineDispatcher;
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public final MainCoroutineDispatcher IconCompatParcelizer() {
        MainCoroutineDispatcher mainCoroutineDispatcherIconCompatParcelizer;
        CoroutineDispatcher coroutineDispatcher = read();
        MainCoroutineDispatcher mainCoroutineDispatcher = coroutineDispatcher instanceof MainCoroutineDispatcher ? (MainCoroutineDispatcher) coroutineDispatcher : null;
        return (mainCoroutineDispatcher == null || (mainCoroutineDispatcherIconCompatParcelizer = mainCoroutineDispatcher.IconCompatParcelizer()) == null) ? this : mainCoroutineDispatcherIconCompatParcelizer;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        read().dispatch(textAnnouncementContentCardView, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        read().dispatchYield(textAnnouncementContentCardView, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return read().isDispatchNeeded(textAnnouncementContentCardView);
    }

    @Override // o.isAnimatingClose
    public final void serializer(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder = read();
        isAnimatingClose isanimatingclose = shortNewsContentCardViewViewHolder instanceof isAnimatingClose ? (isAnimatingClose) shortNewsContentCardViewViewHolder : null;
        if (isanimatingclose == null) {
            isanimatingclose = DefaultExecutorKt.write;
        }
        isanimatingclose.serializer(j, cancellableContinuationImpl);
    }

    @Override // o.isAnimatingClose
    public final setAndStartAnimation write(long j, Runnable runnable, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder = read();
        isAnimatingClose isanimatingclose = shortNewsContentCardViewViewHolder instanceof isAnimatingClose ? (isAnimatingClose) shortNewsContentCardViewViewHolder : null;
        if (isanimatingclose == null) {
            isanimatingclose = DefaultExecutorKt.write;
        }
        return isanimatingclose.write(j, runnable, textAnnouncementContentCardView);
    }

    public isActivitySet(SealedClassSerializer$$ExternalSyntheticLambda0 sealedClassSerializer$$ExternalSyntheticLambda0) {
        this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(sealedClassSerializer$$ExternalSyntheticLambda0);
    }
}
