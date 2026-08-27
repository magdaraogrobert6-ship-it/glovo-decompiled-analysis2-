package io.reactivex;

import com.uber.rxdogtag.RxDogTag$$ExternalSyntheticLambda0;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BiConsumerSingleObserver;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.single.SingleJust;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Single<T> implements SingleSource<T> {
    public abstract void IconCompatParcelizer(SingleObserver singleObserver);

    public static SingleJust serializer(Object obj) {
        ObjectHelper.write(obj, "item is null");
        return new SingleJust(obj);
    }

    @Override // io.reactivex.SingleSource
    public final void subscribe(SingleObserver<? super T> singleObserver) {
        ObjectHelper.write(singleObserver, "observer is null");
        RxDogTag$$ExternalSyntheticLambda0 rxDogTag$$ExternalSyntheticLambda0 = RxJavaPlugins.MediaDescriptionCompat;
        if (rxDogTag$$ExternalSyntheticLambda0 != null) {
            try {
                singleObserver = (SingleObserver) rxDogTag$$ExternalSyntheticLambda0.apply(this, singleObserver);
            } catch (Throwable th) {
                throw ExceptionHelper.write(th);
            }
        }
        ObjectHelper.write(singleObserver, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            IconCompatParcelizer(singleObserver);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            Exceptions.read(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final SingleSubscribeOn write(Scheduler scheduler) {
        ObjectHelper.write(scheduler, "scheduler is null");
        return new SingleSubscribeOn(this, scheduler);
    }

    public final Disposable subscribe(BiConsumer<? super T, ? super Throwable> biConsumer) {
        ObjectHelper.write(biConsumer, "onCallback is null");
        BiConsumerSingleObserver biConsumerSingleObserver = new BiConsumerSingleObserver();
        subscribe(biConsumerSingleObserver);
        return biConsumerSingleObserver;
    }

    public final Disposable subscribe(Consumer<? super T> consumer) {
        return subscribe(consumer, Functions.RemoteActionCompatParcelizer);
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        ObjectHelper.write(consumer, "onSuccess is null");
        ObjectHelper.write(consumer2, "onError is null");
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(consumer, consumer2);
        subscribe(consumerSingleObserver);
        return consumerSingleObserver;
    }

    public final Disposable subscribe() {
        return subscribe(Functions.serializer, Functions.RemoteActionCompatParcelizer);
    }
}
