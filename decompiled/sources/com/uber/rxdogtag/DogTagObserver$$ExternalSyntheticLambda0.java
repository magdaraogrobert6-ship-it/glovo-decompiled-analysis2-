package com.uber.rxdogtag;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DogTagObserver$$ExternalSyntheticLambda0 implements RxDogTag.NonCheckingConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DogTagObserver f$0;

    public /* synthetic */ DogTagObserver$$ExternalSyntheticLambda0(DogTagObserver dogTagObserver, int i) {
        this.$r8$classId = i;
        this.f$0 = dogTagObserver;
    }

    @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        DogTagObserver dogTagObserver = this.f$0;
        Throwable th = (Throwable) obj;
        if (i == 0) {
            dogTagObserver.lambda$onError$4(th);
            return;
        }
        if (i == 1) {
            dogTagObserver.lambda$onNext$2(th);
        } else if (i != 2) {
            dogTagObserver.lambda$onComplete$6(th);
        } else {
            dogTagObserver.lambda$onSubscribe$0(th);
        }
    }
}
