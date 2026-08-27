package io.reactivex;

import com.uber.rxdogtag.RxDogTag$$ExternalSyntheticLambda0;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.maybe.MaybeCallbackObserver;
import io.reactivex.internal.operators.maybe.MaybeJust;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Maybe<T> implements MaybeSource<T> {
    public abstract void IconCompatParcelizer(MaybeObserver maybeObserver);

    public static MaybeJust RemoteActionCompatParcelizer(Object obj) {
        ObjectHelper.write(obj, "item is null");
        return new MaybeJust(obj);
    }

    @Override // io.reactivex.MaybeSource
    public final void subscribe(MaybeObserver<? super T> maybeObserver) {
        ObjectHelper.write(maybeObserver, "observer is null");
        RxDogTag$$ExternalSyntheticLambda0 rxDogTag$$ExternalSyntheticLambda0 = RxJavaPlugins.MediaSessionCompatQueueItem;
        if (rxDogTag$$ExternalSyntheticLambda0 != null) {
            try {
                maybeObserver = (MaybeObserver) rxDogTag$$ExternalSyntheticLambda0.apply(this, maybeObserver);
            } catch (Throwable th) {
                throw ExceptionHelper.write(th);
            }
        }
        ObjectHelper.write(maybeObserver, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            IconCompatParcelizer(maybeObserver);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            Exceptions.read(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final Disposable subscribe(Consumer<? super T> consumer) {
        return subscribe(consumer, Functions.RemoteActionCompatParcelizer, Functions.read);
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return subscribe(consumer, consumer2, Functions.read);
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        ObjectHelper.write(consumer, "onSuccess is null");
        ObjectHelper.write(consumer2, "onError is null");
        ObjectHelper.write(action, "onComplete is null");
        MaybeCallbackObserver maybeCallbackObserver = new MaybeCallbackObserver(consumer, consumer2, action);
        subscribe(maybeCallbackObserver);
        return maybeCallbackObserver;
    }

    public final Disposable subscribe() {
        return subscribe(Functions.serializer, Functions.RemoteActionCompatParcelizer, Functions.read);
    }
}
