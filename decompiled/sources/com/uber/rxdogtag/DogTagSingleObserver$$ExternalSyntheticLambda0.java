package com.uber.rxdogtag;

import io.reactivex.observers.LambdaConsumerIntrospection;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DogTagSingleObserver$$ExternalSyntheticLambda0 implements RxDogTag.NonCheckingConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LambdaConsumerIntrospection f$0;

    public /* synthetic */ DogTagSingleObserver$$ExternalSyntheticLambda0(LambdaConsumerIntrospection lambdaConsumerIntrospection, int i) {
        this.$r8$classId = i;
        this.f$0 = lambdaConsumerIntrospection;
    }

    @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        LambdaConsumerIntrospection lambdaConsumerIntrospection = this.f$0;
        if (i == 0) {
            ((DogTagSingleObserver) lambdaConsumerIntrospection).lambda$onError$4((Throwable) obj);
            return;
        }
        if (i == 1) {
            ((DogTagSingleObserver) lambdaConsumerIntrospection).lambda$onSuccess$2((Throwable) obj);
        } else if (i != 2) {
            ((DogTagCompletableObserver) lambdaConsumerIntrospection).lambda$onError$2((Throwable) obj);
        } else {
            ((DogTagSingleObserver) lambdaConsumerIntrospection).lambda$onSubscribe$0((Throwable) obj);
        }
    }
}
