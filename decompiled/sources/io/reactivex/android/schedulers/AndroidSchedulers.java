package io.reactivex.android.schedulers;

import android.os.Handler;
import android.os.Looper;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.reactivex.Scheduler;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.exceptions.Exceptions;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AndroidSchedulers {
    public static final Scheduler serializer;

    public static final abstract class MainHolder {
        public static final Scheduler write = new HandlerScheduler(new Handler(Looper.getMainLooper()), false);
    }

    static {
        Scheduler scheduler;
        Callable<Scheduler> callable = new Callable<Scheduler>() { // from class: io.reactivex.android.schedulers.AndroidSchedulers.1
            @Override // java.util.concurrent.Callable
            public final Scheduler call() {
                return MainHolder.write;
            }
        };
        ScreenStartObserver$$ExternalSyntheticLambda0 screenStartObserver$$ExternalSyntheticLambda0 = RxAndroidPlugins.read;
        if (screenStartObserver$$ExternalSyntheticLambda0 == null) {
            try {
                scheduler = MainHolder.write;
                if (scheduler == null) {
                    throw new NullPointerException("Scheduler Callable returned null");
                }
            } catch (Throwable th) {
                Exceptions.IconCompatParcelizer(th);
                throw null;
            }
        } else {
            try {
                scheduler = (Scheduler) screenStartObserver$$ExternalSyntheticLambda0.apply(callable);
            } catch (Throwable th2) {
                Exceptions.IconCompatParcelizer(th2);
                throw null;
            }
        }
        serializer = scheduler;
    }

    public static Scheduler serializer(Looper looper) {
        if (looper != null) {
            return new HandlerScheduler(new Handler(looper), true);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("looper == null");
        return null;
    }

    public static Scheduler RemoteActionCompatParcelizer() {
        Scheduler scheduler = serializer;
        if (scheduler != null) {
            return scheduler;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("scheduler == null");
        return null;
    }
}
