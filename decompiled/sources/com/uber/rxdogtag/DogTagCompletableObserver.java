package com.uber.rxdogtag;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.LambdaConsumerIntrospection;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class DogTagCompletableObserver implements CompletableObserver, LambdaConsumerIntrospection {
    private final RxDogTag.Configuration config;
    private final CompletableObserver delegate;
    private final Throwable t = new Throwable();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onComplete$4(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onComplete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$2(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onError");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$3(Throwable th) {
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

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        CompletableObserver completableObserver = this.delegate;
        return (completableObserver instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) completableObserver).hasCustomOnError();
    }

    @Override // io.reactivex.CompletableObserver
    public void onComplete() {
        if (!this.config.guardObserverCallbacks) {
            this.delegate.onComplete();
            return;
        }
        DogTagCompletableObserver$$ExternalSyntheticLambda0 dogTagCompletableObserver$$ExternalSyntheticLambda0 = new DogTagCompletableObserver$$ExternalSyntheticLambda0(this, 0);
        final CompletableObserver completableObserver = this.delegate;
        Objects.requireNonNull(completableObserver);
        RxDogTag.guardedDelegateCall(dogTagCompletableObserver$$ExternalSyntheticLambda0, new Runnable() { // from class: com.uber.rxdogtag.DogTagCompletableObserver$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                completableObserver.onComplete();
            }
        });
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(Throwable th) {
        CompletableObserver completableObserver = this.delegate;
        boolean z = completableObserver instanceof RxDogTagErrorReceiver;
        RxDogTag.Configuration configuration = this.config;
        if (!z) {
            RxDogTag.reportError(configuration, this.t, th, null);
            return;
        }
        if (completableObserver instanceof RxDogTagTaggedExceptionReceiver) {
            completableObserver.onError(RxDogTag.createException(configuration, this.t, th, null));
        } else if (configuration.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new DogTagSingleObserver$$ExternalSyntheticLambda0(this, 3), new DogTagObserver$$ExternalSyntheticLambda1(this, th, 1));
        } else {
            completableObserver.onError(th);
        }
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(final Disposable disposable) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new DogTagCompletableObserver$$ExternalSyntheticLambda0(this, 1), new Runnable() { // from class: com.uber.rxdogtag.DogTagCompletableObserver$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onSubscribe$1(disposable);
                }
            });
        } else {
            this.delegate.onSubscribe(disposable);
        }
    }

    public DogTagCompletableObserver(RxDogTag.Configuration configuration, CompletableObserver completableObserver) {
        this.config = configuration;
        this.delegate = completableObserver;
    }
}
