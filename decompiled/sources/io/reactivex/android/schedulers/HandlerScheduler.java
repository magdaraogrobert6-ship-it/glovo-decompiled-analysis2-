package io.reactivex.android.schedulers;

import android.os.Handler;
import android.os.Message;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class HandlerScheduler extends Scheduler {
    public final boolean RemoteActionCompatParcelizer;
    public final Handler serializer;

    public static final class HandlerWorker extends Scheduler.Worker {
        public final boolean IconCompatParcelizer;
        public final Handler RemoteActionCompatParcelizer;
        public volatile boolean serializer;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.serializer = true;
            this.RemoteActionCompatParcelizer.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.serializer;
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable read(Runnable runnable, long j, TimeUnit timeUnit) {
            if (timeUnit == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("unit == null");
                return null;
            }
            if (this.serializer) {
                return EmptyDisposable.INSTANCE;
            }
            Handler handler = this.RemoteActionCompatParcelizer;
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(handler, runnable);
            Message messageObtain = Message.obtain(handler, scheduledRunnable);
            messageObtain.obj = this;
            if (this.IconCompatParcelizer) {
                messageObtain.setAsynchronous(true);
            }
            this.RemoteActionCompatParcelizer.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
            if (!this.serializer) {
                return scheduledRunnable;
            }
            this.RemoteActionCompatParcelizer.removeCallbacks(scheduledRunnable);
            return EmptyDisposable.INSTANCE;
        }

        public HandlerWorker(Handler handler, boolean z) {
            this.RemoteActionCompatParcelizer = handler;
            this.IconCompatParcelizer = z;
        }
    }

    public static final class ScheduledRunnable implements Runnable, Disposable {
        public final Handler IconCompatParcelizer;
        public final Runnable read;
        public volatile boolean serializer;

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.serializer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.IconCompatParcelizer.removeCallbacks(this);
            this.serializer = true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.read.run();
            } catch (Throwable th) {
                RxJavaPlugins.IconCompatParcelizer(th);
            }
        }

        public ScheduledRunnable(Handler handler, Runnable runnable) {
            this.IconCompatParcelizer = handler;
            this.read = runnable;
        }
    }

    @Override // io.reactivex.Scheduler
    public final Scheduler.Worker write() {
        return new HandlerWorker(this.serializer, this.RemoteActionCompatParcelizer);
    }

    public HandlerScheduler(Handler handler, boolean z) {
        this.serializer = handler;
        this.RemoteActionCompatParcelizer = z;
    }

    @Override // io.reactivex.Scheduler
    public final Disposable read(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("run == null");
            return null;
        }
        if (timeUnit != null) {
            Handler handler = this.serializer;
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(handler, runnable);
            Message messageObtain = Message.obtain(handler, scheduledRunnable);
            if (this.RemoteActionCompatParcelizer) {
                messageObtain.setAsynchronous(true);
            }
            handler.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
            return scheduledRunnable;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("unit == null");
        return null;
    }
}
