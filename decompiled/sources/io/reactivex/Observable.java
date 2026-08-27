package io.reactivex;

import com.uber.rxdogtag.RxDogTag$$ExternalSyntheticLambda0;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.flowable.FlowableFromObservable;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureError;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.internal.operators.observable.ObservableJust;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Observable<T> implements ObservableSource<T> {
    public abstract void read(Observer observer);

    public static ObservableJust read(Object obj) {
        ObjectHelper.write(obj, "item is null");
        return new ObservableJust(obj);
    }

    public final Flowable serializer(BackpressureStrategy backpressureStrategy) {
        FlowableFromObservable flowableFromObservable = new FlowableFromObservable(this);
        int i = AnonymousClass1.read[backpressureStrategy.ordinal()];
        if (i == 1) {
            return new FlowableOnBackpressureDrop(flowableFromObservable);
        }
        if (i == 2) {
            return new FlowableOnBackpressureLatest(flowableFromObservable);
        }
        if (i == 3) {
            return flowableFromObservable;
        }
        if (i == 4) {
            return new FlowableOnBackpressureError(flowableFromObservable);
        }
        int i2 = Flowable.write;
        ObjectHelper.serializer(i2, "capacity");
        return new FlowableOnBackpressureBuffer(flowableFromObservable, i2);
    }

    /* JADX INFO: renamed from: io.reactivex.Observable$1, reason: invalid class name */
    public static abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            read = iArr;
            try {
                iArr[BackpressureStrategy.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                read[BackpressureStrategy.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                read[BackpressureStrategy.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                read[BackpressureStrategy.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // io.reactivex.ObservableSource
    public final void subscribe(Observer<? super T> observer) {
        ObjectHelper.write(observer, "observer is null");
        try {
            RxDogTag$$ExternalSyntheticLambda0 rxDogTag$$ExternalSyntheticLambda0 = RxJavaPlugins.RatingCompat;
            if (rxDogTag$$ExternalSyntheticLambda0 != null) {
                try {
                    observer = (Observer) rxDogTag$$ExternalSyntheticLambda0.apply(this, observer);
                } catch (Throwable th) {
                    throw ExceptionHelper.write(th);
                }
            }
            ObjectHelper.write(observer, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            read((Observer) observer);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            Exceptions.read(th2);
            RxJavaPlugins.IconCompatParcelizer(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final ObservableObserveOn RemoteActionCompatParcelizer(Scheduler scheduler) {
        int i = Flowable.write;
        ObjectHelper.serializer(i, "bufferSize");
        return new ObservableObserveOn(this, scheduler, i);
    }

    public final Disposable subscribe(Consumer<? super T> consumer) {
        return subscribe(consumer, Functions.RemoteActionCompatParcelizer, Functions.read, Functions.serializer);
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return subscribe(consumer, consumer2, Functions.read, Functions.serializer);
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        return subscribe(consumer, consumer2, action, Functions.serializer);
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super Disposable> consumer3) {
        ObjectHelper.write(consumer, "onNext is null");
        ObjectHelper.write(consumer2, "onError is null");
        ObjectHelper.write(action, "onComplete is null");
        ObjectHelper.write(consumer3, "onSubscribe is null");
        LambdaObserver lambdaObserver = new LambdaObserver(consumer, consumer2, action, consumer3);
        subscribe(lambdaObserver);
        return lambdaObserver;
    }

    public final Disposable subscribe() {
        Consumer<? super Throwable> consumer = Functions.RemoteActionCompatParcelizer;
        Action action = Functions.read;
        Consumer<? super T> consumer2 = Functions.serializer;
        return subscribe(consumer2, consumer, action, consumer2);
    }
}
