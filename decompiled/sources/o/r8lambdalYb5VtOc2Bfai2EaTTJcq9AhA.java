package o;

import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.rx2.RxAwaitKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdalYb5VtOc2Bfai2EaTTJcq9AhA extends CoroutineDispatcher implements isAnimatingClose {
    public final Scheduler serializer;

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        this.serializer.read(runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.serializer);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return this.serializer.toString();
    }

    @Override // o.isAnimatingClose
    public final setAndStartAnimation write(long j, Runnable runnable, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        final Disposable disposable = this.serializer.read(runnable, j, TimeUnit.MILLISECONDS);
        return new setAndStartAnimation() { // from class: o.r8lambdaq4hsuOf_Otz6RQgex_XS9kaXF6Q
            @Override // o.setAndStartAnimation
            public final void RemoteActionCompatParcelizer() {
                disposable.dispose();
            }
        };
    }

    public r8lambdalYb5VtOc2Bfai2EaTTJcq9AhA(Scheduler scheduler) {
        this.serializer = scheduler;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof r8lambdalYb5VtOc2Bfai2EaTTJcq9AhA) && ((r8lambdalYb5VtOc2Bfai2EaTTJcq9AhA) obj).serializer == this.serializer;
    }

    @Override // o.isAnimatingClose
    public final void serializer(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        RxAwaitKt.serializer(cancellableContinuationImpl, this.serializer.read(new Scopes$$ExternalSyntheticLambda0(cancellableContinuationImpl, 29, this), j, TimeUnit.MILLISECONDS));
    }
}
