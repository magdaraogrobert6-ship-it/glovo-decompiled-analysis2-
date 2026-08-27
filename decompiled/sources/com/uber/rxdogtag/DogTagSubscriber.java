package com.uber.rxdogtag;

import io.reactivex.FlowableSubscriber;
import io.reactivex.observers.LambdaConsumerIntrospection;
import java.util.Objects;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
final class DogTagSubscriber<T> implements FlowableSubscriber<T>, LambdaConsumerIntrospection {
    private final RxDogTag.Configuration config;
    private final FwFClientaddFeatureKeysfeaturesUpdated1 delegate;
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
    public /* synthetic */ void lambda$onSubscribe$1(FwFClientclose11 fwFClientclose11) {
        this.delegate.onSubscribe(fwFClientclose11);
    }

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.delegate;
        return (fwFClientaddFeatureKeysfeaturesUpdated1 instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) fwFClientaddFeatureKeysfeaturesUpdated1).hasCustomOnError();
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public void onComplete() {
        if (!this.config.guardObserverCallbacks) {
            this.delegate.onComplete();
            return;
        }
        DogTagSubscriber$$ExternalSyntheticLambda0 dogTagSubscriber$$ExternalSyntheticLambda0 = new DogTagSubscriber$$ExternalSyntheticLambda0(this, 1);
        FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.delegate;
        Objects.requireNonNull(fwFClientaddFeatureKeysfeaturesUpdated1);
        RxDogTag.guardedDelegateCall(dogTagSubscriber$$ExternalSyntheticLambda0, new DogTagObserver$$ExternalSyntheticLambda7(2, fwFClientaddFeatureKeysfeaturesUpdated1));
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public void onError(Throwable th) {
        FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.delegate;
        boolean z = fwFClientaddFeatureKeysfeaturesUpdated1 instanceof RxDogTagErrorReceiver;
        RxDogTag.Configuration configuration = this.config;
        if (!z) {
            RxDogTag.reportError(configuration, this.t, th, null);
            return;
        }
        if (fwFClientaddFeatureKeysfeaturesUpdated1 instanceof RxDogTagTaggedExceptionReceiver) {
            fwFClientaddFeatureKeysfeaturesUpdated1.onError(RxDogTag.createException(configuration, this.t, th, null));
        } else if (configuration.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new DogTagSubscriber$$ExternalSyntheticLambda0(this, 3), new DogTagObserver$$ExternalSyntheticLambda1(this, th, 12));
        } else {
            fwFClientaddFeatureKeysfeaturesUpdated1.onError(th);
        }
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public void onNext(T t) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new DogTagSubscriber$$ExternalSyntheticLambda0(this, 0), new DogTagObserver$$ExternalSyntheticLambda1(this, t, 10));
        } else {
            this.delegate.onNext(t);
        }
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public void onSubscribe(FwFClientclose11 fwFClientclose11) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new DogTagSubscriber$$ExternalSyntheticLambda0(this, 2), new DogTagObserver$$ExternalSyntheticLambda1(this, fwFClientclose11, 11));
        } else {
            this.delegate.onSubscribe(fwFClientclose11);
        }
    }

    public DogTagSubscriber(RxDogTag.Configuration configuration, FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.config = configuration;
        this.delegate = fwFClientaddFeatureKeysfeaturesUpdated1;
    }
}
