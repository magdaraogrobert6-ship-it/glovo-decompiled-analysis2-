package io.reactivex.schedulers;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import io.reactivex.Scheduler;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.schedulers.ComputationScheduler;
import io.reactivex.internal.schedulers.IoScheduler;
import io.reactivex.internal.schedulers.NewThreadScheduler;
import io.reactivex.internal.schedulers.SingleScheduler;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Schedulers {
    public static final Scheduler IconCompatParcelizer;
    public static final Scheduler RemoteActionCompatParcelizer;
    public static final Scheduler serializer = RxJavaPlugins.write(new SingleTask());

    public static final abstract class ComputationHolder {
        public static final ComputationScheduler read = new ComputationScheduler();
    }

    public static final class ComputationTask implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        public final Scheduler call() {
            return ComputationHolder.read;
        }
    }

    public static final class IOTask implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        public final Scheduler call() {
            return IoHolder.IconCompatParcelizer;
        }
    }

    public static final abstract class IoHolder {
        public static final IoScheduler IconCompatParcelizer = new IoScheduler();
    }

    public static final abstract class NewThreadHolder {
        public static final NewThreadScheduler serializer = new NewThreadScheduler();
    }

    public static final class NewThreadTask implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        public final Scheduler call() {
            return NewThreadHolder.serializer;
        }
    }

    public static final abstract class SingleHolder {
        public static final SingleScheduler IconCompatParcelizer = new SingleScheduler();
    }

    public static final class SingleTask implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        public final Scheduler call() {
            return SingleHolder.IconCompatParcelizer;
        }
    }

    static {
        Scheduler schedulerWrite;
        Scheduler schedulerWrite2;
        ComputationTask computationTask = new ComputationTask();
        OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 = RxJavaPlugins.read;
        if (onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 == null) {
            schedulerWrite = RxJavaPlugins.write(computationTask);
        } else {
            try {
                Object objApply = onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.apply(computationTask);
                ObjectHelper.write(objApply, "Scheduler Callable result can't be null");
                schedulerWrite = (Scheduler) objApply;
            } catch (Throwable th) {
                throw ExceptionHelper.write(th);
            }
        }
        RemoteActionCompatParcelizer = schedulerWrite;
        IOTask iOTask = new IOTask();
        OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda1 = RxJavaPlugins.RemoteActionCompatParcelizer;
        if (onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda1 == null) {
            schedulerWrite2 = RxJavaPlugins.write(iOTask);
        } else {
            try {
                Object objApply2 = onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda1.apply(iOTask);
                ObjectHelper.write(objApply2, "Scheduler Callable result can't be null");
                schedulerWrite2 = (Scheduler) objApply2;
            } catch (Throwable th2) {
                throw ExceptionHelper.write(th2);
            }
        }
        IconCompatParcelizer = schedulerWrite2;
        int i = TrampolineScheduler.RemoteActionCompatParcelizer;
        RxJavaPlugins.write(new NewThreadTask());
    }
}
