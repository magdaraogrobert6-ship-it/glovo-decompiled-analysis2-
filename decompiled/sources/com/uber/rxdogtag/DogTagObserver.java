package com.uber.rxdogtag;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.LambdaConsumerIntrospection;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class DogTagObserver<T> implements Observer<T>, LambdaConsumerIntrospection {
    private final RxDogTag.Configuration config;
    private final Observer<T> delegate;
    private final Throwable t = new Throwable();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onComplete$6(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onComplete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$4(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onError");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$5(Throwable th) {
        this.delegate.onError(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNext$2(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onNext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNext$3(Object obj) {
        this.delegate.onNext(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$0(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onSubscribe");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$1(Disposable disposable) {
        this.delegate.onSubscribe(disposable);
    }

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        Observer<T> observer = this.delegate;
        return (observer instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) observer).hasCustomOnError();
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (!this.config.guardObserverCallbacks) {
            this.delegate.onComplete();
            return;
        }
        DogTagObserver$$ExternalSyntheticLambda0 dogTagObserver$$ExternalSyntheticLambda0 = new DogTagObserver$$ExternalSyntheticLambda0(this, 3);
        Observer<T> observer = this.delegate;
        Objects.requireNonNull(observer);
        RxDogTag.guardedDelegateCall(dogTagObserver$$ExternalSyntheticLambda0, new DogTagObserver$$ExternalSyntheticLambda7(0, observer));
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        Observer<T> observer = this.delegate;
        boolean z = observer instanceof RxDogTagErrorReceiver;
        RxDogTag.Configuration configuration = this.config;
        if (!z) {
            RxDogTag.reportError(configuration, this.t, th, null);
            return;
        }
        if (observer instanceof RxDogTagTaggedExceptionReceiver) {
            observer.onError(RxDogTag.createException(configuration, this.t, th, null));
        } else if (!configuration.guardObserverCallbacks) {
            observer.onError(th);
        } else {
            int i = 0;
            RxDogTag.guardedDelegateCall(new DogTagObserver$$ExternalSyntheticLambda0(this, i), new DogTagObserver$$ExternalSyntheticLambda1(this, th, i));
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new DogTagObserver$$ExternalSyntheticLambda0(this, 1), new DogTagObserver$$ExternalSyntheticLambda1(this, t, 5));
        } else {
            this.delegate.onNext(t);
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new DogTagObserver$$ExternalSyntheticLambda0(this, 2), new DogTagObserver$$ExternalSyntheticLambda1(this, disposable, 6));
        } else {
            this.delegate.onSubscribe(disposable);
        }
    }

    public DogTagObserver(RxDogTag.Configuration configuration, Observer<T> observer) {
        this.config = configuration;
        this.delegate = observer;
    }
}
