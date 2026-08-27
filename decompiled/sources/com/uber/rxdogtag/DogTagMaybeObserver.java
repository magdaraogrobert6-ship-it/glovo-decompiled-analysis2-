package com.uber.rxdogtag;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.LambdaConsumerIntrospection;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class DogTagMaybeObserver<T> implements MaybeObserver<T>, LambdaConsumerIntrospection {
    private final RxDogTag.Configuration config;
    private final MaybeObserver<T> delegate;
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
    public /* synthetic */ void lambda$onSubscribe$0(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onSubscribe");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$1(Disposable disposable) {
        this.delegate.onSubscribe(disposable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSuccess$2(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onSuccess");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSuccess$3(Object obj) {
        this.delegate.onSuccess(obj);
    }

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        MaybeObserver<T> maybeObserver = this.delegate;
        return (maybeObserver instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) maybeObserver).hasCustomOnError();
    }

    @Override // io.reactivex.MaybeObserver
    public void onComplete() {
        if (!this.config.guardObserverCallbacks) {
            this.delegate.onComplete();
            return;
        }
        int i = 1;
        DogTagMaybeObserver$$ExternalSyntheticLambda0 dogTagMaybeObserver$$ExternalSyntheticLambda0 = new DogTagMaybeObserver$$ExternalSyntheticLambda0(this, i);
        MaybeObserver<T> maybeObserver = this.delegate;
        Objects.requireNonNull(maybeObserver);
        RxDogTag.guardedDelegateCall(dogTagMaybeObserver$$ExternalSyntheticLambda0, new DogTagObserver$$ExternalSyntheticLambda7(i, maybeObserver));
    }

    @Override // io.reactivex.MaybeObserver
    public void onError(Throwable th) {
        MaybeObserver<T> maybeObserver = this.delegate;
        boolean z = maybeObserver instanceof RxDogTagErrorReceiver;
        RxDogTag.Configuration configuration = this.config;
        if (!z) {
            RxDogTag.reportError(configuration, this.t, th, null);
            return;
        }
        if (maybeObserver instanceof RxDogTagTaggedExceptionReceiver) {
            maybeObserver.onError(RxDogTag.createException(configuration, this.t, th, null));
        } else if (configuration.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new DogTagMaybeObserver$$ExternalSyntheticLambda0(this, 3), new DogTagObserver$$ExternalSyntheticLambda1(this, th, 4));
        } else {
            maybeObserver.onError(th);
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onSubscribe(Disposable disposable) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new DogTagMaybeObserver$$ExternalSyntheticLambda0(this, 0), new DogTagObserver$$ExternalSyntheticLambda1(this, disposable, 2));
        } else {
            this.delegate.onSubscribe(disposable);
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T t) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new DogTagMaybeObserver$$ExternalSyntheticLambda0(this, 2), new DogTagObserver$$ExternalSyntheticLambda1(this, t, 3));
        } else {
            this.delegate.onSuccess(t);
        }
    }

    public DogTagMaybeObserver(RxDogTag.Configuration configuration, MaybeObserver<T> maybeObserver) {
        this.config = configuration;
        this.delegate = maybeObserver;
    }
}
