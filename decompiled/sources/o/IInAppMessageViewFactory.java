package o;

import android.os.Handler;
import android.os.Looper;
import io.sentry.android.core.AppState$$ExternalSyntheticLambda0;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes4.dex */
public final class IInAppMessageViewFactory extends MainCoroutineDispatcher implements isAnimatingClose {
    public final boolean IconCompatParcelizer;
    public final Handler RemoteActionCompatParcelizer;
    public final IInAppMessageViewFactory serializer;
    public final String write;

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public final MainCoroutineDispatcher IconCompatParcelizer() {
        return this.serializer;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        if (this.RemoteActionCompatParcelizer.post(runnable)) {
            return;
        }
        serializer(textAnnouncementContentCardView, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.RemoteActionCompatParcelizer) ^ (this.IconCompatParcelizer ? 1231 : 1237);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        MainCoroutineDispatcher mainCoroutineDispatcherIconCompatParcelizer;
        String str;
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.read;
        if (this == mainCoroutineDispatcher) {
            str = "Dispatchers.Main";
        } else {
            try {
                mainCoroutineDispatcherIconCompatParcelizer = mainCoroutineDispatcher.IconCompatParcelizer();
            } catch (UnsupportedOperationException unused) {
                mainCoroutineDispatcherIconCompatParcelizer = null;
            }
            str = this == mainCoroutineDispatcherIconCompatParcelizer ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.write;
        if (string == null) {
            string = this.RemoteActionCompatParcelizer.toString();
        }
        return this.IconCompatParcelizer ? r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(string, ".immediate") : string;
    }

    public IInAppMessageViewFactory(Handler handler, String str, boolean z) {
        this.RemoteActionCompatParcelizer = handler;
        this.write = str;
        this.IconCompatParcelizer = z;
        this.serializer = z ? this : new IInAppMessageViewFactory(handler, str, true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof IInAppMessageViewFactory)) {
            return false;
        }
        IInAppMessageViewFactory iInAppMessageViewFactory = (IInAppMessageViewFactory) obj;
        return iInAppMessageViewFactory.RemoteActionCompatParcelizer == this.RemoteActionCompatParcelizer && iInAppMessageViewFactory.IconCompatParcelizer == this.IconCompatParcelizer;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        if (!this.IconCompatParcelizer) {
            return true;
        }
        return !((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{Looper.myLooper(), this.RemoteActionCompatParcelizer.getLooper()}, getCieXyz.write())).booleanValue();
    }

    @Override // o.isAnimatingClose
    public final void serializer(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        AppState$$ExternalSyntheticLambda0 appState$$ExternalSyntheticLambda0 = new AppState$$ExternalSyntheticLambda0(cancellableContinuationImpl, 8, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.RemoteActionCompatParcelizer.postDelayed(appState$$ExternalSyntheticLambda0, j)) {
            cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new IInAppMessageViewWrapperFactory(this, 0, appState$$ExternalSyntheticLambda0));
        } else {
            serializer(cancellableContinuationImpl.MediaBrowserCompatMediaItem, appState$$ExternalSyntheticLambda0);
        }
    }

    public final void serializer(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        JobKt.serializer(textAnnouncementContentCardView, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        DefaultIoScheduler.RemoteActionCompatParcelizer.dispatch(textAnnouncementContentCardView, runnable);
    }

    @Override // o.isAnimatingClose
    public final setAndStartAnimation write(long j, final Runnable runnable, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.RemoteActionCompatParcelizer.postDelayed(runnable, j)) {
            return new setAndStartAnimation() { // from class: o.createInAppMessageView
                @Override // o.setAndStartAnimation
                public final void RemoteActionCompatParcelizer() {
                    this.read.RemoteActionCompatParcelizer.removeCallbacks(runnable);
                }
            };
        }
        serializer(textAnnouncementContentCardView, runnable);
        return onDismiss.serializer;
    }

    public IInAppMessageViewFactory(Handler handler) {
        this(handler, null, false);
    }
}
