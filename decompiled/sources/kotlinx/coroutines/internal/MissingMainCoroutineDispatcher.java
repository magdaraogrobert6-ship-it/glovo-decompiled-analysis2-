package kotlinx.coroutines.internal;

import bo.app.m1$$ExternalSyntheticOutline0;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.TextAnnouncementContentCardView;
import o.isAnimatingClose;
import o.setAndStartAnimation;

/* JADX INFO: loaded from: classes4.dex */
final class MissingMainCoroutineDispatcher extends MainCoroutineDispatcher implements isAnimatingClose {
    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public final MainCoroutineDispatcher IconCompatParcelizer() {
        return this;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        serializer();
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        serializer();
        throw null;
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i, String str) {
        serializer();
        throw null;
    }

    public final void serializer() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @Override // o.isAnimatingClose
    public final void serializer(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        serializer();
        throw null;
    }

    @Override // o.isAnimatingClose
    public final setAndStartAnimation write(long j, Runnable runnable, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        serializer();
        throw null;
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return m1$$ExternalSyntheticOutline0.m(']', "Dispatchers.Main[missing", "");
    }
}
