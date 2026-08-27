package com.uber.rxdogtag;

import io.reactivex.disposables.Disposable;
import io.reactivex.observers.LambdaConsumerIntrospection;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DogTagObserver$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LambdaConsumerIntrospection f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ DogTagObserver$$ExternalSyntheticLambda1(LambdaConsumerIntrospection lambdaConsumerIntrospection, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = lambdaConsumerIntrospection;
        this.f$1 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        LambdaConsumerIntrospection lambdaConsumerIntrospection = this.f$0;
        switch (i) {
            case 0:
                ((DogTagObserver) lambdaConsumerIntrospection).lambda$onError$5((Throwable) obj);
                break;
            case 1:
                ((DogTagCompletableObserver) lambdaConsumerIntrospection).lambda$onError$3((Throwable) obj);
                break;
            case 2:
                ((DogTagMaybeObserver) lambdaConsumerIntrospection).lambda$onSubscribe$1((Disposable) obj);
                break;
            case 3:
                ((DogTagMaybeObserver) lambdaConsumerIntrospection).lambda$onSuccess$3(obj);
                break;
            case 4:
                ((DogTagMaybeObserver) lambdaConsumerIntrospection).lambda$onError$5((Throwable) obj);
                break;
            case 5:
                ((DogTagObserver) lambdaConsumerIntrospection).lambda$onNext$3(obj);
                break;
            case 6:
                ((DogTagObserver) lambdaConsumerIntrospection).lambda$onSubscribe$1((Disposable) obj);
                break;
            case 7:
                ((DogTagSingleObserver) lambdaConsumerIntrospection).lambda$onError$5((Throwable) obj);
                break;
            case 8:
                ((DogTagSingleObserver) lambdaConsumerIntrospection).lambda$onSuccess$3(obj);
                break;
            case 9:
                ((DogTagSingleObserver) lambdaConsumerIntrospection).lambda$onSubscribe$1((Disposable) obj);
                break;
            case 10:
                ((DogTagSubscriber) lambdaConsumerIntrospection).lambda$onNext$3(obj);
                break;
            case 11:
                ((DogTagSubscriber) lambdaConsumerIntrospection).lambda$onSubscribe$1((FwFClientclose11) obj);
                break;
            default:
                ((DogTagSubscriber) lambdaConsumerIntrospection).lambda$onError$5((Throwable) obj);
                break;
        }
    }
}
