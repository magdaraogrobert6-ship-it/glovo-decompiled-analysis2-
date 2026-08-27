package io.reactivex.plugins;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import com.uber.rxdogtag.RxDogTag$$ExternalSyntheticLambda0;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RxJavaPlugins {
    public static volatile RxDogTag$$ExternalSyntheticLambda0 IconCompatParcelizer;
    public static volatile RxDogTag$$ExternalSyntheticLambda0 MediaDescriptionCompat;
    public static volatile OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 MediaMetadataCompat;
    public static volatile RxDogTag$$ExternalSyntheticLambda0 MediaSessionCompatQueueItem;
    public static volatile RxDogTag$$ExternalSyntheticLambda0 RatingCompat;
    public static volatile OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 RemoteActionCompatParcelizer;
    public static volatile OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 read;
    public static volatile RxDogTag$$ExternalSyntheticLambda0 serializer;
    public static volatile OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 write;

    public static Scheduler write(Callable callable) {
        try {
            Object objCall = callable.call();
            ObjectHelper.write(objCall, "Scheduler Callable result can't be null");
            return (Scheduler) objCall;
        } catch (Throwable th) {
            throw ExceptionHelper.write(th);
        }
    }

    public static void IconCompatParcelizer(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            th = new UndeliverableException(th);
        }
        th.printStackTrace();
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
