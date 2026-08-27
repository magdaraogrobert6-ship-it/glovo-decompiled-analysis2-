package kotlinx.coroutines.rx2;

import androidx.room.Room;
import androidx.sqlite.SQLite;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImagePainter$launchJob$1;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.sentry.Sentry$$ExternalSyntheticLambda5;
import io.sentry.android.core.AppState$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.internal.ContextScope;
import o.IInAppMessageViewWrapper;
import o.TextAnnouncementContentCardView;
import o.createInAppMessageEventSubscriber;
import o.onBackInvokedlambda0;
import o.r8lambdai3KSD0UoUdgNsNEC4ClvZciqnX0;

/* JADX INFO: loaded from: classes4.dex */
public final class DispatcherScheduler extends Scheduler {
    public static final /* synthetic */ AtomicLongFieldUpdater serializer = AtomicLongFieldUpdater.newUpdater(DispatcherScheduler.class, "workerCounter$volatile");
    public final ContextScope MediaSessionCompatQueueItem;
    public final CoroutineDispatcher RemoteActionCompatParcelizer;
    private volatile /* synthetic */ long workerCounter$volatile;
    public final onBackInvokedlambda0 write;

    public final class DispatcherWorker extends Scheduler.Worker {
        public final CoroutineDispatcher IconCompatParcelizer;
        public final long RemoteActionCompatParcelizer;
        public final onBackInvokedlambda0 read;
        public final ContextScope serializer;
        public final BufferedChannel write;

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return !YieldKt.write(this.serializer);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.IconCompatParcelizer);
            sb.append(" (worker ");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", ");
            return ff$$ExternalSyntheticOutline0.m(sb, isDisposed() ? "disposed" : "active", ')');
        }

        public DispatcherWorker(long j, CoroutineDispatcher coroutineDispatcher, onBackInvokedlambda0 onbackinvokedlambda0) {
            this.RemoteActionCompatParcelizer = j;
            this.IconCompatParcelizer = coroutineDispatcher;
            onBackInvokedlambda0 onbackinvokedlambda1 = new onBackInvokedlambda0(onbackinvokedlambda0);
            this.read = onbackinvokedlambda1;
            ContextScope contextScopeRemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda1, coroutineDispatcher));
            this.serializer = contextScopeRemoteActionCompatParcelizer;
            this.write = SQLite.IconCompatParcelizer(Integer.MAX_VALUE, 6, (IInAppMessageViewWrapper) null);
            BuildersKt.RemoteActionCompatParcelizer(contextScopeRemoteActionCompatParcelizer, null, null, new AsyncImagePainter$launchJob$1(this, null, 29), 3);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.write.IconCompatParcelizer((Throwable) null);
            this.read.write((CancellationException) null);
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable read(Runnable runnable, long j, TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j);
            ContextScope contextScope = this.serializer;
            TextAnnouncementContentCardView textAnnouncementContentCardView = contextScope.serializer;
            createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
            Disposable disposableRemoteActionCompatParcelizer = Disposables.RemoteActionCompatParcelizer(new Sentry$$ExternalSyntheticLambda5(19, createinappmessageeventsubscriber));
            AppState$$ExternalSyntheticLambda0 appState$$ExternalSyntheticLambda0 = new AppState$$ExternalSyntheticLambda0(this, 10, new r8lambdai3KSD0UoUdgNsNEC4ClvZciqnX0(disposableRemoteActionCompatParcelizer, textAnnouncementContentCardView, runnable));
            if (!YieldKt.write(contextScope)) {
                return EmptyDisposable.INSTANCE;
            }
            if (millis <= 0) {
                appState$$ExternalSyntheticLambda0.run();
                return disposableRemoteActionCompatParcelizer;
            }
            createinappmessageeventsubscriber.IconCompatParcelizer = DelayKt.serializer(textAnnouncementContentCardView).write(millis, appState$$ExternalSyntheticLambda0, textAnnouncementContentCardView);
            return disposableRemoteActionCompatParcelizer;
        }
    }

    public final String toString() {
        return this.RemoteActionCompatParcelizer.toString();
    }

    @Override // io.reactivex.Scheduler
    public final Scheduler.Worker write() {
        return new DispatcherWorker(serializer.getAndIncrement(this), this.RemoteActionCompatParcelizer, this.write);
    }

    public DispatcherScheduler(CoroutineDispatcher coroutineDispatcher) {
        this.RemoteActionCompatParcelizer = coroutineDispatcher;
        onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
        this.write = onbackinvokedlambda0Serializer;
        this.MediaSessionCompatQueueItem = YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0Serializer, coroutineDispatcher));
        this.workerCounter$volatile = 1L;
    }

    @Override // io.reactivex.Scheduler
    public final Disposable read(Runnable runnable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        ContextScope contextScope = this.MediaSessionCompatQueueItem;
        TextAnnouncementContentCardView textAnnouncementContentCardView = contextScope.serializer;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        Disposable disposableRemoteActionCompatParcelizer = Disposables.RemoteActionCompatParcelizer(new Sentry$$ExternalSyntheticLambda5(19, createinappmessageeventsubscriber));
        ObjectHelper.write(runnable, "run is null");
        AppState$$ExternalSyntheticLambda0 appState$$ExternalSyntheticLambda0 = new AppState$$ExternalSyntheticLambda0(this, 9, new r8lambdai3KSD0UoUdgNsNEC4ClvZciqnX0(disposableRemoteActionCompatParcelizer, textAnnouncementContentCardView, runnable));
        if (!YieldKt.write(contextScope)) {
            return EmptyDisposable.INSTANCE;
        }
        if (millis <= 0) {
            appState$$ExternalSyntheticLambda0.run();
            return disposableRemoteActionCompatParcelizer;
        }
        createinappmessageeventsubscriber.IconCompatParcelizer = DelayKt.serializer(textAnnouncementContentCardView).write(millis, appState$$ExternalSyntheticLambda0, textAnnouncementContentCardView);
        return disposableRemoteActionCompatParcelizer;
    }
}
