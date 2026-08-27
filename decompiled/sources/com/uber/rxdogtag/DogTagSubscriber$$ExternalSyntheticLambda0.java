package com.uber.rxdogtag;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DogTagSubscriber$$ExternalSyntheticLambda0 implements RxDogTag.NonCheckingConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DogTagSubscriber f$0;

    public /* synthetic */ DogTagSubscriber$$ExternalSyntheticLambda0(DogTagSubscriber dogTagSubscriber, int i) {
        this.$r8$classId = i;
        this.f$0 = dogTagSubscriber;
    }

    @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        DogTagSubscriber dogTagSubscriber = this.f$0;
        Throwable th = (Throwable) obj;
        if (i == 0) {
            dogTagSubscriber.lambda$onNext$2(th);
            return;
        }
        if (i == 1) {
            dogTagSubscriber.lambda$onComplete$6(th);
        } else if (i != 2) {
            dogTagSubscriber.lambda$onError$4(th);
        } else {
            dogTagSubscriber.lambda$onSubscribe$0(th);
        }
    }
}
