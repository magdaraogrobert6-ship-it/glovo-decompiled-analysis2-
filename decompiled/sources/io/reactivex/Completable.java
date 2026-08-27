package io.reactivex;

import com.uber.rxdogtag.RxDogTag$$ExternalSyntheticLambda0;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToMaybe;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.internal.observers.EmptyCompletableObserver;
import io.reactivex.internal.operators.completable.CompletablePeek;
import io.reactivex.internal.operators.maybe.MaybeFromCompletable;
import io.reactivex.internal.operators.maybe.MaybeIsEmptySingle;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Completable implements CompletableSource {
    public abstract void serializer(CompletableObserver completableObserver);

    public final CompletablePeek serializer(Action action) {
        return new CompletablePeek(this, Functions.serializer, action);
    }

    @Override // io.reactivex.CompletableSource
    public final void subscribe(CompletableObserver completableObserver) {
        ObjectHelper.write(completableObserver, "observer is null");
        try {
            RxDogTag$$ExternalSyntheticLambda0 rxDogTag$$ExternalSyntheticLambda0 = RxJavaPlugins.serializer;
            if (rxDogTag$$ExternalSyntheticLambda0 != null) {
                try {
                    completableObserver = (CompletableObserver) rxDogTag$$ExternalSyntheticLambda0.apply(this, completableObserver);
                } catch (Throwable th) {
                    throw ExceptionHelper.write(th);
                }
            }
            ObjectHelper.write(completableObserver, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            serializer(completableObserver);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            Exceptions.read(th2);
            RxJavaPlugins.IconCompatParcelizer(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Maybe serializer() {
        return this instanceof FuseToMaybe ? ((MaybeIsEmptySingle) ((FuseToMaybe) this)).serializer() : new MaybeFromCompletable(this);
    }

    public final Disposable subscribe() {
        EmptyCompletableObserver emptyCompletableObserver = new EmptyCompletableObserver();
        subscribe(emptyCompletableObserver);
        return emptyCompletableObserver;
    }

    public final Disposable subscribe(Action action, Consumer<? super Throwable> consumer) {
        ObjectHelper.write(consumer, "onError is null");
        ObjectHelper.write(action, "onComplete is null");
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(action, consumer);
        subscribe(callbackCompletableObserver);
        return callbackCompletableObserver;
    }

    public final Disposable subscribe(Action action) {
        ObjectHelper.write(action, "onComplete is null");
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(action);
        subscribe(callbackCompletableObserver);
        return callbackCompletableObserver;
    }
}
